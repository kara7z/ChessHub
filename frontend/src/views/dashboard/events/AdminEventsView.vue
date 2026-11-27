<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-margin-desktop">
        <!-- Dynamic Gradient Ambient Backdrop (Local Inset) -->
        <div
          class="relative w-full overflow-hidden rounded-xl bg-surface-container-low mb-space-xl p-space-lg shadow-sm"
        >
          <div
            class="absolute -right-20 -top-24 w-96 h-96 bg-primary/10 rounded-full blur-3xl pointer-events-none"
          ></div>
          <div
            class="absolute right-72 -bottom-20 w-64 h-64 bg-secondary-container/30 rounded-full blur-2xl pointer-events-none"
          ></div>
          <!-- Header & Action Row -->
          <div class="relative flex flex-col md:flex-row md:items-end justify-between gap-space-md">
            <div class="flex flex-col gap-space-xs">
              <div
                class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm tracking-wide uppercase"
              >
                <span>Dashboard</span>
                <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                  >chevron_right</span
                >
                <span class="text-primary font-semibold">Events Console</span>
              </div>
              <h1
                class="font-headline-lg text-headline-lg text-on-surface tracking-tight font-bold"
              >
                Event Management Desk
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant max-w-2xl">
                Coordinate competitive tournaments, live master simuls, ranked rating fixtures, and
                official club gatherings with real-time capacity monitoring.
              </p>
            </div>
            <!-- Action Cluster -->
            <div class="flex items-center gap-space-sm self-start md:self-auto shrink-0">
              <button
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface font-title-md text-title-md hover:bg-surface-variant transition-colors shadow-sm"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >download</span
                >
                <span>Export Events CSV</span>
              </button>
              <RouterLink
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md hover:bg-primary transition-all shadow-md"
                to="/dashboard/events/create"
              >
                <span class="material-symbols-outlined text-[20px] font-bold" aria-hidden="true"
                  >add</span
                >
                <span>Create New Event</span>
              </RouterLink>
            </div>
          </div>
        </div>
        <!-- KPI Metric Row -->
        <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-space-md mb-space-xl">
          <!-- Total Events -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between relative overflow-hidden group hover:bg-surface-container transition-all"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Tournament Registry</span
              >
              <div
                class="w-8 h-8 rounded-lg bg-surface-container-highest flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >calendar_month</span
                >
              </div>
            </div>
            <div class="mt-space-md flex items-baseline gap-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface font-bold"
                >18</span
              >
              <span class="font-body-sm text-body-sm text-outline">Scheduled</span>
            </div>
            <div
              class="mt-space-xs flex items-center gap-space-xs text-primary font-body-sm text-body-sm"
            >
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >arrow_upward</span
              >
              <span>+3 this month</span>
            </div>
          </div>
          <!-- Published & Live -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between relative overflow-hidden group hover:bg-surface-container transition-all"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Live &amp; Open</span
              >
              <div
                class="w-8 h-8 rounded-lg bg-secondary-container flex items-center justify-center text-secondary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >sensors</span
                >
              </div>
            </div>
            <div class="mt-space-md flex items-baseline gap-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-secondary font-bold"
                >6</span
              >
              <span class="font-body-sm text-body-sm text-outline">Accepting Rosters</span>
            </div>
            <div
              class="mt-space-xs flex items-center gap-space-xs text-outline font-body-sm text-body-sm"
            >
              <span class="w-2 h-2 rounded-full bg-secondary inline-block"></span>
              <span>2 Starting in 48h</span>
            </div>
          </div>
          <!-- Registrations -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between relative overflow-hidden group hover:bg-surface-container transition-all"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Roster Fill</span
              >
              <div
                class="w-8 h-8 rounded-lg bg-tertiary-container/20 flex items-center justify-center text-tertiary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >how_to_reg</span
                >
              </div>
            </div>
            <div class="mt-space-md flex items-baseline gap-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface font-bold"
                >342</span
              >
              <span class="font-body-sm text-body-sm text-outline">Athletes</span>
            </div>
            <div
              class="mt-space-xs flex items-center gap-space-xs text-primary font-body-sm text-body-sm"
            >
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >trending_up</span
              >
              <span>+84 vs last season</span>
            </div>
          </div>
          <!-- Avg Attendance Rate -->
          <div
            class="p-space-lg rounded-xl bg-surface-container-low shadow-sm flex flex-col justify-between relative overflow-hidden group hover:bg-surface-container transition-all"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Attendance Metric</span
              >
              <div
                class="w-8 h-8 rounded-lg bg-surface-container-highest flex items-center justify-center text-primary-fixed"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >query_stats</span
                >
              </div>
            </div>
            <div class="mt-space-md flex items-baseline gap-space-xs">
              <span class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
                >94.2%</span
              >
              <span class="font-body-sm text-body-sm text-outline">Check-in</span>
            </div>
            <div
              class="mt-space-xs flex items-center gap-space-xs text-secondary font-body-sm text-body-sm"
            >
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true">verified</span>
              <span>Optimal Board Utilization</span>
            </div>
          </div>
        </div>
        <!-- Filtration Deck -->
        <div class="p-space-md rounded-xl bg-surface-container-low mb-space-md shadow-sm">
          <div
            class="flex flex-col lg:flex-row gap-space-md items-stretch lg:items-center justify-between"
          >
            <!-- Search -->
            <div class="relative flex-1 min-w-[280px]">
              <span
                class="material-symbols-outlined absolute left-space-md top-1/2 -translate-y-1/2 text-outline text-[20px]"
                aria-hidden="true"
                >search</span
              >
              <input
                class="w-full pl-11 pr-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface placeholder:text-outline font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors"
                placeholder="Search events by title, organizer, or venue..."
                type="text"
              />
            </div>
            <!-- Controls Group -->
            <div class="flex flex-wrap items-center gap-space-sm">
              <!-- Category Filter -->
              <div class="relative">
                <select
                  class="appearance-none pl-space-md pr-9 py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-title-md text-title-md cursor-pointer focus:outline-none hover:bg-surface-container-high transition-colors"
                >
                  <option>All Categories</option>
                  <option>Tournaments</option>
                  <option>Simultaneous</option>
                  <option>Friendly Matches</option>
                  <option>Club Socials</option>
                </select>
                <span
                  class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                  aria-hidden="true"
                  >expand_more</span
                >
              </div>
              <!-- Status Filter -->
              <div class="relative">
                <select
                  class="appearance-none pl-space-md pr-9 py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-title-md text-title-md cursor-pointer focus:outline-none hover:bg-surface-container-high transition-colors"
                >
                  <option>All Statuses</option>
                  <option>Draft</option>
                  <option>Published</option>
                  <option>Completed</option>
                  <option>Cancelled</option>
                </select>
                <span
                  class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                  aria-hidden="true"
                  >tune</span
                >
              </div>
              <!-- Date Range Filter -->
              <div
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface-variant font-body-md text-body-md cursor-pointer hover:bg-surface-container-high hover:text-on-surface transition-colors"
              >
                <span class="material-symbols-outlined text-outline text-[18px]" aria-hidden="true"
                  >calendar_today</span
                >
                <span>Apr 2025 – Jun 2025</span>
                <span class="material-symbols-outlined text-outline text-[16px]" aria-hidden="true"
                  >close</span
                >
              </div>
              <!-- Clear Reset -->
              <button
                class="p-space-sm rounded-lg text-outline hover:text-on-surface hover:bg-surface-container-high transition-colors"
                title="Reset Filters"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >restart_alt</span
                >
              </button>
            </div>
          </div>
        </div>
        <!-- Event Ledger Data Table -->
        <div class="w-full overflow-hidden rounded-xl bg-surface-container-low shadow-sm">
          <div class="w-full overflow-x-auto">
            <table class="w-full text-left border-collapse min-w-[1000px]">
              <thead>
                <tr
                  class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                >
                  <th class="py-space-sm px-space-md w-16">Preview</th>
                  <th class="py-space-sm px-space-md">Event &amp; Category</th>
                  <th class="py-space-sm px-space-md">Schedule (UTC)</th>
                  <th class="py-space-sm px-space-md">Arena Venue</th>
                  <th class="py-space-sm px-space-md w-48">Roster Fill</th>
                  <th class="py-space-sm px-space-md">Status</th>
                  <th class="py-space-sm px-space-md text-right">Actions</th>
                </tr>
              </thead>
              <tbody class="divide-y-0 font-body-md text-body-md">
                <!-- Row 1 -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden bg-surface-container-highest shrink-0 shadow-sm"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-105 transition-transform duration-300"
                        data-alt="Monochrome overhead view of professional Staunton tournament chess board with pristine wooden pieces aligned in dark auditorium lighting with verdant green soft rim reflections"
                        src="/images/b7b0383bb454.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                      >
                        Spring Swiss Championship 2025
                      </span>
                      <div class="flex items-center gap-space-xs mt-0.5">
                        <span
                          class="px-1.5 py-0.5 rounded text-[11px] font-semibold bg-surface-container-highest text-secondary tracking-wide uppercase font-label-badge"
                        >
                          Tournament
                        </span>
                        <span class="text-outline text-body-sm font-body-sm">• FIDE Rated 9R</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Apr 26, 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">10:00 UTC</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-xs text-on-surface">
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span>Main Club Lounge</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex items-center justify-between font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface"
                          >48 <span class="text-outline font-normal">/ 64</span></span
                        >
                        <span class="text-primary font-bold">75%</span>
                      </div>
                      <div
                        class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden"
                      >
                        <div class="h-full bg-primary rounded-full" style="width: 75%"></div>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <span
                      class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full font-label-badge text-label-badge bg-secondary-container/40 text-secondary"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Published
                    </span>
                  </td>
                  <td class="py-space-sm px-space-md text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <RouterLink
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="View Details"
                        to="/dashboard/events/spring-rapid-open"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </RouterLink>
                      <RouterLink
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Edit Event"
                        to="/dashboard/events/spring-rapid-open/edit"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </RouterLink>
                      <button
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Manage Roster"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >group</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 2 -->
                <tr
                  class="bg-surface-container-lowest/50 hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden bg-surface-container-highest shrink-0 shadow-sm"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-105 transition-transform duration-300"
                        data-alt="Intense dramatic close-up of a Grandmaster observing clock during chess simultaneous exhibition, moody rim lighting in emerald and charcoal hues"
                        src="/images/07b78392f4a4.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                      >
                        Simul w/ GM Marcus Vance
                      </span>
                      <div class="flex items-center gap-space-xs mt-0.5">
                        <span
                          class="px-1.5 py-0.5 rounded text-[11px] font-semibold bg-tertiary-container/30 text-tertiary tracking-wide uppercase font-label-badge"
                        >
                          Simultaneous
                        </span>
                        <span class="text-outline text-body-sm font-body-sm">• Master Series</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >May 10, 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">15:00 UTC</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-xs text-on-surface">
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span>Rotunda Exhibition Circle</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex items-center justify-between font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface"
                          >18 <span class="text-outline font-normal">/ 20</span></span
                        >
                        <span class="text-primary font-bold">90%</span>
                      </div>
                      <div
                        class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden"
                      >
                        <div class="h-full bg-primary rounded-full" style="width: 90%"></div>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <span
                      class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full font-label-badge text-label-badge bg-secondary-container/40 text-secondary"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Published
                    </span>
                  </td>
                  <td class="py-space-sm px-space-md text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <RouterLink
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="View Details"
                        to="/dashboard/events/spring-rapid-open"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </RouterLink>
                      <RouterLink
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Edit Event"
                        to="/dashboard/events/spring-rapid-open/edit"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </RouterLink>
                      <button
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Manage Roster"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >group</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 3 -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden bg-surface-container-highest shrink-0 shadow-sm"
                    >
                      <img
                        class="w-full h-full object-cover group-hover:scale-105 transition-transform duration-300"
                        data-alt="Intimate club atmosphere with warm dim lighting and club chess timers, casual coffee cups beside sleek wooden chessmen in focus"
                        src="/images/e8274803abe7.webp"
                        alt=""
                      />
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                      >
                        Casual Blitz Night &amp; Social
                      </span>
                      <div class="flex items-center gap-space-xs mt-0.5">
                        <span
                          class="px-1.5 py-0.5 rounded text-[11px] font-semibold bg-surface-container-highest text-on-surface-variant tracking-wide uppercase font-label-badge"
                        >
                          Club Social
                        </span>
                        <span class="text-outline text-body-sm font-body-sm">• Unrated 3+2</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Weekly Thursdays</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">19:00 UTC</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-xs text-on-surface">
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span>The Bishop's Lounge</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex items-center justify-between font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface"
                          >28 <span class="text-outline font-normal">/ 40</span></span
                        >
                        <span class="text-primary font-bold">70%</span>
                      </div>
                      <div
                        class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden"
                      >
                        <div class="h-full bg-primary rounded-full" style="width: 70%"></div>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <span
                      class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full font-label-badge text-label-badge bg-secondary-container/40 text-secondary"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                      Published
                    </span>
                  </td>
                  <td class="py-space-sm px-space-md text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <RouterLink
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="View Details"
                        to="/dashboard/events/spring-rapid-open"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </RouterLink>
                      <RouterLink
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Edit Event"
                        to="/dashboard/events/spring-rapid-open/edit"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </RouterLink>
                      <button
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Manage Roster"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >group</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 4 -->
                <tr
                  class="bg-surface-container-lowest/50 hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden bg-surface-container-highest shrink-0 shadow-sm"
                    >
                      <div
                        class="w-full h-full flex items-center justify-center text-outline bg-surface-container"
                      >
                        <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                          >flag</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                      >
                        Summer Rapid Open 2025
                      </span>
                      <div class="flex items-center gap-space-xs mt-0.5">
                        <span
                          class="px-1.5 py-0.5 rounded text-[11px] font-semibold bg-surface-container-highest text-secondary tracking-wide uppercase font-label-badge"
                        >
                          Tournament
                        </span>
                        <span class="text-outline text-body-sm font-body-sm">• Rapid 15+10</span>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Jun 14, 2025</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">TBD</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-xs text-on-surface">
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span>Grandmaster Hall</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex items-center justify-between font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface"
                          >0 <span class="text-outline font-normal">/ 64</span></span
                        >
                        <span class="text-outline font-normal">0%</span>
                      </div>
                      <div
                        class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden"
                      >
                        <div class="h-full bg-outline/20 rounded-full" style="width: 0%"></div>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <span
                      class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full font-label-badge text-label-badge bg-surface-container-highest text-primary-fixed"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-primary-fixed"></span>
                      Draft
                    </span>
                  </td>
                  <td class="py-space-sm px-space-md text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <button
                        class="px-2 py-1 rounded bg-primary-container text-on-primary-container font-title-md text-title-md hover:bg-primary transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Publish
                      </button>
                      <RouterLink
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Edit Event"
                        to="/dashboard/events/spring-rapid-open/edit"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >edit</span
                        >
                      </RouterLink>
                      <button
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-error transition-colors"
                        title="Cancel Setup"
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
                <!-- Row 5 -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md">
                    <div
                      class="w-12 h-12 rounded-lg overflow-hidden bg-surface-container-highest shrink-0 shadow-sm opacity-80 group-hover:opacity-100 transition-opacity"
                    >
                      <div
                        class="w-full h-full flex items-center justify-center text-outline bg-surface-container"
                      >
                        <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                          >emoji_events</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold group-hover:text-primary transition-colors"
                      >
                        Winter Invitational Trophy
                      </span>
                      <div class="flex items-center gap-space-xs mt-0.5">
                        <span
                          class="px-1.5 py-0.5 rounded text-[11px] font-semibold bg-surface-container-highest text-outline tracking-wide uppercase font-label-badge"
                        >
                          Tournament
                        </span>
                        <span class="text-outline text-body-sm font-body-sm"
                          >• Archived Record</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                        >Dec 20, 2024</span
                      >
                      <span class="font-body-sm text-body-sm text-outline">Concluded</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-xs text-on-surface">
                      <span
                        class="material-symbols-outlined text-[16px] text-outline"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span>Club Hall A</span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-1">
                      <div
                        class="flex items-center justify-between font-label-numeric-md text-label-numeric-md"
                      >
                        <span class="text-on-surface"
                          >64 <span class="text-outline font-normal">/ 64</span></span
                        >
                        <span class="text-outline">100%</span>
                      </div>
                      <div
                        class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden"
                      >
                        <div class="h-full bg-outline rounded-full" style="width: 100%"></div>
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <span
                      class="inline-flex items-center gap-1.5 px-2 py-0.5 rounded-full font-label-badge text-label-badge bg-surface-container-highest text-outline"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-outline"></span>
                      Completed
                    </span>
                  </td>
                  <td class="py-space-sm px-space-md text-right">
                    <div class="flex items-center justify-end gap-space-xs">
                      <button
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="View Archive"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >history</span
                        >
                      </button>
                      <button
                        class="p-1 rounded hover:bg-surface-container-highest text-on-surface-variant hover:text-on-surface transition-colors"
                        title="Download Crosstable"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >table_chart</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
          <!-- Pagination & Metrics Footer -->
          <div
            class="p-space-md bg-surface-container-lowest flex flex-col sm:flex-row items-center justify-between gap-space-md"
          >
            <div class="flex items-center gap-space-sm text-outline font-body-sm text-body-sm">
              <span
                >Showing <strong class="text-on-surface font-semibold">1-5</strong> of
                <strong class="text-on-surface font-semibold">18</strong> events</span
              >
              <div class="h-4 w-px bg-surface-container-highest mx-space-xs"></div>
              <span>Selected: <span class="text-primary font-medium">None</span></span>
            </div>
            <!-- Pagination Buttons -->
            <div class="flex items-center gap-space-xs">
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center text-outline/50 bg-surface-container-low cursor-not-allowed"
                disabled
                type="button"
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
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
                class="w-8 h-8 rounded-lg flex items-center justify-center font-label-numeric-md text-label-numeric-md text-on-surface hover:bg-surface-container-high transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                2
              </button>
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center font-label-numeric-md text-label-numeric-md text-on-surface hover:bg-surface-container-high transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                3
              </button>
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center font-label-numeric-md text-label-numeric-md text-on-surface hover:bg-surface-container-high transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                4
              </button>
              <button
                class="w-8 h-8 rounded-lg flex items-center justify-center text-outline hover:text-on-surface bg-surface-container-low hover:bg-surface-container-high transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >chevron_right</span
                >
              </button>
            </div>
          </div>
        </div>
        <!-- Arbiter Operations Quick Bar -->
        <div
          class="mt-space-lg p-space-md rounded-xl bg-surface-container-low flex flex-col md:flex-row md:items-center justify-between gap-space-md"
        >
          <div class="flex items-center gap-space-md">
            <div
              class="w-10 h-10 rounded-lg bg-surface-container flex items-center justify-center text-primary"
            >
              <span class="material-symbols-outlined text-[22px]" aria-hidden="true">gavel</span>
            </div>
            <div class="flex flex-col">
              <span class="font-title-md text-title-md text-on-surface font-semibold"
                >Live Pairing Arbitration Engine</span
              >
              <span class="font-body-sm text-body-sm text-outline"
                >FIDE JaVaFo 2.3 pairing protocol active for next round dispatch.</span
              >
            </div>
          </div>
          <div class="flex items-center gap-space-sm">
            <button
              class="px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-variant text-on-surface font-title-md text-title-md transition-colors"
              type="button"
              disabled
              title="Design preview"
            >
              Run Swiss Sanity Check
            </button>
            <button
              class="px-space-md py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md font-semibold hover:bg-primary-fixed transition-colors"
              type="button"
              disabled
              title="Design preview"
            >
              Open Board Broadcast
            </button>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
