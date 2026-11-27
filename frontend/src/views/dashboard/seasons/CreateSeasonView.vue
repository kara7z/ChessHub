<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Sub-header & Navigation Context -->
        <div class="flex flex-col gap-space-xs pt-space-md mb-space-lg">
          <nav class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <RouterLink
              class="hover:text-primary transition-colors flex items-center gap-1"
              to="/dashboard"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                >dashboard</span
              >
              <span>Dashboard</span>
            </RouterLink>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <RouterLink class="hover:text-primary transition-colors" to="/dashboard/seasons"
              >Seasons</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-on-surface font-title-md text-title-md">Create Season</span>
          </nav>
          <div
            class="flex flex-col md:flex-row md:items-end justify-between gap-space-md mt-space-xs"
          >
            <div>
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                Create New Season
              </h1>
              <p class="font-body-md text-body-md text-outline mt-1 max-w-2xl">
                Configure a new competitive season for club members. Only one season can be active
                at a time.
              </p>
            </div>
            <div
              class="flex items-center gap-space-xs bg-surface-container px-space-md py-space-xs rounded-lg self-start md:self-auto shadow-sm"
            >
              <span class="material-symbols-outlined text-primary text-[18px]" aria-hidden="true"
                >verified_user</span
              >
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >FIDE / Club Certified System</span
              >
            </div>
          </div>
        </div>
        <!-- Arbitration Rule Warning Alert Box -->
        <div
          class="mb-space-lg rounded-xl bg-surface-container-low p-space-md md:p-space-lg relative overflow-hidden shadow-md"
        >
          <div class="absolute left-0 top-0 bottom-0 w-1.5 bg-primary"></div>
          <div class="flex items-start gap-space-md pl-space-xs">
            <div
              class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
            >
              <span class="material-symbols-outlined text-[24px]" aria-hidden="true">gavel</span>
            </div>
            <div class="flex flex-col gap-space-xs">
              <div class="flex items-center gap-space-sm flex-wrap">
                <span class="font-title-md text-title-md text-on-surface font-semibold"
                  >Arbitration Rule: Single Active Season Policy</span
                >
                <span
                  class="bg-primary/10 text-primary px-2 py-0.5 rounded-full font-label-badge text-label-badge tracking-wider uppercase font-semibold"
                  >Enforced</span
                >
              </div>
              <p class="font-body-md text-body-md text-on-surface-variant max-w-4xl">
                Only one season can be active at any given moment. Starting this season will require
                closing current active seasons. All players start with 0 points; past season
                rankings remain permanently preserved in archive.
              </p>
            </div>
          </div>
        </div>
        <!-- Main Asymmetric Configuration Grid -->
        <form
          class="grid grid-cols-1 lg:grid-cols-12 gap-space-lg"
          id="seasonCreateForm"
          @submit.prevent=""
        >
          <!-- Left Main Column: Primary Parameters (8 Cols) -->
          <div class="lg:col-span-8 flex flex-col gap-space-lg">
            <!-- Core Metadata Card -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span class="font-label-numeric-md text-label-numeric-md text-primary">01</span>
                  <h2
                    class="font-title-md text-title-md text-on-surface font-semibold tracking-tight"
                  >
                    General Information
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Required Fields</span
                >
              </div>
              <!-- Season Name Input -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-title-md text-title-md text-on-surface flex items-center justify-between"
                  for="seasonName"
                >
                  <span>Season Name</span>
                  <span class="font-body-sm text-body-sm text-outline">Max 80 chars</span>
                </label>
                <div class="relative">
                  <input
                    class="w-full bg-surface-container text-on-surface placeholder:text-outline font-body-md text-body-md px-space-md py-space-sm rounded-lg outline-none focus:bg-surface-container-high transition-all"
                    id="seasonName"
                    name="seasonName"
                    placeholder="e.g. Grandmaster Summer Championship 2025"
                    type="text"
                    value="Grandmaster Summer Championship 2025"
                  />
                  <span
                    class="material-symbols-outlined text-outline absolute right-space-md top-1/2 -translate-y-1/2 text-[20px] pointer-events-none"
                    aria-hidden="true"
                    >trophy</span
                  >
                </div>
                <p class="font-body-sm text-body-sm text-outline">
                  This official title will be displayed across leaderboards, player digital badges,
                  and pairing sheets.
                </p>
              </div>
              <!-- Tournament Format / Tier Select -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md pt-space-xs">
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="seasonFormat"
                    >Format &amp; Pairing Logic</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none bg-surface-container text-on-surface font-body-md text-body-md px-space-md py-space-sm rounded-lg outline-none focus:bg-surface-container-high transition-all cursor-pointer"
                      id="seasonFormat"
                      name="seasonFormat"
                    >
                      <option value="swiss-10">Swiss System — 10 Rounds</option>
                      <option value="swiss-7">Swiss System — 7 Rounds</option>
                      <option value="round-robin">Round Robin — All-Play-All</option>
                      <option value="double-elimination">Double Elimination Tournament</option>
                      <option value="scheveningen">Scheveningen Team Engine</option>
                    </select>
                    <span
                      class="material-symbols-outlined text-outline absolute right-space-md top-1/2 -translate-y-1/2 pointer-events-none text-[20px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                  <p class="font-body-sm text-body-sm text-outline">
                    FIDE-compliant pairing algorithms compute automatically.
                  </p>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface"
                    for="tierClassification"
                    >Competitive Tier</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none bg-surface-container text-on-surface font-body-md text-body-md px-space-md py-space-sm rounded-lg outline-none focus:bg-surface-container-high transition-all cursor-pointer"
                      id="tierClassification"
                      name="tierClassification"
                    >
                      <option value="master">Grandmaster &amp; Master Tier (2000+)</option>
                      <option selected value="open">Open Invitational (All Club Members)</option>
                      <option value="challenger">Challenger Division (&lt; 1800)</option>
                      <option value="junior">Junior Blitz &amp; Rapid League</option>
                    </select>
                    <span
                      class="material-symbols-outlined text-outline absolute right-space-md top-1/2 -translate-y-1/2 pointer-events-none text-[20px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                  <p class="font-body-sm text-body-sm text-outline">
                    Determines baseline arbiter assignment level.
                  </p>
                </div>
              </div>
              <!-- Description Textarea -->
              <div class="flex flex-col gap-space-xs pt-space-xs">
                <label
                  class="font-title-md text-title-md text-on-surface flex items-center justify-between"
                  for="seasonDescription"
                >
                  <span>Description &amp; Regulations</span>
                  <span class="font-body-sm text-body-sm text-outline">Markdown Supported</span>
                </label>
                <textarea
                  class="w-full bg-surface-container text-on-surface placeholder:text-outline font-body-md text-body-md p-space-md rounded-lg outline-none focus:bg-surface-container-high transition-all leading-relaxed resize-y"
                  id="seasonDescription"
                  name="seasonDescription"
                  placeholder="Outline match protocols, time controls (e.g. 90+30), default penalties, and bye request policies..."
                  rows="5"
                >
Official Summer championship division. Games conducted at Classical FIDE Standard: 90 mins for the first 40 moves, followed by 30 mins with an increment of 30 seconds per move starting from move 1. Default time: 15 minutes. Unsportsmanlike conduct or electronic device violations yield immediate forfeit.</textarea>
              </div>
            </div>
            <!-- Schedule & Timeline Card -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span class="font-label-numeric-md text-label-numeric-md text-primary">02</span>
                  <h2
                    class="font-title-md text-title-md text-on-surface font-semibold tracking-tight"
                  >
                    Timeline &amp; Capacity
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Sync with FIDE Calendar</span
                >
              </div>
              <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md">
                <!-- Start Date -->
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="startDate"
                    >Start Date</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container text-on-surface font-body-md text-body-md px-space-md py-space-sm rounded-lg outline-none focus:bg-surface-container-high transition-all cursor-pointer"
                      id="startDate"
                      name="startDate"
                      type="date"
                      value="2025-06-01"
                    />
                    <span
                      class="material-symbols-outlined text-outline absolute right-space-md top-1/2 -translate-y-1/2 text-[18px] pointer-events-none"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Round 1 pairing announcement</span
                  >
                </div>
                <!-- End Date -->
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="endDate"
                    >End Date</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container text-on-surface font-body-md text-body-md px-space-md py-space-sm rounded-lg outline-none focus:bg-surface-container-high transition-all cursor-pointer"
                      id="endDate"
                      name="endDate"
                      type="date"
                      value="2025-08-15"
                    />
                    <span
                      class="material-symbols-outlined text-outline absolute right-space-md top-1/2 -translate-y-1/2 text-[18px] pointer-events-none"
                      aria-hidden="true"
                      >event</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Final award ceremony &amp; archive</span
                  >
                </div>
                <!-- Contender Capacity -->
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="targetCapacity"
                    >Target Contender Cap</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container text-on-surface font-label-numeric-md text-label-numeric-md px-space-md py-space-sm rounded-lg outline-none focus:bg-surface-container-high transition-all"
                      id="targetCapacity"
                      max="512"
                      min="8"
                      name="targetCapacity"
                      step="8"
                      type="number"
                      value="64"
                    />
                    <span
                      class="material-symbols-outlined text-outline absolute right-space-md top-1/2 -translate-y-1/2 text-[18px] pointer-events-none"
                      aria-hidden="true"
                      >group</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Max registered club players</span
                  >
                </div>
              </div>
              <!-- Timeline Graphic Sparkline preview -->
              <div
                class="mt-space-sm bg-surface-container p-space-md rounded-lg flex flex-col md:flex-row items-center justify-between gap-space-md"
              >
                <div class="flex items-center gap-space-md">
                  <div
                    class="w-10 h-10 rounded-full bg-primary/10 flex items-center justify-center text-primary flex-shrink-0"
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >pace</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <span class="font-title-md text-title-md text-on-surface font-medium"
                      >Estimated Season Duration: 75 Days</span
                    >
                    <span class="font-body-sm text-body-sm text-outline"
                      >1 match cycle per player every 7 calendar days</span
                    >
                  </div>
                </div>
                <!-- Minimal Inline SVG Representation of 10-stage schedule -->
                <div class="flex items-center gap-1 w-full md:w-auto justify-end">
                  <svg
                    class="h-6 w-48 text-primary"
                    fill="none"
                    viewBox="0 0 190 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <line
                      stroke="currentColor"
                      stroke-dasharray="4 4"
                      stroke-opacity="0.3"
                      stroke-width="2"
                      x1="8"
                      x2="182"
                      y1="12"
                      y2="12"
                    ></line>
                    <circle cx="12" cy="12" fill="#81B64C" r="5"></circle>
                    <circle cx="48" cy="12" fill="#81B64C" fill-opacity="0.6" r="3.5"></circle>
                    <circle cx="84" cy="12" fill="#81B64C" fill-opacity="0.6" r="3.5"></circle>
                    <circle cx="120" cy="12" fill="#81B64C" fill-opacity="0.6" r="3.5"></circle>
                    <circle cx="156" cy="12" fill="#81B64C" fill-opacity="0.6" r="3.5"></circle>
                    <circle cx="182" cy="12" fill="#AFD190" r="5"></circle>
                  </svg>
                </div>
              </div>
            </div>
            <!-- Action Buttons Bar -->
            <div
              class="flex flex-col-reverse sm:flex-row items-center justify-between gap-space-md pt-space-xs"
            >
              <RouterLink
                class="font-title-md text-title-md text-outline hover:text-on-surface transition-colors flex items-center gap-space-xs py-space-sm px-space-md"
                to="/dashboard/seasons"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >arrow_back</span
                >
                <span>Cancel &amp; Back</span>
              </RouterLink>
              <div class="flex items-center gap-space-sm w-full sm:w-auto">
                <button
                  class="flex-1 sm:flex-none px-space-lg py-space-sm rounded-lg bg-surface-container text-on-surface font-title-md text-title-md hover:bg-surface-container-high transition-colors shadow-sm"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Save as Draft
                </button>
                <button
                  class="flex-1 sm:flex-none px-space-xl py-space-sm rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md font-semibold hover:bg-primary transition-all flex items-center justify-center gap-space-xs shadow-md"
                  type="submit"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >add_circle</span
                  >
                  <span>Create Season</span>
                </button>
              </div>
            </div>
          </div>
          <!-- Right Rail: Scoring Policy & Visual Inspection (4 Cols) -->
          <div class="lg:col-span-4 flex flex-col gap-space-lg">
            <!-- Scoring Configuration Card -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md relative overflow-hidden"
            >
              <div class="flex items-center justify-between">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Tournament Rules</span
                >
                <span class="material-symbols-outlined text-outline text-[18px]" aria-hidden="true"
                  >calculate</span
                >
              </div>
              <div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                  Scoring Matrix
                </h3>
                <p class="font-body-sm text-body-sm text-outline mt-0.5">
                  Fixed match point mechanics. No Elo calculations applied.
                </p>
              </div>
              <!-- Outcome Chips Visual Spec -->
              <div class="flex flex-col gap-space-sm mt-space-xs">
                <!-- Victory -->
                <div
                  class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-8 h-8 rounded bg-primary/10 flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >military_tech</span
                      >
                    </div>
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-medium leading-snug"
                        >Win</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Standard outcome 1 - 0</span
                      >
                    </div>
                  </div>
                  <div
                    class="px-space-md py-1 rounded bg-primary/20 text-primary font-label-numeric-lg text-label-numeric-lg font-bold"
                  >
                    +20
                  </div>
                </div>
                <!-- Draw -->
                <div
                  class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-8 h-8 rounded bg-secondary/10 flex items-center justify-center text-secondary"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >handshake</span
                      >
                    </div>
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-medium leading-snug"
                        >Draw</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">Split tie ½ - ½</span>
                    </div>
                  </div>
                  <div
                    class="px-space-md py-1 rounded bg-secondary/20 text-secondary font-label-numeric-lg text-label-numeric-lg font-bold"
                  >
                    +10
                  </div>
                </div>
                <!-- Loss -->
                <div
                  class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-8 h-8 rounded bg-error-container/20 flex items-center justify-center text-error"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >close</span
                      >
                    </div>
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-medium leading-snug"
                        >Loss</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">Defeat 0 - 1</span>
                    </div>
                  </div>
                  <div
                    class="px-space-md py-1 rounded bg-surface-container-highest text-outline font-label-numeric-lg text-label-numeric-lg font-bold"
                  >
                    0
                  </div>
                </div>
              </div>
              <div
                class="mt-space-xs p-space-sm rounded-lg bg-surface-container flex items-start gap-space-sm"
              >
                <span
                  class="material-symbols-outlined text-outline text-[18px] mt-0.5"
                  aria-hidden="true"
                  >info</span
                >
                <span class="font-body-sm text-body-sm text-outline leading-tight">
                  Tiebreaks follow Buchholz Cut-1, followed by Sonneborn-Berger and Direct
                  Encounter.
                </span>
              </div>
            </div>
            <!-- Live Arbitration Status Preview -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Arbiter Roster</span
                >
                <span
                  class="inline-flex items-center gap-1 font-body-sm text-body-sm text-secondary"
                >
                  <span class="w-2 h-2 rounded-full bg-secondary"></span>
                  Supervised
                </span>
              </div>
              <div
                class="flex items-center gap-space-md bg-surface-container p-space-sm rounded-lg"
              >
                <div
                  class="w-10 h-10 rounded-full bg-primary-container flex items-center justify-center text-on-primary-container font-bold font-headline-sm"
                >
                  CA
                </div>
                <div class="flex flex-col">
                  <span class="font-title-md text-title-md text-on-surface font-semibold"
                    >Chief Arbiter #1440</span
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Digital signature initialized</span
                  >
                </div>
              </div>
              <!-- Venue & Visual Representation Placeholder -->
              <div
                class="relative w-full h-32 rounded-lg overflow-hidden bg-surface-container flex items-end p-space-sm"
              >
                <div
                  class="absolute inset-0 bg-cover bg-center"
                  data-alt="Intense high-stakes chess tournament hall illuminated in subdued low-light with luxury wooden vinyl boards, analog precision clocks, quiet atmosphere, dark green table runners, obsidian and verdant aesthetic"
                  style="background-image: url('/images/66c45fe94d97.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest via-surface-container-lowest/60 to-transparent"
                ></div>
                <div class="relative z-10 flex items-center justify-between w-full">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface font-medium"
                    >Grand Arena Hall A</span
                  >
                  <span
                    class="material-symbols-outlined text-primary text-[18px]"
                    aria-hidden="true"
                    >verified</span
                  >
                </div>
              </div>
              <!-- Rapid Checklist -->
              <div class="flex flex-col gap-space-xs pt-space-xs font-body-sm text-body-sm">
                <div class="flex items-center gap-space-xs text-outline">
                  <span
                    class="material-symbols-outlined text-primary text-[16px]"
                    aria-hidden="true"
                    >check_circle</span
                  >
                  <span>Zero Elo rating volatility protocol</span>
                </div>
                <div class="flex items-center gap-space-xs text-outline">
                  <span
                    class="material-symbols-outlined text-primary text-[16px]"
                    aria-hidden="true"
                    >check_circle</span
                  >
                  <span>Permanent past season data immutability</span>
                </div>
                <div class="flex items-center gap-space-xs text-outline">
                  <span
                    class="material-symbols-outlined text-primary text-[16px]"
                    aria-hidden="true"
                    >check_circle</span
                  >
                  <span>Auto-generation of PGN archives post-round</span>
                </div>
              </div>
            </div>
          </div>
        </form>
      </div>
    </main>
  </DashboardLayout>
</template>
