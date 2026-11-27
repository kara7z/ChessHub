<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <div class="w-full px-margin-desktop py-space-xl space-y-space-xl">
          <div class="flex flex-col lg:flex-row lg:items-end justify-between gap-space-lg">
            <div class="space-y-space-xs">
              <div class="flex items-center gap-space-sm">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-primary"
                  >Personal Terminal</span
                >
                <span class="text-outline">/</span>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-on-surface-variant"
                  >FIDE ID: 2849102</span
                >
              </div>
              <h1 class="font-display-lg text-display-lg text-on-surface tracking-tight">
                My Workshops
              </h1>
              <p class="font-body-lg text-body-lg text-on-surface-variant max-w-2xl">
                Manage your masterclass enrollments, track attendance credentials, and review
                completed analytical clinics.
              </p>
            </div>
            <div class="flex flex-wrap items-center gap-space-md">
              <div
                class="bg-surface-container-low px-space-lg py-space-md rounded-xl flex items-center gap-space-md shadow-sm"
              >
                <div
                  class="w-10 h-10 rounded-lg bg-primary/15 flex items-center justify-center text-primary"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >school</span
                  >
                </div>
                <div>
                  <div class="font-label-numeric-lg text-label-numeric-lg text-on-surface">
                    18.5h
                  </div>
                  <div class="font-body-sm text-body-sm text-on-surface-variant">
                    Total Study Logged
                  </div>
                </div>
              </div>
              <div
                class="bg-surface-container-low px-space-lg py-space-md rounded-xl flex items-center gap-space-md shadow-sm"
              >
                <div
                  class="w-10 h-10 rounded-lg bg-secondary-container flex items-center justify-center text-secondary"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >verified</span
                  >
                </div>
                <div>
                  <div class="font-label-numeric-lg text-label-numeric-lg text-on-surface">
                    100%
                  </div>
                  <div class="font-body-sm text-body-sm text-on-surface-variant">
                    Attendance Rate
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div
            class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md bg-surface-container-low p-space-sm rounded-xl"
          >
            <div class="flex items-center gap-space-xs" role="tablist">
              <button
                aria-selected="true"
                class="px-space-lg py-space-sm rounded-lg font-title-md text-body-md bg-primary text-on-primary transition-all flex items-center gap-space-sm"
                id="tab-upcoming"
                role="tab"
                disabled
                title="Design preview"
              >
                <span>Upcoming Workshops (2)</span>
              </button>
              <button
                aria-selected="false"
                class="px-space-lg py-space-sm rounded-lg font-title-md text-body-md text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-all flex items-center gap-space-sm"
                id="tab-completed"
                role="tab"
                disabled
                title="Design preview"
              >
                <span>Completed Workshops (4)</span>
              </button>
            </div>
            <div class="flex items-center gap-space-sm px-space-sm">
              <span class="material-symbols-outlined text-[18px] text-outline" aria-hidden="true"
                >calendar_month</span
              >
              <span class="font-body-sm text-body-sm text-on-surface-variant"
                >2025 Spring / Summer Term</span
              >
            </div>
          </div>
          <div class="grid grid-cols-1 xl:grid-cols-2 gap-gutter-desktop" id="panel-upcoming">
            <article
              class="bg-surface-container rounded-xl overflow-hidden shadow-md hover:bg-surface-container-high transition-colors flex flex-col sm:flex-row"
            >
              <div class="sm:w-56 h-48 sm:h-auto relative shrink-0 overflow-hidden">
                <img
                  class="w-full h-full object-cover"
                  data-alt="Atmospheric close-up of a dark matte wooden chess board in a dimly lit grandmaster study hall, focusing on a black knight and white pawn in a sharp Sicilian Najdorf formation, subtle warm rim lighting and deep obsidian shadows with muted forest green accents"
                  src="/images/b311dfa7bda8.webp"
                  alt=""
                />
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest/90 via-transparent to-transparent"
                ></div>
                <div class="absolute top-3 left-3">
                  <span
                    class="px-2.5 py-1 rounded-md bg-surface-container-lowest/90 backdrop-blur-md font-label-badge text-label-badge uppercase text-tertiary"
                    >Advanced</span
                  >
                </div>
              </div>
              <div class="p-space-lg flex flex-col justify-between flex-1 min-w-0 gap-space-md">
                <div class="space-y-space-sm">
                  <div class="flex flex-wrap items-center justify-between gap-space-xs">
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-primary/15 text-primary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-1"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                      Confirmed
                    </span>
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                    >
                      Pending Check-in
                    </span>
                  </div>
                  <h2 class="font-headline-sm text-headline-sm text-on-surface truncate">
                    Mastering the Sicilian Najdorf
                  </h2>
                  <p class="font-body-md text-body-md text-on-surface-variant">
                    Instructor: <span class="text-on-surface font-medium">GM Alexander Varga</span>
                  </p>
                  <div
                    class="grid grid-cols-2 gap-y-space-xs gap-x-space-md pt-space-xs font-body-sm text-body-sm text-on-surface-variant"
                  >
                    <div class="flex items-center gap-1.5 truncate">
                      <span
                        class="material-symbols-outlined text-[16px] text-primary"
                        aria-hidden="true"
                        >event</span
                      >
                      <span>May 18, 2025 • 14:00</span>
                    </div>
                    <div class="flex items-center gap-1.5 truncate">
                      <span
                        class="material-symbols-outlined text-[16px] text-primary"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span>3 Hours</span>
                    </div>
                    <div class="flex items-center gap-1.5 col-span-2 truncate">
                      <span
                        class="material-symbols-outlined text-[16px] text-primary"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span>Marshall Chess Club, Hall B (NYC)</span>
                    </div>
                  </div>
                </div>
                <div class="flex items-center gap-space-sm pt-space-sm">
                  <RouterLink
                    class="flex-1 text-center px-space-md py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-body-md hover:bg-primary-fixed-dim transition-colors"
                    data-path="workshops"
                    to="/workshops/strategy-masterclass"
                    >View Details</RouterLink
                  >
                  <button
                    class="px-space-md py-space-sm rounded-lg bg-surface-container-highest text-error hover:bg-error-container hover:text-on-error-container font-title-md text-body-md transition-colors"
                    type="button"
                    v-preview-disclosure="'cancel-modal'"
                  >
                    Cancel Registration
                  </button>
                </div>
              </div>
            </article>
            <article
              class="bg-surface-container rounded-xl overflow-hidden shadow-md hover:bg-surface-container-high transition-colors flex flex-col sm:flex-row"
            >
              <div class="sm:w-56 h-48 sm:h-auto relative shrink-0 overflow-hidden">
                <img
                  class="w-full h-full object-cover"
                  data-alt="Minimalist overhead studio photograph of a tournament chess clock next to an endgame position with rooks and pawns on a dark slate and olive green vinyl board, crisp architectural shadows, focused cerebral atmosphere"
                  src="/images/5619403cbf9b.webp"
                  alt=""
                />
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest/90 via-transparent to-transparent"
                ></div>
                <div class="absolute top-3 left-3">
                  <span
                    class="px-2.5 py-1 rounded-md bg-surface-container-lowest/90 backdrop-blur-md font-label-badge text-label-badge uppercase text-secondary"
                    >Intermediate</span
                  >
                </div>
              </div>
              <div class="p-space-lg flex flex-col justify-between flex-1 min-w-0 gap-space-md">
                <div class="space-y-space-sm">
                  <div class="flex flex-wrap items-center justify-between gap-space-xs">
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-primary/15 text-primary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-1"
                    >
                      <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                      Confirmed
                    </span>
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                    >
                      Pending Check-in
                    </span>
                  </div>
                  <h2 class="font-headline-sm text-headline-sm text-on-surface truncate">
                    Rook Endgame Precision &amp; Lucena
                  </h2>
                  <p class="font-body-md text-body-md text-on-surface-variant">
                    Instructor: <span class="text-on-surface font-medium">IM Elena Rostova</span>
                  </p>
                  <div
                    class="grid grid-cols-2 gap-y-space-xs gap-x-space-md pt-space-xs font-body-sm text-body-sm text-on-surface-variant"
                  >
                    <div class="flex items-center gap-1.5 truncate">
                      <span
                        class="material-symbols-outlined text-[16px] text-primary"
                        aria-hidden="true"
                        >event</span
                      >
                      <span>May 24, 2025 • 10:00</span>
                    </div>
                    <div class="flex items-center gap-1.5 truncate">
                      <span
                        class="material-symbols-outlined text-[16px] text-primary"
                        aria-hidden="true"
                        >schedule</span
                      >
                      <span>2.5 Hours</span>
                    </div>
                    <div class="flex items-center gap-1.5 col-span-2 truncate">
                      <span
                        class="material-symbols-outlined text-[16px] text-primary"
                        aria-hidden="true"
                        >videocam</span
                      >
                      <span>Live Interactive Virtual Hall 04</span>
                    </div>
                  </div>
                </div>
                <div class="flex items-center gap-space-sm pt-space-sm">
                  <RouterLink
                    class="flex-1 text-center px-space-md py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-body-md hover:bg-primary-fixed-dim transition-colors"
                    data-path="workshops"
                    to="/workshops/strategy-masterclass"
                    >View Details</RouterLink
                  >
                  <button
                    class="px-space-md py-space-sm rounded-lg bg-surface-container-highest text-error hover:bg-error-container hover:text-on-error-container font-title-md text-body-md transition-colors"
                    type="button"
                    v-preview-disclosure="'cancel-modal'"
                  >
                    Cancel Registration
                  </button>
                </div>
              </div>
            </article>
          </div>
          <div
            class="hidden grid grid-cols-1 xl:grid-cols-2 gap-gutter-desktop"
            id="panel-completed"
          >
            <article
              class="bg-surface-container rounded-xl overflow-hidden shadow-md flex flex-col sm:flex-row"
            >
              <div class="sm:w-48 h-40 sm:h-auto relative shrink-0 overflow-hidden">
                <img
                  class="w-full h-full object-cover"
                  data-alt="Moody editorial photo of a grandmaster analyzing a chess position with a notebook in a quiet dark-walled library, warm desk lamp casting soft light on wooden pieces"
                  src="/images/b29a870c53a7.webp"
                  alt=""
                />
                <div class="absolute top-3 left-3">
                  <span
                    class="px-2.5 py-1 rounded-md bg-surface-container-lowest/90 font-label-badge text-label-badge uppercase text-tertiary"
                    >Advanced</span
                  >
                </div>
              </div>
              <div class="p-space-lg flex flex-col justify-between flex-1 min-w-0 gap-space-md">
                <div class="space-y-space-xs">
                  <div class="flex items-center justify-between gap-space-xs">
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase"
                      >Completed</span
                    >
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-primary/15 text-primary font-label-badge text-label-badge uppercase flex items-center gap-1"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >check_circle</span
                      >
                      Attended
                    </span>
                  </div>
                  <h2 class="font-headline-sm text-headline-sm text-on-surface truncate">
                    Dynamic Pawn Sacrifices in the Benoni
                  </h2>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    Instructor: GM Marcus Thorne • Apr 12, 2025
                  </p>
                </div>
                <div class="flex items-center justify-between pt-space-xs">
                  <span class="font-body-sm text-body-sm text-outline"
                    >3 Hours • Club Auditorium</span
                  >
                  <RouterLink
                    class="px-space-md py-space-xs rounded-lg bg-surface-container-highest text-on-surface hover:bg-primary hover:text-on-primary font-title-md text-body-sm transition-colors"
                    data-path="workshops"
                    to="/workshops/strategy-masterclass"
                    >View Details</RouterLink
                  >
                </div>
              </div>
            </article>
            <article
              class="bg-surface-container rounded-xl overflow-hidden shadow-md flex flex-col sm:flex-row"
            >
              <div class="sm:w-48 h-40 sm:h-auto relative shrink-0 overflow-hidden">
                <img
                  class="w-full h-full object-cover"
                  data-alt="Macro shot of a white queen and black bishop on a matte charcoal and olive chess board, dramatic low-key lighting, crisp focus"
                  src="/images/6c20f1583955.webp"
                  alt=""
                />
                <div class="absolute top-3 left-3">
                  <span
                    class="px-2.5 py-1 rounded-md bg-surface-container-lowest/90 font-label-badge text-label-badge uppercase text-secondary"
                    >Intermediate</span
                  >
                </div>
              </div>
              <div class="p-space-lg flex flex-col justify-between flex-1 min-w-0 gap-space-md">
                <div class="space-y-space-xs">
                  <div class="flex items-center justify-between gap-space-xs">
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge uppercase"
                      >Completed</span
                    >
                    <span
                      class="px-2.5 py-0.5 rounded-full bg-primary/15 text-primary font-label-badge text-label-badge uppercase flex items-center gap-1"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >check_circle</span
                      >
                      Attended
                    </span>
                  </div>
                  <h2 class="font-headline-sm text-headline-sm text-on-surface truncate">
                    Calculation &amp; Candidate Moves Clinic
                  </h2>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    Instructor: IM Sarah Jenkins • Mar 28, 2025
                  </p>
                </div>
                <div class="flex items-center justify-between pt-space-xs">
                  <span class="font-body-sm text-body-sm text-outline"
                    >4 Hours • Virtual Hall 02</span
                  >
                  <RouterLink
                    class="px-space-md py-space-xs rounded-lg bg-surface-container-highest text-on-surface hover:bg-primary hover:text-on-primary font-title-md text-body-sm transition-colors"
                    data-path="workshops"
                    to="/workshops/strategy-masterclass"
                    >View Details</RouterLink
                  >
                </div>
              </div>
            </article>
          </div>
          <section class="pt-space-lg">
            <div
              class="bg-surface-container-low rounded-xl p-space-xl flex flex-col items-center text-center max-w-2xl mx-auto space-y-space-md"
            >
              <div
                class="w-16 h-16 rounded-full bg-surface-container-high flex items-center justify-center text-outline"
              >
                <span class="material-symbols-outlined text-[32px]" aria-hidden="true"
                  >event_busy</span
                >
              </div>
              <div class="space-y-space-xs">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-outline"
                  >Empty State Preview</span
                >
                <h3 class="font-headline-md text-headline-md text-on-surface">
                  No Active Registrations
                </h3>
                <p class="font-body-md text-body-md text-on-surface-variant max-w-md mx-auto">
                  You have no upcoming workshops scheduled for this term. Explore our
                  grandmaster-led clinics to sharpen your repertoire.
                </p>
              </div>
              <span
                class="px-space-lg py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-body-md hover:bg-primary-fixed-dim transition-colors inline-flex items-center gap-space-sm"
                data-path="workshops"
              >
                <span>Browse All Workshops</span>
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >arrow_forward</span
                >
              </span>
            </div>
          </section>
        </div>
        <div
          class="hidden fixed inset-0 z-50 bg-surface-container-lowest/80 backdrop-blur-sm flex items-center justify-center p-margin preview-disclosure preview-disclosure-flex"
          id="cancel-modal"
        >
          <div
            class="bg-surface-container-high rounded-xl p-space-lg max-w-md w-full shadow-2xl space-y-space-md"
          >
            <div class="flex items-start gap-space-md">
              <div
                class="w-10 h-10 rounded-lg bg-error-container flex items-center justify-center text-on-error-container shrink-0"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                  >warning</span
                >
              </div>
              <div class="space-y-space-xs">
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  Cancel Registration?
                </h3>
                <p class="font-body-md text-body-md text-on-surface-variant">
                  Are you sure you want to withdraw your seat from
                  <span class="text-on-surface font-semibold" id="modal-workshop-title"></span>?
                  Your spot will be released to the waitlist.
                </p>
              </div>
            </div>
            <div class="flex items-center justify-end gap-space-sm pt-space-sm">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container-highest text-on-surface font-title-md text-body-md hover:bg-surface-bright transition-colors"
                type="button"
                v-preview-disclosure="'cancel-modal'"
                data-preview-dismiss=""
              >
                Keep Seat
              </button>
              <button
                class="px-space-md py-space-sm rounded-lg bg-error-container text-on-error-container font-title-md text-body-md hover:opacity-90 transition-opacity"
                type="button"
                disabled
                title="Design preview"
              >
                Confirm Cancellation
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
