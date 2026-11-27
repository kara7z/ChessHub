<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin md:px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Top Breadcrumbs & Quick Navigation Meta -->
        <div
          class="flex flex-col md:flex-row md:items-center justify-between gap-space-sm pt-space-md pb-space-lg"
        >
          <div class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <span class="hover:text-on-surface cursor-pointer transition-colors">Dashboard</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="hover:text-on-surface cursor-pointer transition-colors">Workshops</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-primary font-title-md text-title-md font-semibold"
              >Mastering the Sicilian Najdorf (#WK-104)</span
            >
          </div>
          <div class="flex items-center gap-space-sm">
            <span
              class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider"
            >
              <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span> Live Sensory
              Sync
            </span>
            <span class="font-label-numeric-md text-label-numeric-md text-outline"
              >Session ID: <strong class="text-on-surface">WK-104-NAJ</strong></span
            >
          </div>
        </div>
        <!-- Header Module with Title, Badges, and Action Bar -->
        <div
          class="flex flex-col lg:flex-row lg:items-center justify-between gap-space-lg pb-space-xl"
        >
          <div class="flex flex-col gap-space-xs max-w-4xl">
            <div class="flex flex-wrap items-center gap-space-sm">
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                Mastering the Sicilian Najdorf: Modern Repertoire for Black
              </h1>
              <div class="flex items-center gap-space-xs">
                <span
                  class="px-2.5 py-0.5 rounded-full bg-primary-container/20 text-primary font-label-badge text-label-badge uppercase"
                  >Published</span
                >
                <span
                  class="px-2.5 py-0.5 rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge uppercase"
                  >Advanced · 3 Hours</span
                >
              </div>
            </div>
            <p class="font-body-md text-body-md text-outline">
              Intensive theoretical masterclass focusing on contemporary dynamic counter-play in
              standard FIDE competition.
            </p>
          </div>
          <div class="flex flex-wrap items-center gap-space-sm self-start lg:self-center">
            <RouterLink
              class="inline-flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm"
              to="/dashboard/workshops/strategy-masterclass/edit"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">edit</span>
              <span>Edit Workshop</span>
            </RouterLink>
            <button
              class="inline-flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">download</span>
              <span>Export Roster CSV</span>
            </button>
            <button
              class="inline-flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-error-container/20 hover:bg-error-container/30 text-error font-title-md text-title-md transition-colors"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">cancel</span>
              <span>Cancel Workshop</span>
            </button>
          </div>
        </div>
        <!-- Hero Visual Stage with Overlaid Details -->
        <div
          class="relative w-full rounded-xl overflow-hidden bg-surface-container-lowest shadow-xl mb-space-xl"
        >
          <div
            class="bg-cover bg-center w-full h-72 md:h-80 relative flex items-end"
            data-alt="High quality dark cinematic photograph of a grandmaster chess board with polished wooden pieces in mid Sicilian defense setup, dramatic warm accent light reflecting on obsidian black squares, textured wood grain, blurred tournament hall in the background with ambient green-tinted low key lighting"
            style="background-image: url('/images/cc3aa466bbd3.webp')"
          >
            <!-- Gradient Scrim overlay -->
            <div
              class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest via-surface-container-lowest/80 to-transparent"
            ></div>
            <!-- Key Metadata Overlaid -->
            <div
              class="relative z-10 w-full p-space-lg md:p-space-xl flex flex-col md:flex-row md:items-end justify-between gap-space-md"
            >
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-12 h-12 rounded-full overflow-hidden bg-surface-container-high ring-2 ring-primary flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of GM Tariq Al-Mansoor, a distinguished competitive chess grandmaster in formal dark blazer looking analytical with focused expression, studio lighting with green rim light"
                      src="/images/37ac721a8423.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col">
                    <div class="flex items-center gap-space-xs">
                      <span class="font-headline-sm text-headline-sm text-on-surface font-bold"
                        >GM Tariq Al-Mansoor</span
                      >
                      <span
                        class="px-1.5 py-0.5 rounded bg-primary text-on-primary font-label-badge text-label-badge font-bold"
                        >FIDE 2615</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-outline"
                      >Lead Instructor · Elite Training Cohort</span
                    >
                  </div>
                </div>
              </div>
              <div
                class="flex flex-wrap items-center gap-space-lg bg-surface/75 backdrop-blur-md px-space-md py-space-sm rounded-lg"
              >
                <div
                  class="flex items-center gap-space-xs text-on-surface font-body-md text-body-md"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >calendar_today</span
                  >
                  <span>May 10, 2025</span>
                </div>
                <div
                  class="flex items-center gap-space-xs text-on-surface font-body-md text-body-md"
                >
                  <span
                    class="material-symbols-outlined text-secondary text-[20px]"
                    aria-hidden="true"
                    >schedule</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md tracking-wider"
                    >15:00 - 18:00 UTC</span
                  >
                </div>
                <div
                  class="flex items-center gap-space-xs text-on-surface font-body-md text-body-md"
                >
                  <span
                    class="material-symbols-outlined text-outline text-[20px]"
                    aria-hidden="true"
                    >meeting_room</span
                  >
                  <span>Room Alpha &amp; Live Sensory Boards</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- 4 Metric KPI Cards -->
        <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-space-md mb-space-xl">
          <!-- Enrollment -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Total Enrollment</span
              >
              <span class="material-symbols-outlined text-primary text-[22px]" aria-hidden="true"
                >how_to_reg</span
              >
            </div>
            <div class="my-space-sm">
              <div class="flex items-baseline gap-space-xs">
                <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">14</span>
                <span class="font-headline-sm text-headline-sm text-outline font-normal">/ 18</span>
              </div>
              <span class="font-body-sm text-body-sm text-primary">78% maximum hall capacity</span>
            </div>
            <!-- Mini Progress Visual -->
            <div class="w-full bg-surface-container-highest rounded-full h-1.5 overflow-hidden">
              <div class="bg-primary h-full rounded-full" style="width: 78%"></div>
            </div>
          </div>
          <!-- Available Seats -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Available Seats</span
              >
              <span class="material-symbols-outlined text-secondary text-[22px]" aria-hidden="true"
                >event_seat</span
              >
            </div>
            <div class="my-space-sm">
              <div class="flex items-baseline gap-space-xs">
                <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">4</span>
                <span class="font-headline-sm text-headline-sm text-outline font-normal">Open</span>
              </div>
              <span class="font-body-sm text-body-sm text-outline"
                >Waitlist enabled (2 in queue)</span
              >
            </div>
            <div class="flex items-center gap-1.5">
              <span class="w-2 h-2 rounded-full bg-secondary"></span>
              <span class="font-label-badge text-label-badge text-secondary font-semibold"
                >Registration Open</span
              >
            </div>
          </div>
          <!-- Attendance Readiness -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Readiness Status</span
              >
              <span class="material-symbols-outlined text-tertiary text-[22px]" aria-hidden="true"
                >verified_user</span
              >
            </div>
            <div class="my-space-sm">
              <div class="flex items-baseline gap-space-xs">
                <span
                  class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                  id="kpi-checked-in-count"
                  >12</span
                >
                <span class="font-headline-sm text-headline-sm text-outline font-normal">/ 14</span>
              </div>
              <span class="font-body-sm text-body-sm text-tertiary">Confirmed Check-ins</span>
            </div>
            <div class="flex items-center justify-between text-outline font-body-sm text-body-sm">
              <span>Pending arrival</span>
              <span
                class="font-label-numeric-md text-label-numeric-md text-on-surface font-bold"
                id="kpi-pending-count"
                >2</span
              >
            </div>
          </div>
          <!-- Materials Status -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Study Materials</span
              >
              <span class="material-symbols-outlined text-primary text-[22px]" aria-hidden="true"
                >auto_stories</span
              >
            </div>
            <div class="my-space-sm">
              <div class="flex items-center gap-space-xs">
                <span class="font-title-md text-title-md text-on-surface font-semibold"
                  >PGN Pack Attached</span
                >
                <span
                  class="px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge font-bold"
                  >v1.4</span
                >
              </div>
              <span class="font-body-sm text-body-sm text-outline">32 Annotated Najdorf Lines</span>
            </div>
            <button
              class="inline-flex items-center gap-1 font-body-sm text-body-sm text-primary hover:underline"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                >file_download</span
              >
              Inspect Repertoire PGN
            </button>
          </div>
        </div>
        <!-- Navigation Tabs -->
        <div
          class="flex flex-wrap items-center gap-space-xs sm:gap-space-lg mb-space-lg bg-surface-container-low px-space-md py-space-xs rounded-xl"
        >
          <button
            class="flex items-center gap-space-xs py-space-sm px-space-md rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md font-semibold transition-colors"
            type="button"
            disabled
            title="Design preview"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true">group</span>
            <span>Participants &amp; Attendance</span>
            <span
              class="ml-1.5 px-2 py-0.5 rounded-full bg-on-primary-container/20 text-on-primary-container font-label-badge text-label-badge font-bold"
              >14</span
            >
          </button>
          <button
            class="flex items-center gap-space-xs py-space-sm px-space-md rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-colors font-title-md text-title-md"
            type="button"
            disabled
            title="Design preview"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true">menu_book</span>
            <span>Syllabus &amp; Objectives</span>
          </button>
          <button
            class="flex items-center gap-space-xs py-space-sm px-space-md rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-colors font-title-md text-title-md"
            type="button"
            disabled
            title="Design preview"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true">devices</span>
            <span>Room Equipment</span>
          </button>
        </div>
        <!-- Main Content Grid: Participant Table (8 cols) + Side Objective Panel (4 cols) -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-xl">
          <!-- Left Column: Attendance Management & Table (8 cols) -->
          <div class="lg:col-span-8 flex flex-col gap-space-md">
            <!-- Search, Quick Filter Toolbar -->
            <div
              class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md bg-surface-container p-space-md rounded-xl shadow-sm"
            >
              <div class="relative flex-1 max-w-md">
                <span
                  class="material-symbols-outlined absolute left-3 top-1/2 -translate-y-1/2 text-outline text-[18px]"
                  aria-hidden="true"
                  >search</span
                >
                <input
                  class="w-full pl-10 pr-4 py-2 rounded-lg bg-surface-container-low text-on-surface placeholder:text-outline font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-inner"
                  id="participant-search"
                  placeholder="Search by player name or handle..."
                  type="text"
                />
              </div>
              <div class="flex items-center gap-space-xs">
                <span class="font-body-sm text-body-sm text-outline mr-1">Filter:</span>
                <button
                  class="px-3 py-1.5 rounded-lg bg-surface-container-high text-on-surface font-body-sm text-body-sm font-semibold transition-colors"
                  id="btn-filter-all"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  All (14)
                </button>
                <button
                  class="px-3 py-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container-high font-body-sm text-body-sm transition-colors"
                  id="btn-filter-checked-in"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Checked In (12)
                </button>
                <button
                  class="px-3 py-1.5 rounded-lg text-outline hover:text-on-surface hover:bg-surface-container-high font-body-sm text-body-sm transition-colors"
                  id="btn-filter-not-arrived"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Not Arrived (2)
                </button>
              </div>
            </div>
            <!-- Participant Roster Table Card -->
            <div class="bg-surface-container rounded-xl shadow-md overflow-hidden flex flex-col">
              <div class="overflow-x-auto">
                <table class="w-full text-left font-body-md text-body-md">
                  <thead>
                    <tr
                      class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                    >
                      <th class="py-space-sm px-space-md font-semibold">Seat #</th>
                      <th class="py-space-sm px-space-md font-semibold">Player Profile</th>
                      <th class="py-space-sm px-space-md font-semibold">Role</th>
                      <th class="py-space-sm px-space-md font-semibold">Registration Date</th>
                      <th class="py-space-sm px-space-md font-semibold">Attendance State</th>
                      <th class="py-space-sm px-space-md font-semibold text-right">Actions</th>
                    </tr>
                  </thead>
                  <tbody class="divide-y divide-surface-container-high/40" id="participant-tbody">
                    <!-- Row 1: Adam Chen -->
                    <tr
                      class="hover:bg-surface-container-high/50 transition-colors participant-row"
                      data-handle="@adam_chen"
                      data-name="Adam Chen"
                      data-status="checked-in"
                    >
                      <td
                        class="py-space-sm px-space-md font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        #01
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-9 h-9 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                          >
                            <img
                              class="w-full h-full object-cover"
                              data-alt="Portrait photo of young competitive club chess player Adam Chen in dark hoodie focusing intently"
                              src="/images/9f7205a4a39f.webp"
                              alt=""
                            />
                          </div>
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-title-md text-on-surface font-medium leading-none"
                              >Adam Chen</span
                            >
                            <span class="font-body-sm text-body-sm text-outline mt-0.5"
                              >@adam_chen</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge uppercase"
                          >PLAYER</span
                        >
                      </td>
                      <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                        Apr 24, 2025 · 11:20
                      </td>
                      <td class="py-space-sm px-space-md">
                        <button
                          class="status-toggle inline-flex items-center gap-1.5 px-3 py-1 rounded-full bg-primary/10 text-primary hover:bg-primary/20 transition-colors font-label-badge text-label-badge font-semibold"
                          data-checked="true"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="w-2 h-2 rounded-full bg-primary"></span>
                          <span>Checked In</span>
                        </button>
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <div class="flex items-center justify-end gap-space-xs">
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Sensory Board Pairing"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >developer_board</span
                            >
                          </button>
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Participant Details"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >more_vert</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                    <!-- Row 2: Elena Rostova -->
                    <tr
                      class="hover:bg-surface-container-high/50 transition-colors participant-row"
                      data-handle="@elena_r"
                      data-name="Elena Rostova"
                      data-status="checked-in"
                    >
                      <td
                        class="py-space-sm px-space-md font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        #02
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-9 h-9 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                          >
                            <img
                              class="w-full h-full object-cover"
                              data-alt="Portrait of Elena Rostova, a young woman chess player with confident demeanor in high contrast dark studio setting"
                              src="/images/b97b32ee9bcb.webp"
                              alt=""
                            />
                          </div>
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-title-md text-on-surface font-medium leading-none"
                              >Elena Rostova</span
                            >
                            <span class="font-body-sm text-body-sm text-outline mt-0.5"
                              >@elena_r</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge uppercase"
                          >PLAYER</span
                        >
                      </td>
                      <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                        Apr 25, 2025 · 09:14
                      </td>
                      <td class="py-space-sm px-space-md">
                        <button
                          class="status-toggle inline-flex items-center gap-1.5 px-3 py-1 rounded-full bg-primary/10 text-primary hover:bg-primary/20 transition-colors font-label-badge text-label-badge font-semibold"
                          data-checked="true"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="w-2 h-2 rounded-full bg-primary"></span>
                          <span>Checked In</span>
                        </button>
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <div class="flex items-center justify-end gap-space-xs">
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Sensory Board Pairing"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >developer_board</span
                            >
                          </button>
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Participant Details"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >more_vert</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                    <!-- Row 3: Alex Rivera -->
                    <tr
                      class="hover:bg-surface-container-high/50 transition-colors participant-row"
                      data-handle="@alex_rivera"
                      data-name="Alex Rivera"
                      data-status="checked-in"
                    >
                      <td
                        class="py-space-sm px-space-md font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        #03
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-9 h-9 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                          >
                            <img
                              class="w-full h-full object-cover"
                              data-alt="Close up portrait of Alex Rivera, sharp thoughtful chess competitor with glasses in modern minimal lighting"
                              src="/images/31d27d6d1dfb.webp"
                              alt=""
                            />
                          </div>
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-title-md text-on-surface font-medium leading-none"
                              >Alex Rivera</span
                            >
                            <span class="font-body-sm text-body-sm text-outline mt-0.5"
                              >@alex_rivera</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge uppercase"
                          >PLAYER</span
                        >
                      </td>
                      <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                        Apr 26, 2025 · 14:02
                      </td>
                      <td class="py-space-sm px-space-md">
                        <button
                          class="status-toggle inline-flex items-center gap-1.5 px-3 py-1 rounded-full bg-primary/10 text-primary hover:bg-primary/20 transition-colors font-label-badge text-label-badge font-semibold"
                          data-checked="true"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="w-2 h-2 rounded-full bg-primary"></span>
                          <span>Checked In</span>
                        </button>
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <div class="flex items-center justify-end gap-space-xs">
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Sensory Board Pairing"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >developer_board</span
                            >
                          </button>
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Participant Details"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >more_vert</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                    <!-- Row 4: Liam Novak (Not Arrived) -->
                    <tr
                      class="hover:bg-surface-container-high/50 transition-colors participant-row"
                      data-handle="@novak_1"
                      data-name="Liam Novak"
                      data-status="not-arrived"
                    >
                      <td
                        class="py-space-sm px-space-md font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        #04
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-9 h-9 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                          >
                            <img
                              class="w-full h-full object-cover"
                              data-alt="Headshot of Liam Novak, tournament player with casual polo shirt and dark backdrop"
                              src="/images/f0cc4b3f05bd.webp"
                              alt=""
                            />
                          </div>
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-title-md text-on-surface font-medium leading-none"
                              >Liam Novak</span
                            >
                            <span class="font-body-sm text-body-sm text-outline mt-0.5"
                              >@novak_1</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge uppercase"
                          >PLAYER</span
                        >
                      </td>
                      <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                        Apr 28, 2025 · 16:45
                      </td>
                      <td class="py-space-sm px-space-md">
                        <button
                          class="status-toggle inline-flex items-center gap-1.5 px-3 py-1 rounded-full bg-secondary-container/40 text-on-secondary-container hover:bg-secondary-container/60 transition-colors font-label-badge text-label-badge font-semibold"
                          data-checked="false"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="w-2 h-2 rounded-full bg-outline"></span>
                          <span>Not Arrived</span>
                        </button>
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <div class="flex items-center justify-end gap-space-xs">
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Sensory Board Pairing"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >developer_board</span
                            >
                          </button>
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Participant Details"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >more_vert</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                    <!-- Row 5: Youssef Mansour -->
                    <tr
                      class="hover:bg-surface-container-high/50 transition-colors participant-row"
                      data-handle="@youssef_m"
                      data-name="Youssef Mansour"
                      data-status="checked-in"
                    >
                      <td
                        class="py-space-sm px-space-md font-label-numeric-md text-label-numeric-md text-on-surface"
                      >
                        #05
                      </td>
                      <td class="py-space-sm px-space-md">
                        <div class="flex items-center gap-space-sm">
                          <div
                            class="w-9 h-9 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                          >
                            <img
                              class="w-full h-full object-cover"
                              data-alt="Portrait of Youssef Mansour, collegiate chess player with warm engaging smile in soft architectural lighting"
                              src="/images/2c7adb6b9ffa.webp"
                              alt=""
                            />
                          </div>
                          <div class="flex flex-col">
                            <span
                              class="font-title-md text-title-md text-on-surface font-medium leading-none"
                              >Youssef Mansour</span
                            >
                            <span class="font-body-sm text-body-sm text-outline mt-0.5"
                              >@youssef_m</span
                            >
                          </div>
                        </div>
                      </td>
                      <td class="py-space-sm px-space-md">
                        <span
                          class="px-2 py-0.5 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge uppercase"
                          >PLAYER</span
                        >
                      </td>
                      <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                        Apr 29, 2025 · 18:30
                      </td>
                      <td class="py-space-sm px-space-md">
                        <button
                          class="status-toggle inline-flex items-center gap-1.5 px-3 py-1 rounded-full bg-primary/10 text-primary hover:bg-primary/20 transition-colors font-label-badge text-label-badge font-semibold"
                          data-checked="true"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="w-2 h-2 rounded-full bg-primary"></span>
                          <span>Checked In</span>
                        </button>
                      </td>
                      <td class="py-space-sm px-space-md text-right">
                        <div class="flex items-center justify-end gap-space-xs">
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Sensory Board Pairing"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >developer_board</span
                            >
                          </button>
                          <button
                            class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                            title="Participant Details"
                            type="button"
                            disabled
                          >
                            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                              >more_vert</span
                            >
                          </button>
                        </div>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <!-- Table Bottom Status Bar -->
              <div
                class="p-space-md bg-surface-container-lowest flex flex-col sm:flex-row items-center justify-between gap-space-sm font-body-sm text-body-sm text-outline"
              >
                <div class="flex items-center gap-space-md">
                  <span
                    >Showing <strong class="text-on-surface">5 of 14</strong> registered
                    participants</span
                  >
                  <span class="w-1 h-1 rounded-full bg-surface-container-highest"></span>
                  <span
                    >Hall Arbiter Assigned:
                    <strong class="text-primary font-semibold">Chief Arbiter (ADMIN)</strong></span
                  >
                </div>
                <div class="flex items-center gap-space-xs">
                  <button
                    class="px-2.5 py-1 rounded bg-surface-container hover:bg-surface-container-high text-on-surface transition-colors disabled:opacity-40"
                    disabled
                    type="button"
                    title="Design preview"
                  >
                    Previous
                  </button>
                  <button
                    class="px-2.5 py-1 rounded bg-surface-container-high text-primary font-semibold"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    1
                  </button>
                  <button
                    class="px-2.5 py-1 rounded bg-surface-container hover:bg-surface-container-high text-on-surface transition-colors"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    2
                  </button>
                  <button
                    class="px-2.5 py-1 rounded bg-surface-container hover:bg-surface-container-high text-on-surface transition-colors"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    3
                  </button>
                  <button
                    class="px-2.5 py-1 rounded bg-surface-container hover:bg-surface-container-high text-on-surface transition-colors"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Next
                  </button>
                </div>
              </div>
            </div>
          </div>
          <!-- Right Column: Learning Objectives & Workshop Syllabus Breakdown (4 cols) -->
          <div class="lg:col-span-4 flex flex-col gap-space-md">
            <!-- Learning Objectives Panel -->
            <div
              class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >psychology</span
                  >
                  <h3 class="font-headline-sm text-headline-sm text-on-surface">
                    Core Repertoire Objectives
                  </h3>
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Najdorf 5...a6</span
                >
              </div>
              <p class="font-body-sm text-body-sm text-outline leading-relaxed">
                Participants prepare rigorous responses to mainline White aggression, handling early
                king-walks, counter-sacrifices, and positional pawn breaks.
              </p>
              <!-- Key Takeaways Breakdown -->
              <div class="flex flex-col gap-space-sm pt-space-xs">
                <!-- Takeaway 1 -->
                <div
                  class="p-space-md rounded-lg bg-surface-container-low hover:bg-surface-container-high/60 transition-colors flex flex-col gap-space-xs"
                >
                  <div class="flex items-center justify-between">
                    <span class="font-title-md text-title-md text-on-surface font-semibold"
                      >1. Sharp 6.Bg5 vs 6.Be3 English Attack</span
                    >
                    <span
                      class="px-2 py-0.5 rounded bg-primary/10 text-primary font-label-badge text-label-badge font-bold"
                      >Priority I</span
                    >
                  </div>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    In-depth navigation of poisoned pawn lines (6...e6 7.f4 Qb6) and precise e5-pawn
                    breaks against the modern pawn storm setup.
                  </p>
                  <div
                    class="flex items-center gap-space-md text-[11px] text-outline font-label-numeric-md pt-1"
                  >
                    <span>Lines: 12 Modules</span>
                    <span>·</span>
                    <span>Sensory Drill: 35 min</span>
                  </div>
                </div>
                <!-- Takeaway 2 -->
                <div
                  class="p-space-md rounded-lg bg-surface-container-low hover:bg-surface-container-high/60 transition-colors flex flex-col gap-space-xs"
                >
                  <div class="flex items-center justify-between">
                    <span class="font-title-md text-title-md text-on-surface font-semibold"
                      >2. Exchange &amp; Pawn Sacrifice Motifs</span
                    >
                    <span
                      class="px-2 py-0.5 rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge font-bold"
                      >Tactical</span
                    >
                  </div>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    Strategic ...Rxc3 exchange sacrifices on the c-file, blowing open the White king
                    and seizing perpetual dynamic initiative.
                  </p>
                  <div
                    class="flex items-center gap-space-md text-[11px] text-outline font-label-numeric-md pt-1"
                  >
                    <span>Lines: 8 Variations</span>
                    <span>·</span>
                    <span>Live Exercise: 40 min</span>
                  </div>
                </div>
                <!-- Takeaway 3 -->
                <div
                  class="p-space-md rounded-lg bg-surface-container-low hover:bg-surface-container-high/60 transition-colors flex flex-col gap-space-xs"
                >
                  <div class="flex items-center justify-between">
                    <span class="font-title-md text-title-md text-on-surface font-semibold"
                      >3. Queenside Conversion &amp; Endgames</span
                    >
                    <span
                      class="px-2 py-0.5 rounded bg-tertiary-container/30 text-tertiary font-label-badge text-label-badge font-bold"
                      >Endgame</span
                    >
                  </div>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    Transitioning the ...b5-...b4 space superiority into dominant minor piece
                    endgames with knight anchors on d4 and c4.
                  </p>
                  <div
                    class="flex items-center gap-space-md text-[11px] text-outline font-label-numeric-md pt-1"
                  >
                    <span>Lines: 6 Variations</span>
                    <span>·</span>
                    <span>Blitz Pairings: 45 min</span>
                  </div>
                </div>
              </div>
              <!-- Instructor Commentary / Admin Memo -->
              <div
                class="p-space-md rounded-lg bg-surface-container-lowest flex items-start gap-space-sm mt-space-xs"
              >
                <span
                  class="material-symbols-outlined text-primary text-[20px] flex-shrink-0 mt-0.5"
                  aria-hidden="true"
                  >info</span
                >
                <div class="flex flex-col">
                  <span class="font-title-md text-title-md text-on-surface font-semibold"
                    >Chief Arbiter Note</span
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Sensory boards #01 through #09 are synchronized to DGT Live Relay for automated
                    live evaluation &amp; workshop recording.</span
                  >
                </div>
              </div>
            </div>
            <!-- Workshop Resource Box -->
            <div
              class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col gap-space-sm"
            >
              <h4 class="font-title-md text-title-md text-on-surface font-semibold">
                Repertoire Files &amp; Assets
              </h4>
              <div
                class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container-low"
              >
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[18px]"
                    aria-hidden="true"
                    >terminal</span
                  >
                  <div class="flex flex-col">
                    <span
                      class="font-body-md text-body-md text-on-surface leading-tight [overflow-wrap:anywhere]"
                      >sicilian_najdorf_complete.pgn</span
                    >
                    <span class="font-body-sm text-body-sm text-outline"
                      >648 KB · Annotated by GM Tariq</span
                    >
                  </div>
                </div>
                <button
                  class="text-outline hover:text-primary transition-colors p-1"
                  title="Download"
                  type="button"
                  disabled
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >cloud_download</span
                  >
                </button>
              </div>
              <div
                class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container-low"
              >
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-secondary text-[18px]"
                    aria-hidden="true"
                    >picture_as_pdf</span
                  >
                  <div class="flex flex-col">
                    <span
                      class="font-body-md text-body-md text-on-surface leading-tight [overflow-wrap:anywhere]"
                      >repertoire_companion_handout.pdf</span
                    >
                    <span class="font-body-sm text-body-sm text-outline"
                      >2.4 MB · 24-page tactical diagrams</span
                    >
                  </div>
                </div>
                <button
                  class="text-outline hover:text-primary transition-colors p-1"
                  title="Download"
                  type="button"
                  disabled
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >cloud_download</span
                  >
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
