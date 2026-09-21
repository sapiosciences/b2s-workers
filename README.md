# b2s-workers

Repository for **B2S-specific Sapio Exemplar server-side Java plugins** (Velox). The deployable unit is the Maven module **`b2s-workerserverplugin`** (`packaging: plugin`), a child of the parent `b2s-worker` Maven project.

---

## Plugin catalog

Each row is one plugin class. **Invocation** is where the plugin appears or what lifecycle hook runs it.

| Plugin (class) | Invocation | Primary trigger / scope |
|----------------|------------|-------------------------|
| `WorkerPing` | Action menu | **Sapio Admin** only — confirms client connectivity and shows plugin version / build time |
| `AddNewSponsor` | Action menu | Prompts for one or more Sponsor names → creates each `C_Sponsor` under root, with a child `Directory` of the same name, and applies standard directory group ACL |
| `SponsorUserCreation` | Action menu | Prompts for one or more sponsor users (email, sponsor, Sponsor Approver/Viewer group) → creates each `VeloxUser`, syncs group membership, and grants per-user Directory ACL scoped to their sponsor |
| `ResetDirectoryGroupAcl` | Action menu | System-wide: root Directory (`/`) stays open to all groups; every other Directory clears Sponsor Approver/Viewer group ACL and grants all other groups full access except Owner/Grant |
| `ApproveAssayRun` | Form toolbar (`SBA_MasterAssayRun`) | Visible to **Principal Investigator** group when the run is completed and unapproved with consistent child result outcomes — e-signs and sets `C_Approved` |
| `OverrideAssayRun` | Form toolbar (`SBA_MasterAssayRun`) | Same visibility as `ApproveAssayRun`, but for runs with manually-changed (inconsistent) result outcomes — collects an override/rejection reason per misaligned result, then e-signs and approves |
| `ImportSponsorStudySamples` | Form toolbar (`Study`) | Prompts to select Samples from the parent Project plus any matching the Study's Sponsor Study Number, then replaces the Study's Sample children with the selection |
| `CustomSampleRegistration` | Table toolbar (Sample, Sample Registration layout) | Selected/linked Logged or Available Samples → **Receive Samples**, persisting every Sample Receipt field returned from the dialog (not a hardcoded subset) and updating sample status |
| `GlobalCreateAnalysisRunTableButton` | Table toolbar (Sample) | Selected Samples → resolves/prompts for parent Study and Master Assay, creates a `MasterAssayRun` (type Analysis), then opens a details dialog validated against `AssayInstrumentConfig` |
| `AssignSponsorLots` | On save (Sample) | New Samples whose consumable-item extension type maps to a configured Part type and lack a Sponsor Lot parent → prompts once, then creates a `C_SponsorLot` per sample (25% minimum threshold) under that sample's Part parent |
| `LockedAwaitingApprovalStatusChange` | Experiment status change | On experiment status **Locked Awaiting Approval** — stamps `LockedAwaitingApprovalSince` and emails the assigned Reviewer(s) |
| `RemindReviewerEmail` | Scheduled | Emails reviewers for experiments that have sat in Locked Awaiting Approval for 22–24 hours and haven't already received the reminder (`FinalWarningSent`) |
| `SynergyH1CustomParser` | Instrument file parser (`SynergyH1`) | Parses Synergy H1 titer assessment Excel exports — reads each Plate sheet's Results block, matches wells to child Samples of the matching `Plate` record by well position, returns 450/630/Delta readings keyed by Sample ID |
| `FlowCellSelectionList` | Selection list (`ELNSampleDetail`) | Backs the **Flow Cell Lane Assignment** field — returns picklist values from **Flow Cell Lanes** minus lanes already used elsewhere in the entry |
| `AddFractionCollectionRunsToolbar` | Experiment entry toolbar | On **Fraction Collection Runs** — prompts for a run count, appends 5 step rows per run (fixed step order) with Run Number and hidden Step Order set |
| `FractionCollectionRunsSubmission` | Experiment entry validation | On completing **Fraction Collection Runs** (B2S1-161) — creates one dedicated base Sample + `C_Fraction` extension per row, linked as a child of the critical reagent Sample from **Critical Reagent Details**; rows marked *Selected For Intermediate Pool* are added to **Fractions Selected for Intermediate Pooling**; idempotent by Run Number + Step on resubmission |
| `Ec50ResultsToolbar` | Experiment entry toolbar | On **EC50 Results**, experiments tagged `TTA` — uploads selected files, creates one `C_EC50Result` attachment record per file |
| `Ec50ResultsSubmission` | Experiment entry validation | On completing **EC50 Results**, experiments tagged `TTA` — links each `C_EC50Result` as a child of the matching Sample from **Samples**, matched by Sample ID |

---

## Details by plugin

### Action menu

- **`WorkerPing`** — Visible only to group **Sapio Admin**. Shows a hardcoded plugin version plus build timestamp (from `build-info.properties`, displayed in US Eastern).
- **`AddNewSponsor`** — Asks how many sponsors (form for 1, table for 2+), then for each name: creates a `C_Sponsor` child of root (record ID 1), creates a `Directory` child of that Sponsor (not of root) with the same name, and applies the same non-root group ACL as `ResetDirectoryGroupAcl` (sponsor groups get nothing; every other group gets full access except Owner/Grant).
- **`SponsorUserCreation`** — Asks how many users (form for 1, table for 2+); collects email, an existing Sponsor (selection-only, no free text), and user group(s) limited to **Sponsor Approver** / **Sponsor Viewer**. Creates each `VeloxUser` (username = email, preset password, no forced expiry), syncs group membership exactly to what was selected (drops Sapio's auto-added defaults), then grants per-user Directory ACL on the Directory matching the chosen sponsor name — Approver gets full access (incl. ACL management), Viewer gets read-only — and strips that user from every other Directory's user ACL map. Sponsor group ACL entries are removed from all Directories in the process, since sponsor users rely on per-user ACL, not group ACL.
- **`ResetDirectoryGroupAcl`** — Confirmation dialog, then walks every `Directory`: root (`/`) grants all groups full access except Owner/Grant; every other Directory removes Sponsor Approver/Viewer group entries and grants all remaining groups full access except Owner/Grant. Does not touch user-level ACL.

### Form toolbar

- **`ApproveAssayRun`** — Shown on `SBA_MasterAssayRun` forms when unapproved, completed, and the current user's active group is Principal Investigator. Verifies each child `SBA_AssayRunResult`'s failure/accept-reject/status fields are mutually consistent (failure → Reject/Failed; no failure → Accept/Passed) — if not, directs the user to `OverrideAssayRun` instead. Requires e-sign as a PI different from `SBA_CompletedBy`, then sets `C_Approved`.
- **`OverrideAssayRun`** — Same visibility gate as `ApproveAssayRun`. For each child result with inconsistent outcome fields, prompts for an override reason (if Accept) or rejection reason (if Reject) and stores it on the result. Then runs the same PI e-sign / different-user checks and sets `C_Approved`.
- **`ImportSponsorStudySamples`** — Shown on `Study` forms. Requires `C_SponsorStudyNumber` to be set. Candidate pool = parent Project's child Samples ∪ Samples matching that Sponsor Study Number ∪ Study's existing Sample children. Presents a multi-select dialog (existing children preselected) and replaces the Study's Sample children with the selection.

### Table toolbar

- **`CustomSampleRegistration`** — Shown on Sample tables whose base record is a Sample Registration. Resolves target Samples from the current selection, or — if none selected — from all Samples reverse-linked to the base Sample Registration; filters to status Logged/Available. Prompts a receipt-details table dialog (default layout for `SampleReceipt`), creates one `SampleReceipt` child per sample copying **every** non-system field returned (not a fixed whitelist), then advances sample status to Received or the entered rejection status.
- **`GlobalCreateAnalysisRunTableButton`** — Shown on Sample tables. Resolves the samples' common parent Study (prompts if more than one); resolves the Study's `MasterAssay` (prompts if more than one); creates a `MasterAssayRun` (type "Analysis") under the Study and Master Assay with the selected Samples as children, copying category/instrument type from the Master Assay. Opens a details dialog validated against `AssayInstrumentConfig` (with a concentration-unit mismatch confirmation) before committing.

### On save

- **`AssignSponsorLots`** — Runs when a save includes Sample records. Reads `ExemplarConfig.ConsumableDataTypes` (`Part ::: Sample ::: Item` lines) to map each sample's consumable-item extension to its Part type. For samples without an existing `C_SponsorLot` parent whose Part parent is loaded, prompts once for confirmation, then creates one `C_SponsorLot` per sample (volume from the sample, minimum threshold = 25% of volume) as a child of that sample's Part, with the sample added as the lot's child.

### Experiment status change

- **`LockedAwaitingApprovalStatusChange`** — Fires when a notebook experiment's status becomes **Locked Awaiting Approval**. Stamps `LockedAwaitingApprovalSince` on the linked `ELNExperiment` record and emails every assigned Reviewer (expanded from the experiment's role assignment) with a link into the ELN.

### Scheduled

- **`RemindReviewerEmail`** — Requires eNotebook licensing. Queries experiments in status Locked Awaiting Approval whose `LockedAwaitingApprovalSince` falls 22–24 hours in the past and that haven't already had `FinalWarningSent` set. Emails each eligible experiment's reviewers a "review before it becomes late" reminder and marks `FinalWarningSent` to avoid re-sending.

### Instrument integration

- **`SynergyH1CustomParser`** — Registered file-parser name `SynergyH1`. Reads each workbook sheet whose name contains "Plate"; extracts the Plate Number, queries the matching `Plate` record and maps its child Samples by row/column well position. Finds the *second* 1–12 header block (Results, not Layout) and reads 8 plate rows × 3 readings (450/630/Delta) each. Emits one map per well containing Sample ID, well ID, 450 (`4` on overflow), 630, Delta (blank on `?????`), and an overflow flag.

### Selection lists

- **`FlowCellSelectionList`** — `ELNSampleDetail` rows, field **Flow Cell Lane Assignment** only. Reads all sample detail rows already in the current entry, collects lanes already assigned, and returns the **Flow Cell Lanes** picklist minus those in use.

### Experiment entry — toolbar buttons

- **`AddFractionCollectionRunsToolbar`** — Toolbar on **Fraction Collection Runs**. Prompts for a run count; for each run appends 5 rows (1st PBS Wash, 1st Water Wash, Acid/High Salt Elution, 2nd PBS Wash, 2nd Water Wash) sharing one Run Number (continuing from the current max) with a hidden Step Order (1–5).
- **`Ec50ResultsToolbar`** — Toolbar on **EC50 Results**, only for experiments tagged `TTA`. Multi-file upload dialog; creates one `C_EC50Result` attachment record per uploaded file and adds them to the entry.

### Experiment entry — validation (on entry complete)

- **`FractionCollectionRunsSubmission`** — On completing **Fraction Collection Runs** (B2S1-161, replacing a native Sapio rule; see also B2S1-76, B2S1-110). Loads the critical reagent Sample from **Critical Reagent Details**. Because a Sample extension is 1:1 with its immediate parent, each row gets its own dedicated base Sample extended with `C_Fraction` (Run Number, Step, volumes, selection flag), linked as a child of the critical reagent sample via lineage. Idempotent: matches existing Fraction children by Run Number + Step (read from each child's own `C_Fraction` extension) and updates in place rather than duplicating on resubmission. Rows marked *Selected For Intermediate Pool* are added to **Fractions Selected for Intermediate Pooling**, and that entry is flagged for client refresh.
- **`Ec50ResultsSubmission`** — On completing **EC50 Results**, only for experiments tagged `TTA`. Matches each `C_EC50Result` record's `C_SampleId` to a Sample on the **Samples** entry (by Sample ID) and links it as that Sample's child, skipping results already linked to a Sample parent.

---

## Module layout

- **`b2s-workerserverplugin/src/main/java/com/velox/`** — Plugin implementations:
  - `buttons/` — Toolbar button plugins
    - `buttons/FormToolbarButtons/` — Form toolbar plugins
    - `buttons/MainToolbarButtons/` — Main (action menu) toolbar plugins
    - `buttons/TableToolbarButtons/` — Table toolbar plugins
  - `ExperimentStatusChangePlugins/` — Notebook experiment status-change plugins
  - `InstrumentIntegrationPlugins/` — Instrument file parsers
  - `onSave/` — On-save plugins
  - `recordmodels/` — Typed record model wrappers for B2S data types
  - `ScheduledPlugins/` — Scheduled task plugins
  - `SelectionListPlugins/` — Selection list plugins
  - `workflows/` — Experiment lifecycle and workflow-specific plugins
    - `workflows/immunoaffinity/` — Fraction collection (immunoaffinity purification) plugins
    - `workflows/TiterAssessment/` — EC50/titer assessment plugins
  - `RemoteIconUtil` — Shared icon-loading utility (not a plugin)
  - `WorkerPing` — Root-level admin connectivity check

For build and deployment, use the parent Maven project **`b2s-worker`** via **Sapio Worker Manager**, as documented in your internal Sapio deployment process.
