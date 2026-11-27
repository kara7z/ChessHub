<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin md:px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Dynamic Status & Header Bar -->
        <div class="flex flex-col gap-space-sm pt-space-md mb-space-lg">
          <!-- Breadcrumb Hierarchy -->
          <div class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <RouterLink class="hover:text-primary transition-colors" to="/dashboard"
              >Dashboard</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <RouterLink class="hover:text-primary transition-colors" to="/dashboard/seasons"
              >Seasons</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-on-surface-variant font-title-md text-title-md"
              >Spring League 2025</span
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-primary font-title-md text-title-md">Edit Season</span>
          </div>
          <!-- Title and Meta Banner -->
          <div
            class="flex flex-col md:flex-row md:items-end justify-between gap-space-md mt-space-xs"
          >
            <div class="flex flex-col gap-space-xs">
              <div class="flex items-center gap-space-sm">
                <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                  Edit Season Settings — Spring League 2025
                </h1>
                <span
                  class="inline-flex items-center gap-1.5 px-2.5 py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider"
                >
                  <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                  Active Circuit
                </span>
              </div>
              <p class="font-body-md text-body-md text-outline">
                Modify competition details, calendar duration, validation nodes, and Swiss tiebreak
                configuration.
              </p>
            </div>
            <!-- Action Buttons top pinned -->
            <div class="flex items-center gap-space-sm self-start md:self-auto">
              <span
                class="px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors font-title-md text-title-md flex items-center gap-space-xs shadow-sm"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">close</span>
                Cancel
              </span>
              <button
                class="px-space-lg py-space-sm rounded-lg bg-primary-container text-on-primary-container hover:bg-primary font-title-md text-title-md flex items-center gap-space-xs transition-colors shadow-sm"
                form="season-edit-form"
                type="submit"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">save</span>
                Save Changes
              </button>
            </div>
          </div>
        </div>
        <!-- Arbiter Notice Callout Banner -->
        <div
          class="mb-space-lg p-space-md rounded-xl bg-surface-container-low flex items-start gap-space-md shadow-sm relative overflow-hidden"
        >
          <div class="w-1.5 absolute left-0 top-0 bottom-0 bg-secondary"></div>
          <div
            class="p-space-xs rounded-lg bg-secondary-container text-secondary flex items-center justify-center shrink-0"
          >
            <span class="material-symbols-outlined text-[22px]" aria-hidden="true">gavel</span>
          </div>
          <div class="flex flex-col gap-0.5">
            <span
              class="font-title-md text-title-md text-secondary tracking-tight flex items-center gap-space-xs"
            >
              Active Season Constraint
              <span
                class="font-label-badge text-label-badge uppercase tracking-widest text-outline bg-surface-container-highest px-1.5 py-0.5 rounded"
                >FIDE §B.02 Enforced</span
              >
            </span>
            <p class="font-body-sm text-body-sm text-on-surface-variant leading-relaxed">
              Schedule dates and capacity can be adjusted. Structural format changes are locked once
              matches have been officially validated. If season is marked
              <strong class="text-on-surface font-semibold">Completed</strong>, it becomes
              permanently read-only and ratings lock into historic archives.
            </p>
          </div>
        </div>
        <!-- Main Asymmetric Configuration Grid -->
        <form
          class="grid grid-cols-1 lg:grid-cols-12 gap-space-lg"
          id="season-edit-form"
          @submit.prevent=""
        >
          <!-- Left Column: Primary Configurations (8 cols) -->
          <div class="lg:col-span-8 flex flex-col gap-space-lg">
            <!-- Card: General Profile -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >military_tech</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    General Identification
                  </h2>
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-outline">SEC-01</span>
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <!-- Season Name -->
                <div class="flex flex-col gap-1.5 md:col-span-2">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline flex items-center gap-1"
                    for="season_name"
                  >
                    Season Designation
                    <span class="text-error">*</span>
                  </label>
                  <div class="relative">
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface placeholder-outline font-title-md text-title-md focus:bg-surface-container-high focus:outline-none focus:ring-1 focus:ring-primary transition-all"
                      id="season_name"
                      name="season_name"
                      required
                      type="text"
                      value="Spring League 2025"
                    />
                    <span
                      class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline text-[18px]"
                      aria-hidden="true"
                      >workspace_premium</span
                    >
                  </div>
                </div>
                <!-- Status Dropdown -->
                <div class="flex flex-col gap-1.5">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="season_status"
                  >
                    Operational State
                  </label>
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface font-title-md text-title-md focus:bg-surface-container-high focus:outline-none focus:ring-1 focus:ring-primary transition-all cursor-pointer pr-10"
                      id="season_status"
                      name="season_status"
                    >
                      <option selected value="active">Active — Ongoing Rounds</option>
                      <option value="upcoming">Upcoming — Registration Open</option>
                      <option value="completed">Completed — Read Only</option>
                      <option value="archived">Archived — Cold Storage</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline text-[20px] pointer-events-none"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <!-- Registered Player Cap -->
                <div class="flex flex-col gap-1.5">
                  <div class="flex justify-between items-center">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      for="player_cap"
                    >
                      Roster Cap (Seats)
                    </label>
                    <span class="font-label-badge text-label-badge text-primary">58 Enrolled</span>
                  </div>
                  <div class="relative">
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface font-label-numeric-md text-label-numeric-md focus:bg-surface-container-high focus:outline-none focus:ring-1 focus:ring-primary transition-all"
                      id="player_cap"
                      max="256"
                      min="16"
                      name="player_cap"
                      step="4"
                      type="number"
                      value="64"
                    />
                    <span
                      class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline text-[18px]"
                      aria-hidden="true"
                      >group</span
                    >
                  </div>
                </div>
              </div>
              <!-- Description & Regulations -->
              <div class="flex flex-col gap-1.5 mt-space-xs">
                <div class="flex justify-between items-center">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="regulations"
                  >
                    Description &amp; Regulations Charter
                  </label>
                  <span class="font-body-sm text-body-sm text-outline">Markdown Supported</span>
                </div>
                <textarea
                  class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface placeholder-outline font-body-md text-body-md focus:bg-surface-container-high focus:outline-none focus:ring-1 focus:ring-primary transition-all leading-relaxed"
                  id="regulations"
                  name="regulations"
                  rows="5"
                >
Official Spring 2025 Championship Cycle. Rated under rapid clock parameters (15m + 10s increment). Participants are bounded by the Grandmaster Fair Play protocol. Missed pair pairings without 24hr arbiter notification invoke an automatic 0-1 technical forfeit. Appeals must be registered within 45 minutes of game completion.</textarea>
              </div>
            </div>
            <!-- Card: Calendar & Window Schedules -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >date_range</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    Tournament Lifespan
                  </h2>
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-outline">SEC-02</span>
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <!-- Start Date -->
                <div class="flex flex-col gap-1.5">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="start_date"
                  >
                    Commencement Date
                  </label>
                  <div class="relative">
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface font-label-numeric-md text-label-numeric-md focus:bg-surface-container-high focus:outline-none focus:ring-1 focus:ring-primary transition-all"
                      id="start_date"
                      name="start_date"
                      type="date"
                      value="2025-03-01"
                    />
                  </div>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Round 1 pairings executed at 18:00 UTC</span
                  >
                </div>
                <!-- End Date -->
                <div class="flex flex-col gap-1.5">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    for="end_date"
                  >
                    Target Conclusion
                  </label>
                  <div class="relative">
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface font-label-numeric-md text-label-numeric-md focus:bg-surface-container-high focus:outline-none focus:ring-1 focus:ring-primary transition-all"
                      id="end_date"
                      name="end_date"
                      type="date"
                      value="2025-05-30"
                    />
                  </div>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Awards ceremony and FIDE rating submission</span
                  >
                </div>
              </div>
              <!-- Inline Visual Calendar Rhythm -->
              <div
                class="mt-space-sm p-space-md rounded-lg bg-surface-container flex flex-col gap-space-sm"
              >
                <div
                  class="flex justify-between items-center text-outline font-label-badge text-label-badge uppercase"
                >
                  <span>Cycle Timeline Velocity</span>
                  <span class="text-primary font-bold">Week 7 of 13</span>
                </div>
                <!-- Visual Sparkline / Bar Scale -->
                <div
                  class="w-full h-2 rounded-full bg-surface-container-highest overflow-hidden flex"
                >
                  <div class="bg-primary h-full w-[54%]" title="Elapsed Progress"></div>
                  <div class="bg-secondary h-full w-[12%]" title="Validation Queue"></div>
                </div>
                <div
                  class="flex justify-between items-center text-outline font-body-sm text-body-sm pt-1"
                >
                  <span>Mar 01, 2025 (Genesis)</span>
                  <span class="text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                    >46 Days Remaining</span
                  >
                  <span>May 30, 2025 (Finals)</span>
                </div>
              </div>
            </div>
            <!-- Card: Tiebreak Arbitration Suite -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >sort</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    Tiebreak Rules Priority
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase text-secondary bg-secondary-container px-2 py-0.5 rounded"
                  >FIDE Standard 2024</span
                >
              </div>
              <p class="font-body-md text-body-md text-outline">
                Drag or rearrange priority order for automated podium resolution in Swiss pairings.
              </p>
              <div class="flex flex-col gap-space-xs" id="tiebreak-list">
                <!-- Priority 1: Buchholz Cut 1 -->
                <div
                  class="flex items-center justify-between p-space-sm px-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-md">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-primary">01</span>
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Buchholz Cut 1</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Sum of opponent scores discarding the lowest individual performer</span
                      >
                    </div>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="px-2 py-0.5 rounded font-label-badge text-label-badge bg-surface-container-highest text-on-surface-variant"
                      >Primary</span
                    >
                    <button
                      class="p-1 rounded text-outline hover:text-on-surface transition-colors"
                      title="Lock Rule"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >drag_indicator</span
                      >
                    </button>
                  </div>
                </div>
                <!-- Priority 2: Sonneborn-Berger -->
                <div
                  class="flex items-center justify-between p-space-sm px-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-md">
                    <span
                      class="font-label-numeric-lg text-label-numeric-lg text-on-surface-variant"
                      >02</span
                    >
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Sonneborn-Berger System</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Sum of scores of defeated opponents plus half score of drawn
                        opponents</span
                      >
                    </div>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="px-2 py-0.5 rounded font-label-badge text-label-badge bg-surface-container-highest text-on-surface-variant"
                      >Secondary</span
                    >
                    <button
                      class="p-1 rounded text-outline hover:text-on-surface transition-colors"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >drag_indicator</span
                      >
                    </button>
                  </div>
                </div>
                <!-- Priority 3: Direct Encounter -->
                <div
                  class="flex items-center justify-between p-space-sm px-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-md">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-outline">03</span>
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Direct Encounter</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Head-to-head match outcome if tied participants have faced each other</span
                      >
                    </div>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="px-2 py-0.5 rounded font-label-badge text-label-badge bg-surface-container-highest text-on-surface-variant"
                      >Tertiary</span
                    >
                    <button
                      class="p-1 rounded text-outline hover:text-on-surface transition-colors"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >drag_indicator</span
                      >
                    </button>
                  </div>
                </div>
              </div>
              <div
                class="flex items-center justify-between pt-space-xs text-outline font-body-sm text-body-sm"
              >
                <span class="flex items-center gap-1">
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true">info</span>
                  Changes to tiebreaks take effect for Round 8 pairings onward.
                </span>
                <button
                  class="text-primary hover:underline font-title-md text-title-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  + Add Custom Criterion
                </button>
              </div>
            </div>
          </div>
          <!-- Right Column: Visual Telemetry & Dangerous Operations (4 cols) -->
          <div class="lg:col-span-4 flex flex-col gap-space-lg">
            <!-- Season Visual Snapshot -->
            <div
              class="rounded-xl overflow-hidden bg-surface-container-low shadow-sm flex flex-col"
            >
              <div class="relative h-44 bg-surface-container-high">
                <img
                  class="w-full h-full object-cover opacity-60"
                  data-alt="Monochromatic top-down cinematic macro photograph of hand-carved ebony and boxwood tournament chess pieces on an artisan matte wood board with dramatic rim lighting and moody dark studio atmosphere"
                  src="/images/27f53c447544.webp"
                  alt=""
                />
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-surface-container-low/40 to-transparent"
                ></div>
                <div class="absolute top-space-md left-space-md">
                  <span
                    class="px-2.5 py-1 rounded bg-surface/80 backdrop-blur-md text-on-surface font-label-badge text-label-badge uppercase tracking-wider"
                    >Division I · Premier</span
                  >
                </div>
                <div
                  class="absolute bottom-space-md left-space-md right-space-md flex justify-between items-end"
                >
                  <div>
                    <span
                      class="font-label-badge text-label-badge uppercase text-primary tracking-widest block"
                      >Season ID</span
                    >
                    <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                      >#SSN-2025-SP-882</span
                    >
                  </div>
                  <div class="text-right">
                    <span
                      class="font-label-badge text-label-badge uppercase text-outline tracking-widest block"
                      >Rated Games</span
                    >
                    <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                      >192 / 320</span
                    >
                  </div>
                </div>
              </div>
              <div class="p-space-md flex flex-col gap-space-sm">
                <div class="flex items-center justify-between py-1">
                  <span class="font-body-sm text-body-sm text-outline">Tournament Arbiter</span>
                  <span class="font-title-md text-title-md text-on-surface"
                    >GM Magnusson (FIDE 1102)</span
                  >
                </div>
                <div class="flex items-center justify-between py-1">
                  <span class="font-body-sm text-body-sm text-outline">Format Archetype</span>
                  <span class="font-title-md text-title-md text-on-surface"
                    >9-Round Swiss Classic</span
                  >
                </div>
                <div class="flex items-center justify-between py-1">
                  <span class="font-body-sm text-body-sm text-outline">Anti-Cheat Engine</span>
                  <span
                    class="flex items-center gap-1 font-label-badge text-label-badge text-primary uppercase"
                  >
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >verified_user</span
                    >
                    Full Telemetry
                  </span>
                </div>
              </div>
            </div>
            <!-- Quick Metrics Grid Bento -->
            <div class="grid grid-cols-2 gap-space-sm">
              <div
                class="p-space-md rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-xs"
              >
                <span class="font-label-badge text-label-badge uppercase text-outline"
                  >Active Standings</span
                >
                <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                  >58 / 64</span
                >
                <span class="font-body-sm text-body-sm text-primary flex items-center gap-0.5">
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >arrow_upward</span
                  >
                  6 Waitlisted
                </span>
              </div>
              <div
                class="p-space-md rounded-xl bg-surface-container-low shadow-sm flex flex-col gap-space-xs"
              >
                <span class="font-label-badge text-label-badge uppercase text-outline"
                  >Disputes Logged</span
                >
                <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">0</span>
                <span class="font-body-sm text-body-sm text-outline flex items-center gap-0.5">
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >check_circle</span
                  >
                  100% Cleared
                </span>
              </div>
            </div>
            <!-- Emergency Arbiter Actions: Danger Zone -->
            <div
              class="dashboard-panel relative flex flex-col gap-space-md overflow-hidden p-space-lg"
            >
              <div class="w-1.5 absolute left-0 top-0 bottom-0 bg-error"></div>
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs text-error">
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >warning</span
                  >
                  <h3 class="font-headline-sm text-headline-sm text-on-surface">Danger Zone</h3>
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase bg-error-container/40 text-error px-2 py-0.5 rounded"
                  >High Authority</span
                >
              </div>
              <p class="font-body-sm text-body-sm text-outline">
                Destructive procedures invoke irreversible changes across all player profiles and
                leaderboard tables.
              </p>
              <div class="flex flex-col gap-space-sm mt-space-xs">
                <!-- Button: Close Season Early -->
                <button
                  class="w-full text-left p-space-md rounded-lg bg-surface-container hover:bg-error-container/20 transition-all flex flex-col gap-1 group"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <div class="flex items-center justify-between w-full">
                    <span class="font-title-md text-title-md text-error group-hover:underline"
                      >Close Season Early &amp; Crown Champion</span
                    >
                    <span
                      class="material-symbols-outlined text-error text-[18px]"
                      aria-hidden="true"
                      >emoji_events</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline">
                    Rounds 8-9 discarded. Active leader is finalized as Division champion.
                  </span>
                </button>
                <!-- Button: Archive Season Record -->
                <button
                  class="w-full text-left p-space-md rounded-lg bg-surface-container hover:bg-surface-container-high transition-all flex flex-col gap-1 group"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <div class="flex items-center justify-between w-full">
                    <span
                      class="font-title-md text-title-md text-on-surface group-hover:text-error transition-colors"
                      >Archive Season Record</span
                    >
                    <span
                      class="material-symbols-outlined text-outline group-hover:text-error text-[18px] transition-colors"
                      aria-hidden="true"
                      >archive</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline">
                    Relocate tournament ledger to historical index. Read-only forever.
                  </span>
                </button>
              </div>
            </div>
          </div>
        </form>
      </div>
    </main>
  </DashboardLayout>
</template>
