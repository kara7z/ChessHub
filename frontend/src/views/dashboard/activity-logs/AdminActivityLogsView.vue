<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
import DashboardPageHeader from '../../../components/layout/DashboardPageHeader.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-space-xl">
        <DashboardPageHeader
          section="Activity Logs"
          title="Administration Activity Logs"
          badge="Audit Feed v2.4"
          description="Complete audit trail of administrative operations, match validations, account moderation, and club governance. Every entry is cryptographically tracked to authenticated administrators."
          class="mb-space-md"
        >
          <template #meta>
          <div class="flex flex-wrap items-center gap-space-sm">
            <span
              class="inline-flex items-center gap-1.5 px-space-sm py-0.5 rounded-full bg-surface-container-high text-primary font-label-badge text-label-badge tracking-wider border-0"
            >
              <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
              STREAM ACTIVE
            </span>
            <span class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
              >Immutable Journal</span
            >
          </div>
          </template>
          <template #actions>
              <button
                class="dashboard-action"
                id="refreshLogsBtn"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px] text-outline" aria-hidden="true"
                  >sync</span
                >
                <span>Refresh</span>
              </button>
              <button
                class="dashboard-primary-action"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >download</span
                >
                <span>Export CSV</span>
              </button>
          </template>
        </DashboardPageHeader>
        <!-- Metrics Overview (4 Distinct Bento Cards) -->
        <div class="dashboard-metrics mb-space-lg">
          <!-- Metric 1: Total Logged Actions -->
          <div
            class="dashboard-metric group"
          >
            <div class="flex items-start justify-between mb-space-sm">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-1"
                  >Audit Volume</span
                >
                <span
                  class="font-display-lg text-display-lg text-on-surface leading-none tracking-tight"
                  >1,428</span
                >
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >history_edu</span
                >
              </div>
            </div>
            <div class="flex items-center justify-between text-body-sm font-body-sm pt-space-xs">
              <span class="text-on-surface-variant">Logged this season</span>
              <span
                class="inline-flex items-center text-primary font-label-numeric-md text-label-numeric-md"
              >
                <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                  >trending_up</span
                >
                +14.2%
              </span>
            </div>
            <!-- Micro Sparkline SVG -->
            <div class="mt-space-xs w-full h-2">
              <svg
                class="w-full h-full text-primary"
                preserveAspectRatio="none"
                viewBox="0 0 100 10"
              >
                <path
                  d="M0,8 L15,6 L30,7 L45,3 L60,5 L75,2 L90,4 L100,1"
                  fill="none"
                  stroke="currentColor"
                  stroke-linecap="round"
                  stroke-width="2"
                ></path>
              </svg>
            </div>
          </div>
          <!-- Metric 2: Validated Results -->
          <div
            class="dashboard-metric group"
          >
            <div class="flex items-start justify-between mb-space-sm">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-1"
                  >Match Resolutions</span
                >
                <span
                  class="font-display-lg text-display-lg text-on-surface leading-none tracking-tight"
                  >182</span
                >
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-secondary"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true">rule</span>
              </div>
            </div>
            <div class="flex items-center justify-between text-body-sm font-body-sm pt-space-xs">
              <span class="text-on-surface-variant">Matches ratified</span>
              <span class="text-secondary font-label-numeric-md text-label-numeric-md"
                >100% quorum</span
              >
            </div>
            <!-- Micro Progress Bar -->
            <div
              class="mt-space-xs w-full h-1.5 rounded-full bg-surface-container-highest overflow-hidden"
            >
              <div class="h-full bg-secondary rounded-full" style="width: 88%"></div>
            </div>
          </div>
          <!-- Metric 3: Account Actions -->
          <div
            class="dashboard-metric group"
          >
            <div class="flex items-start justify-between mb-space-sm">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-1"
                  >Player Moderation</span
                >
                <span
                  class="font-display-lg text-display-lg text-on-surface leading-none tracking-tight"
                  >34</span
                >
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-tertiary"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >admin_panel_settings</span
                >
              </div>
            </div>
            <div class="flex items-center justify-between text-body-sm font-body-sm pt-space-xs">
              <span class="text-on-surface-variant">Approvals &amp; suspensions</span>
              <span class="text-tertiary font-label-numeric-md text-label-numeric-md"
                >31 / 3 split</span
              >
            </div>
            <div class="mt-space-xs flex items-center gap-1 w-full h-1.5">
              <div class="h-full bg-tertiary rounded-l-full" style="width: 85%"></div>
              <div class="h-full bg-error rounded-r-full" style="width: 15%"></div>
            </div>
          </div>
          <!-- Metric 4: Active Admins -->
          <div
            class="dashboard-metric group"
          >
            <div class="flex items-start justify-between mb-space-sm">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-1"
                  >Active Arbiters</span
                >
                <span
                  class="font-display-lg text-display-lg text-on-surface leading-none tracking-tight"
                  >3</span
                >
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary-fixed-dim"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true">badge</span>
              </div>
            </div>
            <div class="flex items-center justify-between text-body-sm font-body-sm pt-space-xs">
              <span class="text-on-surface-variant">Authenticated sessions</span>
              <div class="flex -space-x-1.5 items-center">
                <div
                  class="w-5 h-5 rounded-full bg-primary-container flex items-center justify-center text-[10px] text-on-primary-container font-bold"
                >
                  SJ
                </div>
                <div
                  class="w-5 h-5 rounded-full bg-secondary-container flex items-center justify-center text-[10px] text-on-secondary-container font-bold"
                >
                  MV
                </div>
                <div
                  class="w-5 h-5 rounded-full bg-surface-bright flex items-center justify-center text-[10px] text-on-surface font-bold"
                >
                  AC
                </div>
              </div>
            </div>
            <div class="mt-space-xs flex items-center gap-1.5 text-body-sm text-outline">
              <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
              <span class="font-label-badge text-label-badge text-on-surface-variant"
                >Zero unauthorized attempts</span
              >
            </div>
          </div>
        </div>
        <!-- Filter & Search Console Section -->
        <div
          class="dashboard-toolbar mb-space-md flex flex-col gap-space-md"
        >
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-sm items-center">
            <!-- Search Input -->
            <div class="lg:col-span-5 relative">
              <span
                class="material-symbols-outlined absolute left-space-md top-1/2 -translate-y-1/2 text-outline text-[18px]"
                aria-hidden="true"
                >search</span
              >
              <input
                class="w-full bg-surface-container-lowest text-on-surface placeholder:text-outline text-body-md font-body-md pl-10 pr-space-md py-2.5 rounded-lg focus:outline-none focus:bg-surface-container-high focus:ring-1 focus:ring-primary transition-all"
                id="logSearchInput"
                placeholder="Search by administrator, description, or resource ID (e.g. #CH-2025-091)..."
                type="text"
              />
            </div>
            <!-- Administrator Dropdown -->
            <div class="lg:col-span-2 relative">
              <select
                class="w-full bg-surface-container-lowest text-on-surface text-body-md font-body-md px-space-md py-2.5 rounded-lg appearance-none cursor-pointer focus:outline-none focus:ring-1 focus:ring-primary transition-all pr-8"
              >
                <option value="all">All Admins</option>
                <option value="sarah">Sarah Jenkins</option>
                <option value="marcus">Marcus Vance</option>
                <option value="core">Admin Core</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                aria-hidden="true"
                >expand_more</span
              >
            </div>
            <!-- Action Type Dropdown -->
            <div class="lg:col-span-2 relative">
              <select
                class="w-full bg-surface-container-lowest text-on-surface text-body-md font-body-md px-space-md py-2.5 rounded-lg appearance-none cursor-pointer focus:outline-none focus:ring-1 focus:ring-primary transition-all pr-8"
              >
                <option value="all">All Actions</option>
                <option value="result_validated">Result Validated</option>
                <option value="account_approved">Account Approved</option>
                <option value="account_suspended">Account Suspended</option>
                <option value="match_scheduled">Match Scheduled</option>
                <option value="match_rescheduled">Match Rescheduled</option>
                <option value="event_published">Event Published</option>
                <option value="workshop_published">Workshop Published</option>
                <option value="season_started">Season Started</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                aria-hidden="true"
                >expand_more</span
              >
            </div>
            <!-- Resource Type Dropdown -->
            <div class="lg:col-span-2 relative">
              <select
                class="w-full bg-surface-container-lowest text-on-surface text-body-md font-body-md px-space-md py-2.5 rounded-lg appearance-none cursor-pointer focus:outline-none focus:ring-1 focus:ring-primary transition-all pr-8"
              >
                <option value="all">All Resources</option>
                <option value="matches">Matches</option>
                <option value="accounts">Accounts</option>
                <option value="seasons">Seasons</option>
                <option value="events">Events</option>
                <option value="workshops">Workshops</option>
                <option value="tricks">Chess Tricks</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-space-md top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                aria-hidden="true"
                >expand_more</span
              >
            </div>
            <!-- Date Range Picker Quick Trigger -->
            <div class="lg:col-span-1">
              <button
                class="w-full flex items-center justify-center gap-1 bg-surface-container text-on-surface px-space-sm py-2.5 rounded-lg hover:bg-surface-container-high transition-colors text-body-sm font-body-sm"
                title="Filter by timeframe"
                disabled
              >
                <span
                  class="material-symbols-outlined text-[16px] text-secondary"
                  aria-hidden="true"
                  >date_range</span
                >
                <span class="whitespace-nowrap">30 Days</span>
              </button>
            </div>
          </div>
          <!-- Active Tag Indicator Bar -->
          <div
            class="flex flex-wrap items-center justify-between gap-space-sm pt-space-xs text-body-sm"
          >
            <div class="flex items-center gap-space-xs flex-wrap">
              <span
                class="text-outline font-label-badge text-label-badge uppercase tracking-wider mr-1"
                >Filtered by:</span
              >
              <span
                class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container text-on-surface font-label-badge text-label-badge"
              >
                <span>Date: Last 30 Days</span>
                <button
                  class="text-outline hover:text-on-surface ml-0.5"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[12px]" aria-hidden="true"
                    >close</span
                  >
                </button>
              </span>
              <span
                class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container text-on-surface font-label-badge text-label-badge"
              >
                <span>Scope: All System Resources</span>
                <button
                  class="text-outline hover:text-on-surface ml-0.5"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[12px]" aria-hidden="true"
                    >close</span
                  >
                </button>
              </span>
              <button
                class="text-primary hover:underline font-label-badge text-label-badge uppercase tracking-wider ml-space-xs"
                disabled
                title="Design preview"
              >
                Reset All
              </button>
            </div>
            <div class="text-outline font-body-sm text-body-sm">
              Viewing
              <span
                class="text-on-surface font-semibold font-label-numeric-md text-label-numeric-md"
                >7</span
              >
              of
              <span
                class="text-on-surface font-semibold font-label-numeric-md text-label-numeric-md"
                >1,428</span
              >
              operations
            </div>
          </div>
        </div>
        <!-- Detailed Audit Log Table -->
        <div class="dashboard-table">
          <div class="overflow-x-auto">
            <table class="w-full text-left border-collapse" id="auditTable">
              <thead>
                <tr
                  class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider select-none"
                >
                  <th class="py-3.5 px-space-md font-semibold">Timestamp (UTC)</th>
                  <th class="py-3.5 px-space-md font-semibold">Administrator</th>
                  <th class="py-3.5 px-space-md font-semibold">Action Performed</th>
                  <th class="py-3.5 px-space-md font-semibold">Resource</th>
                  <th class="py-3.5 px-space-md font-semibold">Resource ID</th>
                  <th class="py-3.5 px-space-md font-semibold min-w-[280px]">
                    Description / Justification
                  </th>
                  <th class="py-3.5 px-space-md font-semibold text-right">Status / Outcome</th>
                </tr>
              </thead>
              <tbody class="divide-y-0 text-on-surface font-body-md text-body-md">
                <!-- Row 1 -->
                <tr
                  class="hover:bg-surface-container-high transition-colors group cursor-pointer bg-surface-container-low"
                >
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-[15px] text-outline"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 12, 2025</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >14:15:20</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-6 h-6 rounded-full bg-primary-container text-on-primary-container flex items-center justify-center font-bold text-[11px]"
                      >
                        SJ
                      </div>
                      <div class="flex flex-col">
                        <span class="font-title-md text-title-md text-on-surface leading-tight"
                          >Sarah Jenkins</span
                        >
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                          >ADMIN</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-md bg-secondary-container text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Result Validated
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-body-sm text-body-sm"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >swords</span
                      >
                      Match
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-primary bg-surface-container px-2 py-0.5 rounded font-mono"
                      >#CH-2025-088</span
                    >
                  </td>
                  <td class="py-3 px-space-md">
                    <div class="flex flex-col">
                      <span class="text-on-surface leading-snug"
                        >Validated <span class="font-semibold text-secondary">1 - 0</span> for Alex
                        Rivera vs Tariq Al-Mansoor</span
                      >
                      <span class="text-outline font-body-sm text-body-sm"
                        >+20 pts to Rivera (Confirmed via PGN scoresheet)</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap text-right">
                    <span
                      class="inline-flex items-center gap-1 text-secondary font-label-numeric-md text-label-numeric-md bg-secondary-container/40 px-2.5 py-1 rounded"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >check_circle</span
                      >
                      Verified
                    </span>
                  </td>
                </tr>
                <!-- Row 2 -->
                <tr
                  class="hover:bg-surface-container-high transition-colors group cursor-pointer bg-surface-container-lowest"
                >
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-[15px] text-outline"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 12, 2025</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >11:32:04</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-6 h-6 rounded-full bg-secondary-container text-on-secondary-container flex items-center justify-center font-bold text-[11px]"
                      >
                        MV
                      </div>
                      <div class="flex flex-col">
                        <span class="font-title-md text-title-md text-on-surface leading-tight"
                          >Marcus Vance</span
                        >
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                          >ADMIN</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-md bg-tertiary-container text-on-tertiary-container font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-tertiary-container"></span>
                      Account Approved
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-body-sm text-body-sm"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >person</span
                      >
                      Account
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-tertiary bg-surface-container px-2 py-0.5 rounded font-mono"
                      >#CH-2045</span
                    >
                  </td>
                  <td class="py-3 px-space-md">
                    <div class="flex flex-col">
                      <span class="text-on-surface leading-snug"
                        >Approved player registration for Elena Garcia</span
                      >
                      <span class="text-outline font-body-sm text-body-sm"
                        >Assigned Role: PLAYER | Identity credentials verified</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap text-right">
                    <span
                      class="inline-flex items-center gap-1 text-tertiary font-label-numeric-md text-label-numeric-md bg-surface-container px-2.5 py-1 rounded"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >done</span
                      >
                      Approved
                    </span>
                  </td>
                </tr>
                <!-- Row 3 -->
                <tr
                  class="hover:bg-surface-container-high transition-colors group cursor-pointer bg-surface-container-low"
                >
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-[15px] text-outline"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 11, 2025</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >18:40:12</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-6 h-6 rounded-full bg-primary-container text-on-primary-container flex items-center justify-center font-bold text-[11px]"
                      >
                        SJ
                      </div>
                      <div class="flex flex-col">
                        <span class="font-title-md text-title-md text-on-surface leading-tight"
                          >Sarah Jenkins</span
                        >
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                          >ADMIN</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-md bg-surface-container-highest text-tertiary-fixed font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-tertiary-fixed"></span>
                      Match Scheduled
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-body-sm text-body-sm"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >swords</span
                      >
                      Match
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-primary bg-surface-container px-2 py-0.5 rounded font-mono"
                      >#CH-2025-092</span
                    >
                  </td>
                  <td class="py-3 px-space-md">
                    <div class="flex flex-col">
                      <span class="text-on-surface leading-snug"
                        >Scheduled Liam Novak vs Amine Rahmani, Round 7 Board 2</span
                      >
                      <span class="text-outline font-body-sm text-body-sm"
                        >Swiss Tournament pair matching algorithm confirmed</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap text-right">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md bg-surface-container px-2.5 py-1 rounded"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >send</span
                      >
                      Dispatched
                    </span>
                  </td>
                </tr>
                <!-- Row 4 -->
                <tr
                  class="hover:bg-surface-container-high transition-colors group cursor-pointer bg-surface-container-lowest"
                >
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-[15px] text-outline"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 10, 2025</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >16:05:44</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-6 h-6 rounded-full bg-secondary-container text-on-secondary-container flex items-center justify-center font-bold text-[11px]"
                      >
                        MV
                      </div>
                      <div class="flex flex-col">
                        <span class="font-title-md text-title-md text-on-surface leading-tight"
                          >Marcus Vance</span
                        >
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                          >ADMIN</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-md bg-error-container text-on-error-container font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-error"></span>
                      Account Suspended
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-body-sm text-body-sm"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >person_off</span
                      >
                      Account
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-error bg-surface-container px-2 py-0.5 rounded font-mono"
                      >#CH-1980</span
                    >
                  </td>
                  <td class="py-3 px-space-md">
                    <div class="flex flex-col">
                      <span class="text-error leading-snug font-medium"
                        >Suspended Liam Novak (PLAYER)</span
                      >
                      <span class="text-outline font-body-sm text-body-sm"
                        >Reason: Unsportsmanlike conduct in Round 4 (Refusal to record moves)</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap text-right">
                    <span
                      class="inline-flex items-center gap-1 text-error font-label-numeric-md text-label-numeric-md bg-error-container/30 px-2.5 py-1 rounded"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >gavel</span
                      >
                      Sanctioned
                    </span>
                  </td>
                </tr>
                <!-- Row 5 -->
                <tr
                  class="hover:bg-surface-container-high transition-colors group cursor-pointer bg-surface-container-low"
                >
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-[15px] text-outline"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 09, 2025</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >09:12:30</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-6 h-6 rounded-full bg-primary-container text-on-primary-container flex items-center justify-center font-bold text-[11px]"
                      >
                        SJ
                      </div>
                      <div class="flex flex-col">
                        <span class="font-title-md text-title-md text-on-surface leading-tight"
                          >Sarah Jenkins</span
                        >
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                          >ADMIN</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-md bg-secondary-fixed/20 text-secondary-fixed font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary-fixed"></span>
                      Workshop Published
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-body-sm text-body-sm"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >co_present</span
                      >
                      Workshop
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-secondary-fixed font-mono bg-surface-container px-2 py-0.5 rounded"
                      >#WK-104</span
                    >
                  </td>
                  <td class="py-3 px-space-md">
                    <div class="flex flex-col">
                      <span class="text-on-surface leading-snug"
                        >Published 'Mastering the Sicilian Najdorf'</span
                      >
                      <span class="text-outline font-body-sm text-body-sm"
                        >Instructor: GM Tariq Al-Mansoor | Open registration enabled</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap text-right">
                    <span
                      class="inline-flex items-center gap-1 text-secondary font-label-numeric-md text-label-numeric-md bg-surface-container px-2.5 py-1 rounded"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >public</span
                      >
                      Published
                    </span>
                  </td>
                </tr>
                <!-- Row 6 -->
                <tr
                  class="hover:bg-surface-container-high transition-colors group cursor-pointer bg-surface-container-lowest"
                >
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-[15px] text-outline"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 08, 2025</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >15:22:18</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-6 h-6 rounded-full bg-primary flex items-center justify-center font-bold text-[11px] text-on-primary"
                      >
                        AC
                      </div>
                      <div class="flex flex-col">
                        <span class="font-title-md text-title-md text-on-surface leading-tight"
                          >Admin Core</span
                        >
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                          >SYSTEM ADMIN</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-md bg-secondary-container text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Event Created
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-body-sm text-body-sm"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >event_available</span
                      >
                      Event
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-primary bg-surface-container px-2 py-0.5 rounded font-mono"
                      >#EV-2025-04</span
                    >
                  </td>
                  <td class="py-3 px-space-md">
                    <div class="flex flex-col">
                      <span class="text-on-surface leading-snug"
                        >Created Spring Swiss Championship 2025</span
                      >
                      <span class="text-outline font-body-sm text-body-sm"
                        >System auto-configured standard FIDE 90+30 time control</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap text-right">
                    <span
                      class="inline-flex items-center gap-1 text-secondary font-label-numeric-md text-label-numeric-md bg-secondary-container/30 px-2.5 py-1 rounded"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >published_with_changes</span
                      >
                      Draft → Published
                    </span>
                  </td>
                </tr>
                <!-- Row 7 -->
                <tr
                  class="hover:bg-surface-container-high transition-colors group cursor-pointer bg-surface-container-low"
                >
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-[15px] text-outline"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 05, 2025</span
                      >
                      <span class="font-label-numeric-md text-label-numeric-md text-outline"
                        >17:00:00</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-6 h-6 rounded-full bg-secondary-container text-on-secondary-container flex items-center justify-center font-bold text-[11px]"
                      >
                        MV
                      </div>
                      <div class="flex flex-col">
                        <span class="font-title-md text-title-md text-on-surface leading-tight"
                          >Marcus Vance</span
                        >
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                          >ADMIN</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-md bg-secondary-container text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Result Validated
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 text-on-surface-variant font-body-sm text-body-sm"
                    >
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >swords</span
                      >
                      Match
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-primary bg-surface-container px-2 py-0.5 rounded font-mono"
                      >#CH-2025-085</span
                    >
                  </td>
                  <td class="py-3 px-space-md">
                    <div class="flex flex-col">
                      <span class="text-on-surface leading-snug"
                        >Validated Draw (<span class="font-semibold text-secondary">½ - ½</span>)
                        for David Kim vs Alex Rivera</span
                      >
                      <span class="text-outline font-body-sm text-body-sm"
                        >+10 pts each | Threefold repetition agreed at Move 38</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap text-right">
                    <span
                      class="inline-flex items-center gap-1 text-secondary font-label-numeric-md text-label-numeric-md bg-secondary-container/40 px-2.5 py-1 rounded"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >check_circle</span
                      >
                      Verified
                    </span>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
          <!-- Pagination Controls (Grandmaster Minimalist) -->
          <div
            class="flex flex-col sm:flex-row items-center justify-between px-space-md py-space-sm bg-surface-container-lowest gap-space-sm"
          >
            <div class="flex items-center gap-space-sm text-body-sm font-body-sm text-outline">
              <span
                >Showing
                <strong class="text-on-surface font-label-numeric-md text-label-numeric-md"
                  >1-7</strong
                >
                of
                <strong class="text-on-surface font-label-numeric-md text-label-numeric-md"
                  >1,428</strong
                >
                audit logs</span
              >
              <span class="text-surface-container-highest">•</span>
              <div class="flex items-center gap-space-xs">
                <span>Rows per page:</span>
                <select
                  class="bg-surface-container text-on-surface rounded px-1.5 py-0.5 focus:outline-none focus:ring-1 focus:ring-primary text-body-sm font-label-numeric-md"
                >
                  <option>7</option>
                  <option>25</option>
                  <option>50</option>
                  <option>100</option>
                </select>
              </div>
            </div>
            <!-- Page Numbers: 1 2 3 ... 204 -->
            <div class="flex items-center gap-1 select-none">
              <button
                class="w-8 h-8 rounded flex items-center justify-center text-outline hover:text-on-surface hover:bg-surface-container disabled:opacity-30 disabled:pointer-events-none transition-colors"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >chevron_left</span
                >
              </button>
              <button
                class="w-8 h-8 rounded bg-primary-container text-on-primary-container font-label-numeric-md text-label-numeric-md font-bold flex items-center justify-center"
                disabled
                title="Design preview"
              >
                1
              </button>
              <button
                class="w-8 h-8 rounded text-on-surface hover:bg-surface-container font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                2
              </button>
              <button
                class="w-8 h-8 rounded text-on-surface hover:bg-surface-container font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                3
              </button>
              <span class="px-1 text-outline font-label-numeric-md text-label-numeric-md">…</span>
              <button
                class="w-8 h-8 rounded text-on-surface hover:bg-surface-container font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                204
              </button>
              <button
                class="w-8 h-8 rounded flex items-center justify-center text-outline hover:text-on-surface hover:bg-surface-container transition-colors"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >chevron_right</span
                >
              </button>
            </div>
          </div>
        </div>
        <!-- Realtime Arbiter Verification Footnote -->
        <div
          class="mt-space-md flex flex-col sm:flex-row items-start sm:items-center justify-between text-body-sm text-outline px-space-xs gap-space-xs"
        >
          <div class="flex items-center gap-space-xs">
            <span class="material-symbols-outlined text-[16px] text-primary" aria-hidden="true"
              >lock_clock</span
            >
            <span
              >All audit records are cryptographically timestamped and replicated to club archives
              every 300 seconds.</span
            >
          </div>
          <div
            class="flex items-center gap-space-md font-label-badge text-label-badge uppercase tracking-wider"
          >
            <span>Consensus Algorithm: PBFT-Arbiter</span>
            <span>Cluster: US-East-1</span>
          </div>
        </div>
        <!-- Micro-interaction logic for instantaneous live search feedback -->
      </div>
    </main>
  </DashboardLayout>
</template>
