<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin md:px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Top Breadcrumb & Metadata Line -->
        <div class="flex flex-wrap items-center justify-between gap-space-md py-space-md">
          <div class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline">
            <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard"
              >Dashboard</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard/events"
              >Events</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-on-surface font-title-md text-title-md"
              >Spring Swiss Championship 2025</span
            >
            <span
              class="font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-surface-container-high text-outline tracking-wider font-mono"
              >#EV-2025-04</span
            >
          </div>
          <!-- Quick Meta Pill -->
          <div
            class="flex items-center gap-space-sm bg-surface-container-low px-space-md py-space-xs rounded-lg"
          >
            <div class="w-2 h-2 rounded-full bg-primary animate-pulse"></div>
            <span class="font-label-badge text-label-badge uppercase tracking-wider text-primary"
              >Registration Open</span
            >
            <span class="text-outline text-body-sm">·</span>
            <span class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
              >Arbiter View</span
            >
          </div>
        </div>
        <!-- Header Section with Title, Badges, and Action Bar -->
        <div
          class="flex flex-col lg:flex-row lg:items-center justify-between gap-space-lg mb-space-lg"
        >
          <div class="flex flex-col gap-space-xs">
            <div class="flex flex-wrap items-center gap-space-sm">
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                Spring Swiss Championship 2025
              </h1>
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-1 rounded bg-secondary-container text-on-secondary-container font-semibold"
                >Published</span
              >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-1 rounded bg-surface-container-highest text-on-surface-variant font-semibold"
                >Tournament</span
              >
            </div>
            <p class="font-body-md text-body-md text-outline">
              Official club seasonal Swiss round event with FIDE digital clocks and Arbiter
              certification.
            </p>
          </div>
          <!-- Action Bar Buttons -->
          <div class="flex flex-wrap items-center gap-space-sm">
            <RouterLink
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm"
              to="/dashboard/events/spring-rapid-open/edit"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">edit</span>
              <span>Edit Event</span>
            </RouterLink>
            <button
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors shadow-sm"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >file_download</span
              >
              <span>Export Attendance CSV</span>
            </button>
            <button
              class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-error-container/20 text-error hover:bg-error-container/40 transition-colors font-title-md text-title-md"
              type="button"
              v-preview-disclosure="'cancel-modal'"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">cancel</span>
              <span>Cancel Event</span>
            </button>
          </div>
        </div>
        <!-- Tactical Hero Banner with Overlay Details -->
        <div
          class="relative w-full rounded-xl overflow-hidden bg-surface-container-low shadow-xl mb-space-xl"
        >
          <div
            class="bg-cover bg-center w-full h-64 lg:h-72"
            data-alt="Close-up of premium handcrafted wooden Staunton chess pieces on a dark tournament board with dramatic moody spotlighting, deep verdant accents, and reflective mahogany surfaces in a silent grandmaster tournament hall."
            style="background-image: url('/images/96bdb678d1c7.webp')"
          ></div>
          <!-- Scrim and Content Overlay -->
          <div
            class="absolute inset-0 bg-gradient-to-t from-surface via-surface/75 to-transparent flex flex-col justify-end p-space-lg lg:p-space-xl"
          >
            <div
              class="grid grid-cols-1 md:grid-cols-3 gap-space-md pt-space-xl backdrop-blur-md bg-surface-container-lowest/60 rounded-lg p-space-md"
            >
              <!-- Date Meta -->
              <div class="flex items-center gap-space-md">
                <div
                  class="w-10 h-10 rounded-lg bg-primary/10 flex items-center justify-center text-primary shrink-0"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >calendar_month</span
                  >
                </div>
                <div class="flex flex-col min-w-0">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Date &amp; Schedule</span
                  >
                  <span class="font-title-md text-title-md text-on-surface truncate"
                    >Apr 26, 2025 · 10:00 UTC</span
                  >
                </div>
              </div>
              <!-- Venue Meta -->
              <div class="flex items-center gap-space-md">
                <div
                  class="w-10 h-10 rounded-lg bg-secondary/10 flex items-center justify-center text-secondary shrink-0"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >meeting_room</span
                  >
                </div>
                <div class="flex flex-col min-w-0">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Location / Room</span
                  >
                  <span class="font-title-md text-title-md text-on-surface truncate"
                    >Main Club Lounge (Hall B)</span
                  >
                </div>
              </div>
              <!-- Host Arbiter Meta -->
              <div class="flex items-center gap-space-md">
                <div
                  class="w-10 h-10 rounded-lg bg-tertiary/10 flex items-center justify-center text-tertiary shrink-0"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >badge</span
                  >
                </div>
                <div class="flex flex-col min-w-0">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Arbiter / Host</span
                  >
                  <span class="font-title-md text-title-md text-on-surface truncate"
                    >Admin Sarah Jenkins</span
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- 4 Metric KPI Cards Bento -->
        <div class="grid grid-cols-1 sm:grid-cols-2 xl:grid-cols-4 gap-space-md mb-space-xl">
          <!-- KPI 1: Roster Fill -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between relative overflow-hidden group hover:bg-surface-container transition-colors"
          >
            <div class="flex items-center justify-between mb-space-sm">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Roster Fill</span
              >
              <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                >groups</span
              >
            </div>
            <div class="flex items-baseline gap-space-xs mb-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">48</span>
              <span class="font-body-md text-body-md text-outline">/ 64 Registered</span>
            </div>
            <!-- Progress Bar -->
            <div
              class="w-full bg-surface-container-highest h-1.5 rounded-full overflow-hidden mt-space-xs mb-space-xs"
            >
              <div
                class="bg-primary h-full rounded-full transition-all duration-500"
                style="width: 75%"
              ></div>
            </div>
            <span class="font-body-sm text-body-sm text-secondary">75% roster capacity filled</span>
          </div>
          <!-- KPI 2: Remaining Seats -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between group hover:bg-surface-container transition-colors"
          >
            <div class="flex items-center justify-between mb-space-sm">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Remaining Seats</span
              >
              <span class="material-symbols-outlined text-tertiary text-[20px]" aria-hidden="true"
                >event_seat</span
              >
            </div>
            <div class="flex items-baseline gap-space-xs mb-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">16</span>
              <span class="font-body-md text-body-md text-outline">Available</span>
            </div>
            <div
              class="flex items-center gap-space-xs mt-space-sm text-body-sm font-body-sm text-on-surface-variant"
            >
              <span class="material-symbols-outlined text-tertiary text-[16px]" aria-hidden="true"
                >lock_clock</span
              >
              <span>Closes in 48 hours</span>
            </div>
          </div>
          <!-- KPI 3: Confirmed Attendance -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between group hover:bg-surface-container transition-colors"
          >
            <div class="flex items-center justify-between mb-space-sm">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Confirmed Attendance</span
              >
              <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                >fact_check</span
              >
            </div>
            <div class="flex items-baseline gap-space-xs mb-space-xs">
              <span
                class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                id="checkin-stat-count"
                >44</span
              >
              <span class="font-body-md text-body-md text-outline">Ready at Venue</span>
            </div>
            <div
              class="flex items-center gap-space-xs mt-space-sm text-body-sm font-body-sm text-primary"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                >check_circle</span
              >
              <span>91.6% Check-in readiness</span>
            </div>
          </div>
          <!-- KPI 4: Cancellation Rate -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between group hover:bg-surface-container transition-colors"
          >
            <div class="flex items-center justify-between mb-space-sm">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Cancellation Rate</span
              >
              <span class="material-symbols-outlined text-error text-[20px]" aria-hidden="true"
                >person_off</span
              >
            </div>
            <div class="flex items-baseline gap-space-xs mb-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">2</span>
              <span class="font-body-md text-body-md text-outline">Withdrawn</span>
            </div>
            <div
              class="flex items-center gap-space-xs mt-space-sm text-body-sm font-body-sm text-outline"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true">info</span>
              <span>Slots released back to public</span>
            </div>
          </div>
        </div>
        <!-- Main Navigation Tabs -->
        <div
          class="flex flex-wrap items-center justify-between gap-space-xs border-b border-surface-container-highest pb-space-xs mb-space-lg"
        >
          <div class="flex flex-wrap items-center gap-space-sm">
            <button
              class="tab-btn px-space-md py-space-sm font-title-md text-title-md rounded-lg bg-surface-container-high text-primary font-semibold flex items-center gap-space-xs"
              type="button"
              disabled
              title="Design preview"
            >
              <span>Participants</span>
              <span
                class="font-label-badge text-label-badge px-space-xs py-0.5 rounded-full bg-primary-container text-on-primary-container"
                >48</span
              >
            </button>
            <button
              class="tab-btn px-space-md py-space-sm font-title-md text-title-md rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-colors flex items-center gap-space-xs"
              type="button"
              disabled
              title="Design preview"
            >
              <span>Details</span>
            </button>
            <button
              class="tab-btn px-space-md py-space-sm font-title-md text-title-md rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-colors flex items-center gap-space-xs"
              type="button"
              disabled
              title="Design preview"
            >
              <span>Attendance Desk</span>
            </button>
          </div>
          <!-- Quick Add Manual Player Action Button -->
          <button
            class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md hover:bg-primary-fixed transition-colors shadow-sm"
            type="button"
            v-preview-disclosure="'add-player-drawer'"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true">person_add</span>
            <span>Add Player to Roster</span>
          </button>
        </div>
        <!-- Tab Content: Participants -->
        <div class="flex flex-col gap-space-md" id="tab-participants">
          <!-- Filter & Search Controls Strip -->
          <div
            class="flex flex-col sm:flex-row items-center justify-between gap-space-md p-space-md bg-surface-container-low rounded-xl"
          >
            <!-- Search Input -->
            <div class="relative w-full sm:w-80">
              <span
                class="material-symbols-outlined absolute left-space-md top-1/2 -translate-y-1/2 text-outline text-[18px]"
                aria-hidden="true"
                >search</span
              >
              <input
                class="w-full bg-surface-container pl-10 pr-space-md py-space-xs rounded-lg text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high font-body-md text-body-md transition-all"
                id="player-search"
                placeholder="Search by player or handle..."
                type="text"
              />
            </div>
            <!-- Status Filters & Counter -->
            <div class="flex items-center gap-space-xs w-full sm:w-auto overflow-x-auto">
              <button
                class="status-filter-btn px-space-md py-1.5 rounded-lg bg-primary text-on-primary font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                type="button"
                disabled
                title="Design preview"
              >
                All
              </button>
              <button
                class="status-filter-btn px-space-md py-1.5 rounded-lg bg-surface-container hover:bg-surface-container-high text-outline hover:text-on-surface font-label-badge text-label-badge uppercase tracking-wider font-semibold transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Checked In
              </button>
              <button
                class="status-filter-btn px-space-md py-1.5 rounded-lg bg-surface-container hover:bg-surface-container-high text-outline hover:text-on-surface font-label-badge text-label-badge uppercase tracking-wider font-semibold transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Not Arrived
              </button>
              <button
                class="status-filter-btn px-space-md py-1.5 rounded-lg bg-surface-container hover:bg-surface-container-high text-outline hover:text-on-surface font-label-badge text-label-badge uppercase tracking-wider font-semibold transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Withdrawn
              </button>
            </div>
          </div>
          <!-- Participant Management Table -->
          <div class="w-full rounded-xl bg-surface-container-low overflow-hidden shadow-sm">
            <div class="relative overflow-x-auto">
              <table class="w-full text-left" id="participants-table">
                <thead>
                  <tr
                    class="bg-surface-container text-outline font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    <th class="py-space-md px-space-lg w-16 text-center">Seed</th>
                    <th class="py-space-md px-space-lg">Player Profile</th>
                    <th class="py-space-md px-space-lg">Registered Date</th>
                    <th class="py-space-md px-space-lg">Registration Status</th>
                    <th class="py-space-md px-space-lg">Attendance Check</th>
                    <th class="py-space-md px-space-lg text-right">Actions</th>
                  </tr>
                </thead>
                <tbody
                  class="divide-y divide-surface-container-highest/30"
                  id="player-rows-container"
                >
                  <!-- Player Row 1 -->
                  <tr
                    class="player-row hover:bg-surface-container/60 transition-colors"
                    data-handle="@adam_chen"
                    data-name="Adam Chen"
                    data-status="checked-in"
                  >
                    <td
                      class="py-space-md px-space-lg text-center font-label-numeric-md text-label-numeric-md text-outline"
                    >
                      #01
                    </td>
                    <td class="py-space-md px-space-lg">
                      <div class="flex items-center gap-space-md">
                        <div
                          class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center font-title-md text-title-md text-primary font-bold overflow-hidden shrink-0"
                        >
                          <img
                            class="w-full h-full object-cover"
                            data-alt="Close-up headshot of young Asian competitive chess player Adam Chen in dark polo shirt with focused intellectual expression in a softly lit tournament prep room."
                            src="/images/7fa710757f02.webp"
                            alt=""
                          />
                        </div>
                        <div class="flex flex-col">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold leading-tight"
                            >Adam Chen</span
                          >
                          <span class="font-body-sm text-body-sm text-outline">@adam_chen</span>
                        </div>
                      </div>
                    </td>
                    <td
                      class="py-space-md px-space-lg font-body-md text-body-md text-on-surface-variant font-mono"
                    >
                      2025-04-01 14:12
                    </td>
                    <td class="py-space-md px-space-lg">
                      <span
                        class="inline-flex items-center gap-1.5 px-space-sm py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Confirmed
                      </span>
                    </td>
                    <td class="py-space-md px-space-lg">
                      <label
                        class="inline-flex items-center gap-space-sm cursor-pointer select-none"
                      >
                        <input checked class="sr-only peer" type="checkbox" />
                        <div
                          class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-white after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary"
                        ></div>
                        <span
                          class="check-status-label font-body-sm text-body-sm text-secondary font-medium"
                          >Checked In</span
                        >
                      </label>
                    </td>
                    <td class="py-space-md px-space-lg text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-space-xs text-outline hover:text-primary transition-colors"
                          title="Quick check-in confirmation"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >verified</span
                          >
                        </button>
                        <button
                          class="p-space-xs text-outline hover:text-error transition-colors"
                          title="Withdraw player"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >person_remove</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Player Row 2 -->
                  <tr
                    class="player-row hover:bg-surface-container/60 transition-colors"
                    data-handle="@elena_r"
                    data-name="Elena Rostova"
                    data-status="checked-in"
                  >
                    <td
                      class="py-space-md px-space-lg text-center font-label-numeric-md text-label-numeric-md text-outline"
                    >
                      #02
                    </td>
                    <td class="py-space-md px-space-lg">
                      <div class="flex items-center gap-space-md">
                        <div
                          class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center font-title-md text-title-md text-primary font-bold overflow-hidden shrink-0"
                        >
                          <img
                            class="w-full h-full object-cover"
                            data-alt="Portrait photo of Eastern European female chess master Elena Rostova with analytical gaze, neat hair, and dark collegiate sweater in front of a chess clock."
                            src="/images/5da76b19c84a.webp"
                            alt=""
                          />
                        </div>
                        <div class="flex flex-col">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold leading-tight"
                            >Elena Rostova</span
                          >
                          <span class="font-body-sm text-body-sm text-outline">@elena_r</span>
                        </div>
                      </div>
                    </td>
                    <td
                      class="py-space-md px-space-lg font-body-md text-body-md text-on-surface-variant font-mono"
                    >
                      2025-04-02 09:44
                    </td>
                    <td class="py-space-md px-space-lg">
                      <span
                        class="inline-flex items-center gap-1.5 px-space-sm py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Confirmed
                      </span>
                    </td>
                    <td class="py-space-md px-space-lg">
                      <label
                        class="inline-flex items-center gap-space-sm cursor-pointer select-none"
                      >
                        <input checked class="sr-only peer" type="checkbox" />
                        <div
                          class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-white after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary"
                        ></div>
                        <span
                          class="check-status-label font-body-sm text-body-sm text-secondary font-medium"
                          >Checked In</span
                        >
                      </label>
                    </td>
                    <td class="py-space-md px-space-lg text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-space-xs text-outline hover:text-primary transition-colors"
                          title="Quick check-in confirmation"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >verified</span
                          >
                        </button>
                        <button
                          class="p-space-xs text-outline hover:text-error transition-colors"
                          title="Withdraw player"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >person_remove</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Player Row 3 -->
                  <tr
                    class="player-row hover:bg-surface-container/60 transition-colors"
                    data-handle="@alex_rivera"
                    data-name="Alex Rivera"
                    data-status="not-arrived"
                  >
                    <td
                      class="py-space-md px-space-lg text-center font-label-numeric-md text-label-numeric-md text-outline"
                    >
                      #03
                    </td>
                    <td class="py-space-md px-space-lg">
                      <div class="flex items-center gap-space-md">
                        <div
                          class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center font-title-md text-title-md text-outline font-bold overflow-hidden shrink-0"
                        >
                          <img
                            class="w-full h-full object-cover"
                            data-alt="Headshot of Hispanic male player Alex Rivera wearing glasses and casual jacket with contemplative chess player appearance under neutral indoor lighting."
                            src="/images/3ee88617e617.webp"
                            alt=""
                          />
                        </div>
                        <div class="flex flex-col">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold leading-tight"
                            >Alex Rivera</span
                          >
                          <span class="font-body-sm text-body-sm text-outline">@alex_rivera</span>
                        </div>
                      </div>
                    </td>
                    <td
                      class="py-space-md px-space-lg font-body-md text-body-md text-on-surface-variant font-mono"
                    >
                      2025-04-03 16:20
                    </td>
                    <td class="py-space-md px-space-lg">
                      <span
                        class="inline-flex items-center gap-1.5 px-space-sm py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Confirmed
                      </span>
                    </td>
                    <td class="py-space-md px-space-lg">
                      <label
                        class="inline-flex items-center gap-space-sm cursor-pointer select-none"
                      >
                        <input class="sr-only peer" type="checkbox" />
                        <div
                          class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-white after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary"
                        ></div>
                        <span
                          class="check-status-label font-body-sm text-body-sm text-outline font-medium"
                          >Not Arrived</span
                        >
                      </label>
                    </td>
                    <td class="py-space-md px-space-lg text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-space-xs text-outline hover:text-primary transition-colors"
                          title="Quick check-in confirmation"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >verified</span
                          >
                        </button>
                        <button
                          class="p-space-xs text-outline hover:text-error transition-colors"
                          title="Withdraw player"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >person_remove</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Player Row 4 -->
                  <tr
                    class="player-row hover:bg-surface-container/60 transition-colors"
                    data-handle="@tariq_chess"
                    data-name="Tariq Al-Mansoor"
                    data-status="checked-in"
                  >
                    <td
                      class="py-space-md px-space-lg text-center font-label-numeric-md text-label-numeric-md text-outline"
                    >
                      #04
                    </td>
                    <td class="py-space-md px-space-lg">
                      <div class="flex items-center gap-space-md">
                        <div
                          class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center font-title-md text-title-md text-primary font-bold overflow-hidden shrink-0"
                        >
                          <img
                            class="w-full h-full object-cover"
                            data-alt="Crisp studio portrait of Middle Eastern chess enthusiast Tariq Al-Mansoor with neatly trimmed beard, wearing minimalist black hoodie against dark slate backdrop."
                            src="/images/1a2140c14894.webp"
                            alt=""
                          />
                        </div>
                        <div class="flex flex-col">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold leading-tight"
                            >Tariq Al-Mansoor</span
                          >
                          <span class="font-body-sm text-body-sm text-outline">@tariq_chess</span>
                        </div>
                      </div>
                    </td>
                    <td
                      class="py-space-md px-space-lg font-body-md text-body-md text-on-surface-variant font-mono"
                    >
                      2025-04-03 18:05
                    </td>
                    <td class="py-space-md px-space-lg">
                      <span
                        class="inline-flex items-center gap-1.5 px-space-sm py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Confirmed
                      </span>
                    </td>
                    <td class="py-space-md px-space-lg">
                      <label
                        class="inline-flex items-center gap-space-sm cursor-pointer select-none"
                      >
                        <input checked class="sr-only peer" type="checkbox" />
                        <div
                          class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-white after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary"
                        ></div>
                        <span
                          class="check-status-label font-body-sm text-body-sm text-secondary font-medium"
                          >Checked In</span
                        >
                      </label>
                    </td>
                    <td class="py-space-md px-space-lg text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-space-xs text-outline hover:text-primary transition-colors"
                          title="Quick check-in confirmation"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >verified</span
                          >
                        </button>
                        <button
                          class="p-space-xs text-outline hover:text-error transition-colors"
                          title="Withdraw player"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >person_remove</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Player Row 5 -->
                  <tr
                    class="player-row hover:bg-surface-container/60 transition-colors"
                    data-handle="@youssef_m"
                    data-name="Youssef Mansour"
                    data-status="not-arrived"
                  >
                    <td
                      class="py-space-md px-space-lg text-center font-label-numeric-md text-label-numeric-md text-outline"
                    >
                      #05
                    </td>
                    <td class="py-space-md px-space-lg">
                      <div class="flex items-center gap-space-md">
                        <div
                          class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center font-title-md text-title-md text-outline font-bold overflow-hidden shrink-0"
                        >
                          <img
                            class="w-full h-full object-cover"
                            data-alt="Headshot of North African chess player Youssef Mansour in dark navy collared shirt with keen focused tournament demeanor."
                            src="/images/7412e5a8076c.webp"
                            alt=""
                          />
                        </div>
                        <div class="flex flex-col">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold leading-tight"
                            >Youssef Mansour</span
                          >
                          <span class="font-body-sm text-body-sm text-outline">@youssef_m</span>
                        </div>
                      </div>
                    </td>
                    <td
                      class="py-space-md px-space-lg font-body-md text-body-md text-on-surface-variant font-mono"
                    >
                      2025-04-05 11:32
                    </td>
                    <td class="py-space-md px-space-lg">
                      <span
                        class="inline-flex items-center gap-1.5 px-space-sm py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Confirmed
                      </span>
                    </td>
                    <td class="py-space-md px-space-lg">
                      <label
                        class="inline-flex items-center gap-space-sm cursor-pointer select-none"
                      >
                        <input class="sr-only peer" type="checkbox" />
                        <div
                          class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-white after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary"
                        ></div>
                        <span
                          class="check-status-label font-body-sm text-body-sm text-outline font-medium"
                          >Not Arrived</span
                        >
                      </label>
                    </td>
                    <td class="py-space-md px-space-lg text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-space-xs text-outline hover:text-primary transition-colors"
                          title="Quick check-in confirmation"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >verified</span
                          >
                        </button>
                        <button
                          class="p-space-xs text-outline hover:text-error transition-colors"
                          title="Withdraw player"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >person_remove</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
            </div>
            <!-- Pagination & Table Footer -->
            <div
              class="flex flex-col sm:flex-row items-center justify-between gap-space-sm p-space-md bg-surface-container text-outline font-body-sm text-body-sm"
            >
              <span>Showing 1 to 5 of 48 registered players</span>
              <div class="flex items-center gap-space-xs">
                <button
                  class="px-space-sm py-1 rounded bg-surface-container-high text-outline hover:text-on-surface disabled:opacity-40"
                  disabled
                  type="button"
                  title="Design preview"
                >
                  Previous
                </button>
                <span
                  class="px-space-sm py-1 rounded bg-primary-container text-on-primary-container font-semibold"
                  >1</span
                >
                <button
                  class="px-space-sm py-1 rounded bg-surface-container-high text-outline hover:text-on-surface"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  2
                </button>
                <button
                  class="px-space-sm py-1 rounded bg-surface-container-high text-outline hover:text-on-surface"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  3
                </button>
                <button
                  class="px-space-sm py-1 rounded bg-surface-container-high text-outline hover:text-on-surface"
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
        <!-- Tab Content: Details (Hidden by default) -->
        <div class="hidden flex-col gap-space-lg" id="tab-details">
          <div class="grid grid-cols-1 lg:grid-cols-2 gap-space-lg">
            <div class="p-space-lg rounded-xl bg-surface-container-low flex flex-col gap-space-md">
              <h3 class="font-headline-sm text-headline-sm text-on-surface">
                Arbiter Tournament Guidelines
              </h3>
              <p class="font-body-md text-body-md text-on-surface-variant">
                The event utilizes standard Swiss pairing protocols. Check-in closes 15 minutes
                before Round 1 begins. Players who have not completed physical or digital check-in
                will be automatically marked as unassigned and replaced by waitlisted alternates.
              </p>
              <div class="flex flex-col gap-space-sm pt-space-xs">
                <div
                  class="flex justify-between py-space-xs border-b border-surface-container-highest/40 font-body-md text-body-md"
                >
                  <span class="text-outline">Time Control</span>
                  <span class="text-on-surface font-mono">10 min + 5 sec increment</span>
                </div>
                <div
                  class="flex justify-between py-space-xs border-b border-surface-container-highest/40 font-body-md text-body-md"
                >
                  <span class="text-outline">Rounds</span>
                  <span class="text-on-surface">5 Swiss Rounds</span>
                </div>
                <div
                  class="flex justify-between py-space-xs border-b border-surface-container-highest/40 font-body-md text-body-md"
                >
                  <span class="text-outline">Default Tolerance</span>
                  <span class="text-on-surface">10 minutes after round start</span>
                </div>
              </div>
            </div>
            <div class="p-space-lg rounded-xl bg-surface-container-low flex flex-col gap-space-md">
              <h3 class="font-headline-sm text-headline-sm text-on-surface">
                Equipment &amp; Hall Logistics
              </h3>
              <p class="font-body-md text-body-md text-on-surface-variant">
                Boards 1 through 24 are equipped with DGT e-Boards synchronized to the live Arbiter
                Console display.
              </p>
              <div
                class="flex items-center gap-space-md p-space-md rounded-lg bg-surface-container"
              >
                <span class="material-symbols-outlined text-primary text-[28px]" aria-hidden="true"
                  >sports_esports</span
                >
                <div class="flex flex-col">
                  <span class="font-title-md text-title-md text-on-surface"
                    >Digital Broadcast Sync</span
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Relay connected to ChessHub Broadcast Server #04</span
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- Tab Content: Attendance Desk (Hidden by default) -->
        <div class="hidden flex-col gap-space-lg" id="tab-desk">
          <div class="p-space-lg rounded-xl bg-surface-container-low flex flex-col gap-space-md">
            <div class="flex items-center justify-between">
              <div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  Reception Scanner &amp; Fast Check-In
                </h3>
                <p class="font-body-md text-body-md text-outline">
                  Scan player pass QR codes or type badge identifiers for instant venue admission.
                </p>
              </div>
              <div
                class="flex items-center gap-space-xs px-space-md py-space-xs rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >qr_code_scanner</span
                >
                <span>Scanner Ready</span>
              </div>
            </div>
            <div
              class="p-space-xl rounded-xl bg-surface-container flex flex-col items-center justify-center text-center gap-space-md"
            >
              <div
                class="w-16 h-16 rounded-full bg-primary/10 flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[36px]" aria-hidden="true"
                  >barcode_scanner</span
                >
              </div>
              <div class="max-w-md">
                <h4 class="font-title-md text-title-md text-on-surface">
                  Ready to Register Player Arrivals
                </h4>
                <p class="font-body-sm text-body-sm text-outline mt-1">
                  Keep this screen open at the front tournament registration desk to record physical
                  player presence with 1-click updates.
                </p>
              </div>
            </div>
          </div>
        </div>
        <!-- Slide-out Drawer: Manually Add Player to Roster -->
        <div
          class="fixed inset-0 z-50 hidden justify-end bg-surface/80 backdrop-blur-sm preview-disclosure preview-disclosure-flex"
          id="add-player-drawer"
          aria-labelledby="add-player-heading"
          aria-modal="true"
          role="dialog"
        >
          <div class="flex h-full w-full max-w-md flex-col bg-surface-container-low shadow-2xl">
            <div class="p-space-lg bg-surface-container flex items-center justify-between">
              <div class="flex items-center gap-space-sm">
                <span class="material-symbols-outlined text-primary text-[24px]" aria-hidden="true"
                  >person_add</span
                >
                <h2
                  class="font-headline-sm text-headline-sm text-on-surface"
                  id="add-player-heading"
                >
                  Add Player to Roster
                </h2>
              </div>
              <button
                class="p-space-xs text-outline hover:text-on-surface transition-colors"
                type="button"
                aria-label="Close add-player dialog"
                v-preview-disclosure="'add-player-drawer'"
                data-preview-dismiss
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">close</span>
              </button>
            </div>
            <div class="p-space-lg flex-1 overflow-y-auto flex flex-col gap-space-lg">
              <div class="flex flex-col gap-space-xs">
                <label class="font-title-md text-title-md text-on-surface" for="drawer-search-input"
                  >Find Player by Handle or Name</label
                >
                <span class="font-body-sm text-body-sm text-outline"
                  >Search member database to append to the active Swiss bracket.</span
                >
                <div class="relative mt-space-xs">
                  <span
                    class="material-symbols-outlined absolute left-space-md top-1/2 -translate-y-1/2 text-outline text-[18px]"
                    aria-hidden="true"
                    >search</span
                  >
                  <input
                    class="w-full bg-surface-container pl-10 pr-space-md py-space-sm rounded-lg text-on-surface placeholder:text-outline focus:outline-none focus:ring-1 focus:ring-primary font-body-md text-body-md"
                    id="drawer-search-input"
                    placeholder="Type @handle or full name..."
                    type="text"
                  />
                </div>
              </div>
              <!-- Quick Suggestion Results List -->
              <div class="flex flex-col gap-space-xs" id="drawer-search-results">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-space-xs"
                  >Available Members</span
                >
                <div
                  class="p-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex items-center justify-between cursor-pointer"
                >
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-8 h-8 rounded-full bg-surface-bright flex items-center justify-center font-bold text-on-surface text-body-sm"
                    >
                      ML
                    </div>
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface leading-tight"
                        >Magnus Lindqvist</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">@magnus_l</span>
                    </div>
                  </div>
                  <button
                    class="text-primary hover:text-primary-fixed font-title-md text-title-md"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Select
                  </button>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex items-center justify-between cursor-pointer"
                >
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-8 h-8 rounded-full bg-surface-bright flex items-center justify-center font-bold text-on-surface text-body-sm"
                    >
                      CD
                    </div>
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface leading-tight"
                        >Chloe Dupont</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">@chloedupont</span>
                    </div>
                  </div>
                  <button
                    class="text-primary hover:text-primary-fixed font-title-md text-title-md"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Select
                  </button>
                </div>
                <div
                  class="p-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors flex items-center justify-between cursor-pointer"
                >
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-8 h-8 rounded-full bg-surface-bright flex items-center justify-center font-bold text-on-surface text-body-sm"
                    >
                      KS
                    </div>
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface leading-tight"
                        >Kenji Sato</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">@sato_kenji</span>
                    </div>
                  </div>
                  <button
                    class="text-primary hover:text-primary-fixed font-title-md text-title-md"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Select
                  </button>
                </div>
              </div>
              <!-- Registration Meta Toggle -->
              <div class="p-space-md rounded-lg bg-surface-container flex flex-col gap-space-sm">
                <label class="flex items-center justify-between cursor-pointer">
                  <span class="font-title-md text-title-md text-on-surface"
                    >Mark Check-in Immediately</span
                  >
                  <input
                    checked
                    class="w-4 h-4 accent-primary rounded"
                    id="drawer-instant-checkin"
                    type="checkbox"
                  />
                </label>
                <span class="font-body-sm text-body-sm text-outline"
                  >Automatically grant attendance access for on-site registration.</span
                >
              </div>
            </div>
            <!-- Drawer Footer Actions -->
            <div class="p-space-lg bg-surface-container flex items-center justify-end gap-space-sm">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container-high text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md hover:bg-primary-fixed transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Enroll Player
              </button>
            </div>
          </div>
        </div>
        <!-- Modal: Confirm Withdraw Player -->
        <div
          class="fixed inset-0 z-50 flex items-center justify-center p-space-md hidden preview-disclosure preview-disclosure-flex"
          id="withdraw-modal"
        >
          <div class="absolute inset-0 bg-surface/80 backdrop-blur-sm"></div>
          <div
            class="relative w-full max-w-md bg-surface-container-low rounded-xl shadow-2xl p-space-lg flex flex-col gap-space-md z-10"
          >
            <div class="flex items-center gap-space-sm text-error">
              <span class="material-symbols-outlined text-[24px]" aria-hidden="true">warning</span>
              <h3 class="font-headline-sm text-headline-sm text-on-surface">
                Confirm Player Withdrawal
              </h3>
            </div>
            <p class="font-body-md text-body-md text-on-surface-variant">
              Are you sure you want to withdraw
              <span class="font-bold text-on-surface" id="withdraw-player-name">Player</span>
              (<span id="withdraw-player-seed">#00</span>)? This will vacate their bracket slot and
              release seat allocation back to open registration.
            </p>
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                type="button"
                v-preview-disclosure="'withdraw-modal'"
                data-preview-dismiss=""
              >
                Keep in Event
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg bg-error text-on-error font-title-md text-title-md hover:bg-error-container transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Confirm Withdrawal
              </button>
            </div>
          </div>
        </div>
        <!-- Modal: Cancel Entire Event -->
        <div
          class="fixed inset-0 z-50 flex items-center justify-center p-space-md hidden preview-disclosure preview-disclosure-flex"
          id="cancel-modal"
          aria-label="Cancel entire event"
          aria-modal="true"
          role="dialog"
        >
          <div class="absolute inset-0 bg-surface/80 backdrop-blur-sm"></div>
          <div
            class="relative w-full max-w-md bg-surface-container-low rounded-xl shadow-2xl p-space-lg flex flex-col gap-space-md z-10"
          >
            <div class="flex items-center gap-space-sm text-error">
              <span class="material-symbols-outlined text-[24px]" aria-hidden="true">fmd_bad</span>
              <h3 class="font-headline-sm text-headline-sm text-on-surface">
                Cancel Entire Event?
              </h3>
            </div>
            <p class="font-body-md text-body-md text-on-surface-variant">
              This action will permanently set "Spring Swiss Championship 2025" to Cancelled status.
              All 48 participants will receive an automated broadcast notification and scheduled
              pairings will be discarded.
            </p>
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                type="button"
                v-preview-disclosure="'cancel-modal'"
                data-preview-dismiss=""
              >
                Dismiss
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg bg-error text-on-error font-title-md text-title-md hover:bg-error-container transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Proceed with Cancellation
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
