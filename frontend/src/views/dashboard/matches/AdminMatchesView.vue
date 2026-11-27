<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Dynamic Ambient Glow Backdrop -->
        <div class="relative w-full">
          <div
            class="absolute -top-12 right-1/4 w-96 h-96 bg-primary/5 rounded-full blur-3xl pointer-events-none"
          ></div>
          <div
            class="absolute top-24 -left-16 w-80 h-80 bg-tertiary/5 rounded-full blur-3xl pointer-events-none"
          ></div>
        </div>
        <!-- Header Section -->
        <section
          class="flex flex-col md:flex-row md:items-end justify-between gap-space-lg mb-space-xl pt-space-md"
        >
          <div class="flex flex-col gap-space-xs max-w-3xl">
            <div
              class="flex items-center gap-space-xs text-outline font-label-badge text-label-badge uppercase tracking-widest"
            >
              <span>Dashboard</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-primary font-semibold">Matches</span>
            </div>
            <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight font-bold">
              Competitive Matches Desk
            </h1>
            <p class="font-body-md text-body-md text-on-surface-variant leading-relaxed">
              Schedule fixtures, manage player invitations, monitor board pairings, and record
              official results with FIDE-compliant arbitration standards.
            </p>
          </div>
          <!-- Top Right Action -->
          <div class="flex items-center gap-space-sm shrink-0">
            <button
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">download</span>
              <span>Export PGN / CSV</span>
            </button>
            <RouterLink
              class="flex items-center gap-space-xs px-space-lg py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md font-semibold hover:bg-primary-fixed-dim transition-all shadow-md active:scale-95"
              id="schedule-match-trigger"
              to="/dashboard/matches/create"
            >
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                >add_circle</span
              >
              <span>+ Schedule New Match</span>
            </RouterLink>
          </div>
        </section>
        <!-- Summary KPI Cards -->
        <section class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-gutter mb-space-xl">
          <!-- Card 1 -->
          <div
            class="bg-surface-container rounded-xl p-space-lg shadow-sm hover:shadow-md transition-shadow relative overflow-hidden group"
          >
            <div
              class="absolute top-0 right-0 w-24 h-24 bg-primary/10 rounded-bl-full pointer-events-none transition-transform group-hover:scale-110"
            ></div>
            <div class="flex items-center justify-between mb-space-sm">
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                >Matches Scheduled</span
              >
              <span class="material-symbols-outlined text-primary text-[22px]" aria-hidden="true"
                >calendar_clock</span
              >
            </div>
            <div class="flex items-baseline gap-space-sm mb-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">28</span>
              <span class="font-body-sm text-body-sm text-secondary font-medium">Next: 4 hrs</span>
            </div>
            <p
              class="font-body-sm text-body-sm text-on-surface-variant flex items-center gap-space-xs"
            >
              <span class="w-2 h-2 rounded-full bg-secondary"></span>
              4 awaiting player acceptance
            </p>
          </div>
          <!-- Card 2 -->
          <div
            class="bg-surface-container rounded-xl p-space-lg shadow-sm hover:shadow-md transition-shadow relative overflow-hidden group"
          >
            <div
              class="absolute top-0 right-0 w-24 h-24 bg-tertiary/10 rounded-bl-full pointer-events-none transition-transform group-hover:scale-110"
            ></div>
            <div class="flex items-center justify-between mb-space-sm">
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                >Results to Validate</span
              >
              <span class="material-symbols-outlined text-tertiary text-[22px]" aria-hidden="true"
                >fact_check</span
              >
            </div>
            <div class="flex items-baseline gap-space-sm mb-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-tertiary">4</span>
              <span class="font-body-sm text-body-sm text-tertiary-fixed-dim">Action required</span>
            </div>
            <p
              class="font-body-sm text-body-sm text-on-surface-variant flex items-center gap-space-xs"
            >
              <span class="w-2 h-2 rounded-full bg-tertiary animate-pulse"></span>
              Official arbiter signoff pending
            </p>
          </div>
          <!-- Card 3 -->
          <div
            class="bg-surface-container rounded-xl p-space-lg shadow-sm hover:shadow-md transition-shadow relative overflow-hidden group"
          >
            <div
              class="absolute top-0 right-0 w-24 h-24 bg-secondary-container/20 rounded-bl-full pointer-events-none transition-transform group-hover:scale-110"
            ></div>
            <div class="flex items-center justify-between mb-space-sm">
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                >Completed Season</span
              >
              <span class="material-symbols-outlined text-secondary text-[22px]" aria-hidden="true"
                >verified</span
              >
            </div>
            <div class="flex items-baseline gap-space-sm mb-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">182</span>
              <span class="font-body-sm text-body-sm text-secondary font-medium"
                >98.4% play rate</span
              >
            </div>
            <p
              class="font-body-sm text-body-sm text-on-surface-variant flex items-center gap-space-xs"
            >
              <span class="material-symbols-outlined text-[14px] text-primary" aria-hidden="true"
                >stars</span
              >
              3,640 total league points allocated
            </p>
          </div>
          <!-- Card 4 -->
          <div
            class="bg-surface-container rounded-xl p-space-lg shadow-sm hover:shadow-md transition-shadow relative overflow-hidden group"
          >
            <div
              class="absolute top-0 right-0 w-24 h-24 bg-primary/10 rounded-bl-full pointer-events-none transition-transform group-hover:scale-110"
            ></div>
            <div class="flex items-center justify-between mb-space-sm">
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                >Dispute Rate</span
              >
              <span class="material-symbols-outlined text-primary text-[22px]" aria-hidden="true"
                >gavel</span
              >
            </div>
            <div class="flex items-baseline gap-space-sm mb-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">0.0%</span>
              <span class="font-body-sm text-body-sm text-secondary">Zero flags</span>
            </div>
            <p
              class="font-body-sm text-body-sm text-on-surface-variant flex items-center gap-space-xs"
            >
              <span class="material-symbols-outlined text-[14px] text-primary" aria-hidden="true"
                >check_circle</span
              >
              Clean arbitration ledger maintained
            </p>
          </div>
        </section>
        <!-- Filter & Controls Toolbar -->
        <section
          class="bg-surface-container rounded-xl p-space-md mb-space-lg shadow-sm flex flex-col gap-space-md"
        >
          <div class="grid grid-cols-1 md:grid-cols-12 gap-space-md items-center">
            <!-- Search Input -->
            <div class="md:col-span-4 relative flex items-center">
              <span
                class="material-symbols-outlined absolute left-3 text-outline text-[20px] pointer-events-none"
                aria-hidden="true"
                >search</span
              >
              <input
                class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md pl-10 pr-4 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary placeholder-outline transition-all"
                id="search-input"
                placeholder="Search by player or ID (#CH-2025-084, Rivera)..."
                type="text"
              />
              <button
                class="hidden absolute right-3 text-outline hover:text-on-surface"
                id="clear-search"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">close</span>
              </button>
            </div>
            <!-- Season Dropdown -->
            <div class="md:col-span-2 relative">
              <select
                class="w-full appearance-none bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary cursor-pointer pr-9"
              >
                <option>Spring League 2025 [Active]</option>
                <option>Winter Championship 2024</option>
                <option>Autumn Blitz Classic 2024</option>
                <option>All Past Seasons</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-2.5 top-2.5 text-outline pointer-events-none text-[20px]"
                aria-hidden="true"
                >expand_more</span
              >
            </div>
            <!-- Match Status Dropdown -->
            <div class="md:col-span-2 relative">
              <select
                class="w-full appearance-none bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary cursor-pointer pr-9"
                id="status-filter"
              >
                <option value="all">Status: All (221)</option>
                <option value="scheduled">Scheduled (8)</option>
                <option value="in_progress">In Progress (2)</option>
                <option value="validation">Awaiting Validation (4)</option>
                <option value="completed">Completed (182)</option>
                <option value="cancelled">Cancelled (5)</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-2.5 top-2.5 text-outline pointer-events-none text-[20px]"
                aria-hidden="true"
                >filter_list</span
              >
            </div>
            <!-- Board / Tier Filter -->
            <div class="md:col-span-2 relative">
              <select
                class="w-full appearance-none bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary cursor-pointer pr-9"
              >
                <option>Tier: All Boards</option>
                <option>Championship Tier</option>
                <option>Premier Tier</option>
                <option>Reserve Boards</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-2.5 top-2.5 text-outline pointer-events-none text-[20px]"
                aria-hidden="true"
                >military_tech</span
              >
            </div>
            <!-- Date Range Picker Quick Tag -->
            <div class="md:col-span-2 flex items-center justify-end">
              <button
                class="w-full flex items-center justify-between bg-surface-container-lowest text-on-surface-variant hover:text-on-surface px-3 py-2.5 rounded-lg font-body-md text-body-md transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="flex items-center gap-space-xs truncate">
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >calendar_today</span
                  >
                  <span>Apr 1 - Apr 30</span>
                </span>
                <span class="material-symbols-outlined text-outline text-[16px]" aria-hidden="true"
                  >keyboard_arrow_down</span
                >
              </button>
            </div>
          </div>
          <!-- Quick Status Toggles & Active Filter Pill Bar -->
          <div class="flex flex-wrap items-center justify-between gap-space-sm pt-space-xs">
            <div class="flex flex-wrap items-center gap-space-xs">
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline mr-space-xs"
                >Quick Views:</span
              >
              <button
                class="px-space-sm py-0.5 rounded-full bg-primary-container text-on-primary-container font-label-badge text-label-badge font-semibold"
                type="button"
                disabled
                title="Design preview"
              >
                Active Round 7
              </button>
              <button
                class="px-space-sm py-0.5 rounded-full bg-surface-container-high hover:bg-surface-bright text-on-surface-variant font-label-badge text-label-badge transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Action Required (4)
              </button>
              <button
                class="px-space-sm py-0.5 rounded-full bg-surface-container-high hover:bg-surface-bright text-on-surface-variant font-label-badge text-label-badge transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Hall A Boards
              </button>
              <button
                class="px-space-sm py-0.5 rounded-full bg-surface-container-high hover:bg-surface-bright text-on-surface-variant font-label-badge text-label-badge transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Grandmaster Pairings
              </button>
            </div>
            <div class="flex items-center gap-space-md text-outline font-body-sm text-body-sm">
              <span>Showing <strong>5</strong> of <strong>221</strong> recorded fixtures</span>
            </div>
          </div>
        </section>
        <!-- Main Match Management Table Section -->
        <section class="bg-surface-container rounded-xl overflow-hidden shadow-sm flex flex-col">
          <div class="overflow-x-auto w-full">
            <table class="w-full text-left border-collapse min-w-[1020px]">
              <thead>
                <tr
                  class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                >
                  <th class="py-space-md px-space-lg font-semibold w-36">Match ID</th>
                  <th class="py-space-md px-space-md font-semibold min-w-[280px]">
                    Pairings (White vs Black)
                  </th>
                  <th class="py-space-md px-space-md font-semibold min-w-[160px]">
                    Season &amp; Round
                  </th>
                  <th class="py-space-md px-space-md font-semibold min-w-[200px]">
                    Date &amp; Venue
                  </th>
                  <th class="py-space-md px-space-md font-semibold min-w-[150px]">Acceptance</th>
                  <th class="py-space-md px-space-md font-semibold min-w-[170px]">
                    Result / Ledger
                  </th>
                  <th class="py-space-md px-space-lg font-semibold text-right min-w-[200px]">
                    Actions
                  </th>
                </tr>
              </thead>
              <tbody
                class="divide-y divide-surface-container-high text-on-surface font-body-md text-body-md"
              >
                <!-- ROW 1: Scheduled / Needs Result Entry -->
                <tr class="hover:bg-surface-container-high/60 transition-colors group">
                  <td class="py-space-md px-space-lg align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface group-hover:text-primary transition-colors"
                        >#CH-2025-091</span
                      >
                      <span
                        class="font-label-badge text-label-badge uppercase tracking-wider text-secondary font-semibold"
                        >Championship</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-1.5">
                      <div
                        class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline"
                      >
                        <span
                          class="px-1.5 py-0.5 rounded bg-surface-container-lowest text-on-surface font-mono text-[11px] font-bold"
                          >BOARD 1</span
                        >
                        <span>Live Arena</span>
                      </div>
                      <!-- White Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-white text-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♔
                          </div>
                          <span class="font-title-md text-title-md text-on-surface font-semibold"
                            >M. Vance</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >GM 2614</span
                          >
                        </div>
                        <span
                          class="material-symbols-outlined text-primary text-[16px]"
                          title="Accepted White Invitation"
                          aria-hidden="true"
                          >check_circle</span
                        >
                      </div>
                      <!-- Black Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-surface-container-highest text-on-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♚
                          </div>
                          <span class="font-title-md text-title-md text-on-surface font-semibold"
                            >E. Rostova</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >WGM 2548</span
                          >
                        </div>
                        <span
                          class="material-symbols-outlined text-primary text-[16px]"
                          title="Accepted Black Invitation"
                          aria-hidden="true"
                          >check_circle</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Spring League 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Round 7 • Classical (90+30)</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-0.5">
                      <div class="flex items-center gap-space-xs text-on-surface font-medium">
                        <span
                          class="material-symbols-outlined text-[16px] text-secondary"
                          aria-hidden="true"
                          >schedule</span
                        >
                        <span>Apr 15, 2025 • 18:30 UTC</span>
                      </div>
                      <div
                        class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm"
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >location_on</span
                        >
                        <span>Club Hall A (Table 01)</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-secondary-container/40 text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                      Both Accepted
                    </span>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-body-sm text-body-sm text-outline uppercase tracking-wider font-semibold"
                        >Pending Match Play</span
                      >
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                        >Fixture Locked</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-lg align-middle text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <button
                        class="open-validation-modal px- space-sm px-3 py-1.5 rounded-lg bg-primary-container hover:bg-primary text-on-primary-container hover:text-on-primary font-title-md text-title-md font-semibold transition-all shadow-sm flex items-center gap-1"
                        data-black="E. Rostova"
                        data-black-rating="WGM 2548"
                        data-board="Board 1"
                        data-match-id="#CH-2025-091"
                        data-venue="Club Hall A"
                        data-white="M. Vance"
                        data-white-rating="GM 2614"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >edit_note</span
                        >
                        <span>Record Result</span>
                      </button>
                      <div class="relative group/menu inline-block">
                        <button
                          class="p-1.5 rounded-lg bg-surface-container-high hover:bg-surface-bright text-outline hover:text-on-surface transition-colors"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >more_vert</span
                          >
                        </button>
                        <div
                          class="hidden group-hover/menu:flex flex-col absolute right-0 top-full mt-1 w-40 bg-surface-container-high rounded-lg shadow-xl p-1 z-30"
                        >
                          <RouterLink
                            class="flex items-center gap-2 px-3 py-1.5 text-left text-on-surface font-body-sm text-body-sm hover:bg-surface-bright rounded"
                            to="/dashboard/matches/sample-match/edit"
                          >
                            <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                              >event_repeat</span
                            >
                            Reschedule
                          </RouterLink>
                          <button
                            class="flex items-center gap-2 px-3 py-1.5 text-left text-error font-body-sm text-body-sm hover:bg-error-container/20 rounded"
                            type="button"
                            disabled
                            title="Design preview"
                          >
                            <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                              >cancel</span
                            >
                            Cancel Fixture
                          </button>
                        </div>
                      </div>
                    </div>
                  </td>
                </tr>
                <!-- ROW 2: Invitation Pending -->
                <tr class="hover:bg-surface-container-high/60 transition-colors group">
                  <td class="py-space-md px-space-lg align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface group-hover:text-primary transition-colors"
                        >#CH-2025-092</span
                      >
                      <span
                        class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                        >Championship</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-1.5">
                      <div
                        class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline"
                      >
                        <span
                          class="px-1.5 py-0.5 rounded bg-surface-container-lowest text-on-surface font-mono text-[11px] font-bold"
                          >BOARD 2</span
                        >
                        <span>Tier 1 Clash</span>
                      </div>
                      <!-- White Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-white text-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♔
                          </div>
                          <span class="font-title-md text-title-md text-on-surface font-semibold"
                            >Liam Novak</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >IM 2430</span
                          >
                        </div>
                        <span
                          class="material-symbols-outlined text-primary text-[16px]"
                          title="Accepted White Invitation"
                          aria-hidden="true"
                          >check_circle</span
                        >
                      </div>
                      <!-- Black Player: PENDING -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-surface-container-highest text-on-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♚
                          </div>
                          <span class="font-title-md text-title-md text-on-surface-variant"
                            >A. Rahmani</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >FM 2385</span
                          >
                        </div>
                        <span
                          class="font-label-badge text-label-badge text-error bg-error-container/20 px-1.5 py-0.5 rounded uppercase font-semibold"
                          >Pending</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Spring League 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Round 7 • Classical (90+30)</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-0.5">
                      <div class="flex items-center gap-space-xs text-on-surface font-medium">
                        <span
                          class="material-symbols-outlined text-[16px] text-secondary"
                          aria-hidden="true"
                          >schedule</span
                        >
                        <span>Apr 15, 2025 • 18:30 UTC</span>
                      </div>
                      <div
                        class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm"
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >location_on</span
                        >
                        <span>Club Hall A (Table 02)</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-error animate-ping"></span>
                      Invitation Pending
                    </span>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-body-sm text-body-sm text-outline uppercase tracking-wider font-semibold"
                        >Awaiting Confirmation</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >Expires in 18 hrs</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-lg align-middle text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <button
                        class="px-3 py-1.5 rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm flex items-center gap-1"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span
                          class="material-symbols-outlined text-[16px] text-tertiary"
                          aria-hidden="true"
                          >send</span
                        >
                        <span>Send Reminder</span>
                      </button>
                      <div class="relative group/menu inline-block">
                        <button
                          class="p-1.5 rounded-lg bg-surface-container-high hover:bg-surface-bright text-outline hover:text-on-surface transition-colors"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >more_vert</span
                          >
                        </button>
                        <div
                          class="hidden group-hover/menu:flex flex-col absolute right-0 top-full mt-1 w-40 bg-surface-container-high rounded-lg shadow-xl p-1 z-30"
                        >
                          <RouterLink
                            class="flex items-center gap-2 px-3 py-1.5 text-left text-on-surface font-body-sm text-body-sm hover:bg-surface-bright rounded"
                            to="/dashboard/matches/sample-match/edit"
                          >
                            <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                              >event_repeat</span
                            >
                            Reschedule
                          </RouterLink>
                          <button
                            class="flex items-center gap-2 px-3 py-1.5 text-left text-error font-body-sm text-body-sm hover:bg-error-container/20 rounded"
                            type="button"
                            disabled
                            title="Design preview"
                          >
                            <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                              >person_off</span
                            >
                            Substitute
                          </button>
                          <button
                            class="flex items-center gap-2 px-3 py-1.5 text-left text-error font-body-sm text-body-sm hover:bg-error-container/20 rounded"
                            type="button"
                            disabled
                            title="Design preview"
                          >
                            <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                              >cancel</span
                            >
                            Cancel
                          </button>
                        </div>
                      </div>
                    </div>
                  </td>
                </tr>
                <!-- ROW 3: Completed 1-0 -->
                <tr class="hover:bg-surface-container-high/60 transition-colors group">
                  <td class="py-space-md px-space-lg align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface group-hover:text-primary transition-colors"
                        >#CH-2025-088</span
                      >
                      <span
                        class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                        >Championship</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-1.5">
                      <div
                        class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline"
                      >
                        <span
                          class="px-1.5 py-0.5 rounded bg-surface-container-lowest text-on-surface font-mono text-[11px] font-bold"
                          >BOARD 1</span
                        >
                        <span>Classical Final</span>
                      </div>
                      <!-- White Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-white text-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♔
                          </div>
                          <span class="font-title-md text-title-md text-on-surface font-semibold"
                            >Alex Rivera</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >GM 2630</span
                          >
                        </div>
                        <span
                          class="px-2 py-0.5 rounded bg-primary-container text-on-primary-container font-label-badge text-label-badge font-bold"
                          >WIN</span
                        >
                      </div>
                      <!-- Black Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg opacity-80"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-surface-container-highest text-on-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♚
                          </div>
                          <span class="font-title-md text-title-md text-on-surface"
                            >Tariq Al-Mansoor</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >IM 2490</span
                          >
                        </div>
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-outline font-label-badge text-label-badge font-bold"
                          >LOSS</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Spring League 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Round 6 • Classical</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-0.5">
                      <div class="flex items-center gap-space-xs text-on-surface">
                        <span
                          class="material-symbols-outlined text-[16px] text-outline"
                          aria-hidden="true"
                          >calendar_today</span
                        >
                        <span>Apr 8, 2025 • Played</span>
                      </div>
                      <div
                        class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm"
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >location_on</span
                        >
                        <span>Club Hall A</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-surface-container-high text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >done_all</span
                      >
                      Completed
                    </span>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <div class="flex items-center gap-1.5">
                        <span
                          class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
                          >1 - 0</span
                        >
                        <span
                          class="font-label-badge text-label-badge bg-primary/10 text-primary px-1 rounded font-semibold"
                          >+20 pts</span
                        >
                      </div>
                      <span class="font-body-sm text-body-sm text-outline"
                        >Rivera +20 | Tariq 0</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-lg align-middle text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <span
                        class="inline-flex items-center gap-1 text-outline font-body-sm text-body-sm mr-2"
                        title="Validated officially"
                      >
                        <span
                          class="material-symbols-outlined text-primary text-[16px]"
                          aria-hidden="true"
                          >verified_user</span
                        >
                        <span>Arbiter Marcus</span>
                      </span>
                      <RouterLink
                        class="px-3 py-1.5 rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm"
                        to="/dashboard/matches/sample-match"
                      >
                        View Dossier
                      </RouterLink>
                    </div>
                  </td>
                </tr>
                <!-- ROW 4: Completed Draw 1/2 - 1/2 -->
                <tr class="hover:bg-surface-container-high/60 transition-colors group">
                  <td class="py-space-md px-space-lg align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface group-hover:text-primary transition-colors"
                        >#CH-2025-089</span
                      >
                      <span
                        class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                        >Premier</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-1.5">
                      <div
                        class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline"
                      >
                        <span
                          class="px-1.5 py-0.5 rounded bg-surface-container-lowest text-on-surface font-mono text-[11px] font-bold"
                          >BOARD 3</span
                        >
                        <span>Sicilian Najdorf (64 moves)</span>
                      </div>
                      <!-- White Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-white text-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♔
                          </div>
                          <span class="font-title-md text-title-md text-on-surface font-semibold"
                            >David Kim</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >FM 2310</span
                          >
                        </div>
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge font-bold"
                          >½</span
                        >
                      </div>
                      <!-- Black Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-surface-container-highest text-on-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♚
                          </div>
                          <span class="font-title-md text-title-md text-on-surface font-semibold"
                            >Alex Rivera</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >GM 2630</span
                          >
                        </div>
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge font-bold"
                          >½</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Spring League 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Round 5 • Classical</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-0.5">
                      <div class="flex items-center gap-space-xs text-on-surface">
                        <span
                          class="material-symbols-outlined text-[16px] text-outline"
                          aria-hidden="true"
                          >calendar_today</span
                        >
                        <span>Apr 1, 2025 • Played</span>
                      </div>
                      <div
                        class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm"
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >location_on</span
                        >
                        <span>Club Hall B</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-surface-container-high text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >done_all</span
                      >
                      Completed
                    </span>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <div class="flex items-center gap-1.5">
                        <span
                          class="font-label-numeric-lg text-label-numeric-lg text-secondary font-bold"
                          >½ - ½</span
                        >
                        <span
                          class="font-label-badge text-label-badge bg-secondary-container/40 text-secondary px-1 rounded font-semibold"
                          >+10 ea</span
                        >
                      </div>
                      <span class="font-body-sm text-body-sm text-outline"
                        >Draw by threefold repetition</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-lg align-middle text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <span
                        class="inline-flex items-center gap-1 text-outline font-body-sm text-body-sm mr-2"
                        title="Validated officially"
                      >
                        <span
                          class="material-symbols-outlined text-primary text-[16px]"
                          aria-hidden="true"
                          >verified_user</span
                        >
                        <span>Arbiter Sarah</span>
                      </span>
                      <RouterLink
                        class="px-3 py-1.5 rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm"
                        to="/dashboard/matches/sample-match"
                      >
                        View Dossier
                      </RouterLink>
                    </div>
                  </td>
                </tr>
                <!-- ROW 5: Cancelled -->
                <tr
                  class="hover:bg-surface-container-high/60 transition-colors group opacity-75 hover:opacity-100"
                >
                  <td class="py-space-md px-space-lg align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-label-numeric-md text-label-numeric-md font-bold text-on-surface group-hover:text-primary transition-colors"
                        >#CH-2025-082</span
                      >
                      <span
                        class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                        >Premier</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-1.5">
                      <div
                        class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline"
                      >
                        <span
                          class="px-1.5 py-0.5 rounded bg-surface-container-lowest text-on-surface font-mono text-[11px] font-bold"
                          >BOARD 4</span
                        >
                        <span>Cancelled Unplayed</span>
                      </div>
                      <!-- White Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-white text-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♔
                          </div>
                          <span class="font-title-md text-title-md text-on-surface"
                            >Omar Farooq</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >FM 2290</span
                          >
                        </div>
                        <span class="font-label-badge text-label-badge text-outline">Ready</span>
                      </div>
                      <!-- Black Player -->
                      <div
                        class="flex items-center justify-between bg-surface-container-low px-space-sm py-1 rounded-lg"
                      >
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-6 h-6 rounded-full bg-surface-container-highest text-on-surface flex items-center justify-center font-bold text-xs shadow-sm"
                          >
                            ♚
                          </div>
                          <span class="font-title-md text-title-md text-on-surface"
                            >Youssef Mansour</span
                          >
                          <span
                            class="font-label-badge text-label-badge text-outline bg-surface-container-highest px-1 py-0.5 rounded"
                            >NM 2210</span
                          >
                        </div>
                        <span class="font-label-badge text-label-badge text-error">Withdrew</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Spring League 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">Round 4</span>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col gap-0.5">
                      <div class="flex items-center gap-space-xs text-outline">
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >calendar_today</span
                        >
                        <span>Mar 25, 2025</span>
                      </div>
                      <div
                        class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm"
                      >
                        <span>No Board Assigned</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-error-container/20 text-error font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-error"></span>
                      Cancelled
                    </span>
                  </td>
                  <td class="py-space-md px-space-md align-middle">
                    <div class="flex flex-col">
                      <span
                        class="font-body-sm text-body-sm text-error font-medium truncate max-w-[190px]"
                        title="Medical emergency declared by Black player 24h prior"
                      >
                        Reason: Medical emergency 24h prior
                      </span>
                      <span class="font-label-badge text-label-badge text-outline"
                        >No rating penalty applied</span
                      >
                    </div>
                  </td>
                  <td class="py-space-md px-space-lg align-middle text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <RouterLink
                        class="px-3 py-1.5 rounded-lg bg-surface-container-high hover:bg-surface-bright text-outline hover:text-on-surface font-title-md text-title-md transition-colors shadow-sm"
                        to="/matches/history"
                      >
                        View Archive
                      </RouterLink>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
          <!-- Table Footer / Pagination -->
          <div
            class="flex flex-col sm:flex-row items-center justify-between px-space-lg py-space-md bg-surface-container-lowest gap-space-md"
          >
            <div class="flex items-center gap-space-sm text-outline font-body-sm text-body-sm">
              <span>Rows per page:</span>
              <select
                class="bg-surface-container px-2 py-1 rounded text-on-surface font-body-sm text-body-sm outline-none cursor-pointer"
              >
                <option>25</option>
                <option>50</option>
                <option>100</option>
              </select>
              <span>Showing 1 to 5 of 221 entries</span>
            </div>
            <div class="flex items-center gap-space-xs">
              <button
                class="p-1 rounded hover:bg-surface-container-high text-outline hover:text-on-surface disabled:opacity-40"
                disabled
                type="button"
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >first_page</span
                >
              </button>
              <button
                class="p-1 rounded hover:bg-surface-container-high text-outline hover:text-on-surface disabled:opacity-40"
                disabled
                type="button"
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >chevron_left</span
                >
              </button>
              <span
                class="px-3 py-1 rounded bg-primary-container text-on-primary-container font-label-badge text-label-badge font-bold"
                >1</span
              >
              <button
                class="px-3 py-1 rounded hover:bg-surface-container-high text-on-surface font-label-badge text-label-badge"
                type="button"
                disabled
                title="Design preview"
              >
                2
              </button>
              <button
                class="px-3 py-1 rounded hover:bg-surface-container-high text-on-surface font-label-badge text-label-badge"
                type="button"
                disabled
                title="Design preview"
              >
                3
              </button>
              <span class="text-outline">...</span>
              <button
                class="px-3 py-1 rounded hover:bg-surface-container-high text-on-surface font-label-badge text-label-badge"
                type="button"
                disabled
                title="Design preview"
              >
                9
              </button>
              <button
                class="p-1 rounded hover:bg-surface-container-high text-outline hover:text-on-surface"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >chevron_right</span
                >
              </button>
              <button
                class="p-1 rounded hover:bg-surface-container-high text-outline hover:text-on-surface"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >last_page</span
                >
              </button>
            </div>
          </div>
        </section>
        <!-- QUICK RESULT VALIDATION MODAL DRAWER -->
        <div
          class="fixed inset-0 z-50 bg-black/70 backdrop-blur-sm hidden flex items-center justify-center p-space-md preview-disclosure preview-disclosure-flex"
          id="validation-drawer"
        >
          <div
            class="w-full max-w-xl bg-surface-container rounded-2xl p-space-xl shadow-2xl flex flex-col gap-space-lg relative animate-in fade-in zoom-in-95 duration-200"
          >
            <!-- Drawer Header -->
            <div
              class="flex items-center justify-between pb-space-sm border-b border-surface-container-highest"
            >
              <div class="flex items-center gap-space-sm">
                <div
                  class="w-10 h-10 rounded-xl bg-primary-container/30 flex items-center justify-center text-primary"
                >
                  <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                    >verified</span
                  >
                </div>
                <div class="flex flex-col">
                  <span class="font-headline-sm text-headline-sm text-on-surface font-bold"
                    >Official Match Validation</span
                  >
                  <span class="font-body-sm text-body-sm text-outline" id="modal-match-subhead"
                    >Arbitration Ledger • #CH-2025-091</span
                  >
                </div>
              </div>
              <button
                class="p-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                id="close-modal-btn"
                type="button"
                v-preview-disclosure="'validation-drawer'"
                data-preview-dismiss=""
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true">close</span>
              </button>
            </div>
            <!-- Match Faceoff Card -->
            <div class="bg-surface-container-low rounded-xl p-space-md flex flex-col gap-space-md">
              <div
                class="flex items-center justify-between text-outline font-label-badge text-label-badge uppercase tracking-wider"
              >
                <span id="modal-board-tag">Board 1 • Classical</span>
                <span id="modal-venue-tag">Hall A</span>
              </div>
              <div class="grid grid-cols-2 gap-space-md items-center relative">
                <!-- White Side -->
                <div
                  class="flex flex-col items-center p-space-md rounded-lg bg-surface-container text-center"
                >
                  <div
                    class="w-12 h-12 rounded-full bg-white text-surface flex items-center justify-center text-2xl font-bold shadow-md mb-2"
                  >
                    ♔
                  </div>
                  <span
                    class="font-title-md text-title-md font-bold text-on-surface"
                    id="modal-white-name"
                    >M. Vance</span
                  >
                  <span class="font-body-sm text-body-sm text-outline" id="modal-white-rating"
                    >GM 2614 (White)</span
                  >
                </div>
                <!-- VS Badge Center -->
                <div
                  class="absolute left-1/2 top-1/2 -translate-x-1/2 -translate-y-1/2 w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-xs text-outline z-10"
                >
                  VS
                </div>
                <!-- Black Side -->
                <div
                  class="flex flex-col items-center p-space-md rounded-lg bg-surface-container text-center"
                >
                  <div
                    class="w-12 h-12 rounded-full bg-surface-container-highest text-on-surface flex items-center justify-center text-2xl font-bold shadow-md mb-2"
                  >
                    ♚
                  </div>
                  <span
                    class="font-title-md text-title-md font-bold text-on-surface"
                    id="modal-black-name"
                    >E. Rostova</span
                  >
                  <span class="font-body-sm text-body-sm text-outline" id="modal-black-rating"
                    >WGM 2548 (Black)</span
                  >
                </div>
              </div>
            </div>
            <!-- Quick Outcome Decision Grid -->
            <div class="flex flex-col gap-space-sm">
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                >Select Official Verdict:</span
              >
              <div class="grid grid-cols-3 gap-space-sm">
                <button
                  class="verdict-btn flex flex-col items-center p-space-md rounded-xl bg-surface-container-low hover:bg-secondary-container/30 focus:ring-2 focus:ring-primary text-center transition-all group"
                  data-outcome="1-0"
                  data-points-b="0"
                  data-points-w="20"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span
                    class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold group-hover:scale-105 transition-transform"
                    >1 - 0</span
                  >
                  <span class="font-title-md text-title-md text-on-surface font-semibold mt-1"
                    >White Wins</span
                  >
                  <span class="font-body-sm text-body-sm text-secondary font-medium mt-0.5"
                    >20 - 0 Pts</span
                  >
                </button>
                <button
                  class="verdict-btn flex flex-col items-center p-space-md rounded-xl bg-surface-container-low hover:bg-surface-bright focus:ring-2 focus:ring-secondary text-center transition-all group"
                  data-outcome="1/2-1/2"
                  data-points-b="10"
                  data-points-w="10"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span
                    class="font-label-numeric-lg text-label-numeric-lg text-secondary font-bold group-hover:scale-105 transition-transform"
                    >½ - ½</span
                  >
                  <span class="font-title-md text-title-md text-on-surface font-semibold mt-1"
                    >Draw</span
                  >
                  <span class="font-body-sm text-body-sm text-secondary font-medium mt-0.5"
                    >10 - 10 Pts</span
                  >
                </button>
                <button
                  class="verdict-btn flex flex-col items-center p-space-md rounded-xl bg-surface-container-low hover:bg-secondary-container/30 focus:ring-2 focus:ring-primary text-center transition-all group"
                  data-outcome="0-1"
                  data-points-b="20"
                  data-points-w="0"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span
                    class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold group-hover:scale-105 transition-transform"
                    >0 - 1</span
                  >
                  <span class="font-title-md text-title-md text-on-surface font-semibold mt-1"
                    >Black Wins</span
                  >
                  <span class="font-body-sm text-body-sm text-secondary font-medium mt-0.5"
                    >0 - 20 Pts</span
                  >
                </button>
              </div>
            </div>
            <!-- Dynamic Arbiter Form Fields -->
            <div class="flex flex-col gap-space-sm">
              <label
                class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                >Arbiter Observation / Victory Method</label
              >
              <input
                class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary placeholder-outline"
                id="victory-method-input"
                placeholder="e.g. Resignation on Move 42, Checkmate, Agreed draw..."
                type="text"
              />
            </div>
            <!-- Action Confirmation Buttons -->
            <div
              class="flex items-center justify-between pt-space-xs border-t border-surface-container-highest"
            >
              <button
                class="px-space-md py-space-sm rounded-lg hover:bg-surface-container-high text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                id="cancel-validation-btn"
                type="button"
                disabled
                title="Design preview"
              >
                Discard
              </button>
              <button
                class="flex items-center gap-space-xs px-space-xl py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md font-semibold hover:bg-primary-fixed-dim transition-all shadow-md"
                id="confirm-ledger-btn"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >verified</span
                >
                <span>Commit to League Ledger</span>
              </button>
            </div>
          </div>
        </div>
        <!-- SCHEDULE NEW FIXTURE MODAL -->
        <div
          class="fixed inset-0 z-50 bg-black/70 backdrop-blur-sm hidden flex items-center justify-center p-space-md preview-disclosure preview-disclosure-flex"
          id="schedule-modal"
        >
          <div
            class="w-full max-w-2xl bg-surface-container rounded-2xl p-space-xl shadow-2xl flex flex-col gap-space-lg animate-in fade-in zoom-in-95 duration-200"
          >
            <div
              class="flex items-center justify-between pb-space-sm border-b border-surface-container-highest"
            >
              <div class="flex items-center gap-space-sm">
                <div
                  class="w-10 h-10 rounded-xl bg-primary-container text-on-primary-container flex items-center justify-center font-bold"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >swords</span
                  >
                </div>
                <div>
                  <h2 class="font-headline-sm text-headline-sm text-on-surface font-bold">
                    Schedule Competitive Fixture
                  </h2>
                  <p class="font-body-sm text-body-sm text-outline">
                    Issue pairing invites with auto-calendar sync
                  </p>
                </div>
              </div>
              <button
                class="p-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container-high"
                id="close-schedule-modal"
                type="button"
                v-preview-disclosure="'schedule-modal'"
                data-preview-dismiss=""
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">close</span>
              </button>
            </div>
            <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
              <!-- White Player Picker -->
              <div class="flex flex-col gap-1.5">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                  >White Pieces Player</label
                >
                <select
                  class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary"
                >
                  <option>M. Vance (GM • 2614)</option>
                  <option>Alex Rivera (GM • 2630)</option>
                  <option>Liam Novak (IM • 2430)</option>
                  <option>David Kim (FM • 2310)</option>
                </select>
              </div>
              <!-- Black Player Picker -->
              <div class="flex flex-col gap-1.5">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                  >Black Pieces Player</label
                >
                <select
                  class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary"
                >
                  <option>E. Rostova (WGM • 2548)</option>
                  <option>Tariq Al-Mansoor (IM • 2490)</option>
                  <option>A. Rahmani (FM • 2385)</option>
                  <option>Omar Farooq (FM • 2290)</option>
                </select>
              </div>
              <!-- Season and Round -->
              <div class="flex flex-col gap-1.5">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                  >Tournament / Season</label
                >
                <select
                  class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary"
                >
                  <option>Spring League 2025 - Round 8</option>
                  <option>Spring League 2025 - Round 9 (Semifinals)</option>
                  <option>Championship Tiebreaker</option>
                </select>
              </div>
              <!-- Tier & Board Number -->
              <div class="flex flex-col gap-1.5">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                  >Board &amp; Tier</label
                >
                <select
                  class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary"
                >
                  <option>Board 1 (Championship Tier)</option>
                  <option>Board 2 (Championship Tier)</option>
                  <option>Board 3 (Premier Tier)</option>
                  <option>Board 4 (Premier Tier)</option>
                </select>
              </div>
              <!-- Date & Time Picker -->
              <div class="flex flex-col gap-1.5">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                  >Match Date &amp; Time (UTC)</label
                >
                <input
                  class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2 rounded-lg outline-none focus:ring-1 focus:ring-primary"
                  type="datetime-local"
                  value="2025-04-22T18:30"
                />
              </div>
              <!-- Venue Selection -->
              <div class="flex flex-col gap-1.5">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline font-semibold"
                  >Venue &amp; Allocation</label
                >
                <select
                  class="w-full bg-surface-container-lowest text-on-surface font-body-md text-body-md px-3.5 py-2.5 rounded-lg outline-none focus:ring-1 focus:ring-primary"
                >
                  <option>Club Hall A - Main Broadcast Stage</option>
                  <option>Club Hall B - Quiet Pavilion</option>
                  <option>Digital Hybrid Arena - Arbiter Inspected</option>
                </select>
              </div>
            </div>
            <!-- Options -->
            <div class="p-space-md rounded-xl bg-surface-container-low flex flex-col gap-2">
              <label class="flex items-center gap-space-sm cursor-pointer">
                <input checked class="accent-primary w-4 h-4 rounded" type="checkbox" />
                <span class="font-body-md text-body-md text-on-surface"
                  >Auto-transmit pairing invitations via SMS &amp; Email</span
                >
              </label>
              <label class="flex items-center gap-space-sm cursor-pointer">
                <input checked class="accent-primary w-4 h-4 rounded" type="checkbox" />
                <span class="font-body-md text-body-md text-on-surface"
                  >Require 48-hour arbiter confirmation cutoff</span
                >
              </label>
            </div>
            <div
              class="flex items-center justify-between pt-space-xs border-t border-surface-container-highest"
            >
              <button
                class="px-space-md py-space-sm rounded-lg hover:bg-surface-container-high text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                id="discard-schedule-btn"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel
              </button>
              <button
                class="flex items-center gap-space-xs px-space-xl py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md font-semibold hover:bg-primary-fixed-dim transition-all shadow-md"
                id="publish-fixture-btn"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">send</span>
                <span>Dispatch Invitations</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Notification Banner Toast (Hidden by default) -->
        <div
          class="fixed bottom-6 right-6 z-50 transform translate-y-24 opacity-0 transition-all duration-300 pointer-events-none flex items-center gap-space-sm px-space-lg py-space-md rounded-xl bg-primary text-on-primary font-title-md text-title-md shadow-xl"
          id="toast-banner"
        >
          <span class="material-symbols-outlined text-[20px]" aria-hidden="true">task_alt</span>
          <span id="toast-message">Result ledger recorded successfully!</span>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
