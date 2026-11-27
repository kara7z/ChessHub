<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin md:px-margin-desktop bg-surface">
      <div class="flex flex-col w-full">
        <!-- Sub-Navigation / Dossier Context Header -->
        <div
          class="flex flex-col md:flex-row md:items-center justify-between gap-space-md pb-space-lg"
        >
          <div class="flex items-center gap-space-sm flex-wrap">
            <span
              class="inline-flex items-center gap-space-xs px-space-sm py-space-xs rounded bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface transition-colors font-body-sm text-body-sm"
              data-path="accounts"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                >arrow_back</span
              >
              <span>Back to Accounts</span>
            </span>
            <span class="text-outline text-body-sm">/</span>
            <span class="font-body-sm text-body-sm text-outline">Dossier</span>
            <span class="text-outline text-body-sm">/</span>
            <div
              class="flex items-center gap-space-xs px-space-xs py-0.5 rounded bg-surface-container-high"
            >
              <span class="material-symbols-outlined text-primary text-[14px]" aria-hidden="true"
                >badge</span
              >
              <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                >#CH-2044</span
              >
            </div>
            <span class="font-title-md text-title-md text-on-surface font-semibold"
              >Alex Rivera</span
            >
          </div>
          <div
            class="flex items-center gap-space-xs text-outline font-label-badge text-label-badge uppercase tracking-wider"
          >
            <span class="inline-block w-2 h-2 rounded-full bg-primary animate-pulse"></span>
            <span>Arbiter Clearance Level 4 • Read/Write Authorized</span>
          </div>
        </div>
        <!-- Primary Identity & Quick Action Dossier Banner -->
        <div
          class="relative overflow-hidden rounded-xl bg-surface-container-low shadow-xl mb-space-lg"
        >
          <div
            class="absolute -right-16 -top-16 w-80 h-80 bg-primary/5 rounded-full blur-3xl pointer-events-none"
          ></div>
          <div
            class="absolute -left-12 -bottom-12 w-64 h-64 bg-tertiary/5 rounded-full blur-2xl pointer-events-none"
          ></div>
          <div
            class="relative p-space-lg flex flex-col xl:flex-row xl:items-center justify-between gap-space-lg"
          >
            <!-- Player Metadata Head -->
            <div class="flex flex-col sm:flex-row items-start sm:items-center gap-space-lg">
              <div class="relative shrink-0">
                <img
                  class="w-24 h-24 rounded-xl object-cover shadow-md bg-surface-container-highest"
                  data-alt="A focused high-contrast photographic portrait of a competitive chess player named Alex Rivera in his late twenties wearing a dark textured blazer, subtle tournament venue shadows, neutral obsidian backdrop with faint ambient green rim light."
                  src="/images/31a1f6da1c6c.webp"
                  alt=""
                />
                <div
                  class="absolute -bottom-2 -right-2 px-space-xs py-0.5 rounded-full bg-surface-container-lowest text-primary text-[10px] font-label-badge uppercase tracking-wider flex items-center gap-1 shadow-sm"
                >
                  <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                  <span>VERIFIED</span>
                </div>
              </div>
              <div class="flex flex-col gap-1 min-w-0">
                <div class="flex flex-wrap items-center gap-space-sm">
                  <h1
                    class="font-headline-lg text-headline-lg text-on-surface font-bold tracking-tight"
                  >
                    Alex Rivera
                  </h1>
                  <span
                    class="px-space-sm py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge font-semibold tracking-wide uppercase"
                    >ACTIVE</span
                  >
                  <span
                    class="px-space-sm py-0.5 rounded bg-surface-container-high text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                    >#CH-2044</span
                  >
                </div>
                <div
                  class="flex flex-wrap items-center gap-y-1 gap-x-space-md text-on-surface-variant font-body-sm text-body-sm mt-0.5"
                >
                  <span class="text-secondary font-medium">@alex_rivera</span>
                  <span class="text-outline">•</span>
                  <span class="inline-flex items-center gap-1">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >chess</span
                    >
                    Role: <strong class="text-on-surface font-medium">Club Competitor</strong>
                  </span>
                  <span class="text-outline">•</span>
                  <span class="inline-flex items-center gap-1">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >network_intelligence</span
                    >
                    Tier:
                    <strong class="text-on-surface font-medium">Intermediate (League A)</strong>
                  </span>
                  <span class="text-outline">•</span>
                  <span class="inline-flex items-center gap-1">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                    Registered: Nov 14, 2023
                    <span class="text-outline text-body-sm">(18 mo ago)</span>
                  </span>
                </div>
              </div>
            </div>
            <!-- Action Control Palette -->
            <div
              class="flex flex-wrap sm:flex-nowrap items-center gap-space-xs shrink-0 pt-space-xs xl:pt-0"
            >
              <button
                class="inline-flex items-center gap-space-xs px-space-md py-space-sm rounded bg-error-container text-on-error-container hover:bg-error hover:text-on-error transition-colors font-title-md text-title-md font-semibold shadow-sm"
                id="btn-quick-suspend"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">gavel</span>
                <span>Suspend Account</span>
              </button>
              <button
                class="inline-flex items-center gap-space-xs px-space-md py-space-sm rounded bg-surface-container-high hover:bg-surface-bright text-on-surface transition-colors font-title-md text-title-md shadow-sm"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >mark_email_unread</span
                >
                <span>Send Notice</span>
              </button>
              <span
                class="inline-flex items-center gap-space-xs px-space-md py-space-sm rounded bg-surface-container-high hover:bg-surface-bright text-on-surface transition-colors font-title-md text-title-md shadow-sm"
                target="_blank"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >open_in_new</span
                >
                <span>Public Profile</span>
              </span>
              <button
                class="inline-flex items-center gap-space-xs px-space-sm py-space-sm rounded bg-surface-container-high hover:bg-surface-bright text-on-surface-variant hover:text-on-surface transition-colors shadow-sm"
                title="Generate temporary credentials dispatch"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >lock_reset</span
                >
              </button>
            </div>
          </div>
        </div>
        <!-- Main Split Layout -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-lg items-start">
          <!-- LEFT COLUMN (2/3 width = 8 cols) -->
          <div class="lg:col-span-8 flex flex-col gap-space-lg">
            <!-- Competitive Club Metrics Panel -->
            <div
              class="dashboard-panel relative flex flex-col gap-space-md overflow-hidden p-space-lg"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span class="w-2.5 h-2.5 rounded-full bg-primary"></span>
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                    Competitive League Statistics
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline px-space-sm py-0.5 rounded bg-surface-container"
                  >Points System • Non-Elo Standard</span
                >
              </div>
              <!-- Metric Bento Cards -->
              <div class="grid grid-cols-2 md:grid-cols-5 gap-space-sm">
                <!-- Season Points -->
                <div
                  class="flex flex-col justify-between p-space-md rounded-lg bg-surface-container shadow-sm"
                >
                  <span
                    class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                    >Season Score</span
                  >
                  <div class="flex items-baseline gap-1 mt-1">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
                      >320</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">pts</span>
                  </div>
                  <span
                    class="font-body-sm text-body-sm text-secondary mt-1 flex items-center gap-0.5"
                  >
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >trending_up</span
                    >
                    Top 5%
                  </span>
                </div>
                <!-- Standing Rank -->
                <div
                  class="flex flex-col justify-between p-space-md rounded-lg bg-surface-container shadow-sm"
                >
                  <span
                    class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                    >League Standings</span
                  >
                  <div class="flex items-baseline gap-1 mt-1">
                    <span
                      class="font-label-numeric-lg text-label-numeric-lg text-on-surface font-bold"
                      >#4</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">/ 96</span>
                  </div>
                  <span class="font-body-sm text-body-sm text-outline mt-1 truncate"
                    >Spring League '25</span
                  >
                </div>
                <!-- Completed Matches -->
                <div
                  class="flex flex-col justify-between p-space-md rounded-lg bg-surface-container shadow-sm"
                >
                  <span
                    class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                    >Fixtures</span
                  >
                  <div class="flex items-baseline gap-1 mt-1">
                    <span
                      class="font-label-numeric-lg text-label-numeric-lg text-on-surface font-bold"
                      >24</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">matches</span>
                  </div>
                  <div
                    class="font-body-sm text-body-sm flex items-center gap-1 mt-1 font-label-numeric-md"
                  >
                    <span class="text-primary font-semibold">14W</span>
                    <span class="text-outline">•</span>
                    <span class="text-secondary font-semibold">4D</span>
                    <span class="text-outline">•</span>
                    <span class="text-error font-semibold">6L</span>
                  </div>
                </div>
                <!-- Win Rate -->
                <div
                  class="flex flex-col justify-between p-space-md rounded-lg bg-surface-container shadow-sm"
                >
                  <span
                    class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                    >Win Ratio</span
                  >
                  <div class="flex items-baseline gap-1 mt-1">
                    <span
                      class="font-label-numeric-lg text-label-numeric-lg text-secondary font-bold"
                      >58.3%</span
                    >
                  </div>
                  <div
                    class="w-full bg-surface-container-highest rounded-full h-1.5 mt-2 overflow-hidden"
                  >
                    <div
                      class="bg-primary-container h-full rounded-full"
                      style="width: 58.3%"
                    ></div>
                  </div>
                </div>
                <!-- Attendance -->
                <div
                  class="col-span-2 md:col-span-1 flex flex-col justify-between p-space-md rounded-lg bg-surface-container shadow-sm"
                >
                  <span
                    class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                    >Attendance</span
                  >
                  <div class="flex items-baseline gap-1 mt-1">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
                      >100%</span
                    >
                  </div>
                  <span
                    class="font-body-sm text-body-sm text-on-surface-variant mt-1 flex items-center gap-0.5"
                  >
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >verified</span
                    >
                    Zero Forfeits
                  </span>
                </div>
              </div>
              <!-- Inline Visual Performance Trajectory -->
              <div
                class="p-space-md rounded-lg bg-surface-container flex flex-col md:flex-row items-center justify-between gap-space-md"
              >
                <div class="flex flex-col">
                  <span class="font-title-md text-title-md text-on-surface font-medium"
                    >Seasonal Points Accrual Trajectory</span
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Accumulated round scores across Swiss Rounds 1 through 8</span
                  >
                </div>
                <!-- Sparkline Mini Chart -->
                <div class="w-full md:w-64 h-12 flex items-end gap-1.5 px-space-xs py-1">
                  <div
                    class="flex-1 bg-surface-container-highest hover:bg-primary transition-colors rounded-t h-[30%] relative group"
                    title="R1: +20 pts"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-on-surface hidden group-hover:block whitespace-nowrap"
                    >
                      R1: +20
                    </div>
                  </div>
                  <div
                    class="flex-1 bg-surface-container-highest hover:bg-primary transition-colors rounded-t h-[48%] relative group"
                    title="R2: +20 pts"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-on-surface hidden group-hover:block whitespace-nowrap"
                    >
                      R2: +20
                    </div>
                  </div>
                  <div
                    class="flex-1 bg-surface-container-highest hover:bg-secondary transition-colors rounded-t h-[56%] relative group"
                    title="R3: +10 pts (Draw)"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-on-surface hidden group-hover:block whitespace-nowrap"
                    >
                      R3: +10
                    </div>
                  </div>
                  <div
                    class="flex-1 bg-surface-container-highest hover:bg-error transition-colors rounded-t h-[56%] relative group"
                    title="R4: 0 pts (Defeat)"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-on-surface hidden group-hover:block whitespace-nowrap"
                    >
                      R4: 0
                    </div>
                  </div>
                  <div
                    class="flex-1 bg-surface-container-highest hover:bg-primary transition-colors rounded-t h-[72%] relative group"
                    title="R5: +20 pts"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-on-surface hidden group-hover:block whitespace-nowrap"
                    >
                      R5: +20
                    </div>
                  </div>
                  <div
                    class="flex-1 bg-surface-container-highest hover:bg-primary transition-colors rounded-t h-[84%] relative group"
                    title="R6: +20 pts"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-on-surface hidden group-hover:block whitespace-nowrap"
                    >
                      R6: +20
                    </div>
                  </div>
                  <div
                    class="flex-1 bg-surface-container-highest hover:bg-secondary transition-colors rounded-t h-[90%] relative group"
                    title="R7: +10 pts"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-on-surface hidden group-hover:block whitespace-nowrap"
                    >
                      R7: +10
                    </div>
                  </div>
                  <div
                    class="flex-1 bg-primary rounded-t h-[100%] relative group"
                    title="R8: +20 pts"
                  >
                    <div
                      class="absolute -top-7 left-1/2 -translate-x-1/2 px-1 rounded bg-surface-container-lowest text-[10px] text-primary font-bold hidden group-hover:block whitespace-nowrap"
                    >
                      R8: +20
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- Personal & Contact Information -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-secondary text-[22px]"
                    aria-hidden="true"
                    >contact_mail</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                    Personal &amp; Player Profile
                  </h2>
                </div>
                <button
                  class="text-on-surface-variant hover:text-primary transition-colors text-body-sm font-body-sm inline-flex items-center gap-1"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true">edit</span>
                  <span>Edit Information</span>
                </button>
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <!-- Email Box -->
                <div class="p-space-md rounded-lg bg-surface-container flex flex-col gap-1">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Electronic Mail</span
                  >
                  <div class="flex flex-wrap items-center justify-between gap-space-xs">
                    <span class="font-title-md text-title-md text-on-surface select-all"
                      >alex.rivera@example.com</span
                    >
                    <span
                      class="inline-flex items-center gap-1 px-space-xs py-0.5 rounded bg-secondary-container text-on-secondary-container text-[11px] font-medium"
                    >
                      <span class="material-symbols-outlined text-[13px]" aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Verified</span>
                    </span>
                  </div>
                  <span class="font-body-sm text-body-sm text-outline mt-0.5"
                    >Primary notification and pairing recipient</span
                  >
                </div>
                <!-- Phone Box -->
                <div class="p-space-md rounded-lg bg-surface-container flex flex-col gap-1">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Primary Mobile Contact</span
                  >
                  <div class="flex items-center justify-between gap-space-xs">
                    <span class="font-title-md text-title-md text-on-surface select-all"
                      >+1 (555) 234-8901</span
                    >
                    <span
                      class="inline-flex items-center gap-1 px-space-xs py-0.5 rounded bg-surface-container-highest text-on-surface-variant text-[11px]"
                    >
                      <span class="material-symbols-outlined text-[13px]" aria-hidden="true"
                        >sms</span
                      >
                      <span>SMS Alert</span>
                    </span>
                  </div>
                  <span class="font-body-sm text-body-sm text-outline mt-0.5"
                    >Club SMS Dispatch enabled</span
                  >
                </div>
                <!-- Emergency Contact -->
                <div class="p-space-md rounded-lg bg-surface-container flex flex-col gap-1">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Emergency Contact</span
                  >
                  <div class="flex items-center justify-between">
                    <span class="font-title-md text-title-md text-on-surface"
                      >Elena Rivera (Spouse)</span
                    >
                    <span class="font-label-numeric-md text-label-numeric-md text-outline"
                      >+1 (555) 882-9011</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline mt-0.5"
                    >Authorized for tournament medical protocol</span
                  >
                </div>
                <!-- Preferred Openings -->
                <div class="p-space-md rounded-lg bg-surface-container flex flex-col gap-1">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Repertoire &amp; Openings</span
                  >
                  <div class="flex items-center gap-space-xs flex-wrap">
                    <span
                      class="px-space-xs py-0.5 rounded bg-surface-container-high text-on-surface font-body-sm text-body-sm"
                      >English Defense (1.c4)</span
                    >
                    <span
                      class="px-space-xs py-0.5 rounded bg-surface-container-high text-on-surface font-body-sm text-body-sm"
                      >Sicilian (1...c5)</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline mt-0.5"
                    >Aggressive tactical counter-puncher repertoire</span
                  >
                </div>
              </div>
              <!-- Tactical Bio -->
              <div class="p-space-md rounded-lg bg-surface-container flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Tactical Dossier &amp; Playing Style Bio</span
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Updated by Alex Rivera (Apr 2, 2025)</span
                  >
                </div>
                <p class="font-body-md text-body-md text-on-surface-variant leading-relaxed">
                  Positional technician with sharp tactical transitions in closed pawn centers.
                  Competes actively in Zurich Club weekend invitationals and Zurich Metropolitan
                  Rapid tournaments. Known for sharp rook endgame conversions and disciplined clock
                  pacing under 15+10 time controls.
                </p>
              </div>
            </div>
            <!-- Recent Match Activity -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >swords</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                    Recent Match Activity
                  </h2>
                </div>
                <span
                  class="text-primary hover:text-primary-fixed text-body-sm font-body-sm inline-flex items-center gap-1"
                  data-path="matches"
                >
                  <span>View Complete Match History (24)</span>
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >chevron_right</span
                  >
                </span>
              </div>
              <!-- Match List -->
              <div class="flex flex-col gap-space-xs">
                <!-- Match Row 1 -->
                <div
                  class="p-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div
                      class="w-10 h-10 rounded bg-surface-container-lowest flex items-center justify-center shrink-0"
                    >
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface"
                        >R8</span
                      >
                    </div>
                    <div class="flex flex-col min-w-0">
                      <div class="flex items-center gap-space-sm flex-wrap">
                        <!-- White Side -->
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface flex items-center gap-1"
                        >
                          <span class="w-2.5 h-2.5 rounded-sm bg-on-surface inline-block"></span>
                          Alex Rivera
                        </span>
                        <span
                          class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                          >1 - 0</span
                        >
                        <!-- Black Side -->
                        <span
                          class="font-title-md text-title-md text-on-surface-variant flex items-center gap-1"
                        >
                          <span
                            class="w-2.5 h-2.5 rounded-sm bg-surface-container-highest inline-block"
                          ></span>
                          M. Chen (#CH-1190)
                        </span>
                      </div>
                      <div
                        class="flex flex-wrap items-center gap-space-sm text-body-sm font-body-sm text-outline"
                      >
                        <span>Spring League • Board 2</span>
                        <span>•</span>
                        <span>English Opening (A10)</span>
                        <span>•</span>
                        <span>42 moves</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="px-space-sm py-1 rounded bg-secondary-container text-on-secondary-container font-label-numeric-md text-label-numeric-md font-bold"
                    >
                      +20 PTS
                    </span>
                    <span
                      class="p-space-xs text-outline hover:text-on-surface transition-colors"
                      title="Inspect PGN and Arbiter Sheet"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >chevron_right</span
                      >
                    </span>
                  </div>
                </div>
                <!-- Match Row 2 -->
                <div
                  class="p-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div
                      class="w-10 h-10 rounded bg-surface-container-lowest flex items-center justify-center shrink-0"
                    >
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface"
                        >R7</span
                      >
                    </div>
                    <div class="flex flex-col min-w-0">
                      <div class="flex items-center gap-space-sm flex-wrap">
                        <!-- White Side -->
                        <span
                          class="font-title-md text-title-md text-on-surface-variant flex items-center gap-1"
                        >
                          <span class="w-2.5 h-2.5 rounded-sm bg-on-surface inline-block"></span>
                          Viktor K. (#CH-0894)
                        </span>
                        <span
                          class="font-label-numeric-md text-label-numeric-md text-secondary font-bold"
                          >½ - ½</span
                        >
                        <!-- Black Side -->
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface flex items-center gap-1"
                        >
                          <span
                            class="w-2.5 h-2.5 rounded-sm bg-surface-container-highest inline-block"
                          ></span>
                          Alex Rivera
                        </span>
                      </div>
                      <div
                        class="flex flex-wrap items-center gap-space-sm text-body-sm font-body-sm text-outline"
                      >
                        <span>Spring League • Board 1</span>
                        <span>•</span>
                        <span>Sicilian Najdorf (B90)</span>
                        <span>•</span>
                        <span>58 moves (Repetition)</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="px-space-sm py-1 rounded bg-surface-container-highest text-secondary font-label-numeric-md text-label-numeric-md font-bold"
                    >
                      +10 PTS
                    </span>
                    <span
                      class="p-space-xs text-outline hover:text-on-surface transition-colors"
                      title="Inspect PGN and Arbiter Sheet"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >chevron_right</span
                      >
                    </span>
                  </div>
                </div>
                <!-- Match Row 3 -->
                <div
                  class="p-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div
                      class="w-10 h-10 rounded bg-surface-container-lowest flex items-center justify-center shrink-0"
                    >
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface"
                        >R6</span
                      >
                    </div>
                    <div class="flex flex-col min-w-0">
                      <div class="flex items-center gap-space-sm flex-wrap">
                        <!-- White Side -->
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface flex items-center gap-1"
                        >
                          <span class="w-2.5 h-2.5 rounded-sm bg-on-surface inline-block"></span>
                          Alex Rivera
                        </span>
                        <span
                          class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                          >1 - 0</span
                        >
                        <!-- Black Side -->
                        <span
                          class="font-title-md text-title-md text-on-surface-variant flex items-center gap-1"
                        >
                          <span
                            class="w-2.5 h-2.5 rounded-sm bg-surface-container-highest inline-block"
                          ></span>
                          D. Szekely (#CH-3310)
                        </span>
                      </div>
                      <div
                        class="flex flex-wrap items-center gap-space-sm text-body-sm font-body-sm text-outline"
                      >
                        <span>Spring League • Board 3</span>
                        <span>•</span>
                        <span>King's Indian Attack (A07)</span>
                        <span>•</span>
                        <span>34 moves (Checkmate)</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="px-space-sm py-1 rounded bg-secondary-container text-on-secondary-container font-label-numeric-md text-label-numeric-md font-bold"
                    >
                      +20 PTS
                    </span>
                    <span
                      class="p-space-xs text-outline hover:text-on-surface transition-colors"
                      title="Inspect PGN and Arbiter Sheet"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >chevron_right</span
                      >
                    </span>
                  </div>
                </div>
                <!-- Match Row 4 -->
                <div
                  class="p-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                >
                  <div class="flex items-center gap-space-md min-w-0">
                    <div
                      class="w-10 h-10 rounded bg-surface-container-lowest flex items-center justify-center shrink-0"
                    >
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface"
                        >R5</span
                      >
                    </div>
                    <div class="flex flex-col min-w-0">
                      <div class="flex items-center gap-space-sm flex-wrap">
                        <!-- White Side -->
                        <span
                          class="font-title-md text-title-md text-on-surface-variant flex items-center gap-1"
                        >
                          <span class="w-2.5 h-2.5 rounded-sm bg-on-surface inline-block"></span>
                          Laura Bianchi (#CH-1944)
                        </span>
                        <span
                          class="font-label-numeric-md text-label-numeric-md text-error font-bold"
                          >1 - 0</span
                        >
                        <!-- Black Side -->
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface flex items-center gap-1"
                        >
                          <span
                            class="w-2.5 h-2.5 rounded-sm bg-surface-container-highest inline-block"
                          ></span>
                          Alex Rivera
                        </span>
                      </div>
                      <div
                        class="flex flex-wrap items-center gap-space-sm text-body-sm font-body-sm text-outline"
                      >
                        <span>Spring League • Board 1</span>
                        <span>•</span>
                        <span>Caro-Kann Panov (B13)</span>
                        <span>•</span>
                        <span>29 moves (Resignation)</span>
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between sm:justify-end gap-space-md shrink-0"
                  >
                    <span
                      class="px-space-sm py-1 rounded bg-surface-container-highest text-outline font-label-numeric-md text-label-numeric-md font-semibold"
                    >
                      0 PTS
                    </span>
                    <span
                      class="p-space-xs text-outline hover:text-on-surface transition-colors"
                      title="Inspect PGN and Arbiter Sheet"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >chevron_right</span
                      >
                    </span>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- RIGHT COLUMN (1/3 width = 4 cols) -->
          <div class="lg:col-span-4 flex flex-col gap-space-lg">
            <!-- Administrative Moderation Actions Form -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center gap-space-sm">
                <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                  >admin_panel_settings</span
                >
                <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                  Moderation Action
                </h2>
              </div>
              <p class="font-body-sm text-body-sm text-outline">
                Execute status elevation or disciplinary sanction. All changes require an arbiter
                justification note.
              </p>
              <form class="flex flex-col gap-space-md" id="moderation-form" @submit.prevent="">
                <div class="flex flex-col gap-1">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="account-status"
                    >Designated Account Status</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container text-on-surface rounded-lg px-space-md py-space-sm appearance-none font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors cursor-pointer"
                      id="account-status"
                    >
                      <option selected value="ACTIVE">
                        Active • Fully Cleared for Competition
                      </option>
                      <option value="SUSPENDED">Suspended • Temporary League Ban</option>
                      <option value="REJECTED">
                        Rejected • Formal Disqualification / Expulsion
                      </option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-1">
                  <div class="flex items-center justify-between">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      for="arbiter-reason"
                      >Arbiter Note / Cause (Required)</label
                    >
                    <span class="text-[11px] text-primary font-medium"
                      >Recorded in immutable audit trail</span
                    >
                  </div>
                  <textarea
                    class="w-full bg-surface-container text-on-surface rounded-lg p-space-md font-body-md text-body-md placeholder:text-outline/70 focus:outline-none focus:bg-surface-container-high transition-colors resize-none"
                    id="arbiter-reason"
                    placeholder="Specify code violations, sanction justifications, or verification notes..."
                    required
                    rows="3"
                  ></textarea>
                </div>
                <button
                  class="w-full inline-flex items-center justify-center gap-space-xs px-space-md py-space-sm rounded-lg bg-primary-container text-on-primary-container hover:bg-primary transition-colors font-title-md text-title-md font-semibold shadow-sm"
                  type="submit"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >verified_user</span
                  >
                  <span>Apply Status Change</span>
                </button>
              </form>
            </div>
            <!-- Account Moderation Audit Trail -->
            <div
              class="rounded-xl bg-surface-container-low p-space-lg shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-secondary text-[20px]"
                    aria-hidden="true"
                    >history_edu</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                    Moderation Audit Log
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline px-space-xs py-0.5 rounded bg-surface-container"
                  >3 Entries</span
                >
              </div>
              <!-- Vertical Stepper Timeline -->
              <div
                class="relative pl-6 space-y-space-md before:absolute before:left-2 before:top-2 before:bottom-2 before:w-0.5 before:bg-surface-container-highest"
              >
                <!-- Event 1: Recent -->
                <div class="relative">
                  <div
                    class="absolute -left-6 top-1 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                  >
                    <div class="w-2 h-2 rounded-full bg-secondary"></div>
                  </div>
                  <div class="flex flex-col gap-0.5">
                    <div class="flex items-center justify-between flex-wrap gap-1">
                      <span class="font-title-md text-title-md text-on-surface font-medium"
                        >Profile Bio Updated</span
                      >
                      <span class="font-label-badge text-label-badge text-outline"
                        >Apr 2, 2025, 09:12 UTC</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-secondary font-medium"
                      >Player Self-Update</span
                    >
                    <p
                      class="font-body-sm text-body-sm text-on-surface-variant bg-surface-container p-space-sm rounded mt-1"
                    >
                      Modified tournament opening repertoires and personal play style dossier.
                    </p>
                  </div>
                </div>
                <!-- Event 2: Dispute -->
                <div class="relative">
                  <div
                    class="absolute -left-6 top-1 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                  >
                    <div class="w-2 h-2 rounded-full bg-primary"></div>
                  </div>
                  <div class="flex flex-col gap-0.5">
                    <div class="flex items-center justify-between flex-wrap gap-1">
                      <span class="font-title-md text-title-md text-on-surface font-medium"
                        >Match Dispute Resolved</span
                      >
                      <span class="font-label-badge text-label-badge text-outline"
                        >Feb 12, 2024, 18:20 UTC</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-primary font-medium"
                      >Arbiter: Marcus Vance (IA #108)</span
                    >
                    <p
                      class="font-body-sm text-body-sm text-on-surface-variant bg-surface-container p-space-sm rounded mt-1"
                    >
                      Reviewed physical scorepad for Round 3, validated 1-0 victory. Corrected
                      pairing desk table input.
                    </p>
                  </div>
                </div>
                <!-- Event 3: Account Approved -->
                <div class="relative">
                  <div
                    class="absolute -left-6 top-1 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                  >
                    <div class="w-2 h-2 rounded-full bg-primary-fixed-dim"></div>
                  </div>
                  <div class="flex flex-col gap-0.5">
                    <div class="flex items-center justify-between flex-wrap gap-1">
                      <span class="font-title-md text-title-md text-on-surface font-medium"
                        >Account Approved</span
                      >
                      <span class="font-label-badge text-label-badge text-outline"
                        >Nov 15, 2023, 10:45 UTC</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-primary font-medium"
                      >Admin: Sarah Jenkins (Lead Registrar)</span
                    >
                    <p
                      class="font-body-sm text-body-sm text-on-surface-variant bg-surface-container p-space-sm rounded mt-1"
                    >
                      Verified in-person club registration at Zürich HQ. Identity and emergency
                      contact credentials checked.
                    </p>
                  </div>
                </div>
              </div>
            </div>
            <!-- System Security & Session Log -->
            <div
              class="rounded-xl bg-surface-container-low p-space-lg shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center gap-space-sm">
                <span class="material-symbols-outlined text-outline text-[20px]" aria-hidden="true"
                  >security</span
                >
                <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                  Security &amp; Session Telemetry
                </h2>
              </div>
              <div class="flex flex-col gap-space-xs">
                <!-- IP -->
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex items-center justify-between"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >dns</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">Last Login IP</span>
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                    >194.22.81.4</span
                  >
                </div>
                <!-- Device -->
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex items-center justify-between"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >devices</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">Client Device</span>
                  </div>
                  <span class="font-body-sm text-body-sm text-on-surface"
                    >Desktop Chrome / macOS</span
                  >
                </div>
                <!-- 2FA -->
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex items-center justify-between"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-secondary text-[18px]"
                      aria-hidden="true"
                      >lock</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">Multi-Factor Auth</span>
                  </div>
                  <span
                    class="inline-flex items-center gap-1 font-body-sm text-body-sm text-secondary font-medium"
                  >
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >check</span
                    >
                    Club Authenticator (Active)
                  </span>
                </div>
                <!-- Session Expiry -->
                <div
                  class="p-space-sm rounded-lg bg-surface-container flex items-center justify-between"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >timer</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">Active Session</span>
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-outline"
                    >Expires in 6h 18m</span
                  >
                </div>
              </div>
              <button
                class="w-full text-center py-space-xs rounded bg-surface-container-high hover:bg-surface-bright text-error font-body-sm text-body-sm transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Revoke All Active Sessions
              </button>
            </div>
          </div>
        </div>
        <!-- Confirmation Modal (Hidden by Default) -->
        <div
          class="fixed inset-0 z-50 flex items-center justify-center p-space-md bg-surface-container-lowest/80 backdrop-blur-sm hidden"
          id="confirm-modal"
        >
          <div
            class="w-full max-w-md rounded-xl bg-surface-container p-space-lg shadow-2xl flex flex-col gap-space-md"
          >
            <div class="flex items-center gap-space-sm text-error">
              <span class="material-symbols-outlined text-[28px]" aria-hidden="true">warning</span>
              <h3 class="font-headline-sm text-headline-sm text-on-surface font-bold">
                Confirm Account Sanction
              </h3>
            </div>
            <p class="font-body-md text-body-md text-on-surface-variant leading-relaxed">
              You are about to update the status for
              <strong class="text-on-surface font-semibold">Alex Rivera (#CH-2044)</strong> to
              <span class="text-error font-bold uppercase" id="modal-target-status"></span>.
            </p>
            <div
              class="p-space-sm rounded bg-surface-container-high text-body-sm text-outline flex flex-col gap-1"
            >
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Recorded Justification:</span
              >
              <p class="italic text-on-surface" id="modal-justification"></p>
            </div>
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-space-md py-space-sm rounded bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel
              </button>
              <button
                class="px-space-md py-space-sm rounded bg-error text-on-error font-title-md text-title-md font-semibold hover:bg-error/90 transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Confirm &amp; Execute
              </button>
            </div>
          </div>
        </div>
        <!-- Toast Notification Box -->
        <div
          class="fixed bottom-6 right-6 z-50 px-space-md py-space-sm rounded-lg bg-surface-container-highest text-on-surface shadow-2xl flex items-center gap-space-sm transition-all transform translate-y-16 opacity-0 pointer-events-none"
          id="admin-toast"
        >
          <span
            class="material-symbols-outlined text-primary text-[20px]"
            id="toast-icon"
            aria-hidden="true"
            >check_circle</span
          >
          <span class="font-body-md text-body-md" id="toast-msg">Action completed.</span>
        </div>
        <!-- Inline Micro-Interactions Script -->
      </div>
    </main>
  </DashboardLayout>
</template>
