<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin-desktop">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Dynamic Ambient Glow Backdrop -->
        <div class="relative w-full overflow-hidden">
          <div
            class="absolute -top-32 left-1/4 w-[650px] h-[350px] bg-primary/10 rounded-full blur-[140px] pointer-events-none"
          ></div>
          <div
            class="absolute top-48 right-10 w-[450px] h-[280px] bg-secondary-container/20 rounded-full blur-[120px] pointer-events-none"
          ></div>
          <!-- Header Section -->
          <div class="pt-space-lg pb-space-md">
            <div class="flex flex-col md:flex-row md:items-end justify-between gap-space-md">
              <div class="max-w-3xl">
                <div class="flex items-center gap-space-xs text-primary mb-space-xs">
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >school</span
                  >
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-widest text-primary"
                    >Grandmaster Academy Curriculum</span
                  >
                </div>
                <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                  Masterclasses &amp; Workshops
                </h1>
                <p class="font-body-lg text-body-lg text-on-surface-variant mt-space-xs">
                  Deepen your tactical vision, master opening repertoires, and sharpen endgame
                  technique with titled masters and certified trainers.
                </p>
              </div>
              <!-- Academic Key Stats Pill -->
              <div
                class="flex items-center gap-space-md bg-surface-container-high px-space-md py-space-sm rounded-xl shadow-sm"
              >
                <div class="flex flex-col">
                  <span
                    class="font-label-badge text-label-badge uppercase text-on-surface-variant tracking-wider"
                    >Accredited Coaches</span
                  >
                  <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                    >18 Titled</span
                  >
                </div>
                <div class="w-px h-8 bg-surface-container-highest"></div>
                <div class="flex flex-col">
                  <span
                    class="font-label-badge text-label-badge uppercase text-on-surface-variant tracking-wider"
                    >Upcoming Labs</span
                  >
                  <span class="font-label-numeric-lg text-label-numeric-lg text-primary"
                    >14 Sessions</span
                  >
                </div>
              </div>
            </div>
            <!-- Navigation Segment Tabs -->
            <div class="flex items-center justify-between gap-space-md mt-space-lg">
              <div class="flex items-center bg-surface-container-low p-1 rounded-xl shadow-inner">
                <span
                  class="px-space-md py-space-xs rounded-lg font-title-md text-title-md bg-surface-container-high text-primary shadow-sm flex items-center gap-space-xs"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >view_agenda</span
                  >
                  <span>All Workshops</span>
                  <span
                    class="ml-1 px-1.5 py-0.5 rounded-full bg-primary/20 text-primary text-label-badge font-label-badge"
                    >24</span
                  >
                </span>
                <span
                  class="px-space-md py-space-xs rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-colors flex items-center gap-space-xs"
                  data-path="my-workshops"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >verified_user</span
                  >
                  <span>My Registered Workshops</span>
                  <span
                    class="ml-1 px-1.5 py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant text-label-badge font-label-badge"
                    >2</span
                  >
                </span>
              </div>
              <div
                class="hidden lg:flex items-center gap-space-xs text-on-surface-variant font-body-sm text-body-sm"
              >
                <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
                <span>Interactive DGT Sensory Boards Live in Alpha Lab</span>
              </div>
            </div>
          </div>
          <!-- Filter Control Bar -->
          <div class="bg-surface-container-low p-space-md rounded-xl mt-space-md shadow-sm">
            <div class="grid grid-cols-1 md:grid-cols-4 lg:grid-cols-12 gap-space-md items-center">
              <!-- Search Input -->
              <div class="md:col-span-2 lg:col-span-3 relative">
                <span
                  class="material-symbols-outlined text-[18px] text-on-surface-variant absolute left-space-md top-1/2 -translate-y-1/2"
                  aria-hidden="true"
                  >search</span
                >
                <input
                  class="w-full pl-10 pr-space-md py-space-xs rounded-lg bg-surface-container text-on-surface placeholder:text-on-surface-variant font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary"
                  placeholder="Search repertoire, tactic, theme..."
                  type="text"
                />
              </div>
              <!-- Filter: Difficulty -->
              <div class="md:col-span-2 lg:col-span-3 relative">
                <label
                  class="block font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant mb-1"
                  >Difficulty Level</label
                >
                <div class="relative">
                  <select
                    class="w-full appearance-none px-space-md py-space-xs rounded-lg bg-surface-container text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary cursor-pointer pr-10"
                  >
                    <option selected>All skill levels</option>
                    <option>Beginner (1200 - 1500)</option>
                    <option>Intermediate (1500 - 1900)</option>
                    <option>Advanced (1900+ Master Track)</option>
                  </select>
                  <span
                    class="material-symbols-outlined text-[18px] text-on-surface-variant absolute right-space-sm top-1/2 -translate-y-1/2 pointer-events-none"
                    aria-hidden="true"
                    >expand_more</span
                  >
                </div>
              </div>
              <!-- Filter: Topic Category -->
              <div class="md:col-span-2 lg:col-span-3 relative">
                <label
                  class="block font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant mb-1"
                  >Topic Category</label
                >
                <div class="relative">
                  <select
                    class="w-full appearance-none px-space-md py-space-xs rounded-lg bg-surface-container text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary cursor-pointer pr-10"
                  >
                    <option selected>All Topics</option>
                    <option>Openings Repertoire</option>
                    <option>Tactics &amp; Calculation</option>
                    <option>Positional Play</option>
                    <option>Endgame Mastery</option>
                    <option>Tournament Prep</option>
                  </select>
                  <span
                    class="material-symbols-outlined text-[18px] text-on-surface-variant absolute right-space-sm top-1/2 -translate-y-1/2 pointer-events-none"
                    aria-hidden="true"
                    >expand_more</span
                  >
                </div>
              </div>
              <!-- Filter: Instructor -->
              <div class="md:col-span-2 lg:col-span-3 relative">
                <label
                  class="block font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant mb-1"
                  >Lead Instructor</label
                >
                <div class="relative">
                  <select
                    class="w-full appearance-none px-space-md py-space-xs rounded-lg bg-surface-container text-on-surface font-body-md text-body-md focus:outline-none focus:ring-1 focus:ring-primary cursor-pointer pr-10"
                  >
                    <option selected>All Master Lecturers</option>
                    <option>GM Tariq Al-Mansoor (2615)</option>
                    <option>GM Marcus Vance (2590)</option>
                    <option>IM Elena Rostova (2420)</option>
                    <option>FM Alex Rivera (2310)</option>
                    <option>WFM Maya Patel (2185)</option>
                    <option>Sarah Jenkins (Senior Arbiter)</option>
                  </select>
                  <span
                    class="material-symbols-outlined text-[18px] text-on-surface-variant absolute right-space-sm top-1/2 -translate-y-1/2 pointer-events-none"
                    aria-hidden="true"
                    >expand_more</span
                  >
                </div>
              </div>
            </div>
          </div>
          <!-- Featured Masterclass Spotlight Banner (Editorial Split Pattern) -->
          <div
            class="mt-space-lg relative rounded-xl overflow-hidden bg-surface-container-low shadow-xl"
          >
            <div class="grid grid-cols-1 lg:grid-cols-12 min-h-[380px]">
              <!-- Left Panel: Content & Booking Mechanics -->
              <div class="lg:col-span-7 p-space-lg flex flex-col justify-between relative z-10">
                <div>
                  <div class="flex flex-wrap items-center gap-space-xs mb-space-sm">
                    <span
                      class="px-space-sm py-1 rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider"
                      >Advanced • 3 Hours Masterclass</span
                    >
                    <span
                      class="px-space-sm py-1 rounded bg-surface-container-high text-primary font-label-badge text-label-badge flex items-center gap-1"
                    >
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >local_fire_department</span
                      >
                      Featured Deep-Dive
                    </span>
                  </div>
                  <h2
                    class="font-headline-lg text-headline-lg text-on-surface leading-tight tracking-tight"
                  >
                    Mastering the Sicilian Najdorf: Modern Repertoire for Black
                  </h2>
                  <p class="font-body-md text-body-md text-on-surface-variant mt-space-sm max-w-xl">
                    Break down the sharp 6.Bg5 and 6.Be3 English Attack lines with GM Tariq
                    Al-Mansoor. Master dynamic pawn sacrifices, kingside counter-punches, and
                    prepare tournament-tested novelty files in PGN format.
                  </p>
                  <div class="grid grid-cols-2 sm:grid-cols-3 gap-space-md mt-space-md pt-space-sm">
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >calendar_today</span
                        >
                      </div>
                      <div class="flex flex-col">
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Session Date</span
                        >
                        <span class="font-title-md text-title-md text-on-surface"
                          >Sat, May 10, 2025</span
                        >
                      </div>
                    </div>
                    <div class="flex items-center gap-space-xs">
                      <div
                        class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >schedule</span
                        >
                      </div>
                      <div class="flex flex-col">
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Time Standard</span
                        >
                        <span class="font-title-md text-title-md text-on-surface"
                          >15:00 - 18:00 UTC</span
                        >
                      </div>
                    </div>
                    <div class="flex items-center gap-space-xs col-span-2 sm:col-span-1">
                      <div
                        class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >meeting_room</span
                        >
                      </div>
                      <div class="flex flex-col">
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Venue &amp; Tech</span
                        >
                        <span class="font-title-md text-title-md text-on-surface truncate"
                          >Room Alpha &amp; Live Boards</span
                        >
                      </div>
                    </div>
                  </div>
                </div>
                <div
                  class="mt-space-lg pt-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-md bg-surface-container/60 -mx-space-lg -mb-space-lg p-space-lg"
                >
                  <!-- Capacity Status Gauge -->
                  <div class="flex flex-col gap-1 w-full sm:w-64">
                    <div
                      class="flex justify-between items-center text-on-surface font-label-badge text-label-badge"
                    >
                      <span class="text-on-surface-variant">Registration Cap</span>
                      <span class="text-primary font-bold">14 / 18 Spots Filled</span>
                    </div>
                    <div
                      class="w-full bg-surface-container-highest rounded-full h-2 overflow-hidden"
                    >
                      <div
                        class="bg-primary h-full rounded-full transition-all duration-500"
                        style="width: 77.7%"
                      ></div>
                    </div>
                    <span class="font-body-sm text-body-sm text-secondary"
                      >Only 4 physical spots remaining</span
                    >
                  </div>
                  <!-- CTAs -->
                  <div class="flex items-center gap-space-sm">
                    <button
                      class="px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors flex items-center gap-space-xs shadow-sm"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >download</span
                      >
                      <span>Syllabus PGN</span>
                    </button>
                    <button
                      class="px-space-lg py-space-sm rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md transition-all shadow-md flex items-center gap-space-xs"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >how_to_reg</span
                      >
                      <span>Reserve My Seat</span>
                    </button>
                  </div>
                </div>
              </div>
              <!-- Right Panel: High-Impact Masterclass Atmosphere Imagery -->
              <div class="lg:col-span-5 relative min-h-[300px] lg:min-h-full overflow-hidden">
                <div
                  class="bg-cover bg-center absolute inset-0 w-full h-full transform hover:scale-105 transition-transform duration-700"
                  data-alt="Grandmaster analyzing a complex Sicilian Najdorf chess position on an illuminated tournament demonstration board in an elegant moody seminar hall with low green accent backlights and focused players observing intently."
                  style="background-image: url('/images/864eb9bb9374.webp')"
                ></div>
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-surface-container-low/40 to-transparent lg:bg-gradient-to-r lg:from-surface-container-low lg:via-transparent lg:to-transparent"
                ></div>
                <!-- Instructor Floating Chip -->
                <div
                  class="absolute top-space-md right-space-md bg-surface-container-lowest/80 backdrop-blur-md p-space-sm rounded-xl flex items-center gap-space-sm shadow-xl"
                >
                  <div
                    class="w-11 h-11 rounded-lg bg-surface-container-highest overflow-hidden flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of Grandmaster Tariq Al-Mansoor wearing a navy tailored blazer against a dark studio background with subtle warm lighting."
                      src="/images/5a7b789024a7.webp"
                      alt=""
                    />
                  </div>
                  <div>
                    <div class="flex items-center gap-1">
                      <span
                        class="px-1.5 py-0.5 rounded bg-primary text-on-primary font-label-badge text-label-badge font-bold"
                        >GM</span
                      >
                      <span class="font-title-md text-title-md text-on-surface"
                        >Tariq Al-Mansoor</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >FIDE 2615 • 2x Continental Champion</span
                    >
                  </div>
                </div>
                <!-- Bottom Visual Metrics Badges -->
                <div class="absolute bottom-space-md right-space-md flex gap-space-xs">
                  <span
                    class="px-2 py-1 rounded bg-surface-container-lowest/90 backdrop-blur text-on-surface-variant font-label-badge text-label-badge flex items-center gap-1"
                  >
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >videocam</span
                    >
                    4K Recording Provided
                  </span>
                  <span
                    class="px-2 py-1 rounded bg-surface-container-lowest/90 backdrop-blur text-on-surface-variant font-label-badge text-label-badge flex items-center gap-1"
                  >
                    <span
                      class="material-symbols-outlined text-[14px] text-primary"
                      aria-hidden="true"
                      >model_training</span
                    >
                    PGN Engine Analysis
                  </span>
                </div>
              </div>
            </div>
          </div>
          <!-- Active Catalog Section Header -->
          <div class="flex items-center justify-between mt-space-xl mb-space-md">
            <div class="flex items-baseline gap-space-sm">
              <h3 class="font-headline-md text-headline-md text-on-surface tracking-tight">
                Active Curriculum Schedule
              </h3>
              <span class="font-body-sm text-body-sm text-on-surface-variant"
                >Round-robin seminar series &amp; hands-on clinics</span
              >
            </div>
            <div class="flex items-center gap-2">
              <span class="font-body-sm text-body-sm text-on-surface-variant hidden sm:inline"
                >Sort by:</span
              >
              <button
                class="px-3 py-1.5 rounded-lg bg-surface-container-low text-on-surface font-title-md text-title-md flex items-center gap-1 hover:bg-surface-container"
                disabled
                title="Design preview"
              >
                <span>Date (Earliest First)</span>
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >swap_vert</span
                >
              </button>
            </div>
          </div>
          <!-- Workshops Grid (3 Columns) -->
          <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-space-lg">
            <!-- Workshop Card 1: King's Indian -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-md hover:bg-surface-container transition-all group"
            >
              <div>
                <!-- Top Row: Badge + Duration -->
                <div class="flex items-center justify-between mb-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    Intermediate
                  </span>
                  <div
                    class="flex items-center gap-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >timelapse</span
                    >
                    <span>2.0 Hours</span>
                  </div>
                </div>
                <h4
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors leading-snug"
                >
                  King's Indian Defense: Classical Pawn Structures
                </h4>
                <!-- Instructor Identity Strip -->
                <div class="flex items-center gap-space-sm mt-space-md py-space-xs">
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of chess master Alex Rivera smiling confidently against a textured charcoal backdrop."
                      src="/images/7abb9c167a78.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1">
                      <span
                        class="px-1 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge"
                        >FM</span
                      >
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Alex Rivera</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >FIDE 2310 • KID Specialist</span
                    >
                  </div>
                </div>
                <!-- Schedule & Venue Details -->
                <div
                  class="mt-space-md space-y-2 bg-surface-container-lowest/60 p-space-sm rounded-lg"
                >
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >calendar_today</span
                      >
                      Date:
                    </span>
                    <span class="text-on-surface font-semibold">Wed, May 14, 2025</span>
                  </div>
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >location_on</span
                      >
                      Arena:
                    </span>
                    <span class="text-on-surface">Studio Beta (Physical)</span>
                  </div>
                </div>
                <!-- Key Learning Bullets -->
                <div class="mt-space-md">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant block mb-1"
                    >Key Takeaways</span
                  >
                  <ul class="space-y-1.5">
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>The e5 vs. c4 pawn tension lock-up strategies</span>
                    </li>
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Standard f7-f5 kingside storm execution paths</span>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- Footer Capacity & Action CTA -->
              <div class="mt-space-lg pt-space-md">
                <div
                  class="flex justify-between items-center text-label-badge font-label-badge mb-1.5"
                >
                  <span class="text-on-surface-variant">Capacity: 12 / 16 Filled</span>
                  <span class="text-secondary font-semibold">4 Spots Open</span>
                </div>
                <div class="w-full bg-surface-container-highest rounded-full h-1.5 mb-space-md">
                  <div class="bg-primary h-full rounded-full" style="width: 75%"></div>
                </div>
                <div class="grid grid-cols-2 gap-space-xs">
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors text-center"
                    to="/workshops/strategy-masterclass"
                  >
                    View Details
                  </RouterLink>
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md transition-colors text-center font-semibold shadow-sm"
                    to="/register"
                  >
                    Register
                  </RouterLink>
                </div>
              </div>
            </div>
            <!-- Workshop Card 2: Rook & Pawn Endgames -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-md hover:bg-surface-container transition-all group"
            >
              <div>
                <!-- Top Row: Badge + Duration -->
                <div class="flex items-center justify-between mb-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded bg-surface-container-high text-tertiary font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    All Levels
                  </span>
                  <div
                    class="flex items-center gap-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >timelapse</span
                    >
                    <span>2.5 Hours</span>
                  </div>
                </div>
                <h4
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors leading-snug"
                >
                  Rook &amp; Pawn Endgames: Lucena &amp; Philidor
                </h4>
                <!-- Instructor Identity Strip -->
                <div class="flex items-center gap-space-sm mt-space-md py-space-xs">
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of International Master Elena Rostova analyzing positions thoughtfully with classic chess trophies in background."
                      src="/images/505d4a4e7012.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1">
                      <span
                        class="px-1 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge"
                        >IM</span
                      >
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Elena Rostova</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >FIDE 2420 • Endgame Theory Coach</span
                    >
                  </div>
                </div>
                <!-- Schedule & Venue Details -->
                <div
                  class="mt-space-md space-y-2 bg-surface-container-lowest/60 p-space-sm rounded-lg"
                >
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >calendar_today</span
                      >
                      Date:
                    </span>
                    <span class="text-on-surface font-semibold">Sun, May 18, 2025</span>
                  </div>
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >location_on</span
                      >
                      Arena:
                    </span>
                    <span class="text-on-surface">Endgame Lab Gamma</span>
                  </div>
                </div>
                <!-- Key Learning Bullets -->
                <div class="mt-space-md">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant block mb-1"
                    >Key Takeaways</span
                  >
                  <ul class="space-y-1.5">
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Building the 'bridge' maneuver in winning Lucena setups</span>
                    </li>
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Passive vs. active rook defenses in 6th-rank cut-offs</span>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- Footer Capacity & Action CTA -->
              <div class="mt-space-lg pt-space-md">
                <div
                  class="flex justify-between items-center text-label-badge font-label-badge mb-1.5"
                >
                  <span class="text-on-surface-variant">Capacity: 8 / 15 Filled</span>
                  <span class="text-secondary font-semibold">7 Spots Open</span>
                </div>
                <div class="w-full bg-surface-container-highest rounded-full h-1.5 mb-space-md">
                  <div class="bg-primary h-full rounded-full" style="width: 53.3%"></div>
                </div>
                <div class="grid grid-cols-2 gap-space-xs">
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors text-center"
                    to="/workshops/strategy-masterclass"
                  >
                    View Details
                  </RouterLink>
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md transition-colors text-center font-semibold shadow-sm"
                    to="/register"
                  >
                    Register
                  </RouterLink>
                </div>
              </div>
            </div>
            <!-- Workshop Card 3: Tactical Calculation (WAITLIST STATE) -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-md hover:bg-surface-container transition-all group"
            >
              <div>
                <!-- Top Row: Badge + Duration -->
                <div class="flex items-center justify-between mb-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded bg-error/20 text-error font-label-badge text-label-badge uppercase tracking-wider font-bold"
                  >
                    WAITLIST OPEN
                  </span>
                  <div
                    class="flex items-center gap-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >timelapse</span
                    >
                    <span>2.0 Hours</span>
                  </div>
                </div>
                <h4
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors leading-snug"
                >
                  Tactical Calculation: Candidate Selection
                </h4>
                <!-- Instructor Identity Strip -->
                <div class="flex items-center gap-space-sm mt-space-md py-space-xs">
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of Grandmaster Marcus Vance with intense analytical gaze looking forward over a wooden chessboard."
                      src="/images/0d9121db922d.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1">
                      <span
                        class="px-1 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge"
                        >GM</span
                      >
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Marcus Vance</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >FIDE 2590 • Olympic Team Captain</span
                    >
                  </div>
                </div>
                <!-- Schedule & Venue Details -->
                <div
                  class="mt-space-md space-y-2 bg-surface-container-lowest/60 p-space-sm rounded-lg"
                >
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >calendar_today</span
                      >
                      Date:
                    </span>
                    <span class="text-on-surface font-semibold">Wed, May 21, 2025</span>
                  </div>
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >location_on</span
                      >
                      Arena:
                    </span>
                    <span class="text-on-surface">Tactical Hall Alpha</span>
                  </div>
                </div>
                <!-- Key Learning Bullets -->
                <div class="mt-space-md">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant block mb-1"
                    >Key Takeaways</span
                  >
                  <ul class="space-y-1.5">
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Kotov's tree visualization under acute time scarcity</span>
                    </li>
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Identifying intermediate forcing moves (Zwischenzug)</span>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- Footer Capacity & Action CTA -->
              <div class="mt-space-lg pt-space-md">
                <div
                  class="flex justify-between items-center text-label-badge font-label-badge mb-1.5"
                >
                  <span class="text-error font-medium">Capacity: 15 / 15 At Max</span>
                  <span class="text-on-surface-variant">6 in waitlist queue</span>
                </div>
                <div class="w-full bg-surface-container-highest rounded-full h-1.5 mb-space-md">
                  <div class="bg-error h-full rounded-full" style="width: 100%"></div>
                </div>
                <div class="grid grid-cols-2 gap-space-xs">
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors text-center"
                    to="/workshops/strategy-masterclass"
                  >
                    View Details
                  </RouterLink>
                  <button
                    class="py-space-xs px-2 rounded-lg bg-secondary-container hover:bg-surface-container-highest text-on-secondary-container font-title-md text-title-md transition-colors text-center flex items-center justify-center gap-1"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >hourglass_top</span
                    >
                    <span>Join Waitlist</span>
                  </button>
                </div>
              </div>
            </div>
            <!-- Workshop Card 4: Chess Fundamentals -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-md hover:bg-surface-container transition-all group"
            >
              <div>
                <!-- Top Row: Badge + Duration -->
                <div class="flex items-center justify-between mb-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded bg-surface-container-high text-secondary-fixed font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    Beginner
                  </span>
                  <div
                    class="flex items-center gap-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >timelapse</span
                    >
                    <span>1.5 Hours</span>
                  </div>
                </div>
                <h4
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors leading-snug"
                >
                  Piece Coordination &amp; Safe King Shelter
                </h4>
                <!-- Instructor Identity Strip -->
                <div class="flex items-center gap-space-sm mt-space-md py-space-xs">
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of Woman FIDE Master Maya Patel smiling warmly in an educational chess library room."
                      src="/images/bab566ac45c4.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1">
                      <span
                        class="px-1 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge"
                        >WFM</span
                      >
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Maya Patel</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >FIDE 2185 • Head of Youth Academy</span
                    >
                  </div>
                </div>
                <!-- Schedule & Venue Details -->
                <div
                  class="mt-space-md space-y-2 bg-surface-container-lowest/60 p-space-sm rounded-lg"
                >
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >calendar_today</span
                      >
                      Date:
                    </span>
                    <span class="text-on-surface font-semibold">Sun, May 25, 2025</span>
                  </div>
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >location_on</span
                      >
                      Arena:
                    </span>
                    <span class="text-on-surface">Foundation Suite 1</span>
                  </div>
                </div>
                <!-- Key Learning Bullets -->
                <div class="mt-space-md">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant block mb-1"
                    >Key Takeaways</span
                  >
                  <ul class="space-y-1.5">
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Harmonizing knights and bishops on open diagonals</span>
                    </li>
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Recognizing back-rank vulnerabilities early</span>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- Footer Capacity & Action CTA -->
              <div class="mt-space-lg pt-space-md">
                <div
                  class="flex justify-between items-center text-label-badge font-label-badge mb-1.5"
                >
                  <span class="text-on-surface-variant">Capacity: 9 / 20 Filled</span>
                  <span class="text-secondary font-semibold">11 Spots Open</span>
                </div>
                <div class="w-full bg-surface-container-highest rounded-full h-1.5 mb-space-md">
                  <div class="bg-primary h-full rounded-full" style="width: 45%"></div>
                </div>
                <div class="grid grid-cols-2 gap-space-xs">
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors text-center"
                    to="/workshops/strategy-masterclass"
                  >
                    View Details
                  </RouterLink>
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md transition-colors text-center font-semibold shadow-sm"
                    to="/register"
                  >
                    Register
                  </RouterLink>
                </div>
              </div>
            </div>
            <!-- Workshop Card 5: Clock Management -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-md hover:bg-surface-container transition-all group"
            >
              <div>
                <!-- Top Row: Badge + Duration -->
                <div class="flex items-center justify-between mb-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded bg-surface-container-high text-tertiary font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    All Levels
                  </span>
                  <div
                    class="flex items-center gap-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >timelapse</span
                    >
                    <span>1.0 Hour</span>
                  </div>
                </div>
                <h4
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors leading-snug"
                >
                  Conquering Time Trouble: Practical Clock Mastery
                </h4>
                <!-- Instructor Identity Strip -->
                <div class="flex items-center gap-space-sm mt-space-md py-space-xs">
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of senior international arbiter Sarah Jenkins holding an official DGT 3000 tournament digital clock."
                      src="/images/b905e364d04c.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1">
                      <span
                        class="px-1 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge"
                        >IA</span
                      >
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Sarah Jenkins</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >FIDE International Arbiter • Sports Psychologist</span
                    >
                  </div>
                </div>
                <!-- Schedule & Venue Details -->
                <div
                  class="mt-space-md space-y-2 bg-surface-container-lowest/60 p-space-sm rounded-lg"
                >
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >calendar_today</span
                      >
                      Date:
                    </span>
                    <span class="text-on-surface font-semibold">Wed, May 28, 2025</span>
                  </div>
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >location_on</span
                      >
                      Arena:
                    </span>
                    <span class="text-on-surface">Psychology Seminar Lounge</span>
                  </div>
                </div>
                <!-- Key Learning Bullets -->
                <div class="mt-space-md">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant block mb-1"
                    >Key Takeaways</span
                  >
                  <ul class="space-y-1.5">
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Calculating with 30-second increment cushions</span>
                    </li>
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Breathing and anxiety dampening under sub-1-minute</span>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- Footer Capacity & Action CTA -->
              <div class="mt-space-lg pt-space-md">
                <div
                  class="flex justify-between items-center text-label-badge font-label-badge mb-1.5"
                >
                  <span class="text-on-surface-variant">Capacity: 6 / 25 Filled</span>
                  <span class="text-secondary font-semibold">19 Spots Open</span>
                </div>
                <div class="w-full bg-surface-container-highest rounded-full h-1.5 mb-space-md">
                  <div class="bg-primary h-full rounded-full" style="width: 24%"></div>
                </div>
                <div class="grid grid-cols-2 gap-space-xs">
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors text-center"
                    to="/workshops/strategy-masterclass"
                  >
                    View Details
                  </RouterLink>
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md transition-colors text-center font-semibold shadow-sm"
                    to="/register"
                  >
                    Register
                  </RouterLink>
                </div>
              </div>
            </div>
            <!-- Workshop Card 6: Crushing Anti-Sicilians -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-md hover:bg-surface-container transition-all group"
            >
              <div>
                <!-- Top Row: Badge + Duration -->
                <div class="flex items-center justify-between mb-space-sm">
                  <span
                    class="px-space-xs py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    Intermediate
                  </span>
                  <div
                    class="flex items-center gap-1 text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >timelapse</span
                    >
                    <span>2.0 Hours</span>
                  </div>
                </div>
                <h4
                  class="font-headline-sm text-headline-sm text-on-surface group-hover:text-primary transition-colors leading-snug"
                >
                  Crushing Anti-Sicilians: Alapin, Grand Prix &amp; Rossolimo
                </h4>
                <!-- Instructor Identity Strip -->
                <div class="flex items-center gap-space-sm mt-space-md py-space-xs">
                  <div
                    class="w-10 h-10 rounded-full bg-surface-container-highest overflow-hidden flex-shrink-0"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Portrait of chess master Alex Rivera sitting at a wooden desk with opened chess monographs."
                      src="/images/978328fd40f4.webp"
                      alt=""
                    />
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1">
                      <span
                        class="px-1 rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge"
                        >FM</span
                      >
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Alex Rivera</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >FIDE 2310 • Repertoire Author</span
                    >
                  </div>
                </div>
                <!-- Schedule & Venue Details -->
                <div
                  class="mt-space-md space-y-2 bg-surface-container-lowest/60 p-space-sm rounded-lg"
                >
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >calendar_today</span
                      >
                      Date:
                    </span>
                    <span class="text-on-surface font-semibold">Sun, Jun 01, 2025</span>
                  </div>
                  <div class="flex items-center justify-between text-body-sm font-body-sm">
                    <span class="text-on-surface-variant flex items-center gap-1">
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >location_on</span
                      >
                      Arena:
                    </span>
                    <span class="text-on-surface">Main Amphitheater</span>
                  </div>
                </div>
                <!-- Key Learning Bullets -->
                <div class="mt-space-md">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant block mb-1"
                    >Key Takeaways</span
                  >
                  <ul class="space-y-1.5">
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Active ...d5 strikes vs. 2.c3 Alapin variations</span>
                    </li>
                    <li
                      class="flex items-start gap-2 text-body-sm font-body-sm text-on-surface-variant"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[16px] shrink-0 mt-0.5"
                        aria-hidden="true"
                        >check_circle</span
                      >
                      <span>Defusing White's f4 Grand Prix pawn advances safely</span>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- Footer Capacity & Action CTA -->
              <div class="mt-space-lg pt-space-md">
                <div
                  class="flex justify-between items-center text-label-badge font-label-badge mb-1.5"
                >
                  <span class="text-on-surface-variant">Capacity: 11 / 18 Filled</span>
                  <span class="text-secondary font-semibold">7 Spots Open</span>
                </div>
                <div class="w-full bg-surface-container-highest rounded-full h-1.5 mb-space-md">
                  <div class="bg-primary h-full rounded-full" style="width: 61.1%"></div>
                </div>
                <div class="grid grid-cols-2 gap-space-xs">
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors text-center"
                    to="/workshops/strategy-masterclass"
                  >
                    View Details
                  </RouterLink>
                  <RouterLink
                    class="py-space-xs px-2 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md transition-colors text-center font-semibold shadow-sm"
                    to="/register"
                  >
                    Register
                  </RouterLink>
                </div>
              </div>
            </div>
          </div>
          <!-- Workshop Guarantee / Methodology Infographic Banner -->
          <div
            class="mt-space-xl p-space-lg bg-surface-container-low rounded-xl shadow-lg relative overflow-hidden"
          >
            <div
              class="flex flex-col lg:flex-row items-center justify-between gap-space-lg relative z-10"
            >
              <div class="max-w-xl">
                <div class="flex items-center gap-space-xs text-primary mb-1">
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >workspace_premium</span
                  >
                  <span class="font-label-badge text-label-badge uppercase tracking-wider"
                    >Tournament Standard Accreditation</span
                  >
                </div>
                <h4 class="font-headline-md text-headline-md text-on-surface">
                  Every masterclass includes full digital deliverables
                </h4>
                <p class="font-body-md text-body-md text-on-surface-variant mt-1">
                  Attendees gain lifetime access to annotated PGN move trees, high-speed engine
                  cloud evaluations, and post-session Q&amp;A reviews directly in their ChessHub
                  player locker.
                </p>
              </div>
              <div class="grid grid-cols-3 gap-space-md w-full lg:w-auto">
                <div
                  class="flex flex-col items-center text-center p-space-sm bg-surface-container rounded-lg"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[28px] mb-1"
                    aria-hidden="true"
                    >integration_instructions</span
                  >
                  <span class="font-title-md text-title-md text-on-surface">PGN Trees</span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Annotated lines</span
                  >
                </div>
                <div
                  class="flex flex-col items-center text-center p-space-sm bg-surface-container rounded-lg"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[28px] mb-1"
                    aria-hidden="true"
                    >smart_display</span
                  >
                  <span class="font-title-md text-title-md text-on-surface">4K Video</span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Archived recording</span
                  >
                </div>
                <div
                  class="flex flex-col items-center text-center p-space-sm bg-surface-container rounded-lg"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[28px] mb-1"
                    aria-hidden="true"
                    >quiz</span
                  >
                  <span class="font-title-md text-title-md text-on-surface">Drill Quiz</span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Interactive tactics</span
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
