<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Top Context Header Area -->
        <div
          class="flex flex-col md:flex-row md:items-end justify-between gap-space-md py-space-lg"
        >
          <div class="flex flex-col gap-space-xs">
            <div class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
              <span class="hover:text-on-surface transition-colors cursor-pointer">Dashboard</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="hover:text-on-surface transition-colors cursor-pointer">Matches</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-primary font-medium">Schedule New Match</span>
            </div>
            <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
              Schedule Competitive Match
            </h1>
            <p class="font-body-md text-body-md text-on-surface-variant max-w-2xl">
              Pair two active club players for an official seasonal match fixture under club
              regulations.
            </p>
          </div>
          <div class="flex items-center gap-space-sm self-start md:self-auto">
            <div
              class="flex items-center gap-space-xs px-space-md py-space-xs rounded-lg bg-surface-container-high"
            >
              <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Arbiter Protocol Active</span
              >
            </div>
            <div
              class="px-space-md py-space-xs rounded-lg bg-surface-container font-label-numeric-md text-label-numeric-md text-outline"
            >
              Protocol #FX-8849
            </div>
          </div>
        </div>
        <!-- Primary Split Grid Layout -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop items-start">
          <!-- Left Column: Detailed Scheduling Form (7 Cols) -->
          <div class="lg:col-span-7 flex flex-col gap-space-lg">
            <!-- Form Section 1: Season & League Context -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >emoji_events</span
                  >
                  <span class="font-title-md text-title-md text-on-surface">Target Season</span>
                </div>
                <span
                  class="px-space-sm py-space-xs rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase"
                  >Active Season</span
                >
              </div>
              <div class="flex flex-col gap-space-xs">
                <label class="font-body-sm text-body-sm text-on-surface-variant"
                  >Selected Competition</label
                >
                <div class="relative">
                  <select
                    class="w-full bg-surface-container-lowest text-on-surface px-space-md py-space-sm rounded-lg font-body-md text-body-md appearance-none cursor-pointer focus:outline-none focus:ring-1 focus:ring-primary pr-10"
                  >
                    <option selected>Grandmaster Spring League 2025 (Active)</option>
                    <option disabled>Challengers Winter Invitational 2024 (Archived)</option>
                    <option disabled>Blitz Open Cup 2025 (Starting June)</option>
                  </select>
                  <span
                    class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                    aria-hidden="true"
                    >unfold_more</span
                  >
                </div>
                <div
                  class="flex items-center gap-space-xs mt-space-xs text-outline font-body-sm text-body-sm"
                >
                  <span
                    class="material-symbols-outlined text-[16px] text-secondary"
                    aria-hidden="true"
                    >info</span
                  >
                  <span
                    >Only active seasons can host official rated fixtures and accumulate seasonal
                    points.</span
                  >
                </div>
              </div>
            </div>
            <!-- Form Section 2: Player Selection & Pairings -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >swords</span
                  >
                  <span class="font-title-md text-title-md text-on-surface"
                    >Player Pairings &amp; Assigned Sides</span
                  >
                </div>
                <button
                  class="flex items-center gap-space-xs px-space-sm py-space-xs rounded bg-surface-container text-outline hover:text-on-surface transition-colors text-body-sm font-body-sm"
                  id="swap-players-btn"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >swap_horiz</span
                  >
                  <span>Swap Colors</span>
                </button>
              </div>
              <!-- White Player Input Group -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label
                    class="font-body-sm text-body-sm text-on-surface-variant flex items-center gap-space-xs"
                  >
                    <span class="w-3 h-3 rounded-full bg-on-surface inline-block"></span>
                    White Pieces (First Move)
                  </label>
                  <span class="font-label-badge text-label-badge text-primary uppercase"
                    >Confirmed Active</span
                  >
                </div>
                <div
                  class="relative flex items-center bg-surface-container-lowest rounded-lg p-space-xs"
                >
                  <div
                    class="w-9 h-9 rounded-lg bg-surface-container-high flex items-center justify-center text-on-surface"
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >circle</span
                    >
                  </div>
                  <input
                    class="w-full bg-transparent px-space-sm py-space-xs text-on-surface font-body-md text-body-md focus:outline-none"
                    id="white-input"
                    type="text"
                    value="Alex Rivera (@alex_rivera) — Active, Rank #4, 320 pts"
                  />
                  <button
                    class="text-outline hover:text-on-surface p-space-xs mr-space-xs"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >search</span
                    >
                  </button>
                </div>
              </div>
              <!-- Black Player Input Group -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label
                    class="font-body-sm text-body-sm text-on-surface-variant flex items-center gap-space-xs"
                  >
                    <span
                      class="w-3 h-3 rounded-full bg-surface-container-highest inline-block"
                    ></span>
                    Black Pieces
                  </label>
                  <span class="font-label-badge text-label-badge text-secondary uppercase"
                    >Eligible</span
                  >
                </div>
                <div
                  class="relative flex items-center bg-surface-container-lowest rounded-lg p-space-xs"
                >
                  <div
                    class="w-9 h-9 rounded-lg bg-surface-container-highest flex items-center justify-center text-outline"
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >radio_button_checked</span
                    >
                  </div>
                  <input
                    class="w-full bg-transparent px-space-sm py-space-xs text-on-surface font-body-md text-body-md focus:outline-none"
                    id="black-input"
                    type="text"
                    value="Tariq Al-Mansoor (@tariq_chess) — Active, Rank #8, 180 pts"
                  />
                  <button
                    class="text-outline hover:text-on-surface p-space-xs mr-space-xs"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >search</span
                    >
                  </button>
                </div>
              </div>
              <!-- Validation Notice Box -->
              <div
                class="p-space-md rounded-lg bg-surface-container-high flex items-start gap-space-sm"
              >
                <span
                  class="material-symbols-outlined text-primary text-[20px] shrink-0 mt-0.5"
                  aria-hidden="true"
                  >verified_user</span
                >
                <div class="flex flex-col gap-space-xs">
                  <span class="font-title-md text-title-md text-on-surface"
                    >Pairing Validation Passed</span
                  >
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    Players must be different active members. Neither player has an overlapping
                    confirmed fixture on this date.
                  </p>
                </div>
              </div>
            </div>
            <!-- Form Section 3: Match Schedule & Venue -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center gap-space-sm">
                <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                  >calendar_month</span
                >
                <span class="font-title-md text-title-md text-on-surface"
                  >Time, Board &amp; Time Control</span
                >
              </div>
              <!-- Date & Time Row -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant"
                    >Match Date</label
                  >
                  <div
                    class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-outline text-[18px] mr-space-sm"
                      aria-hidden="true"
                      >event</span
                    >
                    <input
                      class="bg-transparent text-on-surface font-body-md text-body-md focus:outline-none w-full"
                      id="match-date-input"
                      type="text"
                      value="April 22, 2025"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant"
                    >Starting Time (UTC)</label
                  >
                  <div
                    class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-outline text-[18px] mr-space-sm"
                      aria-hidden="true"
                      >schedule</span
                    >
                    <input
                      class="bg-transparent text-on-surface font-body-md text-body-md focus:outline-none w-full"
                      id="match-time-input"
                      type="text"
                      value="18:30 UTC"
                    />
                  </div>
                </div>
              </div>
              <!-- Venue & Time Control Row -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant"
                    >Venue / Board Assignment</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container-lowest text-on-surface px-space-md py-space-sm rounded-lg font-body-md text-body-md appearance-none cursor-pointer focus:outline-none focus:ring-1 focus:ring-primary pr-10"
                      id="board-select"
                    >
                      <option selected>Club Hall A — Board 3 (DGT Sensor Board)</option>
                      <option>Club Hall A — Board 1 (Broadcasting)</option>
                      <option>Club Hall A — Board 2 (DGT Sensor Board)</option>
                      <option>Club Annex — Board 7 (Analog Standard)</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >location_on</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant"
                    >Official Time Control</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container-lowest text-on-surface px-space-md py-space-sm rounded-lg font-body-md text-body-md appearance-none cursor-pointer focus:outline-none focus:ring-1 focus:ring-primary pr-10"
                    >
                      <option selected>Classical 90 min + 30 sec increment</option>
                      <option>Rapid 15 min + 10 sec increment</option>
                      <option>Blitz 5 min + 3 sec increment</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                      aria-hidden="true"
                      >timer</span
                    >
                  </div>
                </div>
              </div>
              <!-- Confirmation Deadline Notice -->
              <div class="flex flex-col gap-space-xs pt-space-xs">
                <label class="font-body-sm text-body-sm text-on-surface-variant"
                  >Invitation Response Deadline</label
                >
                <div
                  class="flex items-center justify-between bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                >
                  <div class="flex items-center gap-space-sm">
                    <span
                      class="material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >hourglass_top</span
                    >
                    <span class="font-body-md text-body-md text-on-surface"
                      >April 20, 2025, 23:59 UTC (48 hours before match)</span
                    >
                  </div>
                  <span class="font-label-badge text-label-badge uppercase text-secondary"
                    >Auto-Forfeit Protocol</span
                  >
                </div>
              </div>
            </div>
            <!-- Form Section 4: Arbiter & Protocol Notes -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center gap-space-sm">
                <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                  >assignment</span
                >
                <span class="font-title-md text-title-md text-on-surface"
                  >Arbiter Supervision &amp; Public Ledger</span
                >
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant"
                    >Assigned Club Arbiter</label
                  >
                  <div
                    class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-secondary text-[18px] mr-space-sm"
                      aria-hidden="true"
                      >gavel</span
                    >
                    <input
                      class="bg-transparent text-on-surface font-body-md text-body-md focus:outline-none w-full"
                      readonly
                      type="text"
                      value="Sarah Jenkins (IA)"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant"
                    >Public Match Notice</label
                  >
                  <div
                    class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-outline text-[18px] mr-space-sm"
                      aria-hidden="true"
                      >notes</span
                    >
                    <input
                      class="bg-transparent text-on-surface font-body-md text-body-md focus:outline-none w-full"
                      type="text"
                      value="Round 8 regular Swiss pairing."
                    />
                  </div>
                </div>
              </div>
            </div>
            <!-- Action Button Group -->
            <div class="flex flex-wrap items-center gap-space-md pt-space-xs mb-space-lg">
              <RouterLink
                class="px-space-xl py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md font-semibold hover:bg-secondary transition-all shadow-md flex items-center gap-space-xs"
                id="schedule-action-btn"
                to="/dashboard/matches/create"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >done_all</span
                >
                <span>Schedule Match</span>
              </RouterLink>
              <button
                class="px-space-lg py-space-sm rounded-lg bg-surface-container-high text-on-surface font-title-md text-title-md hover:bg-surface-bright transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Save as Draft Pairing
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg text-outline hover:text-error transition-colors font-body-md text-body-md ml-auto"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel
              </button>
            </div>
          </div>
          <!-- Right Column: Live Match Simulation & Point Engine Preview (5 Cols) -->
          <div class="lg:col-span-5 flex flex-col gap-space-lg">
            <!-- Visual Versus Card (Championship Tactical Preview) -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-lg relative overflow-hidden"
            >
              <!-- Subtle Ambient Background Glow -->
              <div
                class="absolute -right-16 -top-16 w-56 h-56 rounded-full bg-primary/10 blur-3xl pointer-events-none"
              ></div>
              <div class="flex items-center justify-between z-10">
                <div
                  class="flex items-center gap-space-xs text-outline font-label-badge text-label-badge uppercase tracking-wider"
                >
                  <span
                    class="material-symbols-outlined text-[16px] text-primary"
                    aria-hidden="true"
                    >visibility</span
                  >
                  <span>Live Fixture Preview</span>
                </div>
                <span
                  class="px-space-sm py-space-xs rounded bg-surface-container-high text-secondary font-label-numeric-md text-label-numeric-md"
                >
                  Round 8
                </span>
              </div>
              <!-- Venue Banner inside Card -->
              <div
                class="flex items-center justify-between bg-surface-container p-space-md rounded-lg z-10"
              >
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-8 h-8 rounded bg-primary-container/20 flex items-center justify-center text-primary"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >table_restaurant</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <span class="font-title-md text-title-md text-on-surface" id="preview-venue"
                      >Club Hall A — Board 3</span
                    >
                    <span class="font-body-sm text-body-sm text-outline"
                      >DGT Digital E-Board Connection</span
                    >
                  </div>
                </div>
                <span class="material-symbols-outlined text-outline text-[20px]" aria-hidden="true"
                  >sensors</span
                >
              </div>
              <!-- Versus Tactical Head-to-Head -->
              <div class="flex flex-col gap-space-md z-10">
                <!-- White Player Block -->
                <div
                  class="flex items-center justify-between p-space-md rounded-lg bg-surface-container-lowest"
                >
                  <div class="flex items-center gap-space-md">
                    <div class="relative">
                      <div
                        class="w-12 h-12 rounded-lg bg-on-surface text-surface flex items-center justify-center font-bold font-headline-sm text-headline-sm"
                      >
                        ♔
                      </div>
                      <div
                        class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-primary flex items-center justify-center text-on-primary font-bold text-[10px]"
                      >
                        #4
                      </div>
                    </div>
                    <div class="flex flex-col">
                      <div class="flex items-center gap-space-xs">
                        <span
                          class="font-title-md text-title-md text-on-surface"
                          id="preview-white-name"
                          >Alex Rivera</span
                        >
                        <span
                          class="px-space-xs py-0.5 rounded bg-surface-container-high text-outline text-[10px] font-semibold"
                          >GM</span
                        >
                      </div>
                      <span class="font-body-sm text-body-sm text-outline"
                        >@alex_rivera • 320 Season Pts</span
                      >
                    </div>
                  </div>
                  <div class="text-right">
                    <span class="font-label-badge text-label-badge uppercase text-outline"
                      >Pieces</span
                    >
                    <div class="font-headline-sm text-headline-sm text-on-surface">White</div>
                  </div>
                </div>
                <!-- Divider Center Badge -->
                <div class="relative flex items-center justify-center py-space-xs">
                  <div class="h-0.5 w-full bg-surface-container-highest"></div>
                  <div
                    class="absolute px-space-md py-space-xs rounded-full bg-surface-container-high text-primary font-title-md text-title-md uppercase tracking-wider font-bold"
                  >
                    VS
                  </div>
                </div>
                <!-- Black Player Block -->
                <div
                  class="flex items-center justify-between p-space-md rounded-lg bg-surface-container-lowest"
                >
                  <div class="flex items-center gap-space-md">
                    <div class="relative">
                      <div
                        class="w-12 h-12 rounded-lg bg-surface-container-highest text-on-surface flex items-center justify-center font-bold font-headline-sm text-headline-sm"
                      >
                        ♚
                      </div>
                      <div
                        class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-secondary-container flex items-center justify-center text-on-secondary-container font-bold text-[10px]"
                      >
                        #8
                      </div>
                    </div>
                    <div class="flex flex-col">
                      <div class="flex items-center gap-space-xs">
                        <span
                          class="font-title-md text-title-md text-on-surface"
                          id="preview-black-name"
                          >Tariq Al-Mansoor</span
                        >
                        <span
                          class="px-space-xs py-0.5 rounded bg-surface-container-high text-outline text-[10px] font-semibold"
                          >IM</span
                        >
                      </div>
                      <span class="font-body-sm text-body-sm text-outline"
                        >@tariq_chess • 180 Season Pts</span
                      >
                    </div>
                  </div>
                  <div class="text-right">
                    <span class="font-label-badge text-label-badge uppercase text-outline"
                      >Pieces</span
                    >
                    <div class="font-headline-sm text-headline-sm text-on-surface">Black</div>
                  </div>
                </div>
              </div>
              <!-- Fixture Schedule Timestamp Indicator -->
              <div
                class="flex items-center justify-between pt-space-xs text-outline font-body-sm text-body-sm z-10"
              >
                <div class="flex items-center gap-space-xs">
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >alarm</span
                  >
                  <span id="preview-date-time">April 22, 2025 • 18:30 UTC</span>
                </div>
                <span class="text-secondary font-label-numeric-md text-label-numeric-md"
                  >Classical 90+30</span
                >
              </div>
            </div>
            <!-- Official Season Points System Engine Card -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >calculate</span
                  >
                  <span class="font-title-md text-title-md text-on-surface"
                    >Points Allocation Matrix</span
                  >
                </div>
                <span class="font-label-badge text-label-badge uppercase text-outline"
                  >Grandmaster League Rulebook</span
                >
              </div>
              <!-- Outcome Calculations Grid -->
              <div class="grid grid-cols-3 gap-space-sm">
                <div
                  class="p-space-md rounded-lg bg-surface-container-lowest flex flex-col items-center text-center gap-space-xs"
                >
                  <span class="font-label-badge text-label-badge uppercase text-outline"
                    >Win Match</span
                  >
                  <span class="font-headline-md text-headline-md text-primary">+20</span>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Winner takes 20, Loser 0</span
                  >
                </div>
                <div
                  class="p-space-md rounded-lg bg-surface-container-lowest flex flex-col items-center text-center gap-space-xs"
                >
                  <span class="font-label-badge text-label-badge uppercase text-outline"
                    >Draw Match</span
                  >
                  <span class="font-headline-md text-headline-md text-secondary">+10</span>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Awarded to both players</span
                  >
                </div>
                <div
                  class="p-space-md rounded-lg bg-surface-container-lowest flex flex-col items-center text-center gap-space-xs"
                >
                  <span class="font-label-badge text-label-badge uppercase text-outline"
                    >Defeat</span
                  >
                  <span class="font-headline-md text-headline-md text-error">0</span>
                  <span class="font-body-sm text-body-sm text-outline">No penalty deduction</span>
                </div>
              </div>
              <!-- Regulations and Rules Ledger -->
              <div
                class="p-space-md rounded-lg bg-surface-container space-y-space-xs font-body-sm text-body-sm text-on-surface-variant"
              >
                <div class="flex items-start gap-space-sm">
                  <span
                    class="material-symbols-outlined text-[16px] text-primary shrink-0 mt-0.5"
                    aria-hidden="true"
                    >check_circle</span
                  >
                  <span
                    ><strong>No Elo ratings are used.</strong> Points immediately update the
                    seasonal leaderboard upon admin validation.</span
                  >
                </div>
                <div class="flex items-start gap-space-sm">
                  <span
                    class="material-symbols-outlined text-[16px] text-secondary shrink-0 mt-0.5"
                    aria-hidden="true"
                    >notifications_active</span
                  >
                  <span
                    >Both players will receive immediate push &amp; email invitations and must
                    confirm before the deadline.</span
                  >
                </div>
                <div class="flex items-start gap-space-sm">
                  <span
                    class="material-symbols-outlined text-[16px] text-outline shrink-0 mt-0.5"
                    aria-hidden="true"
                    >warning</span
                  >
                  <span
                    >Unconfirmed matches are vacated 48 hours prior to start and offered to reserve
                    pairing pool.</span
                  >
                </div>
              </div>
              <!-- Live Simulation Points Outcome -->
              <div
                class="p-space-md rounded-lg bg-surface-container-high flex items-center justify-between"
              >
                <div class="flex flex-col">
                  <span class="font-label-badge text-label-badge uppercase text-outline"
                    >Simulated Standings Impact</span
                  >
                  <span class="font-body-md text-body-md text-on-surface font-semibold"
                    >Alex Rivera Win: Rank #4 ➔ Rank #2</span
                  >
                </div>
                <span class="material-symbols-outlined text-primary text-[24px]" aria-hidden="true"
                  >trending_up</span
                >
              </div>
            </div>
            <!-- Player Historical Head-to-Head Visual Card -->
            <div
              class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <span class="font-title-md text-title-md text-on-surface"
                  >Past Encounters (2024-2025)</span
                >
                <span class="font-label-numeric-md text-label-numeric-md text-outline"
                  >4 Encounters</span
                >
              </div>
              <!-- Inline Visual Stat Bar -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex justify-between font-label-badge text-label-badge text-outline">
                  <span class="text-on-surface font-semibold">Alex: 2 Wins (50%)</span>
                  <span class="text-secondary font-semibold">1 Draw (25%)</span>
                  <span class="text-outline font-semibold">Tariq: 1 Win (25%)</span>
                </div>
                <div
                  class="w-full h-2 rounded-full bg-surface-container-lowest flex overflow-hidden"
                >
                  <div class="bg-primary h-full" style="width: 50%"></div>
                  <div class="bg-secondary h-full" style="width: 25%"></div>
                  <div class="bg-surface-bright h-full" style="width: 25%"></div>
                </div>
              </div>
              <!-- Recent Match Quick List -->
              <div class="space-y-space-xs">
                <div
                  class="flex items-center justify-between p-space-sm rounded bg-surface-container-lowest text-body-sm font-body-sm"
                >
                  <span class="text-on-surface">Winter Invitational 2024</span>
                  <span
                    class="px-space-xs py-0.5 rounded bg-primary-container/20 text-primary font-semibold"
                    >1 - 0 (Alex)</span
                  >
                </div>
                <div
                  class="flex items-center justify-between p-space-sm rounded bg-surface-container-lowest text-body-sm font-body-sm"
                >
                  <span class="text-on-surface">Autumn Open Cup 2024</span>
                  <span
                    class="px-space-xs py-0.5 rounded bg-secondary-container text-secondary font-semibold"
                    >½ - ½ (Draw)</span
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- Interactive Script for Form Micro-interactions -->
      </div>
    </main>
  </DashboardLayout>
</template>
