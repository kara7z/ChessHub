<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin md:px-margin-desktop">
      <div class="flex flex-col w-full">
        <!-- Subtle Ambient Glow Overlay -->
        <div class="relative w-full overflow-hidden">
          <div
            class="absolute -top-32 left-1/3 w-[600px] h-[340px] bg-primary/10 rounded-full blur-[140px] pointer-events-none"
          ></div>
          <div
            class="absolute top-96 right-10 w-[420px] h-[280px] bg-tertiary-container/10 rounded-full blur-[120px] pointer-events-none"
          ></div>
          <!-- Breadcrumb Bar -->
          <div class="py-space-md flex items-center justify-between">
            <nav
              aria-label="Breadcrumb"
              class="flex items-center gap-space-xs text-on-surface-variant font-body-sm text-body-sm"
            >
              <RouterLink
                class="hover:text-primary transition-colors flex items-center gap-1"
                data-path="home"
                to="/"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true">home</span>
                <span>Home</span>
              </RouterLink>
              <span class="text-outline-variant font-body-sm text-body-sm">/</span>
              <RouterLink
                class="hover:text-primary transition-colors"
                data-path="events"
                to="/events"
                >Events</RouterLink
              >
              <span class="text-outline-variant font-body-sm text-body-sm">/</span>
              <span
                class="text-on-surface font-title-md text-title-md truncate max-w-xs md:max-w-md"
                >Spring Swiss Championship 2025</span
              >
            </nav>
            <div class="flex items-center gap-space-sm">
              <span
                class="flex items-center gap-1.5 px-2.5 py-1 rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider"
              >
                <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                FIDE Rated • Open
              </span>
              <span
                class="font-label-numeric-md text-label-numeric-md text-on-surface-variant bg-surface-container-high px-2 py-0.5 rounded"
              >
                ID: #EV-2025-SWISS-04
              </span>
            </div>
          </div>
          <!-- Editorial Hero Cover Banner -->
          <section
            class="relative w-full rounded-xl overflow-hidden shadow-2xl bg-surface-container-lowest mt-space-xs"
          >
            <div
              class="w-full h-[360px] bg-cover bg-center relative flex flex-col justify-end p-space-lg md:p-space-xl"
              data-alt="Moody cinematic macro shot of precision handcrafted wooden chess pieces carved in dark ebony and pale boxwood arranged on a dark tournament board. Subtle tournament hall lighting, soft depth of field, green referee LED clock blur in the background, sharp highlights on the knight and queen, analytical low-light atmosphere in deep emerald and obsidian tones."
              style="background-image: url('/images/0fcdf764bb16.webp')"
            >
              <!-- Dark gradient scrim for absolute textual contrast -->
              <div
                class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest via-surface-container-lowest/80 to-transparent"
              ></div>
              <div
                class="absolute inset-0 bg-gradient-to-r from-surface-container-lowest/90 via-surface-container-lowest/40 to-transparent"
              ></div>
              <div class="relative z-10 max-w-4xl">
                <div class="flex flex-wrap items-center gap-space-xs mb-space-sm">
                  <span
                    class="bg-primary text-on-primary font-label-badge text-label-badge uppercase tracking-widest px-2.5 py-1 rounded-sm shadow-md font-bold"
                  >
                    Official Club Rated
                  </span>
                  <span
                    class="bg-surface-container-highest/90 backdrop-blur-md text-on-surface font-label-badge text-label-badge uppercase tracking-wider px-2.5 py-1 rounded-sm"
                  >
                    Swiss 5 Rounds
                  </span>
                  <span
                    class="bg-surface-container-highest/90 backdrop-blur-md text-secondary-fixed font-label-badge text-label-badge uppercase tracking-wider px-2.5 py-1 rounded-sm flex items-center gap-1"
                  >
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >timer</span
                    >
                    60 min + 30 sec / Move
                  </span>
                </div>
                <h1
                  class="font-display-lg text-display-lg text-on-surface tracking-tight mb-space-xs drop-shadow-sm"
                >
                  Spring Swiss Championship 2025
                </h1>
                <div
                  class="flex flex-wrap items-center gap-y-2 gap-x-space-lg text-on-surface-variant font-body-md text-body-md pt-space-xs"
                >
                  <div class="flex items-center gap-2">
                    <div
                      class="w-6 h-6 rounded-full bg-primary/20 flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >gavel</span
                      >
                    </div>
                    <span
                      >Arbiter:
                      <strong class="text-on-surface font-title-md text-title-md"
                        >Sarah Jenkins (IA)</strong
                      >
                      &amp; Arbiter Board</span
                    >
                  </div>
                  <div class="flex items-center gap-2">
                    <span
                      class="material-symbols-outlined text-[18px] text-primary"
                      aria-hidden="true"
                      >calendar_month</span
                    >
                    <span>Saturday, April 26, 2025 • 09:30 UTC Check-in</span>
                  </div>
                  <div class="flex items-center gap-2">
                    <span
                      class="material-symbols-outlined text-[18px] text-primary"
                      aria-hidden="true"
                      >pin_drop</span
                    >
                    <span>Hall 4A, Master Suite • Zurich Club HQ</span>
                  </div>
                </div>
              </div>
              <!-- Corner Quick Data Pill -->
              <div
                class="hidden lg:flex flex-col items-end absolute top-space-lg right-space-lg bg-surface-container-high/90 backdrop-blur-md p-space-md rounded-lg shadow-xl"
              >
                <span class="text-on-surface-variant font-label-badge text-label-badge uppercase"
                  >Guaranteed Prize Fund</span
                >
                <span class="text-primary font-label-numeric-lg text-label-numeric-lg"
                  >€3,500 EUR</span
                >
                <span class="text-on-surface-variant font-body-sm text-body-sm mt-1"
                  >Split across Top 8 + Category Brackets</span
                >
              </div>
            </div>
          </section>
          <!-- Main Content Dual-Column Layout -->
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-lg mt-space-lg items-start">
            <!-- LEFT COLUMN: Detailed Tournament Data (8 Cols) -->
            <section class="lg:col-span-8 flex flex-col gap-space-lg min-w-0">
              <!-- Tournament Overview Bento Panel -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-md flex flex-col gap-space-md"
              >
                <div class="flex items-center justify-between">
                  <h2
                    class="font-headline-md text-headline-md text-on-surface flex items-center gap-space-sm"
                  >
                    <span
                      class="material-symbols-outlined text-primary text-[28px]"
                      aria-hidden="true"
                      >sports_martial_arts</span
                    >
                    About the Tournament
                  </h2>
                  <span
                    class="font-label-badge text-label-badge uppercase px-2 py-1 rounded bg-surface-container-high text-on-surface-variant"
                  >
                    Standard FIDE Ruleset
                  </span>
                </div>
                <p class="font-body-lg text-body-lg text-on-surface-variant leading-relaxed">
                  The <strong class="text-on-surface">Spring Swiss Championship 2025</strong> stands
                  as our premier seasonal classical competition, bringing together verified
                  titleholders, seasoned club players, and ambitious junior candidates in an
                  uncompromising, high-precision environment.
                </p>
                <p class="font-body-md text-body-md text-on-surface-variant leading-relaxed">
                  Pairings will be generated following the official FIDE Dutch Swiss pairing
                  protocol via certified tournament software. To maintain the highest standard of
                  competitive integrity, every match is recorded on digital broadcast sensory boards
                  with automated move transmission and arbiter screen validation.
                </p>
                <!-- Core Metric Badges Bento Grid -->
                <div class="grid grid-cols-2 sm:grid-cols-4 gap-space-sm pt-space-xs">
                  <div
                    class="bg-surface-container p-space-md rounded-lg flex flex-col justify-between"
                  >
                    <span
                      class="font-label-badge text-label-badge uppercase text-on-surface-variant"
                      >Time Control</span
                    >
                    <span class="font-headline-sm text-headline-sm text-primary mt-1">60 + 30</span>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >60 mins + 30s increment</span
                    >
                  </div>
                  <div
                    class="bg-surface-container p-space-md rounded-lg flex flex-col justify-between"
                  >
                    <span
                      class="font-label-badge text-label-badge uppercase text-on-surface-variant"
                      >Format</span
                    >
                    <span class="font-headline-sm text-headline-sm text-on-surface mt-1"
                      >5 Swiss Rds</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >No knockout cuts</span
                    >
                  </div>
                  <div
                    class="bg-surface-container p-space-md rounded-lg flex flex-col justify-between"
                  >
                    <span
                      class="font-label-badge text-label-badge uppercase text-on-surface-variant"
                      >Target Field</span
                    >
                    <span class="font-headline-sm text-headline-sm text-secondary-fixed mt-1"
                      >64 Masters</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Intermediate–advanced</span
                    >
                  </div>
                  <div
                    class="bg-surface-container p-space-md rounded-lg flex flex-col justify-between"
                  >
                    <span
                      class="font-label-badge text-label-badge uppercase text-on-surface-variant"
                      >Main Tiebreak</span
                    >
                    <span class="font-headline-sm text-headline-sm text-tertiary mt-1"
                      >Buchholz</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Cut 1 &amp; Sonneborn</span
                    >
                  </div>
                </div>
                <!-- Tiebreak Regulations Callout -->
                <div
                  class="bg-surface-container-high/60 rounded-lg p-space-md flex items-start gap-space-md mt-space-xs"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[24px] mt-0.5"
                    aria-hidden="true"
                    >rule</span
                  >
                  <div
                    class="flex flex-col gap-1 text-on-surface-variant font-body-sm text-body-sm"
                  >
                    <span class="font-title-md text-title-md text-on-surface"
                      >Tiebreak Sequence Hierarchy</span
                    >
                    <p>
                      1. Direct Encounter • 2. Buchholz Cut 1 • 3. Buchholz System (Total) • 4.
                      Sonneborn-Berger Score • 5. Greatest number of wins with the Black pieces.
                    </p>
                  </div>
                </div>
              </div>
              <!-- Schedule Breakdown Timeline -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-md flex flex-col gap-space-md"
              >
                <div class="flex items-center justify-between">
                  <h2
                    class="font-headline-md text-headline-md text-on-surface flex items-center gap-space-sm"
                  >
                    <span
                      class="material-symbols-outlined text-primary text-[28px]"
                      aria-hidden="true"
                      >schedule</span
                    >
                    Single-Day Championship Timetable
                  </h2>
                  <span class="text-on-surface-variant font-body-sm text-body-sm"
                    >UTC+2 Official Hall Clock</span
                  >
                </div>
                <!-- Chronological List -->
                <div
                  class="relative pl-6 space-y-4 before:content-[''] before:absolute before:left-2 before:top-3 before:bottom-3 before:w-0.5 before:bg-surface-container-highest"
                >
                  <!-- Schedule Item 1 -->
                  <div
                    class="relative flex items-center justify-between bg-surface-container p-space-sm rounded-lg hover:bg-surface-container-high transition-colors"
                  >
                    <div
                      class="absolute -left-6 top-1/2 -translate-y-1/2 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                    >
                      <div class="w-2 h-2 rounded-full bg-primary"></div>
                    </div>
                    <div class="flex items-center gap-space-md">
                      <span
                        class="font-label-numeric-lg text-label-numeric-lg text-primary min-w-[70px]"
                        >10:00</span
                      >
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >Round 1 Pairings Launch</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Default time: 15 minutes after official clock start</span
                        >
                      </div>
                    </div>
                    <span
                      class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-on-surface"
                      >Round 1</span
                    >
                  </div>
                  <!-- Schedule Item 2 -->
                  <div
                    class="relative flex items-center justify-between bg-surface-container p-space-sm rounded-lg hover:bg-surface-container-high transition-colors"
                  >
                    <div
                      class="absolute -left-6 top-1/2 -translate-y-1/2 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                    >
                      <div class="w-2 h-2 rounded-full bg-primary"></div>
                    </div>
                    <div class="flex items-center gap-space-md">
                      <span
                        class="font-label-numeric-lg text-label-numeric-lg text-primary min-w-[70px]"
                        >12:30</span
                      >
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >Round 2 Pairings</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Color alternates confirmed based on Round 1 results</span
                        >
                      </div>
                    </div>
                    <span
                      class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-on-surface"
                      >Round 2</span
                    >
                  </div>
                  <!-- Schedule Item Break -->
                  <div
                    class="relative flex items-center justify-between bg-surface-container-lowest/80 p-space-sm rounded-lg"
                  >
                    <div
                      class="absolute -left-6 top-1/2 -translate-y-1/2 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                    >
                      <div class="w-2 h-2 rounded-full bg-secondary-container"></div>
                    </div>
                    <div class="flex items-center gap-space-md">
                      <span
                        class="font-label-numeric-lg text-label-numeric-lg text-secondary-fixed min-w-[70px]"
                        >14:30</span
                      >
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >Arbiter Recess &amp; Club Luncheon</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Executive lounge buffet &amp; engine-free analysis foyer</span
                        >
                      </div>
                    </div>
                    <span
                      class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container text-on-surface-variant"
                      >60 Min Break</span
                    >
                  </div>
                  <!-- Schedule Item 3 -->
                  <div
                    class="relative flex items-center justify-between bg-surface-container p-space-sm rounded-lg hover:bg-surface-container-high transition-colors"
                  >
                    <div
                      class="absolute -left-6 top-1/2 -translate-y-1/2 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                    >
                      <div class="w-2 h-2 rounded-full bg-primary"></div>
                    </div>
                    <div class="flex items-center gap-space-md">
                      <span
                        class="font-label-numeric-lg text-label-numeric-lg text-primary min-w-[70px]"
                        >15:30</span
                      >
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >Round 3 Pairings</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Top board live streaming initiates on ChessHub broadcast</span
                        >
                      </div>
                    </div>
                    <span
                      class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-on-surface"
                      >Round 3</span
                    >
                  </div>
                  <!-- Schedule Item 4 -->
                  <div
                    class="relative flex items-center justify-between bg-surface-container p-space-sm rounded-lg hover:bg-surface-container-high transition-colors"
                  >
                    <div
                      class="absolute -left-6 top-1/2 -translate-y-1/2 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                    >
                      <div class="w-2 h-2 rounded-full bg-primary"></div>
                    </div>
                    <div class="flex items-center gap-space-md">
                      <span
                        class="font-label-numeric-lg text-label-numeric-lg text-primary min-w-[70px]"
                        >18:00</span
                      >
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >Round 4 Pairings (Penultimate)</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Critical bracket advancement matches</span
                        >
                      </div>
                    </div>
                    <span
                      class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-on-surface"
                      >Round 4</span
                    >
                  </div>
                  <!-- Schedule Item 5 -->
                  <div
                    class="relative flex items-center justify-between bg-surface-container p-space-sm rounded-lg hover:bg-surface-container-high transition-colors"
                  >
                    <div
                      class="absolute -left-6 top-1/2 -translate-y-1/2 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                    >
                      <div class="w-2 h-2 rounded-full bg-primary"></div>
                    </div>
                    <div class="flex items-center gap-space-md">
                      <span
                        class="font-label-numeric-lg text-label-numeric-lg text-primary min-w-[70px]"
                        >20:30</span
                      >
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >Round 5 Final Pairings</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Championship deciding clashes</span
                        >
                      </div>
                    </div>
                    <span
                      class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-on-surface"
                      >Round 5</span
                    >
                  </div>
                  <!-- Schedule Item Award -->
                  <div
                    class="relative flex items-center justify-between bg-surface-container-high p-space-sm rounded-lg"
                  >
                    <div
                      class="absolute -left-6 top-1/2 -translate-y-1/2 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center"
                    >
                      <div class="w-2 h-2 rounded-full bg-secondary-fixed"></div>
                    </div>
                    <div class="flex items-center gap-space-md">
                      <span
                        class="font-label-numeric-lg text-label-numeric-lg text-secondary-fixed min-w-[70px]"
                        >22:00</span
                      >
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >Official Awarding &amp; Trophy Ceremony</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Club rating validation, medal distribution, and closing reception</span
                        >
                      </div>
                    </div>
                    <span
                      class="font-label-badge text-label-badge px-2.5 py-1 rounded bg-secondary-container text-on-secondary-container uppercase"
                      >Ceremony</span
                    >
                  </div>
                </div>
              </div>
              <!-- Participants Roster Section with Search & Table -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-md flex flex-col gap-space-md"
              >
                <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-sm">
                  <div>
                    <div class="flex items-center gap-space-sm">
                      <h2 class="font-headline-md text-headline-md text-on-surface">
                        Registered Participants
                      </h2>
                      <span
                        class="px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-numeric-md text-label-numeric-md"
                      >
                        48 Confirmed
                      </span>
                    </div>
                    <p class="font-body-sm text-body-sm text-on-surface-variant mt-0.5">
                      Seeding ranked by official FIDE Classical Rating as of April 2025.
                    </p>
                  </div>
                  <!-- Participant Search Input -->
                  <div class="relative w-full sm:w-64 sm:shrink-0">
                    <span
                      class="material-symbols-outlined absolute left-3 top-1/2 -translate-y-1/2 text-on-surface-variant text-[18px]"
                      aria-hidden="true"
                      >search</span
                    >
                    <input
                      class="w-full bg-surface-container-lowest text-on-surface placeholder:text-on-surface-variant text-body-md pl-9 pr-3 py-1.5 rounded-lg focus:outline-none focus:ring-1 focus:ring-primary"
                      id="participant-search"
                      placeholder="Search master or rating..."
                      type="text"
                    />
                  </div>
                </div>
                <!-- Standings / Registered Table -->
                <div class="overflow-x-auto rounded-lg">
                  <table class="w-full text-left font-body-md text-body-md" id="roster-table">
                    <thead>
                      <tr
                        class="bg-surface-container-lowest text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                      >
                        <th class="py-2.5 px-3">Seed</th>
                        <th class="py-2.5 px-3">Player</th>
                        <th class="py-2.5 px-3">Title / Rating</th>
                        <th class="py-2.5 px-3">Club Rank</th>
                        <th class="py-2.5 px-3">Registered</th>
                        <th class="py-2.5 px-3 text-right">Status</th>
                      </tr>
                    </thead>
                    <tbody class="divide-y divide-surface-container-highest">
                      <!-- Player 1 -->
                      <tr class="hover:bg-surface-container transition-colors participant-row">
                        <td
                          class="py-2.5 px-3 font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                        >
                          #01
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-space-sm">
                            <div
                              class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-primary text-xs"
                            >
                              GM
                            </div>
                            <div class="flex flex-col">
                              <span class="font-title-md text-title-md text-on-surface player-name"
                                >Alexander Vanev</span
                              >
                              <span class="font-body-sm text-body-sm text-on-surface-variant"
                                >Bulgaria • FIDE ID 2901923</span
                              >
                            </div>
                          </div>
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-1.5">
                            <span
                              class="bg-secondary-container text-on-secondary-container px-1.5 py-0.5 rounded font-label-badge text-label-badge"
                              >GM</span
                            >
                            <span
                              class="font-label-numeric-md text-label-numeric-md text-on-surface"
                              >2465</span
                            >
                          </div>
                        </td>
                        <td class="py-2.5 px-3 text-on-surface font-body-sm text-body-sm">
                          Diamond Fellow
                        </td>
                        <td class="py-2.5 px-3 font-body-sm text-body-sm text-on-surface-variant">
                          Apr 12, 14:20
                        </td>
                        <td class="py-2.5 px-3 text-right">
                          <span
                            class="inline-flex items-center gap-1 px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase"
                          >
                            <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                            Confirmed
                          </span>
                        </td>
                      </tr>
                      <!-- Player 2 -->
                      <tr class="hover:bg-surface-container transition-colors participant-row">
                        <td
                          class="py-2.5 px-3 font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                        >
                          #02
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-space-sm">
                            <div
                              class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-tertiary text-xs"
                            >
                              IM
                            </div>
                            <div class="flex flex-col">
                              <span class="font-title-md text-title-md text-on-surface player-name"
                                >Elena Rostova</span
                              >
                              <span class="font-body-sm text-body-sm text-on-surface-variant"
                                >Estonia • FIDE ID 4511082</span
                              >
                            </div>
                          </div>
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-1.5">
                            <span
                              class="bg-surface-container-highest text-tertiary px-1.5 py-0.5 rounded font-label-badge text-label-badge"
                              >IM</span
                            >
                            <span
                              class="font-label-numeric-md text-label-numeric-md text-on-surface"
                              >2392</span
                            >
                          </div>
                        </td>
                        <td class="py-2.5 px-3 text-on-surface font-body-sm text-body-sm">
                          Platinum Member
                        </td>
                        <td class="py-2.5 px-3 font-body-sm text-body-sm text-on-surface-variant">
                          Apr 14, 09:12
                        </td>
                        <td class="py-2.5 px-3 text-right">
                          <span
                            class="inline-flex items-center gap-1 px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase"
                          >
                            <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                            Confirmed
                          </span>
                        </td>
                      </tr>
                      <!-- Player 3 -->
                      <tr class="hover:bg-surface-container transition-colors participant-row">
                        <td
                          class="py-2.5 px-3 font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                        >
                          #03
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-space-sm">
                            <div
                              class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-secondary text-xs"
                            >
                              FM
                            </div>
                            <div class="flex flex-col">
                              <span class="font-title-md text-title-md text-on-surface player-name"
                                >David Thorne</span
                              >
                              <span class="font-body-sm text-body-sm text-on-surface-variant"
                                >United Kingdom • FIDE ID 412890</span
                              >
                            </div>
                          </div>
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-1.5">
                            <span
                              class="bg-surface-container-highest text-secondary px-1.5 py-0.5 rounded font-label-badge text-label-badge"
                              >FM</span
                            >
                            <span
                              class="font-label-numeric-md text-label-numeric-md text-on-surface"
                              >2318</span
                            >
                          </div>
                        </td>
                        <td class="py-2.5 px-3 text-on-surface font-body-sm text-body-sm">
                          Club Champion '24
                        </td>
                        <td class="py-2.5 px-3 font-body-sm text-body-sm text-on-surface-variant">
                          Apr 15, 18:45
                        </td>
                        <td class="py-2.5 px-3 text-right">
                          <span
                            class="inline-flex items-center gap-1 px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase"
                          >
                            <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                            Confirmed
                          </span>
                        </td>
                      </tr>
                      <!-- Player 4 -->
                      <tr class="hover:bg-surface-container transition-colors participant-row">
                        <td
                          class="py-2.5 px-3 font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                        >
                          #04
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-space-sm">
                            <div
                              class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface-variant text-xs"
                            >
                              CM
                            </div>
                            <div class="flex flex-col">
                              <span class="font-title-md text-title-md text-on-surface player-name"
                                >Lucas Lindqvist</span
                              >
                              <span class="font-body-sm text-body-sm text-on-surface-variant"
                                >Sweden • FIDE ID 1729011</span
                              >
                            </div>
                          </div>
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-1.5">
                            <span
                              class="bg-surface-container-highest text-on-surface-variant px-1.5 py-0.5 rounded font-label-badge text-label-badge"
                              >CM</span
                            >
                            <span
                              class="font-label-numeric-md text-label-numeric-md text-on-surface"
                              >2245</span
                            >
                          </div>
                        </td>
                        <td class="py-2.5 px-3 text-on-surface font-body-sm text-body-sm">
                          Gold Tier
                        </td>
                        <td class="py-2.5 px-3 font-body-sm text-body-sm text-on-surface-variant">
                          Apr 16, 11:03
                        </td>
                        <td class="py-2.5 px-3 text-right">
                          <span
                            class="inline-flex items-center gap-1 px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase"
                          >
                            <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                            Confirmed
                          </span>
                        </td>
                      </tr>
                      <!-- Player 5 -->
                      <tr class="hover:bg-surface-container transition-colors participant-row">
                        <td
                          class="py-2.5 px-3 font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                        >
                          #05
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-space-sm">
                            <div
                              class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface-variant text-xs"
                            >
                              NM
                            </div>
                            <div class="flex flex-col">
                              <span class="font-title-md text-title-md text-on-surface player-name"
                                >Kenji Takahashi</span
                              >
                              <span class="font-body-sm text-body-sm text-on-surface-variant"
                                >Japan • FIDE ID 3289012</span
                              >
                            </div>
                          </div>
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-1.5">
                            <span
                              class="bg-surface-container-highest text-on-surface-variant px-1.5 py-0.5 rounded font-label-badge text-label-badge"
                              >NM</span
                            >
                            <span
                              class="font-label-numeric-md text-label-numeric-md text-on-surface"
                              >2204</span
                            >
                          </div>
                        </td>
                        <td class="py-2.5 px-3 text-on-surface font-body-sm text-body-sm">
                          Gold Tier
                        </td>
                        <td class="py-2.5 px-3 font-body-sm text-body-sm text-on-surface-variant">
                          Apr 17, 16:30
                        </td>
                        <td class="py-2.5 px-3 text-right">
                          <span
                            class="inline-flex items-center gap-1 px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase"
                          >
                            <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                            Confirmed
                          </span>
                        </td>
                      </tr>
                      <!-- Player 6 -->
                      <tr class="hover:bg-surface-container transition-colors participant-row">
                        <td
                          class="py-2.5 px-3 font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                        >
                          #06
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-space-sm">
                            <div
                              class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-bold text-on-surface-variant text-xs"
                            >
                              •
                            </div>
                            <div class="flex flex-col">
                              <span class="font-title-md text-title-md text-on-surface player-name"
                                >Claire De Smet</span
                              >
                              <span class="font-body-sm text-body-sm text-on-surface-variant"
                                >Belgium • FIDE ID 2049182</span
                              >
                            </div>
                          </div>
                        </td>
                        <td class="py-2.5 px-3">
                          <div class="flex items-center gap-1.5">
                            <span
                              class="bg-surface-container-highest text-on-surface-variant px-1.5 py-0.5 rounded font-label-badge text-label-badge"
                              >WFM</span
                            >
                            <span
                              class="font-label-numeric-md text-label-numeric-md text-on-surface"
                              >2160</span
                            >
                          </div>
                        </td>
                        <td class="py-2.5 px-3 text-on-surface font-body-sm text-body-sm">
                          Silver Member
                        </td>
                        <td class="py-2.5 px-3 font-body-sm text-body-sm text-on-surface-variant">
                          Apr 18, 08:22
                        </td>
                        <td class="py-2.5 px-3 text-right">
                          <span
                            class="inline-flex items-center gap-1 px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase"
                          >
                            <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                            Confirmed
                          </span>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
                <!-- Bottom Roster Note -->
                <div
                  class="flex items-center justify-between text-on-surface-variant font-body-sm text-body-sm pt-space-xs"
                >
                  <span
                    >Showing top seeds (42 additional players listed in federation manifest).</span
                  >
                  <button
                    class="text-primary hover:underline flex items-center gap-1 font-title-md text-title-md"
                    disabled
                    title="Design preview"
                  >
                    <span>Download Full Swiss Seed List (.pdf)</span>
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >download</span
                    >
                  </button>
                </div>
              </div>
              <!-- Tournament Regulations & Equipment -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-md flex flex-col gap-space-md"
              >
                <h2
                  class="font-headline-md text-headline-md text-on-surface flex items-center gap-space-sm"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[28px]"
                    aria-hidden="true"
                    >verified</span
                  >
                  Tournament Regulations &amp; Equipment
                </h2>
                <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md">
                  <div class="bg-surface-container p-space-md rounded-lg flex flex-col gap-2">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                        >grid_4x4</span
                      >
                    </div>
                    <h3 class="font-title-md text-title-md text-on-surface">
                      DGT Wireless e-Boards
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Full-size walnut and maple tournament boards equipped with optical piece
                      sensors. No move recording lag.
                    </p>
                  </div>
                  <div class="bg-surface-container p-space-md rounded-lg flex flex-col gap-2">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                        >timer_10</span
                      >
                    </div>
                    <h3 class="font-title-md text-title-md text-on-surface">
                      DGT 3000 Digital Clocks
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Official FIDE clock synchronisation with automated delay/increment validation
                      per certified arbiter desk.
                    </p>
                  </div>
                  <div class="bg-surface-container p-space-md rounded-lg flex flex-col gap-2">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                        >edit_note</span
                      >
                    </div>
                    <h3 class="font-title-md text-title-md text-on-surface">Carbon Score Sheets</h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Triplicate official scoresheets provided. Compulsory recording until under 5
                      minutes remaining on clock.
                    </p>
                  </div>
                </div>
                <div
                  class="bg-surface-container p-space-md rounded-lg text-body-sm text-on-surface-variant space-y-1.5"
                >
                  <p>
                    <strong class="text-on-surface">Fair Play &amp; Device Policy:</strong> Mobile
                    phones, smartwatches, and wireless transceivers must be powered off and stowed
                    inside dedicated arbiter storage lockers upon entering Hall 4A.
                  </p>
                  <p>
                    <strong class="text-on-surface">Appeals Committee:</strong> Protest submissions
                    must be filed in writing with Chief Arbiter Sarah Jenkins within 15 minutes of
                    round conclusion accompanied by the standard €50 deposit.
                  </p>
                </div>
              </div>
            </section>
            <!-- RIGHT COLUMN: Sticky Action & Details Cards (4 Cols) -->
            <aside class="lg:col-span-4 flex flex-col gap-space-lg lg:sticky lg:top-20">
              <!-- PRIMARY REGISTRATION ACTION CARD -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-xl flex flex-col gap-space-md"
              >
                <!-- Registration Status Header -->
                <div class="flex items-center justify-between">
                  <span
                    class="inline-flex items-center gap-1.5 px-2.5 py-1 rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
                    Registration Open
                  </span>
                  <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold">
                    16 spots left
                  </span>
                </div>
                <!-- Capacity Bar Gauge -->
                <div class="flex flex-col gap-1.5">
                  <div class="flex justify-between font-body-sm text-body-sm">
                    <span class="text-on-surface-variant">Current Capacity</span>
                    <span class="text-on-surface font-label-numeric-md text-label-numeric-md"
                      >48 / 64 Players (75%)</span
                    >
                  </div>
                  <div
                    class="w-full h-2.5 rounded-full bg-surface-container-highest overflow-hidden p-0.5"
                  >
                    <div
                      class="h-full rounded-full bg-primary transition-all duration-500"
                      style="width: 75%"
                    ></div>
                  </div>
                </div>
                <!-- Countdown / Deadline Indicator -->
                <div
                  class="bg-surface-container p-space-sm rounded-lg flex items-center gap-space-sm"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >hourglass_top</span
                  >
                  <div class="flex flex-col">
                    <span class="text-on-surface font-title-md text-title-md"
                      >3 Days Remaining</span
                    >
                    <span class="text-on-surface-variant font-body-sm text-body-sm"
                      >Closes April 23, 2025 • 23:59 UTC</span
                    >
                  </div>
                </div>
                <!-- Logged-in User Status -->
                <div
                  class="p-space-sm rounded-lg bg-surface-container-high flex items-center justify-between"
                >
                  <div class="flex items-center gap-2">
                    <span
                      class="material-symbols-outlined text-on-surface-variant text-[20px]"
                      aria-hidden="true"
                      >person</span
                    >
                    <span class="font-body-md text-body-md text-on-surface-variant"
                      >Your Status:</span
                    >
                  </div>
                  <span
                    class="font-label-badge text-label-badge text-error bg-error-container/30 px-2 py-0.5 rounded uppercase"
                  >
                    Not Registered
                  </span>
                </div>
                <!-- Pricing & Fee Callout -->
                <div class="flex items-baseline justify-between pt-1">
                  <div class="flex flex-col">
                    <span
                      class="font-label-badge text-label-badge uppercase text-on-surface-variant"
                      >Tournament Entry Fee</span
                    >
                    <span class="font-display-lg text-display-lg text-on-surface">€0.00</span>
                  </div>
                  <span
                    class="text-primary font-body-sm text-body-sm bg-secondary-container px-2 py-1 rounded"
                  >
                    Free with Club Pass
                  </span>
                </div>
                <!-- Primary Registration CTA Button -->
                <button
                  class="w-full py-3.5 px-4 bg-primary text-on-primary rounded-lg font-title-md text-title-md font-bold tracking-tight hover:bg-primary-container focus:outline-none focus:ring-2 focus:ring-primary shadow-lg shadow-primary/20 transition-all flex items-center justify-center gap-2"
                  type="button"
                  v-preview-disclosure="'registration-modal'"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >how_to_reg</span
                  >
                  <span>Register for Event</span>
                </button>
                <!-- Secondary Actions (Share / Add to Cal) -->
                <div class="grid grid-cols-2 gap-space-xs pt-space-xs">
                  <button
                    class="w-full py-2 px-3 bg-surface-container hover:bg-surface-container-high text-on-surface rounded-lg font-body-md text-body-md transition-colors flex items-center justify-center gap-1.5"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >share</span
                    >
                    <span id="share-text">Share Event</span>
                  </button>
                  <button
                    class="w-full py-2 px-3 bg-surface-container hover:bg-surface-container-high text-on-surface rounded-lg font-body-md text-body-md transition-colors flex items-center justify-center gap-1.5"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >event</span
                    >
                    <span>Add to .ICS</span>
                  </button>
                </div>
                <p class="font-body-sm text-body-sm text-on-surface-variant text-center pt-1">
                  Standard FIDE Classical rating changes apply automatically upon arbitrated
                  submission.
                </p>
              </div>
              <!-- VENUE & LOGISTICS CARD -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-md flex flex-col gap-space-md"
              >
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[24px]"
                    aria-hidden="true"
                    >location_on</span
                  >
                  <h3 class="font-headline-sm text-headline-sm text-on-surface">
                    Venue &amp; Logistics
                  </h3>
                </div>
                <div>
                  <span class="font-title-md text-title-md text-on-surface block"
                    >Grandmaster Hall, Main Club Lounge</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >4th Floor • Zurich Chess Club Center</span
                  >
                  <p class="font-body-sm text-body-sm text-on-surface-variant mt-1">
                    Gotthardstrasse 12, 8002 Zürich, Switzerland
                  </p>
                </div>
                <!-- Static Location Visual Container -->
                <div
                  class="w-full h-44 rounded-lg bg-cover bg-center relative overflow-hidden flex items-end p-space-sm"
                  data-alt="Satellite architectural stylized dark map aerial view of Zurich Old Town Gotthardstrasse urban street network with dark slate asphalt tones, subtle minimalist glowing streets, and green destination location beacon pin marking tournament chess hall."
                  data-location="Zurich Chess Club, Gotthardstrasse 12, Zurich, Switzerland"
                  style="background-image: url('/images/2f7175dd96a7.webp')"
                >
                  <div
                    class="bg-surface-container-lowest/90 backdrop-blur-md px-2.5 py-1.5 rounded flex items-center gap-2"
                  >
                    <span class="w-2 h-2 rounded-full bg-primary"></span>
                    <span class="font-body-sm text-body-sm text-on-surface font-semibold"
                      >Zurich HQ Hall 4A</span
                    >
                  </div>
                </div>
                <!-- Contact Organizer Button -->
                <button
                  class="w-full py-2.5 px-3 bg-surface-container hover:bg-surface-container-high text-on-surface rounded-lg font-body-md text-body-md transition-colors flex items-center justify-center gap-2"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true">mail</span>
                  <span>Contact Arbiter Committee</span>
                </button>
              </div>
              <!-- CANCELLATION & POLICY CARD -->
              <div
                class="bg-surface-container-low/70 rounded-xl p-space-md shadow-sm flex items-start gap-space-sm"
              >
                <span
                  class="material-symbols-outlined text-secondary text-[22px] mt-0.5"
                  aria-hidden="true"
                  >policy</span
                >
                <div class="flex flex-col gap-1">
                  <span class="font-title-md text-title-md text-on-surface"
                    >Cancellation Policy</span
                  >
                  <p class="font-body-sm text-body-sm text-on-surface-variant leading-relaxed">
                    Free participant withdrawal up to 24h prior to Round 1 pairing publishing.
                    Unannounced no-shows are subject to a 1-month Swiss pairing suspension.
                  </p>
                </div>
              </div>
            </aside>
          </div>
        </div>
        <!-- REGISTRATION CONFIRMATION MODAL (Hidden by default, triggered via Register CTA) -->
        <div
          aria-labelledby="modal-headline"
          aria-modal="true"
          class="fixed inset-0 z-50 flex items-center justify-center p-space-md bg-black/80 backdrop-blur-sm hidden preview-disclosure preview-disclosure-flex"
          id="registration-modal"
          role="dialog"
        >
          <div
            class="bg-surface-container-high rounded-xl max-w-lg w-full p-space-xl shadow-2xl relative animate-fade-in flex flex-col gap-space-md"
          >
            <!-- Close button -->
            <button
              aria-label="Close dialog"
              class="absolute top-4 right-4 text-on-surface-variant hover:text-on-surface p-1 rounded-lg hover:bg-surface-container-highest transition-colors"
              type="button"
              v-preview-disclosure="'registration-modal'"
              data-preview-dismiss=""
            >
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true">close</span>
            </button>
            <!-- Modal Header -->
            <div class="flex items-center gap-space-sm">
              <div
                class="w-10 h-10 rounded-lg bg-secondary-container flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                  >verified_user</span
                >
              </div>
              <div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface" id="modal-headline">
                  Confirm Registration
                </h3>
                <span class="font-body-sm text-body-sm text-on-surface-variant"
                  >Spring Swiss Championship 2025</span
                >
              </div>
            </div>
            <!-- Registration Summary Details -->
            <div
              class="bg-surface-container p-space-md rounded-lg flex flex-col gap-space-xs font-body-sm text-body-sm"
            >
              <div class="flex justify-between py-1">
                <span class="text-on-surface-variant">Candidate:</span>
                <span class="text-on-surface font-title-md text-title-md"
                  >Candidate Master (Logged in)</span
                >
              </div>
              <div class="flex justify-between py-1">
                <span class="text-on-surface-variant">FIDE ID / Club Rating:</span>
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                  >#912048 (2115 Classical)</span
                >
              </div>
              <div class="flex justify-between py-1">
                <span class="text-on-surface-variant">Time Control:</span>
                <span class="text-primary font-semibold">60m + 30s increment</span>
              </div>
              <div class="flex justify-between py-1">
                <span class="text-on-surface-variant">Entry Fee:</span>
                <span class="text-secondary-fixed font-bold">€0.00 (Active Membership)</span>
              </div>
            </div>
            <!-- Verification Checkbox -->
            <div class="flex items-start gap-space-sm pt-1">
              <input
                checked
                class="mt-1 w-4 h-4 rounded bg-surface-container-lowest text-primary focus:ring-primary focus:ring-offset-surface-container-high"
                id="fide-policy-agree"
                type="checkbox"
              />
              <label
                class="font-body-sm text-body-sm text-on-surface-variant select-none"
                for="fide-policy-agree"
              >
                I pledge to abide by the FIDE Fair Play rules, adhere to zero-tolerance electronic
                presence, and confirm my physical attendance before 09:30 UTC for Round 1 check-in.
              </label>
            </div>
            <!-- Modal Action Buttons -->
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-4 py-2 rounded-lg bg-surface-container hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors"
                type="button"
                v-preview-disclosure="'registration-modal'"
                data-preview-dismiss=""
              >
                Cancel
              </button>
              <button
                class="px-5 py-2 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md font-bold transition-all shadow-md flex items-center gap-1.5"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >check_circle</span
                >
                <span>Confirm &amp; Join Swiss Roster</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Client-side Interactive Functions -->
      </div>
    </main>
  </ClubLayout>
</template>
