<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-16">
        <!-- Top Meta / Sub-header bar -->
        <div class="flex flex-col md:flex-row md:items-end justify-between gap-space-md mb-8 pt-4">
          <div class="flex flex-col gap-space-xs">
            <div class="flex items-center gap-2 text-outline font-body-sm">
              <span>Dashboard</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-on-surface-variant">Chess Tricks</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-primary font-medium">Create Trick</span>
            </div>
            <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight mt-1">
              Create Chess Trick &amp; Tactical Pattern
            </h1>
            <p class="font-body-md text-on-surface-variant max-w-2xl">
              Author interactive tactical exercises, opening traps, and instructional FEN patterns
              for tournament preparation and curriculum syndication.
            </p>
          </div>
          <!-- Quick Status Pill & Role Badge -->
          <div class="flex items-center gap-3 self-start md:self-auto">
            <div
              class="flex items-center gap-2 px-3 py-1.5 rounded-lg bg-surface-container-high text-on-surface text-body-sm font-medium"
            >
              <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
              <span>Arbiter Sandbox Active</span>
            </div>
            <span
              class="px-2.5 py-1 rounded bg-secondary-container text-on-secondary-container font-label-badge uppercase tracking-wider"
            >
              Role: ADMIN
            </span>
          </div>
        </div>
        <!-- Two-Column Form and Live Engine Preview -->
        <div class="grid grid-cols-1 xl:grid-cols-12 gap-8 items-start">
          <!-- Left Column: Form Fields & Editorial (7 cols) -->
          <div class="xl:col-span-7 flex flex-col gap-6">
            <!-- Section 1: Pattern Identity -->
            <div
              class="dashboard-panel flex flex-col gap-5 p-space-lg"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-2.5">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >auto_stories</span
                  >
                  <span class="font-title-md text-title-md text-on-surface"
                    >Pattern Identity &amp; Metadata</span
                  >
                </div>
                <span class="font-label-badge text-outline uppercase tracking-wider"
                  >SEC 01 / CORE</span
                >
              </div>
              <!-- Trick Title -->
              <div class="flex flex-col gap-1.5">
                <label class="font-title-md text-body-md text-on-surface" for="trick-title">
                  Trick Title <span class="text-error">*</span>
                </label>
                <input
                  class="w-full bg-surface-container-lowest text-on-surface px-4 py-2.5 rounded-lg font-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-inner placeholder:text-outline"
                  id="trick-title"
                  placeholder="e.g. The Noah's Ark Trap, Greek Gift Sacrifice..."
                  type="text"
                  value="The Légal's Mate Trap — Tactical Queen Sacrifice"
                />
              </div>
              <!-- Grid of 3 Selects/Inputs: Category, Difficulty, ECO -->
              <div class="grid grid-cols-1 md:grid-cols-3 gap-4">
                <div class="flex flex-col gap-1.5">
                  <label class="font-body-sm text-outline" for="category-select">Category</label>
                  <div class="relative">
                    <select
                      class="w-full appearance-none bg-surface-container-lowest text-on-surface px-3 py-2 rounded-lg font-body-md focus:outline-none focus:ring-1 focus:ring-primary pr-8"
                      id="category-select"
                    >
                      <option selected>Opening</option>
                      <option>Middlegame</option>
                      <option>Endgame</option>
                      <option>Tactics</option>
                      <option>Strategy</option>
                      <option>Checkmate Patterns</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2.5 top-2.5 pointer-events-none text-outline text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-1.5">
                  <label class="font-body-sm text-outline" for="difficulty-select"
                    >Difficulty Tier</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none bg-surface-container-lowest text-on-surface px-3 py-2 rounded-lg font-body-md focus:outline-none focus:ring-1 focus:ring-primary pr-8"
                      id="difficulty-select"
                    >
                      <option>Beginner</option>
                      <option selected>Intermediate</option>
                      <option>Advanced</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2.5 top-2.5 pointer-events-none text-outline text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-1.5">
                  <label class="font-body-sm text-outline" for="eco-code">ECO Code / Theme</label>
                  <input
                    class="w-full bg-surface-container-lowest text-on-surface px-3 py-2 rounded-lg font-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-inner placeholder:text-outline"
                    id="eco-code"
                    type="text"
                    value="ECO: C41 · Philidor Defense Trap"
                  />
                </div>
              </div>
              <!-- Markdown / Content Editor -->
              <div class="flex flex-col gap-1.5 mt-2">
                <div class="flex items-center justify-between">
                  <label class="font-title-md text-body-md text-on-surface" for="content-editor"
                    >Curriculum Article &amp; Historical Context</label
                  >
                  <span class="font-body-sm text-outline">Markdown supported</span>
                </div>
                <div class="bg-surface-container-lowest rounded-lg overflow-hidden flex flex-col">
                  <!-- Toolbar -->
                  <div
                    class="bg-surface-container-high px-3 py-2 flex items-center justify-between"
                  >
                    <div class="flex items-center gap-1">
                      <button
                        class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                        title="Bold"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >format_bold</span
                        >
                      </button>
                      <button
                        class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                        title="Italic"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >format_italic</span
                        >
                      </button>
                      <button
                        class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                        title="Bulleted List"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >format_list_bulleted</span
                        >
                      </button>
                      <div class="w-px h-4 bg-outline-variant mx-1"></div>
                      <button
                        class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                        title="Chess Move Notation"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >code</span
                        >
                      </button>
                      <button
                        class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                        title="Insert Anchor Link"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >link</span
                        >
                      </button>
                    </div>
                    <span class="font-label-badge text-outline">CHARACTERS: 418</span>
                  </div>
                  <textarea
                    class="w-full bg-transparent text-on-surface p-4 font-body-md focus:outline-none resize-y leading-relaxed"
                    id="content-editor"
                    rows="4"
                  >
### The Mechanism of Pseudo-Pins
Named after Sire de Légal (1702–1792), this classic snare exploits an absolute pin delusion. Black pins White's f3-knight to the Queen with `...Bg4`, assuming White cannot legally vacate the diagonal. However, because Black has neglected central space and king safety, White unleashes `Nxe5!`, willingly surrendering the Queen for a brutal coordination of minor pieces delivering immediate checkmate.</textarea>
                </div>
              </div>
            </div>
            <!-- Section 2: FEN & Tactical Mechanics -->
            <div
              class="dashboard-panel flex flex-col gap-5 p-space-lg"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-2.5">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >grid_4x4</span
                  >
                  <span class="font-title-md text-title-md text-on-surface"
                    >FEN Notation &amp; Move Coordinates</span
                  >
                </div>
                <span class="font-label-badge text-outline uppercase tracking-wider"
                  >SEC 02 / ARBITRATION</span
                >
              </div>
              <!-- FEN Input with action controls -->
              <div class="flex flex-col gap-2">
                <label class="font-title-md text-body-md text-on-surface" for="fen-input">
                  Board FEN String (Forsyth-Edwards Notation)
                </label>
                <div class="flex flex-col sm:flex-row gap-2">
                  <input
                    class="flex-1 bg-surface-container-lowest text-primary font-mono text-body-sm px-3.5 py-2.5 rounded-lg focus:outline-none focus:ring-1 focus:ring-primary shadow-inner"
                    id="fen-input"
                    type="text"
                    value="r1bqkb1r/pppp1ppp/2n5/4p3/2B1n3/3P1N2/PPP2PPP/RNBQK2R w KQkq - 0 5"
                  />
                  <button
                    class="px-4 py-2 bg-primary text-on-primary font-title-md text-body-sm rounded-lg hover:bg-primary-fixed-dim transition-colors flex items-center justify-center gap-1.5"
                    id="load-fen-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >sync</span
                    >
                    <span>Load FEN</span>
                  </button>
                </div>
                <!-- Quick Action Buttons -->
                <div class="flex items-center gap-2 mt-1">
                  <button
                    class="px-3 py-1.5 rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-variant text-body-sm transition-colors flex items-center gap-1"
                    id="reset-pos-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >restart_alt</span
                    >
                    <span>Reset Starting Position</span>
                  </button>
                  <button
                    class="px-3 py-1.5 rounded-lg bg-surface-container-high text-error hover:bg-error-container/20 text-body-sm transition-colors flex items-center gap-1"
                    id="clear-board-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >delete_sweep</span
                    >
                    <span>Clear Board</span>
                  </button>
                </div>
              </div>
              <!-- Solution Sequence Input -->
              <div class="flex flex-col gap-1.5">
                <label class="font-title-md text-body-md text-on-surface" for="solution-input">
                  Solution Sequence (Algebraic SAN)
                </label>
                <div class="relative">
                  <input
                    class="w-full bg-surface-container-lowest text-secondary font-mono text-body-md px-4 py-2.5 rounded-lg focus:outline-none focus:ring-1 focus:ring-primary shadow-inner pl-10"
                    id="solution-input"
                    type="text"
                    value="1. Nxe5! Bxd1 2. Bxf7+ Ke7 3. Nd5#"
                  />
                  <span
                    class="material-symbols-outlined absolute left-3 top-3 text-secondary text-[18px]"
                    aria-hidden="true"
                    >verified</span
                  >
                </div>
                <span class="font-body-sm text-outline"
                  >Engine auto-verifies forced branches through depth 24.</span
                >
              </div>
              <!-- Tactical Explanation -->
              <div class="flex flex-col gap-1.5">
                <label
                  class="font-title-md text-body-md text-on-surface"
                  for="tactical-explanation"
                >
                  Tactical Trap Analysis &amp; Failure Branches
                </label>
                <textarea
                  class="w-full bg-surface-container-lowest text-on-surface p-3.5 rounded-lg font-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-inner resize-y leading-relaxed"
                  id="tactical-explanation"
                  rows="3"
                >
If Black takes the queen with 1... Bxd1??, White executes 2. Bxf7+ Ke7 3. Nd5#. If Black instead finds the resilient refutation 1... Nxe5, White maintains an exchange balance with 2. Qxh5 Nxc4 3. Qb5+ grabbing back material with positional dominance.</textarea>
              </div>
            </div>
            <!-- Action Footer -->
            <div
              class="flex flex-wrap items-center justify-between gap-4 p-space-md bg-surface-container-low rounded-xl"
            >
              <div class="flex items-center gap-2">
                <button
                  class="px-4 py-2.5 rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors font-title-md text-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Save as Draft
                </button>
                <button
                  class="px-4 py-2.5 rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors font-title-md text-body-md flex items-center gap-1.5"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >visibility</span
                  >
                  <span>Preview Pattern</span>
                </button>
              </div>
              <div class="flex items-center gap-3">
                <button
                  class="px-4 py-2.5 rounded-lg text-outline hover:text-on-surface transition-colors font-title-md text-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Cancel
                </button>
                <button
                  class="px-6 py-2.5 rounded-lg bg-primary-container text-on-primary-container font-semibold hover:bg-primary transition-all duration-150 shadow-md flex items-center gap-2"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >publish</span
                  >
                  <span>Publish Trick</span>
                </button>
              </div>
            </div>
          </div>
          <!-- Right Column: Live Interactive Chessboard Preview & Engine Validation (5 cols) -->
          <div class="xl:col-span-5 sticky top-20 flex flex-col gap-4">
            <div
              class="bg-surface-container-low rounded-xl p-space-md shadow-xl flex flex-col gap-4"
            >
              <!-- Live Board Header -->
              <div class="flex items-center justify-between pb-1">
                <div class="flex flex-col">
                  <div class="flex items-center gap-2">
                    <span class="font-title-md text-title-md text-on-surface"
                      >Interactive Canvas</span
                    >
                    <span
                      class="px-2 py-0.5 rounded-full bg-primary-container/20 text-primary text-label-badge font-mono"
                      >LIVE FEN</span
                    >
                  </div>
                  <span class="font-body-sm text-outline">Move 5 · Critical Tactical Node</span>
                </div>
                <div class="flex items-center gap-1">
                  <button
                    class="p-2 rounded-lg bg-surface-container-high text-on-surface-variant hover:text-on-surface hover:bg-surface-variant transition-colors"
                    id="flip-board-btn"
                    title="Flip Board Orientation"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >swap_vert</span
                    >
                  </button>
                  <button
                    class="p-2 rounded-lg bg-surface-container-high text-on-surface-variant hover:text-on-surface hover:bg-surface-variant transition-colors"
                    title="Board Setup Assist"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >tune</span
                    >
                  </button>
                </div>
              </div>
              <!-- Engine Evaluation & Side to Move Strip -->
              <div class="flex flex-col gap-2">
                <!-- Engine Badge -->
                <div
                  class="flex items-center justify-between px-3 py-2 rounded-lg bg-surface-container-lowest"
                >
                  <div class="flex items-center gap-2">
                    <span
                      class="material-symbols-outlined text-secondary text-[18px]"
                      aria-hidden="true"
                      >memory</span
                    >
                    <span class="font-body-sm text-on-surface font-medium"
                      >Stockfish 17 Evaluated</span
                    >
                  </div>
                  <span
                    class="px-2 py-0.5 rounded bg-secondary-container text-on-secondary-container font-mono text-body-sm font-semibold"
                  >
                    #M3 Mate in 3
                  </span>
                </div>
                <!-- Turn Badge -->
                <div
                  class="flex items-center justify-between px-3 py-2 rounded-lg bg-surface-container-high"
                >
                  <div class="flex items-center gap-2">
                    <div
                      class="w-3.5 h-3.5 rounded-full bg-white shadow-sm flex items-center justify-center"
                    ></div>
                    <span class="font-title-md text-body-sm text-on-surface">White to Move</span>
                  </div>
                  <span class="font-label-badge uppercase tracking-wider text-primary"
                    >Decisive Advantage (+8.4)</span
                  >
                </div>
              </div>
              <!-- The 8x8 Chessboard Container -->
              <div
                class="relative w-full aspect-square bg-surface-container-lowest rounded-xl overflow-hidden shadow-2xl p-2 sm:p-3 flex flex-col justify-center items-center"
              >
                <!-- Board Grid with rank & file notations -->
                <div
                  class="relative w-full h-full max-w-[440px] max-h-[440px] grid grid-cols-8 grid-rows-8 rounded-lg overflow-hidden select-none shadow-inner"
                  id="chess-board"
                >
                  <!-- Generate 64 squares with classical tactical theme (light: #ebecd0, dark: #739552) -->
                  <!-- Row 8 (Black back rank) -->
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#739552]"
                      >8</span
                    ><!-- r8 c1: a8 Rook -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 39h27v-3H9v3zm3-3v-4h21v4H12zm-1-22V9h4v2h5V9h5v2h5V9h4v5H11zm2.5 12h20l-1.5-7h-17l-1.5 7zM14 29h17v-3H14v3z"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- b8 empty -->
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- c8 Bishop (Pinned/Active) -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 36c3.39-.97 10.11.43 13.5-2 3.39 2.43 10.11 1.03 13.5 2 0 0 1.65.54 3 2-.68.97-1.65.99-3 .5-3.39-.97-10.11.46-13.5-1-3.39 1.46-10.11.03-13.5 1-1.354.49-2.323.47-3-.5 1.354-1.94 3-2 3-2zM15 32c2.5 2.5 12.5 2.5 15 0 .5-1.5 0-2 0-2 0-2.5-2.5-4-2.5-4 5.5-1.5 6-11.5-5-15.5-11 4-10.5 14-5 15.5 0 0-2.5 1.5-2.5 4 0 0-.5.5 0 2zM25 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 1 1 5 0z"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- d8 Queen -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 26c8.5-1.5 21-1.5 27 0l2-12-7 11V11l-5.5 13.5-3-15-3 15-5.5-14V25L7 14l2 12z"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                        <path
                          d="M9 26c0 2 1.5 2 2.5 4 1 1.5 1 1 .5 3.5-1.5 1-1.5 2.5-1.5 2.5-1.5 1.5.5 2.5.5 2.5 6.5 1 16.5 1 23 0 0 0 2-1 .5-2.5 0 0 0-1.5-1.5-2.5-.5-2.5 0-2 .5-3.5 1-2 2.5-2 2.5-4-8.5-1.5-18.5-1.5-27 0z"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- e8 King -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path d="M22.5 11.63V6M20 8h5" stroke="#fff" stroke-width="1.5"></path>
                        <path
                          d="M22.5 25s4.5-7.5 3-10.5c0 0-1-2.5-3-2.5s-3 2.5-3 2.5c-1.5 3 3 10.5 3 10.5"
                          stroke="#fff"
                          stroke-width="1.5"
                        ></path>
                        <path
                          d="M11.5 37c5.5 3.5 15.5 3.5 21 0v-7s9-4.5 6-10.5c-4-1-8 2-8 2s-4-3.5-8-3.5-8 3.5-8 3.5-4-3-8-2c-3 6 6 10.5 6 10.5v7z"
                          stroke="#fff"
                          stroke-width="1.5"
                        ></path>
                        <path
                          d="M11.5 30c5.5-3 15.5-3 21 0m-21 3.5c5.5-3 15.5-3 21 0m-21 3.5c5.5-3 15.5-3 21 0"
                          stroke="#fff"
                          stroke-width="1.5"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- f8 Bishop -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 36c3.39-.97 10.11.43 13.5-2 3.39 2.43 10.11 1.03 13.5 2 0 0 1.65.54 3 2-.68.97-1.65.99-3 .5-3.39-.97-10.11.46-13.5-1-3.39 1.46-10.11.03-13.5 1-1.354.49-2.323.47-3-.5 1.354-1.94 3-2 3-2zM15 32c2.5 2.5 12.5 2.5 15 0 .5-1.5 0-2 0-2 0-2.5-2.5-4-2.5-4 5.5-1.5 6-11.5-5-15.5-11 4-10.5 14-5 15.5 0 0-2.5 1.5-2.5 4 0 0-.5.5 0 2zM25 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 1 1 5 0z"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- g8 empty -->
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- h8 Rook -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 39h27v-3H9v3zm3-3v-4h21v4H12zm-1-22V9h4v2h5V9h5v2h5V9h4v5H11zm2.5 12h20l-1.5-7h-17l-1.5 7zM14 29h17v-3H14v3z"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <!-- Row 7 -->
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >7</span
                    ><!-- a7 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- b7 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- c7 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- d7 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- e7 empty -->
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- f7 Pawn (Vulnerable) -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- g7 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- h7 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <!-- Row 6 -->
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#739552]"
                      >6</span
                    >
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- c6 Black Knight -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M22 10c10.5 1 16.5 8 16 29H15c0-9 10-6.5 8-21"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                        <path
                          d="M24 18c.338-1.353-.662-2.353-2-2-1.338.353-2.338 1.353-2 2 .338 1.353 1.662 1.353 2 0m-4.5 9c2-1 3-3 3-5m-14 3c4 0 6-3 6-7 0-3-2-6-5-6-3 1-5 4-5 8 0 4 2 5 4 5"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <!-- Row 5 -->
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >5</span
                    >
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- e5 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#1a1a1a"
                        stroke="#fff"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <!-- Row 4 -->
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#739552]"
                      >4</span
                    >
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- c4 White Bishop -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 36c3.39-.97 10.11.43 13.5-2 3.39 2.43 10.11 1.03 13.5 2 0 0 1.65.54 3 2-.68.97-1.65.99-3 .5-3.39-.97-10.11.46-13.5-1-3.39 1.46-10.11.03-13.5 1-1.354.49-2.323.47-3-.5 1.354-1.94 3-2 3-2zM15 32c2.5 2.5 12.5 2.5 15 0 .5-1.5 0-2 0-2 0-2.5-2.5-4-2.5-4 5.5-1.5 6-11.5-5-15.5-11 4-10.5 14-5 15.5 0 0-2.5 1.5-2.5 4 0 0-.5.5 0 2zM25 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 1 1 5 0z"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <!-- e4 Black Knight (Tactical target) -->
                  <div class="relative flex items-center justify-center bg-[#ebecd0] bg-opacity-90">
                    <!-- subtle highlight indicating strike square -->
                    <div class="absolute inset-0 bg-primary/20 pointer-events-none"></div>
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#1a1a1a"
                        stroke="#1a1a1a"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M22 10c10.5 1 16.5 8 16 29H15c0-9 10-6.5 8-21"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                        <path
                          d="M24 18c.338-1.353-.662-2.353-2-2-1.338.353-2.338 1.353-2 2 .338 1.353 1.662 1.353 2 0m-4.5 9c2-1 3-3 3-5m-14 3c4 0 6-3 6-7 0-3-2-6-5-6-3 1-5 4-5 8 0 4 2 5 4 5"
                          stroke="#fff"
                          stroke-width="1"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <!-- Row 3 -->
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >3</span
                    >
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- d3 White Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <!-- f3 White Knight (The Key Attacker) -->
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <div
                      class="absolute inset-0 bg-primary/25 pointer-events-none ring-2 ring-primary"
                    ></div>
                    <svg class="w-4/5 h-4/5 filter drop-shadow relative z-10" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path d="M22 10c10.5 1 16.5 8 16 29H15c0-9 10-6.5 8-21"></path>
                        <path
                          d="M24 18c.338-1.353-.662-2.353-2-2-1.338.353-2.338 1.353-2 2 .338 1.353 1.662 1.353 2 0m-4.5 9c2-1 3-3 3-5m-14 3c4 0 6-3 6-7 0-3-2-6-5-6-3 1-5 4-5 8 0 4 2 5 4 5"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <!-- Row 2 -->
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#739552]"
                      >2</span
                    ><!-- a2 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- b2 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- c2 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]"></div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]"></div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- f2 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <!-- g2 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <!-- h2 Pawn -->
                    <svg class="w-3/5 h-3/5 filter drop-shadow" viewBox="0 0 45 45">
                      <path
                        d="M22.5 9c-2.21 0-4 1.79-4 4 0 .89.29 1.71.78 2.38C17.33 16.5 16 18.59 16 21c0 2.03.94 3.84 2.41 5.03-3 1.06-7.41 5.55-7.41 13.47h23c0-7.92-4.41-12.41-7.41-13.47 1.47-1.19 2.41-3 2.41-5.03 0-2.41-1.33-4.5-3.28-5.62.49-.67.78-1.49.78-2.38 0-2.21-1.79-4-4-4z"
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-width="1.2"
                      ></path>
                    </svg>
                  </div>
                  <!-- Row 1 (White back rank) -->
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <span
                      class="absolute top-0.5 left-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >1</span
                    ><span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >a</span
                    ><!-- a1 Rook -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 39h27v-3H9v3zm3-3v-4h21v4H12zm-1-22V9h4v2h5V9h5v2h5V9h4v5H11zm2.5 12h20l-1.5-7h-17l-1.5 7zM14 29h17v-3H14v3z"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#739552]"
                      >b</span
                    ><!-- b1 Knight -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path d="M22 10c10.5 1 16.5 8 16 29H15c0-9 10-6.5 8-21"></path>
                        <path
                          d="M24 18c.338-1.353-.662-2.353-2-2-1.338.353-2.338 1.353-2 2 .338 1.353 1.662 1.353 2 0m-4.5 9c2-1 3-3 3-5m-14 3c4 0 6-3 6-7 0-3-2-6-5-6-3 1-5 4-5 8 0 4 2 5 4 5"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >c</span
                    ><!-- c1 Bishop -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 36c3.39-.97 10.11.43 13.5-2 3.39 2.43 10.11 1.03 13.5 2 0 0 1.65.54 3 2-.68.97-1.65.99-3 .5-3.39-.97-10.11.46-13.5-1-3.39 1.46-10.11.03-13.5 1-1.354.49-2.323.47-3-.5 1.354-1.94 3-2 3-2zM15 32c2.5 2.5 12.5 2.5 15 0 .5-1.5 0-2 0-2 0-2.5-2.5-4-2.5-4 5.5-1.5 6-11.5-5-15.5-11 4-10.5 14-5 15.5 0 0-2.5 1.5-2.5 4 0 0-.5.5 0 2zM25 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 1 1 5 0z"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#739552]"
                      >d</span
                    ><!-- d1 Queen (The Sacrifice Target) -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 26c8.5-1.5 21-1.5 27 0l2-12-7 11V11l-5.5 13.5-3-15-3 15-5.5-14V25L7 14l2 12z"
                        ></path>
                        <path
                          d="M9 26c0 2 1.5 2 2.5 4 1 1.5 1 1 .5 3.5-1.5 1-1.5 2.5-1.5 2.5-1.5 1.5.5 2.5.5 2.5 6.5 1 16.5 1 23 0 0 0 2-1 .5-2.5 0 0 0-1.5-1.5-2.5-.5-2.5 0-2 .5-3.5 1-2 2.5-2 2.5-4-8.5-1.5-18.5-1.5-27 0z"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >e</span
                    ><!-- e1 King -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path d="M22.5 11.63V6M20 8h5"></path>
                        <path
                          d="M22.5 25s4.5-7.5 3-10.5c0 0-1-2.5-3-2.5s-3 2.5-3 2.5c-1.5 3 3 10.5 3 10.5"
                        ></path>
                        <path
                          d="M11.5 37c5.5 3.5 15.5 3.5 21 0v-7s9-4.5 6-10.5c-4-1-8 2-8 2s-4-3.5-8-3.5-8 3.5-8 3.5-4-3-8-2c-3 6 6 10.5 6 10.5v7z"
                        ></path>
                        <path
                          d="M11.5 30c5.5-3 15.5-3 21 0m-21 3.5c5.5-3 15.5-3 21 0m-21 3.5c5.5-3 15.5-3 21 0"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#739552]"
                      >f</span
                    >
                  </div>
                  <div class="relative flex items-center justify-center bg-[#739552]">
                    <span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#ebecd0]"
                      >g</span
                    >
                  </div>
                  <div class="relative flex items-center justify-center bg-[#ebecd0]">
                    <span
                      class="absolute bottom-0.5 right-1 font-mono text-[10px] font-bold text-[#739552]"
                      >h</span
                    ><!-- h1 Rook -->
                    <svg class="w-4/5 h-4/5 filter drop-shadow" viewBox="0 0 45 45">
                      <g
                        fill="#f8fafc"
                        stroke="#1e293b"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="1.5"
                      >
                        <path
                          d="M9 39h27v-3H9v3zm3-3v-4h21v4H12zm-1-22V9h4v2h5V9h5v2h5V9h4v5H11zm2.5 12h20l-1.5-7h-17l-1.5 7zM14 29h17v-3H14v3z"
                        ></path>
                      </g>
                    </svg>
                  </div>
                  <!-- SVG Vector Tactical Strike Arrow: from f3 to e5 (Knight takes e5) -->
                  <svg
                    class="absolute inset-0 w-full h-full pointer-events-none z-20"
                    viewBox="0 0 100 100"
                  >
                    <defs>
                      <marker
                        id="arrowhead"
                        markerHeight="6"
                        markerWidth="6"
                        orient="auto"
                        refX="4"
                        refY="3"
                      >
                        <path d="M0,0 L0,6 L6,3 z" fill="#9fd668"></path>
                      </marker>
                      <filter height="140%" id="glow" width="140%" x="-20%" y="-20%">
                        <fedropshadow
                          dx="0"
                          dy="0"
                          flood-color="#81B64C"
                          flood-opacity="0.8"
                          stdDeviation="1.5"
                        ></fedropshadow>
                      </filter>
                    </defs>
                    <!-- Arrow starting center of f3 (x=68.75, y=68.75) pointing to e4/e5 (x=56.25, y=43.75) -->
                    <line
                      filter="url(#glow)"
                      marker-end="url(#arrowhead)"
                      opacity="0.95"
                      stroke="#9fd668"
                      stroke-linecap="round"
                      stroke-width="2.6"
                      x1="68.75"
                      x2="56.25"
                      y1="68.75"
                      y2="46"
                    ></line>
                  </svg>
                </div>
              </div>
              <!-- Interactive Move Step Controls -->
              <div class="flex flex-wrap items-center justify-between gap-space-xs px-2 pt-1">
                <div class="flex items-center gap-1">
                  <button
                    class="p-2 rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors"
                    id="step-start-btn"
                    title="First Move"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >first_page</span
                    >
                  </button>
                  <button
                    class="p-2 rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors"
                    id="step-back-btn"
                    title="Previous Move"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >chevron_left</span
                    >
                  </button>
                  <button
                    class="p-2 rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors"
                    id="step-fwd-btn"
                    title="Next Move"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >chevron_right</span
                    >
                  </button>
                  <button
                    class="p-2 rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors"
                    id="step-end-btn"
                    title="Final Move"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >last_page</span
                    >
                  </button>
                </div>
                <div class="flex items-center gap-2">
                  <span class="font-label-badge text-outline uppercase tracking-wider">Move:</span>
                  <span
                    class="font-mono text-body-sm text-primary font-bold px-2 py-0.5 rounded bg-surface-container-lowest"
                    id="current-move-display"
                  >
                    1. Nxe5!
                  </span>
                </div>
              </div>
              <!-- Engine Evaluation Details Card -->
              <div class="bg-surface-container-lowest rounded-lg p-3 flex flex-col gap-2">
                <div class="flex items-center justify-between text-body-sm">
                  <span class="text-outline">Calculated Depth</span>
                  <span class="font-mono text-on-surface">28 plies (0.14s)</span>
                </div>
                <div class="w-full bg-surface-container-high h-1.5 rounded-full overflow-hidden">
                  <div class="bg-primary h-full rounded-full w-[88%]"></div>
                </div>
                <div class="flex items-center justify-between text-body-sm pt-1">
                  <span class="text-outline">Principal Variation:</span>
                  <span class="font-mono text-secondary text-[12px]"
                    >1. Nxe5! Bxd1 2. Bxf7+ Ke7 3. Nd5#</span
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
