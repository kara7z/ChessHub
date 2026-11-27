<script setup lang="ts">
import CompactLayout from '../../components/layout/CompactLayout.vue'
import MatchesHeader from '../../components/navigation/MatchesHeader.vue'
</script>

<template>
  <CompactLayout>
    <main class="flex-1 flex flex-col relative w-full pt-16 bg-background">
      <div class="flex w-full flex-col pb-8 lg:px-margin-desktop lg:pt-space-lg">
        <MatchesHeader description="Competitive Match Records">
          <span class="max-w-36 rounded-full bg-surface-container-high px-3 py-1.5 text-center font-label-badge text-label-badge text-primary">
            FIDE Swiss Registered
          </span>
        </MatchesHeader>
        <div class="mt-space-sm flex w-full flex-col gap-space-lg px-margin lg:gap-space-xl lg:px-0">
          <!-- Performance Metric Bento Row (Engineered Monospace & Tabular Data) -->
          <div class="grid grid-cols-2 md:grid-cols-4 xl:grid-cols-7 gap-space-sm">
            <!-- Metric: Matches Played -->
            <div
              class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-center justify-between text-on-surface-variant">
                <span class="font-body-sm text-body-sm uppercase tracking-wider font-semibold"
                  >Matches</span
                >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >sports_score</span
                >
              </div>
              <div class="mt-space-md flex items-baseline gap-2">
                <span class="font-display-lg text-display-lg text-on-surface">24</span>
                <span class="font-body-sm text-body-sm text-on-surface-variant">total</span>
              </div>
              <div
                class="w-full bg-surface-container-highest h-1 rounded-full mt-2 overflow-hidden"
              >
                <div class="bg-on-surface-variant h-full w-full"></div>
              </div>
            </div>
            <!-- Metric: Victories -->
            <div
              class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-center justify-between text-primary">
                <span class="font-body-sm text-body-sm uppercase tracking-wider font-semibold"
                  >Victories</span
                >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >workspace_premium</span
                >
              </div>
              <div class="mt-space-md flex items-baseline justify-between">
                <span class="font-display-lg text-display-lg text-primary">14</span>
                <span
                  class="font-label-badge text-label-badge bg-primary/10 text-primary px-1.5 py-0.5 rounded font-mono"
                  >+20 pts ea</span
                >
              </div>
              <div
                class="w-full bg-surface-container-highest h-1 rounded-full mt-2 overflow-hidden"
              >
                <div class="bg-primary h-full" style="width: 58.3%"></div>
              </div>
            </div>
            <!-- Metric: Draws -->
            <div
              class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-center justify-between text-amber-400">
                <span class="font-body-sm text-body-sm uppercase tracking-wider font-semibold"
                  >Draws</span
                >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >handshake</span
                >
              </div>
              <div class="mt-space-md flex items-baseline justify-between">
                <span class="font-display-lg text-display-lg text-amber-400">4</span>
                <span
                  class="font-label-badge text-label-badge bg-amber-400/10 text-amber-400 px-1.5 py-0.5 rounded font-mono"
                  >+10 pts ea</span
                >
              </div>
              <div
                class="w-full bg-surface-container-highest h-1 rounded-full mt-2 overflow-hidden"
              >
                <div class="bg-amber-400 h-full" style="width: 16.7%"></div>
              </div>
            </div>
            <!-- Metric: Defeats -->
            <div
              class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-center justify-between text-error">
                <span class="font-body-sm text-body-sm uppercase tracking-wider font-semibold"
                  >Defeats</span
                >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">close</span>
              </div>
              <div class="mt-space-md flex items-baseline justify-between">
                <span class="font-display-lg text-display-lg text-error">6</span>
                <span
                  class="font-label-badge text-label-badge bg-error/10 text-error px-1.5 py-0.5 rounded font-mono"
                  >0 pts</span
                >
              </div>
              <div
                class="w-full bg-surface-container-highest h-1 rounded-full mt-2 overflow-hidden"
              >
                <div class="bg-error h-full" style="width: 25%"></div>
              </div>
            </div>
            <!-- Metric: Win Rate -->
            <div
              class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-center justify-between text-on-surface-variant">
                <span class="font-body-sm text-body-sm uppercase tracking-wider font-semibold"
                  >Win Ratio</span
                >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >pie_chart</span
                >
              </div>
              <div class="mt-space-md flex items-baseline gap-1">
                <span class="font-display-lg text-display-lg text-on-surface">58.3</span>
                <span class="font-title-md text-title-md text-primary">%</span>
              </div>
              <div class="text-[11px] text-on-surface-variant flex items-center gap-1 mt-2">
                <span class="material-symbols-outlined text-[14px] text-primary" aria-hidden="true"
                  >trending_up</span
                >
                <span>Top 12% in Division</span>
              </div>
            </div>
            <!-- Metric: Total Points Earned -->
            <div
              class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-center justify-between text-primary">
                <span class="font-body-sm text-body-sm uppercase tracking-wider font-semibold"
                  >Total Score</span
                >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">stars</span>
              </div>
              <div class="mt-space-md flex items-baseline gap-1">
                <span class="font-display-lg text-display-lg text-on-surface">320</span>
                <span class="font-body-sm text-body-sm text-primary uppercase font-bold">pts</span>
              </div>
              <div
                class="text-[11px] text-on-surface-variant flex items-center justify-between mt-2"
              >
                <span>Target: 400 pts</span>
                <span class="text-primary font-mono">80%</span>
              </div>
            </div>
            <!-- Metric: Winning Streak -->
            <div
              class="col-span-2 md:col-span-2 xl:col-span-1 bg-surface-container-high p-space-md rounded-xl flex flex-col justify-between shadow-md relative overflow-hidden"
            >
              <div class="flex items-center justify-between text-secondary-fixed">
                <span class="font-body-sm text-body-sm uppercase tracking-wider font-bold"
                  >Active Streak</span
                >
                <span class="material-symbols-outlined text-[18px] text-primary" aria-hidden="true"
                  >local_fire_department</span
                >
              </div>
              <div class="mt-space-md flex items-baseline gap-2">
                <span class="font-display-lg text-display-lg text-primary">3</span>
                <span class="font-title-md text-title-md text-on-surface">Wins</span>
              </div>
              <div class="flex items-center gap-1.5 mt-2">
                <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
                <span class="text-[11px] text-on-surface-variant tracking-tight font-medium"
                  >Unbeaten in 5 games</span
                >
              </div>
            </div>
          </div>
          <!-- Filter Console: Analytical Multi-Parameter Toolbar -->
          <div
            class="app-panel flex flex-col gap-space-md rounded-2xl p-space-md"
          >
            <div
              class="flex flex-col items-stretch justify-between gap-space-sm"
            >
              <!-- Filter Controls Primary Cluster -->
              <div
                class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-[repeat(3,minmax(0,1.3fr))_repeat(3,minmax(0,1fr))] gap-space-sm"
              >
                <!-- Season Selector -->
                <div class="flex min-w-0 flex-col gap-1">
                  <label
                    class="text-[11px] font-label-badge uppercase tracking-wider text-on-surface-variant font-semibold"
                    >Tournament Season</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg px-3 py-2 pr-8 appearance-none focus:outline-none focus:bg-surface-container cursor-pointer transition-colors"
                    >
                      <option selected value="spring-2025">Spring League 2025</option>
                      <option value="winter-2024">Winter Open 2024</option>
                      <option value="autumn-2024">Autumn Invitational 2024</option>
                      <option value="all-seasons">All Past Tournaments</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2.5 top-2.5 text-on-surface-variant pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <!-- Opponent Search Bar -->
                <div class="flex min-w-0 flex-col gap-1">
                  <label
                    class="text-[11px] font-label-badge uppercase tracking-wider text-on-surface-variant font-semibold"
                    >Search Opponent</label
                  >
                  <div class="relative">
                    <span
                      class="material-symbols-outlined absolute left-2.5 top-2.5 text-on-surface-variant text-[18px]"
                      aria-hidden="true"
                      >search</span
                    >
                    <input
                      class="w-full bg-surface-container-lowest text-on-surface placeholder:text-on-surface-variant font-body-md text-body-md rounded-lg pl-9 pr-3 py-2 focus:outline-none focus:bg-surface-container transition-colors"
                      placeholder="e.g. Tariq, Chen, GM..."
                      type="text"
                    />
                  </div>
                </div>
                <!-- Date Range Selector -->
                <div class="flex min-w-0 flex-col gap-1">
                  <label
                    class="text-[11px] font-label-badge uppercase tracking-wider text-on-surface-variant font-semibold"
                    >Timeframe</label
                  >
                  <div class="relative">
                    <span
                      class="material-symbols-outlined absolute left-2.5 top-2.5 text-on-surface-variant text-[18px]"
                      aria-hidden="true"
                      >date_range</span
                    >
                    <input
                      class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg pl-9 pr-3 py-2 cursor-pointer focus:outline-none hover:bg-surface-container transition-colors"
                      readonly
                      type="text"
                      value="Mar 01 - Apr 30, 2025"
                    />
                  </div>
                </div>
                <!-- Result Filter -->
                <div class="flex min-w-0 flex-col gap-1">
                  <label
                    class="text-[11px] font-label-badge uppercase tracking-wider text-on-surface-variant font-semibold"
                    >Outcome</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg px-3 py-2 pr-8 appearance-none focus:outline-none focus:bg-surface-container cursor-pointer transition-colors"
                    >
                      <option selected value="all">All Results</option>
                      <option value="victory">Victories (+20)</option>
                      <option value="draw">Draws (+10)</option>
                      <option value="defeat">Defeats (0)</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2.5 top-2.5 text-on-surface-variant pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <!-- Color Allocation Filter -->
                <div class="flex min-w-0 flex-col gap-1">
                  <label
                    class="text-[11px] font-label-badge uppercase tracking-wider text-on-surface-variant font-semibold"
                    >Pieces Played</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg px-3 py-2 pr-8 appearance-none focus:outline-none focus:bg-surface-container cursor-pointer transition-colors"
                    >
                      <option selected value="all">All Colors</option>
                      <option value="white">Playing White</option>
                      <option value="black">Playing Black</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2.5 top-2.5 text-on-surface-variant pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <!-- Match Status Filter -->
                <div class="flex min-w-0 flex-col gap-1">
                  <label
                    class="text-[11px] font-label-badge uppercase tracking-wider text-on-surface-variant font-semibold"
                    >Status</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg px-3 py-2 pr-8 appearance-none focus:outline-none focus:bg-surface-container cursor-pointer transition-colors"
                    >
                      <option selected value="completed">Completed</option>
                      <option value="cancelled">Cancelled</option>
                      <option value="declined">Declined</option>
                      <option value="all">Every State</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-2.5 top-2.5 text-on-surface-variant pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
              </div>
            </div>
            <!-- Active Filter Pill Tags Row -->
            <div class="flex flex-wrap items-center gap-2 pt-2">
              <span class="text-[12px] text-on-surface-variant">Active criteria:</span>
              <span
                class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container font-body-sm text-[12px] text-on-surface"
              >
                <span>Spring League 2025</span>
                <button class="hover:text-primary" disabled title="Design preview">
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >close</span
                  >
                </button>
              </span>
              <span
                class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container font-body-sm text-[12px] text-on-surface"
              >
                <span>Status: Completed</span>
                <button class="hover:text-primary" disabled title="Design preview">
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >close</span
                  >
                </button>
              </span>
              <button
                class="text-primary text-[12px] font-semibold hover:underline ml-1"
                disabled
                title="Design preview"
              >
                Clear all
              </button>
              <button
                class="px-space-md py-2 bg-surface-container hover:bg-surface-container-high text-on-surface rounded-lg font-body-sm text-body-sm flex items-center justify-center gap-1.5 transition-all sm:ml-auto"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >restart_alt</span
                >
                <span>Reset</span>
              </button>
            </div>
          </div>
          <!-- Match List Matrix Header -->
          <div
            class="flex flex-wrap items-center justify-between gap-space-xs text-on-surface-variant font-body-sm text-body-sm"
          >
            <div>
              <h2 class="font-headline-sm text-headline-sm text-on-surface">Official Match Record Log</h2>
              <p>24 verified fixtures</p>
            </div>
            <div class="flex items-center gap-space-md">
              <span>Sort by: Most Recent</span>
              <button
                class="text-on-surface hover:text-primary transition-colors flex items-center gap-0.5"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >swap_vert</span
                >
              </button>
            </div>
          </div>
          <!-- Match Fixtures Stream -->
          <div class="match-records flex flex-col gap-space-sm">
            <!-- CARD 1: VICTORY (White Wins: Alex Rivera VS Tariq Al-Mansoor) -->
            <div
              class="app-panel flex flex-col items-center gap-space-md rounded-2xl p-space-md transition-colors hover:bg-surface-container-high"
            >
              <!-- Left Section: Meta, Round & Context Badge -->
              <div class="flex items-center gap-space-md w-full xl:w-72 shrink-0">
                <div
                  class="w-12 h-12 rounded-lg bg-surface-container-high flex flex-col items-center justify-center text-primary shrink-0"
                >
                  <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                    >military_tech</span
                  >
                  <span class="text-[9px] font-mono font-bold leading-none mt-0.5">BD 1</span>
                </div>
                <div class="flex flex-col min-w-0">
                  <div class="flex items-center gap-2">
                    <span class="font-title-md text-title-md text-on-surface font-semibold truncate"
                      >Spring League 2025</span
                    >
                    <span
                      class="font-label-badge text-label-badge bg-surface-container text-on-surface-variant px-1.5 py-0.5 rounded"
                      >RND 5</span
                    >
                  </div>
                  <div
                    class="flex items-center gap-2 text-on-surface-variant text-[12px] mt-0.5 font-mono"
                  >
                    <span>Classical (90+30)</span>
                    <span>•</span>
                    <span>Apr 8, 2025</span>
                  </div>
                </div>
              </div>
              <!-- Center Section: Head-to-Head Tactical Split -->
              <div
                class="match-pairing flex w-full flex-col items-center gap-3 px-2"
              >
                <!-- White Side (You - Winner) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-end text-right"
                >
                  <div class="flex flex-col items-end min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface font-bold truncate"
                        >Alex Rivera</span
                      >
                      <span
                        class="bg-primary/20 text-primary text-[10px] font-bold px-1.5 py-0.2 rounded font-mono"
                        >YOU</span
                      >
                    </div>
                    <div class="flex items-center gap-1.5 mt-1">
                      <span
                        class="bg-primary/10 text-primary font-mono font-bold text-[11px] px-2 py-0.5 rounded"
                        >+20 pts</span
                      >
                      <span
                        class="bg-primary text-on-primary font-bold text-[10px] px-1.5 py-0.5 rounded tracking-wide uppercase"
                        >Victory</span
                      >
                    </div>
                  </div>
                  <div class="relative shrink-0">
                    <div
                      class="w-10 h-10 rounded-full bg-surface-bright flex items-center justify-center text-on-surface shadow-sm font-bold text-[13px]"
                    >
                      AR
                    </div>
                    <span
                      class="absolute -bottom-1 -left-1 w-4 h-4 rounded-full bg-surface-bright flex items-center justify-center text-[10px] text-surface-container-lowest"
                      title="Playing White"
                      >♔</span
                    >
                  </div>
                </div>
                <!-- Board Center: Monospace Tactical Result Counter -->
                <div class="flex flex-col items-center justify-center px-4 shrink-0">
                  <div
                    class="bg-surface-container-lowest px-4 py-2 rounded-lg text-center shadow-inner"
                  >
                    <div
                      class="font-display-lg text-[22px] leading-tight font-mono tracking-widest text-primary font-bold"
                    >
                      1 — 0
                    </div>
                    <span
                      class="text-[9px] uppercase tracking-wider text-on-surface-variant font-mono"
                      >Resignation (42m)</span
                    >
                  </div>
                </div>
                <!-- Black Side (Opponent - Defeated) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-start text-left"
                >
                  <div class="relative shrink-0">
                    <div
                      class="w-10 h-10 rounded-full bg-surface-container-highest flex items-center justify-center text-on-surface font-semibold text-[13px]"
                    >
                      TM
                    </div>
                    <span
                      class="absolute -bottom-1 -right-1 w-4 h-4 rounded-full bg-surface-container-lowest text-on-surface flex items-center justify-center text-[10px]"
                      title="Playing Black"
                      >♚</span
                    >
                  </div>
                  <div class="flex flex-col items-start min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span
                        class="font-title-md text-title-md text-on-surface-variant font-medium truncate"
                        >Tariq Al-Mansoor</span
                      >
                      <span
                        class="bg-surface-container-highest text-on-surface-variant text-[10px] font-mono px-1 rounded"
                        >FM</span
                      >
                    </div>
                    <div class="flex items-center gap-1.5 mt-1">
                      <span class="bg-error/10 text-error font-mono text-[11px] px-2 py-0.5 rounded"
                        >+0 pts</span
                      >
                      <span
                        class="bg-error/20 text-error font-bold text-[10px] px-1.5 py-0.5 rounded tracking-wide uppercase"
                        >Defeat</span
                      >
                    </div>
                  </div>
                </div>
              </div>
              <!-- Right Section: Match Actions & PGN Inspector -->
              <div class="flex items-center justify-end gap-2 w-full xl:w-56 shrink-0">
                <button
                  class="bg-surface-container-high hover:bg-surface-container-highest text-on-surface px-4 py-2 rounded-lg font-title-md text-body-sm flex items-center gap-2 transition-all"
                  disabled
                  title="Design preview"
                >
                  <span>View Match Details</span>
                  <span
                    class="material-symbols-outlined text-[16px] text-primary"
                    aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
                <button
                  class="w-9 h-9 rounded-lg bg-surface-container hover:bg-surface-container-highest flex items-center justify-center text-on-surface-variant hover:text-on-surface transition-colors"
                  title="Export PGN File"
                  disabled
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >download</span
                  >
                </button>
              </div>
            </div>
            <!-- CARD 2: DRAW (White: David Kim VS Black: Alex Rivera) -->
            <div
              class="app-panel flex flex-col items-center gap-space-md rounded-2xl p-space-md transition-colors hover:bg-surface-container-high"
            >
              <!-- Left Section: Meta, Round & Context Badge -->
              <div class="flex items-center gap-space-md w-full xl:w-72 shrink-0">
                <div
                  class="w-12 h-12 rounded-lg bg-surface-container-high flex flex-col items-center justify-center text-amber-400 shrink-0"
                >
                  <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                    >scale</span
                  >
                  <span class="text-[9px] font-mono font-bold leading-none mt-0.5">BD 3</span>
                </div>
                <div class="flex flex-col min-w-0">
                  <div class="flex items-center gap-2">
                    <span class="font-title-md text-title-md text-on-surface font-semibold truncate"
                      >Spring League 2025</span
                    >
                    <span
                      class="font-label-badge text-label-badge bg-surface-container text-on-surface-variant px-1.5 py-0.5 rounded"
                      >RND 4</span
                    >
                  </div>
                  <div
                    class="flex items-center gap-2 text-on-surface-variant text-[12px] mt-0.5 font-mono"
                  >
                    <span>Rapid (15+10)</span>
                    <span>•</span>
                    <span>Apr 1, 2025</span>
                  </div>
                </div>
              </div>
              <!-- Center Section: Head-to-Head Tactical Split -->
              <div
                class="match-pairing flex w-full flex-col items-center gap-3 px-2"
              >
                <!-- White Side (Opponent) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-end text-right"
                >
                  <div class="flex flex-col items-end min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface font-medium truncate"
                        >David Kim</span
                      >
                      <span
                        class="bg-surface-container-highest text-on-surface-variant text-[10px] font-mono px-1 rounded"
                        >CM</span
                      >
                    </div>
                    <div class="flex items-center gap-1.5 mt-1">
                      <span
                        class="bg-amber-400/10 text-amber-400 font-mono font-bold text-[11px] px-2 py-0.5 rounded"
                        >+10 pts</span
                      >
                      <span
                        class="bg-amber-400/20 text-amber-400 font-bold text-[10px] px-1.5 py-0.5 rounded tracking-wide uppercase"
                        >Draw</span
                      >
                    </div>
                  </div>
                  <div class="relative shrink-0">
                    <div
                      class="w-10 h-10 rounded-full bg-surface-bright flex items-center justify-center text-on-surface font-semibold text-[13px]"
                    >
                      DK
                    </div>
                    <span
                      class="absolute -bottom-1 -left-1 w-4 h-4 rounded-full bg-surface-bright flex items-center justify-center text-[10px] text-surface-container-lowest"
                      title="Playing White"
                      >♔</span
                    >
                  </div>
                </div>
                <!-- Board Center: Monospace Tactical Result Counter -->
                <div class="flex flex-col items-center justify-center px-4 shrink-0">
                  <div
                    class="bg-surface-container-lowest px-4 py-2 rounded-lg text-center shadow-inner"
                  >
                    <div
                      class="font-display-lg text-[22px] leading-tight font-mono tracking-widest text-amber-400 font-bold"
                    >
                      ½ — ½
                    </div>
                    <span
                      class="text-[9px] uppercase tracking-wider text-on-surface-variant font-mono"
                      >Agreement (56m)</span
                    >
                  </div>
                </div>
                <!-- Black Side (You - Draw) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-start text-left"
                >
                  <div class="relative shrink-0">
                    <div
                      class="w-10 h-10 rounded-full bg-surface-bright flex items-center justify-center text-on-surface shadow-sm font-bold text-[13px]"
                    >
                      AR
                    </div>
                    <span
                      class="absolute -bottom-1 -right-1 w-4 h-4 rounded-full bg-surface-container-lowest text-on-surface flex items-center justify-center text-[10px]"
                      title="Playing Black"
                      >♚</span
                    >
                  </div>
                  <div class="flex flex-col items-start min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface font-bold truncate"
                        >Alex Rivera</span
                      >
                      <span
                        class="bg-primary/20 text-primary text-[10px] font-bold px-1.5 py-0.2 rounded font-mono"
                        >YOU</span
                      >
                    </div>
                    <div class="flex items-center gap-1.5 mt-1">
                      <span
                        class="bg-amber-400/10 text-amber-400 font-mono font-bold text-[11px] px-2 py-0.5 rounded"
                        >+10 pts</span
                      >
                      <span
                        class="bg-amber-400/20 text-amber-400 font-bold text-[10px] px-1.5 py-0.5 rounded tracking-wide uppercase"
                        >Draw</span
                      >
                    </div>
                  </div>
                </div>
              </div>
              <!-- Right Section: Match Actions & PGN Inspector -->
              <div class="flex items-center justify-end gap-2 w-full xl:w-56 shrink-0">
                <button
                  class="bg-surface-container-high hover:bg-surface-container-highest text-on-surface px-4 py-2 rounded-lg font-title-md text-body-sm flex items-center gap-2 transition-all"
                  disabled
                  title="Design preview"
                >
                  <span>View Match Details</span>
                  <span
                    class="material-symbols-outlined text-[16px] text-amber-400"
                    aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
                <button
                  class="w-9 h-9 rounded-lg bg-surface-container hover:bg-surface-container-highest flex items-center justify-center text-on-surface-variant hover:text-on-surface transition-colors"
                  title="Export PGN File"
                  disabled
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >download</span
                  >
                </button>
              </div>
            </div>
            <!-- CARD 3: DEFEAT (White: Alex Rivera VS Black: Adam Chen GM) -->
            <div
              class="app-panel flex flex-col items-center gap-space-md rounded-2xl p-space-md transition-colors hover:bg-surface-container-high"
            >
              <!-- Left Section: Meta, Round & Context Badge -->
              <div class="flex items-center gap-space-md w-full xl:w-72 shrink-0">
                <div
                  class="w-12 h-12 rounded-lg bg-surface-container-high flex flex-col items-center justify-center text-error shrink-0"
                >
                  <span class="material-symbols-outlined text-[24px]" aria-hidden="true">flag</span>
                  <span class="text-[9px] font-mono font-bold leading-none mt-0.5">BD 1</span>
                </div>
                <div class="flex flex-col min-w-0">
                  <div class="flex items-center gap-2">
                    <span class="font-title-md text-title-md text-on-surface font-semibold truncate"
                      >Spring League 2025</span
                    >
                    <span
                      class="font-label-badge text-label-badge bg-surface-container text-on-surface-variant px-1.5 py-0.5 rounded"
                      >RND 3</span
                    >
                  </div>
                  <div
                    class="flex items-center gap-2 text-on-surface-variant text-[12px] mt-0.5 font-mono"
                  >
                    <span>Classical (90+30)</span>
                    <span>•</span>
                    <span>Mar 25, 2025</span>
                  </div>
                </div>
              </div>
              <!-- Center Section: Head-to-Head Tactical Split -->
              <div
                class="match-pairing flex w-full flex-col items-center gap-3 px-2"
              >
                <!-- White Side (You - Loss) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-end text-right"
                >
                  <div class="flex flex-col items-end min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface font-bold truncate"
                        >Alex Rivera</span
                      >
                      <span
                        class="bg-primary/20 text-primary text-[10px] font-bold px-1.5 py-0.2 rounded font-mono"
                        >YOU</span
                      >
                    </div>
                    <div class="flex items-center gap-1.5 mt-1">
                      <span class="bg-error/10 text-error font-mono text-[11px] px-2 py-0.5 rounded"
                        >0 pts</span
                      >
                      <span
                        class="bg-error/20 text-error font-bold text-[10px] px-1.5 py-0.5 rounded tracking-wide uppercase"
                        >Defeat</span
                      >
                    </div>
                  </div>
                  <div class="relative shrink-0">
                    <div
                      class="w-10 h-10 rounded-full bg-surface-bright flex items-center justify-center text-on-surface shadow-sm font-bold text-[13px]"
                    >
                      AR
                    </div>
                    <span
                      class="absolute -bottom-1 -left-1 w-4 h-4 rounded-full bg-surface-bright flex items-center justify-center text-[10px] text-surface-container-lowest"
                      title="Playing White"
                      >♔</span
                    >
                  </div>
                </div>
                <!-- Board Center: Monospace Tactical Result Counter -->
                <div class="flex flex-col items-center justify-center px-4 shrink-0">
                  <div
                    class="bg-surface-container-lowest px-4 py-2 rounded-lg text-center shadow-inner"
                  >
                    <div
                      class="font-display-lg text-[22px] leading-tight font-mono tracking-widest text-error font-bold"
                    >
                      0 — 1
                    </div>
                    <span
                      class="text-[9px] uppercase tracking-wider text-on-surface-variant font-mono"
                      >Checkmate (38m)</span
                    >
                  </div>
                </div>
                <!-- Black Side (Opponent - Winner GM) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-start text-left"
                >
                  <div class="relative shrink-0">
                    <div
                      class="w-10 h-10 rounded-full bg-surface-container-highest flex items-center justify-center text-on-surface font-semibold text-[13px]"
                    >
                      AC
                    </div>
                    <span
                      class="absolute -bottom-1 -right-1 w-4 h-4 rounded-full bg-surface-container-lowest text-on-surface flex items-center justify-center text-[10px]"
                      title="Playing Black"
                      >♚</span
                    >
                  </div>
                  <div class="flex flex-col items-start min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold truncate"
                        >Adam Chen</span
                      >
                      <span
                        class="bg-amber-400/20 text-amber-300 font-bold text-[10px] px-1.5 py-0.2 rounded font-mono"
                        >GM</span
                      >
                    </div>
                    <div class="flex items-center gap-1.5 mt-1">
                      <span
                        class="bg-primary/10 text-primary font-mono font-bold text-[11px] px-2 py-0.5 rounded"
                        >+20 pts</span
                      >
                      <span
                        class="bg-primary text-on-primary font-bold text-[10px] px-1.5 py-0.5 rounded tracking-wide uppercase"
                        >Victory</span
                      >
                    </div>
                  </div>
                </div>
              </div>
              <!-- Right Section: Match Actions & PGN Inspector -->
              <div class="flex items-center justify-end gap-2 w-full xl:w-56 shrink-0">
                <button
                  class="bg-surface-container-high hover:bg-surface-container-highest text-on-surface px-4 py-2 rounded-lg font-title-md text-body-sm flex items-center gap-2 transition-all"
                  disabled
                  title="Design preview"
                >
                  <span>View Match Details</span>
                  <span class="material-symbols-outlined text-[16px] text-error" aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
                <button
                  class="w-9 h-9 rounded-lg bg-surface-container hover:bg-surface-container-highest flex items-center justify-center text-on-surface-variant hover:text-on-surface transition-colors"
                  title="Export PGN File"
                  disabled
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >download</span
                  >
                </button>
              </div>
            </div>
            <!-- CARD 4: CANCELLED / DECLINED MATCH (Excluded from competitive stats) -->
            <div
              class="bg-surface-container-lowest/80 opacity-75 hover:opacity-100 rounded-2xl p-space-md transition-opacity flex flex-col items-center gap-space-md"
            >
              <!-- Left Section: Meta, Round & Context Badge -->
              <div class="flex items-center gap-space-md w-full xl:w-72 shrink-0">
                <div
                  class="w-12 h-12 rounded-lg bg-surface-container flex flex-col items-center justify-center text-on-surface-variant shrink-0"
                >
                  <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                    >event_busy</span
                  >
                  <span class="text-[9px] font-mono font-bold leading-none mt-0.5">VOID</span>
                </div>
                <div class="flex flex-col min-w-0">
                  <div class="flex items-center gap-2">
                    <span
                      class="font-title-md text-title-md text-on-surface-variant line-through truncate"
                      >Club Championship Qualifier</span
                    >
                    <span
                      class="font-label-badge text-label-badge bg-surface-container-high text-on-surface-variant px-1.5 py-0.5 rounded"
                      >RND 1</span
                    >
                  </div>
                  <div
                    class="flex items-center gap-2 text-on-surface-variant text-[12px] mt-0.5 font-mono"
                  >
                    <span>Blitz 5+3</span>
                    <span>•</span>
                    <span>Mar 12, 2025</span>
                  </div>
                </div>
              </div>
              <!-- Center Section: Head-to-Head Status Notification -->
              <div
                class="match-pairing flex w-full flex-col items-center gap-3 px-2"
              >
                <!-- White Side (You) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-end text-right"
                >
                  <div class="flex flex-col items-end min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface-variant truncate"
                        >Alex Rivera</span
                      >
                      <span
                        class="bg-surface-container text-on-surface-variant text-[10px] px-1 py-0.2 rounded font-mono"
                        >YOU</span
                      >
                    </div>
                    <span class="text-[11px] text-on-surface-variant font-mono"
                      >No Rating Adjustment</span
                    >
                  </div>
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container flex items-center justify-center text-on-surface-variant text-[13px] shrink-0"
                  >
                    AR
                  </div>
                </div>
                <!-- Board Center: Cancellation Chip -->
                <div class="flex flex-col items-center justify-center px-4 shrink-0">
                  <div class="bg-surface-container px-3 py-1.5 rounded text-center">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant font-bold"
                      >Declined by Opponent (0 pts)</span
                    >
                    <div class="text-[10px] text-on-surface-variant mt-0.5 font-mono">
                      Not Counted in Standings
                    </div>
                  </div>
                </div>
                <!-- Black Side (Opponent) -->
                <div
                  class="flex items-center gap-3 w-full lg:w-5/12 min-w-0 justify-start text-left"
                >
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container flex items-center justify-center text-on-surface-variant text-[13px] shrink-0"
                  >
                    MK
                  </div>
                  <div class="flex flex-col items-start min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface-variant truncate"
                        >Mikhail Kozlov</span
                      >
                      <span
                        class="bg-surface-container text-on-surface-variant text-[10px] font-mono px-1 rounded"
                        >NM</span
                      >
                    </div>
                    <span class="text-[11px] text-on-surface-variant font-mono"
                      >Schedule Conflict</span
                    >
                  </div>
                </div>
              </div>
              <!-- Right Section: Match Actions -->
              <div class="flex items-center justify-end gap-2 w-full xl:w-56 shrink-0">
                <button
                  class="bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface px-4 py-2 rounded-lg font-title-md text-body-sm flex items-center gap-2 transition-all"
                  disabled
                  title="Design preview"
                >
                  <span>View Match Details</span>
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true">info</span>
                </button>
              </div>
            </div>
          </div>
          <!-- Analytical Pagination Console -->
          <div
            class="bg-surface-container-low px-space-md py-3 rounded-xl flex flex-col sm:flex-row items-center justify-between gap-space-sm mt-space-xs"
          >
            <div
              class="flex items-center gap-2 text-on-surface-variant font-body-sm text-body-sm font-mono"
            >
              <span
                >Showing <strong class="text-on-surface font-semibold">1</strong>–<strong
                  class="text-on-surface font-semibold"
                  >10</strong
                >
                of <strong class="text-on-surface font-semibold">24</strong> matches recorded</span
              >
            </div>
            <!-- Pagination Steps -->
            <div class="flex items-center gap-1">
              <button
                class="w-8 h-8 rounded flex items-center justify-center bg-surface-container text-on-surface-variant/40 cursor-not-allowed"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >chevron_left</span
                >
              </button>
              <button
                class="w-8 h-8 rounded flex items-center justify-center bg-primary text-on-primary font-mono font-bold text-[13px]"
                disabled
                title="Design preview"
              >
                1
              </button>
              <button
                class="w-8 h-8 rounded flex items-center justify-center bg-surface-container hover:bg-surface-container-high text-on-surface font-mono text-[13px] transition-colors"
                disabled
                title="Design preview"
              >
                2
              </button>
              <button
                class="w-8 h-8 rounded flex items-center justify-center bg-surface-container hover:bg-surface-container-high text-on-surface font-mono text-[13px] transition-colors"
                disabled
                title="Design preview"
              >
                3
              </button>
              <span class="px-1 text-on-surface-variant font-mono text-xs">...</span>
              <button
                class="px-3 h-8 rounded flex items-center gap-1 bg-surface-container hover:bg-surface-container-high text-on-surface font-body-sm text-body-sm transition-colors"
                disabled
                title="Design preview"
              >
                <span>Next</span>
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >chevron_right</span
                >
              </button>
            </div>
            <div class="hidden xl:flex items-center gap-2 text-on-surface-variant text-[12px]">
              <span>Standard: FIDE Handbook B.02</span>
              <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
              <span class="text-primary font-mono">Sync: 12s ago</span>
            </div>
          </div>
        </div>
      </div>
    </main>
  </CompactLayout>
</template>

<style scoped>
@media (width >= 64rem) {
  .match-records > div {
    display: grid;
    grid-template-columns: minmax(0, 14rem) minmax(0, 1fr);
  }

  .match-records > div > :last-child {
    grid-column: 2;
    justify-self: end;
  }

  .match-pairing {
    display: grid;
    grid-template-columns: minmax(0, 1fr) auto minmax(0, 1fr);
  }

  .match-pairing > div {
    width: 100%;
    padding-inline: 0;
  }
}

@media (width >= 80rem) {
  .match-records > div {
    grid-template-columns: minmax(0, 14rem) minmax(0, 1fr) minmax(0, 12rem);
  }

  .match-records > div > :last-child {
    grid-column: 3;
    width: 100%;
  }
}
</style>
