<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
import DashboardPageHeader from '../../../components/layout/DashboardPageHeader.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-16">
        <DashboardPageHeader
          section="Workshops"
          title="Workshop Management Desk"
          description="Manage masterclasses, tactical clinics, and instructional seminars for club players."
        >
          <template #actions>
            <button
              class="dashboard-action"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px] text-outline" aria-hidden="true"
                >file_download</span
              >
              <span>Export CSV</span>
            </button>
            <button
              class="dashboard-primary-action"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                >add_circle</span
              >
              <span>Create New Workshop</span>
            </button>
          </template>
        </DashboardPageHeader>
        <!-- Metric Snapshot Cards (Bento Style 4-up) -->
        <div class="dashboard-metrics mt-space-md">
          <!-- Card 1: Total Workshops -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -bottom-4 w-28 h-28 bg-primary/5 rounded-full blur-2xl pointer-events-none"
            ></div>
            <div class="flex items-start justify-between">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-outline"
                  >Total Workshops</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-xs">
                  <span class="font-display-lg text-display-lg text-on-surface leading-none"
                    >14</span
                  >
                  <span class="font-title-md text-title-md text-primary font-semibold">Active</span>
                </div>
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-highest flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >co_present</span
                >
              </div>
            </div>
            <div
              class="flex items-center gap-space-xs mt-space-md pt-space-sm text-outline font-body-sm text-body-sm"
            >
              <span class="w-2 h-2 rounded-full bg-primary inline-block"></span>
              <span class="text-on-surface font-medium">4 Upcoming</span>
              <span class="text-surface-bright">|</span>
              <span>10 Concluded</span>
            </div>
          </div>
          <!-- Card 2: Registered Learners -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -bottom-4 w-28 h-28 bg-secondary/5 rounded-full blur-2xl pointer-events-none"
            ></div>
            <div class="flex items-start justify-between">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-outline"
                  >Registered Learners</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-xs">
                  <span class="font-display-lg text-display-lg text-on-surface leading-none"
                    >196</span
                  >
                  <span class="font-title-md text-title-md text-on-surface-variant font-medium"
                    >Athletes</span
                  >
                </div>
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-highest flex items-center justify-center text-secondary"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true">school</span>
              </div>
            </div>
            <div
              class="flex items-center gap-space-xs mt-space-md pt-space-sm font-body-sm text-body-sm"
            >
              <span class="material-symbols-outlined text-[16px] text-secondary" aria-hidden="true"
                >trending_up</span
              >
              <span class="text-secondary font-semibold">+32</span>
              <span class="text-outline">enrolled this month</span>
            </div>
          </div>
          <!-- Card 3: Average Fill Rate -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -bottom-4 w-28 h-28 bg-primary-container/10 rounded-full blur-2xl pointer-events-none"
            ></div>
            <div class="flex items-start justify-between">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-outline"
                  >Average Fill Rate</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-xs">
                  <span class="font-display-lg text-display-lg text-on-surface leading-none"
                    >88.5%</span
                  >
                </div>
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-highest flex items-center justify-center text-primary-fixed-dim"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >pie_chart</span
                >
              </div>
            </div>
            <div
              class="flex items-center gap-space-xs mt-space-md pt-space-sm font-body-sm text-body-sm text-on-surface-variant"
            >
              <span class="w-2 h-2 rounded-full bg-secondary inline-block"></span>
              <span class="text-on-surface font-medium">Optimal</span>
              <span class="text-outline">class capacity ratio</span>
            </div>
          </div>
          <!-- Card 4: Accredited Instructors -->
          <div
            class="dashboard-metric group"
          >
            <div
              class="absolute -right-4 -bottom-4 w-28 h-28 bg-tertiary-container/10 rounded-full blur-2xl pointer-events-none"
            ></div>
            <div class="flex items-start justify-between">
              <div class="flex flex-col">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-outline"
                  >Accredited Faculty</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-xs">
                  <span class="font-display-lg text-display-lg text-on-surface leading-none"
                    >6</span
                  >
                  <span class="font-title-md text-title-md text-tertiary-fixed font-semibold"
                    >Masters</span
                  >
                </div>
              </div>
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-highest flex items-center justify-center text-tertiary"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >military_tech</span
                >
              </div>
            </div>
            <div
              class="flex items-center gap-space-xs mt-space-md pt-space-sm font-body-sm text-body-sm text-outline"
            >
              <span
                class="px-1.5 py-0.5 rounded bg-surface-container-highest text-on-surface text-[10px] font-bold"
                >GM</span
              >
              <span
                class="px-1.5 py-0.5 rounded bg-surface-container-highest text-on-surface text-[10px] font-bold"
                >IM</span
              >
              <span
                class="px-1.5 py-0.5 rounded bg-surface-container-highest text-on-surface text-[10px] font-bold"
                >FM</span
              >
              <span class="text-on-surface-variant ml-1 font-medium">Active this term</span>
            </div>
          </div>
        </div>
        <!-- Filtration Matrix & Analytical Search Strip -->
        <div
          class="dashboard-toolbar mt-space-xl flex flex-col items-stretch justify-between gap-space-md lg:flex-row lg:items-center"
        >
          <!-- Search Bar -->
          <div class="relative flex-1">
            <span
              class="material-symbols-outlined absolute left-space-md top-1/2 -translate-y-1/2 text-outline text-[20px] pointer-events-none"
              aria-hidden="true"
              >search</span
            >
            <input
              class="app-field py-2.5 pr-space-md pl-11 shadow-inner"
              placeholder="Search workshops by title, instructor, or topic..."
              type="text"
            />
          </div>
          <!-- Granular Filter Pill Dropdowns -->
          <div class="flex flex-wrap items-center gap-space-sm">
            <!-- Category Filter -->
            <div class="relative min-w-[170px]">
              <select
                class="w-full appearance-none pl-space-md pr-8 py-2.5 rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md outline-none hover:bg-surface-container-low transition-colors cursor-pointer"
              >
                <option>All Categories</option>
                <option>Opening Repertoire</option>
                <option>Positional Strategy</option>
                <option>Endgame Finesse</option>
                <option>Tactical Calculation</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline text-[18px] pointer-events-none"
                aria-hidden="true"
                >expand_more</span
              >
            </div>
            <!-- Difficulty Filter -->
            <div class="relative min-w-[150px]">
              <select
                class="w-full appearance-none pl-space-md pr-8 py-2.5 rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md outline-none hover:bg-surface-container-low transition-colors cursor-pointer"
              >
                <option>All Difficulties</option>
                <option>Beginner</option>
                <option>Intermediate</option>
                <option>Advanced</option>
                <option>All Levels</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline text-[18px] pointer-events-none"
                aria-hidden="true"
                >expand_more</span
              >
            </div>
            <!-- Status Filter -->
            <div class="relative min-w-[140px]">
              <select
                class="w-full appearance-none pl-space-md pr-8 py-2.5 rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md outline-none hover:bg-surface-container-low transition-colors cursor-pointer"
              >
                <option>All Statuses</option>
                <option>Published</option>
                <option>Draft</option>
                <option>Concluded</option>
                <option>Cancelled</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline text-[18px] pointer-events-none"
                aria-hidden="true"
                >expand_more</span
              >
            </div>
            <!-- Reset / Quick Toggle Button -->
            <button
              class="w-10 h-10 flex items-center justify-center rounded-lg bg-surface-container-lowest hover:bg-surface-container-high text-outline hover:text-on-surface transition-colors"
              title="Reset Filters"
              type="button"
              disabled
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >restart_alt</span
              >
            </button>
          </div>
        </div>
        <!-- Masterclass & Workshop Management Data Table -->
        <div class="dashboard-table mt-space-md">
          <div class="overflow-x-auto">
            <table class="w-full text-left border-collapse">
              <thead>
                <tr
                  class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                >
                  <th class="py-space-md px-space-md w-16 text-center">Preview</th>
                  <th class="py-space-md px-space-md">Workshop Title &amp; Category</th>
                  <th class="py-space-md px-space-md">Instructor</th>
                  <th class="py-space-md px-space-md">Difficulty</th>
                  <th class="py-space-md px-space-md">Date &amp; Time</th>
                  <th class="py-space-md px-space-md">Roster / Capacity</th>
                  <th class="py-space-md px-space-md">Status</th>
                  <th class="py-space-md px-space-md text-right">Actions</th>
                </tr>
              </thead>
              <tbody class="divide-y-0 font-body-md text-body-md">
                <!-- Row 1: Sicilian Najdorf -->
                <tr
                  class="bg-surface-container hover:bg-surface-container-high transition-colors group"
                >
                  <td class="py-3 px-space-md text-center">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden relative shadow-sm mx-auto bg-surface-container-lowest"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-110 transition-transform duration-300"
                        data-alt="Close up dark tactical chess tournament board with a black knight centered on d4 and subtle green studio lighting against a dark moody arena background."
                        src="/images/5cea6d91cca9.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[280px]">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors cursor-pointer"
                      >
                        Mastering the Sicilian Najdorf: Modern Repertoire for Black
                      </span>
                      <div class="flex items-center gap-space-xs mt-1">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary px-2 py-0.5 rounded bg-secondary-container/40"
                          >Opening Repertoire</span
                        >
                        <span class="text-outline text-body-sm font-body-sm">• Masterclass</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface font-label-numeric-md text-label-numeric-md"
                      >
                        TA
                      </div>
                      <div class="flex flex-col">
                        <div class="flex items-center gap-1.5">
                          <span
                            class="px-1 py-0.5 rounded bg-primary-container text-on-primary-container font-label-badge text-label-badge font-bold"
                            >GM</span
                          >
                          <span class="font-body-md text-body-md text-on-surface font-medium"
                            >Tariq Al-Mansoor</span
                          >
                        </div>
                        <span class="text-outline font-body-sm text-body-sm"
                          >FIDE Certified Arbiter</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container-highest text-primary-fixed text-label-badge font-label-badge uppercase tracking-wider"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >bolt</span
                      >
                      Advanced
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface">May 10, 2025</span>
                      <div class="flex items-center gap-1 text-outline font-body-sm text-body-sm">
                        <span
                          class="material-symbols-outlined text-[14px] text-secondary"
                          aria-hidden="true"
                          >schedule</span
                        >
                        <span>15:00 UTC (120 min)</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[160px]">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex justify-between items-center font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface font-semibold">14 / 18</span>
                        <span class="text-secondary font-bold">78%</span>
                      </div>
                      <div
                        class="w-full bg-surface-container-lowest h-1.5 rounded-full overflow-hidden"
                      >
                        <div class="bg-primary h-full rounded-full" style="width: 78%"></div>
                      </div>
                      <span class="text-outline font-body-sm text-body-sm">4 open seats</span>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-secondary-container/50 text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary animate-pulse"></span>
                      Published
                    </span>
                  </td>
                  <td class="py-3 px-space-md text-right whitespace-nowrap">
                    <div class="flex items-center justify-end gap-1">
                      <button
                        class="p-1.5 text-outline hover:text-on-surface hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="View Workshop Desk"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-primary hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="Edit Workshop Curriculum"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-error hover:bg-error-container/30 rounded-lg transition-colors"
                        title="Cancel Workshop"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >event_busy</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 2: King's Indian Defense -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container-high transition-colors group"
                >
                  <td class="py-3 px-space-md text-center">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden relative shadow-sm mx-auto bg-surface-container-lowest"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-110 transition-transform duration-300"
                        data-alt="Dynamic shot of a grandmaster chess board focused on closed pawn chains and king side defenses in a tournament setting with dark stone pieces."
                        src="/images/4f3c732e8d40.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[280px]">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors cursor-pointer"
                      >
                        King's Indian Defense: Classical Pawn Structures
                      </span>
                      <div class="flex items-center gap-space-xs mt-1">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary px-2 py-0.5 rounded bg-secondary-container/40"
                          >Opening</span
                        >
                        <span class="text-outline text-body-sm font-body-sm">• Deep Dive</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface font-label-numeric-md text-label-numeric-md"
                      >
                        AR
                      </div>
                      <div class="flex flex-col">
                        <div class="flex items-center gap-1.5">
                          <span
                            class="px-1 py-0.5 rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-bold"
                            >FM</span
                          >
                          <span class="font-body-md text-body-md text-on-surface font-medium"
                            >Alex Rivera</span
                          >
                        </div>
                        <span class="text-outline font-body-sm text-body-sm"
                          >National Instructor</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container-highest text-on-surface-variant text-label-badge font-label-badge uppercase tracking-wider"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >psychology</span
                      >
                      Intermediate
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface">May 14, 2025</span>
                      <div class="flex items-center gap-1 text-outline font-body-sm text-body-sm">
                        <span
                          class="material-symbols-outlined text-[14px] text-secondary"
                          aria-hidden="true"
                          >schedule</span
                        >
                        <span>18:00 UTC (90 min)</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[160px]">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex justify-between items-center font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface font-semibold">12 / 16</span>
                        <span class="text-secondary font-bold">75%</span>
                      </div>
                      <div
                        class="w-full bg-surface-container-lowest h-1.5 rounded-full overflow-hidden"
                      >
                        <div class="bg-primary h-full rounded-full" style="width: 75%"></div>
                      </div>
                      <span class="text-outline font-body-sm text-body-sm">4 open seats</span>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-secondary-container/50 text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Published
                    </span>
                  </td>
                  <td class="py-3 px-space-md text-right whitespace-nowrap">
                    <div class="flex items-center justify-end gap-1">
                      <button
                        class="p-1.5 text-outline hover:text-on-surface hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="View Workshop Desk"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-primary hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="Edit Workshop Curriculum"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-error hover:bg-error-container/30 rounded-lg transition-colors"
                        title="Cancel Workshop"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >event_busy</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 3: Rook & Pawn Endgames -->
                <tr
                  class="bg-surface-container hover:bg-surface-container-high transition-colors group"
                >
                  <td class="py-3 px-space-md text-center">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden relative shadow-sm mx-auto bg-surface-container-lowest"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-110 transition-transform duration-300"
                        data-alt="Minimalist artistic chess study of a lonely white rook cutting off a black king on an obsidian chessboard with dramatic soft green ambient rim lighting."
                        src="/images/ef41d00d76e8.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[280px]">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors cursor-pointer"
                      >
                        Rook &amp; Pawn Endgames: Lucena &amp; Philidor
                      </span>
                      <div class="flex items-center gap-space-xs mt-1">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-tertiary-fixed px-2 py-0.5 rounded bg-tertiary-container/30"
                          >Endgame</span
                        >
                        <span class="text-outline text-body-sm font-body-sm">• Core Technique</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface font-label-numeric-md text-label-numeric-md"
                      >
                        ER
                      </div>
                      <div class="flex flex-col">
                        <div class="flex items-center gap-1.5">
                          <span
                            class="px-1 py-0.5 rounded bg-surface-container-highest text-tertiary-fixed-dim font-label-badge text-label-badge font-bold"
                            >IM</span
                          >
                          <span class="font-body-md text-body-md text-on-surface font-medium"
                            >Elena Rostova</span
                          >
                        </div>
                        <span class="text-outline font-body-sm text-body-sm">Senior Trainer</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container-highest text-outline text-label-badge font-label-badge uppercase tracking-wider"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >layers</span
                      >
                      All Levels
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface">May 18, 2025</span>
                      <div class="flex items-center gap-1 text-outline font-body-sm text-body-sm">
                        <span
                          class="material-symbols-outlined text-[14px] text-secondary"
                          aria-hidden="true"
                          >schedule</span
                        >
                        <span>14:00 UTC (105 min)</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[160px]">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex justify-between items-center font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface font-semibold">8 / 15</span>
                        <span class="text-on-surface-variant font-bold">53%</span>
                      </div>
                      <div
                        class="w-full bg-surface-container-lowest h-1.5 rounded-full overflow-hidden"
                      >
                        <div
                          class="bg-secondary-fixed-dim h-full rounded-full"
                          style="width: 53%"
                        ></div>
                      </div>
                      <span class="text-outline font-body-sm text-body-sm">7 open seats</span>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-secondary-container/50 text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Published
                    </span>
                  </td>
                  <td class="py-3 px-space-md text-right whitespace-nowrap">
                    <div class="flex items-center justify-end gap-1">
                      <button
                        class="p-1.5 text-outline hover:text-on-surface hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="View Workshop Desk"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-primary hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="Edit Workshop Curriculum"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-error hover:bg-error-container/30 rounded-lg transition-colors"
                        title="Cancel Workshop"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >event_busy</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 4: Tactical Calculation -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container-high transition-colors group"
                >
                  <td class="py-3 px-space-md text-center">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden relative shadow-sm mx-auto bg-surface-container-lowest"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-110 transition-transform duration-300"
                        data-alt="Intense high-contrast macro photography of a digital chess clock registering final seconds with chess pieces blurred in the dark background."
                        src="/images/1606340f5232.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[280px]">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors cursor-pointer"
                      >
                        Tactical Calculation: Candidate Selection
                      </span>
                      <div class="flex items-center gap-space-xs mt-1">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-error px-2 py-0.5 rounded bg-error-container/30"
                          >Tactics</span
                        >
                        <span class="text-outline text-body-sm font-body-sm">• Speed Clinic</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface font-label-numeric-md text-label-numeric-md"
                      >
                        MV
                      </div>
                      <div class="flex flex-col">
                        <div class="flex items-center gap-1.5">
                          <span
                            class="px-1 py-0.5 rounded bg-primary-container text-on-primary-container font-label-badge text-label-badge font-bold"
                            >GM</span
                          >
                          <span class="font-body-md text-body-md text-on-surface font-medium"
                            >Marcus Vance</span
                          >
                        </div>
                        <span class="text-outline font-body-sm text-body-sm"
                          >Elite Grandmaster</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container-highest text-primary-fixed text-label-badge font-label-badge uppercase tracking-wider"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >bolt</span
                      >
                      Advanced
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface">May 21, 2025</span>
                      <div class="flex items-center gap-1 text-outline font-body-sm text-body-sm">
                        <span
                          class="material-symbols-outlined text-[14px] text-secondary"
                          aria-hidden="true"
                          >schedule</span
                        >
                        <span>17:00 UTC (90 min)</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[160px]">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex justify-between items-center font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface font-semibold">15 / 15</span>
                        <span class="text-primary font-bold">100% Full</span>
                      </div>
                      <div
                        class="w-full bg-surface-container-lowest h-1.5 rounded-full overflow-hidden"
                      >
                        <div
                          class="bg-primary-container h-full rounded-full"
                          style="width: 100%"
                        ></div>
                      </div>
                      <span class="text-primary-fixed-dim font-body-sm text-body-sm font-semibold"
                        >Waitlist active (3)</span
                      >
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-secondary-container/50 text-secondary font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Published
                    </span>
                  </td>
                  <td class="py-3 px-space-md text-right whitespace-nowrap">
                    <div class="flex items-center justify-end gap-1">
                      <button
                        class="p-1.5 text-outline hover:text-on-surface hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="View Workshop Desk"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-primary hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="Edit Workshop Curriculum"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-error hover:bg-error-container/30 rounded-lg transition-colors"
                        title="Cancel Workshop"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >event_busy</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 5: Piece Coordination (Draft) -->
                <tr
                  class="bg-surface-container hover:bg-surface-container-high transition-colors group"
                >
                  <td class="py-3 px-space-md text-center">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden relative shadow-sm mx-auto bg-surface-container-lowest"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-110 transition-transform duration-300 opacity-80"
                        data-alt="Monochromatic fine art composition of modern wooden chess pieces harmoniously grouped protecting the white king on an elegant dark board."
                        src="/images/62e24c886643.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[280px]">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors cursor-pointer"
                      >
                        Piece Coordination &amp; Safe King Shelter
                      </span>
                      <div class="flex items-center gap-space-xs mt-1">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider text-secondary px-2 py-0.5 rounded bg-secondary-container/40"
                          >Strategy</span
                        >
                        <span class="text-outline text-body-sm font-body-sm">• Fundamentals</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface font-label-numeric-md text-label-numeric-md"
                      >
                        MP
                      </div>
                      <div class="flex flex-col">
                        <div class="flex items-center gap-1.5">
                          <span
                            class="px-1 py-0.5 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge font-bold"
                            >WFM</span
                          >
                          <span class="font-body-md text-body-md text-on-surface font-medium"
                            >Maya Patel</span
                          >
                        </div>
                        <span class="text-outline font-body-sm text-body-sm"
                          >Junior Program Lead</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1 px-2.5 py-1 rounded bg-surface-container-highest text-secondary-fixed text-label-badge font-label-badge uppercase tracking-wider"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >eco</span
                      >
                      Beginner
                    </span>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface">May 25, 2025</span>
                      <div class="flex items-center gap-1 text-outline font-body-sm text-body-sm">
                        <span
                          class="material-symbols-outlined text-[14px] text-secondary"
                          aria-hidden="true"
                          >schedule</span
                        >
                        <span>11:00 UTC (60 min)</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-3 px-space-md min-w-[160px]">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex justify-between items-center font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface font-semibold">9 / 20</span>
                        <span class="text-outline font-bold">45%</span>
                      </div>
                      <div
                        class="w-full bg-surface-container-lowest h-1.5 rounded-full overflow-hidden"
                      >
                        <div class="bg-outline h-full rounded-full" style="width: 45%"></div>
                      </div>
                      <span class="text-outline font-body-sm text-body-sm">11 open seats</span>
                    </div>
                  </td>
                  <td class="py-3 px-space-md whitespace-nowrap">
                    <span
                      class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-semibold"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-outline"></span>
                      Draft
                    </span>
                  </td>
                  <td class="py-3 px-space-md text-right whitespace-nowrap">
                    <div class="flex items-center justify-end gap-1">
                      <button
                        class="flex items-center gap-1 px-2.5 py-1 text-primary-fixed-dim hover:bg-primary-container/20 rounded-lg text-body-sm font-semibold transition-colors"
                        title="Publish Workshop to Athletes"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >rocket_launch</span
                        >
                        <span>Publish</span>
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-primary hover:bg-surface-container-highest rounded-lg transition-colors"
                        title="Edit Workshop Draft"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </button>
                      <button
                        class="p-1.5 text-outline hover:text-error hover:bg-error-container/30 rounded-lg transition-colors"
                        title="Delete Workshop Draft"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >delete</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
          <!-- Pagination & Bulk Operations Footer Strip -->
          <div
            class="px-space-md py-space-sm bg-surface-container-lowest flex flex-col sm:flex-row items-center justify-between gap-space-md text-outline font-body-sm text-body-sm"
          >
            <div class="flex items-center gap-space-sm">
              <span class="font-body-sm text-body-sm"
                >Showing <span class="text-on-surface font-semibold">1-5</span> of
                <span class="text-on-surface font-semibold">14</span> workshops</span
              >
              <span class="text-surface-bright">•</span>
              <div class="flex items-center gap-1">
                <span>Rows per page:</span>
                <select
                  class="bg-surface-container text-on-surface rounded px-1.5 py-0.5 outline-none cursor-pointer"
                >
                  <option>5</option>
                  <option>10</option>
                  <option>25</option>
                </select>
              </div>
            </div>
            <!-- Tactical Pagination Controls -->
            <div class="flex items-center gap-1">
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center text-outline hover:text-on-surface hover:bg-surface-container disabled:opacity-40 transition-colors"
                disabled
                type="button"
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >chevron_left</span
                >
              </button>
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center font-label-numeric-md text-label-numeric-md bg-primary-container text-on-primary-container font-bold shadow-sm"
                type="button"
                disabled
                title="Design preview"
              >
                1
              </button>
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center font-label-numeric-md text-label-numeric-md text-on-surface hover:bg-surface-container transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                2
              </button>
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center font-label-numeric-md text-label-numeric-md text-on-surface hover:bg-surface-container transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                3
              </button>
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center text-outline hover:text-on-surface hover:bg-surface-container transition-colors"
                type="button"
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
        <!-- Instructor Quick Allocation Drawer / Assistant Card -->
        <div
          class="dashboard-panel mt-space-lg flex flex-col items-start justify-between gap-space-md p-space-lg md:flex-row md:items-center"
        >
          <div class="flex items-center gap-space-md">
            <div
              class="w-12 h-12 rounded-xl bg-secondary-container/40 text-secondary flex items-center justify-center shrink-0"
            >
              <span class="material-symbols-outlined text-[26px]" aria-hidden="true"
                >assignment_ind</span
              >
            </div>
            <div class="flex flex-col">
              <h2 class="font-title-md text-title-md text-on-surface font-semibold">
                Faculty Scheduling &amp; PGN Curriculum Sync
              </h2>
              <p class="font-body-sm text-body-sm text-on-surface-variant max-w-xl">
                Auto-generate interactive study boards, player exercise sheets, and automated
                certificate issuance for completed clinics.
              </p>
            </div>
          </div>
          <div class="flex items-center gap-space-sm shrink-0">
            <button
              class="px-space-md py-space-sm rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors"
              type="button"
              disabled
              title="Design preview"
            >
              Curriculum Vault
            </button>
            <button
              class="px-space-md py-space-sm rounded-lg bg-surface-container-lowest hover:bg-surface-container-high text-primary font-title-md text-title-md transition-colors flex items-center gap-1"
              type="button"
              disabled
              title="Design preview"
            >
              <span>Instructor Roster</span>
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                >arrow_forward</span
              >
            </button>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
