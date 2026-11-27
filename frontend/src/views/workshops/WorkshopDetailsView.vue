<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full text-on-surface">
        <!-- Top Breadcrumbs Navigation Bar -->
        <section class="w-full bg-surface-container-lowest px-margin-desktop py-space-sm shadow-sm">
          <div class="max-w-[1440px] mx-auto flex items-center justify-between text-body-sm">
            <nav class="flex items-center gap-space-xs font-title-md text-on-surface-variant">
              <RouterLink
                class="hover:text-primary transition-colors flex items-center gap-1"
                data-path="home"
                to="/"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true">home</span>
                <span>Home</span>
              </RouterLink>
              <span class="text-outline">/</span>
              <RouterLink
                class="hover:text-primary transition-colors"
                data-path="workshops"
                to="/workshops"
                >Workshops</RouterLink
              >
              <span class="text-outline">/</span>
              <span class="text-on-surface font-semibold truncate max-w-xs md:max-w-md"
                >Mastering the Sicilian Najdorf</span
              >
              <span
                class="px-space-xs py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase tracking-wider ml-1"
                >#WK-104</span
              >
            </nav>
            <div
              class="hidden sm:flex items-center gap-space-sm text-outline font-label-badge text-label-badge"
            >
              <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
              <span class="uppercase tracking-widest text-secondary">Sanctioned Masterclass</span>
            </div>
          </div>
        </section>
        <!-- Hero Visual Stage -->
        <section class="relative w-full overflow-hidden bg-surface-container-lowest shadow-md">
          <!-- Visual Backing Canvas with Dramatic Dark Chess Photography -->
          <div class="absolute inset-0 z-0">
            <div
              class="w-full h-full bg-cover bg-center opacity-30 transform scale-105 transition-transform duration-1000 ease-out"
              data-alt="Macro cinematic composition of ebony and boxwood tournament chess pieces on an analytical dark green tournament board under intense raking directional studio spotlight. Deep emerald shadows, high tactical contrast, sharp focus on a carved black knight eyeing the center squares, pristine competition setting in a high-end European chess club hall."
              style="background-image: url('/images/0fe69f2aef00.webp')"
            ></div>
            <div
              class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest via-surface-container-lowest/80 to-transparent"
            ></div>
            <div
              class="absolute inset-0 bg-gradient-to-r from-surface-container-lowest via-surface-container-lowest/70 to-transparent"
            ></div>
          </div>
          <!-- Content Matrix -->
          <div
            class="relative z-10 max-w-[1440px] mx-auto px-margin-desktop pt-space-xl pb-space-lg"
          >
            <div class="flex flex-col gap-space-md max-w-4xl">
              <!-- Badges Row -->
              <div
                class="flex flex-wrap items-center gap-space-xs font-label-badge text-label-badge"
              >
                <span
                  class="px-space-sm py-1 rounded bg-secondary-container text-on-secondary-container tracking-wider uppercase flex items-center gap-1 font-bold"
                >
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true">bolt</span>
                  Advanced Tier
                </span>
                <span
                  class="px-space-sm py-1 rounded bg-surface-container-high text-on-surface tracking-wider uppercase flex items-center gap-1"
                >
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >timer</span
                  >
                  3 Hours Clinical Masterclass
                </span>
                <span
                  class="px-space-sm py-1 rounded bg-surface-container-high text-on-surface tracking-wider uppercase flex items-center gap-1"
                >
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >grid_4x4</span
                  >
                  Opening Repertoire
                </span>
                <span
                  class="px-space-sm py-1 rounded bg-error-container text-on-error-container tracking-wider uppercase font-bold flex items-center gap-1"
                >
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >hourglass_top</span
                  >
                  Closes in 48 Hours
                </span>
              </div>
              <!-- Headline & Editorial Narrative -->
              <div class="space-y-space-xs">
                <h1
                  class="font-display-lg text-display-lg text-on-surface tracking-tight leading-none text-balance"
                >
                  Mastering the Sicilian Najdorf: Modern Repertoire for Black
                </h1>
                <p
                  class="font-body-lg text-body-lg text-on-surface-variant max-w-3xl leading-relaxed pt-space-xs"
                >
                  Break down the sharp 6.Bg5 and 6.Be3 English Attack lines with GM Tariq
                  Al-Mansoor. Master dynamic pawn sacrifices, kingside counter-punches, and prepare
                  tournament-tested novelty files in PGN format.
                </p>
              </div>
              <!-- Key Realtime Metadata Strip -->
              <div
                class="mt-space-md grid grid-cols-1 md:grid-cols-3 gap-space-sm bg-surface-container-low p-space-md rounded-xl shadow-sm"
              >
                <!-- Timing -->
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >calendar_today</span
                    >
                  </div>
                  <div class="flex flex-col min-w-0">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      >Date &amp; Schedule</span
                    >
                    <span class="font-title-md text-title-md text-on-surface truncate"
                      >Saturday, May 10, 2025</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >15:00 – 18:00 UTC</span
                    >
                  </div>
                </div>
                <!-- Venue & Hardware -->
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-secondary flex-shrink-0"
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >meeting_room</span
                    >
                  </div>
                  <div class="flex flex-col min-w-0">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      >Sanctioned Venue</span
                    >
                    <span class="font-title-md text-title-md text-on-surface truncate"
                      >Room Alpha (Sensory DGT)</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                      >Grandmaster Hall, 2nd Floor</span
                    >
                  </div>
                </div>
                <!-- Live Capacity Engine -->
                <div class="flex flex-col justify-center">
                  <div class="flex items-center justify-between mb-1.5">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      >Enrolled Capacity</span
                    >
                    <span class="font-label-numeric-md text-label-numeric-md text-primary"
                      >14 / 18 Spots Filled</span
                    >
                  </div>
                  <div class="w-full h-2 rounded-full bg-surface-container-highest overflow-hidden">
                    <div
                      class="h-full bg-primary-container rounded-full"
                      style="width: 77.78%"
                    ></div>
                  </div>
                  <div class="flex items-center justify-between mt-1 text-body-sm">
                    <span class="text-error font-medium flex items-center gap-1">
                      <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                        >warning</span
                      >
                      Only 4 seats remaining
                    </span>
                    <span class="text-outline font-label-badge text-label-badge">78% BOOKED</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
        <!-- Core Two-Column Analytical Cockpit -->
        <section class="w-full max-w-[1440px] mx-auto px-margin-desktop py-space-xl">
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-xl items-start">
            <!-- LEFT MAIN COLUMN: Pedagogical Architecture & Curriculum (8 Columns) -->
            <div class="lg:col-span-8 flex flex-col gap-space-xl">
              <!-- Instructor Profile Spotlight -->
              <div class="bg-surface-container-low rounded-xl p-space-lg shadow-sm">
                <div class="flex flex-col md:flex-row gap-space-lg items-start">
                  <div class="relative flex-shrink-0">
                    <img
                      class="w-28 h-28 md:w-36 md:h-36 rounded-xl object-cover shadow-md"
                      data-alt="Formal black and white studio portrait of GM Tariq Al-Mansoor, middle-aged grandmaster with contemplative expression, sharp tailored charcoal blazer, subtle rim lighting, high-contrast monochrome finish, quiet intensity."
                      src="/images/3aa2c4780e2c.webp"
                      alt=""
                    />
                    <span
                      class="absolute -bottom-2 -right-2 px-space-xs py-0.5 rounded bg-surface-container-highest text-primary font-label-badge text-label-badge uppercase shadow-sm"
                    >
                      GM Title
                    </span>
                  </div>
                  <div class="flex-1 space-y-space-xs">
                    <div class="flex flex-wrap items-center justify-between gap-space-xs">
                      <div>
                        <div class="flex items-center gap-space-xs">
                          <h2 class="font-headline-md text-headline-md text-on-surface">
                            GM Tariq Al-Mansoor
                          </h2>
                          <span
                            class="material-symbols-outlined text-primary text-[20px]"
                            title="FIDE Certified Grandmaster"
                            aria-hidden="true"
                            >verified</span
                          >
                        </div>
                        <p class="font-body-md text-body-md text-secondary">
                          2x Continental Champion • Lead Club Trainer
                        </p>
                      </div>
                      <div class="flex items-center gap-space-xs">
                        <span
                          class="px-space-sm py-1 rounded bg-surface-container-high text-on-surface font-label-numeric-md text-label-numeric-md"
                        >
                          2615 Active Score
                        </span>
                        <span
                          class="px-space-sm py-1 rounded bg-surface-container-high text-outline font-label-badge text-label-badge uppercase"
                        >
                          FIDE Accredited
                        </span>
                      </div>
                    </div>
                    <p
                      class="font-body-md text-body-md text-on-surface-variant leading-relaxed pt-space-xs"
                    >
                      With over 18 years on the international open tournament circuit, GM Al-Mansoor
                      has wielded the Sicilian Najdorf against world-class opposition, securing
                      benchmark victories with Black against premier 2700+ competitors. He serves as
                      lead theoretical strategist for national youth teams and collegiate
                      championship squads.
                    </p>
                    <div
                      class="pt-space-xs flex flex-wrap items-center gap-space-md text-body-sm text-outline"
                    >
                      <span class="flex items-center gap-1">
                        <span
                          class="material-symbols-outlined text-[16px] text-primary"
                          aria-hidden="true"
                          >psychology</span
                        >
                        Specialization: Dynamic Counterplay &amp; Pawn Geometry
                      </span>
                      <span class="flex items-center gap-1">
                        <span
                          class="material-symbols-outlined text-[16px] text-primary"
                          aria-hidden="true"
                          >school</span
                        >
                        1,200+ Masterclass Alumni
                      </span>
                    </div>
                  </div>
                </div>
              </div>
              <!-- Clinical Syllabus Breakdown -->
              <div class="space-y-space-md">
                <div class="flex items-center justify-between">
                  <div>
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                      >Pedagogical Structure</span
                    >
                    <h2 class="font-headline-md text-headline-md text-on-surface">
                      Hour-by-Hour Clinical Syllabus
                    </h2>
                  </div>
                  <span
                    class="font-label-badge text-label-badge text-outline bg-surface-container-high px-space-sm py-1 rounded"
                  >
                    Engine Validated • Stockfish 17
                  </span>
                </div>
                <div class="space-y-space-sm">
                  <!-- Hour 1 Card -->
                  <div
                    class="bg-surface-container-low rounded-xl p-space-md hover:bg-surface-container transition-colors shadow-sm"
                  >
                    <div class="flex items-start gap-space-md">
                      <div
                        class="w-12 h-12 rounded-lg bg-surface-container-high flex flex-col items-center justify-center flex-shrink-0 text-primary"
                      >
                        <span class="font-label-badge text-label-badge uppercase tracking-tighter"
                          >Hour</span
                        >
                        <span class="font-headline-sm text-headline-sm leading-none">01</span>
                      </div>
                      <div class="flex-1 space-y-1">
                        <div class="flex flex-wrap items-center justify-between gap-space-xs">
                          <h3 class="font-title-md text-title-md text-on-surface">
                            Confronting the English Attack
                          </h3>
                          <span
                            class="px-space-xs py-0.5 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge"
                          >
                            6.Be3 e5 7.Nb3 Be6 8.f3 h5!
                          </span>
                        </div>
                        <p class="font-body-md text-body-md text-on-surface-variant">
                          Deep anatomical breakdown of White's queenside castling plans and storm
                          vectors (g4-g5). Neutralizing White's initiative with the modern
                          prophylactic 8...h5 approach, coordinating the central d5 strike, and
                          maintaining knight anchors on d4.
                        </p>
                        <div
                          class="flex items-center gap-space-md pt-space-xs text-body-sm text-outline"
                        >
                          <span class="flex items-center gap-1"
                            ><span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                              >tune</span
                            >
                            14 Critical Repertoire Lines</span
                          >
                          <span class="flex items-center gap-1"
                            ><span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                              >play_circle</span
                            >
                            Grandmaster Game Case Studies</span
                          >
                        </div>
                      </div>
                    </div>
                  </div>
                  <!-- Hour 2 Card -->
                  <div
                    class="bg-surface-container-low rounded-xl p-space-md hover:bg-surface-container transition-colors shadow-sm"
                  >
                    <div class="flex items-start gap-space-md">
                      <div
                        class="w-12 h-12 rounded-lg bg-surface-container-high flex flex-col items-center justify-center flex-shrink-0 text-primary"
                      >
                        <span class="font-label-badge text-label-badge uppercase tracking-tighter"
                          >Hour</span
                        >
                        <span class="font-headline-sm text-headline-sm leading-none">02</span>
                      </div>
                      <div class="flex-1 space-y-1">
                        <div class="flex flex-wrap items-center justify-between gap-space-xs">
                          <h3 class="font-title-md text-title-md text-on-surface">
                            Classical 6.Bg5 &amp; The Poisoned Pawn Complex
                          </h3>
                          <span
                            class="px-space-xs py-0.5 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge"
                          >
                            6...e6 7.f4 Qb6 8.Qd2 Qxb2
                          </span>
                        </div>
                        <p class="font-body-md text-body-md text-on-surface-variant">
                          Tactical survival guidelines in chess’s sharpest labyrinth. How to
                          navigate the Rb1 and Nb3 variations with total confidence, utilizing
                          memory anchors for razor-sharp defensive sequences verified to Stockfish
                          17 depth 52.
                        </p>
                        <div
                          class="flex items-center gap-space-md pt-space-xs text-body-sm text-outline"
                        >
                          <span class="flex items-center gap-1"
                            ><span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                              >memory</span
                            >
                            Neural Net Tabular Prep</span
                          >
                          <span class="flex items-center gap-1"
                            ><span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                              >psychology_alt</span
                            >
                            King Walk Evacuation Drills</span
                          >
                        </div>
                      </div>
                    </div>
                  </div>
                  <!-- Hour 3 Card -->
                  <div
                    class="bg-surface-container-low rounded-xl p-space-md hover:bg-surface-container transition-colors shadow-sm"
                  >
                    <div class="flex items-start gap-space-md">
                      <div
                        class="w-12 h-12 rounded-lg bg-surface-container-high flex flex-col items-center justify-center flex-shrink-0 text-primary"
                      >
                        <span class="font-label-badge text-label-badge uppercase tracking-tighter"
                          >Hour</span
                        >
                        <span class="font-headline-sm text-headline-sm leading-none">03</span>
                      </div>
                      <div class="flex-1 space-y-1">
                        <div class="flex flex-wrap items-center justify-between gap-space-xs">
                          <h3 class="font-title-md text-title-md text-on-surface">
                            Live Sensory Board Sparring &amp; Evaluation
                          </h3>
                          <span
                            class="px-space-xs py-0.5 rounded bg-surface-container-highest text-primary font-label-badge text-label-badge"
                          >
                            Room Alpha DGT Arrays
                          </span>
                        </div>
                        <p class="font-body-md text-body-md text-on-surface-variant">
                          Participants test newly integrated repertoire knowledge under genuine
                          match tension on weighted wooden DGT boards. GM Al-Mansoor conducts live
                          arbiter evaluation, immediate blun-der analysis, and tactical
                          retrospectives on the arena projector.
                        </p>
                        <div
                          class="flex items-center gap-space-md pt-space-xs text-body-sm text-outline"
                        >
                          <span class="flex items-center gap-1"
                            ><span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                              >sensors</span
                            >
                            Real-time DGT Board Telemetry</span
                          >
                          <span class="flex items-center gap-1"
                            ><span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                              >rate_review</span
                            >
                            1-on-1 Move Diagnostics</span
                          >
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!-- Core Learning Objectives (4 Bento Cards) -->
              <div class="space-y-space-md">
                <div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                    >Tangible Takeaways</span
                  >
                  <h2 class="font-headline-md text-headline-md text-on-surface">
                    Core Tactical &amp; Positional Competencies
                  </h2>
                </div>
                <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                  <div
                    class="bg-surface-container-low p-space-md rounded-xl space-y-space-xs shadow-sm"
                  >
                    <div
                      class="w-8 h-8 rounded bg-secondary-container flex items-center justify-center text-on-secondary-container"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >security</span
                      >
                    </div>
                    <h3 class="font-title-md text-title-md text-on-surface">
                      King Pawn Sacrifices (e6 &amp; f5)
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Recognize when White's classic Nd5 or Nf5 piece sacrifices are sound versus
                      bluff maneuvers, executing precise refutations under tournament clock
                      conditions.
                    </p>
                  </div>
                  <div
                    class="bg-surface-container-low p-space-md rounded-xl space-y-space-xs shadow-sm"
                  >
                    <div
                      class="w-8 h-8 rounded bg-secondary-container flex items-center justify-center text-on-secondary-container"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >swap_calls</span
                      >
                    </div>
                    <h3 class="font-title-md text-title-md text-on-surface">
                      Timing of the ...d5 Central Break
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Master the golden rule of the Sicilian: unleashing the central counter-punch
                      ...d5 at the exact ply White commits their light-squared bishop or f-pawn.
                    </p>
                  </div>
                  <div
                    class="bg-surface-container-low p-space-md rounded-xl space-y-space-xs shadow-sm"
                  >
                    <div
                      class="w-8 h-8 rounded bg-secondary-container flex items-center justify-center text-on-secondary-container"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >castle</span
                      >
                    </div>
                    <h3 class="font-title-md text-title-md text-on-surface">
                      Opposite-Castling Precision
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Execute razor-sharp queenside pawn storms (...b5, ...b4, ...a5) while keeping
                      Black’s king safe in the center or sheltered on the kingside flank.
                    </p>
                  </div>
                  <div
                    class="bg-surface-container-low p-space-md rounded-xl space-y-space-xs shadow-sm"
                  >
                    <div
                      class="w-8 h-8 rounded bg-secondary-container flex items-center justify-center text-on-secondary-container"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >gps_fixed</span
                      >
                    </div>
                    <h3 class="font-title-md text-title-md text-on-surface">
                      Endgame Outpost Anchors (c4 &amp; d4)
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Learn how to smoothly trade into superior knight-versus-bishop endgames by
                      clamping down on the critical d4 and c4 squares after major pieces leave the
                      board.
                    </p>
                  </div>
                </div>
              </div>
              <!-- Deliverables & Digital Master Pack -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-sm space-y-space-md"
              >
                <div class="flex items-center justify-between">
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    What's Included in Your Repertoire Vault
                  </h2>
                  <span
                    class="font-label-badge text-label-badge text-primary bg-surface-container-high px-space-sm py-1 rounded"
                    >Lifetime Access</span
                  >
                </div>
                <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-md">
                  <div class="flex items-start gap-space-sm">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >folder_zip</span
                      >
                    </div>
                    <div>
                      <h4 class="font-title-md text-title-md text-on-surface">
                        Annotated Master PGN Pack
                      </h4>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        32 exhaustive variation files with prose explanations and engine branches
                        for ChessBase &amp; PGN viewers.
                      </p>
                    </div>
                  </div>
                  <div class="flex items-start gap-space-sm">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >videocam</span
                      >
                    </div>
                    <div>
                      <h4 class="font-title-md text-title-md text-on-surface">
                        4K Multi-Angle Recording
                      </h4>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Full studio broadcast capture with board overlay and audio transcripts
                        deposited directly to your player account.
                      </p>
                    </div>
                  </div>
                  <div class="flex items-start gap-space-sm">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >quiz</span
                      >
                    </div>
                    <div>
                      <h4 class="font-title-md text-title-md text-on-surface">
                        Interactive Flashcard Drills
                      </h4>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        40 spaced-repetition Najdorf tactical puzzles loaded to your ChessHub mobile
                        drill locker.
                      </p>
                    </div>
                  </div>
                  <div class="flex items-start gap-space-sm">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >sensors</span
                      >
                    </div>
                    <div>
                      <h4 class="font-title-md text-title-md text-on-surface">
                        Sensory Board Telemetry Report
                      </h4>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Personalized move accuracy breakdown and clock pressure metric report from
                        the Hour 3 sparring session.
                      </p>
                    </div>
                  </div>
                </div>
              </div>
              <!-- Recommended Level & Prerequisites Indicator -->
              <div
                class="bg-surface-container-low rounded-xl p-space-md shadow-sm flex flex-col md:flex-row items-center justify-between gap-space-md"
              >
                <div class="flex items-center gap-space-md">
                  <div
                    class="w-12 h-12 rounded-lg bg-surface-container-high flex items-center justify-center text-secondary flex-shrink-0"
                  >
                    <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                      >workspace_premium</span
                    >
                  </div>
                  <div>
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      >Target Player Demographic</span
                    >
                    <h3 class="font-title-md text-title-md text-on-surface">
                      Intermediate to Advanced League Competitors
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Recommended for players actively competing in classical weekend Swiss
                      tournaments and club championship divisions.
                    </p>
                  </div>
                </div>
                <div class="flex-shrink-0 flex items-center gap-2">
                  <span
                    class="px-space-sm py-1.5 rounded bg-surface-container-highest font-label-badge text-label-badge text-on-surface"
                    >CLUB CATEGORY 1 &amp; PREMIER</span
                  >
                </div>
              </div>
            </div>
            <!-- RIGHT COLUMN: Registration Engine & Sticky Operations Console (4 Columns) -->
            <aside class="lg:col-span-4 flex flex-col gap-space-md lg:sticky lg:top-20">
              <!-- Master Booking Card -->
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-xl space-y-space-md"
              >
                <!-- Availability & Price Header -->
                <div class="flex items-center justify-between">
                  <div class="flex items-center gap-2">
                    <span class="w-2.5 h-2.5 rounded-full bg-primary animate-ping"></span>
                    <span class="font-title-md text-title-md text-primary font-bold"
                      >Registration Open</span
                    >
                  </div>
                  <span
                    class="px-space-xs py-0.5 rounded bg-error-container text-on-error-container font-label-badge text-label-badge uppercase font-bold"
                  >
                    4 Spots Left
                  </span>
                </div>
                <div class="bg-surface-container p-space-md rounded-lg space-y-1">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Registration Fee</span
                  >
                  <div class="flex items-baseline gap-space-xs">
                    <span
                      class="font-label-numeric-lg text-label-numeric-lg text-on-surface font-extrabold"
                      >$0.00</span
                    >
                    <span class="font-body-sm text-body-sm text-secondary font-semibold"
                      >Included in Active Competitor Pass</span
                    >
                  </div>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    Non-member guest rate: $65.00 (charged at registration desk if membership is
                    inactive).
                  </p>
                </div>
                <!-- Primary CTA Button -->
                <button
                  class="w-full py-3.5 px-space-md rounded-lg bg-primary-container hover:bg-secondary-fixed-dim text-on-primary-container font-title-md text-title-md tracking-tight font-bold transition-all shadow-md flex items-center justify-center gap-2 group cursor-pointer"
                  id="register-cta"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>Register for Workshop</span>
                  <span
                    class="material-symbols-outlined text-[20px] group-hover:translate-x-1 transition-transform"
                    aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
                <!-- Interactive Registration Modal State (Mock Trigger) -->
                <div
                  class="hidden p-space-md rounded-lg bg-secondary-container text-on-secondary-container space-y-1 text-center"
                  id="registration-confirmation"
                >
                  <span
                    class="material-symbols-outlined text-[28px] text-primary"
                    aria-hidden="true"
                    >check_circle</span
                  >
                  <h4 class="font-title-md text-title-md font-bold">Seat Reserved!</h4>
                  <p class="font-body-sm text-body-sm">
                    Your sensory board #15 has been reserved under your Club ID.
                  </p>
                </div>
                <!-- Secondary Auxiliary Actions -->
                <div class="grid grid-cols-2 gap-space-xs pt-space-xs">
                  <button
                    class="py-2 px-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-body-sm text-body-sm transition-colors flex items-center justify-center gap-1.5"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >download</span
                    >
                    <span>Syllabus (.PDF)</span>
                  </button>
                  <button
                    class="py-2 px-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-body-sm text-body-sm transition-colors flex items-center justify-center gap-1.5"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >calendar_add_on</span
                    >
                    <span>Add (.ICS)</span>
                  </button>
                </div>
                <button
                  class="w-full py-2 px-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface-variant font-body-sm text-body-sm transition-colors flex items-center justify-center gap-1.5"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >share</span
                  >
                  <span>Share Masterclass with Teammates</span>
                </button>
                <!-- Arbiter Policy Notice -->
                <div
                  class="p-space-sm rounded bg-surface-container-highest/60 text-body-sm text-outline flex items-start gap-space-xs"
                >
                  <span
                    class="material-symbols-outlined text-[16px] text-outline flex-shrink-0 mt-0.5"
                    aria-hidden="true"
                    >info</span
                  >
                  <p class="leading-snug">
                    <strong class="text-on-surface-variant">Cancellation Policy:</strong> Free
                    cancellation up to 24 hours prior to session start. Unannounced no-shows release
                    sensory board allocation to waitlist competitors automatically.
                  </p>
                </div>
              </div>
              <!-- Venue Location & Hardware Card -->
              <div
                class="bg-surface-container-low rounded-xl p-space-md shadow-sm space-y-space-sm"
              >
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-8 h-8 rounded bg-surface-container-high flex items-center justify-center text-primary"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >location_on</span
                    >
                  </div>
                  <div>
                    <h4 class="font-title-md text-title-md text-on-surface">
                      Physical Venue Details
                    </h4>
                    <p class="font-body-sm text-body-sm text-outline">
                      Zurich Chess Center • Room Alpha
                    </p>
                  </div>
                </div>
                <div
                  class="w-full h-32 rounded-lg bg-surface-container-high bg-cover bg-center overflow-hidden relative shadow-inner"
                  data-location="Zurich Chess Center, Lindenhof, Zurich, Switzerland"
                  style="background-image: url('/images/a5ec39e70d60.webp')"
                >
                  <div
                    class="absolute inset-0 bg-surface-container-lowest/40 flex items-end p-space-sm"
                  >
                    <span
                      class="px-space-xs py-0.5 rounded bg-surface-container-lowest/80 text-primary font-label-badge text-label-badge uppercase"
                    >
                      Grandmaster Hall • 2nd Floor
                    </span>
                  </div>
                </div>
                <div class="space-y-1 text-body-sm">
                  <div class="flex items-center justify-between text-on-surface-variant">
                    <span>Hardware Setup:</span>
                    <span class="text-on-surface font-semibold">18 DGT e-Boards (Walnut)</span>
                  </div>
                  <div class="flex items-center justify-between text-on-surface-variant">
                    <span>Time Control Clocks:</span>
                    <span class="text-on-surface font-semibold">DGT 3000 FIDE Clocks</span>
                  </div>
                  <div class="flex items-center justify-between text-on-surface-variant">
                    <span>Analysis Engine:</span>
                    <span class="text-on-surface font-semibold">Club Localstock Server #4</span>
                  </div>
                </div>
                <div class="pt-space-xs">
                  <button
                    class="w-full py-2 px-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-primary font-body-sm text-body-sm font-semibold transition-colors flex items-center justify-center gap-1.5"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                      >chat</span
                    >
                    <span>Message Workshop Coordinator</span>
                  </button>
                </div>
              </div>
              <!-- Confirmed Roster Roster Preview -->
              <div
                class="bg-surface-container-low rounded-xl p-space-md shadow-sm space-y-space-sm"
              >
                <div class="flex items-center justify-between">
                  <h4 class="font-title-md text-title-md text-on-surface">Confirmed Roster (14)</h4>
                  <span
                    class="font-label-badge text-label-badge text-primary bg-surface-container-high px-space-xs py-0.5 rounded"
                  >
                    Active Members
                  </span>
                </div>
                <div class="space-y-space-xs">
                  <!-- Roster Row 1 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded bg-surface-container hover:bg-surface-container-high transition-colors"
                  >
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center text-primary font-label-badge text-label-badge font-bold"
                      >
                        MK
                      </div>
                      <div class="flex flex-col">
                        <span
                          class="font-body-md text-body-md text-on-surface font-medium leading-snug"
                          >Mikhail Koltsov</span
                        >
                        <span class="font-body-sm text-body-sm text-outline"
                          >Category 1 • Board #01</span
                        >
                      </div>
                    </div>
                    <span
                      class="px-space-xs py-0.5 rounded bg-surface-container-high text-secondary font-label-badge text-label-badge"
                      >CONFIRMED</span
                    >
                  </div>
                  <!-- Roster Row 2 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded bg-surface-container hover:bg-surface-container-high transition-colors"
                  >
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center text-secondary font-label-badge text-label-badge font-bold"
                      >
                        JL
                      </div>
                      <div class="flex flex-col">
                        <span
                          class="font-body-md text-body-md text-on-surface font-medium leading-snug"
                          >Jun-ho Lim</span
                        >
                        <span class="font-body-sm text-body-sm text-outline"
                          >Active League • Board #02</span
                        >
                      </div>
                    </div>
                    <span
                      class="px-space-xs py-0.5 rounded bg-surface-container-high text-secondary font-label-badge text-label-badge"
                      >CONFIRMED</span
                    >
                  </div>
                  <!-- Roster Row 3 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded bg-surface-container hover:bg-surface-container-high transition-colors"
                  >
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center text-primary font-label-badge text-label-badge font-bold"
                      >
                        AF
                      </div>
                      <div class="flex flex-col">
                        <span
                          class="font-body-md text-body-md text-on-surface font-medium leading-snug"
                          >Ananya Fernandez</span
                        >
                        <span class="font-body-sm text-body-sm text-outline"
                          >Premier Tier • Board #03</span
                        >
                      </div>
                    </div>
                    <span
                      class="px-space-xs py-0.5 rounded bg-surface-container-high text-secondary font-label-badge text-label-badge"
                      >CONFIRMED</span
                    >
                  </div>
                  <!-- Roster Row 4 -->
                  <div
                    class="flex items-center justify-between p-space-xs rounded bg-surface-container hover:bg-surface-container-high transition-colors"
                  >
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-8 h-8 rounded-full bg-surface-container-highest flex items-center justify-center text-on-surface-variant font-label-badge text-label-badge font-bold"
                      >
                        DK
                      </div>
                      <div class="flex flex-col">
                        <span
                          class="font-body-md text-body-md text-on-surface font-medium leading-snug"
                          >David Kowalski</span
                        >
                        <span class="font-body-sm text-body-sm text-outline"
                          >Category 1 • Board #04</span
                        >
                      </div>
                    </div>
                    <span
                      class="px-space-xs py-0.5 rounded bg-surface-container-high text-secondary font-label-badge text-label-badge"
                      >CONFIRMED</span
                    >
                  </div>
                </div>
                <div class="text-center pt-space-xs">
                  <span class="text-body-sm text-outline font-medium"
                    >+ 10 additional club registrants</span
                  >
                </div>
              </div>
            </aside>
          </div>
        </section>
        <!-- Interactive Client-side Scripting -->
      </div>
    </main>
  </ClubLayout>
</template>
