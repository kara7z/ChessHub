<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Top Breadcrumbs & Context Header -->
        <div class="flex flex-col gap-space-sm mb-space-lg">
          <nav class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard"
              >Dashboard</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard/chess-tricks"
              >Chess Tricks</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-on-surface-variant">The Greek Gift Sacrifice</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-primary font-medium">Edit Trick</span>
          </nav>
          <div class="flex flex-col lg:flex-row lg:items-center justify-between gap-space-md">
            <div>
              <div class="flex items-center gap-space-sm mb-space-xs">
                <span
                  class="px-space-sm py-[2px] rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider"
                  >TACTICAL MOTIF #TRK-882</span
                >
                <span class="font-label-badge text-label-badge text-outline"
                  >ROLE: ARBITER ADMIN</span
                >
              </div>
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                Edit Chess Trick — The Greek Gift Sacrifice (Bxh7+)
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant mt-space-xs">
                Modify tactical notation, instructional commentary, FEN configuration, and
                publication state.
              </p>
            </div>
            <div class="flex items-center gap-space-sm self-start lg:self-auto">
              <button
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors font-title-md text-title-md shadow-sm"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >visibility</span
                >
                <span>Preview Live Lesson</span>
              </button>
              <button
                class="flex items-center gap-space-xs px-space-lg py-space-sm rounded-lg bg-primary-container text-on-primary-container hover:bg-primary transition-all font-title-md text-title-md shadow-md"
                id="save-top-btn"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">save</span>
                <span>Save Changes</span>
              </button>
            </div>
          </div>
          <!-- Status Banner -->
          <div
            class="flex items-center justify-between px-space-md py-space-sm rounded-xl bg-surface-container-low shadow-sm"
          >
            <div class="flex items-center gap-space-md">
              <div class="flex items-center gap-space-xs">
                <span class="w-2.5 h-2.5 rounded-full bg-primary animate-pulse"></span>
                <span class="font-title-md text-title-md text-on-surface"
                  >Status: <span class="text-primary font-semibold">Published</span></span
                >
              </div>
              <span class="text-outline">/</span>
              <div
                class="flex items-center gap-space-xs text-on-surface-variant font-body-md text-body-md"
              >
                <span
                  class="material-symbols-outlined text-[18px] text-secondary"
                  aria-hidden="true"
                  >trending_up</span
                >
                <span
                  >Pattern viewed by
                  <strong class="text-on-surface font-semibold">412 club members</strong> this
                  month</span
                >
              </div>
            </div>
            <div
              class="hidden sm:flex items-center gap-space-xs font-label-numeric-md text-label-numeric-md text-outline"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true">verified</span>
              <span>Standardized Grandmaster Dark Notation v2.4</span>
            </div>
          </div>
        </div>
        <!-- Main Asymmetric Editor Layout -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop items-start">
          <!-- Left Column: Pre-filled Form (7 Cols) -->
          <form
            class="lg:col-span-7 flex flex-col gap-space-lg"
            id="trick-edit-form"
            @submit.prevent=""
          >
            <!-- Basic Details Panel -->
            <section
              class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >tune</span
                  >
                  <h2 class="font-title-md text-title-md text-on-surface font-semibold">
                    Lesson Metadata
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Required Fields</span
                >
              </div>
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  for="trick-title"
                  >Trick Title</label
                >
                <input
                  class="w-full px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-sm"
                  id="trick-title"
                  type="text"
                  value="The Greek Gift Sacrifice — Bxh7+ Tactical Masterclass"
                />
              </div>
              <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="trick-category"
                    >Category</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-sm pr-8"
                      id="trick-category"
                    >
                      <option selected value="Tactics">Tactics</option>
                      <option value="Opening Traps">Opening Traps</option>
                      <option value="Endgame Themes">Endgame Themes</option>
                      <option value="Mating Nets">Mating Nets</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2 top-2.5 text-outline pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="trick-difficulty"
                    >Difficulty</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-sm pr-8"
                      id="trick-difficulty"
                    >
                      <option value="Beginner">Beginner (Class C/D)</option>
                      <option selected value="Intermediate">Intermediate (Club Level)</option>
                      <option value="Advanced">Advanced (Mastery Candidate)</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2 top-2.5 text-outline pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="trick-eco"
                    >ECO Code / Reference</label
                  >
                  <input
                    class="w-full px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-label-numeric-md text-label-numeric-md focus:outline-none focus:ring-1 focus:ring-primary shadow-sm"
                    id="trick-eco"
                    type="text"
                    value="C50 / C45 Sub-motif"
                  />
                </div>
              </div>
            </section>
            <!-- FEN Configuration Field -->
            <section
              class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-secondary text-[20px]"
                    aria-hidden="true"
                    >terminal</span
                  >
                  <h2 class="font-title-md text-title-md text-on-surface font-semibold">
                    Forsyth–Edwards Notation (FEN)
                  </h2>
                </div>
                <div
                  class="flex items-center gap-space-xs text-primary font-label-badge text-label-badge"
                >
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >check_circle</span
                  >
                  <span>SYNTAX VALID</span>
                </div>
              </div>
              <div class="flex flex-col gap-space-xs">
                <div class="relative">
                  <input
                    class="w-full pl-space-md pr-24 py-space-sm rounded-lg bg-surface-container-lowest text-secondary font-label-numeric-md text-label-numeric-md tracking-wider focus:outline-none focus:ring-1 focus:ring-primary shadow-sm selection:bg-secondary-container"
                    id="fen-input"
                    type="text"
                    value="r1bq1rk1/ppp2ppp/2n1p3/3p4/2PP4/2N1PN2/PP3PPP/R1BQKB1R w KQ - 0 1"
                  />
                  <div class="absolute right-1 top-1 bottom-1 flex items-center gap-1 pr-1">
                    <button
                      class="px-2 py-1 rounded bg-surface-container-high text-on-surface-variant hover:text-on-surface hover:bg-surface-bright transition-colors text-[12px] flex items-center gap-1"
                      id="copy-fen-btn"
                      title="Copy FEN to clipboard"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >content_copy</span
                      >
                      <span>Copy</span>
                    </button>
                  </div>
                </div>
                <p class="font-body-sm text-body-sm text-outline">
                  Standard snapshot position after setup prior to white bishop detonation on h7.
                </p>
              </div>
              <div class="flex flex-wrap items-center justify-between gap-space-sm pt-space-xs">
                <div class="flex items-center gap-space-sm">
                  <button
                    class="flex items-center gap-space-xs px-space-md py-space-xs rounded-lg bg-secondary-container text-on-secondary-container hover:bg-secondary hover:text-on-secondary transition-colors font-title-md text-title-md"
                    id="update-board-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >sync</span
                    >
                    <span>Update Board from FEN</span>
                  </button>
                  <button
                    class="flex items-center gap-space-xs px-space-md py-space-xs rounded-lg bg-surface-container-high text-on-surface-variant hover:text-on-surface transition-colors font-body-sm text-body-sm"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >restart_alt</span
                    >
                    <span>Reset Setup</span>
                  </button>
                </div>
                <span class="font-label-badge text-label-badge text-outline"
                  >Target Square:
                  <span class="text-on-surface font-semibold">h7 (Tile 15)</span></span
                >
              </div>
            </section>
            <!-- Tactical Breakdown & Solution -->
            <section
              class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >edit_note</span
                  >
                  <h2 class="font-title-md text-title-md text-on-surface font-semibold">
                    Instructional Content &amp; Engine Solution
                  </h2>
                </div>
                <span class="font-label-badge text-label-badge text-secondary font-semibold"
                  >CHESS HUB MARKDOWN</span
                >
              </div>
              <!-- Article Pre-requisites & Content -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  for="trick-prereqs"
                  >Prerequisites &amp; Structural Requirements</label
                >
                <div
                  class="rounded-lg bg-surface-container-lowest p-space-sm focus-within:ring-1 focus-within:ring-primary shadow-sm"
                >
                  <textarea
                    class="w-full bg-transparent text-on-surface font-body-md text-body-md focus:outline-none resize-none leading-relaxed"
                    id="trick-prereqs"
                    rows="4"
                  >
To execute the Greek Gift sacrifice cleanly, three specific conditions MUST be met:
1. White has a light-squared bishop aimed directly down the b1-h7 diagonal.
2. A knight can jump immediately to g5 with tempo and protection (typically reinforced by a bishop on c1/d2 or queen).
3. The White queen can pivot rapidly to h5 (or g4) to overload Black's exposed king castled shelter while the Black f6 defensive knight is absent or removed.</textarea>
                </div>
              </div>
              <!-- Tactical Explanation -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  for="trick-explanation"
                  >Detailed Tactical Mechanics (Arbitration Notes)</label
                >
                <div
                  class="rounded-lg bg-surface-container-lowest p-space-sm focus-within:ring-1 focus-within:ring-primary shadow-sm"
                >
                  <textarea
                    class="w-full bg-transparent text-on-surface font-body-md text-body-md focus:outline-none resize-none leading-relaxed"
                    id="trick-explanation"
                    rows="4"
                  >
The classical Greek gift sacrifice initiates a direct assault on the castled monarch by destroying the pawn cover at h7. By forfeiting the bishop, White pulls the Black king into open space. Follow-up moves Ng5+ and Qh5 establish an unstoppable mating net or force devastating material compensation (loss of queen to avoid mate). If Black declines the sacrifice via 1...Kh8, White maintains a clear winning positional bind with 2. Ng5 g6 3. Qh3 h5 4. g4.</textarea>
                </div>
              </div>
              <!-- Solution Field -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="trick-solution"
                    >Master Solution Path (Algebraic PGN)</label
                  >
                  <span class="font-label-badge text-label-badge text-primary"
                    >8 PLY EVALUATION · +M8</span
                  >
                </div>
                <div class="p-space-sm rounded-lg bg-surface-container-lowest shadow-sm">
                  <input
                    class="w-full bg-transparent text-primary font-label-numeric-md text-label-numeric-md tracking-wide focus:outline-none"
                    id="trick-solution"
                    type="text"
                    value="1. Bxh7+ Kxh7 2. Ng5+ Kg8 (or Kg6) 3. Qh5! Re8 4. Qxf7+ Kh8 5. Qh5+ Kg8 6. Qh7+ Kf8 7. Qh8+ Ke7 8. Qxg7#"
                  />
                </div>
                <p class="font-body-sm text-body-sm text-outline">
                  Moves will be validated and interactive step-points registered for club learners.
                </p>
              </div>
            </section>
            <!-- Publication State & Final Form Actions -->
            <section
              class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-outline text-[20px]"
                    aria-hidden="true"
                    >public</span
                  >
                  <h2 class="font-title-md text-title-md text-on-surface font-semibold">
                    Publication Visibility
                  </h2>
                </div>
                <span class="font-label-badge text-label-badge text-secondary font-medium"
                  >REAL-TIME PROPAGATION</span
                >
              </div>
              <div class="grid grid-cols-3 gap-space-sm">
                <label
                  class="cursor-pointer relative flex flex-col items-center justify-center p-space-md rounded-lg bg-surface-container-high hover:bg-surface-bright transition-all group"
                >
                  <input
                    checked
                    class="peer sr-only"
                    name="publish_state"
                    type="radio"
                    value="published"
                  />
                  <span
                    class="peer-checked:text-primary text-outline material-symbols-outlined text-[24px] mb-1"
                    aria-hidden="true"
                    >cloud_done</span
                  >
                  <span
                    class="font-title-md text-title-md text-on-surface group-hover:text-on-surface"
                    >Published</span
                  >
                  <span class="font-body-sm text-body-sm text-outline text-center mt-1"
                    >Live in Academy catalog</span
                  >
                  <div
                    class="absolute inset-0 rounded-lg peer-checked:ring-2 peer-checked:ring-primary pointer-events-none"
                  ></div>
                </label>
                <label
                  class="cursor-pointer relative flex flex-col items-center justify-center p-space-md rounded-lg bg-surface-container-high hover:bg-surface-bright transition-all group"
                >
                  <input class="peer sr-only" name="publish_state" type="radio" value="draft" />
                  <span
                    class="peer-checked:text-secondary text-outline material-symbols-outlined text-[24px] mb-1"
                    aria-hidden="true"
                    >edit_document</span
                  >
                  <span
                    class="font-title-md text-title-md text-on-surface group-hover:text-on-surface"
                    >Draft</span
                  >
                  <span class="font-body-sm text-body-sm text-outline text-center mt-1"
                    >Visible to Admins only</span
                  >
                  <div
                    class="absolute inset-0 rounded-lg peer-checked:ring-2 peer-checked:ring-secondary pointer-events-none"
                  ></div>
                </label>
                <label
                  class="cursor-pointer relative flex flex-col items-center justify-center p-space-md rounded-lg bg-surface-container-high hover:bg-surface-bright transition-all group"
                >
                  <input class="peer sr-only" name="publish_state" type="radio" value="archived" />
                  <span
                    class="peer-checked:text-error text-outline material-symbols-outlined text-[24px] mb-1"
                    aria-hidden="true"
                    >inventory_2</span
                  >
                  <span
                    class="font-title-md text-title-md text-on-surface group-hover:text-on-surface"
                    >Archived</span
                  >
                  <span class="font-body-sm text-body-sm text-outline text-center mt-1"
                    >De-indexed from search</span
                  >
                  <div
                    class="absolute inset-0 rounded-lg peer-checked:ring-2 peer-checked:ring-error pointer-events-none"
                  ></div>
                </label>
              </div>
              <div class="flex items-center justify-end gap-space-md pt-space-sm">
                <span
                  class="px-space-md py-space-sm rounded-lg text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                  >Cancel</span
                >
                <button
                  class="flex items-center gap-space-xs px-space-xl py-space-sm rounded-lg bg-primary-container text-on-primary-container hover:bg-primary transition-all font-title-md text-title-md shadow-md"
                  type="submit"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >check</span
                  >
                  <span>Save Changes</span>
                </button>
              </div>
            </section>
          </form>
          <!-- Right Column: Interactive Chessboard & Danger Card (5 Cols) -->
          <div class="lg:col-span-5 flex flex-col gap-space-lg sticky top-20">
            <!-- Live Board Preview Card -->
            <section
              class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >chess</span
                  >
                  <h2 class="font-title-md text-title-md text-on-surface font-semibold">
                    Live Board Visualizer
                  </h2>
                </div>
                <div
                  class="flex items-center gap-space-xs px-space-sm py-[2px] rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge"
                >
                  <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                  <span>WHITE TO MOVE</span>
                </div>
              </div>
              <!-- The 8x8 Chessboard Container with Coordinates -->
              <div
                class="relative w-full aspect-square max-w-[460px] mx-auto bg-surface-container-lowest p-3 rounded-xl shadow-lg select-none"
              >
                <!-- Board Grid with Pieces & Vector Overlay -->
                <div class="relative w-full h-full rounded overflow-hidden">
                  <!-- 8x8 SVG Interactive Board with Greek Gift Piece Layout -->
                  <svg class="w-full h-full block" viewBox="0 0 800 800">
                    <defs>
                      <!-- Board Squares Pattern / Colors -->
                      <radialGradient cx="50%" cy="50%" id="sac-glow" r="50%">
                        <stop offset="0%" stop-color="#ffb4ab" stop-opacity="0.8"></stop>
                        <stop offset="100%" stop-color="#93000a" stop-opacity="0.2"></stop>
                      </radialGradient>
                      <radialGradient cx="50%" cy="50%" id="origin-glow" r="50%">
                        <stop offset="0%" stop-color="#9fd668" stop-opacity="0.8"></stop>
                        <stop offset="100%" stop-color="#324e1b" stop-opacity="0.2"></stop>
                      </radialGradient>
                      <marker
                        id="arrow"
                        markerHeight="6"
                        markerWidth="6"
                        orient="auto-start-reverse"
                        refX="6"
                        refY="5"
                        viewBox="0 0 10 10"
                      >
                        <path d="M 0 1 L 10 5 L 0 9 z" fill="#ffb4ab"></path>
                      </marker>
                    </defs>
                    <!-- Board Tiles: Light (#292a28) and Dark (#1a1c1a) -->
                    <!-- Row 8 (y=0) -->
                    <rect fill="#292a28" height="100" width="100" x="0" y="0"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="100" y="0"></rect>
                    <rect fill="#292a28" height="100" width="100" x="200" y="0"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="300" y="0"></rect>
                    <rect fill="#292a28" height="100" width="100" x="400" y="0"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="500" y="0"></rect>
                    <rect fill="#292a28" height="100" width="100" x="600" y="0"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="700" y="0"></rect>
                    <!-- Row 7 (y=100) -->
                    <rect fill="#1a1c1a" height="100" width="100" x="0" y="100"></rect>
                    <rect fill="#292a28" height="100" width="100" x="100" y="100"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="200" y="100"></rect>
                    <rect fill="#292a28" height="100" width="100" x="300" y="100"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="400" y="100"></rect>
                    <rect fill="#292a28" height="100" width="100" x="500" y="100"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="600" y="100"></rect>
                    <!-- Target Tile h7 (x=700, y=100) Highlighted -->
                    <rect fill="#292a28" height="100" width="100" x="700" y="100"></rect>
                    <rect
                      class="animate-pulse"
                      fill="url(#sac-glow)"
                      height="100"
                      width="100"
                      x="700"
                      y="100"
                    ></rect>
                    <!-- Row 6 (y=200) -->
                    <rect fill="#292a28" height="100" width="100" x="0" y="200"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="100" y="200"></rect>
                    <rect fill="#292a28" height="100" width="100" x="200" y="200"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="300" y="200"></rect>
                    <rect fill="#292a28" height="100" width="100" x="400" y="200"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="500" y="200"></rect>
                    <rect fill="#292a28" height="100" width="100" x="600" y="200"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="700" y="200"></rect>
                    <!-- Row 5 (y=300) -->
                    <rect fill="#1a1c1a" height="100" width="100" x="0" y="300"></rect>
                    <rect fill="#292a28" height="100" width="100" x="100" y="300"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="200" y="300"></rect>
                    <rect fill="#292a28" height="100" width="100" x="300" y="300"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="400" y="300"></rect>
                    <rect fill="#292a28" height="100" width="100" x="500" y="300"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="600" y="300"></rect>
                    <rect fill="#292a28" height="100" width="100" x="700" y="300"></rect>
                    <!-- Row 4 (y=400) -->
                    <rect fill="#292a28" height="100" width="100" x="0" y="400"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="100" y="400"></rect>
                    <rect fill="#292a28" height="100" width="100" x="200" y="400"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="300" y="400"></rect>
                    <rect fill="#292a28" height="100" width="100" x="400" y="400"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="500" y="400"></rect>
                    <rect fill="#292a28" height="100" width="100" x="600" y="400"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="700" y="400"></rect>
                    <!-- Row 3 (y=500) -->
                    <rect fill="#1a1c1a" height="100" width="100" x="0" y="500"></rect>
                    <rect fill="#292a28" height="100" width="100" x="100" y="500"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="200" y="500"></rect>
                    <!-- Origin Bishop Tile d3 (x=300, y=500) Highlighted -->
                    <rect fill="url(#origin-glow)" height="100" width="100" x="300" y="500"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="400" y="500"></rect>
                    <rect fill="#292a28" height="100" width="100" x="500" y="500"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="600" y="500"></rect>
                    <rect fill="#292a28" height="100" width="100" x="700" y="500"></rect>
                    <!-- Row 2 (y=600) -->
                    <rect fill="#292a28" height="100" width="100" x="0" y="600"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="100" y="600"></rect>
                    <rect fill="#292a28" height="100" width="100" x="200" y="600"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="300" y="600"></rect>
                    <rect fill="#292a28" height="100" width="100" x="400" y="600"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="500" y="600"></rect>
                    <rect fill="#292a28" height="100" width="100" x="600" y="600"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="700" y="600"></rect>
                    <!-- Row 1 (y=700) -->
                    <rect fill="#1a1c1a" height="100" width="100" x="0" y="700"></rect>
                    <rect fill="#292a28" height="100" width="100" x="100" y="700"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="200" y="700"></rect>
                    <rect fill="#292a28" height="100" width="100" x="300" y="700"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="400" y="700"></rect>
                    <rect fill="#292a28" height="100" width="100" x="500" y="700"></rect>
                    <rect fill="#1a1c1a" height="100" width="100" x="600" y="700"></rect>
                    <rect fill="#292a28" height="100" width="100" x="700" y="700"></rect>
                    <!-- Coordinate labels embedded cleanly -->
                    <!-- a-h bottom -->
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="90"
                      y="792"
                    >
                      a
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="190"
                      y="792"
                    >
                      b
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="290"
                      y="792"
                    >
                      c
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="390"
                      y="792"
                    >
                      d
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="490"
                      y="792"
                    >
                      e
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="590"
                      y="792"
                    >
                      f
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="690"
                      y="792"
                    >
                      g
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="790"
                      y="792"
                    >
                      h
                    </text>
                    <!-- 1-8 left side -->
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="720"
                    >
                      1
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="620"
                    >
                      2
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="520"
                    >
                      3
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="420"
                    >
                      4
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="320"
                    >
                      5
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="220"
                    >
                      6
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="120"
                    >
                      7
                    </text>
                    <text
                      fill="#8c9381"
                      font-family="Geist"
                      font-size="12"
                      font-weight="600"
                      x="6"
                      y="20"
                    >
                      8
                    </text>
                    <!-- Dynamic Arrow: Bishop on d3 (350, 550) attacking h7 (750, 150) -->
                    <line
                      marker-end="url(#arrow)"
                      opacity="0.95"
                      stroke="#ffb4ab"
                      stroke-dasharray="8 6"
                      stroke-linecap="round"
                      stroke-width="8"
                      x1="350"
                      x2="740"
                      y1="550"
                      y2="160"
                    ></line>
                    <!-- Chess Pieces Layer (Rendered as Crisp Vector Symbols) -->
                    <!-- Black King on g8 (600, 0) -->
                    <g transform="translate(620, 20) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        crown
                      </text>
                    </g>
                    <!-- Black Rook on f8 (500, 0) -->
                    <g transform="translate(520, 20) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        fort
                      </text>
                    </g>
                    <!-- Black Rook on a8 (0, 0) -->
                    <g transform="translate(20, 20) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        fort
                      </text>
                    </g>
                    <!-- Black Queen on d8 (300, 0) -->
                    <g transform="translate(320, 20) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_queen
                      </text>
                    </g>
                    <!-- Black Bishop on c8 (200, 0) -->
                    <g transform="translate(220, 20) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_bishop
                      </text>
                    </g>
                    <!-- Black Pawns on a7, b7, c7, f7, g7, h7 -->
                    <g transform="translate(22, 120) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <g transform="translate(122, 120) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <g transform="translate(222, 120) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <g transform="translate(522, 120) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <g transform="translate(622, 120) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <!-- Target pawn on h7 -->
                    <g transform="translate(722, 120) scale(1.2)">
                      <text
                        fill="#ffdad6"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#93000a"
                        stroke-width="2"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <!-- Black Knight on c6 (200, 200) & e6 pawn (400, 200) -->
                    <g transform="translate(220, 220) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_knight
                      </text>
                    </g>
                    <g transform="translate(422, 220) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <!-- Black pawn on d5 (300, 300) -->
                    <g transform="translate(322, 320) scale(1.2)">
                      <text
                        fill="#121412"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#c2c9b6"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <!-- White pawn on c4, d4 (200, 400 & 300, 400) -->
                    <g transform="translate(222, 420) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <g transform="translate(322, 420) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        chess_pawn
                      </text>
                    </g>
                    <!-- White Attacking Bishop on d3 (300, 500) -->
                    <g transform="translate(320, 520) scale(1.2)">
                      <text
                        fill="#9fd668"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#1c3700"
                        stroke-width="1.5"
                      >
                        chess_bishop
                      </text>
                    </g>
                    <!-- White Knight on f3 (500, 500) poised for g5 -->
                    <g transform="translate(520, 520) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        chess_knight
                      </text>
                    </g>
                    <!-- White Knight on c3 (200, 500) -->
                    <g transform="translate(220, 520) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        chess_knight
                      </text>
                    </g>
                    <!-- White Queen on d1 (300, 700), King on e1 (400, 700) -->
                    <g transform="translate(320, 720) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        chess_queen
                      </text>
                    </g>
                    <g transform="translate(420, 720) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        crown
                      </text>
                    </g>
                    <g transform="translate(20, 720) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        fort
                      </text>
                    </g>
                    <g transform="translate(720, 720) scale(1.2)">
                      <text
                        fill="#e2e3df"
                        font-family="'Material Symbols Outlined'"
                        font-size="52"
                        stroke="#333533"
                        stroke-width="1.5"
                      >
                        fort
                      </text>
                    </g>
                  </svg>
                </div>
              </div>
              <!-- Verification / State Pill -->
              <div
                class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container-low"
              >
                <div class="flex items-center gap-space-xs text-primary font-body-sm text-body-sm">
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >verified_user</span
                  >
                  <span>Valid FEN syntax · 0 board illegalities</span>
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-outline"
                  >FEN Hash: <span class="text-on-surface">#4409A</span></span
                >
              </div>
              <div
                class="flex items-center justify-between text-body-sm text-body-sm text-on-surface-variant pt-space-xs"
              >
                <span
                  >Vector Motif:
                  <strong class="text-error font-medium">Bxh7+ (Sacrifice)</strong></span
                >
                <span
                  >Next: <strong class="text-primary font-medium">2. Ng5+ Followup</strong></span
                >
              </div>
            </section>
            <!-- Danger Zone Card -->
            <section
              class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center gap-space-xs text-error">
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >warning</span
                >
                <h3 class="font-title-md text-title-md font-semibold">Danger Zone</h3>
              </div>
              <p class="font-body-md text-body-md text-on-surface-variant">
                Permanently delete this trick motif from the ChessHub syllabus. Any member training
                bookmarks or completed mastery points tied to this ID will be orphaned.
              </p>
              <button
                class="flex items-center justify-center gap-space-xs w-full py-space-sm px-space-md rounded-lg bg-error-container/20 text-error hover:bg-error-container hover:text-on-error transition-all font-title-md text-title-md"
                id="delete-trick-trigger"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >delete_forever</span
                >
                <span>Delete Chess Trick</span>
              </button>
            </section>
          </div>
        </div>
        <!-- Deletion Confirmation Modal Backdrop -->
        <div
          class="fixed inset-0 z-50 flex items-center justify-center bg-black/80 backdrop-blur-sm hidden"
          id="delete-modal"
        >
          <div
            class="w-full max-w-md p-space-lg rounded-xl bg-surface-container-high shadow-2xl flex flex-col gap-space-md animate-in fade-in zoom-in-95 duration-150"
          >
            <div
              class="w-12 h-12 rounded-xl bg-error-container/30 text-error flex items-center justify-center"
            >
              <span class="material-symbols-outlined text-[28px]" aria-hidden="true"
                >crisis_alert</span
              >
            </div>
            <div class="flex flex-col gap-space-xs">
              <h4 class="font-headline-sm text-headline-sm text-on-surface font-bold">
                Confirm Trick Deletion
              </h4>
              <p class="font-body-md text-body-md text-on-surface-variant">
                Are you sure you want to permanently erase
                <strong class="text-on-surface">"The Greek Gift Sacrifice — Bxh7+"</strong>? This
                action cannot be undone.
              </p>
            </div>
            <div
              class="p-space-sm rounded bg-surface-container-lowest font-label-numeric-md text-label-numeric-md text-error flex items-center gap-space-xs"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true">info</span>
              <span>ID: TRK-882 · 412 active player histories affected</span>
            </div>
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface hover:bg-surface-bright transition-colors font-title-md text-title-md"
                id="cancel-delete-btn"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg bg-error text-on-error hover:bg-error-container transition-colors font-title-md text-title-md flex items-center gap-space-xs"
                id="confirm-delete-btn"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">delete</span>
                <span>Erase Permanently</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Notification Toast -->
        <div
          class="fixed bottom-6 right-6 z-50 flex items-center gap-space-sm px-space-md py-space-sm rounded-xl bg-surface-container-highest text-on-surface shadow-2xl transition-all transform translate-y-24 opacity-0 pointer-events-none"
          id="toast"
        >
          <span
            class="material-symbols-outlined text-primary text-[20px]"
            id="toast-icon"
            aria-hidden="true"
            >check_circle</span
          >
          <span class="font-body-md text-body-md font-medium" id="toast-msg"
            >Changes saved successfully</span
          >
        </div>
        <!-- Inline Client Interaction Script -->
      </div>
    </main>
  </DashboardLayout>
</template>
