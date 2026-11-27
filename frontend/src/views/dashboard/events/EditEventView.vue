<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Status Banner (Warning & Impact Alert) -->
        <div
          class="relative overflow-hidden rounded-xl bg-surface-container-low p-space-md shadow-md mb-space-lg"
        >
          <div class="absolute inset-y-0 left-0 w-1.5 bg-primary"></div>
          <div
            class="flex flex-col md:flex-row md:items-center justify-between gap-space-md pl-space-xs"
          >
            <div class="flex items-center gap-space-md min-w-0">
              <div
                class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center shrink-0"
              >
                <span class="material-symbols-outlined text-primary text-[24px]" aria-hidden="true"
                  >verified</span
                >
              </div>
              <div class="flex flex-col min-w-0">
                <div class="flex items-center gap-space-sm flex-wrap">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Status:</span
                  >
                  <span
                    class="px-space-sm py-0.5 rounded-full bg-secondary-container text-secondary font-label-badge text-label-badge tracking-wider font-semibold"
                    >Published</span
                  >
                  <span class="w-1.5 h-1.5 rounded-full bg-outline"></span>
                  <span class="font-title-md text-title-md text-on-surface truncate"
                    >Spring Swiss Championship 2025</span
                  >
                </div>
                <p class="font-body-md text-body-md text-on-surface-variant mt-0.5 truncate">
                  48 registered competitors will receive an automated dispatch if schedule, time
                  controls, or venue parameters are altered.
                </p>
              </div>
            </div>
            <div class="flex items-center gap-space-sm shrink-0">
              <span class="font-label-numeric-md text-label-numeric-md text-outline"
                >Last sync: 4m ago</span
              >
              <button
                class="px-space-md py-space-xs rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface font-title-md text-title-md transition-colors flex items-center gap-space-xs"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >history</span
                >
                <span>Audit Log</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Main Asymmetric Layout: Form (Left) vs Sidebar Intel (Right) -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-xl items-start">
          <!-- Left Column: Master Form Inputs -->
          <div class="lg:col-span-8 flex flex-col gap-space-lg min-w-0">
            <!-- Primary Core Specs Card -->
            <div
              class="dashboard-panel flex flex-col gap-space-lg p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >tune</span
                  >
                  <span class="font-title-md text-title-md text-on-surface uppercase tracking-wider"
                    >Tournament Identity &amp; Classification</span
                  >
                </div>
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >REF-ID: EV-2025-SWISS-04</span
                >
              </div>
              <!-- Title & Category Grid -->
              <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md">
                <div class="md:col-span-2 flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface">Event Title</label>
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-title-md text-title-md placeholder-outline outline-none shadow-sm focus:ring-1 focus:ring-primary"
                      type="text"
                      value="Spring Swiss Championship 2025"
                    />
                    <span
                      class="absolute right-space-md top-1/2 -translate-y-1/2 material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >edit</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface">Category</label>
                  <div class="relative">
                    <select
                      class="w-full appearance-none bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-body-md text-body-md outline-none cursor-pointer"
                    >
                      <option selected value="tournament">Tournament (FIDE Rated)</option>
                      <option value="workshop">Tactical Workshop</option>
                      <option value="simul">Grandmaster Simul</option>
                      <option value="casual">Club Rapid Social</option>
                    </select>
                    <span
                      class="absolute right-space-md top-1/2 -translate-y-1/2 pointer-events-none material-symbols-outlined text-outline text-[20px]"
                      aria-hidden="true"
                      >arrow_drop_down</span
                    >
                  </div>
                </div>
              </div>
              <!-- Current Cover Image Box -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label class="font-title-md text-title-md text-on-surface"
                    >Cover Visual Canvas</label
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Aspect 16:9 • High-Fidelity Render</span
                  >
                </div>
                <div class="relative rounded-xl overflow-hidden bg-surface-container group h-64">
                  <img
                    class="w-full h-full object-cover object-center filter brightness-90 group-hover:scale-[1.01] transition-transform duration-500"
                    data-alt="Dramatic overhead angle of a master chess board with handcrafted wooden pieces during a high-stakes championship game. Moody studio lighting cast across the vinyl squares, deep obsidian blacks and organic verdant accents, capturing intense tactical concentration and precision craftsmanship."
                    src="/images/55be056503ee.webp"
                    alt=""
                  />
                  <div
                    class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest/90 via-surface-container-lowest/30 to-transparent flex flex-col justify-end p-space-md"
                  >
                    <div class="flex flex-wrap items-center justify-between gap-space-sm">
                      <div
                        class="flex items-center gap-space-xs px-space-sm py-1 rounded bg-surface-container-lowest/80 backdrop-blur-md"
                      >
                        <span
                          class="material-symbols-outlined text-primary text-[16px]"
                          aria-hidden="true"
                          >photo_camera</span
                        >
                        <span class="font-label-badge text-label-badge text-on-surface [overflow-wrap:anywhere]"
                          >spring_swiss_banner_2025_hdr.png</span
                        >
                      </div>
                      <div class="flex flex-wrap items-center gap-space-xs">
                        <button
                          class="px-space-md py-space-xs rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md flex items-center gap-space-xs shadow transition-colors"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >upload_file</span
                          >
                          <span>Replace Cover</span>
                        </button>
                        <button
                          class="px-space-sm py-space-xs rounded-lg bg-error-container hover:bg-on-error text-on-error-container font-title-md text-title-md flex items-center gap-space-xs transition-colors"
                          type="button"
                          disabled
                          title="Design preview"
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >delete</span
                          >
                          <span>Remove</span>
                        </button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!-- Description Rich Text -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label class="font-title-md text-title-md text-on-surface"
                    >Tournament Regulations &amp; Match Schedule</label
                  >
                  <div
                    class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >markdown</span
                    >
                    <span>Markdown Enabled</span>
                  </div>
                </div>
                <div class="flex flex-col rounded-lg bg-surface-container overflow-hidden">
                  <div
                    class="flex items-center gap-space-xs px-space-md py-space-xs bg-surface-container-high text-outline"
                  >
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Bold"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >format_bold</span
                      >
                    </button>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Italic"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >format_italic</span
                      >
                    </button>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="List"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >format_list_bulleted</span
                      >
                    </button>
                    <div class="w-px h-4 bg-outline-variant mx-space-xs"></div>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Time Controls"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >timer</span
                      >
                    </button>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="FIDE Pairing Table"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >table_chart</span
                      >
                    </button>
                  </div>
                  <textarea
                    class="w-full bg-transparent px-space-md py-space-sm text-on-surface font-body-md text-body-md outline-none resize-y leading-relaxed"
                    rows="6"
                  >
### FIDE Rated 5-Round Swiss System
Time Control: 45 min + 15 sec increment per move from move 1.
Default time: 15 minutes forfeiting grace period.

**Round 1:** 10:00 UTC
**Round 2:** 11:45 UTC
**Lunch Interval:** 13:00 - 14:00 UTC
**Round 3:** 14:00 UTC
**Round 4:** 15:45 UTC
**Round 5 &amp; Awards:** 17:30 UTC

Arbiter panel: GM #1440 (Chief Arbiter), IA Viktor Vance. Strict zero-tolerance digital device policy in the playing hall.</textarea>
                </div>
              </div>
            </div>
            <!-- Schedule, Capacity & Logistics Grid -->
            <div
              class="dashboard-panel flex flex-col gap-space-lg p-space-lg"
            >
              <div class="flex items-center gap-space-sm pb-space-xs">
                <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                  >calendar_clock</span
                >
                <span class="font-title-md text-title-md text-on-surface uppercase tracking-wider"
                  >Temporal &amp; Spatial Parameters</span
                >
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <!-- Start Date -->
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface"
                    >Start Timestamp (UTC)</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-label-numeric-md text-label-numeric-md outline-none"
                      type="text"
                      value="2025-04-26 10:00 UTC"
                    />
                    <span
                      class="absolute right-space-md top-1/2 -translate-y-1/2 material-symbols-outlined text-primary text-[20px]"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                  </div>
                </div>
                <!-- End Date -->
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface"
                    >Conclusion Timestamp (UTC)</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-label-numeric-md text-label-numeric-md outline-none"
                      type="text"
                      value="2025-04-26 19:00 UTC"
                    />
                    <span
                      class="absolute right-space-md top-1/2 -translate-y-1/2 material-symbols-outlined text-outline text-[20px]"
                      aria-hidden="true"
                      >event_repeat</span
                    >
                  </div>
                </div>
                <!-- Venue Selection -->
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface"
                    >Playing Venue / Hall</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-body-md text-body-md outline-none"
                      type="text"
                      value="Main Club Lounge"
                    />
                    <span
                      class="absolute right-space-md top-1/2 -translate-y-1/2 material-symbols-outlined text-outline text-[20px]"
                      aria-hidden="true"
                      >location_on</span
                    >
                  </div>
                </div>
                <!-- Registration Deadline -->
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface"
                    >Roster Lock Deadline (UTC)</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-label-numeric-md text-label-numeric-md outline-none"
                      type="text"
                      value="2025-04-24 23:59 UTC"
                    />
                    <span
                      class="absolute right-space-md top-1/2 -translate-y-1/2 material-symbols-outlined text-error text-[20px]"
                      aria-hidden="true"
                      >alarm</span
                    >
                  </div>
                </div>
              </div>
              <!-- Capacity Gauge & Input -->
              <div
                class="rounded-lg bg-surface-container p-space-md flex flex-col md:flex-row items-center justify-between gap-space-md"
              >
                <div class="flex flex-col gap-1 w-full md:w-2/3">
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface font-semibold">Live Quota Saturation</span>
                    <span class="text-primary font-label-numeric-md text-label-numeric-md"
                      >48 / 64 Boards Booked (75%)</span
                    >
                  </div>
                  <!-- Progress Track -->
                  <div
                    class="w-full h-2.5 rounded-full bg-surface-container-high overflow-hidden mt-1"
                  >
                    <div
                      class="h-full bg-primary rounded-full transition-all duration-700"
                      style="width: 75%"
                    ></div>
                  </div>
                  <span class="text-outline font-body-sm text-body-sm mt-1"
                    >16 Open Swiss Pairings slots remaining before waitlist queue kicks in.</span
                  >
                </div>
                <div class="flex items-center gap-space-sm shrink-0 w-full md:w-auto justify-end">
                  <div class="flex flex-col gap-space-xs">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      >Player Limit</label
                    >
                    <input
                      class="w-28 bg-surface-container-high rounded-lg px-space-md py-space-xs text-on-surface font-label-numeric-lg text-label-numeric-lg text-center outline-none"
                      type="number"
                      value="64"
                    />
                  </div>
                </div>
              </div>
              <!-- Publication Status Tri-State Toggle -->
              <div class="flex flex-col gap-space-sm pt-space-xs">
                <label class="font-title-md text-title-md text-on-surface"
                  >Lifecycle &amp; Visibility State</label
                >
                <div class="grid grid-cols-3 gap-space-sm p-1 rounded-xl bg-surface-container">
                  <button
                    class="py-space-sm px-space-md rounded-lg bg-surface-container-high text-primary font-title-md text-title-md flex items-center justify-center gap-space-xs shadow transition-all"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="w-2.5 h-2.5 rounded-full bg-primary animate-pulse"></span>
                    <span>Published</span>
                  </button>
                  <button
                    class="py-space-sm px-space-md rounded-lg text-outline hover:text-on-surface font-title-md text-title-md flex items-center justify-center gap-space-xs transition-all"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="w-2.5 h-2.5 rounded-full bg-outline"></span>
                    <span>Draft</span>
                  </button>
                  <button
                    class="py-space-sm px-space-md rounded-lg text-outline hover:text-error font-title-md text-title-md flex items-center justify-center gap-space-xs transition-all"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="w-2.5 h-2.5 rounded-full bg-error"></span>
                    <span>Cancelled</span>
                  </button>
                </div>
              </div>
            </div>
            <!-- Action Footer Toolbar -->
            <div
              class="flex flex-col sm:flex-row items-center justify-between gap-space-md p-space-md rounded-xl bg-surface-container-low shadow-md"
            >
              <div class="flex items-center gap-space-sm text-outline font-body-sm text-body-sm">
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >lock_reset</span
                >
                <span>Automatic rollback snapshot available in revision history</span>
              </div>
              <div class="flex items-center gap-space-sm w-full sm:w-auto justify-end">
                <button
                  class="px-space-lg py-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface font-title-md text-title-md transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Cancel
                </button>
                <button
                  class="px-space-xl py-space-sm rounded-lg bg-primary hover:bg-primary-fixed-dim text-on-primary font-title-md text-title-md flex items-center gap-space-xs shadow-md font-bold transition-transform active:scale-95"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true">save</span>
                  <span>Save Changes</span>
                </button>
              </div>
            </div>
          </div>
          <!-- Right Column: Player Broadcast & Destruction Controls -->
          <div class="lg:col-span-4 flex flex-col gap-space-lg min-w-0">
            <!-- Registered Players Roster & Broadcast Card -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-secondary text-[22px]"
                    aria-hidden="true"
                    >groups</span
                  >
                  <span class="font-title-md text-title-md text-on-surface">Registered Field</span>
                </div>
                <span
                  class="px-space-sm py-0.5 rounded-full bg-surface-container-high font-label-numeric-md text-label-numeric-md text-primary font-bold"
                  >48 Active</span
                >
              </div>
              <!-- Notification Trigger Box -->
              <div class="rounded-xl bg-surface-container p-space-md flex flex-col gap-space-sm">
                <label class="flex items-start gap-space-sm cursor-pointer select-none">
                  <input
                    checked
                    class="mt-1 w-4 h-4 rounded accent-primary bg-surface-container-high cursor-pointer"
                    type="checkbox"
                  />
                  <span class="font-body-md text-body-md text-on-surface leading-snug">
                    Dispatch automated update email &amp; in-app alert to all 48 registered players
                    upon saving.
                  </span>
                </label>
                <div
                  class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm pl-6"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >forward_to_inbox</span
                  >
                  <span>Includes modified schedule calendar invite (.ics)</span>
                </div>
              </div>
              <!-- Scrollable High-Density Seeded Player Preview List -->
              <div class="flex flex-col gap-space-xs">
                <div
                  class="flex items-center justify-between text-outline font-label-badge text-label-badge uppercase tracking-wider pb-1"
                >
                  <span>Top Seed Participants</span>
                  <span>Rating</span>
                </div>
                <div class="flex flex-col gap-1 max-h-72 overflow-y-auto pr-1">
                  <!-- Player Row 1 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded-lg hover:bg-surface-container transition-colors"
                  >
                    <div class="flex items-center gap-space-sm min-w-0">
                      <span
                        class="px-1.5 py-0.5 rounded bg-surface-container-highest font-label-badge text-label-badge text-primary font-bold"
                        >GM</span
                      >
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >Levon Petrosian</span
                      >
                    </div>
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-secondary font-semibold"
                      >2645</span
                    >
                  </div>
                  <!-- Player Row 2 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded-lg hover:bg-surface-container transition-colors"
                  >
                    <div class="flex items-center gap-space-sm min-w-0">
                      <span
                        class="px-1.5 py-0.5 rounded bg-surface-container-highest font-label-badge text-label-badge text-primary font-bold"
                        >GM</span
                      >
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >Alexei Dubrov</span
                      >
                    </div>
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-secondary font-semibold"
                      >2590</span
                    >
                  </div>
                  <!-- Player Row 3 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded-lg hover:bg-surface-container transition-colors"
                  >
                    <div class="flex items-center gap-space-sm min-w-0">
                      <span
                        class="px-1.5 py-0.5 rounded bg-surface-container-highest font-label-badge text-label-badge text-outline font-bold"
                        >IM</span
                      >
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >Elena Rostova</span
                      >
                    </div>
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >2418</span
                    >
                  </div>
                  <!-- Player Row 4 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded-lg hover:bg-surface-container transition-colors"
                  >
                    <div class="flex items-center gap-space-sm min-w-0">
                      <span
                        class="px-1.5 py-0.5 rounded bg-surface-container-highest font-label-badge text-label-badge text-outline font-bold"
                        >IM</span
                      >
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >Marcus Vance</span
                      >
                    </div>
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >2380</span
                    >
                  </div>
                  <!-- Player Row 5 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded-lg hover:bg-surface-container transition-colors"
                  >
                    <div class="flex items-center gap-space-sm min-w-0">
                      <span
                        class="px-1.5 py-0.5 rounded bg-surface-container-highest font-label-badge text-label-badge text-outline-variant font-bold"
                        >FM</span
                      >
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >Tobias Lindqvist</span
                      >
                    </div>
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >2294</span
                    >
                  </div>
                  <!-- Player Row 6 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded-lg hover:bg-surface-container transition-colors"
                  >
                    <div class="flex items-center gap-space-sm min-w-0">
                      <span
                        class="px-1.5 py-0.5 rounded bg-surface-container-highest font-label-badge text-label-badge text-outline-variant font-bold"
                        >WFM</span
                      >
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >Amina Al-Mansoor</span
                      >
                    </div>
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                      >2210</span
                    >
                  </div>
                </div>
              </div>
              <button
                class="w-full py-space-xs rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface font-body-sm text-body-sm flex items-center justify-center gap-space-xs transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                <span>Inspect Full Roster (48 Competitors)</span>
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >chevron_right</span
                >
              </button>
            </div>
            <!-- Quick Tournament Summary Metrics -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <span class="font-title-md text-title-md text-on-surface">Arbitration Specs</span>
              <div class="grid grid-cols-2 gap-space-sm">
                <div class="p-space-sm rounded-lg bg-surface-container flex flex-col">
                  <span class="font-label-badge text-label-badge text-outline uppercase"
                    >Format</span
                  >
                  <span class="font-title-md text-title-md text-on-surface font-semibold"
                    >5 Rds Swiss</span
                  >
                </div>
                <div class="p-space-sm rounded-lg bg-surface-container flex flex-col">
                  <span class="font-label-badge text-label-badge text-outline uppercase"
                    >Avg Rating</span
                  >
                  <span class="font-label-numeric-lg text-label-numeric-lg text-secondary"
                    >2184</span
                  >
                </div>
                <div class="p-space-sm rounded-lg bg-surface-container flex flex-col">
                  <span class="font-label-badge text-label-badge text-outline uppercase"
                    >Tiebreak</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface mt-0.5"
                    >Buchholz (Cut 1)</span
                  >
                </div>
                <div class="p-space-sm rounded-lg bg-surface-container flex flex-col">
                  <span class="font-label-badge text-label-badge text-outline uppercase"
                    >Clock Engine</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface mt-0.5"
                    >DGT e-Boards 650</span
                  >
                </div>
              </div>
            </div>
            <!-- Danger Zone Card -->
            <div
              class="rounded-xl bg-surface-container-lowest p-space-lg shadow-md flex flex-col gap-space-md"
            >
              <div class="flex items-center gap-space-sm text-error">
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >warning</span
                >
                <span class="font-title-md text-title-md font-bold uppercase tracking-wider"
                  >Danger Zone</span
                >
              </div>
              <p class="font-body-sm text-body-sm text-on-surface-variant leading-relaxed">
                Cancelling this event immediately closes registrations, disbands pairings, issues
                refund tickets to 48 players, and marks FIDE ratings batch void.
              </p>
              <button
                class="w-full py-space-sm rounded-lg bg-error-container hover:bg-error text-on-error-container hover:text-on-error font-title-md text-title-md font-semibold flex items-center justify-center gap-space-xs transition-colors shadow"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >event_busy</span
                >
                <span>Cancel Event</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Cancellation Modal Dialogue (Toggled via JS) -->
        <div
          class="hidden fixed inset-0 z-50 flex items-center justify-center p-space-md bg-surface-dim/80 backdrop-blur-md"
          id="cancel-event-modal"
        >
          <div
            class="w-full max-w-lg rounded-xl bg-surface-container-low p-space-xl shadow-2xl flex flex-col gap-space-lg animate-in fade-in zoom-in-95 duration-200"
          >
            <div class="flex items-center gap-space-md">
              <div
                class="w-12 h-12 rounded-xl bg-error-container text-on-error-container flex items-center justify-center shrink-0"
              >
                <span class="material-symbols-outlined text-[28px]" aria-hidden="true"
                  >crisis_alert</span
                >
              </div>
              <div class="flex flex-col min-w-0">
                <h3 class="font-headline-sm text-headline-sm text-on-surface font-bold">
                  Irreversible Event Cancellation
                </h3>
                <span class="font-body-sm text-body-sm text-error"
                  >Spring Swiss Championship 2025</span
                >
              </div>
            </div>
            <div
              class="flex flex-col gap-space-sm text-on-surface-variant font-body-md text-body-md"
            >
              <p>
                You are about to terminate this official tournament. All pairings will be
                permanently deleted and the following automated protocols will fire immediately:
              </p>
              <ul
                class="list-disc list-inside space-y-1 text-on-surface font-body-sm text-body-sm pl-space-xs"
              >
                <li>Forfeit notifications dispatched to 48 entrants via email and push</li>
                <li>Reversal of $2,400 registration pool back to participant accounts</li>
                <li>FIDE pairing server authorization release</li>
              </ul>
            </div>
            <div class="flex flex-col gap-space-xs">
              <label class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Type "CANCEL" to authenticate</label
              >
              <input
                class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-error font-label-numeric-md text-label-numeric-md outline-none"
                id="confirm-input"
                placeholder="CANCEL"
                type="text"
              />
            </div>
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface font-title-md text-title-md transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Abort Action
              </button>
              <button
                class="px-space-lg py-space-sm rounded-lg bg-error text-on-error font-title-md text-title-md font-bold flex items-center gap-space-xs hover:opacity-90 transition-opacity"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >delete_forever</span
                >
                <span>Confirm Termination</span>
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
