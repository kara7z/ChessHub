<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <div class="w-full px-margin-desktop py-space-xl space-y-space-xl">
          <!-- Top Header & Analytical Summary Bento -->
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-lg items-end">
            <div class="lg:col-span-7 space-y-space-xs">
              <div class="flex items-center gap-space-sm">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-primary"
                  >Player Portal</span
                >
                <span class="text-outline">/</span>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-on-surface-variant"
                  >FIDE ID: 8492014</span
                >
              </div>
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                My Events
              </h1>
              <p class="font-body-lg text-body-lg text-on-surface-variant max-w-2xl">
                Manage your active tournament registrations, verify check-in readiness, and review
                your historical classical and rapid event appearances.
              </p>
            </div>
            <!-- Compact Telemetry Strip -->
            <div class="lg:col-span-5 grid grid-cols-3 gap-space-md">
              <div
                class="bg-surface-container rounded-xl p-space-md shadow-md flex flex-col justify-between"
              >
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                  >Upcoming</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-sm">
                  <span
                    class="font-label-numeric-lg text-label-numeric-lg text-primary"
                    id="stat-upcoming-count"
                    >3</span
                  >
                  <span class="font-body-sm text-body-sm text-outline">events</span>
                </div>
              </div>
              <div
                class="bg-surface-container rounded-xl p-space-md shadow-md flex flex-col justify-between"
              >
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                  >Checked In</span
                >
                <div class="flex items-center justify-between mt-space-sm">
                  <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                    >1/3</span
                  >
                  <svg aria-hidden="true" class="w-7 h-7 text-primary" viewBox="0 0 36 36">
                    <circle
                      cx="18"
                      cy="18"
                      fill="none"
                      r="15"
                      stroke="currentColor"
                      stroke-opacity="0.18"
                      stroke-width="4"
                    ></circle>
                    <circle
                      cx="18"
                      cy="18"
                      fill="none"
                      r="15"
                      stroke="currentColor"
                      stroke-dasharray="94.2"
                      stroke-dashoffset="62.8"
                      stroke-linecap="round"
                      stroke-width="4"
                      transform="rotate(-90 18 18)"
                    ></circle>
                  </svg>
                </div>
              </div>
              <div
                class="bg-surface-container rounded-xl p-space-md shadow-md flex flex-col justify-between"
              >
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                  >Completed</span
                >
                <div class="flex items-baseline gap-space-xs mt-space-sm">
                  <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">5</span>
                  <span class="font-body-sm text-body-sm text-outline">logs</span>
                </div>
              </div>
            </div>
          </div>
          <!-- Navigation Tabs & Preview Controls -->
          <div
            class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md bg-surface-container-low p-space-sm rounded-xl shadow-sm"
          >
            <div
              aria-label="Event Registration Views"
              class="flex items-center gap-space-xs"
              role="tablist"
            >
              <button
                aria-selected="true"
                class="px-space-lg py-space-sm rounded-lg font-title-md text-title-md bg-primary-container text-on-primary transition-colors"
                id="tab-upcoming"
                role="tab"
                type="button"
                disabled
                title="Design preview"
              >
                Upcoming Events (3)
              </button>
              <button
                aria-selected="false"
                class="px-space-lg py-space-sm rounded-lg font-title-md text-title-md text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors"
                id="tab-past"
                role="tab"
                type="button"
                disabled
                title="Design preview"
              >
                Past Events (5)
              </button>
            </div>
            <div class="flex items-center gap-space-sm px-space-sm">
              <button
                class="px-space-md py-space-xs rounded-lg bg-surface-container-high text-on-surface-variant hover:text-on-surface font-body-sm text-body-sm flex items-center gap-space-xs transition-colors"
                id="btn-preview-modal"
                type="button"
                v-preview-disclosure="'cancel-modal'"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true">cancel</span>
                <span>Preview Cancel Dialog</span>
              </button>
              <button
                class="px-space-md py-space-xs rounded-lg bg-surface-container-high text-on-surface-variant hover:text-on-surface font-body-sm text-body-sm flex items-center gap-space-xs transition-colors"
                id="btn-toggle-empty"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true">inbox</span>
                <span>Preview Empty State</span>
              </button>
            </div>
          </div>
          <!-- UPCOMING EVENTS PANEL -->
          <section class="grid grid-cols-1 gap-space-lg" id="panel-upcoming">
            <!-- Card 1: Spring Swiss Championship 2025 -->
            <article
              class="group bg-surface-container hover:bg-surface-container-high rounded-xl p-space-lg shadow-md transition-all duration-200 flex flex-col lg:flex-row gap-space-lg items-stretch"
              data-event-card="spring-swiss"
            >
              <div
                class="w-full lg:w-64 h-48 lg:h-auto shrink-0 rounded-lg overflow-hidden relative bg-surface-container-lowest"
              >
                <img
                  alt="Spring Swiss Championship 2025"
                  class="w-full h-full object-cover group-hover:scale-105 transition-transform duration-500"
                  data-alt="Overhead architectural photograph of a tournament-grade wooden and dark slate chess board under dramatic low-key studio lighting, subtle emerald green ambient rim light reflecting off Staunton chess pieces in a quiet obsidian hall, ultra-sharp editorial sports photography."
                  src="/images/3f71f596a02b.webp"
                />
                <div
                  class="absolute top-space-sm left-space-sm bg-surface-container-lowest/90 backdrop-blur-md px-space-sm py-space-xs rounded-lg"
                >
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-primary"
                    >Classical</span
                  >
                </div>
              </div>
              <div class="flex-1 min-w-0 flex flex-col justify-between gap-space-md">
                <div class="space-y-space-sm">
                  <div class="flex flex-wrap items-center justify-between gap-space-sm">
                    <div class="flex flex-wrap items-center gap-space-sm">
                      <span
                        class="px-space-sm py-space-xs rounded-lg bg-secondary-container text-secondary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-space-xs"
                      >
                        <span
                          class="material-symbols-outlined text-[14px]"
                          style="font-variation-settings: 'FILL' 1"
                          aria-hidden="true"
                          >check_circle</span
                        >
                        Confirmed
                      </span>
                      <span
                        class="px-space-sm py-space-xs rounded-lg bg-primary-container/20 text-primary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-space-xs"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >verified_user</span
                        >
                        Checked In
                      </span>
                    </div>
                    <span class="font-label-numeric-md text-label-numeric-md text-outline"
                      >REG #CH-2504</span
                    >
                  </div>
                  <h2 class="font-headline-md text-headline-md text-on-surface truncate">
                    Spring Swiss Championship 2025
                  </h2>
                  <div
                    class="grid grid-cols-1 sm:grid-cols-3 gap-space-sm pt-space-xs text-on-surface-variant font-body-md text-body-md"
                  >
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >calendar_today</span
                      >
                      <span class="truncate">Apr 18 – Apr 20, 2025</span>
                    </div>
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="truncate">09:30 AM EST • 90+30</span>
                    </div>
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span class="truncate">Grandmaster Hall, New York</span>
                    </div>
                  </div>
                </div>
                <div
                  class="flex flex-wrap items-center justify-between gap-space-md pt-space-sm bg-surface-container-low/60 -mx-space-sm px-space-sm py-space-sm rounded-lg"
                >
                  <div
                    class="flex items-center gap-space-md font-body-sm text-body-sm text-on-surface-variant"
                  >
                    <span>Section: <strong class="text-on-surface">Open (2000+)</strong></span>
                    <span class="text-outline">•</span>
                    <span
                      >Round 1 Pairing: <strong class="text-primary">Board 4 (White)</strong></span
                    >
                  </div>
                  <div class="flex items-center gap-space-sm">
                    <RouterLink
                      class="px-space-md py-space-sm rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-body-md transition-colors"
                      to="/events/spring-rapid-open"
                    >
                      View Details
                    </RouterLink>
                    <button
                      class="px-space-md py-space-sm rounded-lg bg-error-container/40 hover:bg-error-container/70 text-error font-title-md text-body-md transition-colors"
                      data-cancel-trigger="Spring Swiss Championship 2025"
                      data-card-id="spring-swiss"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Cancel Registration
                    </button>
                  </div>
                </div>
              </div>
            </article>
            <!-- Card 2: Metro Blitz Invitational -->
            <article
              class="group bg-surface-container hover:bg-surface-container-high rounded-xl p-space-lg shadow-md transition-all duration-200 flex flex-col lg:flex-row gap-space-lg items-stretch"
              data-event-card="metro-blitz"
            >
              <div
                class="w-full lg:w-64 h-48 lg:h-auto shrink-0 rounded-lg overflow-hidden relative bg-surface-container-lowest"
              >
                <img
                  alt="Metro Blitz Invitational"
                  class="w-full h-full object-cover group-hover:scale-105 transition-transform duration-500"
                  data-alt="Close-up photograph of a digital chess clock beside a black knight piece on a matte dark green vinyl tournament mat, moody obsidian background with crisp focused lighting on the timer display, high-contrast minimalist chess photography."
                  src="/images/07266d339958.webp"
                />
                <div
                  class="absolute top-space-sm left-space-sm bg-surface-container-lowest/90 backdrop-blur-md px-space-sm py-space-xs rounded-lg"
                >
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-tertiary"
                    >Blitz</span
                  >
                </div>
              </div>
              <div class="flex-1 min-w-0 flex flex-col justify-between gap-space-md">
                <div class="space-y-space-sm">
                  <div class="flex flex-wrap items-center justify-between gap-space-sm">
                    <div class="flex flex-wrap items-center gap-space-sm">
                      <span
                        class="px-space-sm py-space-xs rounded-lg bg-secondary-container text-secondary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-space-xs"
                      >
                        <span
                          class="material-symbols-outlined text-[14px]"
                          style="font-variation-settings: 'FILL' 1"
                          aria-hidden="true"
                          >check_circle</span
                        >
                        Confirmed
                      </span>
                      <span
                        class="px-space-sm py-space-xs rounded-lg bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-space-xs"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >hourglass_top</span
                        >
                        Pending
                      </span>
                    </div>
                    <span class="font-label-numeric-md text-label-numeric-md text-outline"
                      >REG #CH-2589</span
                    >
                  </div>
                  <h2 class="font-headline-md text-headline-md text-on-surface truncate">
                    Metro Blitz Invitational
                  </h2>
                  <div
                    class="grid grid-cols-1 sm:grid-cols-3 gap-space-sm pt-space-xs text-on-surface-variant font-body-md text-body-md"
                  >
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >calendar_today</span
                      >
                      <span class="truncate">May 03, 2025</span>
                    </div>
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="truncate">06:00 PM EST • 3+2</span>
                    </div>
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span class="truncate">Marshall Chess Club, NYC</span>
                    </div>
                  </div>
                </div>
                <div
                  class="flex flex-wrap items-center justify-between gap-space-md pt-space-sm bg-surface-container-low/60 -mx-space-sm px-space-sm py-space-sm rounded-lg"
                >
                  <div
                    class="flex items-center gap-space-md font-body-sm text-body-sm text-on-surface-variant"
                  >
                    <span>Section: <strong class="text-on-surface">Master Blitz</strong></span>
                    <span class="text-outline">•</span>
                    <span
                      >Check-in opens:
                      <strong class="text-on-surface">May 03, 05:00 PM</strong></span
                    >
                  </div>
                  <div class="flex items-center gap-space-sm">
                    <RouterLink
                      class="px-space-md py-space-sm rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-body-md transition-colors"
                      to="/events/spring-rapid-open"
                    >
                      View Details
                    </RouterLink>
                    <button
                      class="px-space-md py-space-sm rounded-lg bg-error-container/40 hover:bg-error-container/70 text-error font-title-md text-body-md transition-colors"
                      data-cancel-trigger="Metro Blitz Invitational"
                      data-card-id="metro-blitz"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Cancel Registration
                    </button>
                  </div>
                </div>
              </div>
            </article>
            <!-- Card 3: Endgame Theory & Calculation Clinic -->
            <article
              class="group bg-surface-container hover:bg-surface-container-high rounded-xl p-space-lg shadow-md transition-all duration-200 flex flex-col lg:flex-row gap-space-lg items-stretch"
              data-event-card="endgame-clinic"
            >
              <div
                class="w-full lg:w-64 h-48 lg:h-auto shrink-0 rounded-lg overflow-hidden relative bg-surface-container-lowest"
              >
                <img
                  alt="Endgame Theory &amp; Calculation Clinic"
                  class="w-full h-full object-cover group-hover:scale-105 transition-transform duration-500"
                  data-alt="Minimalist studio scene of a chess king and two pawns in an endgame position on a dark walnut board, soft directional overhead light casting long geometric shadows, deep charcoal and muted sage green color grading."
                  src="/images/c2f2cb61df53.webp"
                />
                <div
                  class="absolute top-space-sm left-space-sm bg-surface-container-lowest/90 backdrop-blur-md px-space-sm py-space-xs rounded-lg"
                >
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                    >Workshop</span
                  >
                </div>
              </div>
              <div class="flex-1 min-w-0 flex flex-col justify-between gap-space-md">
                <div class="space-y-space-sm">
                  <div class="flex flex-wrap items-center justify-between gap-space-sm">
                    <div class="flex flex-wrap items-center gap-space-sm">
                      <span
                        class="px-space-sm py-space-xs rounded-lg bg-secondary-container text-secondary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-space-xs"
                      >
                        <span
                          class="material-symbols-outlined text-[14px]"
                          style="font-variation-settings: 'FILL' 1"
                          aria-hidden="true"
                          >check_circle</span
                        >
                        Confirmed
                      </span>
                      <span
                        class="px-space-sm py-space-xs rounded-lg bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-space-xs"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >hourglass_top</span
                        >
                        Pending
                      </span>
                    </div>
                    <span class="font-label-numeric-md text-label-numeric-md text-outline"
                      >REG #CH-2612</span
                    >
                  </div>
                  <h2 class="font-headline-md text-headline-md text-on-surface truncate">
                    Endgame Theory &amp; Calculation Clinic
                  </h2>
                  <div
                    class="grid grid-cols-1 sm:grid-cols-3 gap-space-sm pt-space-xs text-on-surface-variant font-body-md text-body-md"
                  >
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >calendar_today</span
                      >
                      <span class="truncate">May 17, 2025</span>
                    </div>
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span class="truncate">02:00 PM EST • 3 hrs</span>
                    </div>
                    <div class="flex items-center gap-space-xs min-w-0">
                      <span
                        class="material-symbols-outlined text-[18px] text-primary shrink-0"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span class="truncate">ChessHub Academy, Room 4B</span>
                    </div>
                  </div>
                </div>
                <div
                  class="flex flex-wrap items-center justify-between gap-space-md pt-space-sm bg-surface-container-low/60 -mx-space-sm px-space-sm py-space-sm rounded-lg"
                >
                  <div
                    class="flex items-center gap-space-md font-body-sm text-body-sm text-on-surface-variant"
                  >
                    <span>Instructor: <strong class="text-on-surface">GM Elena Vance</strong></span>
                    <span class="text-outline">•</span>
                    <span>Seat: <strong class="text-on-surface">Row 2, Desk 6</strong></span>
                  </div>
                  <div class="flex items-center gap-space-sm">
                    <RouterLink
                      class="px-space-md py-space-sm rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-body-md transition-colors"
                      to="/events/spring-rapid-open"
                    >
                      View Details
                    </RouterLink>
                    <button
                      class="px-space-md py-space-sm rounded-lg bg-error-container/40 hover:bg-error-container/70 text-error font-title-md text-body-md transition-colors"
                      data-cancel-trigger="Endgame Theory &amp; Calculation Clinic"
                      data-card-id="endgame-clinic"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Cancel Registration
                    </button>
                  </div>
                </div>
              </div>
            </article>
          </section>
          <!-- PAST EVENTS PANEL (Hidden by default) -->
          <section class="hidden grid grid-cols-1 md:grid-cols-2 gap-space-lg" id="panel-past">
            <article
              class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col justify-between gap-space-md"
            >
              <div class="space-y-space-sm">
                <div class="flex items-center justify-between">
                  <span
                    class="px-space-sm py-space-xs rounded-lg bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                    >Rapid</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-primary"
                    >4.5 / 6.0 PTS</span
                  >
                </div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  Winter Open Rapid 2025
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Feb 14, 2025 • Grandmaster Hall, New York
                </p>
              </div>
              <div
                class="flex items-center justify-between pt-space-sm bg-surface-container-low/60 -mx-space-sm px-space-sm py-space-sm rounded-lg"
              >
                <span class="font-label-badge text-label-badge uppercase text-secondary"
                  >Completed</span
                >
                <button
                  class="px-space-md py-space-xs rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-body-sm text-body-sm transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  View Crosstable
                </button>
              </div>
            </article>
            <article
              class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col justify-between gap-space-md"
            >
              <div class="space-y-space-sm">
                <div class="flex items-center justify-between">
                  <span
                    class="px-space-sm py-space-xs rounded-lg bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                    >Classical</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >3.5 / 5.0 PTS</span
                  >
                </div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  New Year FIDE Norm Invitational
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Jan 05 – Jan 09, 2025 • Boston Chess Center
                </p>
              </div>
              <div
                class="flex items-center justify-between pt-space-sm bg-surface-container-low/60 -mx-space-sm px-space-sm py-space-sm rounded-lg"
              >
                <span class="font-label-badge text-label-badge uppercase text-secondary"
                  >Completed</span
                >
                <button
                  class="px-space-md py-space-xs rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-body-sm text-body-sm transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  View Crosstable
                </button>
              </div>
            </article>
            <article
              class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col justify-between gap-space-md"
            >
              <div class="space-y-space-sm">
                <div class="flex items-center justify-between">
                  <span
                    class="px-space-sm py-space-xs rounded-lg bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                    >Blitz</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >7.0 / 9.0 PTS</span
                  >
                </div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  December Midnight Arena
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Dec 21, 2024 • Marshall Chess Club, NYC
                </p>
              </div>
              <div
                class="flex items-center justify-between pt-space-sm bg-surface-container-low/60 -mx-space-sm px-space-sm py-space-sm rounded-lg"
              >
                <span class="font-label-badge text-label-badge uppercase text-secondary"
                  >Completed • 3rd Place</span
                >
                <button
                  class="px-space-md py-space-xs rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-body-sm text-body-sm transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  View Crosstable
                </button>
              </div>
            </article>
            <article
              class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col justify-between gap-space-md"
            >
              <div class="space-y-space-sm">
                <div class="flex items-center justify-between">
                  <span
                    class="px-space-sm py-space-xs rounded-lg bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                    >Workshop</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-outline"
                    >ATTENDED</span
                  >
                </div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  Sicilian Najdorf Structure Masterclass
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Nov 16, 2024 • ChessHub Academy
                </p>
              </div>
              <div
                class="flex items-center justify-between pt-space-sm bg-surface-container-low/60 -mx-space-sm px-space-sm py-space-sm rounded-lg"
              >
                <span class="font-label-badge text-label-badge uppercase text-on-surface-variant"
                  >Certificate Issued</span
                >
                <button
                  class="px-space-md py-space-xs rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-body-sm text-body-sm transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  View Notes
                </button>
              </div>
            </article>
          </section>
          <!-- CLEAN EMPTY STATE CARD REFERENCE (Hidden by default, toggleable) -->
          <section class="hidden" id="panel-empty">
            <div
              class="bg-surface-container rounded-xl p-space-xl shadow-md flex flex-col items-center justify-center text-center max-w-2xl mx-auto space-y-space-md"
            >
              <div
                class="w-16 h-16 rounded-full bg-surface-container-highest flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[32px]" aria-hidden="true"
                  >event_busy</span
                >
              </div>
              <div class="space-y-space-xs">
                <h3 class="font-headline-md text-headline-md text-on-surface">
                  No Upcoming Event Registrations
                </h3>
                <p class="font-body-md text-body-md text-on-surface-variant max-w-md">
                  You are not currently registered for any upcoming tournaments or workshops. Browse
                  the official ChessHub calendar to reserve your board.
                </p>
              </div>
              <div class="pt-space-sm flex items-center gap-space-sm">
                <span
                  class="px-space-lg py-space-sm rounded-lg bg-primary-container hover:bg-primary text-on-primary font-title-md text-body-md transition-colors"
                  data-path="events"
                >
                  Explore Tournaments
                </span>
                <button
                  class="px-space-lg py-space-sm rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-body-md transition-colors"
                  id="btn-restore-events"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Back to My Events
                </button>
              </div>
            </div>
          </section>
        </div>
        <!-- CANCELLATION CONFIRMATION DIALOG MODAL -->
        <div
          aria-labelledby="modal-title"
          aria-modal="true"
          class="fixed inset-0 z-50 hidden items-center justify-center p-space-md bg-surface-container-lowest/80 backdrop-blur-md preview-disclosure"
          id="cancel-modal"
          role="dialog"
        >
          <div
            class="bg-surface-container-high rounded-xl p-space-xl max-w-md w-full shadow-xl space-y-space-lg"
          >
            <div class="flex items-start gap-space-md">
              <div
                class="w-10 h-10 rounded-lg bg-error-container/50 flex items-center justify-center text-error shrink-0"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >warning</span
                >
              </div>
              <div class="space-y-space-xs">
                <h3 class="font-headline-sm text-headline-sm text-on-surface" id="modal-title">
                  Cancel Event Registration?
                </h3>
                <p class="font-body-md text-body-md text-on-surface-variant" id="modal-description">
                  Are you sure you want to withdraw from
                  <strong class="text-on-surface" id="modal-event-name"
                    >Spring Swiss Championship 2025</strong
                  >? Your board assignment will be released to the waitlist.
                </p>
              </div>
            </div>
            <div class="flex items-center justify-end gap-space-sm pt-space-sm">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-body-md transition-colors"
                id="modal-keep-btn"
                type="button"
                v-preview-disclosure="'cancel-modal'"
                data-preview-dismiss=""
              >
                Keep Registration
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg bg-error-container hover:bg-error text-on-error-container hover:text-on-error font-title-md text-body-md transition-colors"
                id="modal-confirm-btn"
                type="button"
                disabled
                title="Design preview"
              >
                Confirm Withdrawal
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
