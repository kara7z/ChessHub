<script setup lang="ts">
import CompactLayout from '../../components/layout/CompactLayout.vue'
</script>

<template>
  <CompactLayout>
    <main class="flex-1 flex flex-col relative w-full pt-16 pb-space-xl bg-background">
      <div
        class="flex w-full flex-col gap-space-md px-margin py-space-sm lg:grid lg:grid-cols-[minmax(0,3fr)_minmax(0,2fr)] lg:items-center lg:gap-space-lg lg:px-margin-desktop lg:pt-space-xl"
      >
        <!-- Page Header & Filter Section -->
        <div class="flex flex-col gap-space-sm lg:col-span-2">
          <div class="flex items-start justify-between gap-space-sm">
            <div class="min-w-0">
              <h1
                class="app-page-title"
              >
                Club Leaderboard
              </h1>
              <p class="font-body-sm text-body-sm text-on-surface-variant mt-0.5">
                Official season rankings calculated by competitive match results.
              </p>
            </div>
            <div class="relative shrink-0">
              <button
                aria-expanded="false"
                aria-haspopup="listbox"
                class="flex items-center gap-space-xs bg-surface-container-high text-on-surface px-3 py-1.5 rounded-lg shadow-sm font-label-numeric-md text-label-numeric-md hover:bg-surface-variant transition-colors"
                id="season-selector-btn"
                type="button"
                v-preview-disclosure="'season-dropdown'"
              >
                <span
                  class="material-symbols-outlined text-primary text-[18px]"
                  style="font-variation-settings: 'FILL' 1"
                  aria-hidden="true"
                  >calendar_today</span
                >
                <span class="text-on-surface text-[13px] font-medium" id="current-season-label"
                  >Spring League 2025</span
                >
                <span
                  class="material-symbols-outlined text-on-surface-variant text-[18px]"
                  aria-hidden="true"
                  >expand_more</span
                >
              </button>
              <!-- Dropdown Menu -->
              <div
                class="hidden absolute right-0 mt-1 w-56 bg-surface-container-highest rounded-lg shadow-xl py-1 z-30 preview-disclosure"
                id="season-dropdown"
              >
                <button
                  class="season-option w-full text-left px-3 py-2 text-[13px] font-body-md text-primary flex items-center justify-between hover:bg-surface-container-high transition-colors"
                  data-season="Spring League 2025 (Active)"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>Spring League 2025 (Active)</span>
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >check</span
                  >
                </button>
                <button
                  class="season-option w-full text-left px-3 py-2 text-[13px] font-body-md text-on-surface hover:bg-surface-container-high transition-colors"
                  data-season="Winter Championship 2024"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>Winter Championship 2024</span>
                </button>
                <button
                  class="season-option w-full text-left px-3 py-2 text-[13px] font-body-md text-on-surface hover:bg-surface-container-high transition-colors"
                  data-season="All-Time"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>All-Time Rankings</span>
                </button>
              </div>
            </div>
          </div>
        </div>
        <!-- Top 3 Podium Cards (Visual Delight & Hierarchy) -->
        <div class="grid grid-cols-3 gap-space-xs items-end pt-2 lg:col-span-2 lg:gap-space-md lg:[&_img]:size-16">
          <!-- Rank 2: Silver -->
          <div
            class="app-panel relative flex h-[184px] flex-col justify-between overflow-hidden p-space-sm lg:h-[216px] lg:p-space-md"
          >
            <div
              class="absolute -top-10 -right-10 w-24 h-24 rounded-full bg-slate-300/10 blur-xl pointer-events-none"
            ></div>
            <div class="flex flex-col items-center text-center">
              <div class="relative mb-1.5">
                <img
                  class="w-12 h-12 rounded-full object-cover shadow-md"
                  data-alt="Portrait photo of a thoughtful Middle Eastern chess master man wearing a casual dark blazer in ambient moody tournament room lighting with soft emerald reflections."
                  src="/images/aabf90635c8e.webp"
                  alt=""
                />
                <div
                  class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-slate-300 text-slate-900 font-label-badge text-label-badge flex items-center justify-center font-bold shadow"
                >
                  2
                </div>
              </div>
              <span class="font-title-md text-on-surface text-[13px] font-bold truncate max-w-full"
                >Youssef M.</span
              >
              <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px]"
                >12W-4D-4L</span
              >
            </div>
            <div class="bg-surface-container-high rounded-lg p-1 text-center">
              <span class="font-label-numeric-md text-label-numeric-md text-secondary font-bold"
                >280 <span class="text-[10px] text-on-surface-variant font-normal">pts</span></span
              >
              <div class="font-label-badge text-label-badge text-on-surface-variant mt-0.5">
                60% Win Rate
              </div>
            </div>
          </div>
          <!-- Rank 1: Gold Trim (Elevated Center) -->
          <div
            class="flex flex-col bg-surface-container-high rounded-xl p-space-sm relative overflow-hidden shadow-md h-[208px] justify-between lg:h-[244px] lg:p-space-md"
          >
            <div class="absolute top-0 inset-x-0 h-1 bg-amber-400"></div>
            <div
              class="absolute -top-6 -right-6 w-28 h-28 rounded-full bg-amber-400/15 blur-xl pointer-events-none"
            ></div>
            <div class="flex items-center justify-center -mt-1">
              <span
                class="material-symbols-outlined text-amber-400 text-[18px]"
                style="font-variation-settings: 'FILL' 1"
                aria-hidden="true"
                >military_tech</span
              >
            </div>
            <div class="flex flex-col items-center text-center -mt-1">
              <div class="relative mb-1.5">
                <img
                  class="w-14 h-14 rounded-full object-cover shadow-lg"
                  data-alt="Close-up confident portrait of an Asian male chess champion with focused eyes under dramatic studio rim lighting with forest green and amber tournament ambient glow."
                  src="/images/11ca73344b9e.webp"
                  alt=""
                />
                <div
                  class="absolute -bottom-1 -right-1 w-6 h-6 rounded-full bg-amber-400 text-amber-950 font-label-badge text-label-badge flex items-center justify-center font-extrabold shadow"
                >
                  1
                </div>
              </div>
              <span class="font-title-md text-on-surface text-[14px] font-bold truncate max-w-full"
                >Adam Chen</span
              >
              <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px]"
                >15W-3D-2L</span
              >
            </div>
            <div class="bg-surface-container-highest rounded-lg p-1 text-center">
              <span class="font-label-numeric-lg text-primary text-[15px] font-bold"
                >330 <span class="text-[10px] text-on-surface-variant font-normal">pts</span></span
              >
              <div class="font-label-badge text-label-badge text-primary-fixed-dim mt-0.5">
                75% Win Rate
              </div>
            </div>
          </div>
          <!-- Rank 3: Bronze -->
          <div
            class="app-panel relative flex h-[174px] flex-col justify-between overflow-hidden p-space-sm lg:h-[216px] lg:p-space-md"
          >
            <div
              class="absolute -top-10 -right-10 w-24 h-24 rounded-full bg-amber-700/10 blur-xl pointer-events-none"
            ></div>
            <div class="flex flex-col items-center text-center">
              <div class="relative mb-1.5">
                <img
                  class="w-11 h-11 rounded-full object-cover shadow-md"
                  data-alt="Portrait of a focused young South Asian chess player in low key lighting with dark clothing and green board reflections in the background."
                  src="/images/4e180c0793a4.webp"
                  alt=""
                />
                <div
                  class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-amber-600 text-stone-950 font-label-badge text-label-badge flex items-center justify-center font-bold shadow"
                >
                  3
                </div>
              </div>
              <span class="font-title-md text-on-surface text-[13px] font-bold truncate max-w-full"
                >Omar Farooq</span
              >
              <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px]"
                >10W-5D-5L</span
              >
            </div>
            <div class="bg-surface-container-high rounded-lg p-1 text-center">
              <span class="font-label-numeric-md text-label-numeric-md text-amber-500 font-bold"
                >250 <span class="text-[10px] text-on-surface-variant font-normal">pts</span></span
              >
              <div class="font-label-badge text-label-badge text-on-surface-variant mt-0.5">
                50% Win Rate
              </div>
            </div>
          </div>
        </div>
        <!-- Points System Explainer Micro-Card -->
        <div
          class="app-panel flex items-center justify-between p-3"
        >
          <div class="flex items-center gap-2">
            <div
              class="w-7 h-7 rounded-lg bg-surface-container flex items-center justify-center text-primary"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >sports_score</span
              >
            </div>
            <div class="flex flex-col">
              <span class="font-title-md text-on-surface text-[12px] font-semibold leading-tight"
                >Match Point Valuation</span
              >
              <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px]"
                >Strict club points rules • No Elo rating applied</span
              >
            </div>
          </div>
          <div class="flex items-center gap-1.5 shrink-0">
            <span
              class="px-2 py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge"
              >Win +20</span
            >
            <span
              class="px-2 py-0.5 rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge"
              >Draw +10</span
            >
            <span
              class="px-2 py-0.5 rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge"
              >Loss 0</span
            >
          </div>
        </div>
        <!-- Search and Quick Standings Controls -->
        <div class="flex items-center gap-2">
          <div class="relative flex-1">
            <span
              class="material-symbols-outlined absolute left-3 top-1/2 -translate-y-1/2 text-on-surface-variant text-[18px]"
              aria-hidden="true"
              >search</span
            >
            <input
              class="w-full pl-9 pr-3 py-2 rounded-lg bg-surface-container-high text-on-surface placeholder:text-on-surface-variant font-body-md text-body-md shadow-inner focus:outline-none focus:bg-surface-variant transition-colors"
              id="player-search"
              placeholder="Search club member..."
              type="search"
            />
          </div>
          <button
            aria-label="Sort options"
            class="h-9 px-3 rounded-lg bg-surface-container-high text-on-surface-variant hover:text-on-surface flex items-center justify-center gap-1 font-label-badge text-label-badge transition-colors shadow-sm"
            type="button"
            disabled
          >
            <span class="material-symbols-outlined text-[16px]" aria-hidden="true">swap_vert</span>
            <span>Pts</span>
          </button>
        </div>
        <!-- User Rank Quick Anchor (Pinned Floating Banner) -->
        <div
          class="bg-gradient-to-r from-secondary-container via-surface-container-high to-surface-container rounded-xl p-space-sm flex items-center justify-between shadow-md lg:col-span-2 lg:px-space-lg"
        >
          <div class="flex items-center gap-space-sm min-w-0">
            <div
              class="w-7 h-7 rounded-full bg-primary text-on-primary font-headline-sm text-headline-sm flex items-center justify-center font-bold text-[12px] shrink-0"
            >
              4
            </div>
            <div class="min-w-0">
              <div class="flex items-center gap-1.5">
                <span class="font-title-md text-title-md text-on-surface truncate"
                  >Amine Rahmani</span
                >
                <span
                  class="bg-primary-container text-on-primary font-label-badge text-label-badge px-1.5 py-0.2 rounded-full uppercase"
                  >You</span
                >
              </div>
              <p class="font-body-sm text-body-sm text-on-surface-variant text-[11px]">
                Rank #4 of 64 • 50 pts behind 3rd podium
              </p>
            </div>
          </div>
          <div class="text-right shrink-0">
            <span
              class="font-label-numeric-lg text-label-numeric-lg text-primary leading-none block font-bold"
              >200</span
            >
            <span class="font-body-sm text-body-sm text-on-surface-variant text-[10px]"
              >TOTAL PTS</span
            >
          </div>
        </div>
        <!-- Leaderboard Table Container -->
        <div class="app-panel flex flex-col overflow-hidden lg:col-span-2 lg:[&_.grid]:px-space-lg lg:[&_.player-row]:py-space-sm">
          <!-- Table Header -->
          <div
            class="grid grid-cols-12 px-3 py-2.5 bg-surface-container-lowest font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider items-center"
          >
            <div class="col-span-2 flex items-center">Rank</div>
            <div class="col-span-5">Player</div>
            <div class="col-span-3 text-center">W / D / L</div>
            <div class="col-span-2 text-right">Pts</div>
          </div>
          <!-- Rows List -->
          <div class="flex flex-col" id="leaderboard-list">
            <!-- Row 1: Adam Chen -->
            <div
              class="player-row grid grid-cols-12 px-3 py-2.5 items-center hover:bg-surface-container-high transition-colors"
            >
              <div class="col-span-2 flex items-center gap-1.5">
                <span
                  class="w-6 h-6 rounded-md bg-amber-400/20 text-amber-400 font-label-badge text-label-badge font-bold flex items-center justify-center"
                  >1</span
                >
              </div>
              <div class="col-span-5 flex items-center gap-2 min-w-0 pr-1">
                <img
                  class="w-7 h-7 rounded-full object-cover shrink-0"
                  data-alt="Profile miniature of Adam Chen chess champion with sharp focus and dark green competitive background."
                  src="/images/49125ed5d0c4.webp"
                  alt=""
                />
                <div class="min-w-0">
                  <span
                    class="player-name font-title-md text-title-md text-on-surface block truncate text-[13px]"
                    >Adam Chen</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px] block"
                    >20 gp • 75%</span
                  >
                </div>
              </div>
              <div
                class="col-span-3 text-center font-label-numeric-md text-label-numeric-md text-on-surface-variant text-[12px]"
              >
                <span class="text-secondary font-medium">15</span> / 3 /
                <span class="text-error font-medium">2</span>
              </div>
              <div
                class="col-span-2 text-right font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
              >
                330
              </div>
            </div>
            <!-- Row 2: Youssef Mansour -->
            <div
              class="player-row grid grid-cols-12 px-3 py-2.5 items-center bg-surface-container-low/40 hover:bg-surface-container-high transition-colors"
            >
              <div class="col-span-2 flex items-center gap-1.5">
                <span
                  class="w-6 h-6 rounded-md bg-slate-300/20 text-slate-300 font-label-badge text-label-badge font-bold flex items-center justify-center"
                  >2</span
                >
              </div>
              <div class="col-span-5 flex items-center gap-2 min-w-0 pr-1">
                <img
                  class="w-7 h-7 rounded-full object-cover shrink-0"
                  data-alt="Profile picture of Youssef Mansour, skilled chess grandmaster with focused contemplative demeanor in dark room."
                  src="/images/a35a67f63007.webp"
                  alt=""
                />
                <div class="min-w-0">
                  <span
                    class="player-name font-title-md text-title-md text-on-surface block truncate text-[13px]"
                    >Youssef Mansour</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px] block"
                    >20 gp • 60%</span
                  >
                </div>
              </div>
              <div
                class="col-span-3 text-center font-label-numeric-md text-label-numeric-md text-on-surface-variant text-[12px]"
              >
                <span class="text-secondary font-medium">12</span> / 4 /
                <span class="text-error font-medium">4</span>
              </div>
              <div
                class="col-span-2 text-right font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
              >
                280
              </div>
            </div>
            <!-- Row 3: Omar Farooq -->
            <div
              class="player-row grid grid-cols-12 px-3 py-2.5 items-center hover:bg-surface-container-high transition-colors"
            >
              <div class="col-span-2 flex items-center gap-1.5">
                <span
                  class="w-6 h-6 rounded-md bg-amber-700/20 text-amber-500 font-label-badge text-label-badge font-bold flex items-center justify-center"
                  >3</span
                >
              </div>
              <div class="col-span-5 flex items-center gap-2 min-w-0 pr-1">
                <img
                  class="w-7 h-7 rounded-full object-cover shrink-0"
                  data-alt="Profile avatar photo of Omar Farooq chess enthusiast with disciplined gaze and cinematic low contrast tone."
                  src="/images/d52649d14bfe.webp"
                  alt=""
                />
                <div class="min-w-0">
                  <span
                    class="player-name font-title-md text-title-md text-on-surface block truncate text-[13px]"
                    >Omar Farooq</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px] block"
                    >20 gp • 50%</span
                  >
                </div>
              </div>
              <div
                class="col-span-3 text-center font-label-numeric-md text-label-numeric-md text-on-surface-variant text-[12px]"
              >
                <span class="text-secondary font-medium">10</span> / 5 /
                <span class="text-error font-medium">5</span>
              </div>
              <div
                class="col-span-2 text-right font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
              >
                250
              </div>
            </div>
            <!-- Row 4: Highlighted Current User (Amine Rahmani) -->
            <div
              class="player-row grid grid-cols-12 px-3 py-2.5 items-center bg-secondary-container/40 relative shadow-[inset_3px_0_0_0_#9fd668] hover:bg-secondary-container/60 transition-colors"
            >
              <div class="col-span-2 flex items-center gap-1.5">
                <span
                  class="w-6 h-6 rounded-md bg-primary-container text-on-primary font-label-badge text-label-badge font-bold flex items-center justify-center shadow-sm"
                  >4</span
                >
              </div>
              <div class="col-span-5 flex items-center gap-2 min-w-0 pr-1">
                <div
                  class="w-7 h-7 rounded-full bg-primary flex items-center justify-center text-on-primary font-bold text-xs shrink-0 shadow-sm"
                >
                  AR
                </div>
                <div class="min-w-0">
                  <div class="flex items-center gap-1">
                    <span
                      class="player-name font-title-md text-title-md text-on-surface block truncate text-[13px] font-bold"
                      >Amine Rahmani</span
                    >
                    <span
                      class="text-[10px] bg-primary text-on-primary px-1 rounded-sm font-semibold"
                      >YOU</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-primary-fixed-dim text-[11px] block"
                    >20 gp • 40%</span
                  >
                </div>
              </div>
              <div
                class="col-span-3 text-center font-label-numeric-md text-label-numeric-md text-on-surface-variant text-[12px]"
              >
                <span class="text-secondary font-medium">8</span> / 4 /
                <span class="text-error font-medium">8</span>
              </div>
              <div
                class="col-span-2 text-right font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
              >
                200
              </div>
            </div>
            <!-- Row 5: Hamza Tazi -->
            <div
              class="player-row grid grid-cols-12 px-3 py-2.5 items-center bg-surface-container-low/40 hover:bg-surface-container-high transition-colors"
            >
              <div class="col-span-2 flex items-center gap-1.5">
                <span
                  class="w-6 h-6 rounded-md bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-semibold flex items-center justify-center"
                  >5</span
                >
              </div>
              <div class="col-span-5 flex items-center gap-2 min-w-0 pr-1">
                <img
                  class="w-7 h-7 rounded-full object-cover shrink-0"
                  data-alt="Portrait of Hamza Tazi chess club member looking thoughtfully at the game board under dark green ambient tournament lighting."
                  src="/images/de15712b2055.webp"
                  alt=""
                />
                <div class="min-w-0">
                  <span
                    class="player-name font-title-md text-title-md text-on-surface block truncate text-[13px]"
                    >Hamza Tazi</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px] block"
                    >20 gp • 25%</span
                  >
                </div>
              </div>
              <div
                class="col-span-3 text-center font-label-numeric-md text-label-numeric-md text-on-surface-variant text-[12px]"
              >
                <span class="text-secondary font-medium">5</span> / 5 /
                <span class="text-error font-medium">10</span>
              </div>
              <div
                class="col-span-2 text-right font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
              >
                150
              </div>
            </div>
            <!-- Row 6: Sofia Chen -->
            <div
              class="player-row grid grid-cols-12 px-3 py-2.5 items-center hover:bg-surface-container-high transition-colors"
            >
              <div class="col-span-2 flex items-center gap-1.5">
                <span
                  class="w-6 h-6 rounded-md bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-semibold flex items-center justify-center"
                  >6</span
                >
              </div>
              <div class="col-span-5 flex items-center gap-2 min-w-0 pr-1">
                <img
                  class="w-7 h-7 rounded-full object-cover shrink-0"
                  data-alt="Portrait of Sofia Chen, a young female chess tactician with high ponytail in sleek dark modern club environment."
                  src="/images/6f2162d5f0b8.webp"
                  alt=""
                />
                <div class="min-w-0">
                  <span
                    class="player-name font-title-md text-title-md text-on-surface block truncate text-[13px]"
                    >Sofia Chen</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant text-[11px] block"
                    >18 gp • 33%</span
                  >
                </div>
              </div>
              <div
                class="col-span-3 text-center font-label-numeric-md text-label-numeric-md text-on-surface-variant text-[12px]"
              >
                <span class="text-secondary font-medium">6</span> / 2 /
                <span class="text-error font-medium">10</span>
              </div>
              <div
                class="col-span-2 text-right font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
              >
                140
              </div>
            </div>
          </div>
          <!-- Empty Search State -->
          <div
            class="hidden p-6 text-center flex-col items-center justify-center"
            id="empty-search"
          >
            <div
              class="w-12 h-12 rounded-full bg-surface-container-high flex items-center justify-center text-on-surface-variant mb-2"
            >
              <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                >person_search</span
              >
            </div>
            <span class="font-title-md text-title-md text-on-surface">No competitors found</span>
            <p class="font-body-sm text-body-sm text-on-surface-variant mt-1">
              Try searching by first or last name in the current active season.
            </p>
          </div>
        </div>
        <!-- Pagination Controls -->
        <div
          class="flex items-center justify-between bg-surface-container-low px-3 py-2 rounded-xl lg:col-span-2 lg:px-space-lg"
        >
          <div class="font-body-sm text-body-sm text-on-surface-variant">
            Showing <span class="text-on-surface font-semibold">1-10</span> of
            <span class="text-on-surface font-semibold">64</span> players
          </div>
          <div class="flex items-center gap-1">
            <button
              aria-label="Previous Page"
              class="w-8 h-8 rounded-lg bg-surface-container text-on-surface-variant opacity-40 flex items-center justify-center cursor-not-allowed"
              disabled
              type="button"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >chevron_left</span
              >
            </button>
            <span
              class="w-8 h-8 rounded-lg bg-surface-container-highest text-primary font-label-numeric-md text-label-numeric-md font-bold flex items-center justify-center"
            >
              1
            </span>
            <button
              aria-label="Page 2"
              class="w-8 h-8 rounded-lg bg-surface-container text-on-surface-variant hover:text-on-surface flex items-center justify-center font-label-numeric-md text-label-numeric-md transition-colors"
              type="button"
              disabled
            >
              2
            </button>
            <button
              aria-label="Page 3"
              class="w-8 h-8 rounded-lg bg-surface-container text-on-surface-variant hover:text-on-surface flex items-center justify-center font-label-numeric-md text-label-numeric-md transition-colors"
              type="button"
              disabled
            >
              3
            </button>
            <button
              aria-label="Next Page"
              class="w-8 h-8 rounded-lg bg-surface-container text-on-surface-variant hover:text-on-surface flex items-center justify-center transition-colors"
              type="button"
              disabled
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >chevron_right</span
              >
            </button>
          </div>
        </div>
      </div>
    </main>
  </CompactLayout>
</template>
