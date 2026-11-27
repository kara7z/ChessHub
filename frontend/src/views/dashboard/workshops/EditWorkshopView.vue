<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-16">
        <!-- Status & Sync Notice Banner -->
        <div
          class="mb-space-lg flex items-center justify-between bg-surface-container-high px-space-lg py-space-sm rounded-xl shadow-sm"
        >
          <div class="flex items-center gap-space-md">
            <div
              class="flex items-center gap-space-xs bg-primary-container/20 text-primary px-space-sm py-0.5 rounded-full font-label-badge text-label-badge uppercase tracking-wider"
            >
              <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
              Published
            </div>
            <p class="font-body-sm text-body-sm text-on-surface-variant">
              Status: <span class="text-on-surface font-semibold">Live &amp; Active</span> ·
              <span class="text-primary font-semibold">14 enrolled members</span> will receive
              real-time dispatch if schedule or physical board allocation shifts.
            </p>
          </div>
          <div class="flex items-center gap-space-sm text-outline font-body-sm text-body-sm">
            <span class="material-symbols-outlined text-[16px] text-secondary" aria-hidden="true"
              >sync_saved_locally</span
            >
            <span class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
              >Sync ID: #WS-8842-NAJ</span
            >
          </div>
        </div>
        <!-- Primary Page Header Block -->
        <div
          class="flex flex-col md:flex-row md:items-end justify-between gap-space-md mb-space-xl"
        >
          <div class="space-y-space-xs">
            <div
              class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm mb-space-xs"
            >
              <span>Workshops</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-on-surface-variant truncate max-w-xs"
                >Mastering the Sicilian Najdorf</span
              >
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-primary font-semibold">Edit Workshop</span>
            </div>
            <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
              Edit Workshop — Mastering the Sicilian Najdorf
            </h1>
            <p class="font-body-md text-body-md text-on-surface-variant max-w-3xl">
              Modify tactical syllabus, master clock timings, grandmaster assignment parameters, and
              sensory board seating capacity.
            </p>
          </div>
          <div class="flex items-center gap-space-sm shrink-0">
            <span
              class="px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface hover:bg-surface-container-high transition-colors font-title-md text-title-md flex items-center gap-space-xs shadow-sm"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >visibility</span
              >
              Live Preview
            </span>
            <button
              class="px-space-lg py-space-sm rounded-lg bg-primary-container hover:bg-primary text-on-primary-container transition-colors font-title-md text-title-md flex items-center gap-space-xs shadow-md"
              form="edit-workshop-form"
              type="submit"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true">save</span>
              Save Changes
            </button>
          </div>
        </div>
        <!-- Main Asymmetric 2-Column Editing Grid -->
        <div class="grid grid-cols-12 gap-gutter-desktop">
          <!-- LEFT COLUMN: Core Syllabus & Configuration Form (8 Columns) -->
          <div class="col-span-12 lg:col-span-8 flex flex-col gap-space-lg">
            <form class="flex flex-col gap-space-lg" id="edit-workshop-form" @submit.prevent="">
              <!-- Panel 1: Curriculum & Instructorship -->
              <section
                class="dashboard-panel flex flex-col gap-space-md p-space-lg"
              >
                <div class="flex items-center justify-between pb-space-xs">
                  <div class="flex items-center gap-space-sm">
                    <span
                      class="material-symbols-outlined text-primary text-[22px]"
                      aria-hidden="true"
                      >menu_book</span
                    >
                    <h2 class="font-headline-sm text-headline-sm text-on-surface">
                      Curriculum &amp; Arbiter Master
                    </h2>
                  </div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Section 01</span
                  >
                </div>
                <div class="flex flex-col gap-space-sm">
                  <label class="font-title-md text-title-md text-on-surface" for="workshop-title"
                    >Workshop Title</label
                  >
                  <input
                    class="w-full bg-surface-container-lowest px-space-md py-space-sm rounded-lg text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary shadow-inner"
                    id="workshop-title"
                    type="text"
                    value="Mastering the Sicilian Najdorf: Modern Repertoire for Black"
                  />
                </div>
                <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md">
                  <div class="flex flex-col gap-space-sm">
                    <label
                      class="font-title-md text-title-md text-on-surface"
                      for="workshop-instructor"
                      >Lead Instructor</label
                    >
                    <div class="relative">
                      <select
                        class="w-full appearance-none bg-surface-container-lowest px-space-md py-space-sm rounded-lg text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary"
                        id="workshop-instructor"
                      >
                        <option selected>GM Tariq Al-Mansoor (2618)</option>
                        <option>GM Elena Rostova (2540)</option>
                        <option>IM Viktor Vance (2445)</option>
                        <option>FM Sarah Chen (2320)</option>
                      </select>
                      <span
                        class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[20px]"
                        aria-hidden="true"
                        >expand_more</span
                      >
                    </div>
                  </div>
                  <div class="flex flex-col gap-space-sm">
                    <label
                      class="font-title-md text-title-md text-on-surface"
                      for="workshop-category"
                      >Discipline / Category</label
                    >
                    <div class="relative">
                      <select
                        class="w-full appearance-none bg-surface-container-lowest px-space-md py-space-sm rounded-lg text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary"
                        id="workshop-category"
                      >
                        <option selected>Opening Repertoire</option>
                        <option>Endgame Technique</option>
                        <option>Positional Calculation</option>
                        <option>Dynamic Pawn Structures</option>
                      </select>
                      <span
                        class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[20px]"
                        aria-hidden="true"
                        >expand_more</span
                      >
                    </div>
                  </div>
                  <div class="flex flex-col gap-space-sm">
                    <label
                      class="font-title-md text-title-md text-on-surface"
                      for="workshop-difficulty"
                      >Target Rating Tier</label
                    >
                    <div class="relative">
                      <select
                        class="w-full appearance-none bg-surface-container-lowest px-space-md py-space-sm rounded-lg text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary"
                        id="workshop-difficulty"
                      >
                        <option>Club Intermediate (1500–1800)</option>
                        <option selected>Advanced Masters (1900–2300)</option>
                        <option>Elite Invitational (2300+)</option>
                      </select>
                      <span
                        class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[20px]"
                        aria-hidden="true"
                        >expand_more</span
                      >
                    </div>
                  </div>
                </div>
                <div class="flex flex-col gap-space-sm">
                  <div class="flex items-center justify-between">
                    <label class="font-title-md text-title-md text-on-surface" for="workshop-desc"
                      >Syllabus &amp; Structural Breakdown</label
                    >
                    <span class="font-body-sm text-body-sm text-outline">Markdown supported</span>
                  </div>
                  <textarea
                    class="w-full bg-surface-container-lowest p-space-md rounded-lg text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary leading-relaxed shadow-inner"
                    id="workshop-desc"
                    rows="6"
                  >
### Intensive Study Breakdown
- 15:00 - 15:50: Confronting the English Attack (6.Be3 e5 7.Nb3 Be6 8.f3 h5!). Key critical lines and positional trade-offs against immediate queenside pawn storms.
- 16:00 - 16:50: Classical 6.Bg5 &amp; The Poisoned Pawn Complex (6...e6 7.f4 Qb6). Deep engine-validated preparation using Stockfish 17 depths.
- 17:00 - 18:00: Live Sensory Board sparring on Room Alpha's DGT arrays with real-time arbiter evaluation &amp; tactical retrospective.</textarea>
                </div>
              </section>
              <!-- Panel 2: Multimedia & Imagery -->
              <section
                class="dashboard-panel flex flex-col gap-space-md p-space-lg"
              >
                <div class="flex items-center justify-between">
                  <div class="flex items-center gap-space-sm">
                    <span
                      class="material-symbols-outlined text-primary text-[22px]"
                      aria-hidden="true"
                      >image</span
                    >
                    <h2 class="font-headline-sm text-headline-sm text-on-surface">
                      Cover Visual &amp; Media Banner
                    </h2>
                  </div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Section 02</span
                  >
                </div>
                <div
                  class="flex flex-col sm:flex-row items-center gap-space-lg bg-surface-container-lowest p-space-md rounded-xl"
                >
                  <div
                    class="relative w-full sm:w-64 h-36 rounded-lg overflow-hidden shrink-0 shadow-inner"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Close up dramatic macro photograph of handcrafted obsidian and marble chess pieces positioned on a dark championship wooden chessboard. The black King and Queen stand sharply in focus with gentle moody studio rim lighting from the side, evoking precision, focus, and analytical mastery in dark green and charcoal tones."
                      src="/images/5f1abf0d6d49.webp"
                      alt=""
                    />
                    <div
                      class="absolute bottom-2 left-2 bg-surface-container-lowest/80 backdrop-blur-md px-2 py-0.5 rounded text-[10px] font-label-badge uppercase text-primary tracking-wider"
                    >
                      1920 × 1080 · 420 KB
                    </div>
                  </div>
                  <div class="flex flex-col justify-center gap-space-sm w-full">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >Hero Board Photography</span
                      >
                      <span class="font-body-sm text-body-sm text-on-surface-variant"
                        >Recommended format: WebP, PNG or JPG (16:9 ratio, min 1280×720px)</span
                      >
                    </div>
                    <div class="flex flex-wrap items-center gap-space-sm pt-space-xs">
                      <button
                        class="px-space-md py-space-xs rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface transition-colors font-body-md text-body-md flex items-center gap-space-xs"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >cached</span
                        >
                        Replace Photo
                      </button>
                      <button
                        class="px-space-md py-space-xs rounded-lg bg-error-container/20 hover:bg-error-container/40 text-error transition-colors font-body-md text-body-md flex items-center gap-space-xs"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >delete_sweep</span
                        >
                        Remove
                      </button>
                    </div>
                  </div>
                </div>
              </section>
              <!-- Panel 3: Chronometry, Seating & Logistics -->
              <section
                class="dashboard-panel flex flex-col gap-space-md p-space-lg"
              >
                <div class="flex items-center justify-between pb-space-xs">
                  <div class="flex items-center gap-space-sm">
                    <span
                      class="material-symbols-outlined text-primary text-[22px]"
                      aria-hidden="true"
                      >timer</span
                    >
                    <h2 class="font-headline-sm text-headline-sm text-on-surface">
                      Session Timing, Location &amp; Seating
                    </h2>
                  </div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Section 03</span
                  >
                </div>
                <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                  <div class="flex flex-col gap-space-sm">
                    <label class="font-title-md text-title-md text-on-surface" for="ws-start-time"
                      >Scheduled Start (UTC)</label
                    >
                    <div
                      class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg focus-within:ring-1 focus-within:ring-primary"
                    >
                      <span
                        class="material-symbols-outlined text-outline text-[18px] mr-space-sm"
                        aria-hidden="true"
                        >calendar_month</span
                      >
                      <input
                        class="bg-transparent text-on-surface font-label-numeric-md text-label-numeric-md w-full focus:outline-none"
                        id="ws-start-time"
                        type="text"
                        value="2025-05-10 15:00 UTC"
                      />
                    </div>
                  </div>
                  <div class="flex flex-col gap-space-sm">
                    <label class="font-title-md text-title-md text-on-surface" for="ws-duration"
                      >Duration &amp; Clock Allocation</label
                    >
                    <div
                      class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg focus-within:ring-1 focus-within:ring-primary"
                    >
                      <span
                        class="material-symbols-outlined text-outline text-[18px] mr-space-sm"
                        aria-hidden="true"
                        >hourglass_top</span
                      >
                      <input
                        class="bg-transparent text-on-surface font-label-numeric-md text-label-numeric-md w-full focus:outline-none"
                        id="ws-duration"
                        type="text"
                        value="180 Minutes (3.0 Hours)"
                      />
                    </div>
                  </div>
                  <div class="flex flex-col gap-space-sm">
                    <label class="font-title-md text-title-md text-on-surface" for="ws-venue"
                      >Venue / Hardware Setup</label
                    >
                    <div
                      class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg focus-within:ring-1 focus-within:ring-primary"
                    >
                      <span
                        class="material-symbols-outlined text-outline text-[18px] mr-space-sm"
                        aria-hidden="true"
                        >meeting_room</span
                      >
                      <input
                        class="bg-transparent text-on-surface font-body-md text-body-md w-full focus:outline-none"
                        id="ws-venue"
                        type="text"
                        value="Room Alpha &amp; Live Sensory Boards"
                      />
                    </div>
                  </div>
                  <div class="flex flex-col gap-space-sm">
                    <label class="font-title-md text-title-md text-on-surface" for="ws-deadline"
                      >Registration Deadline (UTC)</label
                    >
                    <div
                      class="flex items-center bg-surface-container-lowest px-space-md py-space-sm rounded-lg focus-within:ring-1 focus-within:ring-primary"
                    >
                      <span
                        class="material-symbols-outlined text-outline text-[18px] mr-space-sm"
                        aria-hidden="true"
                        >alarm</span
                      >
                      <input
                        class="bg-transparent text-on-surface font-label-numeric-md text-label-numeric-md w-full focus:outline-none"
                        id="ws-deadline"
                        type="text"
                        value="2025-05-09 18:00 UTC"
                      />
                    </div>
                  </div>
                </div>
                <!-- Capacity Range & Visual Utilization Bar -->
                <div
                  class="bg-surface-container-lowest p-space-md rounded-xl flex flex-col gap-space-sm mt-space-xs"
                >
                  <div class="flex items-center justify-between">
                    <div>
                      <span class="font-title-md text-title-md text-on-surface"
                        >Max Seating Capacity</span
                      >
                      <p class="font-body-sm text-body-sm text-outline">
                        Restricted by physical sensory DGT e-Boards deployed
                      </p>
                    </div>
                    <div class="flex items-center gap-space-xs">
                      <input
                        class="w-16 bg-surface-container px-space-sm py-1 rounded text-center font-label-numeric-lg text-label-numeric-lg text-primary focus:outline-none focus:ring-1 focus:ring-primary"
                        max="32"
                        min="14"
                        type="number"
                        value="18"
                      />
                      <span class="font-body-sm text-body-sm text-on-surface-variant">Seats</span>
                    </div>
                  </div>
                  <!-- Progress Gauge Metric -->
                  <div class="space-y-1">
                    <div
                      class="w-full bg-surface-container-high h-2 rounded-full overflow-hidden flex"
                    >
                      <div
                        class="bg-primary h-full rounded-full transition-all duration-500"
                        style="width: 77.7%"
                      ></div>
                    </div>
                    <div
                      class="flex justify-between font-label-badge text-label-badge text-outline uppercase tracking-wider"
                    >
                      <span>14 Confirmed Enrolled</span>
                      <span class="text-secondary font-semibold"
                        >4 Spots Available (78% Locked)</span
                      >
                    </div>
                  </div>
                </div>
                <!-- State Selection Segmented Toggle -->
                <div class="flex flex-col gap-space-sm pt-space-xs">
                  <label class="font-title-md text-title-md text-on-surface"
                    >Publication Status</label
                  >
                  <div
                    class="grid grid-cols-3 gap-space-sm bg-surface-container-lowest p-1.5 rounded-xl"
                  >
                    <label class="cursor-pointer">
                      <input
                        checked
                        class="peer sr-only"
                        name="pub-status"
                        type="radio"
                        value="published"
                      />
                      <div
                        class="flex items-center justify-center gap-space-xs py-space-sm rounded-lg text-on-surface-variant peer-checked:bg-primary-container peer-checked:text-on-primary-container font-title-md text-title-md transition-colors"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >verified</span
                        >
                        Published
                      </div>
                    </label>
                    <label class="cursor-pointer">
                      <input class="peer sr-only" name="pub-status" type="radio" value="draft" />
                      <div
                        class="flex items-center justify-center gap-space-xs py-space-sm rounded-lg text-on-surface-variant peer-checked:bg-surface-container-highest peer-checked:text-on-surface font-title-md text-title-md transition-colors"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >draft</span
                        >
                        Draft Mode
                      </div>
                    </label>
                    <label class="cursor-pointer">
                      <input
                        class="peer sr-only"
                        name="pub-status"
                        type="radio"
                        value="cancelled"
                      />
                      <div
                        class="flex items-center justify-center gap-space-xs py-space-sm rounded-lg text-on-surface-variant peer-checked:bg-error-container peer-checked:text-on-error-container font-title-md text-title-md transition-colors"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >cancel</span
                        >
                        Cancelled
                      </div>
                    </label>
                  </div>
                </div>
              </section>
              <!-- Form Submission Footer Actions -->
              <div
                class="flex flex-wrap items-center justify-between gap-space-sm pt-space-xs pb-space-lg"
              >
                <span
                  class="px-space-lg py-space-sm rounded-lg bg-surface-container-low hover:bg-surface-container text-on-surface-variant hover:text-on-surface transition-colors font-title-md text-title-md"
                >
                  Discard &amp; Return
                </span>
                <div class="flex items-center gap-space-md">
                  <button
                    class="px-space-md py-space-sm rounded-lg bg-transparent text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Reset Fields
                  </button>
                  <button
                    class="px-space-xl py-space-sm rounded-lg bg-primary-container hover:bg-primary text-on-primary-container font-title-md text-title-md shadow-md transition-all"
                    type="submit"
                    disabled
                    title="Design preview"
                  >
                    Save Changes
                  </button>
                </div>
              </div>
            </form>
          </div>
          <!-- RIGHT COLUMN: Enrolled Roster & Broadcast Controls (4 Columns) -->
          <div class="col-span-12 lg:col-span-4 flex flex-col gap-space-lg">
            <!-- Automated Broadcast Notification Controller -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col gap-space-md shadow-sm"
            >
              <div class="flex items-center gap-space-sm">
                <span
                  class="material-symbols-outlined text-secondary text-[22px]"
                  aria-hidden="true"
                  >outgoing_mail</span
                >
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  Member Notifications
                </h3>
              </div>
              <p class="font-body-sm text-body-sm text-on-surface-variant">
                Control automated telemetry dispatch to active workshop participants upon saving
                modifications.
              </p>
              <label
                class="flex items-start gap-space-md p-space-md rounded-lg bg-surface-container-lowest cursor-pointer"
              >
                <input
                  checked
                  class="mt-1 h-4 w-4 rounded accent-primary bg-surface-container-highest cursor-pointer"
                  type="checkbox"
                />
                <div class="flex flex-col">
                  <span class="font-title-md text-title-md text-on-surface leading-tight"
                    >Send automated update notice</span
                  >
                  <span class="font-body-sm text-body-sm text-outline mt-0.5"
                    >Dispatches push notifications &amp; email alerts to all 14 enrolled learners
                    with updated room/timing telemetry.</span
                  >
                </div>
              </label>
            </div>
            <!-- Enrolled Learners Summary & Roster Preview -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col gap-space-md shadow-sm"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >groups</span
                  >
                  <h3 class="font-headline-sm text-headline-sm text-on-surface">Enrolled Roster</h3>
                </div>
                <span
                  class="font-label-numeric-md text-label-numeric-md bg-surface-container px-space-sm py-0.5 rounded text-primary"
                >
                  14 / 18
                </span>
              </div>
              <!-- Analytical Breakdown Card with mini SVG Sparkline -->
              <div
                class="bg-surface-container-lowest p-space-md rounded-xl flex items-center justify-between"
              >
                <div class="flex flex-col">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Average Club Points</span
                  >
                  <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                    >2048
                    <span class="font-body-sm text-body-sm text-secondary font-normal"
                      >± 84</span
                    ></span
                  >
                </div>
                <!-- Minimalist Sparkline chart indicating rating distribution -->
                <svg class="w-24 h-10 text-primary" fill="none" viewBox="0 0 100 40">
                  <path
                    d="M0 32 L15 28 L30 18 L45 22 L60 8 L75 14 L90 6 L100 12"
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2.5"
                  ></path>
                  <path
                    d="M0 32 L15 28 L30 18 L45 22 L60 8 L75 14 L90 6 L100 12 L100 40 L0 40 Z"
                    fill="currentColor"
                    fill-opacity="0.1"
                  ></path>
                </svg>
              </div>
              <!-- Learner Condensed Table -->
              <div
                class="flex flex-col divide-y divide-surface-container-highest/20 overflow-hidden rounded-lg bg-surface-container-lowest"
              >
                <!-- Learner 1 -->
                <div
                  class="flex items-center justify-between p-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-sm min-w-0">
                    <div
                      class="w-8 h-8 rounded-full bg-secondary-container text-on-secondary-container flex items-center justify-center font-label-badge text-label-badge font-bold shrink-0"
                    >
                      MK
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Mikhail Koltsov</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >FIDE: 2185 · Seat #01</span
                      >
                    </div>
                  </div>
                  <span
                    class="material-symbols-outlined text-[18px] text-secondary"
                    aria-hidden="true"
                    >check_circle</span
                  >
                </div>
                <!-- Learner 2 -->
                <div
                  class="flex items-center justify-between p-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-sm min-w-0">
                    <div
                      class="w-8 h-8 rounded-full bg-surface-container text-on-surface flex items-center justify-center font-label-badge text-label-badge font-bold shrink-0"
                    >
                      JL
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Jun-ho Lim</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >FIDE: 2012 · Seat #02</span
                      >
                    </div>
                  </div>
                  <span
                    class="material-symbols-outlined text-[18px] text-secondary"
                    aria-hidden="true"
                    >check_circle</span
                  >
                </div>
                <!-- Learner 3 -->
                <div
                  class="flex items-center justify-between p-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-sm min-w-0">
                    <div
                      class="w-8 h-8 rounded-full bg-tertiary-container text-on-tertiary-container flex items-center justify-center font-label-badge text-label-badge font-bold shrink-0"
                    >
                      AF
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Ananya Fernandez</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >FIDE: 2095 · Seat #03</span
                      >
                    </div>
                  </div>
                  <span
                    class="material-symbols-outlined text-[18px] text-secondary"
                    aria-hidden="true"
                    >check_circle</span
                  >
                </div>
                <!-- Learner 4 -->
                <div
                  class="flex items-center justify-between p-space-sm hover:bg-surface-container-high transition-colors"
                >
                  <div class="flex items-center gap-space-sm min-w-0">
                    <div
                      class="w-8 h-8 rounded-full bg-surface-container text-on-surface flex items-center justify-center font-label-badge text-label-badge font-bold shrink-0"
                    >
                      DK
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >David Kowalski</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >FIDE: 1940 · Seat #04</span
                      >
                    </div>
                  </div>
                  <span
                    class="material-symbols-outlined text-[18px] text-secondary"
                    aria-hidden="true"
                    >check_circle</span
                  >
                </div>
              </div>
              <button
                class="w-full py-space-xs rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface transition-colors font-title-md text-title-md flex items-center justify-center gap-space-xs"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >list_alt</span
                >
                View All 14 Enrolled Members
              </button>
            </div>
            <!-- Tactical Quick Hardware Status Card -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col gap-space-sm shadow-sm"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-secondary text-[20px]"
                    aria-hidden="true"
                    >sensors</span
                  >
                  <span class="font-title-md text-title-md text-on-surface">DGT Arrays Linked</span>
                </div>
                <span
                  class="font-label-badge text-label-badge text-primary bg-primary/10 px-2 py-0.5 rounded"
                  >All Synced</span
                >
              </div>
              <p class="font-body-sm text-body-sm text-outline">
                9 electronic sensory boards mapped to Room Alpha master server. Clocks
                pre-calibrated to 90 min + 30s increment.
              </p>
            </div>
            <!-- DANGER ZONE CARD: Cancellation & Forfeit Handling -->
            <div
              class="bg-error-container/10 rounded-xl p-space-lg flex flex-col gap-space-md shadow-sm"
            >
              <div class="flex items-center gap-space-sm text-error">
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >warning</span
                >
                <h3 class="font-headline-sm text-headline-sm">Danger Zone</h3>
              </div>
              <div class="space-y-space-xs">
                <p class="font-title-md text-title-md text-on-surface">Cancel Workshop Event</p>
                <p class="font-body-sm text-body-sm text-on-surface-variant leading-relaxed">
                  Cancelling will immediately notify all 14 enrolled grandmaster club learners,
                  automatically credit refund receipts to club accounts, and release sensory boards
                  in Room Alpha.
                </p>
              </div>
              <div
                class="p-space-sm rounded-lg bg-surface-container-lowest text-on-surface-variant font-body-sm text-body-sm space-y-1"
              >
                <div class="flex items-center gap-space-xs text-error">
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >gavel</span
                  >
                  <span class="font-semibold">Arbitration Policy Check</span>
                </div>
                <p class="text-outline text-[11px] leading-tight">
                  Cancellations made within 48 hours of session commencement require Chief Arbiter
                  validation and recorded justification log.
                </p>
              </div>
              <button
                class="w-full py-space-sm rounded-lg bg-error-container/20 hover:bg-error-container/40 text-error font-title-md text-title-md transition-colors flex items-center justify-center gap-space-xs"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >event_busy</span
                >
                Cancel Workshop
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
