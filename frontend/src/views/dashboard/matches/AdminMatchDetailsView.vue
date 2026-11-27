<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Top Context Header & Actions -->
        <div
          class="flex flex-col md:flex-row md:items-center justify-between gap-space-md py-space-lg"
        >
          <div class="flex flex-col gap-space-xs">
            <!-- Breadcrumbs -->
            <nav class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline">
              <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard"
                >Dashboard</RouterLink
              >
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard/matches"
                >Matches</RouterLink
              >
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="font-label-numeric-md text-label-numeric-md text-primary font-semibold"
                >Match #CH-2025-091</span
              >
            </nav>
            <!-- Main Headline & Status Pill -->
            <div class="flex items-center gap-space-md flex-wrap pt-space-xs">
              <h1
                class="font-headline-lg text-headline-lg text-on-surface font-bold tracking-tight"
              >
                Match Details &amp; Result Validation
              </h1>
              <div
                class="flex items-center gap-space-xs px-space-md py-space-xs rounded-full bg-secondary-container text-on-secondary-container shadow-sm"
              >
                <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                  >Awaiting Validation</span
                >
              </div>
            </div>
            <p class="font-body-sm text-body-sm text-on-surface-variant">
              Review formal match credentials, player acceptance statuses, and submit official
              adjudication score.
            </p>
          </div>
          <!-- Top Action Toolbar -->
          <div class="flex items-center gap-space-sm flex-wrap self-start md:self-center">
            <RouterLink
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors font-title-md text-title-md shadow-sm"
              to="/dashboard/matches/sample-match/edit"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >edit_calendar</span
              >
              <span>Reschedule</span>
            </RouterLink>
            <button
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors font-title-md text-title-md shadow-sm"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">print</span>
              <span>Scoresheet</span>
            </button>
            <button
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-error-container text-on-error-container hover:opacity-90 transition-opacity font-title-md text-title-md shadow-sm"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">cancel</span>
              <span>Cancel Match</span>
            </button>
          </div>
        </div>
        <!-- Primary Asymmetric Grid Layout -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop mt-space-sm">
          <!-- Left Column: Match Metadata, Head-to-Head & Arbiter Validation Engine (8 Cols) -->
          <div class="lg:col-span-8 flex flex-col gap-space-lg">
            <!-- Match Metadata Ribbon Cards -->
            <div class="grid grid-cols-2 md:grid-cols-4 gap-space-md">
              <div
                class="p-space-md rounded-xl bg-surface-container-low flex flex-col justify-between shadow-sm"
              >
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Tournament Season</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-sm">
                  <span class="font-title-md text-title-md text-on-surface font-semibold truncate"
                    >Spring League 2025</span
                  >
                </div>
                <span
                  class="font-body-sm text-body-sm text-primary mt-space-xs flex items-center gap-space-xs"
                >
                  <span class="w-1.5 h-1.5 rounded-full bg-primary"></span> Tier 1 Classical
                </span>
              </div>
              <div
                class="p-space-md rounded-xl bg-surface-container-low flex flex-col justify-between shadow-sm"
              >
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Schedule Time</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-sm">
                  <span class="font-title-md text-title-md text-on-surface font-semibold"
                    >Apr 15, 2025</span
                  >
                </div>
                <span
                  class="font-label-numeric-md text-label-numeric-md text-on-surface-variant mt-space-xs"
                  >18:30 UTC</span
                >
              </div>
              <div
                class="p-space-md rounded-xl bg-surface-container-low flex flex-col justify-between shadow-sm"
              >
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Arbiter Arena</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-sm">
                  <span class="font-title-md text-title-md text-on-surface font-semibold truncate"
                    >Club Hall A</span
                  >
                </div>
                <span class="font-body-sm text-body-sm text-on-surface-variant mt-space-xs"
                  >Table 01 • DGT Board</span
                >
              </div>
              <div
                class="p-space-md rounded-xl bg-surface-container-low flex flex-col justify-between shadow-sm"
              >
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Time Control</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-sm">
                  <span class="font-title-md text-title-md text-on-surface font-semibold"
                    >Classical</span
                  >
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-secondary mt-space-xs"
                  >90m + 30s inc</span
                >
              </div>
            </div>
            <!-- Player Pairings & Acceptance Status Card -->
            <div
              class="p-space-lg rounded-xl bg-surface-container shadow-md flex flex-col gap-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >sports_kabaddi</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                    Player Pairings &amp; Status
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-widest"
                  >FIDE Certified Match</span
                >
              </div>
              <!-- Pairing Duel Split Container -->
              <div
                class="grid grid-cols-1 md:grid-cols-11 items-center gap-space-md p-space-md rounded-xl bg-surface-container-lowest"
              >
                <!-- White Player -->
                <div
                  class="md:col-span-5 flex flex-col gap-space-md p-space-md rounded-lg bg-surface-container-low"
                >
                  <div class="flex items-center justify-between">
                    <span
                      class="px-space-sm py-space-xs rounded bg-surface-bright text-on-surface font-label-badge text-label-badge font-bold uppercase tracking-wider flex items-center gap-space-xs"
                    >
                      <span class="w-2.5 h-2.5 rounded-full bg-white"></span> WHITE PIECES
                    </span>
                    <span
                      class="font-label-badge text-label-badge text-secondary font-semibold bg-secondary-container px-space-sm py-space-xs rounded-full flex items-center gap-space-xs"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >verified</span
                      >
                      Accepted
                    </span>
                  </div>
                  <div class="flex items-center gap-space-md">
                    <img
                      class="w-16 h-16 rounded-xl object-cover shadow-sm bg-surface-bright"
                      data-alt="Close up athletic headshot portrait of modern chess grandmaster Alex Rivera dressed in sharp dark charcoal tournament suit with direct analytical gaze in cinematic low key lighting"
                      src="/images/a046ebcc6fb8.webp"
                      alt=""
                    />
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface font-bold truncate"
                        >Alex Rivera</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Player ID: #AR-4890 • Active</span
                      >
                      <div class="flex items-center gap-space-xs mt-space-xs">
                        <span
                          class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                          >320</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Season Pts</span
                        >
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between text-on-surface-variant font-body-sm text-body-sm pt-space-xs bg-surface-container-lowest p-space-sm rounded"
                  >
                    <span class="text-outline">Invitation response:</span>
                    <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                      >Apr 10 • 14:20 UTC</span
                    >
                  </div>
                </div>
                <!-- VS Centerpiece Divider -->
                <div class="md:col-span-1 flex flex-col items-center justify-center py-space-xs">
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center font-headline-sm text-headline-sm text-outline font-bold shadow-inner"
                  >
                    VS
                  </div>
                </div>
                <!-- Black Player -->
                <div
                  class="md:col-span-5 flex flex-col gap-space-md p-space-md rounded-lg bg-surface-container-low"
                >
                  <div class="flex items-center justify-between">
                    <span
                      class="px-space-sm py-space-xs rounded bg-surface-bright text-on-surface font-label-badge text-label-badge font-bold uppercase tracking-wider flex items-center gap-space-xs"
                    >
                      <span class="w-2.5 h-2.5 rounded-full bg-surface-dim"></span> BLACK PIECES
                    </span>
                    <span
                      class="font-label-badge text-label-badge text-secondary font-semibold bg-secondary-container px-space-sm py-space-xs rounded-full flex items-center gap-space-xs"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >verified</span
                      >
                      Accepted
                    </span>
                  </div>
                  <div class="flex items-center gap-space-md">
                    <img
                      class="w-16 h-16 rounded-xl object-cover shadow-sm bg-surface-bright"
                      data-alt="Championship chess contender Tariq Al Mansoor intense profile portrait wearing a matte black blazer against a subtle dark green ambient studio lighting background"
                      src="/images/5b5d5969f1dc.webp"
                      alt=""
                    />
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface font-bold truncate"
                        >Tariq Al-Mansoor</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Player ID: #TM-2941 • Active</span
                      >
                      <div class="flex items-center gap-space-xs mt-space-xs">
                        <span
                          class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                          >180</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Season Pts</span
                        >
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex items-center justify-between text-on-surface-variant font-body-sm text-body-sm pt-space-xs bg-surface-container-lowest p-space-sm rounded"
                  >
                    <span class="text-outline">Invitation response:</span>
                    <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                      >Apr 11 • 09:15 UTC</span
                    >
                  </div>
                </div>
              </div>
              <!-- Informational Refusal Policy Callout -->
              <div
                class="flex items-start gap-space-md p-space-md rounded-lg bg-surface-container-low text-on-surface-variant"
              >
                <span
                  class="material-symbols-outlined text-outline text-[20px] mt-0.5"
                  aria-hidden="true"
                  >info</span
                >
                <div class="flex flex-col gap-space-xs">
                  <span class="font-title-md text-title-md text-on-surface font-semibold"
                    >Tournament Policy &amp; Refusal Protocol</span
                  >
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    In the event a player declines an invitation, their submitted statement will be
                    stamped here. Approved medical or emergency refusals allow rescheduling without
                    forfeit, whereas unexcused forfeits trigger a +20 automatic default point
                    allocation to the opponent under League By-law §4.2.
                  </p>
                </div>
              </div>
            </div>
            <!-- CRUCIAL: Official Result Validation Section -->
            <div
              class="p-space-lg rounded-xl bg-surface-container shadow-md flex flex-col gap-space-lg"
            >
              <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >fact_check</span
                  >
                  <div>
                    <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                      Official Result Validation
                    </h2>
                    <p class="font-body-sm text-body-sm text-outline">
                      Arbiter score endorsement and instant league standings recalculation
                    </p>
                  </div>
                </div>
                <span
                  class="font-label-badge text-label-badge text-primary bg-primary-container/20 text-primary-fixed px-space-sm py-space-xs rounded font-semibold uppercase tracking-wider"
                >
                  Chief Arbiter Action Required
                </span>
              </div>
              <!-- Result Options Selection Cards -->
              <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md" id="result-selection-group">
                <!-- Option 1: White Wins (Default Selected) -->
                <div
                  class="cursor-pointer p-space-md rounded-xl bg-surface-container-high ring-2 ring-primary flex flex-col justify-between transition-all hover:bg-surface-bright shadow-sm relative overflow-hidden"
                  id="option-white"
                >
                  <div class="flex items-center justify-between">
                    <span class="font-title-md text-title-md text-on-surface font-bold"
                      >White Wins</span
                    >
                    <div
                      class="w-6 h-6 rounded-full bg-primary flex items-center justify-center text-on-primary"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] font-bold"
                        aria-hidden="true"
                        >check</span
                      >
                    </div>
                  </div>
                  <div class="my-space-md flex flex-col">
                    <span
                      class="font-display-lg text-display-lg text-primary font-bold tracking-tight"
                      >1 – 0</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Alex Rivera prevails</span
                    >
                  </div>
                  <div
                    class="pt-space-sm flex flex-col gap-space-xs bg-surface-container-lowest p-space-sm rounded-lg"
                  >
                    <div class="flex justify-between items-center text-body-sm font-body-sm">
                      <span class="text-on-surface truncate">Rivera:</span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                        >+20 pts</span
                      >
                    </div>
                    <div class="flex justify-between items-center text-body-sm font-body-sm">
                      <span class="text-on-surface truncate">Al-Mansoor:</span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-outline font-bold"
                        >0 pts</span
                      >
                    </div>
                  </div>
                </div>
                <!-- Option 2: Black Wins -->
                <div
                  class="cursor-pointer p-space-md rounded-xl bg-surface-container-low flex flex-col justify-between transition-all hover:bg-surface-bright shadow-sm relative overflow-hidden"
                  id="option-black"
                >
                  <div class="flex items-center justify-between">
                    <span class="font-title-md text-title-md text-on-surface font-bold"
                      >Black Wins</span
                    >
                    <div
                      class="w-6 h-6 rounded-full bg-surface-container-highest flex items-center justify-center text-outline"
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >circle</span
                      >
                    </div>
                  </div>
                  <div class="my-space-md flex flex-col">
                    <span
                      class="font-display-lg text-display-lg text-on-surface font-bold tracking-tight"
                      >0 – 1</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Tariq Al-Mansoor prevails</span
                    >
                  </div>
                  <div
                    class="pt-space-sm flex flex-col gap-space-xs bg-surface-container-lowest p-space-sm rounded-lg"
                  >
                    <div class="flex justify-between items-center text-body-sm font-body-sm">
                      <span class="text-on-surface truncate">Rivera:</span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-outline font-bold"
                        >0 pts</span
                      >
                    </div>
                    <div class="flex justify-between items-center text-body-sm font-body-sm">
                      <span class="text-on-surface truncate">Al-Mansoor:</span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                        >+20 pts</span
                      >
                    </div>
                  </div>
                </div>
                <!-- Option 3: Draw -->
                <div
                  class="cursor-pointer p-space-md rounded-xl bg-surface-container-low flex flex-col justify-between transition-all hover:bg-surface-bright shadow-sm relative overflow-hidden"
                  id="option-draw"
                >
                  <div class="flex items-center justify-between">
                    <span class="font-title-md text-title-md text-on-surface font-bold">Draw</span>
                    <div
                      class="w-6 h-6 rounded-full bg-surface-container-highest flex items-center justify-center text-outline"
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >circle</span
                      >
                    </div>
                  </div>
                  <div class="my-space-md flex flex-col">
                    <span
                      class="font-display-lg text-display-lg text-secondary font-bold tracking-tight"
                      >½ – ½</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Split point allocation</span
                    >
                  </div>
                  <div
                    class="pt-space-sm flex flex-col gap-space-xs bg-surface-container-lowest p-space-sm rounded-lg"
                  >
                    <div class="flex justify-between items-center text-body-sm font-body-sm">
                      <span class="text-on-surface truncate">Rivera:</span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-secondary font-bold"
                        >+10 pts</span
                      >
                    </div>
                    <div class="flex justify-between items-center text-body-sm font-body-sm">
                      <span class="text-on-surface truncate">Al-Mansoor:</span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-secondary font-bold"
                        >+10 pts</span
                      >
                    </div>
                  </div>
                </div>
              </div>
              <!-- Seasonal Rules Notice Strip -->
              <div
                class="flex items-center gap-space-sm p-space-md rounded-lg bg-surface-container-lowest text-on-surface-variant"
              >
                <span
                  class="material-symbols-outlined text-primary text-[20px] flex-shrink-0"
                  aria-hidden="true"
                  >gavel</span
                >
                <p class="font-body-sm text-body-sm">
                  Submitting result will immediately update seasonal standings and player records.
                  Points rule: <strong class="text-on-surface">Win = +20</strong>,
                  <strong class="text-on-surface">Draw = +10</strong>,
                  <strong class="text-on-surface">Loss = 0</strong>. No Elo ratings used.
                </p>
              </div>
              <!-- Primary Action Trigger -->
              <div
                class="flex flex-col sm:flex-row items-center justify-between gap-space-md pt-space-xs"
              >
                <div class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >verified_user</span
                  >
                  <span>Recorded under digital signature of GM #1440</span>
                </div>
                <button
                  class="w-full sm:w-auto flex items-center justify-center gap-space-sm px-space-xl py-space-sm rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md font-bold shadow-md hover:opacity-95 transition-opacity"
                  id="trigger-validation-modal"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >how_to_reg</span
                  >
                  <span>Validate &amp; Record Result</span>
                </button>
              </div>
            </div>
          </div>
          <!-- Right Column: Verification Audit Timeline & Official Result Confirmation Card (4 Cols) -->
          <div class="lg:col-span-4 flex flex-col gap-space-lg">
            <!-- Active Standings Impact Preview Widget -->
            <div
              class="p-space-lg rounded-xl bg-surface-container shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Standings Projection</span
                >
                <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                  >Rnd 7 of 9</span
                >
              </div>
              <!-- Simulated mini-standings preview SVG / Bar -->
              <div class="flex flex-col gap-space-sm pt-space-xs">
                <div class="flex items-center justify-between text-body-sm font-body-sm">
                  <span class="text-on-surface font-medium">Alex Rivera</span>
                  <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                    >320 → 340 pts (#2)</span
                  >
                </div>
                <div class="w-full bg-surface-container-lowest h-2 rounded-full overflow-hidden">
                  <div class="bg-primary h-full rounded-full" style="width: 85%"></div>
                </div>
                <div
                  class="flex items-center justify-between text-body-sm font-body-sm mt-space-xs"
                >
                  <span class="text-on-surface font-medium">Tariq Al-Mansoor</span>
                  <span class="font-label-numeric-md text-label-numeric-md text-outline font-bold"
                    >180 → 180 pts (#8)</span
                  >
                </div>
                <div class="w-full bg-surface-container-lowest h-2 rounded-full overflow-hidden">
                  <div class="bg-outline h-full rounded-full" style="width: 45%"></div>
                </div>
              </div>
              <!-- Inline SVG Visualization Chart for Win Distribution -->
              <div
                class="mt-space-sm p-space-md rounded-lg bg-surface-container-lowest flex items-center justify-between"
              >
                <div class="flex flex-col">
                  <span class="font-body-sm text-body-sm text-outline"
                    >Projected Win Probability</span
                  >
                  <span
                    class="font-label-numeric-lg text-label-numeric-lg text-on-surface font-bold"
                    >64.2%</span
                  >
                </div>
                <svg class="w-16 h-16 text-primary" viewBox="0 0 36 36">
                  <path
                    class="text-surface-container-high"
                    d="M18 2.0845 a 15.9155 15.9155 0 0 1 0 31.831 a 15.9155 15.9155 0 0 1 0 -31.831"
                    fill="none"
                    stroke="currentColor"
                    stroke-width="3.5"
                  ></path>
                  <path
                    class="text-primary"
                    d="M18 2.0845 a 15.9155 15.9155 0 0 1 0 31.831 a 15.9155 15.9155 0 0 1 0 -31.831"
                    fill="none"
                    stroke="currentColor"
                    stroke-dasharray="64, 100"
                    stroke-linecap="round"
                    stroke-width="3.5"
                  ></path>
                </svg>
              </div>
            </div>
            <!-- Audit Timeline Card -->
            <div
              class="p-space-lg rounded-xl bg-surface-container shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-secondary text-[20px]"
                    aria-hidden="true"
                    >history</span
                  >
                  <h3 class="font-title-md text-title-md text-on-surface font-semibold">
                    Audit Timeline
                  </h3>
                </div>
                <span class="font-label-badge text-label-badge text-outline">4 Events</span>
              </div>
              <!-- Vertical Timeline Items -->
              <div class="relative flex flex-col gap-space-md pl-space-md">
                <!-- Continuous line drawn behind items -->
                <div
                  class="absolute left-2 top-2 bottom-2 w-0.5 bg-surface-container-highest"
                ></div>
                <!-- Event 1 -->
                <div class="relative flex items-start gap-space-md">
                  <div
                    class="w-4 h-4 rounded-full bg-secondary flex items-center justify-center -ml-[7px] mt-1 ring-4 ring-surface-container"
                  >
                    <span class="w-1.5 h-1.5 rounded-full bg-on-secondary"></span>
                  </div>
                  <div class="flex flex-col">
                    <span
                      class="font-title-md text-title-md text-on-surface font-medium leading-none"
                      >Black Accepted</span
                    >
                    <span class="font-body-sm text-body-sm text-outline mt-1"
                      >Tariq Al-Mansoor verified attendance</span
                    >
                    <span class="font-label-numeric-md text-label-numeric-md text-secondary mt-1"
                      >Apr 11, 2025 • 09:15 UTC</span
                    >
                  </div>
                </div>
                <!-- Event 2 -->
                <div class="relative flex items-start gap-space-md">
                  <div
                    class="w-4 h-4 rounded-full bg-secondary flex items-center justify-center -ml-[7px] mt-1 ring-4 ring-surface-container"
                  >
                    <span class="w-1.5 h-1.5 rounded-full bg-on-secondary"></span>
                  </div>
                  <div class="flex flex-col">
                    <span
                      class="font-title-md text-title-md text-on-surface font-medium leading-none"
                      >White Accepted</span
                    >
                    <span class="font-body-sm text-body-sm text-outline mt-1"
                      >Alex Rivera verified attendance</span
                    >
                    <span class="font-label-numeric-md text-label-numeric-md text-secondary mt-1"
                      >Apr 10, 2025 • 14:20 UTC</span
                    >
                  </div>
                </div>
                <!-- Event 3 -->
                <div class="relative flex items-start gap-space-md">
                  <div
                    class="w-4 h-4 rounded-full bg-surface-bright flex items-center justify-center -ml-[7px] mt-1 ring-4 ring-surface-container"
                  >
                    <span class="w-1.5 h-1.5 rounded-full bg-outline"></span>
                  </div>
                  <div class="flex flex-col">
                    <span
                      class="font-title-md text-title-md text-on-surface font-medium leading-none"
                      >Invitations Dispatched</span
                    >
                    <span class="font-body-sm text-body-sm text-outline mt-1"
                      >Automated bot pinged both players</span
                    >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant mt-1"
                      >Apr 08, 2025 • 10:05 UTC</span
                    >
                  </div>
                </div>
                <!-- Event 4 -->
                <div class="relative flex items-start gap-space-md">
                  <div
                    class="w-4 h-4 rounded-full bg-surface-bright flex items-center justify-center -ml-[7px] mt-1 ring-4 ring-surface-container"
                  >
                    <span class="w-1.5 h-1.5 rounded-full bg-outline"></span>
                  </div>
                  <div class="flex flex-col">
                    <span
                      class="font-title-md text-title-md text-on-surface font-medium leading-none"
                      >Match Created</span
                    >
                    <span class="font-body-sm text-body-sm text-outline mt-1"
                      >By Admin Sarah Jenkins</span
                    >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant mt-1"
                      >Apr 08, 2025 • 09:42 UTC</span
                    >
                  </div>
                </div>
              </div>
            </div>
            <!-- Match Regulatory Card -->
            <div
              class="p-space-md rounded-xl bg-surface-container-low shadow-sm flex items-center gap-space-md"
            >
              <span class="material-symbols-outlined text-outline text-[28px]" aria-hidden="true"
                >policy</span
              >
              <div class="flex flex-col">
                <span class="font-title-md text-title-md text-on-surface font-semibold"
                  >FIDE Laws of Chess</span
                >
                <span class="font-body-sm text-body-sm text-outline"
                  >Article 6 – Anti-Cheating Protocol Enacted</span
                >
              </div>
            </div>
          </div>
        </div>
        <!-- Embedded / Overlay Confirmation Dialog Modal -->
        <div
          class="fixed inset-0 z-50 flex items-center justify-center bg-black/80 backdrop-blur-sm p-space-md"
          id="confirmation-modal"
        >
          <div
            class="w-full max-w-lg rounded-xl bg-surface-container-high shadow-2xl p-space-xl flex flex-col gap-space-lg transform transition-all"
          >
            <!-- Modal Header -->
            <div class="flex items-center justify-between pb-space-xs">
              <div class="flex items-center gap-space-sm">
                <div
                  class="w-10 h-10 rounded-lg bg-primary-container flex items-center justify-center text-on-primary-container"
                >
                  <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                    >verified</span
                  >
                </div>
                <div>
                  <h3 class="font-headline-sm text-headline-sm text-on-surface font-bold">
                    Confirm Official Match Result
                  </h3>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Formal League Standings Adjudication</span
                  >
                </div>
              </div>
              <button
                class="text-outline hover:text-on-surface transition-colors p-space-xs"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">close</span>
              </button>
            </div>
            <!-- Match Result Summary Card -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-lowest flex flex-col items-center justify-center gap-space-sm"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                >Adjudicated Scoreline</span
              >
              <div
                class="font-display-lg text-display-lg text-primary font-bold tracking-tight"
                id="modal-scoreline"
              >
                1 – 0
              </div>
              <div class="flex items-center justify-center gap-space-md text-center pt-space-xs">
                <div class="flex flex-col items-end">
                  <span class="font-title-md text-title-md text-on-surface font-bold"
                    >Alex Rivera</span
                  >
                  <span class="font-body-sm text-body-sm text-outline">White Pieces</span>
                </div>
                <span class="font-headline-sm text-headline-sm text-outline font-bold">vs</span>
                <div class="flex flex-col items-start">
                  <span class="font-title-md text-title-md text-on-surface font-bold"
                    >Tariq Al-Mansoor</span
                  >
                  <span class="font-body-sm text-body-sm text-outline">Black Pieces</span>
                </div>
              </div>
            </div>
            <!-- Immediate Points Award Verification -->
            <div class="flex flex-col gap-space-xs bg-surface-container p-space-md rounded-lg">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Points Award Confirmation</span
              >
              <div class="flex items-center justify-between pt-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span class="w-2 h-2 rounded-full bg-primary"></span>
                  <span class="font-body-md text-body-md text-on-surface">Alex Rivera</span>
                </div>
                <span
                  class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                  id="modal-white-points"
                  >+20 pts</span
                >
              </div>
              <div class="flex items-center justify-between pt-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span class="w-2 h-2 rounded-full bg-surface-bright"></span>
                  <span class="font-body-md text-body-md text-on-surface">Tariq Al-Mansoor</span>
                </div>
                <span
                  class="font-label-numeric-md text-label-numeric-md text-outline font-bold"
                  id="modal-black-points"
                  >0 pts</span
                >
              </div>
            </div>
            <!-- Warning Disclaimer -->
            <div
              class="flex items-start gap-space-sm text-on-surface-variant text-body-sm font-body-sm"
            >
              <span
                class="material-symbols-outlined text-outline text-[18px] mt-0.5"
                aria-hidden="true"
                >lock</span
              >
              <span
                >Once confirmed, this match is officially sealed. Season standings will immediately
                lock and refresh.</span
              >
            </div>
            <!-- Modal Action Buttons -->
            <div class="flex items-center justify-end gap-space-md pt-space-xs">
              <button
                class="px-space-lg py-space-sm rounded-lg bg-surface-container text-on-surface hover:bg-surface-bright transition-colors font-title-md text-title-md font-semibold"
                type="button"
                disabled
                title="Design preview"
              >
                Go Back
              </button>
              <button
                class="px-space-xl py-space-sm rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md font-bold shadow-md hover:opacity-95 transition-opacity flex items-center gap-space-xs"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >verified</span
                >
                <span>Confirm &amp; Post Standings</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Interactive JavaScript logic for Result Selection and Modal State -->
      </div>
    </main>
  </DashboardLayout>
</template>
