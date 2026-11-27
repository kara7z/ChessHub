<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Top Navigation & Action Bar -->
        <div
          class="flex flex-col md:flex-row md:items-center justify-between gap-space-md pt-space-lg pb-space-md"
        >
          <div class="flex flex-col gap-space-xs">
            <div class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline">
              <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard"
                >Dashboard</RouterLink
              >
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-on-surface font-title-md text-title-md">Seasons</span>
            </div>
            <div class="flex items-baseline gap-space-md">
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                Competitive Seasons
              </h1>
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider px-space-xs py-0.5 rounded bg-surface-container-high text-outline"
                >Season Manager v2.4</span
              >
            </div>
          </div>
          <div class="flex items-center gap-space-sm">
            <button
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-all text-body-md font-body-md shadow-sm"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >file_download</span
              >
              <span>Export Standings</span>
            </button>
            <RouterLink
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-primary-container text-on-primary-container font-headline-sm text-title-md hover:bg-primary transition-all shadow-md group"
              to="/dashboard/seasons/create"
            >
              <span
                class="material-symbols-outlined text-[20px] transition-transform group-hover:rotate-90"
                aria-hidden="true"
                >add</span
              >
              <span>Create New Season</span>
            </RouterLink>
          </div>
        </div>
        <!-- Operational Explanatory Notice -->
        <div
          class="relative overflow-hidden rounded-xl bg-surface-container-low p-space-md shadow-sm mb-space-lg"
        >
          <div class="absolute left-0 top-0 bottom-0 w-1 bg-primary-container"></div>
          <div class="flex items-start gap-space-md pl-space-xs">
            <div
              class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
            >
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
            </div>
            <div class="flex flex-col gap-0.5">
              <span class="font-title-md text-title-md text-on-surface"
                >Arbitration Protocol &amp; State Concurrency</span
              >
              <p class="font-body-md text-body-md text-on-surface-variant">
                Only one competitive season can be active at a time. Every new season starts with 0
                points for all players. Past season standings are permanently preserved.
              </p>
            </div>
            <div
              class="ml-auto hidden xl:flex items-center gap-space-xs text-outline font-label-numeric-md text-label-numeric-md"
            >
              <span class="material-symbols-outlined text-[16px] text-secondary" aria-hidden="true"
                >verified_user</span
              >
              <span>STRICT CONCURRENCY LOCK ACTIVE</span>
            </div>
          </div>
        </div>
        <!-- Active Season Spotlight Hero Card -->
        <div
          class="relative overflow-hidden rounded-xl bg-surface-container-low p-space-lg shadow-xl mb-space-xl"
        >
          <div
            class="absolute -right-20 -top-24 w-96 h-96 rounded-full bg-primary/5 blur-3xl pointer-events-none"
          ></div>
          <div class="relative z-10 flex flex-col gap-space-lg">
            <!-- Card Top: Badges, Title & Primary Metrics -->
            <div class="flex flex-col lg:flex-row lg:items-start justify-between gap-space-md">
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center gap-space-sm flex-wrap">
                  <span
                    class="flex items-center gap-1.5 px-2.5 py-1 rounded bg-primary-container/20 text-primary font-label-badge text-label-badge tracking-wider font-semibold"
                  >
                    <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                    ACTIVE SEASON
                  </span>
                  <span
                    class="font-label-badge text-label-badge text-outline uppercase tracking-wider bg-surface-container-high px-2 py-1 rounded"
                    >Round 7 of 10</span
                  >
                  <span
                    class="font-label-badge text-label-badge text-secondary bg-secondary-container/40 px-2 py-1 rounded flex items-center gap-1"
                  >
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >public</span
                    >
                    Global Ladder
                  </span>
                </div>
                <h2 class="font-display-lg text-display-lg text-on-surface tracking-tight">
                  Spring League 2025
                </h2>
                <div
                  class="flex items-center gap-space-xs text-on-surface-variant font-body-md text-body-md"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >calendar_today</span
                  >
                  <span>March 1, 2025 – May 30, 2025</span>
                  <span class="text-outline">·</span>
                  <span class="text-secondary font-label-numeric-md text-label-numeric-md"
                    >42 Days Remaining</span
                  >
                </div>
              </div>
              <!-- Quick Admin Action Triggers -->
              <div class="flex items-center gap-space-xs flex-wrap self-start">
                <button
                  class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors text-body-md font-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >leaderboard</span
                  >
                  <span>View Standings &amp; Details</span>
                </button>
                <button
                  class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors text-body-md font-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >edit_note</span
                  >
                  <span>Edit Info</span>
                </button>
                <button
                  class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-error-container/30 text-error hover:bg-error-container/50 transition-colors text-body-md font-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >gavel</span
                  >
                  <span>Close Season</span>
                </button>
              </div>
            </div>
            <!-- Linear Progress Bar -->
            <div class="flex flex-col gap-space-xs">
              <div class="flex justify-between items-baseline font-body-sm text-body-sm">
                <span class="text-on-surface-variant font-title-md text-title-md"
                  >Tournament Pace &amp; Completion</span
                >
                <div class="flex items-center gap-space-xs">
                  <span class="text-on-surface font-label-numeric-lg text-label-numeric-lg"
                    >65%</span
                  >
                  <span class="text-outline">Completed</span>
                </div>
              </div>
              <div
                class="w-full h-3 rounded-full bg-surface-container-highest overflow-hidden p-0.5"
              >
                <div
                  class="h-full rounded-full bg-primary transition-all duration-700 shadow-sm"
                  style="width: 65%"
                ></div>
              </div>
            </div>
            <!-- High-Density Metrics Bento Strip -->
            <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md pt-space-xs">
              <!-- Metric 1: Players -->
              <div
                class="flex items-center gap-space-md p-space-md rounded-xl bg-surface-container"
              >
                <div
                  class="w-12 h-12 rounded-xl bg-surface-container-high flex items-center justify-center text-secondary"
                >
                  <span class="material-symbols-outlined text-[26px]" aria-hidden="true"
                    >groups</span
                  >
                </div>
                <div class="flex flex-col">
                  <span class="font-body-sm text-body-sm text-outline uppercase tracking-wider"
                    >Registered Contenders</span
                  >
                  <div class="flex items-baseline gap-space-xs">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                      >64</span
                    >
                    <span class="font-body-sm text-body-sm text-secondary">Active Players</span>
                  </div>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Capacity at 100%</span
                  >
                </div>
              </div>
              <!-- Metric 2: Matches Done -->
              <div
                class="flex items-center gap-space-md p-space-md rounded-xl bg-surface-container"
              >
                <div
                  class="w-12 h-12 rounded-xl bg-surface-container-high flex items-center justify-center text-primary"
                >
                  <span class="material-symbols-outlined text-[26px]" aria-hidden="true"
                    >swords</span
                  >
                </div>
                <div class="flex flex-col">
                  <span class="font-body-sm text-body-sm text-outline uppercase tracking-wider"
                    >Matches Verified</span
                  >
                  <div class="flex items-baseline gap-space-xs">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                      >182</span
                    >
                    <span class="font-body-sm text-body-sm text-outline">/ 221 total</span>
                  </div>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >39 games remaining</span
                  >
                </div>
              </div>
              <!-- Metric 3: Season Frontrunner -->
              <div
                class="flex items-center justify-between p-space-md rounded-xl bg-surface-container"
              >
                <div class="flex items-center gap-space-md">
                  <div class="relative">
                    <div
                      class="w-12 h-12 rounded-xl bg-secondary-container flex items-center justify-center text-secondary overflow-hidden"
                    >
                      <span class="material-symbols-outlined text-[26px]" aria-hidden="true"
                        >military_tech</span
                      >
                    </div>
                    <span
                      class="absolute -top-1 -right-1 w-4 h-4 rounded-full bg-primary text-on-primary font-label-badge text-[9px] flex items-center justify-center font-bold"
                      >1</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <span class="font-body-sm text-body-sm text-outline uppercase tracking-wider"
                      >Current Leader</span
                    >
                    <div class="flex items-center gap-space-xs">
                      <span class="font-title-md text-title-md text-on-surface font-semibold"
                        >Adam Chen</span
                      >
                      <span
                        class="font-label-badge text-label-badge text-on-surface-variant px-1 rounded bg-surface-container-high"
                        >GM</span
                      >
                    </div>
                    <span class="font-label-numeric-md text-label-numeric-md text-primary"
                      >330 pts
                      <span class="text-outline text-body-sm font-normal font-body-sm"
                        >(15W - 3D - 2L)</span
                      ></span
                    >
                  </div>
                </div>
                <div class="hidden sm:block text-right">
                  <!-- Dynamic Mini Sparkline for Point Acceleration -->
                  <svg class="w-16 h-8 text-primary" fill="none" viewBox="0 0 64 32">
                    <path
                      d="M2 28L14 24L26 26L38 14L50 18L62 4"
                      stroke="currentColor"
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      stroke-width="2.5"
                    ></path>
                  </svg>
                  <span
                    class="font-body-sm text-[10px] text-outline uppercase tracking-wider block mt-1"
                    >+40 this wk</span
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- Content Split: Status Filter Tabs & Table + Side Specs -->
        <div class="grid grid-cols-1 xl:grid-cols-12 gap-space-lg items-start">
          <!-- Left Column: Master Table and Controls (8 cols or 9 cols) -->
          <div class="xl:col-span-9 flex flex-col gap-space-md">
            <!-- Filter Ribbon -->
            <div
              class="flex flex-wrap items-center justify-between gap-space-md bg-surface-container-lowest p-space-xs rounded-xl"
            >
              <div
                class="flex items-center gap-space-xs overflow-x-auto pb-1 sm:pb-0"
                id="filter-pills"
              >
                <button
                  class="filter-pill active px-space-md py-1.5 rounded-lg bg-surface-container-high text-on-surface font-title-md text-body-md transition-all"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  All Seasons
                  <span class="ml-1 text-primary font-label-numeric-md text-label-numeric-md"
                    >4</span
                  >
                </button>
                <button
                  class="filter-pill px-space-md py-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-all text-body-md font-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Active
                  <span
                    class="ml-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                    >1</span
                  >
                </button>
                <button
                  class="filter-pill px-space-md py-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-all text-body-md font-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Upcoming
                  <span
                    class="ml-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                    >1</span
                  >
                </button>
                <button
                  class="filter-pill px-space-md py-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-all text-body-md font-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Completed
                  <span
                    class="ml-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                    >2</span
                  >
                </button>
                <button
                  class="filter-pill px-space-md py-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-all text-body-md font-body-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Archived
                  <span
                    class="ml-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                    >0</span
                  >
                </button>
              </div>
              <!-- Search Table Filter -->
              <div class="relative w-full sm:w-64">
                <span
                  class="material-symbols-outlined absolute left-3 top-2.5 text-outline text-[18px]"
                  aria-hidden="true"
                  >search</span
                >
                <input
                  class="w-full bg-surface-container-low text-on-surface pl-9 pr-3 py-1.5 rounded-lg text-body-md font-body-md placeholder-outline focus:outline-none focus:bg-surface-container-high transition-colors"
                  placeholder="Search season or champion..."
                  type="text"
                />
              </div>
            </div>
            <!-- Seasons Data Table -->
            <div class="overflow-hidden rounded-xl bg-surface-container-low shadow-sm">
              <div class="overflow-x-auto">
                <table class="w-full text-left border-collapse">
                  <thead>
                    <tr
                      class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                    >
                      <th class="py-space-md px-space-md">Season Name</th>
                      <th class="py-space-md px-space-sm">Status</th>
                      <th class="py-space-md px-space-sm">Timeline</th>
                      <th class="py-space-md px-space-sm">Players</th>
                      <th class="py-space-md px-space-sm">Completed</th>
                      <th class="py-space-md px-space-sm">Progress</th>
                      <th class="py-space-md px-space-sm">Leader / Champion</th>
                      <th class="py-space-md px-space-md text-right">Actions</th>
                    </tr>
                  </thead>
                  <tbody class="divide-y-0 text-body-md font-body-md">
                    <!-- ROW 1: Active Season -->
                    <tr
                      class="hover:bg-surface-container-high/60 transition-colors bg-surface-container/20 group"
                    >
                      <td class="py-space-md px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-lg bg-primary-container/20 text-primary flex items-center justify-center flex-shrink-0"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >sports_score</span
                            >
                          </div>
                          <div class="flex flex-col min-w-0">
                            <span
                              class="font-title-md text-title-md text-on-surface font-semibold truncate group-hover:text-primary transition-colors"
                              >Spring League 2025</span
                            >
                            <span class="font-body-sm text-body-sm text-outline"
                              >Tier 1 · Swiss Format</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <span
                          class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full bg-primary/10 text-primary font-label-badge text-label-badge font-semibold"
                        >
                          <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                          ACTIVE
                        </span>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex flex-col">
                          <span class="text-on-surface font-label-numeric-md text-label-numeric-md"
                            >Mar 01, 2025</span
                          >
                          <span class="text-outline font-body-sm text-body-sm"
                            >to May 30, 2025</span
                          >
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex items-center gap-1 text-on-surface">
                          <span class="font-label-numeric-md text-label-numeric-md">64</span>
                          <span class="text-outline font-body-sm text-body-sm">Players</span>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >182</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">/ 221</span>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <div class="flex flex-col gap-1 w-24">
                          <div
                            class="flex justify-between text-body-sm font-label-numeric-md text-label-numeric-md text-on-surface"
                          >
                            <span>65%</span>
                          </div>
                          <div
                            class="w-full h-1.5 rounded-full bg-surface-container-highest overflow-hidden"
                          >
                            <div class="h-full rounded-full bg-primary" style="width: 65%"></div>
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex items-center gap-space-xs">
                          <span
                            class="material-symbols-outlined text-[16px] text-secondary"
                            aria-hidden="true"
                            >workspace_premium</span
                          >
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-body-md text-on-surface font-medium leading-none"
                              >Adam Chen</span
                            >
                            <span class="font-body-sm text-[11px] text-primary"
                              >Current Leader (330 pts)</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-md text-right whitespace-nowrap">
                        <div class="flex items-center justify-end gap-1">
                          <RouterLink
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="View Standings"
                            to="/dashboard/seasons/spring-2025"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >visibility</span
                            >
                          </RouterLink>
                          <RouterLink
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="Edit Season"
                            to="/dashboard/seasons/spring-2025/edit"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >edit</span
                            >
                          </RouterLink>
                          <button
                            class="p-1.5 rounded text-outline hover:text-error hover:bg-surface-container-highest transition-colors"
                            title="Close Season"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >cancel</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                    <!-- ROW 2: Upcoming Season -->
                    <tr class="hover:bg-surface-container-high/60 transition-colors group">
                      <td class="py-space-md px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-lg bg-tertiary/10 text-tertiary flex items-center justify-center flex-shrink-0"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >event_upcoming</span
                            >
                          </div>
                          <div class="flex flex-col min-w-0">
                            <span
                              class="font-title-md text-title-md text-on-surface font-semibold truncate group-hover:text-tertiary transition-colors"
                              >Summer Championship 2025</span
                            >
                            <span class="font-body-sm text-body-sm text-outline"
                              >Tier 1 · Invitational Open</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <span
                          class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full bg-tertiary/15 text-tertiary font-label-badge text-label-badge font-semibold"
                        >
                          <span class="w-1.5 h-1.5 rounded-full bg-tertiary"></span>
                          UPCOMING
                        </span>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex flex-col">
                          <span class="text-on-surface font-label-numeric-md text-label-numeric-md"
                            >Jun 15, 2025</span
                          >
                          <span class="text-outline font-body-sm text-body-sm"
                            >to Aug 30, 2025</span
                          >
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex items-center gap-1 text-on-surface">
                          <span class="font-label-numeric-md text-label-numeric-md">42</span>
                          <span class="text-outline font-body-sm text-body-sm">Pre-registered</span>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <span class="font-label-numeric-md text-label-numeric-md text-outline"
                          >0</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">/ 180</span>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <div class="flex flex-col gap-1 w-24">
                          <div
                            class="flex justify-between text-body-sm font-label-numeric-md text-label-numeric-md text-outline"
                          >
                            <span>0%</span>
                          </div>
                          <div
                            class="w-full h-1.5 rounded-full bg-surface-container-highest overflow-hidden"
                          >
                            <div class="h-full rounded-full bg-tertiary" style="width: 0%"></div>
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <span class="font-body-sm text-body-sm text-outline italic">TBD</span>
                      </td>
                      <td class="py-space-md px-space-md text-right whitespace-nowrap">
                        <div class="flex items-center justify-end gap-1">
                          <RouterLink
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="View Setup"
                            to="/dashboard/seasons/summer-2025"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >visibility</span
                            >
                          </RouterLink>
                          <RouterLink
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="Edit Parameters"
                            to="/dashboard/seasons/summer-2025/edit"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >edit</span
                            >
                          </RouterLink>
                          <button
                            class="p-1.5 rounded text-secondary hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="Start Season Early"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >play_arrow</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                    <!-- ROW 3: Completed Season 1 -->
                    <tr class="hover:bg-surface-container-high/60 transition-colors group">
                      <td class="py-space-md px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-lg bg-surface-container-high text-outline flex items-center justify-center flex-shrink-0"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >emoji_events</span
                            >
                          </div>
                          <div class="flex flex-col min-w-0">
                            <span
                              class="font-title-md text-title-md text-on-surface font-semibold truncate"
                              >Winter Cup 2024</span
                            >
                            <span class="font-body-sm text-body-sm text-outline"
                              >Tier 2 · Round Robin</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <span
                          class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge font-semibold"
                        >
                          <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                          COMPLETED
                        </span>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex flex-col">
                          <span class="text-on-surface font-label-numeric-md text-label-numeric-md"
                            >Dec 01, 2024</span
                          >
                          <span class="text-outline font-body-sm text-body-sm"
                            >to Feb 28, 2025</span
                          >
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex items-center gap-1 text-on-surface">
                          <span class="font-label-numeric-md text-label-numeric-md">58</span>
                          <span class="text-outline font-body-sm text-body-sm">Players</span>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >210</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">/ 210</span>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <div class="flex flex-col gap-1 w-24">
                          <div
                            class="flex justify-between text-body-sm font-label-numeric-md text-label-numeric-md text-secondary"
                          >
                            <span>100%</span>
                          </div>
                          <div
                            class="w-full h-1.5 rounded-full bg-surface-container-highest overflow-hidden"
                          >
                            <div class="h-full rounded-full bg-secondary" style="width: 100%"></div>
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex items-center gap-space-xs">
                          <span
                            class="material-symbols-outlined text-[16px] text-secondary"
                            aria-hidden="true"
                            >military_tech</span
                          >
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-body-md text-on-surface font-semibold leading-none"
                              >Adam Chen</span
                            >
                            <span class="font-body-sm text-[11px] text-secondary"
                              >Champion (380 pts)</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-md text-right whitespace-nowrap">
                        <div class="flex items-center justify-end gap-1">
                          <RouterLink
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="View Final Standings"
                            to="/dashboard/seasons/winter-2024"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >visibility</span
                            >
                          </RouterLink>
                          <button
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="Archive Season Logs"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >archive</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                    <!-- ROW 4: Completed Season 2 -->
                    <tr class="hover:bg-surface-container-high/60 transition-colors group">
                      <td class="py-space-md px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-8 h-8 rounded-lg bg-surface-container-high text-outline flex items-center justify-center flex-shrink-0"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >emoji_events</span
                            >
                          </div>
                          <div class="flex flex-col min-w-0">
                            <span
                              class="font-title-md text-title-md text-on-surface font-semibold truncate"
                              >Autumn Open 2024</span
                            >
                            <span class="font-body-sm text-body-sm text-outline"
                              >Tier 1 · Swiss Format</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <span
                          class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge font-semibold"
                        >
                          <span class="w-1.5 h-1.5 rounded-full bg-outline"></span>
                          COMPLETED
                        </span>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex flex-col">
                          <span class="text-on-surface font-label-numeric-md text-label-numeric-md"
                            >Sep 01, 2024</span
                          >
                          <span class="text-outline font-body-sm text-body-sm"
                            >to Nov 25, 2024</span
                          >
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex items-center gap-1 text-on-surface">
                          <span class="font-label-numeric-md text-label-numeric-md">52</span>
                          <span class="text-outline font-body-sm text-body-sm">Players</span>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                          >195</span
                        >
                        <span class="text-outline font-body-sm text-body-sm">/ 195</span>
                      </td>
                      <td class="py-space-md px-space-sm">
                        <div class="flex flex-col gap-1 w-24">
                          <div
                            class="flex justify-between text-body-sm font-label-numeric-md text-label-numeric-md text-outline"
                          >
                            <span>100%</span>
                          </div>
                          <div
                            class="w-full h-1.5 rounded-full bg-surface-container-highest overflow-hidden"
                          >
                            <div class="h-full rounded-full bg-outline" style="width: 100%"></div>
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-sm whitespace-nowrap">
                        <div class="flex items-center gap-space-xs">
                          <span
                            class="material-symbols-outlined text-[16px] text-outline"
                            aria-hidden="true"
                            >military_tech</span
                          >
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-body-md text-on-surface font-semibold leading-none"
                              >Marcus Vance</span
                            >
                            <span class="font-body-sm text-[11px] text-outline"
                              >Champion (340 pts)</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-md px-space-md text-right whitespace-nowrap">
                        <div class="flex items-center justify-end gap-1">
                          <RouterLink
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="View Final Standings"
                            to="/dashboard/seasons/autumn-2024"
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >visibility</span
                            >
                          </RouterLink>
                          <button
                            class="p-1.5 rounded text-outline hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                            title="Archive Season Logs"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >archive</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <!-- Table Footer / Pagination -->
              <div
                class="flex items-center justify-between px-space-md py-space-sm bg-surface-container-lowest"
              >
                <span class="font-body-sm text-body-sm text-outline"
                  >Showing 4 of 4 total competitive seasons</span
                >
                <div class="flex items-center gap-space-xs">
                  <button
                    class="p-1 rounded text-outline opacity-40 cursor-not-allowed"
                    disabled
                    type="button"
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >chevron_left</span
                    >
                  </button>
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface px-2"
                    >Page 1 of 1</span
                  >
                  <button
                    class="p-1 rounded text-outline opacity-40 cursor-not-allowed"
                    disabled
                    type="button"
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >chevron_right</span
                    >
                  </button>
                </div>
              </div>
            </div>
          </div>
          <!-- Right Column: Rules Architecture & System Status (3 cols) -->
          <div class="xl:col-span-3 flex flex-col gap-space-md">
            <!-- Season Rules Summary Card -->
            <div class="flex flex-col rounded-xl bg-surface-container-low p-space-md shadow-sm">
              <div class="flex items-center gap-space-xs pb-space-sm">
                <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                  >rule</span
                >
                <h3 class="font-headline-sm text-headline-sm text-on-surface">Points Formula</h3>
              </div>
              <p class="font-body-sm text-body-sm text-on-surface-variant pb-space-sm">
                Strict standings scoring protocol applied across all official Swiss and Round Robin
                brackets.
              </p>
              <!-- Scoring Badges Matrix -->
              <div class="flex flex-col gap-space-xs pt-space-xs">
                <!-- Victory Badge -->
                <div
                  class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container"
                >
                  <div class="flex items-center gap-space-xs">
                    <span class="w-2 h-2 rounded-full bg-primary"></span>
                    <span class="font-title-md text-body-md text-on-surface">Match Victory</span>
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-primary bg-primary-container/20 px-2.5 py-0.5 rounded"
                    >+20 pts</span
                  >
                </div>
                <!-- Draw Badge -->
                <div
                  class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container"
                >
                  <div class="flex items-center gap-space-xs">
                    <span class="w-2 h-2 rounded-full bg-secondary"></span>
                    <span class="font-title-md text-body-md text-on-surface">Stalemate / Draw</span>
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-secondary bg-secondary-container/40 px-2.5 py-0.5 rounded"
                    >+10 pts</span
                  >
                </div>
                <!-- Defeat Badge -->
                <div
                  class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container"
                >
                  <div class="flex items-center gap-space-xs">
                    <span class="w-2 h-2 rounded-full bg-error"></span>
                    <span class="font-title-md text-body-md text-on-surface">Match Defeat</span>
                  </div>
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-error bg-error-container/20 px-2.5 py-0.5 rounded"
                    >0 pts</span
                  >
                </div>
              </div>
              <div
                class="mt-space-md pt-space-sm bg-surface-container p-space-sm rounded-lg flex flex-col gap-1"
              >
                <div class="flex items-center gap-1 text-on-surface font-title-md text-body-sm">
                  <span
                    class="material-symbols-outlined text-secondary text-[16px]"
                    aria-hidden="true"
                    >info</span
                  >
                  <span>No Elo Calculation</span>
                </div>
                <p class="font-body-sm text-body-sm text-outline">
                  Ladder ranking is purely based on season accumulated points. Tiebreakers use
                  Sonneborn-Berger coefficients.
                </p>
              </div>
            </div>
            <!-- Historical Hall of Fame Card -->
            <div class="flex flex-col rounded-xl bg-surface-container-low p-space-md shadow-sm">
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-secondary text-[20px]"
                    aria-hidden="true"
                    >trophy</span
                  >
                  <h3 class="font-title-md text-title-md text-on-surface">Season Champions</h3>
                </div>
                <span class="font-label-badge text-label-badge text-outline uppercase"
                  >Preserved</span
                >
              </div>
              <div class="flex flex-col divide-y-0 gap-space-xs pt-space-xs">
                <div
                  class="flex items-center justify-between p-space-xs rounded hover:bg-surface-container transition-colors"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="w-6 h-6 rounded-full bg-surface-container-high flex items-center justify-center text-[11px] font-label-badge text-secondary font-bold"
                      >24</span
                    >
                    <div class="flex flex-col">
                      <span class="font-title-md text-body-sm text-on-surface leading-tight"
                        >Adam Chen</span
                      >
                      <span class="font-body-sm text-[11px] text-outline">Winter Cup 2024</span>
                    </div>
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >380 pts</span
                  >
                </div>
                <div
                  class="flex items-center justify-between p-space-xs rounded hover:bg-surface-container transition-colors"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="w-6 h-6 rounded-full bg-surface-container-high flex items-center justify-center text-[11px] font-label-badge text-secondary font-bold"
                      >24</span
                    >
                    <div class="flex flex-col">
                      <span class="font-title-md text-body-sm text-on-surface leading-tight"
                        >Marcus Vance</span
                      >
                      <span class="font-body-sm text-[11px] text-outline">Autumn Open 2024</span>
                    </div>
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >340 pts</span
                  >
                </div>
              </div>
            </div>
            <!-- Quick Arbitration Audit Widget -->
            <div
              class="rounded-xl bg-surface-container-lowest p-space-md flex items-center gap-space-md"
            >
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-outline"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >fingerprint</span
                >
              </div>
              <div class="flex flex-col">
                <span class="font-body-sm text-[11px] text-outline uppercase tracking-wider"
                  >Audit Checksum</span
                >
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface truncate"
                  >0x9F4B...C12A</span
                >
                <span class="font-body-sm text-[11px] text-secondary">Integrity verified</span>
              </div>
            </div>
          </div>
        </div>
        <!-- Close Season Confirmation Modal (Hidden by Default) -->
        <div
          class="fixed inset-0 z-50 bg-background/80 backdrop-blur-sm flex items-center justify-center p-margin hidden"
          id="close-season-dialog"
        >
          <div
            class="w-full max-w-lg rounded-xl bg-surface-container p-space-lg shadow-2xl flex flex-col gap-space-md"
          >
            <div class="flex items-center gap-space-sm text-error">
              <div
                class="w-10 h-10 rounded-lg bg-error-container/30 flex items-center justify-center"
              >
                <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                  >warning</span
                >
              </div>
              <div class="flex flex-col">
                <h4 class="font-headline-sm text-headline-sm text-on-surface">
                  Close Active Season?
                </h4>
                <span class="font-body-sm text-body-sm text-outline"
                  >Action: Spring League 2025</span
                >
              </div>
            </div>
            <p class="font-body-md text-body-md text-on-surface-variant">
              Closing this season will freeze all player point tallies, declare
              <strong class="text-on-surface">Adam Chen</strong> as champion, and permanently
              archive the season standings table. This action cannot be reverted.
            </p>
            <div
              class="flex flex-col gap-space-xs p-space-sm rounded-lg bg-surface-container-low font-body-sm text-body-sm text-outline"
            >
              <div class="flex items-center gap-1.5">
                <span
                  class="material-symbols-outlined text-[16px] text-secondary"
                  aria-hidden="true"
                  >check_circle</span
                >
                <span>Final points permanently stamped to player profiles</span>
              </div>
              <div class="flex items-center gap-1.5">
                <span
                  class="material-symbols-outlined text-[16px] text-secondary"
                  aria-hidden="true"
                  >check_circle</span
                >
                <span>Allows upcoming 'Summer Championship 2025' to be activated</span>
              </div>
            </div>
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors text-body-md font-body-md"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg bg-error-container text-on-error-container hover:bg-error transition-colors text-body-md font-title-md font-semibold"
                type="button"
                disabled
                title="Design preview"
              >
                Confirm &amp; Close Season
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
