<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <section
          class="w-full px-margin md:px-margin-tablet xl:px-margin-desktop pt-space-xl pb-space-lg"
        >
          <div class="flex flex-col md:flex-row md:items-end justify-between gap-space-lg">
            <div class="space-y-space-xs">
              <div
                class="flex items-center gap-space-sm font-label-badge text-label-badge uppercase tracking-widest text-outline"
              >
                <span class="w-2 h-2 rounded-full bg-primary"></span>
                <span>Arbiter &amp; Match Dispatch</span>
                <span>/</span>
                <span>Live Feed</span>
              </div>
              <div class="flex items-center gap-space-md">
                <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                  Notifications
                </h1>
                <span
                  class="inline-flex items-center gap-space-xs px-space-sm py-space-xs rounded-full bg-primary/15 text-primary font-label-numeric-md text-label-numeric-md"
                  id="unread-badge"
                >
                  <span id="unread-count">3</span>
                  <span class="font-label-badge text-label-badge uppercase">Unread</span>
                </span>
              </div>
            </div>
            <div class="flex items-center gap-space-sm">
              <button
                class="inline-flex items-center gap-space-sm px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface hover:bg-surface-bright transition-colors font-title-md text-body-md shadow-sm cursor-pointer"
                id="mark-all-read-btn"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px] text-primary" aria-hidden="true"
                  >done_all</span
                >
                <span>Mark All as Read</span>
              </button>
            </div>
          </div>
        </section>
        <section class="w-full px-margin md:px-margin-tablet xl:px-margin-desktop pb-space-xl">
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-xl items-start">
            <div class="lg:col-span-8 flex flex-col gap-space-lg">
              <div
                aria-label="Notification categories"
                class="flex flex-wrap items-center gap-space-sm bg-surface-container-low p-space-sm rounded-xl shadow-sm"
                role="tablist"
              >
                <button
                  class="filter-tab px-space-md py-space-xs rounded-lg font-title-md text-body-md bg-primary text-on-primary transition-colors cursor-pointer"
                  data-filter="all"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  All
                </button>
                <RouterLink
                  class="filter-tab px-space-md py-space-xs rounded-lg font-title-md text-body-md text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors cursor-pointer"
                  data-filter="matches"
                  to="/matches"
                >
                  Matches
                </RouterLink>
                <button
                  class="filter-tab px-space-md py-space-xs rounded-lg font-title-md text-body-md text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors cursor-pointer"
                  data-filter="events"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Events &amp; Workshops
                </button>
                <button
                  class="filter-tab px-space-md py-space-xs rounded-lg font-title-md text-body-md text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors cursor-pointer"
                  data-filter="seasons"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Seasons
                </button>
                <button
                  class="filter-tab px-space-md py-space-xs rounded-lg font-title-md text-body-md text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors cursor-pointer"
                  data-filter="account"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Account
                </button>
              </div>
              <div class="flex flex-col gap-space-sm" id="notification-feed">
                <article
                  class="notification-item group relative flex flex-col sm:flex-row sm:items-center justify-between gap-space-md p-space-lg rounded-xl bg-surface-container-high shadow-md transition-all"
                  data-category="matches"
                  data-unread="true"
                >
                  <div class="flex items-start gap-space-md min-w-0">
                    <div
                      class="relative shrink-0 w-10 h-10 rounded-lg bg-primary/15 flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >swords</span
                      >
                      <span
                        class="unread-dot absolute -top-1 -right-1 w-2.5 h-2.5 rounded-full bg-primary shadow-sm"
                      ></span>
                    </div>
                    <div class="flex flex-col gap-space-xs min-w-0">
                      <div class="flex flex-wrap items-center gap-space-sm">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-0.5 rounded bg-surface-container-highest text-on-surface-variant"
                          >Match Invitation</span
                        >
                        <span class="font-body-sm text-body-sm text-outline">12m ago</span>
                      </div>
                      <p class="font-title-md text-title-md text-on-surface">
                        Match Invitation: vs Tariq Al-Mansoor — Classical 90+30
                      </p>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Board 4 • Rated FIDE Classical • Scheduled for Tomorrow, 18:00 UTC
                      </p>
                    </div>
                  </div>
                  <div class="flex items-center gap-space-sm shrink-0 sm:pl-space-md">
                    <button
                      class="action-accept px-space-md py-space-xs rounded-lg bg-primary-container text-on-primary-container hover:bg-primary hover:text-on-primary font-title-md text-body-md transition-colors cursor-pointer"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Accept
                    </button>
                    <button
                      class="action-decline px-space-md py-space-xs rounded-lg bg-surface-container-highest text-on-surface-variant hover:bg-error-container hover:text-on-error-container font-title-md text-body-md transition-colors cursor-pointer"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Decline
                    </button>
                  </div>
                </article>
                <article
                  class="notification-item group relative flex flex-col sm:flex-row sm:items-center justify-between gap-space-md p-space-lg rounded-xl bg-surface-container-high shadow-md transition-all"
                  data-category="matches"
                  data-unread="true"
                >
                  <div class="flex items-start gap-space-md min-w-0">
                    <div
                      class="relative shrink-0 w-10 h-10 rounded-lg bg-primary/15 flex items-center justify-center text-primary"
                    >
                      <span
                        class="material-symbols-outlined text-[22px]"
                        style="font-variation-settings: 'FILL' 1"
                        aria-hidden="true"
                        >emoji_events</span
                      >
                      <span
                        class="unread-dot absolute -top-1 -right-1 w-2.5 h-2.5 rounded-full bg-primary shadow-sm"
                      ></span>
                    </div>
                    <div class="flex flex-col gap-space-xs min-w-0">
                      <div class="flex flex-wrap items-center gap-space-sm">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-0.5 rounded bg-surface-container-highest text-on-surface-variant"
                          >Result Validated</span
                        >
                        <span class="font-body-sm text-body-sm text-outline">1h ago</span>
                      </div>
                      <p class="font-title-md text-title-md text-on-surface">
                        Match Result Validated: +20 pts awarded for your win
                      </p>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        1 - 0 vs IM Elena Rostova • Queen's Gambit Declined (42 moves)
                      </p>
                    </div>
                  </div>
                  <div class="flex items-center gap-space-sm shrink-0">
                    <span
                      class="px-space-sm py-space-xs rounded-lg bg-primary/15 text-primary font-label-numeric-md text-label-numeric-md"
                    >
                      +20
                    </span>
                    <button
                      class="toggle-read-btn p-space-xs rounded-lg text-on-surface-variant hover:bg-surface-container-highest hover:text-on-surface transition-colors cursor-pointer"
                      title="Mark as read"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >check_circle</span
                      >
                    </button>
                  </div>
                </article>
                <article
                  class="notification-item group relative flex flex-col sm:flex-row sm:items-center justify-between gap-space-md p-space-lg rounded-xl bg-surface-container-high shadow-md transition-all"
                  data-category="events"
                  data-unread="true"
                >
                  <div class="flex items-start gap-space-md min-w-0">
                    <div
                      class="relative shrink-0 w-10 h-10 rounded-lg bg-tertiary/15 flex items-center justify-center text-tertiary"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >school</span
                      >
                      <span
                        class="unread-dot absolute -top-1 -right-1 w-2.5 h-2.5 rounded-full bg-primary shadow-sm"
                      ></span>
                    </div>
                    <div class="flex flex-col gap-space-xs min-w-0">
                      <div class="flex flex-wrap items-center gap-space-sm">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-0.5 rounded bg-surface-container-highest text-tertiary"
                          >Workshop</span
                        >
                        <span class="font-body-sm text-body-sm text-outline">3h ago</span>
                      </div>
                      <p class="font-title-md text-title-md text-on-surface">
                        Workshop Reminder: Mastering the Sicilian Najdorf starts in 24h
                      </p>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Led by GM Viktor Kortschnoi Jr. • Interactive PGN Analysis Room
                      </p>
                    </div>
                  </div>
                  <div class="flex items-center gap-space-sm shrink-0">
                    <span
                      class="px-space-md py-space-xs rounded-lg bg-surface-container-highest text-on-surface hover:bg-surface-bright font-title-md text-body-md transition-colors"
                      data-path="workshops"
                    >
                      View Syllabus
                    </span>
                    <button
                      class="toggle-read-btn p-space-xs rounded-lg text-on-surface-variant hover:bg-surface-container-highest hover:text-on-surface transition-colors cursor-pointer"
                      title="Mark as read"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >check_circle</span
                      >
                    </button>
                  </div>
                </article>
                <article
                  class="notification-item group relative flex flex-col sm:flex-row sm:items-center justify-between gap-space-md p-space-lg rounded-xl bg-surface-container-low transition-all"
                  data-category="seasons"
                  data-unread="false"
                >
                  <div class="flex items-start gap-space-md min-w-0">
                    <div
                      class="relative shrink-0 w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-on-surface-variant"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >account_tree</span
                      >
                    </div>
                    <div class="flex flex-col gap-space-xs min-w-0">
                      <div class="flex flex-wrap items-center gap-space-sm">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-0.5 rounded bg-surface-container-high text-on-surface-variant"
                          >Season</span
                        >
                        <span class="font-body-sm text-body-sm text-outline">Yesterday</span>
                      </div>
                      <p class="font-title-md text-title-md text-on-surface-variant">
                        Spring League 2025 Round 8 pairings are live
                      </p>
                      <p class="font-body-sm text-body-sm text-outline">
                        FIDE Swiss Pairing System • 64 players • Round 8 begins Friday
                      </p>
                    </div>
                  </div>
                  <div class="flex items-center gap-space-sm shrink-0">
                    <span
                      class="px-space-md py-space-xs rounded-lg bg-surface-container text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface font-title-md text-body-md transition-colors"
                      data-path="matches"
                    >
                      Open Pairings
                    </span>
                  </div>
                </article>
                <article
                  class="notification-item group relative flex flex-col sm:flex-row sm:items-center justify-between gap-space-md p-space-lg rounded-xl bg-surface-container-low transition-all"
                  data-category="account"
                  data-unread="false"
                >
                  <div class="flex items-start gap-space-md min-w-0">
                    <div
                      class="relative shrink-0 w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >verified_user</span
                      >
                    </div>
                    <div class="flex flex-col gap-space-xs min-w-0">
                      <div class="flex flex-wrap items-center gap-space-sm">
                        <span
                          class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-0.5 rounded bg-surface-container-high text-on-surface-variant"
                          >Account</span
                        >
                        <span class="font-body-sm text-body-sm text-outline">2 days ago</span>
                      </div>
                      <p class="font-title-md text-title-md text-on-surface-variant">
                        Your account verification is active
                      </p>
                      <p class="font-body-sm text-body-sm text-outline">
                        FIDE ID #2491084 linked • Eligible for sanctioned Classical &amp; Rapid
                        events
                      </p>
                    </div>
                  </div>
                  <div class="flex items-center gap-space-sm shrink-0">
                    <span
                      class="inline-flex items-center gap-space-xs px-space-sm py-space-xs rounded bg-primary/10 text-primary font-label-badge text-label-badge uppercase"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >verified</span
                      >
                      Verified
                    </span>
                  </div>
                </article>
              </div>
              <div
                class="hidden flex-col items-center justify-center text-center p-space-xl rounded-xl bg-surface-container-low"
                id="empty-state"
              >
                <span
                  class="material-symbols-outlined text-[40px] text-outline mb-space-sm"
                  aria-hidden="true"
                  >notifications_off</span
                >
                <p class="font-title-md text-title-md text-on-surface">
                  No notifications in this category
                </p>
                <p class="font-body-sm text-body-sm text-on-surface-variant mt-space-xs">
                  All dispatches for this filter have been cleared.
                </p>
              </div>
            </div>
            <aside class="lg:col-span-4 flex flex-col gap-space-lg">
              <div
                class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
              >
                <div class="flex items-center justify-between">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Signal Activity (7D)</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-primary">+14%</span>
                </div>
                <div class="w-full h-24 flex items-end justify-between gap-space-xs pt-space-sm">
                  <svg
                    class="w-full h-full text-primary overflow-visible"
                    fill="none"
                    viewBox="0 0 240 64"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <defs>
                      <linearGradient
                        gradientUnits="userSpaceOnUse"
                        id="spark-fill"
                        x1="0"
                        x2="0"
                        y1="0"
                        y2="64"
                      >
                        <stop offset="0%" stop-color="currentColor" stop-opacity="0.28"></stop>
                        <stop offset="100%" stop-color="currentColor" stop-opacity="0"></stop>
                      </linearGradient>
                    </defs>
                    <path
                      d="M0 48 L40 42 L80 50 L120 26 L160 32 L200 14 L240 18 L240 64 L0 64 Z"
                      fill="url(#spark-fill)"
                    ></path>
                    <path
                      d="M0 48 L40 42 L80 50 L120 26 L160 32 L200 14 L240 18"
                      stroke="currentColor"
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      stroke-width="2.5"
                    ></path>
                    <circle cx="200" cy="14" fill="currentColor" r="4"></circle>
                  </svg>
                </div>
                <div class="grid grid-cols-2 gap-space-sm pt-space-sm">
                  <div class="p-space-sm rounded-lg bg-surface-container-low">
                    <p class="font-body-sm text-body-sm text-outline">Pending Invites</p>
                    <p
                      class="font-label-numeric-lg text-label-numeric-lg text-on-surface mt-space-xs"
                    >
                      1
                    </p>
                  </div>
                  <div class="p-space-sm rounded-lg bg-surface-container-low">
                    <p class="font-body-sm text-body-sm text-outline">Validated Wins</p>
                    <p class="font-label-numeric-lg text-label-numeric-lg text-primary mt-space-xs">
                      4
                    </p>
                  </div>
                </div>
              </div>
              <div
                class="p-space-lg rounded-xl bg-surface-container shadow-sm flex flex-col gap-space-md"
              >
                <div class="flex items-center justify-between">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Next 24 Hours</span
                  >
                  <span
                    class="material-symbols-outlined text-[18px] text-on-surface-variant"
                    aria-hidden="true"
                    >schedule</span
                  >
                </div>
                <div class="flex flex-col gap-space-sm">
                  <div
                    class="p-space-md rounded-lg bg-surface-container-low flex items-center justify-between gap-space-sm"
                  >
                    <div class="min-w-0">
                      <p class="font-title-md text-body-md text-on-surface truncate">
                        Sicilian Najdorf Clinic
                      </p>
                      <p class="font-body-sm text-body-sm text-outline">Starts in 24h</p>
                    </div>
                    <span
                      class="px-space-sm py-0.5 rounded bg-tertiary/15 text-tertiary font-label-badge text-label-badge uppercase shrink-0"
                      >Workshop</span
                    >
                  </div>
                  <div
                    class="p-space-md rounded-lg bg-surface-container-low flex items-center justify-between gap-space-sm"
                  >
                    <div class="min-w-0">
                      <p class="font-title-md text-body-md text-on-surface truncate">
                        vs Tariq Al-Mansoor
                      </p>
                      <p class="font-body-sm text-body-sm text-outline">Classical 90+30</p>
                    </div>
                    <span
                      class="px-space-sm py-0.5 rounded bg-primary/15 text-primary font-label-badge text-label-badge uppercase shrink-0"
                      >Board 4</span
                    >
                  </div>
                </div>
              </div>
            </aside>
          </div>
        </section>
      </div>
    </main>
  </ClubLayout>
</template>
