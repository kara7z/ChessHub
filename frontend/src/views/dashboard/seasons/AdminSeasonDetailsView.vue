<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Top Context & Micro Breadcrumb -->
        <div class="flex flex-col gap-space-xs pt-space-lg pb-space-sm">
          <nav class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <span class="hover:text-on-surface transition-colors cursor-pointer">Dashboard</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="hover:text-on-surface transition-colors cursor-pointer">Seasons</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-on-surface font-title-md text-title-md">Spring League 2025</span>
            <span
              class="font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-surface-container-high text-outline ml-space-xs"
              >#SN-2025-01</span
            >
          </nav>
        </div>
        <!-- Header Section with Season Identity & Arbitral Command Suite -->
        <div
          class="flex flex-col xl:flex-row xl:items-center justify-between gap-space-md py-space-md"
        >
          <div class="flex flex-col gap-space-xs">
            <div class="flex flex-wrap items-center gap-space-sm">
              <h1
                class="font-headline-lg text-headline-lg text-on-surface tracking-tight font-bold"
              >
                Spring League 2025
              </h1>
              <span
                class="px-2.5 py-0.5 rounded-full bg-primary-container/20 text-primary font-label-badge text-label-badge font-semibold tracking-wider uppercase flex items-center gap-1"
              >
                <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                Active Season
              </span>
              <span
                class="px-2.5 py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-semibold tracking-wide"
              >
                Round 7 of 10
              </span>
            </div>
            <div
              class="flex flex-wrap items-center gap-space-md text-outline font-body-sm text-body-sm"
            >
              <div class="flex items-center gap-1.5">
                <span class="material-symbols-outlined text-[16px] text-outline" aria-hidden="true"
                  >calendar_month</span
                >
                <span>March 1, 2025 – May 30, 2025</span>
              </div>
              <span class="text-surface-container-highest">•</span>
              <div class="flex items-center gap-1.5 text-secondary">
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >hourglass_top</span
                >
                <span class="font-label-numeric-md text-label-numeric-md">42 Days Remaining</span>
              </div>
              <span class="text-surface-container-highest">•</span>
              <span
                class="text-on-surface-variant font-label-badge text-label-badge tracking-wider uppercase"
                >FIDE Tier-2 Ranked System</span
              >
            </div>
          </div>
          <!-- Admin Action Suite -->
          <div class="flex flex-wrap items-center gap-space-sm">
            <RouterLink
              class="px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface transition-all flex items-center gap-space-xs font-title-md text-title-md shadow-sm"
              to="/dashboard/seasons/SN-2025-01/edit"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >edit_square</span
              >
              <span>Edit Info</span>
            </RouterLink>
            <button
              class="px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface transition-all flex items-center gap-space-xs font-title-md text-title-md shadow-sm"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">download</span>
              <span>Export Standings CSV</span>
            </button>
            <button
              class="px-space-md py-space-sm rounded-lg bg-error-container/30 hover:bg-error-container/50 text-error transition-all flex items-center gap-space-xs font-title-md text-title-md"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">gavel</span>
              <span>Close Season</span>
            </button>
            <button
              class="px-space-md py-space-sm rounded-lg bg-surface-container-low text-outline/40 cursor-not-allowed flex items-center gap-space-xs font-title-md text-title-md"
              disabled
              title="Archiving locked while season is active"
              type="button"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">archive</span>
              <span>Archive Season</span>
            </button>
          </div>
        </div>
        <!-- KPI Precision Grid -->
        <div class="grid grid-cols-1 md:grid-cols-2 xl:grid-cols-4 gap-gutter py-space-md">
          <!-- Card 1: Registered Players -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -top-4 w-24 h-24 rounded-full bg-primary/5 blur-xl pointer-events-none"
            ></div>
            <div class="flex items-center justify-between pb-space-sm">
              <span class="font-label-badge text-label-badge tracking-wider uppercase text-outline"
                >Registered Roster</span
              >
              <span
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">groups</span>
              </span>
            </div>
            <div class="flex items-baseline gap-space-xs">
              <span class="font-display-lg text-display-lg font-bold text-on-surface">64</span>
              <span class="font-body-md text-body-md text-outline">/ 64 Slots</span>
            </div>
            <div class="pt-space-md flex flex-col gap-1.5">
              <div
                class="flex items-center justify-between text-on-surface-variant font-label-badge text-label-badge"
              >
                <span class="text-secondary font-semibold">100% Full Capacity</span>
                <span>Swiss Bracket Roster</span>
              </div>
              <div class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden">
                <div class="w-full h-full bg-primary rounded-full"></div>
              </div>
            </div>
          </div>
          <!-- Card 2: Matches Played -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -top-4 w-24 h-24 rounded-full bg-secondary/5 blur-xl pointer-events-none"
            ></div>
            <div class="flex items-center justify-between pb-space-sm">
              <span class="font-label-badge text-label-badge tracking-wider uppercase text-outline"
                >Fixture Progress</span
              >
              <span
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-secondary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">swords</span>
              </span>
            </div>
            <div class="flex items-baseline gap-space-xs">
              <span class="font-display-lg text-display-lg font-bold text-on-surface">182</span>
              <span class="font-body-md text-body-md text-outline">/ 221 Matches</span>
            </div>
            <div class="pt-space-md flex flex-col gap-1.5">
              <div class="flex items-center justify-between font-label-badge text-label-badge">
                <span class="text-on-surface-variant">39 Pending Encounters</span>
                <span class="text-primary font-semibold font-label-numeric-md text-label-numeric-md"
                  >82.3% Completed</span
                >
              </div>
              <div class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden">
                <div class="w-[82.3%] h-full bg-primary-container rounded-full"></div>
              </div>
            </div>
          </div>
          <!-- Card 3: Current Leader -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -top-4 w-24 h-24 rounded-full bg-tertiary/5 blur-xl pointer-events-none"
            ></div>
            <div class="flex items-center justify-between pb-space-sm">
              <span class="font-label-badge text-label-badge tracking-wider uppercase text-outline"
                >Current Standings Leader</span
              >
              <span
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-tertiary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >military_tech</span
                >
              </span>
            </div>
            <div class="flex items-center gap-space-sm">
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-highest flex items-center justify-center font-bold text-primary font-headline-sm text-headline-sm"
              >
                AC
              </div>
              <div class="flex flex-col min-w-0">
                <div class="flex items-center gap-1.5">
                  <span
                    class="font-headline-sm text-headline-sm text-on-surface font-semibold truncate"
                    >Adam Chen</span
                  >
                  <span
                    class="px-1.5 py-0.2 rounded bg-surface-container-highest text-primary font-label-badge text-label-badge"
                    >GM</span
                  >
                </div>
                <span class="font-body-sm text-body-sm text-outline">Rating: 2548 FIDE</span>
              </div>
            </div>
            <div
              class="pt-space-md flex items-center justify-between font-label-badge text-label-badge"
            >
              <span
                class="px-2 py-0.5 rounded bg-primary-container/20 text-primary font-semibold font-label-numeric-md text-label-numeric-md"
                >330 PTS</span
              >
              <span class="font-label-numeric-md text-label-numeric-md text-outline"
                >15W - 3D - 2L</span
              >
            </div>
          </div>
          <!-- Card 4: Round Completion Rate -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -top-4 w-24 h-24 rounded-full bg-secondary-container/20 blur-xl pointer-events-none"
            ></div>
            <div class="flex items-center justify-between pb-space-sm">
              <span class="font-label-badge text-label-badge tracking-wider uppercase text-outline"
                >Arbitration Reliability</span
              >
              <span
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-secondary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >verified</span
                >
              </span>
            </div>
            <div class="flex items-baseline gap-space-xs">
              <span class="font-display-lg text-display-lg font-bold text-on-surface">98.4%</span>
              <span class="font-body-md text-body-md text-secondary">+1.2% vs S24</span>
            </div>
            <div
              class="pt-space-md flex items-center justify-between text-outline font-label-badge text-label-badge"
            >
              <span>No Unresolved Disputes</span>
              <span class="flex items-center gap-1 text-primary">
                <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                  >check_circle</span
                >
                Zero Forfeits
              </span>
            </div>
          </div>
        </div>
        <!-- Tabbed Navigation Bar -->
        <div class="flex flex-wrap items-center gap-space-xs pt-space-lg pb-space-sm">
          <RouterLink
            class="px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface font-title-md text-title-md flex items-center gap-space-xs shadow-sm"
            to="/dashboard"
          >
            <span class="material-symbols-outlined text-[18px] text-primary" aria-hidden="true"
              >analytics</span
            >
            <span>Overview</span>
            <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
          </RouterLink>
          <button
            class="px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container hover:text-on-surface transition-colors font-title-md text-title-md flex items-center gap-space-xs"
            disabled
            title="Design preview"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
              >format_list_numbered</span
            >
            <span>Standings</span>
            <span
              class="font-label-badge text-label-badge px-1.5 rounded bg-surface-container text-outline"
              >64</span
            >
          </button>
          <RouterLink
            class="px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container hover:text-on-surface transition-colors font-title-md text-title-md flex items-center gap-space-xs"
            to="/dashboard/matches"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true">swords</span>
            <span>Matches</span>
            <span
              class="font-label-badge text-label-badge px-1.5 rounded bg-surface-container text-outline"
              >221</span
            >
          </RouterLink>
          <button
            class="px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container hover:text-on-surface transition-colors font-title-md text-title-md flex items-center gap-space-xs"
            disabled
            title="Design preview"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true">person</span>
            <span>Players</span>
          </button>
        </div>
        <!-- Primary Dynamic Content Area: Overview Grid -->
        <div class="grid grid-cols-1 xl:grid-cols-12 gap-gutter pt-space-md">
          <!-- LEFT PANEL: Round Timeline + Standings Preview (8 cols) -->
          <div class="xl:col-span-8 flex flex-col gap-space-lg">
            <!-- Round Pipeline Progression -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-[20px] text-primary"
                    aria-hidden="true"
                    >linear_scale</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                    10-Round Championship Pipeline
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Swiss Engine Protocol</span
                >
              </div>
              <!-- Horizontal Scrollable Rounds Strip -->
              <div class="grid grid-cols-2 sm:grid-cols-5 md:grid-cols-10 gap-space-xs">
                <!-- Rounds 1-6: Completed -->
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex flex-col items-center gap-1 group hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R01</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >done_all</span
                    >
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                    >22/22</span
                  >
                  <span class="text-[10px] text-outline uppercase">Final</span>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex flex-col items-center gap-1 group hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R02</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >done_all</span
                    >
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                    >22/22</span
                  >
                  <span class="text-[10px] text-outline uppercase">Final</span>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex flex-col items-center gap-1 group hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R03</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >done_all</span
                    >
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                    >22/22</span
                  >
                  <span class="text-[10px] text-outline uppercase">Final</span>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex flex-col items-center gap-1 group hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R04</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >done_all</span
                    >
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                    >22/22</span
                  >
                  <span class="text-[10px] text-outline uppercase">Final</span>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex flex-col items-center gap-1 group hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R05</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >done_all</span
                    >
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                    >22/22</span
                  >
                  <span class="text-[10px] text-outline uppercase">Final</span>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex flex-col items-center gap-1 group hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R06</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >done_all</span
                    >
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                    >22/22</span
                  >
                  <span class="text-[10px] text-outline uppercase">Final</span>
                </div>
                <!-- Round 7: ACTIVE HIGHLIGHT -->
                <div
                  class="p-space-sm rounded-lg bg-primary-container/20 shadow-md flex flex-col items-center gap-1 relative overflow-hidden"
                >
                  <div class="absolute inset-0 bg-primary/5 pointer-events-none"></div>
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-primary font-bold"
                      >R07</span
                    >
                    <span class="w-2 h-2 rounded-full bg-primary animate-ping"></span>
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                    >14/22</span
                  >
                  <span class="text-[10px] text-primary uppercase font-semibold">In Play</span>
                </div>
                <!-- Rounds 8-10: Upcoming -->
                <div
                  class="p-space-sm rounded-lg bg-surface-container-lowest/60 flex flex-col items-center gap-1 opacity-70 group hover:opacity-100 transition-opacity"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R08</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-outline"
                      aria-hidden="true"
                      >schedule</span
                    >
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-outline">0/22</span>
                  <span class="text-[10px] text-outline uppercase">May 14</span>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container-lowest/60 flex flex-col items-center gap-1 opacity-70 group hover:opacity-100 transition-opacity"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R09</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-outline"
                      aria-hidden="true"
                      >schedule</span
                    >
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-outline">0/22</span>
                  <span class="text-[10px] text-outline uppercase">May 21</span>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container-lowest/60 flex flex-col items-center gap-1 opacity-70 group hover:opacity-100 transition-opacity"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-label-badge text-label-badge text-outline">R10</span>
                    <span
                      class="material-symbols-outlined text-[14px] text-outline"
                      aria-hidden="true"
                      >lock</span
                    >
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-outline"
                    >Finals</span
                  >
                  <span class="text-[10px] text-outline uppercase">May 28</span>
                </div>
              </div>
              <div
                class="flex items-center justify-between pt-space-xs text-body-sm font-body-sm text-outline"
              >
                <div class="flex items-center gap-space-sm">
                  <span class="flex items-center gap-1 text-primary"
                    ><span class="w-2 h-2 rounded bg-primary inline-block"></span> 8 Active
                    Clocks</span
                  >
                  <span class="flex items-center gap-1"
                    ><span class="w-2 h-2 rounded bg-surface-container-highest inline-block"></span>
                    14 Validated Slates</span
                  >
                </div>
                <button
                  class="text-secondary hover:text-primary transition-colors flex items-center gap-1 font-title-md text-title-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>Manage Round 7 Clocks</span>
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
              </div>
            </div>
            <!-- Season Standings Table Preview -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-md flex flex-col gap-space-md"
            >
              <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-sm">
                <div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[20px] text-secondary"
                      aria-hidden="true"
                      >leaderboard</span
                    >
                    <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                      Championship Standings
                    </h2>
                  </div>
                  <p class="font-body-sm text-body-sm text-outline">
                    Official scoring formula: Win (+20 pts) | Draw (+10 pts) | Loss (0 pts)
                  </p>
                </div>
                <div class="flex items-center gap-space-xs">
                  <button
                    class="px-space-sm py-1 rounded bg-surface-container text-on-surface-variant hover:text-on-surface text-body-sm font-body-sm transition-colors"
                    disabled
                    title="Design preview"
                  >
                    Filter by skill tier
                  </button>
                  <button
                    class="px-space-sm py-1 rounded bg-primary-container text-on-primary-container font-semibold text-body-sm font-body-sm"
                    disabled
                    title="Design preview"
                  >
                    View All 64 Players
                  </button>
                </div>
              </div>
              <!-- Standings Table -->
              <div class="overflow-x-auto">
                <table class="w-full text-left font-body-md text-body-md">
                  <thead>
                    <tr
                      class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                    >
                      <th class="py-space-sm px-space-md rounded-l-lg">Pos</th>
                      <th class="py-space-sm px-space-md">Player Identity</th>
                      <th class="py-space-sm px-space-md text-center">Record (W-D-L)</th>
                      <th class="py-space-sm px-space-md text-center">Win Rate</th>
                      <th class="py-space-sm px-space-md text-center">Buchholz</th>
                      <th class="py-space-sm px-space-md text-right rounded-r-lg">Score</th>
                    </tr>
                  </thead>
                  <tbody class="divide-y-0">
                    <!-- Rank 1: Adam Chen -->
                    <tr class="hover:bg-surface-container transition-colors group">
                      <td class="py-space-sm px-space-md">
                        <div
                          class="w-6 h-6 rounded-full bg-primary/20 text-primary flex items-center justify-center font-bold font-label-numeric-md text-label-numeric-md"
                        >
                          1
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-full bg-surface-container-high flex items-center justify-center font-semibold text-on-surface font-body-sm text-body-sm"
                          >
                            AC
                          </div>
                          <div class="flex flex-col">
                            <div class="flex items-center gap-1.5">
                              <span
                                class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                                >Adam Chen</span
                              >
                              <span
                                class="px-1 py-0.2 rounded bg-surface-container-highest text-primary font-label-badge text-label-badge"
                                >GM</span
                              >
                            </div>
                            <span class="font-body-sm text-body-sm text-outline"
                              >USCF 2548 • Master Tier</span
                            >
                          </div>
                        </div>
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        <span class="text-primary font-semibold">15</span> -
                        <span class="text-secondary">3</span> - <span class="text-error">2</span>
                      </td>
                      <td class="py-space-sm px-space-md text-center">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >75.0%</span
                        >
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-outline"
                      >
                        184.5
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <span
                          class="inline-flex items-center px-2 py-0.5 rounded bg-primary-container text-on-primary-container font-label-numeric-md text-label-numeric-md font-bold"
                        >
                          330 PTS
                        </span>
                      </td>
                    </tr>
                    <!-- Rank 2: Youssef M. -->
                    <tr class="hover:bg-surface-container transition-colors group">
                      <td class="py-space-sm px-space-md">
                        <div
                          class="w-6 h-6 rounded-full bg-surface-container-highest text-on-surface-variant flex items-center justify-center font-bold font-label-numeric-md text-label-numeric-md"
                        >
                          2
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-full bg-surface-container-high flex items-center justify-center font-semibold text-on-surface font-body-sm text-body-sm"
                          >
                            YM
                          </div>
                          <div class="flex flex-col">
                            <div class="flex items-center gap-1.5">
                              <span
                                class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                                >Youssef M.</span
                              >
                              <span
                                class="px-1 py-0.2 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge"
                                >IM</span
                              >
                            </div>
                            <span class="font-body-sm text-body-sm text-outline"
                              >FIDE 2420 • Master Tier</span
                            >
                          </div>
                        </div>
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        <span class="text-primary font-semibold">13</span> -
                        <span class="text-secondary">2</span> - <span class="text-error">5</span>
                      </td>
                      <td class="py-space-sm px-space-md text-center">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >65.0%</span
                        >
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-outline"
                      >
                        179.0
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <span
                          class="inline-flex items-center px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-numeric-md text-label-numeric-md font-bold"
                        >
                          280 PTS
                        </span>
                      </td>
                    </tr>
                    <!-- Rank 3: Omar Farooq -->
                    <tr class="hover:bg-surface-container transition-colors group">
                      <td class="py-space-sm px-space-md">
                        <div
                          class="w-6 h-6 rounded-full bg-surface-container-highest text-on-surface-variant flex items-center justify-center font-bold font-label-numeric-md text-label-numeric-md"
                        >
                          3
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-full bg-surface-container-high flex items-center justify-center font-semibold text-on-surface font-body-sm text-body-sm"
                          >
                            OF
                          </div>
                          <div class="flex flex-col">
                            <div class="flex items-center gap-1.5">
                              <span
                                class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                                >Omar Farooq</span
                              >
                              <span
                                class="px-1 py-0.2 rounded bg-surface-container-highest text-outline font-label-badge text-label-badge"
                                >FM</span
                              >
                            </div>
                            <span class="font-body-sm text-body-sm text-outline"
                              >FIDE 2315 • Candidate</span
                            >
                          </div>
                        </div>
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        <span class="text-primary font-semibold">11</span> -
                        <span class="text-secondary">3</span> - <span class="text-error">6</span>
                      </td>
                      <td class="py-space-sm px-space-md text-center">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >55.0%</span
                        >
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-outline"
                      >
                        172.0
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <span
                          class="inline-flex items-center px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-numeric-md text-label-numeric-md font-bold"
                        >
                          250 PTS
                        </span>
                      </td>
                    </tr>
                    <!-- Rank 4: Amine Rahmani -->
                    <tr class="hover:bg-surface-container transition-colors group">
                      <td class="py-space-sm px-space-md">
                        <div
                          class="w-6 h-6 rounded-full bg-surface-container-highest text-outline flex items-center justify-center font-semibold font-label-numeric-md text-label-numeric-md"
                        >
                          4
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-full bg-surface-container-high flex items-center justify-center font-semibold text-on-surface font-body-sm text-body-sm"
                          >
                            AR
                          </div>
                          <div class="flex flex-col">
                            <div class="flex items-center gap-1.5">
                              <span
                                class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                                >Amine Rahmani</span
                              >
                              <span
                                class="px-1 py-0.2 rounded bg-surface-container-highest text-outline font-label-badge text-label-badge"
                                >NM</span
                              >
                            </div>
                            <span class="font-body-sm text-body-sm text-outline"
                              >FIDE 2260 • National Master</span
                            >
                          </div>
                        </div>
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        <span class="text-primary font-semibold">9</span> -
                        <span class="text-secondary">2</span> - <span class="text-error">9</span>
                      </td>
                      <td class="py-space-sm px-space-md text-center">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >45.0%</span
                        >
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-outline"
                      >
                        166.5
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <span
                          class="inline-flex items-center px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-numeric-md text-label-numeric-md font-bold"
                        >
                          200 PTS
                        </span>
                      </td>
                    </tr>
                    <!-- Rank 5: Hamza Tazi -->
                    <tr class="hover:bg-surface-container transition-colors group">
                      <td class="py-space-sm px-space-md">
                        <div
                          class="w-6 h-6 rounded-full bg-surface-container-highest text-outline flex items-center justify-center font-semibold font-label-numeric-md text-label-numeric-md"
                        >
                          5
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-full bg-surface-container-high flex items-center justify-center font-semibold text-on-surface font-body-sm text-body-sm"
                          >
                            HT
                          </div>
                          <div class="flex flex-col">
                            <div class="flex items-center gap-1.5">
                              <span
                                class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                                >Hamza Tazi</span
                              >
                            </div>
                            <span class="font-body-sm text-body-sm text-outline"
                              >FIDE 2190 • Club Challenger</span
                            >
                          </div>
                        </div>
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        <span class="text-primary font-semibold">7</span> -
                        <span class="text-secondary">1</span> - <span class="text-error">12</span>
                      </td>
                      <td class="py-space-sm px-space-md text-center">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >35.0%</span
                        >
                      </td>
                      <td
                        class="py-space-sm px-space-md text-center font-label-numeric-md text-label-numeric-md text-outline"
                      >
                        158.0
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <span
                          class="inline-flex items-center px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-numeric-md text-label-numeric-md font-bold"
                        >
                          150 PTS
                        </span>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
          <!-- RIGHT PANEL: Projected Champion Honor Card + Recent Match Slates (4 cols) -->
          <div class="xl:col-span-4 flex flex-col gap-space-lg">
            <!-- Season Champion / Projected Honor Card -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-md relative overflow-hidden flex flex-col justify-between"
            >
              <div
                class="absolute -right-12 -top-12 w-40 h-40 rounded-full bg-primary/10 blur-3xl pointer-events-none"
              ></div>
              <div>
                <div class="flex items-center justify-between pb-space-sm">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-secondary flex items-center gap-1"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >stars</span
                    >
                    Projected Champion
                  </span>
                  <span
                    class="px-2 py-0.5 rounded-full bg-surface-container-high text-outline font-label-badge text-label-badge"
                    >94.2% Prob.</span
                  >
                </div>
                <div class="flex items-center gap-space-md pt-space-sm">
                  <div class="relative">
                    <div
                      class="w-16 h-16 rounded-xl bg-surface-container-highest flex items-center justify-center font-headline-md text-headline-md font-bold text-primary"
                    >
                      AC
                    </div>
                    <div
                      class="absolute -bottom-1 -right-1 w-6 h-6 rounded-full bg-primary text-on-primary flex items-center justify-center"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >military_tech</span
                      >
                    </div>
                  </div>
                  <div class="flex flex-col">
                    <div class="flex items-center gap-1.5">
                      <h3 class="font-headline-sm text-headline-sm text-on-surface font-bold">
                        Adam Chen
                      </h3>
                      <span
                        class="px-1.5 rounded bg-primary-container text-on-primary-container font-label-badge text-label-badge"
                        >GM</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-outline"
                      >Lead Margin: +50 Points</span
                    >
                    <span class="font-label-numeric-md text-label-numeric-md text-secondary pt-0.5"
                      >Rating Delta: +24.8 FIDE</span
                    >
                  </div>
                </div>
                <div
                  class="pt-space-md flex flex-col gap-space-xs text-body-sm font-body-sm text-on-surface-variant"
                >
                  <div
                    class="flex items-center justify-between py-1 bg-surface-container px-space-sm rounded"
                  >
                    <span class="text-outline">Remaining Matchups</span>
                    <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                      >3 Games (2 as White)</span
                    >
                  </div>
                  <div
                    class="flex items-center justify-between py-1 bg-surface-container px-space-sm rounded"
                  >
                    <span class="text-outline">Magic Number for Title</span>
                    <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                      >1 Win or 2 Draws</span
                    >
                  </div>
                </div>
              </div>
              <div class="pt-space-md">
                <button
                  class="w-full py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface transition-colors font-title-md text-title-md flex items-center justify-center gap-space-xs"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >workspace_premium</span
                  >
                  <span>View Trophy Ceremony Protocol</span>
                </button>
              </div>
            </div>
            <!-- Live & Recent Completed Matches (Tactile Split Cards) -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-[20px] text-primary"
                    aria-hidden="true"
                    >history</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                    Recent Validations
                  </h2>
                </div>
                <span class="font-label-badge text-label-badge text-outline">Round 7 Feed</span>
              </div>
              <!-- Match Slate 1 -->
              <div
                class="p-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex flex-col gap-space-xs"
              >
                <div
                  class="flex items-center justify-between text-outline font-label-badge text-label-badge"
                >
                  <span>BOARD 01 • TABLE A</span>
                  <span
                    class="px-2 py-0.5 rounded bg-primary/20 text-primary font-label-numeric-md text-label-numeric-md font-bold"
                    >1 - 0</span
                  >
                </div>
                <div class="flex items-center justify-between gap-space-sm pt-space-xs">
                  <!-- White Player -->
                  <div class="flex items-center gap-2 min-w-0 flex-1">
                    <div
                      class="w-5 h-5 rounded-full bg-on-surface text-surface flex items-center justify-center font-bold text-[10px]"
                    >
                      W
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold truncate"
                        >Adam Chen</span
                      >
                      <span class="font-body-sm text-body-sm text-primary">+20 PTS (330)</span>
                    </div>
                  </div>
                  <span class="text-outline text-body-sm font-bold font-body-sm px-1">vs</span>
                  <!-- Black Player -->
                  <div class="flex items-center gap-2 min-w-0 flex-1 justify-end text-right">
                    <div class="flex flex-col min-w-0">
                      <span
                        class="font-title-md text-title-md text-on-surface-variant font-medium truncate"
                        >Hamza Tazi</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">0 PTS (150)</span>
                    </div>
                    <div
                      class="w-5 h-5 rounded-full bg-surface-container-lowest text-on-surface-variant flex items-center justify-center font-bold text-[10px]"
                    >
                      B
                    </div>
                  </div>
                </div>
                <div class="flex items-center justify-between pt-space-xs text-[11px] text-outline">
                  <span>44 Moves (Sicilian Defense, Najdorf)</span>
                  <span class="text-secondary flex items-center gap-0.5">
                    <span class="material-symbols-outlined text-[13px]" aria-hidden="true"
                      >check_circle</span
                    >
                    Arbiter Validated
                  </span>
                </div>
              </div>
              <!-- Match Slate 2 -->
              <div
                class="p-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex flex-col gap-space-xs"
              >
                <div
                  class="flex items-center justify-between text-outline font-label-badge text-label-badge"
                >
                  <span>BOARD 02 • TABLE B</span>
                  <span
                    class="px-2 py-0.5 rounded bg-secondary-container/50 text-secondary font-label-numeric-md text-label-numeric-md font-bold"
                    >½ - ½</span
                  >
                </div>
                <div class="flex items-center justify-between gap-space-sm pt-space-xs">
                  <!-- White Player -->
                  <div class="flex items-center gap-2 min-w-0 flex-1">
                    <div
                      class="w-5 h-5 rounded-full bg-on-surface text-surface flex items-center justify-center font-bold text-[10px]"
                    >
                      W
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold truncate"
                        >Youssef M.</span
                      >
                      <span class="font-body-sm text-body-sm text-secondary">+10 PTS (280)</span>
                    </div>
                  </div>
                  <span class="text-outline text-body-sm font-bold font-body-sm px-1">vs</span>
                  <!-- Black Player -->
                  <div class="flex items-center gap-2 min-w-0 flex-1 justify-end text-right">
                    <div class="flex flex-col min-w-0">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold truncate"
                        >Omar Farooq</span
                      >
                      <span class="font-body-sm text-body-sm text-secondary">+10 PTS (250)</span>
                    </div>
                    <div
                      class="w-5 h-5 rounded-full bg-surface-container-lowest text-on-surface-variant flex items-center justify-center font-bold text-[10px]"
                    >
                      B
                    </div>
                  </div>
                </div>
                <div class="flex items-center justify-between pt-space-xs text-[11px] text-outline">
                  <span>62 Moves (Ruy Lopez, Closed Berlin)</span>
                  <span class="text-secondary flex items-center gap-0.5">
                    <span class="material-symbols-outlined text-[13px]" aria-hidden="true"
                      >check_circle</span
                    >
                    Arbiter Validated
                  </span>
                </div>
              </div>
              <!-- Match Slate 3 (Live / In Play) -->
              <div
                class="p-space-md rounded-lg bg-surface-container-high hover:bg-surface-bright transition-colors flex flex-col gap-space-xs"
              >
                <div
                  class="flex items-center justify-between text-outline font-label-badge text-label-badge"
                >
                  <span class="text-primary font-semibold flex items-center gap-1">
                    <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                    BOARD 03 • CLOCK ACTIVE
                  </span>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-mono"
                    >18:42 / 12:15</span
                  >
                </div>
                <div class="flex items-center justify-between gap-space-sm pt-space-xs">
                  <div class="flex items-center gap-2 min-w-0 flex-1">
                    <div
                      class="w-5 h-5 rounded-full bg-on-surface text-surface flex items-center justify-center font-bold text-[10px]"
                    >
                      W
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold truncate"
                        >Amine Rahmani</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">Move 31</span>
                    </div>
                  </div>
                  <span class="text-outline text-body-sm font-bold font-body-sm px-1">vs</span>
                  <div class="flex items-center gap-2 min-w-0 flex-1 justify-end text-right">
                    <div class="flex flex-col min-w-0">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold truncate"
                        >S. Benali</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">Move 30</span>
                    </div>
                    <div
                      class="w-5 h-5 rounded-full bg-surface-container-lowest text-on-surface-variant flex items-center justify-center font-bold text-[10px]"
                    >
                      B
                    </div>
                  </div>
                </div>
                <div class="flex items-center justify-between pt-space-xs text-[11px]">
                  <span class="text-outline">King's Indian Attack</span>
                  <button
                    class="text-primary font-title-md text-title-md hover:underline flex items-center gap-0.5"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span>Intervene Slate</span>
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >open_in_new</span
                    >
                  </button>
                </div>
              </div>
              <button
                class="w-full py-space-sm rounded-lg bg-surface-container text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors font-title-md text-title-md text-center"
                type="button"
                disabled
                title="Design preview"
              >
                Open Live Arbitration Console
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
