<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin md:px-margin-desktop">
      <div class="flex flex-col w-full">
        <!-- Subtle ambient decorative glow (contained) -->
        <div class="relative w-full overflow-hidden">
          <div
            class="absolute -top-40 right-1/4 w-96 h-96 bg-primary/5 rounded-full blur-3xl pointer-events-none"
          ></div>
          <div
            class="absolute top-80 -left-20 w-80 h-80 bg-primary-container/5 rounded-full blur-3xl pointer-events-none"
          ></div>
          <!-- Editorial Header Section -->
          <section class="pt-8 pb-10 max-w-7xl mx-auto w-full">
            <div class="flex flex-col lg:flex-row lg:items-end justify-between gap-6">
              <div class="max-w-3xl">
                <div class="flex flex-wrap items-center gap-2 mb-3">
                  <span
                    class="font-label-badge text-label-badge text-primary uppercase tracking-widest bg-secondary-container/60 px-2 py-0.5 rounded"
                    >Tactical Codex</span
                  >
                  <span class="text-outline text-xs">•</span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant font-medium"
                    >FIDE Curriculum Aligned</span
                  >
                  <span class="text-outline text-xs">•</span>
                  <span
                    class="font-body-sm text-body-sm text-primary flex items-center gap-1 font-medium"
                  >
                    <span class="inline-block w-2 h-2 rounded-full bg-primary animate-pulse"></span>
                    248 Verified Patterns
                  </span>
                </div>
                <h1 class="app-page-title mb-3 lg:text-display-lg">
                  Chess Tricks &amp; Tactical Patterns
                </h1>
                <p class="font-body-lg text-body-lg text-on-surface-variant max-w-2xl">
                  Interactive master tactics, opening traps, tactical combinations, and endgame
                  puzzles analyzed with accurate SVG chess pieces.
                </p>
              </div>
              <!-- Quick Stats Callout -->
              <div class="grid grid-cols-3 gap-2 bg-surface-container-low p-2 rounded-xl lg:gap-3">
                <div class="px-2 py-2 bg-surface-container rounded-lg text-center sm:min-w-24 sm:px-4">
                  <div class="font-label-numeric-lg text-label-numeric-lg text-primary">94.8%</div>
                  <div class="font-body-sm text-body-sm text-on-surface-variant">
                    Success Metric
                  </div>
                </div>
                <div class="px-2 py-2 bg-surface-container rounded-lg text-center sm:min-w-24 sm:px-4">
                  <div class="font-label-numeric-lg text-label-numeric-lg text-on-surface">32</div>
                  <div class="font-body-sm text-body-sm text-on-surface-variant">Study Themes</div>
                </div>
                <div class="px-2 py-2 bg-surface-container rounded-lg text-center sm:min-w-24 sm:px-4">
                  <div class="font-label-numeric-lg text-label-numeric-lg text-secondary">
                    Stockfish 17
                  </div>
                  <div class="font-body-sm text-body-sm text-on-surface-variant">
                    Evaluation Core
                  </div>
                </div>
              </div>
            </div>
            <!-- Tactical Filters & Search Bar -->
            <div
              class="app-panel mt-8 flex flex-col items-stretch justify-between gap-4 p-4 xl:flex-row xl:items-center"
            >
              <!-- Categories -->
              <div class="flex flex-wrap items-center gap-2">
                <button
                  class="px-3.5 py-1.5 rounded-lg font-title-md text-body-md bg-primary text-on-primary font-medium transition-all shadow-sm"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  All Tactics
                </button>
                <button
                  class="px-3.5 py-1.5 rounded-lg font-title-md text-body-md bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface transition-all"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Opening Traps
                </button>
                <button
                  class="px-3.5 py-1.5 rounded-lg font-title-md text-body-md bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface transition-all"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Middlegame Combinations
                </button>
                <button
                  class="px-3.5 py-1.5 rounded-lg font-title-md text-body-md bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface transition-all"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Endgame Finesse
                </button>
                <button
                  class="px-3.5 py-1.5 rounded-lg font-title-md text-body-md bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface transition-all"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Checkmate Patterns
                </button>
              </div>
              <!-- Right Side: Difficulty & Search -->
              <div class="flex flex-wrap items-center gap-3">
                <!-- Difficulty Chips -->
                <div class="flex flex-wrap items-center gap-1.5 bg-surface-container-lowest p-1 rounded-lg">
                  <button
                    class="px-2.5 py-1 rounded font-body-sm text-body-sm text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-all"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Beginner
                  </button>
                  <button
                    class="px-2.5 py-1 rounded font-body-sm text-body-sm text-primary font-semibold bg-surface-container shadow-sm"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Intermediate
                  </button>
                  <button
                    class="px-2.5 py-1 rounded font-body-sm text-body-sm text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-all"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Advanced
                  </button>
                </div>
                <!-- Search Input -->
                <div class="relative min-w-0 w-full sm:w-64">
                  <span
                    class="material-symbols-outlined absolute left-3 top-2.5 text-[18px] text-outline"
                    aria-hidden="true"
                    >search</span
                  >
                  <input
                    class="w-full pl-9 pr-3 py-1.5 bg-surface-container-lowest text-on-surface placeholder:text-outline text-body-sm font-body-sm rounded-lg focus:outline-none focus:ring-1 focus:ring-primary"
                    placeholder="Search tactic or ECO code (e.g. C50)..."
                    type="text"
                  />
                  <span
                    class="absolute right-2.5 top-2 px-1.5 py-0.5 rounded bg-surface-container font-label-badge text-label-badge text-outline"
                    >⌘K</span
                  >
                </div>
              </div>
            </div>
          </section>
          <!-- Main Featured Interactive Article Layout (/tricks/:id spotlight) -->
          <article class="max-w-7xl mx-auto w-full pb-16">
            <!-- Article Header & Meta Bar -->
            <div class="bg-surface-container-low rounded-t-2xl p-6 shadow-md">
              <div class="flex flex-col md:flex-row md:items-center justify-between gap-4">
                <div class="flex flex-col gap-2">
                  <div class="flex items-center gap-2 flex-wrap">
                    <span
                      class="px-2.5 py-0.5 rounded-full font-label-badge text-label-badge uppercase tracking-wider bg-secondary-container text-secondary font-semibold"
                      >Tactics &amp; Combinations</span
                    >
                    <span
                      class="px-2.5 py-0.5 rounded-full font-label-badge text-label-badge uppercase tracking-wider bg-surface-container-high text-primary font-semibold"
                      >Intermediate</span
                    >
                    <span class="font-body-sm text-body-sm text-outline"
                      >ECO Code: C50 / C45 Sub-motif</span
                    >
                    <span class="text-outline text-xs">•</span>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Est. study time: 8 min</span
                    >
                  </div>
                  <h2 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                    The Greek Gift Sacrifice — Bxh7+ Tactical Masterclass
                  </h2>
                </div>
                <!-- Author Credential Card -->
                <div
                  class="flex items-center gap-3 bg-surface-container px-4 py-2.5 rounded-xl shrink-0"
                >
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-high overflow-hidden flex items-center justify-center text-primary font-bold"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Intense portrait of Grandmaster Marcus Vance sitting across a tournament wooden chess set under studio analytical warm lighting, dark textured background with chess strategy diagrams, photorealistic portrait"
                      src="/images/2488d02bf92d.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col">
                    <span
                      class="font-title-md text-title-md text-on-surface flex items-center gap-1.5"
                    >
                      GM Marcus Vance
                      <span
                        class="material-symbols-outlined text-primary text-[16px]"
                        title="FIDE Certified Grandmaster"
                        aria-hidden="true"
                        >verified</span
                      >
                    </span>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Peak FIDE 2640 • Published Apr 12, 2025</span
                    >
                  </div>
                </div>
              </div>
            </div>
            <!-- Two-Column Split Study View -->
            <div
              class="grid grid-cols-1 lg:grid-cols-12 bg-surface-container rounded-b-2xl overflow-hidden shadow-xl"
            >
              <!-- Left Side: Interactive High-Fidelity SVG Chessboard (7 cols) -->
              <div
                class="lg:col-span-7 min-w-0 p-4 sm:p-6 lg:p-8 flex flex-col items-center justify-between bg-surface-container-lowest"
              >
                <!-- Tactical Assessment Bar (Top of Board) -->
                <div
                  class="w-full max-w-[520px] flex flex-wrap items-center justify-between gap-2 mb-3 text-body-sm font-body-sm"
                >
                  <div class="flex flex-wrap items-center gap-2">
                    <span class="inline-block w-2.5 h-2.5 rounded-full bg-primary"></span>
                    <span class="font-semibold text-on-surface">White to Move</span>
                    <span class="text-outline">|</span>
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-primary bg-secondary-container/40 px-2 py-0.5 rounded"
                      >Decisive Advantage (+4.82)</span
                    >
                  </div>
                  <div class="flex items-center gap-2 text-on-surface-variant">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >timer</span
                    >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface font-mono"
                      >03:45</span
                    >
                  </div>
                </div>
                <!-- Visual Chessboard Frame -->
                <div
                  class="relative w-full max-w-[520px] aspect-square rounded-xl bg-surface-container-high p-3 shadow-2xl flex flex-col"
                >
                  <!-- Rank Numbers (1 to 8) and File Letters (a to h) container -->
                  <div
                    class="relative w-full h-full rounded-lg overflow-hidden grid grid-cols-8 grid-rows-8 select-none shadow-inner"
                    id="chessBoardMatrix"
                  >
                    <!-- Board Squares Generation: Classic Grandmaster Dark (deep slate/moss #253322 & #81b64c / #394d2d & #c2d8a4 stylized in theme) -->
                    <!-- Row 8 (Rank 8) - Black pieces back rank -->
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center text-xs font-semibold text-surface-container-lowest"
                      data-square="a8"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >8</span
                      >
                      <!-- Black Rook -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path d="M 9,39 L 36,39 L 36,36 L 9,36 z"></path>
                        <path d="M 12,36 L 12,32 L 33,32 L 33,36 z"></path>
                        <path
                          d="M 11,14 L 11,9 L 15,9 L 15,11 L 20,11 L 20,9 L 25,9 L 25,11 L 30,11 L 30,9 L 34,9 L 34,14 z"
                        ></path>
                        <path d="M 34,14 L 31,17 L 14,17 L 11,14 z"></path>
                        <path d="M 14,17 L 14,29.5 L 31,29.5 L 31,17 z"></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="b8"
                    >
                      <!-- Empty -->
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="c8"
                    >
                      <!-- Black Bishop -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <g>
                          <path
                            d="M 9,36 C 12.39,35.03 19.11,36.43 22.5,34 C 25.89,36.43 32.61,35.03 36,36 C 36,36 37.65,36.54 39,38 C 38.32,38.97 37.14,39.5 35.5,40 C 31.33,39.65 26.22,40 22.5,40 C 18.78,40 13.67,39.65 9.5,40 C 7.86,39.5 6.68,38.97 6,38 C 7.35,36.54 9,36 9,36 z"
                          ></path>
                          <path
                            d="M 15,32 C 17.5,34.5 27.5,34.5 30,32 C 30.5,30.5 30,30 30,30 C 30,27.5 27.5,26 27.5,26 C 33,24.5 33.5,14.5 22.5,10.5 C 11.5,14.5 12,24.5 17.5,26 C 17.5,26 15,27.5 15,30 C 15,30 14.5,30.5 15,32 z"
                          ></path>
                          <path d="M 25 8 A 2.5 2.5 0 1 1 20,8 A 2.5 2.5 0 1 1 25 8 Z"></path>
                        </g>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="d8"
                    >
                      <!-- Black Queen -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 9 26 C 17.5 24.5 30 24.5 36 26 L 38 14 L 31 25 L 31 11 L 25.5 24.5 L 22.5 9.5 L 19.5 24.5 L 14 11 L 14 25 L 7 14 L 9 26 z"
                        ></path>
                        <path
                          d="M 9,26 C 9,28 10.5,28 11.5,30 C 12.5,31.5 12.5,31 12,33.5 C 10.5,34.5 10.5,36 10.5,36 C 9,37.5 11,38.5 11,38.5 C 17.5,39.5 27.5,39.5 34,38.5 C 34,38.5 35.5,37.5 34.5,36 C 34.5,36 34.5,34.5 33,33.5 C 32.5,31 32.5,31.5 33.5,30 C 34.5,28 36,28 36,26 C 27.5,24.5 17.5,24.5 9,26 z"
                        ></path>
                        <circle cx="6" cy="12" r="2"></circle>
                        <circle cx="14" cy="9" r="2"></circle>
                        <circle cx="22.5" cy="8" r="2"></circle>
                        <circle cx="31" cy="9" r="2"></circle>
                        <circle cx="39" cy="12" r="2"></circle>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="e8"
                    >
                      <!-- Empty -->
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="f8"
                    >
                      <!-- Black Rook after castle -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path d="M 9,39 L 36,39 L 36,36 L 9,36 z"></path>
                        <path d="M 12,36 L 12,32 L 33,32 L 33,36 z"></path>
                        <path
                          d="M 11,14 L 11,9 L 15,9 L 15,11 L 20,11 L 20,9 L 25,9 L 25,11 L 30,11 L 30,9 L 34,9 L 34,14 z"
                        ></path>
                        <path d="M 34,14 L 31,17 L 14,17 L 11,14 z"></path>
                        <path d="M 14,17 L 14,29.5 L 31,29.5 L 31,17 z"></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="g8"
                    >
                      <!-- Black King (Castled target) -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path d="M 22.5,11.63 L 22.5,6" stroke-linejoin="miter"></path>
                        <path d="M 20,8 L 25,8"></path>
                        <path
                          d="M 22.5,25 C 22.5,25 27,17.5 25.5,14.5 C 24,11.5 21,11.5 22.5,11.5 C 24,11.5 21,11.5 19.5,14.5 C 18,17.5 22.5,25 22.5,25"
                        ></path>
                        <path
                          d="M 11.5,37 C 17,40.5 28,40.5 33.5,37 C 36.5,35 36,33 34,31.5 C 30,29 27,29 22.5,29 C 18,29 15,29 11,31.5 C 9,33 8.5,35 11.5,37 z"
                        ></path>
                        <path d="M 20,8 A 0.5 0.5 0 1 1 19,8 A 0.5 0.5 0 1 1 20,8 Z"></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="h8"
                    >
                      <!-- Empty -->
                    </div>
                    <!-- Row 7 (Rank 7) -->
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="a7"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >7</span
                      >
                      <!-- Black Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="b7"
                    >
                      <!-- Black Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="c7"
                    >
                      <!-- Black Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="d7"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="e7"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="f7"
                    >
                      <!-- Black Pawn f7 -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="g7"
                    >
                      <!-- Black Pawn g7 -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <!-- CRITICAL SQUARE h7: Marked with Tactical Glow for Bxh7+ -->
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center ring-4 ring-inset ring-primary/80 bg-primary/20"
                      data-square="h7"
                      id="h7SacTarget"
                    >
                      <span class="absolute inset-0 bg-primary/20 animate-pulse"></span>
                      <!-- White Bishop delivering Bxh7+ check! -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-lg fill-[#f5f7f2] stroke-[#1b2219] z-10 transition-transform duration-300 scale-105"
                        stroke-width="1.3"
                        viewBox="0 0 45 45"
                      >
                        <g>
                          <path
                            d="M 9,36 C 12.39,35.03 19.11,36.43 22.5,34 C 25.89,36.43 32.61,35.03 36,36 C 36,36 37.65,36.54 39,38 C 38.32,38.97 37.14,39.5 35.5,40 C 31.33,39.65 26.22,40 22.5,40 C 18.78,40 13.67,39.65 9.5,40 C 7.86,39.5 6.68,38.97 6,38 C 7.35,36.54 9,36 9,36 z"
                          ></path>
                          <path
                            d="M 15,32 C 17.5,34.5 27.5,34.5 30,32 C 30.5,30.5 30,30 30,30 C 30,27.5 27.5,26 27.5,26 C 33,24.5 33.5,14.5 22.5,10.5 C 11.5,14.5 12,24.5 17.5,26 C 17.5,26 15,27.5 15,30 C 15,30 14.5,30.5 15,32 z"
                          ></path>
                          <path d="M 25 8 A 2.5 2.5 0 1 1 20,8 A 2.5 2.5 0 1 1 25 8 Z"></path>
                        </g>
                      </svg>
                      <span class="absolute -top-1 -right-1 flex h-4 w-4">
                        <span
                          class="animate-ping absolute inline-flex h-full w-full rounded-full bg-primary opacity-75"
                        ></span>
                        <span
                          class="relative inline-flex rounded-full h-4 w-4 bg-primary text-[10px] font-bold text-on-primary items-center justify-center"
                          >!</span
                        >
                      </span>
                    </div>
                    <!-- Row 6 (Rank 6) -->
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="a6"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >6</span
                      >
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="b6"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="c6"
                    >
                      <!-- Black Knight on c6 -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22,10 C 32.5,11 38.5,18 38,39 L 15,39 C 15,30 25,32.5 23,18"
                        ></path>
                        <path
                          d="M 24,18 C 24.38,20.91 18.45,25.37 16,27 C 13,29 13.18,31.34 11,31 C 9.958,30.06 12.41,27.96 11,28 C 10,28 11.19,29.23 10,30 C 9,30 5.997,31 6,26 C 6,24 12,14 12,14 C 12,14 13.89,12.1 14,10.5 C 13.27,7.424 22.25,7.906 22,10 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="d6"
                    >
                      <!-- Black d6 pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="e6"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="f6"
                    >
                      <!-- f6 empty - CRITICAL for Greek Gift! No defending knight -->
                      <div
                        class="w-2 h-2 rounded-full bg-error/40"
                        title="Key: No Black Knight on f6"
                      ></div>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="g6"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="h6"
                    ></div>
                    <!-- Row 5 (Rank 5) -->
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="a5"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >5</span
                      >
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="b5"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="c5"
                    >
                      <!-- Black Bishop on c5 -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <g>
                          <path
                            d="M 9,36 C 12.39,35.03 19.11,36.43 22.5,34 C 25.89,36.43 32.61,35.03 36,36 C 36,36 37.65,36.54 39,38 C 38.32,38.97 37.14,39.5 35.5,40 C 31.33,39.65 26.22,40 22.5,40 C 18.78,40 13.67,39.65 9.5,40 C 7.86,39.5 6.68,38.97 6,38 C 7.35,36.54 9,36 9,36 z"
                          ></path>
                          <path
                            d="M 15,32 C 17.5,34.5 27.5,34.5 30,32 C 30.5,30.5 30,30 30,30 C 30,27.5 27.5,26 27.5,26 C 33,24.5 33.5,14.5 22.5,10.5 C 11.5,14.5 12,24.5 17.5,26 C 17.5,26 15,27.5 15,30 C 15,30 14.5,30.5 15,32 z"
                          ></path>
                          <path d="M 25 8 A 2.5 2.5 0 1 1 20,8 A 2.5 2.5 0 1 1 25 8 Z"></path>
                        </g>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="d5"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="e5"
                    >
                      <!-- Black e5 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#181a17] stroke-[#ffffff]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="f5"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center ring-2 ring-primary/40"
                      data-square="g5"
                      id="g5KnightTarget"
                    >
                      <!-- Ghost target for White Knight Ng5+ -->
                      <span class="w-3 h-3 rounded-full bg-primary/40"></span>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center ring-2 ring-primary/40"
                      data-square="h5"
                      id="h5QueenTarget"
                    >
                      <!-- Ghost target for White Queen Qh5 -->
                      <span class="w-3 h-3 rounded-full bg-primary/40"></span>
                    </div>
                    <!-- Row 4 (Rank 4) -->
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="a4"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >4</span
                      >
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="b4"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="c4"
                    >
                      <!-- White Bishop starting origin on d3/c4 -->
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="d4"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="e4"
                    >
                      <!-- White e4 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="f4"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="g4"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="h4"
                    ></div>
                    <!-- Row 3 (Rank 3) -->
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="a3"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >3</span
                      >
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="b3"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="c3"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="d3"
                    >
                      <!-- White d3 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="e3"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center bg-secondary-container/30"
                      data-square="f3"
                    >
                      <!-- White Knight poised to jump to g5 -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22,10 C 32.5,11 38.5,18 38,39 L 15,39 C 15,30 25,32.5 23,18"
                        ></path>
                        <path
                          d="M 24,18 C 24.38,20.91 18.45,25.37 16,27 C 13,29 13.18,31.34 11,31 C 9.958,30.06 12.41,27.96 11,28 C 10,28 11.19,29.23 10,30 C 9,30 5.997,31 6,26 C 6,24 12,14 12,14 C 12,14 13.89,12.1 14,10.5 C 13.27,7.424 22.25,7.906 22,10 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="g3"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="h3"
                    ></div>
                    <!-- Row 2 (Rank 2) -->
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="a2"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >2</span
                      >
                      <!-- White a2 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="b2"
                    >
                      <!-- White b2 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="c2"
                    >
                      <!-- White c2 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="d2"
                    ></div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="e2"
                    ></div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="f2"
                    >
                      <!-- White f2 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="g2"
                    >
                      <!-- White g2 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="h2"
                    >
                      <!-- White h2 Pawn -->
                      <svg
                        class="w-4/6 h-4/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 22.5,9 C 19.8,9 18,10.8 18,13.5 C 18,15.28 18.9,16.8 20.25,17.65 C 17.55,18.9 15.5,21.9 15.5,25.5 C 15.5,27.3 16.2,28.9 17.2,30.1 C 15.2,31.3 13.5,33.5 13.5,36.5 L 31.5,36.5 C 31.5,33.5 29.8,31.3 27.8,30.1 C 28.8,28.9 29.5,27.3 29.5,25.5 C 29.5,21.9 27.45,18.9 24.75,17.65 C 26.1,16.8 27,15.28 27,13.5 C 27,10.8 25.2,9 22.5,9 z"
                        ></path>
                      </svg>
                    </div>
                    <!-- Row 1 (Rank 1) -->
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="a1"
                    >
                      <span
                        class="absolute top-0.5 left-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >1</span
                      >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >a</span
                      >
                      <!-- White Rook a1 -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path d="M 9,39 L 36,39 L 36,36 L 9,36 z"></path>
                        <path d="M 12,36 L 12,32 L 33,32 L 33,36 z"></path>
                        <path
                          d="M 11,14 L 11,9 L 15,9 L 15,11 L 20,11 L 20,9 L 25,9 L 25,11 L 30,11 L 30,9 L 34,9 L 34,14 z"
                        ></path>
                        <path d="M 34,14 L 31,17 L 14,17 L 11,14 z"></path>
                        <path d="M 14,17 L 14,29.5 L 31,29.5 L 31,17 z"></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="b1"
                    >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >b</span
                      >
                      <!-- White Knight b1 / empty if moved -->
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="c1"
                    >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >c</span
                      >
                      <!-- White c1 Bishop -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <g>
                          <path
                            d="M 9,36 C 12.39,35.03 19.11,36.43 22.5,34 C 25.89,36.43 32.61,35.03 36,36 C 36,36 37.65,36.54 39,38 C 38.32,38.97 37.14,39.5 35.5,40 C 31.33,39.65 26.22,40 22.5,40 C 18.78,40 13.67,39.65 9.5,40 C 7.86,39.5 6.68,38.97 6,38 C 7.35,36.54 9,36 9,36 z"
                          ></path>
                          <path
                            d="M 15,32 C 17.5,34.5 27.5,34.5 30,32 C 30.5,30.5 30,30 30,30 C 30,27.5 27.5,26 27.5,26 C 33,24.5 33.5,14.5 22.5,10.5 C 11.5,14.5 12,24.5 17.5,26 C 17.5,26 15,27.5 15,30 C 15,30 14.5,30.5 15,32 z"
                          ></path>
                          <path d="M 25 8 A 2.5 2.5 0 1 1 20,8 A 2.5 2.5 0 1 1 25 8 Z"></path>
                        </g>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center bg-secondary-container/30"
                      data-square="d1"
                    >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >d</span
                      >
                      <!-- White Queen ready to attack -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path
                          d="M 9 26 C 17.5 24.5 30 24.5 36 26 L 38 14 L 31 25 L 31 11 L 25.5 24.5 L 22.5 9.5 L 19.5 24.5 L 14 11 L 14 25 L 7 14 L 9 26 z"
                        ></path>
                        <path
                          d="M 9,26 C 9,28 10.5,28 11.5,30 C 12.5,31.5 12.5,31 12,33.5 C 10.5,34.5 10.5,36 10.5,36 C 9,37.5 11,38.5 11,38.5 C 17.5,39.5 27.5,39.5 34,38.5 C 34,38.5 35.5,37.5 34.5,36 C 34.5,36 34.5,34.5 33,33.5 C 32.5,31 32.5,31.5 33.5,30 C 34.5,28 36,28 36,26 C 27.5,24.5 17.5,24.5 9,26 z"
                        ></path>
                        <circle cx="6" cy="12" r="2"></circle>
                        <circle cx="14" cy="9" r="2"></circle>
                        <circle cx="22.5" cy="8" r="2"></circle>
                        <circle cx="31" cy="9" r="2"></circle>
                        <circle cx="39" cy="12" r="2"></circle>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="e1"
                    >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >e</span
                      >
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="f1"
                    >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >f</span
                      >
                      <!-- White Rook f1 -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path d="M 9,39 L 36,39 L 36,36 L 9,36 z"></path>
                        <path d="M 12,36 L 12,32 L 33,32 L 33,36 z"></path>
                        <path
                          d="M 11,14 L 11,9 L 15,9 L 15,11 L 20,11 L 20,9 L 25,9 L 25,11 L 30,11 L 30,9 L 34,9 L 34,14 z"
                        ></path>
                        <path d="M 34,14 L 31,17 L 14,17 L 11,14 z"></path>
                        <path d="M 14,17 L 14,29.5 L 31,29.5 L 31,17 z"></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#293d25] flex items-center justify-center"
                      data-square="g1"
                    >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-on-surface-variant font-mono opacity-80"
                        >g</span
                      >
                      <!-- White King g1 castled -->
                      <svg
                        class="w-5/6 h-5/6 drop-shadow-md fill-[#f5f7f2] stroke-[#1b2219]"
                        stroke-width="1.2"
                        viewBox="0 0 45 45"
                      >
                        <path d="M 22.5,11.63 L 22.5,6" stroke-linejoin="miter"></path>
                        <path d="M 20,8 L 25,8"></path>
                        <path
                          d="M 22.5,25 C 22.5,25 27,17.5 25.5,14.5 C 24,11.5 21,11.5 22.5,11.5 C 24,11.5 21,11.5 19.5,14.5 C 18,17.5 22.5,25 22.5,25"
                        ></path>
                        <path
                          d="M 11.5,37 C 17,40.5 28,40.5 33.5,37 C 36.5,35 36,33 34,31.5 C 30,29 27,29 22.5,29 C 18,29 15,29 11,31.5 C 9,33 8.5,35 11.5,37 z"
                        ></path>
                        <path d="M 20,8 A 0.5 0.5 0 1 1 19,8 A 0.5 0.5 0 1 1 20,8 Z"></path>
                      </svg>
                    </div>
                    <div
                      class="relative bg-[#a4bd87] flex items-center justify-center"
                      data-square="h1"
                    >
                      <span
                        class="absolute bottom-0.5 right-1 text-[10px] text-surface-container-lowest font-mono opacity-80"
                        >h</span
                      >
                    </div>
                  </div>
                  <!-- Vector Tactical Attack Arrow Overlay -->
                  <svg
                    class="absolute inset-3 pointer-events-none w-[calc(100%-24px)] h-[calc(100%-24px)] z-20"
                    viewBox="0 0 800 800"
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
                        <polygon fill="#9fd668" points="0 0, 6 3, 0 6"></polygon>
                      </marker>
                      <linearGradient id="tacticalRay" x1="0%" x2="100%" y1="100%" y2="0%">
                        <stop offset="0%" stop-color="#9fd668" stop-opacity="0.2"></stop>
                        <stop offset="100%" stop-color="#9fd668" stop-opacity="0.9"></stop>
                      </linearGradient>
                    </defs>
                    <!-- Bishop line: c2/d3 trajectory slamming onto h7 -->
                    <line
                      marker-end="url(#arrowhead)"
                      stroke="url(#tacticalRay)"
                      stroke-dasharray="8 6"
                      stroke-linecap="round"
                      stroke-width="8"
                      x1="350"
                      x2="745"
                      y1="550"
                      y2="155"
                    ></line>
                  </svg>
                </div>
                <!-- Board Controllers & FEN Section -->
                <div class="w-full max-w-[520px] mt-4 flex flex-col gap-3">
                  <!-- Move Control Toolbar -->
                  <div
                    class="flex flex-wrap items-center justify-between gap-2 bg-surface-container p-2 rounded-xl"
                  >
                    <div class="flex items-center gap-1">
                      <button
                        class="w-9 h-9 flex items-center justify-center rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface transition-colors"
                        title="First Move"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >first_page</span
                        >
                      </button>
                      <button
                        class="w-9 h-9 flex items-center justify-center rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface transition-colors"
                        title="Previous Step"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >chevron_left</span
                        >
                      </button>
                      <button
                        class="px-3 h-9 flex items-center justify-center gap-1.5 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-semibold text-body-sm transition-colors shadow-sm"
                        title="Next Step"
                        type="button"
                        disabled
                      >
                        <span>Step 1 / 4</span>
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >chevron_right</span
                        >
                      </button>
                      <button
                        class="w-9 h-9 flex items-center justify-center rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface transition-colors"
                        title="Last Move"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >last_page</span
                        >
                      </button>
                    </div>
                    <div class="flex items-center gap-1">
                      <button
                        class="flex items-center gap-1.5 px-3 h-9 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface text-body-sm transition-colors"
                        id="flipBoardBtn"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span
                          class="material-symbols-outlined text-[16px] text-primary"
                          aria-hidden="true"
                          >sync</span
                        >
                        <span>Flip</span>
                      </button>
                      <button
                        class="w-9 h-9 flex items-center justify-center rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface transition-colors"
                        title="Stockfish Depth 24 Engine Analysis"
                        type="button"
                        disabled
                      >
                        <span
                          class="material-symbols-outlined text-[18px] text-secondary"
                          aria-hidden="true"
                          >memory</span
                        >
                      </button>
                    </div>
                  </div>
                  <!-- FEN notation copy container -->
                  <div
                    class="flex items-center justify-between gap-2 px-3 py-2 rounded-lg bg-surface-container-high font-mono text-body-sm"
                  >
                    <div class="flex items-center gap-2 truncate text-on-surface-variant">
                      <span
                        class="font-label-badge text-label-badge text-outline uppercase font-sans"
                        >FEN</span
                      >
                      <span class="truncate select-all text-xs" id="fenString"
                        >r1bq1rk1/ppp2ppp/2np4/2b1p3/2B1P3/3P1N2/PPP2PPP/RNBQ1RK1 w - - 0 1</span
                      >
                    </div>
                    <button
                      class="px-2.5 py-1 shrink-0 rounded bg-surface hover:bg-surface-bright text-primary text-xs font-sans font-medium transition-colors flex items-center gap-1 shadow-sm"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >content_copy</span
                      >
                      Copy FEN
                    </button>
                  </div>
                </div>
              </div>
              <!-- Right Side: Step-by-Step Tactical Lesson (5 cols) -->
              <div
                class="lg:col-span-5 min-w-0 p-4 sm:p-6 lg:p-8 flex flex-col justify-between bg-surface-container"
              >
                <div>
                  <!-- Lesson Header & Abstract -->
                  <div class="pb-5 mb-5 bg-surface-container-low p-4 rounded-xl">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-primary font-bold"
                      >Tactical Theme</span
                    >
                    <h3 class="font-headline-md text-headline-md text-on-surface mt-1">
                      The Classic Bishop Sacrifice on h7
                    </h3>
                    <p class="font-body-md text-body-md text-on-surface-variant mt-2">
                      Also known as the
                      <strong class="text-on-surface font-semibold"
                        >Classical Bishop Sacrifice</strong
                      >, this devastating kingside battering ram dismantles Black's shelter when f6
                      is undefended.
                    </p>
                  </div>
                  <!-- Prerequisites Checklist (Engine verified) -->
                  <div class="mb-6">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-bold block mb-2.5"
                    >
                      Critical Attack Prerequisites
                    </span>
                    <div class="flex flex-col gap-2 font-body-sm text-body-sm">
                      <div
                        class="flex items-start gap-2.5 bg-surface-container-high/60 p-2.5 rounded-lg"
                      >
                        <span
                          class="material-symbols-outlined text-primary text-[18px] shrink-0 mt-0.5"
                          aria-hidden="true"
                          >check_circle</span
                        >
                        <span class="text-on-surface"
                          ><strong>White Knight</strong> primed to immediately jump to
                          <span class="font-mono text-primary font-semibold">g5+</span> with
                          check.</span
                        >
                      </div>
                      <div
                        class="flex items-start gap-2.5 bg-surface-container-high/60 p-2.5 rounded-lg"
                      >
                        <span
                          class="material-symbols-outlined text-primary text-[18px] shrink-0 mt-0.5"
                          aria-hidden="true"
                          >check_circle</span
                        >
                        <span class="text-on-surface"
                          ><strong>White Queen</strong> maintains swift transit corridor to
                          <span class="font-mono text-primary font-semibold">h5</span> (or
                          d3).</span
                        >
                      </div>
                      <div
                        class="flex items-start gap-2.5 bg-surface-container-high/60 p-2.5 rounded-lg"
                      >
                        <span
                          class="material-symbols-outlined text-primary text-[18px] shrink-0 mt-0.5"
                          aria-hidden="true"
                          >check_circle</span
                        >
                        <span class="text-on-surface"
                          ><strong>Black Castled King</strong> has lost its guarding knight on
                          <span class="font-mono text-error font-semibold">f6</span> (deflected or
                          undeveloped).</span
                        >
                      </div>
                    </div>
                  </div>
                  <!-- Interactive Move Sequences -->
                  <div class="mb-6">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-bold block mb-2.5"
                    >
                      Instructional Move Sequence
                    </span>
                    <div
                      class="flex flex-col gap-2 font-mono text-body-sm"
                      id="moveSequenceAccordion"
                    >
                      <!-- Move 1 -->
                      <div
                        class="p-3 rounded-lg bg-surface-container-high ring-1 ring-primary/40 transition-all cursor-pointer"
                      >
                        <div class="flex items-center justify-between">
                          <div class="flex items-center gap-2">
                            <span
                              class="w-5 h-5 rounded bg-primary text-on-primary text-[11px] font-bold flex items-center justify-center font-sans"
                              >1</span
                            >
                            <span class="font-bold text-on-surface">1. Bxh7+!</span>
                            <span class="text-on-surface-variant">Kxh7</span>
                          </div>
                          <span
                            class="font-label-badge text-label-badge uppercase tracking-wider text-primary font-sans bg-secondary-container/50 px-2 py-0.5 rounded"
                            >Active Turn</span
                          >
                        </div>
                        <p class="font-sans text-xs text-on-surface-variant mt-2 leading-relaxed">
                          The bomb detonates. The King is forced to step into the open light
                          diagonal, ripping open the kingside fortifications.
                        </p>
                      </div>
                      <!-- Move 2 -->
                      <div
                        class="p-3 rounded-lg bg-surface-container-low hover:bg-surface-container-high transition-all cursor-pointer"
                      >
                        <div class="flex items-center justify-between">
                          <div class="flex items-center gap-2">
                            <span
                              class="w-5 h-5 rounded bg-surface-container-highest text-on-surface-variant text-[11px] font-bold flex items-center justify-center font-sans"
                              >2</span
                            >
                            <span class="font-bold text-on-surface">2. Ng5+</span>
                            <span class="text-on-surface-variant">Kg8 (or Kg6)</span>
                          </div>
                          <span class="text-outline text-xs font-sans">Forcing move</span>
                        </div>
                      </div>
                      <!-- Move 3 -->
                      <div
                        class="p-3 rounded-lg bg-surface-container-low hover:bg-surface-container-high transition-all cursor-pointer"
                      >
                        <div class="flex items-center justify-between">
                          <div class="flex items-center gap-2">
                            <span
                              class="w-5 h-5 rounded bg-surface-container-highest text-on-surface-variant text-[11px] font-bold flex items-center justify-center font-sans"
                              >3</span
                            >
                            <span class="font-bold text-on-surface">3. Qh5!</span>
                            <span class="text-on-surface-variant">Re8</span>
                          </div>
                          <span class="text-outline text-xs font-sans">Mate in 4 threatened</span>
                        </div>
                      </div>
                      <!-- Move 4 -->
                      <div
                        class="p-3 rounded-lg bg-surface-container-low hover:bg-surface-container-high transition-all cursor-pointer"
                      >
                        <div class="flex items-center justify-between">
                          <div class="flex items-center gap-2">
                            <span
                              class="w-5 h-5 rounded bg-surface-container-highest text-on-surface-variant text-[11px] font-bold flex items-center justify-center font-sans"
                              >4</span
                            >
                            <span class="font-bold text-primary font-bold"
                              >4. Qxf7+ Kh8 ... 8. Qxg7#</span
                            >
                          </div>
                          <span
                            class="font-label-badge text-label-badge uppercase tracking-wider text-secondary font-sans"
                            >Checkmate</span
                          >
                        </div>
                      </div>
                    </div>
                  </div>
                  <!-- Deep Engine Refutation Accordion Trigger -->
                  <div class="pt-2">
                    <button
                      class="w-full flex items-center justify-between px-4 py-3 rounded-xl bg-surface-container-high hover:bg-surface-bright text-primary transition-all shadow-sm"
                      id="toggleEngineDefenseBtn"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <div class="flex items-center gap-2">
                        <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                          >smart_toy</span
                        >
                        <span class="font-title-md text-title-md font-semibold"
                          >Deep Engine Defense &amp; Refutation Analysis</span
                        >
                      </div>
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >expand_more</span
                      >
                    </button>
                    <div
                      class="hidden mt-3 p-4 rounded-xl bg-surface-container-lowest text-body-sm"
                      id="engineDefenseBlock"
                    >
                      <div
                        class="font-label-badge text-label-badge uppercase tracking-wider text-secondary mb-1"
                      >
                        Defense Line: 2... Kg6 Counter
                      </div>
                      <p class="font-body-sm text-body-sm text-on-surface-variant mb-2.5">
                        If Black boldly marches to
                        <strong class="text-on-surface">Kg6</strong> instead of retreating: White
                        immediately plays
                        <span class="font-mono text-primary font-bold">3. h4!</span>, preparing
                        <span class="font-mono text-on-surface">4. h5+ Kh6 5. Nxf7+</span> winning
                        the black queen with royal discovered fork.
                      </p>
                      <div
                        class="p-2.5 rounded bg-surface-container-low text-xs font-mono text-on-surface-variant"
                      >
                        Engine Eval: +8.4 (Depth 32 Stockfish 17) • 100% forced conversion
                      </div>
                    </div>
                  </div>
                </div>
                <!-- Bottom Action Buttons in Right Panel -->
                <div
                  class="mt-6 bg-surface-container-high/40 p-4 rounded-xl flex flex-wrap items-center justify-between gap-3"
                >
                  <button
                    class="flex-1 py-2.5 px-4 rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-title-md text-center transition-colors"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Add to Personal Repertoire
                  </button>
                  <button
                    class="py-2.5 px-4 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md font-semibold flex items-center justify-center gap-1.5 transition-colors shadow-sm"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >play_circle</span
                    >
                    Solve 5 Test Puzzles
                  </button>
                </div>
              </div>
            </div>
          </article>
          <!-- Bottom Section: Related Tactical Patterns Grid -->
          <section class="max-w-7xl mx-auto w-full pb-20">
            <div class="flex items-center justify-between mb-8">
              <div>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-primary font-bold"
                  >Tactical Curriculum</span
                >
                <h2 class="font-headline-lg text-headline-lg text-on-surface tracking-tight mt-0.5">
                  Related Tactical Patterns
                </h2>
                <p class="font-body-md text-body-md text-on-surface-variant">
                  Master these structural brother-themes to lock down complete tactical board
                  vision.
                </p>
              </div>
              <span
                class="hidden sm:flex items-center gap-1 text-primary hover:text-secondary font-title-md text-title-md font-medium transition-colors"
              >
                <span>View all 248 patterns</span>
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >arrow_forward</span
                >
              </span>
            </div>
            <!-- 4-Card Tactical Matrix Grid -->
            <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
              <!-- Card 1: Blackburne Shilling -->
              <div
                class="app-panel group flex flex-col overflow-hidden transition-colors hover:bg-surface-container-high"
              >
                <!-- Mini Board Visualization -->
                <div
                  class="relative w-full aspect-video bg-surface-container-lowest p-4 flex items-center justify-center overflow-hidden"
                >
                  <div class="w-36 h-36 grid grid-cols-8 grid-rows-8 rounded shadow">
                    <!-- Simplified mini board representation with tactical Nd4 square highlighted -->
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#9fd668] animate-pulse"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                  </div>
                  <!-- Tactical badge -->
                  <span
                    class="absolute top-2.5 left-2.5 px-2 py-0.5 rounded font-label-badge text-label-badge bg-surface-container-high text-primary"
                    >ECO: E51</span
                  >
                </div>
                <div class="p-5 flex flex-col flex-1 justify-between">
                  <div>
                    <div class="flex items-center gap-2 mb-2">
                      <span
                        class="px-2 py-0.5 rounded font-label-badge text-label-badge bg-secondary-container text-secondary font-semibold"
                        >Opening Trap</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">• 6 min</span>
                    </div>
                    <h3
                      class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                    >
                      The Blackburne Shilling Gambit Trap
                    </h3>
                    <p
                      class="font-body-sm text-body-sm text-on-surface-variant mt-1.5 line-clamp-2"
                    >
                      Pseudosacrifice the e5 pawn with 3...Nd4, ambushing White’s aggressive Nxe5
                      knight fork with Qg5.
                    </p>
                  </div>
                  <div class="mt-4 pt-3 flex items-center justify-between">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                      >Intermediate</span
                    >
                    <button
                      class="px-3 py-1.5 rounded-lg bg-surface-container-high group-hover:bg-primary group-hover:text-on-primary text-on-surface font-title-md text-body-sm transition-all flex items-center gap-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span>Study</span>
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >arrow_forward</span
                      >
                    </button>
                  </div>
                </div>
              </div>
              <!-- Card 2: Lucena Position -->
              <div
                class="app-panel group flex flex-col overflow-hidden transition-colors hover:bg-surface-container-high"
              >
                <div
                  class="relative w-full aspect-video bg-surface-container-lowest p-4 flex items-center justify-center overflow-hidden"
                >
                  <div class="w-36 h-36 grid grid-cols-8 grid-rows-8 rounded shadow">
                    <!-- Simplified Lucena bridge board -->
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#9fd668] animate-pulse"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                  </div>
                  <span
                    class="absolute top-2.5 left-2.5 px-2 py-0.5 rounded font-label-badge text-label-badge bg-surface-container-high text-primary"
                    >R+P Endgame</span
                  >
                </div>
                <div class="p-5 flex flex-col flex-1 justify-between">
                  <div>
                    <div class="flex items-center gap-2 mb-2">
                      <span
                        class="px-2 py-0.5 rounded font-label-badge text-label-badge bg-secondary-container text-secondary font-semibold"
                        >Endgame Finesse</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">• 12 min</span>
                    </div>
                    <h3
                      class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                    >
                      The Lucena Position: Building the Bridge
                    </h3>
                    <p
                      class="font-body-sm text-body-sm text-on-surface-variant mt-1.5 line-clamp-2"
                    >
                      The foundational rook endgame technique. Learn to lift the rook to the 4th
                      rank and shield against checks.
                    </p>
                  </div>
                  <div class="mt-4 pt-3 flex items-center justify-between">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-error font-semibold"
                      >Advanced</span
                    >
                    <button
                      class="px-3 py-1.5 rounded-lg bg-surface-container-high group-hover:bg-primary group-hover:text-on-primary text-on-surface font-title-md text-body-sm transition-all flex items-center gap-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span>Study</span>
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >arrow_forward</span
                      >
                    </button>
                  </div>
                </div>
              </div>
              <!-- Card 3: Smothered Mate -->
              <div
                class="app-panel group flex flex-col overflow-hidden transition-colors hover:bg-surface-container-high"
              >
                <div
                  class="relative w-full aspect-video bg-surface-container-lowest p-4 flex items-center justify-center overflow-hidden"
                >
                  <div class="w-36 h-36 grid grid-cols-8 grid-rows-8 rounded shadow">
                    <!-- Simplified Smothered Mate Board -->
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#9fd668] animate-pulse"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                  </div>
                  <span
                    class="absolute top-2.5 left-2.5 px-2 py-0.5 rounded font-label-badge text-label-badge bg-surface-container-high text-primary"
                    >Qg8+ Force</span
                  >
                </div>
                <div class="p-5 flex flex-col flex-1 justify-between">
                  <div>
                    <div class="flex items-center gap-2 mb-2">
                      <span
                        class="px-2 py-0.5 rounded font-label-badge text-label-badge bg-secondary-container text-secondary font-semibold"
                        >Checkmate Pattern</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">• 4 min</span>
                    </div>
                    <h3
                      class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                    >
                      Smothered Mate with Queen Sacrifice
                    </h3>
                    <p
                      class="font-body-sm text-body-sm text-on-surface-variant mt-1.5 line-clamp-2"
                    >
                      Trap the opposing king behind its own loyal pieces using Qg8+ followed by the
                      lethal Nf7# dagger.
                    </p>
                  </div>
                  <div class="mt-4 pt-3 flex items-center justify-between">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-secondary font-semibold"
                      >Beginner</span
                    >
                    <button
                      class="px-3 py-1.5 rounded-lg bg-surface-container-high group-hover:bg-primary group-hover:text-on-primary text-on-surface font-title-md text-body-sm transition-all flex items-center gap-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span>Study</span>
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >arrow_forward</span
                      >
                    </button>
                  </div>
                </div>
              </div>
              <!-- Card 4: Fried Liver Attack -->
              <div
                class="app-panel group flex flex-col overflow-hidden transition-colors hover:bg-surface-container-high"
              >
                <div
                  class="relative w-full aspect-video bg-surface-container-lowest p-4 flex items-center justify-center overflow-hidden"
                >
                  <div class="w-36 h-36 grid grid-cols-8 grid-rows-8 rounded shadow">
                    <!-- Simplified Fried Liver Board -->
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#9fd668] animate-pulse"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                    <div class="bg-[#293d25]"></div>
                    <div class="bg-[#a4bd87]"></div>
                  </div>
                  <span
                    class="absolute top-2.5 left-2.5 px-2 py-0.5 rounded font-label-badge text-label-badge bg-surface-container-high text-primary"
                    >ECO: C57</span
                  >
                </div>
                <div class="p-5 flex flex-col flex-1 justify-between">
                  <div>
                    <div class="flex items-center gap-2 mb-2">
                      <span
                        class="px-2 py-0.5 rounded font-label-badge text-label-badge bg-secondary-container text-secondary font-semibold"
                        >Opening Trap</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">• 9 min</span>
                    </div>
                    <h3
                      class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                    >
                      The Fried Liver Attack &amp; Knight Sacrifice
                    </h3>
                    <p
                      class="font-body-sm text-body-sm text-on-surface-variant mt-1.5 line-clamp-2"
                    >
                      Sacrifice the knight on f7 in the Two Knights Defense, pulling the exposed
                      Black king into the fatal crossfire.
                    </p>
                  </div>
                  <div class="mt-4 pt-3 flex items-center justify-between">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                      >Intermediate</span
                    >
                    <button
                      class="px-3 py-1.5 rounded-lg bg-surface-container-high group-hover:bg-primary group-hover:text-on-primary text-on-surface font-title-md text-body-sm transition-all flex items-center gap-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span>Study</span>
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >arrow_forward</span
                      >
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
