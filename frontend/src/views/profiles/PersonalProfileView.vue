<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <div class="w-full px-margin-desktop py-space-xl space-y-space-xl">
          <!-- Player Header & Season Rank Bento -->
          <section class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop items-stretch">
            <!-- Player Identity Card -->
            <div
              class="lg:col-span-8 bg-surface-container rounded-xl p-space-lg shadow-md relative overflow-hidden flex flex-col justify-between gap-space-lg"
            >
              <div
                class="absolute -top-24 -right-24 w-64 h-64 rounded-full bg-primary/5 blur-3xl pointer-events-none"
              ></div>
              <div
                class="flex flex-col md:flex-row items-start md:items-center justify-between gap-space-lg relative z-10"
              >
                <div class="flex items-center gap-space-lg min-w-0">
                  <div class="relative shrink-0">
                    <img
                      class="w-24 h-24 rounded-xl object-cover shadow-lg bg-surface-container-high"
                      data-alt="Editorial studio portrait of a focused young chess player in a dark charcoal minimalist sweater, subtle warm rim lighting against a deep obsidian background, calm analytical expression, high contrast monochrome with subtle verdant ambient bounce light, crisp photography."
                      src="/images/1378dbd8b8ea.webp"
                      alt=""
                    />
                    <div
                      class="absolute -bottom-2 -right-2 bg-primary text-on-primary px-space-sm py-0.5 rounded-full font-label-badge text-label-badge uppercase tracking-wider shadow-sm flex items-center gap-1"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-on-primary"></span>
                      Online
                    </div>
                  </div>
                  <div class="min-w-0 space-y-space-xs">
                    <div class="flex flex-wrap items-center gap-space-sm">
                      <h1 class="app-page-title truncate">
                        Alex Rivera
                      </h1>
                      <span
                        class="bg-secondary-container text-on-secondary-container px-space-sm py-0.5 rounded font-label-badge text-label-badge uppercase tracking-wider"
                        >Club Captain</span
                      >
                    </div>
                    <div
                      class="flex flex-wrap items-center gap-space-md text-on-surface-variant font-body-md text-body-md"
                    >
                      <span class="text-primary font-label-numeric-md text-label-numeric-md"
                        >@alex_rivera</span
                      >
                      <span class="text-outline">•</span>
                      <span
                        class="flex items-center gap-1.5 text-on-surface-variant font-body-sm text-body-sm"
                      >
                        <span
                          class="material-symbols-outlined text-[16px] text-outline"
                          aria-hidden="true"
                          >calendar_today</span
                        >
                        Member since Oct 2023
                      </span>
                    </div>
                  </div>
                </div>
                <div class="flex flex-wrap items-center gap-space-sm shrink-0">
                  <button
                    class="bg-primary text-on-primary hover:bg-primary-fixed-dim px-space-md py-space-sm rounded-lg font-title-md text-body-md transition-colors flex items-center gap-1.5 shadow-sm"
                    id="edit-profile-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >edit</span
                    >
                    Edit Profile
                  </button>
                  <RouterLink
                    class="bg-surface-container-high text-on-surface hover:bg-surface-bright px-space-md py-space-sm rounded-lg font-title-md text-body-md transition-colors flex items-center gap-1.5"
                    to="/settings"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >settings</span
                    >
                    Settings
                  </RouterLink>
                  <span
                    class="bg-surface-container-low text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high px-space-md py-space-sm rounded-lg font-title-md text-body-md transition-colors flex items-center gap-1.5"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >visibility</span
                    >
                    View Public Profile
                  </span>
                </div>
              </div>
              <div class="relative z-10 bg-surface-container-low rounded-lg p-space-md">
                <p class="font-body-md text-body-md text-on-surface-variant leading-relaxed">
                  Tactical endgame specialist and weekend Swiss tournament regular. Focusing on
                  Catalan structures with White and Najdorf counterplay with Black. Always open for
                  10+0 rapid training matches.
                </p>
              </div>
            </div>
            <!-- Season Ranking & Points Summary Card -->
            <div
              class="lg:col-span-4 bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col justify-between gap-space-lg relative overflow-hidden"
            >
              <div class="flex items-center justify-between">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Season 04 Standing</span
                >
                <span
                  class="bg-primary/15 text-primary px-space-sm py-0.5 rounded-full font-label-badge text-label-badge uppercase tracking-wider"
                  >Active League</span
                >
              </div>
              <div class="grid grid-cols-2 gap-space-md">
                <div
                  class="bg-surface-container-low rounded-lg p-space-md flex flex-col justify-between"
                >
                  <span class="font-body-sm text-body-sm text-on-surface-variant">Season Rank</span>
                  <div class="flex items-baseline gap-1 mt-space-xs">
                    <span class="font-display-lg text-display-lg text-on-surface">#4</span>
                    <span class="font-label-badge text-label-badge text-primary flex items-center">
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >arrow_upward</span
                      >2
                    </span>
                  </div>
                </div>
                <div
                  class="bg-surface-container-low rounded-lg p-space-md flex flex-col justify-between"
                >
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Season Points</span
                  >
                  <div class="flex items-baseline gap-1.5 mt-space-xs">
                    <span class="font-display-lg text-display-lg text-primary">320</span>
                    <span class="font-label-badge text-label-badge text-outline uppercase"
                      >PTS</span
                    >
                  </div>
                </div>
              </div>
              <div
                class="bg-surface-container-lowest rounded-lg p-space-sm flex items-center justify-between text-center"
              >
                <div class="flex-1 py-space-xs">
                  <div class="font-label-numeric-md text-label-numeric-md text-primary">+20</div>
                  <div class="font-label-badge text-label-badge text-outline uppercase">Win</div>
                </div>
                <div class="w-px h-6 bg-surface-container-high"></div>
                <div class="flex-1 py-space-xs">
                  <div class="font-label-numeric-md text-label-numeric-md text-tertiary">+10</div>
                  <div class="font-label-badge text-label-badge text-outline uppercase">Draw</div>
                </div>
                <div class="w-px h-6 bg-surface-container-high"></div>
                <div class="flex-1 py-space-xs">
                  <div class="font-label-numeric-md text-label-numeric-md text-on-surface-variant">
                    0
                  </div>
                  <div class="font-label-badge text-label-badge text-outline uppercase">Loss</div>
                </div>
              </div>
            </div>
          </section>
          <!-- Points History Chart & Previous Seasons -->
          <section class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop">
            <!-- Points History Chart -->
            <div
              class="lg:col-span-8 bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col justify-between gap-space-lg"
            >
              <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md">
                <div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Performance Trajectory</span
                  >
                  <h2 class="font-headline-md text-headline-md text-on-surface mt-0.5">
                    Points History
                  </h2>
                </div>
                <div
                  class="flex items-center gap-space-xs bg-surface-container-low p-1 rounded-lg self-start"
                >
                  <button
                    class="range-btn bg-surface-container-high text-primary px-space-md py-1 rounded font-label-badge text-label-badge uppercase tracking-wider transition-colors"
                    data-range="season"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    This Season
                  </button>
                  <button
                    class="range-btn text-on-surface-variant hover:text-on-surface px-space-md py-1 rounded font-label-badge text-label-badge uppercase tracking-wider transition-colors"
                    data-range="30d"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Last 30 Days
                  </button>
                </div>
              </div>
              <!-- Inline SVG Chart -->
              <div
                class="w-full h-56 bg-surface-container-low rounded-lg p-space-md flex flex-col justify-between relative"
              >
                <svg
                  class="w-full h-full overflow-visible text-primary"
                  preserveAspectRatio="none"
                  viewBox="0 0 600 160"
                >
                  <defs>
                    <linearGradient id="pointsGradient" x1="0" x2="0" y1="0" y2="1">
                      <stop offset="0%" stop-color="currentColor" stop-opacity="0.28"></stop>
                      <stop offset="100%" stop-color="currentColor" stop-opacity="0.0"></stop>
                    </linearGradient>
                  </defs>
                  <!-- Subtle horizontal guide lines -->
                  <line
                    stroke="currentColor"
                    stroke-dasharray="4 4"
                    stroke-opacity="0.08"
                    x1="0"
                    x2="600"
                    y1="30"
                    y2="30"
                  ></line>
                  <line
                    stroke="currentColor"
                    stroke-dasharray="4 4"
                    stroke-opacity="0.08"
                    x1="0"
                    x2="600"
                    y1="80"
                    y2="80"
                  ></line>
                  <line
                    stroke="currentColor"
                    stroke-dasharray="4 4"
                    stroke-opacity="0.08"
                    x1="0"
                    x2="600"
                    y1="130"
                    y2="130"
                  ></line>
                  <!-- Area fill -->
                  <path
                    d="M 0 140 L 85 125 L 170 110 L 255 110 L 340 85 L 425 65 L 510 45 L 600 20 L 600 160 L 0 160 Z"
                    fill="url(#pointsGradient)"
                    id="chart-area"
                  ></path>
                  <!-- Line -->
                  <path
                    d="M 0 140 L 85 125 L 170 110 L 255 110 L 340 85 L 425 65 L 510 45 L 600 20"
                    fill="none"
                    id="chart-line"
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="3"
                  ></path>
                  <!-- Data points -->
                  <circle cx="0" cy="140" fill="currentColor" r="4"></circle>
                  <circle cx="85" cy="125" fill="currentColor" r="4"></circle>
                  <circle cx="170" cy="110" fill="currentColor" r="4"></circle>
                  <circle cx="255" cy="110" fill="currentColor" r="4"></circle>
                  <circle cx="340" cy="85" fill="currentColor" r="4"></circle>
                  <circle cx="425" cy="65" fill="currentColor" r="4"></circle>
                  <circle cx="510" cy="45" fill="currentColor" r="4"></circle>
                  <circle cx="600" cy="20" fill="currentColor" r="5"></circle>
                </svg>
                <div
                  class="flex items-center justify-between text-outline font-label-badge text-label-badge pt-space-sm"
                >
                  <span>Wk 1 (40)</span>
                  <span>Wk 2 (80)</span>
                  <span>Wk 3 (120)</span>
                  <span>Wk 4 (120)</span>
                  <span>Wk 5 (180)</span>
                  <span>Wk 6 (230)</span>
                  <span>Wk 7 (270)</span>
                  <span class="text-primary">Wk 8 (320)</span>
                </div>
              </div>
            </div>
            <!-- Previous Seasons Summary -->
            <div
              class="lg:col-span-4 bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col justify-between gap-space-md"
            >
              <div>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Archive</span
                >
                <h2 class="font-headline-md text-headline-md text-on-surface mt-0.5">
                  Previous Seasons
                </h2>
              </div>
              <div class="space-y-space-sm flex-1 flex flex-col justify-center">
                <div
                  class="bg-surface-container-low hover:bg-surface-container-high transition-colors rounded-lg p-space-md flex items-center justify-between"
                >
                  <div>
                    <div class="font-title-md text-title-md text-on-surface">Season 03</div>
                    <div class="font-body-sm text-body-sm text-on-surface-variant">
                      Winter Classical
                    </div>
                  </div>
                  <div class="text-right">
                    <div class="font-label-numeric-md text-label-numeric-md text-primary">
                      Rank #7
                    </div>
                    <div class="font-body-sm text-body-sm text-outline">290 PTS</div>
                  </div>
                </div>
                <div
                  class="bg-surface-container-low hover:bg-surface-container-high transition-colors rounded-lg p-space-md flex items-center justify-between"
                >
                  <div>
                    <div class="font-title-md text-title-md text-on-surface">Season 02</div>
                    <div class="font-body-sm text-body-sm text-on-surface-variant">
                      Autumn Rapid
                    </div>
                  </div>
                  <div class="text-right">
                    <div class="font-label-numeric-md text-label-numeric-md text-on-surface">
                      Rank #12
                    </div>
                    <div class="font-body-sm text-body-sm text-outline">240 PTS</div>
                  </div>
                </div>
                <div
                  class="bg-surface-container-low hover:bg-surface-container-high transition-colors rounded-lg p-space-md flex items-center justify-between"
                >
                  <div>
                    <div class="font-title-md text-title-md text-on-surface">Season 01</div>
                    <div class="font-body-sm text-body-sm text-on-surface-variant">
                      Inaugural Swiss
                    </div>
                  </div>
                  <div class="text-right">
                    <div class="font-label-numeric-md text-label-numeric-md text-on-surface">
                      Rank #19
                    </div>
                    <div class="font-body-sm text-body-sm text-outline">180 PTS</div>
                  </div>
                </div>
              </div>
            </div>
          </section>
          <!-- Recent Match History & Achievements -->
          <section class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop items-start">
            <!-- Recent Match History -->
            <div
              class="lg:col-span-8 bg-surface-container rounded-xl p-space-lg shadow-md space-y-space-lg"
            >
              <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md">
                <div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Verified Club Games</span
                  >
                  <h2 class="font-headline-md text-headline-md text-on-surface mt-0.5">
                    Recent Match History
                  </h2>
                </div>
                <div
                  class="flex items-center gap-space-xs bg-surface-container-low p-1 rounded-lg self-start"
                >
                  <button
                    class="match-filter-btn bg-surface-container-high text-primary px-space-sm py-1 rounded font-label-badge text-label-badge uppercase transition-colors"
                    data-filter="all"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    All
                  </button>
                  <button
                    class="match-filter-btn text-on-surface-variant hover:text-on-surface px-space-sm py-1 rounded font-label-badge text-label-badge uppercase transition-colors"
                    data-filter="win"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Wins
                  </button>
                  <button
                    class="match-filter-btn text-on-surface-variant hover:text-on-surface px-space-sm py-1 rounded font-label-badge text-label-badge uppercase transition-colors"
                    data-filter="draw"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Draws
                  </button>
                  <button
                    class="match-filter-btn text-on-surface-variant hover:text-on-surface px-space-sm py-1 rounded font-label-badge text-label-badge uppercase transition-colors"
                    data-filter="loss"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Losses
                  </button>
                </div>
              </div>
              <div class="space-y-space-sm" id="match-list">
                <!-- Match Card 1: Win as White -->
                <div
                  class="match-card bg-surface-container-low hover:bg-surface-container-high transition-colors rounded-xl p-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                  data-result="win"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div class="flex items-center gap-2 shrink-0">
                      <span
                        class="w-4 h-4 rounded-sm bg-on-surface shadow-sm"
                        title="Played White"
                      ></span>
                      <span class="font-label-badge text-label-badge text-outline uppercase"
                        >VS</span
                      >
                      <span
                        class="w-4 h-4 rounded-sm bg-surface-container-lowest shadow-sm"
                        title="Opponent Black"
                      ></span>
                    </div>
                    <div class="min-w-0">
                      <div class="flex items-center gap-space-sm">
                        <span class="font-title-md text-title-md text-on-surface truncate"
                          >Alex Rivera</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">vs</span>
                        <span class="font-title-md text-title-md text-on-surface-variant truncate"
                          >Elena Vance</span
                        >
                      </div>
                      <div
                        class="flex items-center gap-space-sm font-body-sm text-body-sm text-outline mt-0.5"
                      >
                        <span class="flex items-center gap-1">
                          <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                            >schedule</span
                          >
                          10+0 Rapid
                        </span>
                        <span>•</span>
                        <span>May 14, 2025</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >1 - 0</span
                    >
                    <span
                      class="bg-primary/15 text-primary px-space-md py-1 rounded-full font-label-numeric-md text-label-numeric-md"
                      >+20 PTS</span
                    >
                  </div>
                </div>
                <!-- Match Card 2: Draw as Black -->
                <div
                  class="match-card bg-surface-container-low hover:bg-surface-container-high transition-colors rounded-xl p-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                  data-result="draw"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div class="flex items-center gap-2 shrink-0">
                      <span
                        class="w-4 h-4 rounded-sm bg-surface-container-lowest shadow-sm"
                        title="Played Black"
                      ></span>
                      <span class="font-label-badge text-label-badge text-outline uppercase"
                        >VS</span
                      >
                      <span
                        class="w-4 h-4 rounded-sm bg-on-surface shadow-sm"
                        title="Opponent White"
                      ></span>
                    </div>
                    <div class="min-w-0">
                      <div class="flex items-center gap-space-sm">
                        <span class="font-title-md text-title-md text-on-surface truncate"
                          >Alex Rivera</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">vs</span>
                        <span class="font-title-md text-title-md text-on-surface-variant truncate"
                          >Marcus Chen</span
                        >
                      </div>
                      <div
                        class="flex items-center gap-space-sm font-body-sm text-body-sm text-outline mt-0.5"
                      >
                        <span class="flex items-center gap-1">
                          <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                            >schedule</span
                          >
                          15+10 Classical
                        </span>
                        <span>•</span>
                        <span>May 12, 2025</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >½ - ½</span
                    >
                    <span
                      class="bg-tertiary/15 text-tertiary px-space-md py-1 rounded-full font-label-numeric-md text-label-numeric-md"
                      >+10 PTS</span
                    >
                  </div>
                </div>
                <!-- Match Card 3: Win as White -->
                <div
                  class="match-card bg-surface-container-low hover:bg-surface-container-high transition-colors rounded-xl p-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                  data-result="win"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div class="flex items-center gap-2 shrink-0">
                      <span
                        class="w-4 h-4 rounded-sm bg-on-surface shadow-sm"
                        title="Played White"
                      ></span>
                      <span class="font-label-badge text-label-badge text-outline uppercase"
                        >VS</span
                      >
                      <span
                        class="w-4 h-4 rounded-sm bg-surface-container-lowest shadow-sm"
                        title="Opponent Black"
                      ></span>
                    </div>
                    <div class="min-w-0">
                      <div class="flex items-center gap-space-sm">
                        <span class="font-title-md text-title-md text-on-surface truncate"
                          >Alex Rivera</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">vs</span>
                        <span class="font-title-md text-title-md text-on-surface-variant truncate"
                          >Sofia Alverez</span
                        >
                      </div>
                      <div
                        class="flex items-center gap-space-sm font-body-sm text-body-sm text-outline mt-0.5"
                      >
                        <span class="flex items-center gap-1">
                          <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                            >schedule</span
                          >
                          5+3 Blitz
                        </span>
                        <span>•</span>
                        <span>May 10, 2025</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >1 - 0</span
                    >
                    <span
                      class="bg-primary/15 text-primary px-space-md py-1 rounded-full font-label-numeric-md text-label-numeric-md"
                      >+20 PTS</span
                    >
                  </div>
                </div>
                <!-- Match Card 4: Loss as Black -->
                <div
                  class="match-card bg-surface-container-low hover:bg-surface-container-high transition-colors rounded-xl p-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                  data-result="loss"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div class="flex items-center gap-2 shrink-0">
                      <span
                        class="w-4 h-4 rounded-sm bg-surface-container-lowest shadow-sm"
                        title="Played Black"
                      ></span>
                      <span class="font-label-badge text-label-badge text-outline uppercase"
                        >VS</span
                      >
                      <span
                        class="w-4 h-4 rounded-sm bg-on-surface shadow-sm"
                        title="Opponent White"
                      ></span>
                    </div>
                    <div class="min-w-0">
                      <div class="flex items-center gap-space-sm">
                        <span class="font-title-md text-title-md text-on-surface truncate"
                          >Alex Rivera</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">vs</span>
                        <span class="font-title-md text-title-md text-on-surface-variant truncate"
                          >Viktor Koval</span
                        >
                      </div>
                      <div
                        class="flex items-center gap-space-sm font-body-sm text-body-sm text-outline mt-0.5"
                      >
                        <span class="flex items-center gap-1">
                          <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                            >schedule</span
                          >
                          10+0 Rapid
                        </span>
                        <span>•</span>
                        <span>May 08, 2025</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >0 - 1</span
                    >
                    <span
                      class="bg-error-container/40 text-error px-space-md py-1 rounded-full font-label-numeric-md text-label-numeric-md"
                      >0 PTS</span
                    >
                  </div>
                </div>
              </div>
            </div>
            <!-- Achievements Badges -->
            <div
              class="lg:col-span-4 bg-surface-container rounded-xl p-space-lg shadow-md space-y-space-lg"
            >
              <div class="flex items-center justify-between">
                <div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Milestones</span
                  >
                  <h2 class="font-headline-md text-headline-md text-on-surface mt-0.5">
                    Achievements
                  </h2>
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-primary">4 / 12</span>
              </div>
              <div class="grid grid-cols-2 gap-space-md">
                <div
                  class="bg-surface-container-low rounded-xl p-space-md flex flex-col items-center text-center gap-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div
                    class="w-12 h-12 rounded-full bg-primary/15 text-primary flex items-center justify-center"
                  >
                    <span
                      class="material-symbols-outlined text-[24px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >local_fire_department</span
                    >
                  </div>
                  <div>
                    <div class="font-title-md text-body-md text-on-surface">5-Win Streak</div>
                    <div class="font-body-sm text-body-sm text-outline">Season 04</div>
                  </div>
                </div>
                <div
                  class="bg-surface-container-low rounded-xl p-space-md flex flex-col items-center text-center gap-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div
                    class="w-12 h-12 rounded-full bg-primary/15 text-primary flex items-center justify-center"
                  >
                    <span
                      class="material-symbols-outlined text-[24px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >emoji_events</span
                    >
                  </div>
                  <div>
                    <div class="font-title-md text-body-md text-on-surface">Top 5 Finish</div>
                    <div class="font-body-sm text-body-sm text-outline">Club Swiss</div>
                  </div>
                </div>
                <div
                  class="bg-surface-container-low rounded-xl p-space-md flex flex-col items-center text-center gap-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div
                    class="w-12 h-12 rounded-full bg-tertiary/15 text-tertiary flex items-center justify-center"
                  >
                    <span
                      class="material-symbols-outlined text-[24px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >bolt</span
                    >
                  </div>
                  <div>
                    <div class="font-title-md text-body-md text-on-surface">Blitz Tactician</div>
                    <div class="font-body-sm text-body-sm text-outline">25+ Blitz Wins</div>
                  </div>
                </div>
                <div
                  class="bg-surface-container-low rounded-xl p-space-md flex flex-col items-center text-center gap-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div
                    class="w-12 h-12 rounded-full bg-secondary-container text-on-secondary-container flex items-center justify-center"
                  >
                    <span
                      class="material-symbols-outlined text-[24px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >verified</span
                    >
                  </div>
                  <div>
                    <div class="font-title-md text-body-md text-on-surface">Founding Member</div>
                    <div class="font-body-sm text-body-sm text-outline">Joined 2023</div>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </div>
        <!-- Interactive Script for Match Filtering & Chart Range -->
      </div>
    </main>
  </ClubLayout>
</template>
