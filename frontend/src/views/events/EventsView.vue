<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin-desktop">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Top Navigation Sub-Bar & Direct Access -->
        <div
          class="w-full flex flex-col md:flex-row md:items-end justify-between gap-space-md pt-space-md mb-space-lg"
        >
          <div>
            <div
              class="flex items-center gap-space-xs text-primary mb-space-xs font-label-badge text-label-badge uppercase tracking-widest"
            >
              <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
              Federation Schedule • Season 2025
            </div>
            <h1 class="font-headline-lg text-headline-lg text-on-surface">
              Club Events &amp; Tournaments
            </h1>
            <p class="font-body-md text-body-md text-on-surface-variant max-w-2xl mt-1">
              Discover upcoming rated tournaments, club competitions, simultaneous exhibitions, and
              community social sessions.
            </p>
          </div>
          <!-- Quick Navigation to My Events -->
          <div class="flex items-center gap-space-sm self-start md:self-auto">
            <span
              class="group flex items-center gap-space-sm px-space-md py-space-sm bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded-lg transition-all shadow-sm"
              data-path="my-events"
            >
              <span
                class="material-symbols-outlined text-[18px] text-primary group-hover:scale-110 transition-transform"
                aria-hidden="true"
                >confirmation_number</span
              >
              <span class="font-title-md text-title-md">My Registered Events</span>
              <span
                class="px-space-xs py-0.5 rounded text-[11px] font-label-badge bg-primary-container/30 text-primary-fixed"
                >3 Active</span
              >
            </span>
          </div>
        </div>
        <!-- Featured Event Banner (Spring Swiss Championship 2025) -->
        <section
          class="relative w-full rounded-xl overflow-hidden bg-surface-container mb-space-xl shadow-xl"
        >
          <!-- Visual Background with Scrim -->
          <div
            class="absolute inset-0 bg-cover bg-center"
            data-alt="Intense high-stakes chess tournament arena with wooden DGT sensory boards, soft atmospheric spotlighting on dark walnut chess pieces, digital clocks showing precise increments, and focused grandmaster competitors in a sleek architectural gallery with dark basalt finishes and muted green ambient club glow."
            style="background-image: url('/images/f2cf7cf9a56c.webp')"
          ></div>
          <div
            class="absolute inset-0 bg-gradient-to-r from-surface-container-lowest via-surface-container-lowest/90 to-surface-container-lowest/40"
          ></div>
          <div
            class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest via-transparent to-transparent"
          ></div>
          <div
            class="relative z-10 p-space-lg md:p-space-xl flex flex-col justify-between min-h-[380px] max-w-3xl"
          >
            <!-- Top Tag Array -->
            <div class="flex flex-wrap items-center gap-space-xs">
              <span
                class="px-space-sm py-0.5 rounded-full bg-primary/20 text-primary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-1"
              >
                <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                  >verified</span
                >
                Official FIDE &amp; Club Rated
              </span>
              <span
                class="px-space-sm py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge"
              >
                Standard Swiss • 9 Rounds
              </span>
              <span
                class="px-space-sm py-0.5 rounded-full bg-error-container/40 text-error font-label-badge text-label-badge flex items-center gap-1"
              >
                <span class="material-symbols-outlined text-[13px]" aria-hidden="true">alarm</span>
                Registration Closes in 3 days
              </span>
            </div>
            <!-- Center Title & Specs -->
            <div class="my-space-md">
              <h2
                class="font-display-lg text-display-lg text-on-surface tracking-tight leading-tight"
              >
                Spring Swiss Championship 2025
              </h2>
              <p class="font-body-lg text-body-lg text-on-surface-variant mt-space-xs max-w-xl">
                The premier seasonal classical tournament. FIDE standard rated with grandmaster
                arbiters, live digital DGT broadcast, and $4,500 guaranteed prize pool.
              </p>
              <!-- Metadata row -->
              <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-sm mt-space-md pt-space-sm">
                <div class="flex items-center gap-space-xs text-on-surface">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >calendar_today</span
                  >
                  <span class="font-body-md text-body-md"
                    >Saturday, April 26, 2025 • 10:00 UTC</span
                  >
                </div>
                <div class="flex items-center gap-space-xs text-on-surface">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >location_on</span
                  >
                  <span class="font-body-md text-body-md">Grandmaster Hall, Main Club Lounge</span>
                </div>
              </div>
              <!-- Capacity Gauge -->
              <div
                class="mt-space-md max-w-md bg-surface-container-high/80 backdrop-blur p-space-sm rounded-lg"
              >
                <div class="flex items-center justify-between text-body-sm font-body-sm mb-1.5">
                  <span class="text-on-surface font-title-md text-title-md"
                    >Registration Status</span
                  >
                  <span class="text-primary font-label-numeric-md text-label-numeric-md"
                    >48 / 64 Registered</span
                  >
                </div>
                <div class="w-full h-2 rounded-full bg-surface-container-lowest overflow-hidden">
                  <div
                    class="h-full bg-primary rounded-full transition-all duration-500"
                    style="width: 75%"
                  ></div>
                </div>
                <div
                  class="flex items-center justify-between text-[11px] text-on-surface-variant font-body-sm mt-1"
                >
                  <span>Club verification required</span>
                  <span class="text-secondary font-semibold">16 Seats Remaining</span>
                </div>
              </div>
            </div>
            <!-- Action Buttons -->
            <div class="flex flex-wrap items-center gap-space-md pt-space-xs">
              <button
                class="px-space-lg py-space-sm bg-primary hover:bg-primary-container text-on-primary rounded-lg font-title-md text-title-md flex items-center gap-space-xs shadow-md transition-all active:scale-[0.98]"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >how_to_reg</span
                >
                Register for Tournament
              </button>
              <button
                class="px-space-lg py-space-sm bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded-lg font-title-md text-title-md flex items-center gap-space-xs transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
                View Details &amp; Regulations
              </button>
            </div>
          </div>
        </section>
        <!-- Filter & Control Toolbar -->
        <section
          class="w-full bg-surface-container-low p-space-md rounded-xl shadow-sm mb-space-lg"
        >
          <div class="flex flex-col lg:flex-row lg:items-center justify-between gap-space-md">
            <!-- Category Tabs (Desktop Overflow Handled) -->
            <div
              class="flex items-center gap-1 overflow-x-auto pb-1 lg:pb-0 scrollbar-none"
              id="categoryFilterBar"
            >
              <button
                class="event-filter-btn px-space-md py-space-xs rounded-lg font-title-md text-title-md bg-primary text-on-primary font-semibold whitespace-nowrap transition-colors"
                data-category="all"
                type="button"
                disabled
                title="Design preview"
              >
                All Events
              </button>
              <RouterLink
                class="event-filter-btn px-space-md py-space-xs rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-colors whitespace-nowrap"
                data-category="tournaments"
                to="/events"
              >
                Tournaments
              </RouterLink>
              <button
                class="event-filter-btn px-space-md py-space-xs rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-colors whitespace-nowrap"
                data-category="friendly"
                type="button"
                disabled
                title="Design preview"
              >
                Friendly Matches
              </button>
              <button
                class="event-filter-btn px-space-md py-space-xs rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-colors whitespace-nowrap"
                data-category="simuls"
                type="button"
                disabled
                title="Design preview"
              >
                Simuls
              </button>
              <button
                class="event-filter-btn px-space-md py-space-xs rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-colors whitespace-nowrap"
                data-category="socials"
                type="button"
                disabled
                title="Design preview"
              >
                Club Socials
              </button>
            </div>
            <!-- Right Hand Controls: Time Status Toggle + Date Filter + Search Input -->
            <div class="flex flex-wrap sm:flex-nowrap items-center gap-space-sm">
              <!-- Status Toggle (Upcoming vs Past) -->
              <div class="bg-surface-container-lowest p-1 rounded-lg flex items-center">
                <button
                  class="px-space-sm py-1 rounded font-body-sm text-body-sm bg-surface-container-high text-primary font-semibold transition-all"
                  id="statusUpcoming"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Upcoming
                </button>
                <button
                  class="px-space-sm py-1 rounded font-body-sm text-body-sm text-on-surface-variant hover:text-on-surface transition-all"
                  id="statusPast"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Past
                </button>
              </div>
              <!-- Date Dropdown Filter -->
              <div class="relative">
                <button
                  class="flex items-center gap-space-xs px-space-md py-space-xs rounded-lg bg-surface-container text-on-surface font-body-md text-body-md hover:bg-surface-container-high transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span
                    class="material-symbols-outlined text-[18px] text-primary"
                    aria-hidden="true"
                    >event</span
                  >
                  <span>All Dates</span>
                  <span
                    class="material-symbols-outlined text-[16px] text-on-surface-variant"
                    aria-hidden="true"
                    >expand_more</span
                  >
                </button>
              </div>
              <!-- Search Input -->
              <div class="relative flex-1 sm:w-64">
                <span
                  class="material-symbols-outlined absolute left-space-sm top-1/2 -translate-y-1/2 text-on-surface-variant text-[18px]"
                  aria-hidden="true"
                  >search</span
                >
                <input
                  class="w-full bg-surface-container pl-9 pr-space-md py-space-xs rounded-lg text-on-surface placeholder:text-outline font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-all"
                  id="eventSearchInput"
                  placeholder="Search by event, title, master..."
                  type="text"
                />
              </div>
            </div>
          </div>
        </section>
        <!-- Event Grid (3-Column Desktop Mosaic) -->
        <div
          class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-space-lg"
          id="eventsGridContainer"
        >
          <!-- Card 1: Rapid Grand Prix — Stage 2 -->
          <article
            class="event-card group bg-surface-container-low hover:bg-surface-container rounded-xl overflow-hidden flex flex-col justify-between transition-all duration-200 shadow-sm hover:shadow-lg"
            data-category="tournaments"
            data-title="Rapid Grand Prix Stage 2"
          >
            <div>
              <!-- Visual Media -->
              <div class="relative h-48 w-full overflow-hidden bg-surface-container-highest">
                <div
                  class="w-full h-full bg-cover bg-center group-hover:scale-105 transition-transform duration-500"
                  data-alt="Intense rapid chess match in progress with two competitive club players seated opposite each other, close shot on weighted rosewood pieces, dual-display digital blitz clocks counting seconds, low dramatic overhead illumination with verdant accents."
                  style="background-image: url('/images/5ce91cb8cf1b.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-transparent to-transparent"
                ></div>
                <div class="absolute top-space-sm left-space-sm flex gap-1">
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-primary text-on-primary uppercase font-bold tracking-wider"
                    >Tournament</span
                  >
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-surface-container-lowest/80 backdrop-blur text-primary-fixed uppercase tracking-wider"
                    >Rated</span
                  >
                </div>
                <div
                  class="absolute bottom-space-sm left-space-sm right-space-sm flex justify-between items-end"
                >
                  <span
                    class="px-space-xs py-0.5 rounded text-[11px] font-label-numeric-md bg-surface-container-high/90 text-on-surface backdrop-blur"
                  >
                    5 Rounds • 15+10
                  </span>
                  <span
                    class="px-space-xs py-0.5 rounded text-[11px] font-label-badge bg-secondary-container text-on-secondary-container"
                  >
                    Free for Members
                  </span>
                </div>
              </div>
              <!-- Event Body -->
              <div class="p-space-md">
                <h3
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors"
                >
                  Rapid Grand Prix — Stage 2
                </h3>
                <div
                  class="flex flex-col gap-1.5 mt-space-sm text-on-surface-variant font-body-sm text-body-sm"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                    <span>Saturday, May 3, 2025 • 13:00 UTC</span>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >location_on</span
                    >
                    <span>Arena Room B • Clocks Provided</span>
                  </div>
                </div>
                <!-- Capacity Bar -->
                <div class="mt-space-md bg-surface-container-highest/60 p-space-xs rounded-lg">
                  <div class="flex justify-between items-center text-body-sm font-body-sm mb-1">
                    <span class="text-on-surface-variant text-[12px]">Cap: 32/40 Registered</span>
                    <span class="text-primary font-semibold text-[12px]">8 seats left</span>
                  </div>
                  <div
                    class="w-full h-1.5 bg-surface-container-lowest rounded-full overflow-hidden"
                  >
                    <div class="bg-primary h-full rounded-full" style="width: 80%"></div>
                  </div>
                </div>
              </div>
            </div>
            <!-- Action Footer -->
            <div class="p-space-md pt-0 flex items-center gap-space-sm">
              <RouterLink
                class="w-full py-space-xs bg-primary hover:bg-primary-container text-on-primary rounded font-title-md text-title-md font-semibold transition-colors flex items-center justify-center gap-1"
                to="/register"
              >
                <span>Register</span>
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >arrow_forward</span
                >
              </RouterLink>
              <button
                aria-label="Details"
                class="px-space-sm py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded transition-colors flex items-center justify-center"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
              </button>
            </div>
          </article>
          <!-- Card 2: Simultaneous Exhibition w/ GM Marcus Vance -->
          <article
            class="event-card group bg-surface-container-low hover:bg-surface-container rounded-xl overflow-hidden flex flex-col justify-between transition-all duration-200 shadow-sm hover:shadow-lg"
            data-category="simuls"
            data-title="Simultaneous Exhibition Marcus Vance"
          >
            <div>
              <div class="relative h-48 w-full overflow-hidden bg-surface-container-highest">
                <div
                  class="w-full h-full bg-cover bg-center group-hover:scale-105 transition-transform duration-500"
                  data-alt="Distinguished Grandmaster walking inside a large U-shaped ring of twenty wooden tournament chess tables, contemplating a complex middlegame pawn structure against eager challenger club members, ambient moody architectural library lighting."
                  style="background-image: url('/images/e04138d0ac27.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-transparent to-transparent"
                ></div>
                <div class="absolute top-space-sm left-space-sm flex gap-1">
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-tertiary-container text-on-tertiary-container uppercase font-bold tracking-wider"
                    >Simultaneous</span
                  >
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-surface-container-lowest/80 backdrop-blur text-primary-fixed uppercase tracking-wider"
                    >GM Masterclass</span
                  >
                </div>
                <div class="absolute bottom-space-sm right-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-error-container text-on-error-container font-semibold animate-pulse"
                  >
                    Only 2 left!
                  </span>
                </div>
              </div>
              <div class="p-space-md">
                <h3
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors"
                >
                  Simul w/ GM Marcus Vance
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant line-clamp-2 mt-1">
                  Play against our resident Grandmaster on 20 simultaneous boards. Post-game
                  analysis and game score annotations included.
                </p>
                <div
                  class="flex flex-col gap-1.5 mt-space-sm text-on-surface-variant font-body-sm text-body-sm"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                    <span>Saturday, May 10, 2025 • 15:00 UTC</span>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >location_on</span
                    >
                    <span>Rotunda Exhibition Circle</span>
                  </div>
                </div>
                <div class="mt-space-md bg-surface-container-highest/60 p-space-xs rounded-lg">
                  <div class="flex justify-between items-center text-body-sm font-body-sm mb-1">
                    <span class="text-on-surface-variant text-[12px]">Cap: 18/20 Boards</span>
                    <span class="text-error font-semibold text-[12px]">Almost Full</span>
                  </div>
                  <div
                    class="w-full h-1.5 bg-surface-container-lowest rounded-full overflow-hidden"
                  >
                    <div class="bg-error h-full rounded-full" style="width: 90%"></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="p-space-md pt-0 flex items-center gap-space-sm">
              <button
                class="w-full py-space-xs bg-primary hover:bg-primary-container text-on-primary rounded font-title-md text-title-md font-semibold transition-colors flex items-center justify-center gap-1"
                type="button"
                disabled
                title="Design preview"
              >
                <span>Claim Seat</span>
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >sports_martial_arts</span
                >
              </button>
              <button
                aria-label="Details"
                class="px-space-sm py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded transition-colors flex items-center justify-center"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
              </button>
            </div>
          </article>
          <!-- Card 3: Casual Blitz Night & Social Pairing -->
          <article
            class="event-card group bg-surface-container-low hover:bg-surface-container rounded-xl overflow-hidden flex flex-col justify-between transition-all duration-200 shadow-sm hover:shadow-lg"
            data-category="socials"
            data-title="Casual Blitz Night Social Pairing"
          >
            <div>
              <div class="relative h-48 w-full overflow-hidden bg-surface-container-highest">
                <div
                  class="w-full h-full bg-cover bg-center group-hover:scale-105 transition-transform duration-500"
                  data-alt="Lively chess club lounge in the evening, comfortable leather armchairs, casual blitz players smiling over coffee and artisanal drinks, warm amber lighting with crisp green accent details, relaxed competitive community feel."
                  style="background-image: url('/images/8973e8e7c42d.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-transparent to-transparent"
                ></div>
                <div class="absolute top-space-sm left-space-sm flex gap-1">
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-secondary-container text-on-secondary-container uppercase font-bold tracking-wider"
                    >Club Social</span
                  >
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-surface-container-lowest/80 backdrop-blur text-on-surface-variant uppercase tracking-wider"
                    >Casual</span
                  >
                </div>
                <div class="absolute bottom-space-sm left-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded text-[11px] font-label-numeric-md bg-surface-container-high/90 text-on-surface backdrop-blur"
                  >
                    3+2 Blitz • No Ratings
                  </span>
                </div>
              </div>
              <div class="p-space-md">
                <h3
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors"
                >
                  Casual Blitz Night &amp; Social
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant line-clamp-2 mt-1">
                  Drop-in evening of friendly time scramble blitz, craft draft beverages, and
                  free-form pairing desks. Lounge bar open.
                </p>
                <div
                  class="flex flex-col gap-1.5 mt-space-sm text-on-surface-variant font-body-sm text-body-sm"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >event_repeat</span
                    >
                    <span>Every Thursday • 19:00 UTC</span>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >local_bar</span
                    >
                    <span>The Bishop's Lounge &amp; Terrace</span>
                  </div>
                </div>
                <div class="mt-space-md bg-surface-container-highest/60 p-space-xs rounded-lg">
                  <div class="flex justify-between items-center text-body-sm font-body-sm mb-1">
                    <span class="text-on-surface-variant text-[12px]"
                      >Capacity: Open Club Deck</span
                    >
                    <span class="text-secondary font-semibold text-[12px]">Unlimited</span>
                  </div>
                  <div
                    class="w-full h-1.5 bg-surface-container-lowest rounded-full overflow-hidden"
                  >
                    <div class="bg-secondary h-full rounded-full" style="width: 100%"></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="p-space-md pt-0 flex items-center gap-space-sm">
              <button
                class="w-full py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded font-title-md text-title-md font-semibold transition-colors flex items-center justify-center gap-1"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >thumb_up</span
                >
                <span>RSVP Free</span>
              </button>
              <button
                aria-label="Details"
                class="px-space-sm py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded transition-colors flex items-center justify-center"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
              </button>
            </div>
          </article>
          <!-- Card 4: Junior & Beginner Club Open -->
          <article
            class="event-card group bg-surface-container-low hover:bg-surface-container rounded-xl overflow-hidden flex flex-col justify-between transition-all duration-200 shadow-sm hover:shadow-lg"
            data-category="friendly"
            data-title="Junior Beginner Club Open"
          >
            <div>
              <div class="relative h-48 w-full overflow-hidden bg-surface-container-highest">
                <div
                  class="w-full h-full bg-cover bg-center group-hover:scale-105 transition-transform duration-500"
                  data-alt="Young chess club prodigy and enthusiastic beginner analyzing an endgame position on a pristine vinyl board, wooden tournament pieces, supportive arbiter coaching in background, clean modernist interior."
                  style="background-image: url('/images/456062b7edc5.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-transparent to-transparent"
                ></div>
                <div class="absolute top-space-sm left-space-sm flex gap-1">
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-surface-container-highest text-on-surface-variant uppercase font-bold tracking-wider"
                    >Friendly Matches</span
                  >
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-primary-container/30 text-primary-fixed uppercase tracking-wider"
                    >Beginner</span
                  >
                </div>
                <div class="absolute bottom-space-sm left-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded text-[11px] font-label-numeric-md bg-surface-container-high/90 text-on-surface backdrop-blur"
                  >
                    4 Rounds • 30+0
                  </span>
                </div>
              </div>
              <div class="p-space-md">
                <h3
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors"
                >
                  Junior &amp; Beginner Club Open
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant line-clamp-2 mt-1">
                  Tailored Swiss pairings specifically calibrated for developing tacticians under
                  1400 experience. Friendly arbiters on hand.
                </p>
                <div
                  class="flex flex-col gap-1.5 mt-space-sm text-on-surface-variant font-body-sm text-body-sm"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                    <span>Saturday, May 17, 2025 • 09:30 UTC</span>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >location_on</span
                    >
                    <span>Junior Training Academy Hall</span>
                  </div>
                </div>
                <div class="mt-space-md bg-surface-container-highest/60 p-space-xs rounded-lg">
                  <div class="flex justify-between items-center text-body-sm font-body-sm mb-1">
                    <span class="text-on-surface-variant text-[12px]">Cap: 22/30 Registered</span>
                    <span class="text-primary font-semibold text-[12px]">8 seats left</span>
                  </div>
                  <div
                    class="w-full h-1.5 bg-surface-container-lowest rounded-full overflow-hidden"
                  >
                    <div class="bg-primary h-full rounded-full" style="width: 73%"></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="p-space-md pt-0 flex items-center gap-space-sm">
              <RouterLink
                class="w-full py-space-xs bg-primary hover:bg-primary-container text-on-primary rounded font-title-md text-title-md font-semibold transition-colors flex items-center justify-center gap-1"
                to="/register"
              >
                <span>Register</span>
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >add_circle</span
                >
              </RouterLink>
              <button
                aria-label="Details"
                class="px-space-sm py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded transition-colors flex items-center justify-center"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
              </button>
            </div>
          </article>
          <!-- Card 5: Classical Invitational — Round 6 -->
          <article
            class="event-card group bg-surface-container-low hover:bg-surface-container rounded-xl overflow-hidden flex flex-col justify-between transition-all duration-200 shadow-sm hover:shadow-lg"
            data-category="tournaments"
            data-title="Classical Invitational Round 6"
          >
            <div>
              <div class="relative h-48 w-full overflow-hidden bg-surface-container-highest">
                <div
                  class="w-full h-full bg-cover bg-center group-hover:scale-105 transition-transform duration-500"
                  data-alt="Quiet prestigious classical tournament hall, players writing moves carefully on carbon notation score sheets, bespoke mahogany chess tables, strict silent concentration, FIDE certified clocks."
                  style="background-image: url('/images/ec10f072ace6.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-transparent to-transparent"
                ></div>
                <div class="absolute top-space-sm left-space-sm flex gap-1">
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-primary text-on-primary uppercase font-bold tracking-wider"
                    >Tournament</span
                  >
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-surface-container-lowest/80 backdrop-blur text-error uppercase tracking-wider"
                    >Advanced</span
                  >
                </div>
                <div class="absolute bottom-space-sm left-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded text-[11px] font-label-numeric-md bg-surface-container-high/90 text-on-surface backdrop-blur"
                  >
                    90+30 Classical Standard
                  </span>
                </div>
              </div>
              <div class="p-space-md">
                <h3
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors"
                >
                  Classical Invitational — Round 6
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant line-clamp-2 mt-1">
                  FIDE standard classical time control with formal score-sheet notation required.
                  Broadcast live on ChessHub TV.
                </p>
                <div
                  class="flex flex-col gap-1.5 mt-space-sm text-on-surface-variant font-body-sm text-body-sm"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                    <span>Saturday, May 24, 2025 • 11:00 UTC</span>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >location_on</span
                    >
                    <span>The Grand Hall • Board 1 to 8</span>
                  </div>
                </div>
                <div class="mt-space-md bg-surface-container-highest/60 p-space-xs rounded-lg">
                  <div class="flex justify-between items-center text-body-sm font-body-sm mb-1">
                    <span class="text-on-surface-variant text-[12px]">Cap: 14/16 Verified</span>
                    <span class="text-primary font-semibold text-[12px]">2 seats remaining</span>
                  </div>
                  <div
                    class="w-full h-1.5 bg-surface-container-lowest rounded-full overflow-hidden"
                  >
                    <div class="bg-primary h-full rounded-full" style="width: 87%"></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="p-space-md pt-0 flex items-center gap-space-sm">
              <button
                class="w-full py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded font-title-md text-title-md font-semibold transition-colors flex items-center justify-center gap-1"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >verified_user</span
                >
                <span>Request Entry</span>
              </button>
              <button
                aria-label="Details"
                class="px-space-sm py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded transition-colors flex items-center justify-center"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
              </button>
            </div>
          </article>
          <!-- Card 6: End-of-Spring Club Awards Gala & Rapid Cup -->
          <article
            class="event-card group bg-surface-container-low hover:bg-surface-container rounded-xl overflow-hidden flex flex-col justify-between transition-all duration-200 shadow-sm hover:shadow-lg"
            data-category="socials"
            data-title="End-of-Spring Club Awards Gala Rapid Cup"
          >
            <div>
              <div class="relative h-48 w-full overflow-hidden bg-surface-container-highest">
                <div
                  class="w-full h-full bg-cover bg-center group-hover:scale-105 transition-transform duration-500"
                  data-alt="Elegant celebration evening in an upscale grandmaster chess club, polished trophies and medals showcased under spotlights, guests in smart casual attire raising champagne glasses beside ornate chess tables."
                  style="background-image: url('/images/03572f31f50e.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-transparent to-transparent"
                ></div>
                <div class="absolute top-space-sm left-space-sm flex gap-1">
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-secondary text-on-secondary uppercase font-bold tracking-wider"
                    >Social &amp; Cup</span
                  >
                  <span
                    class="px-space-xs py-0.5 rounded font-label-badge text-label-badge bg-surface-container-lowest/80 backdrop-blur text-primary-fixed uppercase tracking-wider"
                    >Season Finale</span
                  >
                </div>
                <div class="absolute bottom-space-sm left-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded text-[11px] font-label-numeric-md bg-surface-container-high/90 text-on-surface backdrop-blur"
                  >
                    7-Round Blitz + Banquet
                  </span>
                </div>
              </div>
              <div class="p-space-md">
                <h3
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors"
                >
                  Spring Gala &amp; Rapid Cup
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant line-clamp-2 mt-1">
                  Season championship cup presentation, awards for greatest upset, blitz marathon,
                  and club dinner with guest grandmasters.
                </p>
                <div
                  class="flex flex-col gap-1.5 mt-space-sm text-on-surface-variant font-body-sm text-body-sm"
                >
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                    <span>Saturday, May 31, 2025 • 17:00 UTC</span>
                  </div>
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >celebration</span
                    >
                    <span>Main Conservatory Ballroom</span>
                  </div>
                </div>
                <div class="mt-space-md bg-surface-container-highest/60 p-space-xs rounded-lg">
                  <div class="flex justify-between items-center text-body-sm font-body-sm mb-1">
                    <span class="text-on-surface-variant text-[12px]">Cap: 55/80 Seats</span>
                    <span class="text-primary font-semibold text-[12px]">25 seats left</span>
                  </div>
                  <div
                    class="w-full h-1.5 bg-surface-container-lowest rounded-full overflow-hidden"
                  >
                    <div class="bg-primary h-full rounded-full" style="width: 68%"></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="p-space-md pt-0 flex items-center gap-space-sm">
              <button
                class="w-full py-space-xs bg-primary hover:bg-primary-container text-on-primary rounded font-title-md text-title-md font-semibold transition-colors flex items-center justify-center gap-1"
                type="button"
                disabled
                title="Design preview"
              >
                <span>Book Tickets</span>
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >confirmation_number</span
                >
              </button>
              <button
                aria-label="Details"
                class="px-space-sm py-space-xs bg-surface-container-high hover:bg-surface-container-highest text-on-surface rounded transition-colors flex items-center justify-center"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true">info</span>
              </button>
            </div>
          </article>
        </div>
        <!-- Federation Guidelines and Arbiter Contact Strip -->
        <section
          class="mt-space-xl p-space-lg rounded-xl bg-surface-container-low flex flex-col md:flex-row items-center justify-between gap-space-md shadow-sm"
        >
          <div class="flex items-center gap-space-md">
            <div
              class="w-12 h-12 rounded-xl bg-surface-container-high flex items-center justify-center text-primary shrink-0"
            >
              <span class="material-symbols-outlined text-[28px]" aria-hidden="true">gavel</span>
            </div>
            <div>
              <h4 class="font-title-md text-title-md text-on-surface">
                Official FIDE Swiss Regulation Standards
              </h4>
              <p class="font-body-sm text-body-sm text-on-surface-variant">
                All rated competitions adhere to standard Swiss pairing tiebreaks (Buchholz Cut-1,
                Sonneborn-Berger) and FIDE Anti-Cheating Annex guidelines.
              </p>
            </div>
          </div>
          <div class="flex items-center gap-space-sm shrink-0">
            <button
              class="px-space-md py-space-xs bg-surface-container hover:bg-surface-container-high text-on-surface rounded font-body-md text-body-md transition-colors"
              type="button"
              disabled
              title="Design preview"
            >
              Read Arbiter Handbook
            </button>
            <button
              class="px-space-md py-space-xs bg-surface-container hover:bg-surface-container-high text-primary rounded font-body-md text-body-md transition-colors"
              type="button"
              disabled
              title="Design preview"
            >
              Contact Tournament Director
            </button>
          </div>
        </section>
        <!-- Interactive Filtering Script -->
      </div>
    </main>
  </ClubLayout>
</template>
