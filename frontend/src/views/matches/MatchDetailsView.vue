<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin-desktop">
      <div class="flex flex-col w-full text-on-surface pb-space-xl">
        <!-- Top Auxiliary Utility Bar / Breadcrumbs -->
        <div
          class="flex flex-wrap items-center justify-between gap-space-md py-space-md mb-space-md"
        >
          <nav
            class="flex items-center gap-space-xs font-body-sm text-body-sm text-on-surface-variant"
          >
            <RouterLink
              class="hover:text-primary transition-colors flex items-center gap-1"
              data-path="home"
              to="/"
            >
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true">home</span>
              <span>Home</span>
            </RouterLink>
            <span class="text-outline text-xs">/</span>
            <RouterLink
              class="hover:text-primary transition-colors"
              data-path="match-history"
              to="/matches"
              >Matches</RouterLink
            >
            <span class="text-outline text-xs">/</span>
            <span class="text-primary font-semibold tracking-wide">Match #CH-2025-084</span>
          </nav>
          <div class="flex items-center gap-space-sm">
            <button
              class="inline-flex items-center gap-2 px-space-md py-1.5 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md shadow-sm transition-all"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px] text-primary" aria-hidden="true"
                >picture_as_pdf</span
              >
              <span>Scoresheet PDF</span>
            </button>
            <RouterLink
              class="inline-flex items-center gap-1.5 px-space-md py-1.5 rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface font-title-md text-title-md transition-colors"
              data-path="match-history"
              to="/matches/history"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >arrow_back</span
              >
              <span>Match History</span>
            </RouterLink>
            <span
              class="inline-flex items-center gap-1.5 px-space-md py-1.5 rounded-lg bg-primary hover:bg-primary-container text-on-primary font-title-md text-title-md shadow-md transition-all"
              data-path="leaderboard"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >leaderboard</span
              >
              <span>Standings</span>
            </span>
          </div>
        </div>
        <!-- Primary Headline Match Card -->
        <section
          class="relative w-full rounded-2xl bg-surface-container-low shadow-xl overflow-hidden mb-space-xl"
        >
          <!-- Atmospheric subtle tournament accent glows -->
          <div
            class="absolute -top-32 -left-24 w-96 h-96 rounded-full bg-primary/5 blur-3xl pointer-events-none"
          ></div>
          <div
            class="absolute -bottom-32 -right-24 w-96 h-96 rounded-full bg-tertiary-container/5 blur-3xl pointer-events-none"
          ></div>
          <!-- Card Status Header Ribbon -->
          <div
            class="px-space-xl py-space-sm bg-surface-container flex flex-wrap items-center justify-between gap-space-sm"
          >
            <div class="flex items-center gap-space-sm">
              <span
                class="inline-flex items-center gap-1.5 px-space-sm py-1 rounded bg-secondary-container/40 text-primary font-label-badge text-label-badge uppercase tracking-wider"
              >
                <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                Match Completed
              </span>
              <span class="text-on-surface-variant font-body-sm text-body-sm"
                >FIDE Classical Circuit • Board 2</span
              >
            </div>
            <div
              class="inline-flex items-center gap-2 px-space-md py-1 rounded-full bg-secondary-container/60 text-secondary-fixed font-title-md text-body-sm"
            >
              <span
                class="material-symbols-outlined text-primary text-[18px]"
                style="font-variation-settings: 'FILL' 1"
                aria-hidden="true"
                >verified</span
              >
              <span>Official Result Validated by Admin Marcus</span>
            </div>
          </div>
          <!-- Matchup Display (White / Center Score / Black) -->
          <div
            class="p-space-xl grid grid-cols-1 lg:grid-cols-12 gap-space-lg items-center relative"
          >
            <!-- White Player Column (Col 1-4) -->
            <div
              class="lg:col-span-4 flex flex-col items-center lg:items-start text-center lg:text-left space-y-space-sm"
            >
              <div class="flex items-center gap-space-md">
                <div class="relative">
                  <div
                    class="w-20 h-20 rounded-2xl overflow-hidden shadow-lg bg-surface-container-highest"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Close up photographic studio portrait of Alex Rivera, an analytical chess grandmaster with focused piercing eyes, subtle moody low-key studio lighting with warm verdant accents, dark atmospheric tournament room background."
                      src="/images/daf82070727f.webp"
                      alt=""
                    />
                  </div>
                  <div
                    class="absolute -bottom-1 -right-1 w-6 h-6 rounded-full bg-surface-bright flex items-center justify-center shadow"
                    title="Playing as White"
                  >
                    <span
                      class="material-symbols-outlined text-on-surface text-[15px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >chess</span
                    >
                  </div>
                </div>
                <div class="flex flex-col">
                  <div class="flex items-center gap-1.5">
                    <span
                      class="px-1.5 py-0.5 rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge"
                      >FM</span
                    >
                    <span
                      class="font-headline-sm text-headline-sm text-on-surface hover:text-primary transition-colors"
                      data-path="my-profile"
                      >Alex Rivera</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >White King • Elo-free Club Standard</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-secondary mt-0.5"
                    >320 pts
                    <span class="text-on-surface-variant font-normal">current season</span></span
                  >
                </div>
              </div>
              <div class="mt-space-xs flex items-center gap-space-sm">
                <span
                  class="inline-flex items-center gap-1.5 px-space-md py-1 rounded bg-secondary-container/50 text-primary font-headline-sm text-headline-sm"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >trophy</span
                  >
                  <span>VICTORY (+20 pts)</span>
                </span>
                <span
                  class="px-2 py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge font-semibold"
                  >Rank #4 → #3</span
                >
              </div>
            </div>
            <!-- Center Typography & Match Geometry (Col 5-8) -->
            <div
              class="lg:col-span-4 flex flex-col items-center justify-center text-center py-space-sm"
            >
              <span
                class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-widest mb-1"
                >Classical Match Standard</span
              >
              <div class="flex items-baseline justify-center gap-space-md my-space-xs">
                <span
                  class="font-display-lg text-[64px] leading-none text-primary font-extrabold tracking-tighter"
                  >1</span
                >
                <span class="text-on-surface-variant font-headline-lg text-headline-lg opacity-40"
                  >—</span
                >
                <span
                  class="font-display-lg text-[64px] leading-none text-on-surface-variant opacity-60 font-extrabold tracking-tighter"
                  >0</span
                >
              </div>
              <div
                class="inline-flex items-center gap-2 px-space-md py-1 rounded-full bg-surface-container-high text-on-surface text-body-sm font-body-sm mb-space-xs"
              >
                <span class="material-symbols-outlined text-primary text-[16px]" aria-hidden="true"
                  >timer</span
                >
                <span>Classical 90 min + 30s / move</span>
              </div>
              <div
                class="flex flex-col items-center text-on-surface-variant font-body-sm text-body-sm mt-1"
              >
                <span class="text-on-surface font-title-md text-title-md"
                  >Club Hall A • Board 2</span
                >
                <span>Tuesday, Apr 8, 2025 at 18:30 UTC</span>
                <span class="text-xs text-outline mt-0.5">Match Ref: CH-2025-084-CL</span>
              </div>
            </div>
            <!-- Black Player Column (Col 9-12) -->
            <div
              class="lg:col-span-4 flex flex-col items-center lg:items-end text-center lg:text-right space-y-space-sm"
            >
              <div class="flex items-center lg:flex-row-reverse gap-space-md">
                <div class="relative">
                  <div
                    class="w-20 h-20 rounded-2xl overflow-hidden shadow-lg bg-surface-container-highest"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Atmospheric dramatic portrait photo of Tariq Al-Mansoor, serious competitive chess player looking contemplative, side profile under directional cool dark lighting, deep shadows, textured background."
                      src="/images/3eb9c05d6696.webp"
                      alt=""
                    />
                  </div>
                  <div
                    class="absolute -bottom-1 -left-1 w-6 h-6 rounded-full bg-surface-container-lowest flex items-center justify-center shadow"
                    title="Playing as Black"
                  >
                    <span
                      class="material-symbols-outlined text-on-surface-variant text-[15px]"
                      aria-hidden="true"
                      >chess</span
                    >
                  </div>
                </div>
                <div class="flex flex-col">
                  <div class="flex items-center lg:justify-end gap-1.5">
                    <span
                      class="font-headline-sm text-headline-sm text-on-surface hover:text-primary transition-colors"
                      data-path="my-profile"
                      >Tariq Al-Mansoor</span
                    >
                    <span
                      class="px-1.5 py-0.5 rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge"
                      >CM</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Black King • Tactical Defense</span
                  >
                  <span
                    class="font-label-numeric-md text-label-numeric-md text-on-surface-variant mt-0.5"
                    >180 pts <span class="text-outline font-normal">current season</span></span
                  >
                </div>
              </div>
              <div class="mt-space-xs flex items-center gap-space-sm">
                <span
                  class="px-2 py-0.5 rounded bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge"
                  >Maintained Rank #8</span
                >
                <span
                  class="inline-flex items-center gap-1.5 px-space-md py-1 rounded bg-error-container/20 text-error font-headline-sm text-headline-sm"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >close</span
                  >
                  <span>DEFEAT (0 pts)</span>
                </span>
              </div>
            </div>
          </div>
          <!-- Match Footnote Details Strip -->
          <div
            class="px-space-xl py-space-sm bg-surface-container-lowest/80 flex flex-wrap items-center justify-between gap-space-md font-body-sm text-body-sm text-on-surface-variant"
          >
            <div class="flex items-center gap-space-lg">
              <span class="flex items-center gap-1.5">
                <span class="material-symbols-outlined text-primary text-[18px]" aria-hidden="true"
                  >schedule</span
                >
                <span>Duration: <strong>2 hr 15 min</strong> (41 moves)</span>
              </span>
              <span class="flex items-center gap-1.5">
                <span
                  class="material-symbols-outlined text-secondary text-[18px]"
                  aria-hidden="true"
                  >menu_book</span
                >
                <span>Opening: <strong>B90 Sicilian Defense, Najdorf Variation</strong></span>
              </span>
            </div>
            <div class="flex items-center gap-space-xs">
              <span class="w-2 h-2 rounded-full bg-primary"></span>
              <span class="text-on-surface font-title-md text-body-sm"
                >Swiss pairing standard applied</span
              >
            </div>
          </div>
        </section>
        <!-- Match Dossier 3-Column Grid -->
        <section class="grid grid-cols-1 lg:grid-cols-3 gap-space-lg mb-space-xl items-stretch">
          <!-- Panel 1: Match Metadata -->
          <div
            class="flex flex-col rounded-2xl bg-surface-container-low p-space-lg shadow-lg relative overflow-hidden"
          >
            <div class="flex items-center justify-between pb-space-sm mb-space-md">
              <div class="flex items-center gap-space-sm">
                <div
                  class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >assignment</span
                  >
                </div>
                <h2 class="font-headline-sm text-headline-sm text-on-surface">Match Metadata</h2>
              </div>
              <span
                class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-secondary"
                >Verified Record</span
              >
            </div>
            <dl class="flex flex-col gap-space-sm text-body-sm font-body-sm">
              <div class="flex justify-between items-center py-space-xs">
                <dt class="text-on-surface-variant">Match Identifier</dt>
                <dd class="font-label-numeric-md text-label-numeric-md text-primary">
                  #CH-2025-084
                </dd>
              </div>
              <div
                class="flex justify-between items-center py-space-xs bg-surface-container/40 px-2 rounded"
              >
                <dt class="text-on-surface-variant">Tournament Season</dt>
                <dd class="text-on-surface font-medium">Spring League 2025</dd>
              </div>
              <div class="flex justify-between items-center py-space-xs px-2">
                <dt class="text-on-surface-variant">Competition Stage</dt>
                <dd class="text-on-surface font-medium">Round 5 of 10</dd>
              </div>
              <div
                class="flex justify-between items-center py-space-xs bg-surface-container/40 px-2 rounded"
              >
                <dt class="text-on-surface-variant">Venue &amp; Board</dt>
                <dd class="text-on-surface font-medium">Club Hall A — Board 2</dd>
              </div>
              <div class="flex justify-between items-center py-space-xs px-2">
                <dt class="text-on-surface-variant">Official Arbiter</dt>
                <dd class="text-primary font-semibold flex items-center gap-1">
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >verified_user</span
                  >
                  <span>Admin Marcus</span>
                </dd>
              </div>
              <div
                class="flex justify-between items-center py-space-xs bg-surface-container/40 px-2 rounded"
              >
                <dt class="text-on-surface-variant">Protocol standard</dt>
                <dd class="text-on-surface font-medium">FIDE Rapid/Classical Rules</dd>
              </div>
              <div class="flex justify-between items-center py-space-xs px-2">
                <dt class="text-on-surface-variant">Notation Sheet Archive</dt>
                <dd class="inline-flex items-center gap-1 text-secondary font-medium">
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >check_circle</span
                  >
                  <span>Confirmed (#SH-084-A)</span>
                </dd>
              </div>
            </dl>
            <!-- Mini SVG Move Accuracy Indicator -->
            <div class="mt-auto pt-space-md">
              <div
                class="p-space-sm rounded-xl bg-surface-container flex items-center justify-between"
              >
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >analytics</span
                  >
                  <div class="flex flex-col">
                    <span class="text-xs font-semibold text-on-surface">Precision Metric</span>
                    <span class="text-[11px] text-on-surface-variant"
                      >White: 94.2% • Black: 87.1%</span
                    >
                  </div>
                </div>
                <!-- Sparkline SVG -->
                <svg class="w-24 h-6 text-primary" fill="none" viewBox="0 0 100 24">
                  <path
                    d="M0 20 L15 16 L30 18 L45 8 L60 12 L75 4 L90 7 L100 2"
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                  ></path>
                </svg>
              </div>
            </div>
          </div>
          <!-- Panel 2: Result & Points Breakdown -->
          <div
            class="flex flex-col rounded-2xl bg-surface-container-low p-space-lg shadow-lg relative overflow-hidden"
          >
            <div class="flex items-center justify-between pb-space-sm mb-space-md">
              <div class="flex items-center gap-space-sm">
                <div
                  class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >calculate</span
                  >
                </div>
                <h2 class="font-headline-sm text-headline-sm text-on-surface">Points Breakdown</h2>
              </div>
              <span
                class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-on-surface-variant"
                >Club Standard</span
              >
            </div>
            <!-- Player 1 points calculation card -->
            <div
              class="p-space-sm rounded-xl bg-surface-container mb-space-sm flex flex-col gap-1.5"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-2">
                  <span class="w-2.5 h-2.5 rounded-full bg-surface-bright"></span>
                  <span class="font-title-md text-title-md text-on-surface"
                    >Alex Rivera (White)</span
                  >
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                  >+20 pts</span
                >
              </div>
              <div class="grid grid-cols-3 gap-2 text-xs text-on-surface-variant pt-1">
                <div>Base: <span class="text-on-surface font-medium">+20 pts</span></div>
                <div>Bonus: <span class="text-on-surface font-medium">None</span></div>
                <div class="text-right">
                  Rank: <span class="text-primary font-semibold">#4 → #3</span>
                </div>
              </div>
            </div>
            <!-- Player 2 points calculation card -->
            <div
              class="p-space-sm rounded-xl bg-surface-container mb-space-md flex flex-col gap-1.5"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-2">
                  <span class="w-2.5 h-2.5 rounded-full bg-surface-container-lowest"></span>
                  <span class="font-title-md text-title-md text-on-surface"
                    >Tariq Al-Mansoor (Black)</span
                  >
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                  >0 pts</span
                >
              </div>
              <div class="grid grid-cols-3 gap-2 text-xs text-on-surface-variant pt-1">
                <div>Base: <span class="text-on-surface font-medium">0 pts</span></div>
                <div>Bonus: <span class="text-on-surface font-medium">None</span></div>
                <div class="text-right">
                  Rank: <span class="text-on-surface font-medium">#8 (Held)</span>
                </div>
              </div>
            </div>
            <!-- Valuation Rules Callout -->
            <div class="mt-auto p-space-md rounded-xl bg-surface-container-high/60">
              <div class="flex items-start gap-space-sm">
                <span
                  class="material-symbols-outlined text-primary text-[20px] shrink-0 mt-0.5"
                  aria-hidden="true"
                  >info</span
                >
                <div class="flex flex-col gap-1">
                  <span class="font-title-md text-body-sm text-on-surface"
                    >Club Points Valuation Note</span
                  >
                  <p class="font-body-sm text-body-sm text-on-surface-variant leading-relaxed">
                    In accordance with ChessHub League Regulations, matches award
                    <strong>+20 pts</strong> for victory, <strong>+10 pts</strong> for a draw, and
                    <strong>0 pts</strong> for defeat. No Elo rating recalculations are factored
                    into the seasonal league ladder.
                  </p>
                </div>
              </div>
            </div>
          </div>
          <!-- Panel 3: Match Timeline & Acceptance Log -->
          <div
            class="flex flex-col rounded-2xl bg-surface-container-low p-space-lg shadow-lg relative overflow-hidden"
          >
            <div class="flex items-center justify-between pb-space-sm mb-space-md">
              <div class="flex items-center gap-space-sm">
                <div
                  class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >history_toggle_off</span
                  >
                </div>
                <h2 class="font-headline-sm text-headline-sm text-on-surface">Match Timeline</h2>
              </div>
              <span
                class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-container-highest text-secondary"
                >6 Audit Nodes</span
              >
            </div>
            <!-- Chronological Event Chain -->
            <div class="relative pl-6 space-y-4 my-auto">
              <!-- Connecting Vertical Guide -->
              <div
                class="absolute left-2.5 top-2 bottom-2 w-0.5 bg-surface-container-highest"
              ></div>
              <!-- Node 1 -->
              <div class="relative flex flex-col group">
                <span
                  class="absolute -left-6 top-1 w-2.5 h-2.5 rounded-full bg-outline group-hover:bg-primary transition-colors"
                ></span>
                <div class="flex items-center justify-between">
                  <span class="font-title-md text-body-sm text-on-surface"
                    >Match Created &amp; Pairings Sent</span
                  >
                  <span class="font-body-sm text-xs text-on-surface-variant">Mar 28, 2025</span>
                </div>
                <span class="font-body-sm text-xs text-outline"
                  >System auto-paired Round 5 schedule</span
                >
              </div>
              <!-- Node 2 -->
              <div class="relative flex flex-col group">
                <span
                  class="absolute -left-6 top-1 w-2.5 h-2.5 rounded-full bg-outline group-hover:bg-primary transition-colors"
                ></span>
                <div class="flex items-center justify-between">
                  <span class="font-title-md text-body-sm text-on-surface"
                    >White Player Accepted</span
                  >
                  <span class="font-body-sm text-xs text-on-surface-variant">Mar 29, 2025</span>
                </div>
                <span class="font-body-sm text-xs text-outline"
                  >Alex Rivera verified fixture attendance</span
                >
              </div>
              <!-- Node 3 -->
              <div class="relative flex flex-col group">
                <span
                  class="absolute -left-6 top-1 w-2.5 h-2.5 rounded-full bg-outline group-hover:bg-primary transition-colors"
                ></span>
                <div class="flex items-center justify-between">
                  <span class="font-title-md text-body-sm text-on-surface"
                    >Black Player Accepted</span
                  >
                  <span class="font-body-sm text-xs text-on-surface-variant">Mar 30, 2025</span>
                </div>
                <span class="font-body-sm text-xs text-outline"
                  >Tariq Al-Mansoor confirmed board assignment</span
                >
              </div>
              <!-- Node 4 -->
              <div class="relative flex flex-col group">
                <span class="absolute -left-6 top-1 w-2.5 h-2.5 rounded-full bg-secondary"></span>
                <div class="flex items-center justify-between">
                  <span class="font-title-md text-body-sm text-on-surface">Match Commenced</span>
                  <span class="font-body-sm text-xs text-secondary font-medium"
                    >Apr 8, 18:30 UTC</span
                  >
                </div>
                <span class="font-body-sm text-xs text-outline"
                  >Both clocks engaged at Club Hall A</span
                >
              </div>
              <!-- Node 5 -->
              <div class="relative flex flex-col group">
                <span class="absolute -left-6 top-1 w-2.5 h-2.5 rounded-full bg-secondary"></span>
                <div class="flex items-center justify-between">
                  <span class="font-title-md text-body-sm text-on-surface"
                    >Result Signed by Players</span
                  >
                  <span class="font-body-sm text-xs text-secondary font-medium"
                    >Apr 8, 20:45 UTC</span
                  >
                </div>
                <span class="font-body-sm text-xs text-outline"
                  >Physical sheet countersigned after move 41</span
                >
              </div>
              <!-- Node 6 (Active / Validated) -->
              <div class="relative flex flex-col">
                <span
                  class="absolute -left-6 top-1 w-2.5 h-2.5 rounded-full bg-primary ring-4 ring-primary/20"
                ></span>
                <div class="flex items-center justify-between">
                  <span class="font-title-md text-body-sm text-primary font-semibold"
                    >Arbiter Validated Result</span
                  >
                  <span class="font-body-sm text-xs text-primary font-medium"
                    >Apr 8, 21:00 UTC</span
                  >
                </div>
                <span class="font-body-sm text-xs text-on-surface-variant"
                  >Admin Marcus recalculated ladder rankings</span
                >
              </div>
            </div>
            <div class="pt-space-md mt-auto">
              <div class="flex items-center justify-between text-xs text-outline px-1">
                <span>SHA-256 Audit: d8a9...4e10</span>
                <span class="text-primary font-mono font-medium">STATUS: SEALED</span>
              </div>
            </div>
          </div>
        </section>
        <!-- Interactive PGN & Move Notation Log Preview Drawer -->
        <section class="rounded-2xl bg-surface-container-low p-space-lg shadow-lg mb-space-xl">
          <div class="flex flex-wrap items-center justify-between gap-space-sm mb-space-md">
            <div class="flex items-center gap-space-sm">
              <span class="material-symbols-outlined text-primary text-[22px]" aria-hidden="true"
                >code</span
              >
              <div>
                <h3 class="font-headline-sm text-headline-sm text-on-surface">
                  Game Record &amp; Official Notation
                </h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Archived PGN string validated by Arbiter Desk
                </p>
              </div>
            </div>
            <div class="flex items-center gap-space-xs">
              <button
                class="inline-flex items-center gap-1.5 px-space-md py-1.5 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-body-sm transition-colors"
                id="copyPgnBtn"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >content_copy</span
                >
                <span id="copyText">Copy PGN</span>
              </button>
              <button
                class="inline-flex items-center gap-1.5 px-space-md py-1.5 rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface-variant hover:text-on-surface font-title-md text-body-sm transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                  >open_in_new</span
                >
                <span>Analyze in Board</span>
              </button>
            </div>
          </div>
          <!-- Monospace Notation Terminal Box -->
          <div
            class="p-space-md rounded-xl bg-surface-container-lowest font-mono text-xs text-on-surface-variant leading-relaxed overflow-x-auto selection:bg-primary selection:text-on-primary"
          >
            <span class="text-secondary">[Event "ChessHub Spring League 2025"]</span><br />
            <span class="text-secondary">[Site "Club Hall A, Board 2"]</span><br />
            <span class="text-secondary">[Date "2025.04.08"]</span><br />
            <span class="text-secondary">[Round "5"]</span><br />
            <span class="text-secondary">[White "Rivera, Alex"]</span><br />
            <span class="text-secondary">[Black "Al-Mansoor, Tariq"]</span><br />
            <span class="text-secondary">[Result "1-0"]</span><br />
            <span class="text-secondary">[ECO "B90"]</span><br />
            <span class="text-secondary">[WhiteElo "Club 320 pts"]</span><br />
            <span class="text-secondary">[BlackElo "Club 180 pts"]</span><br /><br />
            <span class="text-on-surface font-medium"
              >1. e4 c5 2. Nf3 d6 3. d4 cxd4 4. Nxd4 Nf6 5. Nc3 a6 6. Be3 e5 7. Nb3 Be6 8. Qd2 Nbd7
              9. f3 b5 10. O-O-O Be7 11. g4 b4 12. Nd5 Bxd5 13. exd5 Nb6 14. Na5 Nbxd5 15. Nc6 Qc7
              16. Nxe7 Nxe3 17. Qxe3 Kxe7 18. g5 Nd7 19. f4 Rhc8 20. Bd3 Qc5 21. Qe2 Kf8 22. Rhf1
              Kg8 23. Bxh7+ Kxh7 24. Qh5+ Kg8 25. Rd2 exf4 26. Rxf4 Ne5 27. Rh4 Ng6 28. Qh7+ Kf8 29.
              Re4 Qxg5 30. h4 Qf5 31. Rde2 d5 32. R4e3 d4 33. Re4 d3 34. h5 dxe2 35. Rxe2 Qf1+ 36.
              Kd2 Rd8+ 37. Ke3 Qf4# 1-0</span
            >
          </div>
        </section>
        <!-- Bottom Global Actions Strip -->
        <div
          class="flex flex-wrap items-center justify-between gap-space-md pt-space-sm border-t border-surface-container-high/40"
        >
          <div class="flex items-center gap-space-sm">
            <span
              class="inline-flex items-center gap-2 px-space-lg py-2.5 rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface font-title-md text-title-md transition-colors shadow-sm"
              data-path="match-history"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >arrow_back</span
              >
              <span>Back to Match History</span>
            </span>
            <span
              class="inline-flex items-center gap-2 px-space-lg py-2.5 rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-primary font-title-md text-title-md transition-colors shadow-sm"
              data-path="leaderboard"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >table_rows</span
              >
              <span>View Tournament Standings</span>
            </span>
          </div>
          <div
            class="flex items-center gap-space-sm text-on-surface-variant font-body-sm text-body-sm"
          >
            <span class="material-symbols-outlined text-[18px] text-secondary" aria-hidden="true"
              >verified</span
            >
            <span>Official Match File Sealed on Arweave &amp; FIDE Swiss System</span>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
