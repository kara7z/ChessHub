<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin-desktop">
      <div class="flex flex-col w-full">
        <!-- Dynamic Atmospheric Cover Banner -->
        <div class="relative w-full h-72 md:h-80 overflow-hidden bg-surface-container-lowest">
          <div
            class="w-full h-full bg-cover bg-center"
            data-alt="Cinematic macro shot of an ebony wooden chess king and queen placed on a dark walnut tournament chessboard. Low key studio rim lighting with subtle green bokeh, dramatic moody atmosphere, ultra fine tactile texture, volumetric soft smoke haze, dark obsidian tones."
            style="background-image: url('/images/fd4cd045968e.webp')"
          ></div>
          <div
            class="absolute inset-0 bg-gradient-to-t from-surface via-surface/60 to-transparent"
          ></div>
          <div
            class="absolute inset-0 bg-radial from-transparent via-transparent to-surface/80"
          ></div>
          <!-- Watermark Club Crest Badge Overlay -->
          <div
            class="absolute right-8 top-8 opacity-15 pointer-events-none hidden md:flex items-center gap-2"
          >
            <span class="material-symbols-outlined text-[120px] text-primary" aria-hidden="true"
              >military_tech</span
            >
          </div>
          <!-- Action Tray Top-Right -->
          <div class="absolute top-6 right-margin-desktop flex items-center gap-space-sm z-10">
            <button
              class="flex items-center gap-space-xs px-space-md py-space-xs bg-surface-container-high/90 hover:bg-surface-container-highest backdrop-blur-md rounded-lg text-on-surface font-title-md text-title-md transition-all shadow-md"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">share</span>
              <span>Share Profile</span>
            </button>
            <button
              class="flex items-center gap-space-xs px-space-md py-space-xs bg-primary hover:bg-secondary text-on-primary font-title-md text-title-md rounded-lg transition-all shadow-md"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">swords</span>
              <span>Challenge</span>
            </button>
          </div>
        </div>
        <!-- Profile Identity Section Overlapping Cover -->
        <div class="relative z-10 px-margin-desktop -mt-20">
          <div class="flex flex-col lg:flex-row lg:items-end justify-between gap-space-lg">
            <div class="flex flex-col sm:flex-row items-start sm:items-end gap-space-lg">
              <!-- Avatar Stack with Club Rank #1 Badge -->
              <div class="relative">
                <div
                  class="w-32 h-32 rounded-xl bg-surface-container-high p-1 shadow-2xl ring-2 ring-primary/40"
                >
                  <img
                    class="w-full h-full object-cover rounded-lg"
                    data-alt="Intense portrait of Adam Chen, a sharp 26-year-old Asian competitive chess player with focused calm expression, wearing a tailored charcoal dark knit turtleneck against a dim slate studio backdrop with verdant neon rim light."
                    src="/images/bf22f610edc3.webp"
                    alt=""
                  />
                </div>
                <!-- Rank #1 Medallion -->
                <div
                  class="absolute -bottom-2 -right-2 flex items-center gap-1 bg-surface-container-highest text-primary px-2.5 py-1 rounded-full shadow-xl"
                >
                  <span
                    class="material-symbols-outlined text-[16px] text-primary"
                    style="font-variation-settings: 'FILL' 1"
                    aria-hidden="true"
                    >workspace_premium</span
                  >
                  <span class="font-label-badge text-label-badge text-on-surface tracking-wider"
                    >#1 CLUB</span
                  >
                </div>
              </div>
              <!-- Player Name and High-Level Title Info -->
              <div class="flex flex-col pb-1">
                <div class="flex flex-wrap items-center gap-space-sm">
                  <h1 class="font-headline-lg text-headline-lg text-on-surface">Adam Chen</h1>
                  <span class="font-title-md text-title-md text-on-surface-variant"
                    >@adam_chen</span
                  >
                  <span
                    class="px-2.5 py-0.5 rounded-full bg-secondary-container/60 text-secondary font-label-badge text-label-badge uppercase tracking-wider flex items-center gap-1"
                  >
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >trophy</span
                    >
                    Club Champion 2024
                  </span>
                </div>
                <div
                  class="flex flex-wrap items-center gap-y-1 gap-x-4 mt-space-xs font-body-sm text-body-sm text-on-surface-variant"
                >
                  <span class="flex items-center gap-1">
                    <span
                      class="material-symbols-outlined text-[16px] text-primary"
                      aria-hidden="true"
                      >verified</span
                    >
                    Advanced Candidate
                  </span>
                  <span class="w-1 h-1 rounded-full bg-outline-variant"></span>
                  <span>Member since: Oct 2023</span>
                  <span class="w-1 h-1 rounded-full bg-outline-variant"></span>
                  <span
                    class="font-label-numeric-md text-label-numeric-md tracking-wider text-on-surface"
                    >FIDE ID: CH-1049</span
                  >
                </div>
              </div>
            </div>
            <!-- Quick Status Badges Card -->
            <div
              class="flex items-center gap-space-md p-space-sm bg-surface-container-high/90 backdrop-blur-md rounded-xl shadow-lg self-stretch sm:self-auto"
            >
              <div class="flex flex-col px-space-md py-1">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                  >Club Rank</span
                >
                <div class="flex items-baseline gap-1 mt-0.5">
                  <span class="font-label-numeric-lg text-label-numeric-lg text-primary">#1</span>
                  <span class="font-body-sm text-body-sm text-secondary">Grandmaster tier</span>
                </div>
              </div>
              <div class="w-px h-8 bg-surface-variant"></div>
              <div class="flex flex-col px-space-md py-1">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                  >Season Points</span
                >
                <div class="flex items-baseline gap-1 mt-0.5">
                  <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                    >330</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant">pts</span>
                </div>
              </div>
              <div class="w-px h-8 bg-surface-variant"></div>
              <div class="flex flex-col px-space-md py-1">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                  >Current Streak</span
                >
                <div class="flex items-center gap-1.5 mt-0.5">
                  <span
                    class="material-symbols-outlined text-primary text-[18px]"
                    aria-hidden="true"
                    >local_fire_department</span
                  >
                  <span class="font-label-numeric-lg text-label-numeric-lg text-primary">5 W</span>
                </div>
              </div>
            </div>
          </div>
          <!-- Bio Card & Tactical Specialties -->
          <div
            class="mt-space-md max-w-4xl p-space-md bg-surface-container-low rounded-xl flex flex-col md:flex-row md:items-center justify-between gap-space-md"
          >
            <div class="flex items-start gap-space-sm">
              <span
                class="material-symbols-outlined text-secondary text-[22px] mt-0.5"
                aria-hidden="true"
                >format_quote</span
              >
              <p class="font-body-md text-body-md text-on-surface leading-relaxed">
                Passionate classical chess player. Specializing in the
                <span class="text-primary font-semibold">Sicilian Defense</span> and
                <span class="text-primary font-semibold">King's Indian</span>. 2024 Club Winter Cup
                Winner.
              </p>
            </div>
            <div class="flex items-center gap-space-xs shrink-0 self-start md:self-auto">
              <span
                class="px-2.5 py-1 rounded bg-surface-container text-on-surface-variant font-label-badge text-label-badge"
                >Classical: 2185</span
              >
              <span
                class="px-2.5 py-1 rounded bg-surface-container text-on-surface-variant font-label-badge text-label-badge"
                >Rapid: 2090</span
              >
              <span
                class="px-2.5 py-1 rounded bg-surface-container text-on-surface-variant font-label-badge text-label-badge"
                >Blitz: 2140</span
              >
            </div>
          </div>
        </div>
        <!-- Profile Navigation Tabs Bar -->
        <div class="w-full px-margin-desktop mt-space-lg">
          <div
            class="flex items-center gap-space-xs overflow-x-auto p-1 bg-surface-container-lowest rounded-xl"
          >
            <button
              class="tab-btn active px-space-lg py-space-sm rounded-lg font-title-md text-title-md bg-surface-container-high text-primary shadow-sm flex items-center gap-space-xs transition-all"
              data-tab="overview"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >dashboard</span
              >
              <span>Overview</span>
            </button>
            <RouterLink
              class="tab-btn px-space-lg py-space-sm rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-all flex items-center gap-space-xs"
              data-tab="matches"
              to="/matches/history"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">history</span>
              <span>Match History</span>
              <span
                class="px-2 py-0.2 rounded-full bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge"
                >20</span
              >
            </RouterLink>
            <button
              class="tab-btn px-space-lg py-space-sm rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-all flex items-center gap-space-xs"
              data-tab="points"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >show_chart</span
              >
              <span>Points History</span>
            </button>
            <button
              class="tab-btn px-space-lg py-space-sm rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-all flex items-center gap-space-xs"
              data-tab="seasons"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >calendar_month</span
              >
              <span>Seasons</span>
            </button>
            <button
              class="tab-btn px-space-lg py-space-sm rounded-lg font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-all flex items-center gap-space-xs"
              data-tab="achievements"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >military_tech</span
              >
              <span>Achievements</span>
              <span
                class="px-1.5 py-0.5 rounded-full bg-primary/20 text-primary font-label-badge text-label-badge"
                >14</span
              >
            </button>
          </div>
        </div>
        <!-- Main Active Content: Overview Section -->
        <div
          class="w-full px-margin-desktop mt-space-lg flex flex-col gap-space-xl"
          id="tab-overview"
        >
          <!-- Row 1: Key Metric Cards (Bento Ribbon) -->
          <div class="grid grid-cols-2 sm:grid-cols-4 lg:grid-cols-7 gap-space-sm">
            <div
              class="p-space-md bg-surface-container-low rounded-xl shadow-sm flex flex-col justify-between"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Total Matches</span
              >
              <div class="mt-space-sm flex items-baseline justify-between">
                <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">20</span>
                <span class="material-symbols-outlined text-outline text-[20px]" aria-hidden="true"
                  >sports_score</span
                >
              </div>
            </div>
            <div
              class="p-space-md bg-surface-container-low rounded-xl shadow-sm flex flex-col justify-between"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Victories</span
              >
              <div class="mt-space-sm flex items-baseline justify-between">
                <span class="font-label-numeric-lg text-label-numeric-lg text-primary">15</span>
                <span
                  class="font-label-badge text-label-badge text-primary bg-primary/10 px-1.5 py-0.5 rounded"
                  >+300 pts</span
                >
              </div>
            </div>
            <div
              class="p-space-md bg-surface-container-low rounded-xl shadow-sm flex flex-col justify-between"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Draws</span
              >
              <div class="mt-space-sm flex items-baseline justify-between">
                <span class="font-label-numeric-lg text-label-numeric-lg text-secondary">3</span>
                <span
                  class="font-label-badge text-label-badge text-secondary bg-secondary/10 px-1.5 py-0.5 rounded"
                  >+30 pts</span
                >
              </div>
            </div>
            <div
              class="p-space-md bg-surface-container-low rounded-xl shadow-sm flex flex-col justify-between"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Defeats</span
              >
              <div class="mt-space-sm flex items-baseline justify-between">
                <span class="font-label-numeric-lg text-label-numeric-lg text-error">2</span>
                <span
                  class="font-label-badge text-label-badge text-error bg-error/10 px-1.5 py-0.5 rounded"
                  >0 pts</span
                >
              </div>
            </div>
            <div
              class="p-space-md bg-surface-container-low rounded-xl shadow-sm flex flex-col justify-between"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Win Rate</span
              >
              <div class="mt-space-sm flex items-baseline justify-between">
                <span class="font-label-numeric-lg text-label-numeric-lg text-primary">75.0%</span>
                <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                  >trending_up</span
                >
              </div>
            </div>
            <div
              class="p-space-md bg-surface-container-low rounded-xl shadow-sm flex flex-col justify-between"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Points</span
              >
              <div class="mt-space-sm flex items-baseline justify-between">
                <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">330</span>
                <span class="font-label-badge text-label-badge text-on-surface-variant"
                  >Leader</span
                >
              </div>
            </div>
            <div
              class="p-space-md bg-surface-container-low rounded-xl shadow-sm flex flex-col justify-between col-span-2 sm:col-span-1"
            >
              <span
                class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                >Streak</span
              >
              <div class="mt-space-sm flex items-baseline justify-between">
                <span class="font-label-numeric-lg text-label-numeric-lg text-primary">5 Wins</span>
                <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                  >bolt</span
                >
              </div>
            </div>
          </div>
          <!-- Row 2: Performance Breakdown (Distribution Charts) & Trophy Shelf -->
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-lg">
            <!-- Performance Analytics (7 Cols) -->
            <div
              class="lg:col-span-7 p-space-lg bg-surface-container-low rounded-xl shadow-md flex flex-col justify-between gap-space-lg"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    aria-hidden="true"
                    >pie_chart</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    Performance Breakdown
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                  >Season 2024 / 2025</span
                >
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-lg">
                <!-- Results Proportional Breakdown -->
                <div
                  class="p-space-md bg-surface-container rounded-lg flex flex-col justify-between"
                >
                  <span class="font-title-md text-title-md text-on-surface mb-space-sm"
                    >Match Outcomes</span
                  >
                  <!-- Segmented Progress Bar -->
                  <div
                    class="w-full h-4 rounded-full bg-surface-container-highest overflow-hidden flex my-space-sm"
                  >
                    <div class="h-full bg-primary" style="width: 75%" title="Wins 75%"></div>
                    <div class="h-full bg-secondary" style="width: 15%" title="Draws 15%"></div>
                    <div class="h-full bg-error" style="width: 10%" title="Losses 10%"></div>
                  </div>
                  <div
                    class="flex items-center justify-between text-body-sm font-body-sm mt-space-xs"
                  >
                    <div class="flex items-center gap-1.5">
                      <span class="w-2.5 h-2.5 rounded-full bg-primary"></span>
                      <span class="text-on-surface">Wins (75%)</span>
                    </div>
                    <div class="flex items-center gap-1.5">
                      <span class="w-2.5 h-2.5 rounded-full bg-secondary"></span>
                      <span class="text-on-surface">Draws (15%)</span>
                    </div>
                    <div class="flex items-center gap-1.5">
                      <span class="w-2.5 h-2.5 rounded-full bg-error"></span>
                      <span class="text-on-surface">Losses (10%)</span>
                    </div>
                  </div>
                  <!-- Monospaced Summary Details -->
                  <div
                    class="mt-space-md pt-space-xs flex justify-between font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                  >
                    <span>15W - 3D - 2L</span>
                    <span class="text-primary font-semibold">16.5 / 20.0 Pts Equivalent</span>
                  </div>
                </div>
                <!-- Color Performance Metrics -->
                <div
                  class="p-space-md bg-surface-container rounded-lg flex flex-col justify-between"
                >
                  <span class="font-title-md text-title-md text-on-surface mb-space-sm"
                    >Side Efficiency</span
                  >
                  <!-- White Side Metric -->
                  <div class="flex flex-col gap-1 mb-space-sm">
                    <div class="flex items-center justify-between font-body-sm text-body-sm">
                      <span class="text-on-surface flex items-center gap-1">
                        <span class="w-3 h-3 rounded-sm bg-on-surface inline-block"></span>
                        Playing White
                      </span>
                      <span class="font-label-numeric-md text-label-numeric-md text-primary"
                        >80.0% Win Rate</span
                      >
                    </div>
                    <div
                      class="w-full h-2 rounded-full bg-surface-container-highest overflow-hidden"
                    >
                      <div class="h-full bg-primary" style="width: 80%"></div>
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant text-right"
                      >8 wins, 1 draw, 1 loss</span
                    >
                  </div>
                  <!-- Black Side Metric -->
                  <div class="flex flex-col gap-1">
                    <div class="flex items-center justify-between font-body-sm text-body-sm">
                      <span class="text-on-surface flex items-center gap-1">
                        <span
                          class="w-3 h-3 rounded-sm bg-surface-container-lowest inline-block ring-1 ring-surface-variant"
                        ></span>
                        Playing Black
                      </span>
                      <span class="font-label-numeric-md text-label-numeric-md text-secondary"
                        >70.0% Win Rate</span
                      >
                    </div>
                    <div
                      class="w-full h-2 rounded-full bg-surface-container-highest overflow-hidden"
                    >
                      <div class="h-full bg-secondary" style="width: 70%"></div>
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant text-right"
                      >7 wins, 2 draws, 1 loss</span
                    >
                  </div>
                </div>
              </div>
              <!-- Inline Dynamic Sparkline Chart for Last 10 Rounds Momentum -->
              <div
                class="p-space-md bg-surface-container rounded-lg flex flex-col md:flex-row md:items-center justify-between gap-space-md"
              >
                <div class="flex flex-col">
                  <span class="font-title-md text-title-md text-on-surface">Recent Momentum</span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Form over last 10 official rated club rounds</span
                  >
                </div>
                <div class="flex items-center gap-2">
                  <!-- Round Score Indicators -->
                  <span
                    class="w-7 h-7 rounded bg-primary/20 text-primary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 11: Win"
                    >1</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-primary/20 text-primary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 12: Win"
                    >1</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-secondary/20 text-secondary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 13: Draw"
                    >½</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-error/20 text-error flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 14: Loss"
                    >0</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-primary/20 text-primary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 15: Win"
                    >1</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-primary/20 text-primary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 16: Win"
                    >1</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-primary/20 text-primary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 17: Win"
                    >1</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-primary/20 text-primary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 18: Win"
                    >1</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-secondary/20 text-secondary flex items-center justify-center font-label-numeric-md text-label-numeric-md"
                    title="Round 19: Draw"
                    >½</span
                  >
                  <span
                    class="w-7 h-7 rounded bg-primary/20 text-primary flex items-center justify-center font-label-numeric-md text-label-numeric-md ring-2 ring-primary"
                    title="Round 20: Win (Latest)"
                    >1</span
                  >
                </div>
              </div>
            </div>
            <!-- Season Trophy Shelf (5 Cols) -->
            <div
              class="lg:col-span-5 p-space-lg bg-surface-container-low rounded-xl shadow-md flex flex-col justify-between gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[22px]"
                    style="font-variation-settings: 'FILL' 1"
                    aria-hidden="true"
                    >emoji_events</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">Trophy Shelf</h2>
                </div>
                <span class="font-body-sm text-body-sm text-primary hover:underline"
                  >View All 14</span
                >
              </div>
              <div class="grid grid-cols-1 gap-space-sm">
                <!-- Gold Trophy -->
                <div
                  class="flex items-center gap-space-md p-space-md bg-surface-container rounded-lg hover:bg-surface-container-high transition-colors"
                >
                  <div
                    class="w-12 h-12 rounded-xl bg-primary/20 text-primary flex items-center justify-center shrink-0"
                  >
                    <span
                      class="material-symbols-outlined text-[28px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >trophy</span
                    >
                  </div>
                  <div class="flex flex-col flex-1 min-w-0">
                    <div class="flex items-center justify-between">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Winter 2024 Champion</span
                      >
                      <span
                        class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-primary/20 text-primary"
                        >Gold Cup</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                      >Premier Swiss League • 8.5/9.0 Score</span
                    >
                  </div>
                </div>
                <!-- Silver Medal -->
                <div
                  class="flex items-center gap-space-md p-space-md bg-surface-container rounded-lg hover:bg-surface-container-high transition-colors"
                >
                  <div
                    class="w-12 h-12 rounded-xl bg-surface-container-highest text-secondary flex items-center justify-center shrink-0"
                  >
                    <span
                      class="material-symbols-outlined text-[28px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >military_tech</span
                    >
                  </div>
                  <div class="flex flex-col flex-1 min-w-0">
                    <div class="flex items-center justify-between">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Fall 2024 Runner-up</span
                      >
                      <span
                        class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-surface-variant text-on-surface-variant"
                        >Silver Medal</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                      >Master Classical Round Robin • 7.0/9.0 Score</span
                    >
                  </div>
                </div>
                <!-- Special Honor Badge -->
                <div
                  class="flex items-center gap-space-md p-space-md bg-surface-container rounded-lg hover:bg-surface-container-high transition-colors"
                >
                  <div
                    class="w-12 h-12 rounded-xl bg-primary/10 text-primary flex items-center justify-center shrink-0"
                  >
                    <span class="material-symbols-outlined text-[28px]" aria-hidden="true"
                      >flare</span
                    >
                  </div>
                  <div class="flex flex-col flex-1 min-w-0">
                    <div class="flex items-center justify-between">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Grandmaster 5-Streak</span
                      >
                      <span
                        class="font-label-badge text-label-badge px-2 py-0.5 rounded bg-primary/20 text-primary"
                        >Active</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                      >Consecutive rated tournament victories against experienced players</span
                    >
                  </div>
                </div>
              </div>
              <div
                class="p-space-sm bg-surface-container rounded-lg flex items-center justify-between text-body-sm font-body-sm text-on-surface-variant"
              >
                <span class="flex items-center gap-1.5">
                  <span
                    class="material-symbols-outlined text-[18px] text-primary"
                    aria-hidden="true"
                    >lock</span
                  >
                  Federation Certified Profile
                </span>
                <span class="text-on-surface font-semibold">Clean Conduct Record</span>
              </div>
            </div>
          </div>
          <!-- Row 3: Recent Completed Matches -->
          <div class="flex flex-col gap-space-md">
            <div class="flex items-center justify-between">
              <div class="flex items-center gap-space-xs">
                <span class="material-symbols-outlined text-primary text-[22px]" aria-hidden="true"
                  >swords</span
                >
                <h2 class="font-headline-sm text-headline-sm text-on-surface">
                  Recent Completed Matches
                </h2>
              </div>
              <span
                class="font-title-md text-title-md text-primary hover:underline flex items-center gap-1"
              >
                <span>Full Archive</span>
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >arrow_forward</span
                >
              </span>
            </div>
            <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md">
              <!-- Match 1: Victory vs Alex Rivera -->
              <div
                class="p-space-lg bg-surface-container-low hover:bg-surface-container rounded-xl shadow-md transition-all flex flex-col justify-between gap-space-md"
              >
                <div class="flex items-center justify-between">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                    >Round 20 • Nov 18</span
                  >
                  <!-- Victory Chip -->
                  <span
                    class="font-label-badge text-label-badge px-2.5 py-1 rounded bg-primary/20 text-primary font-bold"
                  >
                    1 - 0 (+20 pts)
                  </span>
                </div>
                <!-- Versus Matchup Display -->
                <div class="flex items-center justify-between gap-space-sm my-space-xs">
                  <!-- Left: Adam Chen -->
                  <div class="flex items-center gap-space-xs min-w-0">
                    <div
                      class="w-10 h-10 rounded-lg overflow-hidden shrink-0 bg-surface-container-high"
                    >
                      <img
                        class="w-full h-full object-cover"
                        data-alt="Close up crop of Adam Chen during an intense chess match."
                        src="/images/1fe8afdcf88a.webp"
                        alt=""
                      />
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Adam Chen</span
                      >
                      <span class="font-body-sm text-body-sm text-primary">White • 2185</span>
                    </div>
                  </div>
                  <!-- Center VS Badge -->
                  <div
                    class="px-2 py-1 rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge shrink-0"
                  >
                    VS
                  </div>
                  <!-- Right: Alex Rivera -->
                  <div class="flex items-center gap-space-xs min-w-0 justify-end text-right">
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Alex Rivera</span
                      >
                      <span class="font-body-sm text-body-sm text-on-surface-variant"
                        >Black • 2110</span
                      >
                    </div>
                    <div
                      class="w-10 h-10 rounded-lg overflow-hidden shrink-0 bg-surface-container-high"
                    >
                      <img
                        class="w-full h-full object-cover"
                        data-alt="Portrait of Alex Rivera, male chess player with dark curly hair and glasses focused on the board."
                        src="/images/6fb6eea7bb07.webp"
                        alt=""
                      />
                    </div>
                  </div>
                </div>
                <!-- Opening & Meta -->
                <div
                  class="p-space-sm bg-surface-container rounded-lg flex items-center justify-between text-body-sm font-body-sm"
                >
                  <span class="text-on-surface-variant truncate"
                    >B90 Sicilian Defense: Najdorf</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >38 Moves</span
                  >
                </div>
              </div>
              <!-- Match 2: Draw vs Youssef M. -->
              <div
                class="p-space-lg bg-surface-container-low hover:bg-surface-container rounded-xl shadow-md transition-all flex flex-col justify-between gap-space-md"
              >
                <div class="flex items-center justify-between">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                    >Round 19 • Nov 11</span
                  >
                  <!-- Draw Chip -->
                  <span
                    class="font-label-badge text-label-badge px-2.5 py-1 rounded bg-secondary/20 text-secondary font-bold"
                  >
                    ½ - ½ (+10 pts)
                  </span>
                </div>
                <!-- Versus Matchup Display -->
                <div class="flex items-center justify-between gap-space-sm my-space-xs">
                  <!-- Left: Adam Chen -->
                  <div class="flex items-center gap-space-xs min-w-0">
                    <div
                      class="w-10 h-10 rounded-lg overflow-hidden shrink-0 bg-surface-container-high"
                    >
                      <img
                        class="w-full h-full object-cover"
                        data-alt="Adam Chen focused in quiet thought during tournament round."
                        src="/images/c75fa63e98d7.webp"
                        alt=""
                      />
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Adam Chen</span
                      >
                      <span class="font-body-sm text-body-sm text-secondary">Black • 2180</span>
                    </div>
                  </div>
                  <!-- Center VS Badge -->
                  <div
                    class="px-2 py-1 rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge shrink-0"
                  >
                    VS
                  </div>
                  <!-- Right: Youssef M. -->
                  <div class="flex items-center gap-space-xs min-w-0 justify-end text-right">
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Youssef M.</span
                      >
                      <span class="font-body-sm text-body-sm text-on-surface-variant"
                        >White • 2195</span
                      >
                    </div>
                    <div
                      class="w-10 h-10 rounded-lg overflow-hidden shrink-0 bg-surface-container-high"
                    >
                      <img
                        class="w-full h-full object-cover"
                        data-alt="Portrait of Youssef M, a chess master with short beard and contemplative eyes in a tournament hall."
                        src="/images/32b32c411874.webp"
                        alt=""
                      />
                    </div>
                  </div>
                </div>
                <!-- Opening & Meta -->
                <div
                  class="p-space-sm bg-surface-container rounded-lg flex items-center justify-between text-body-sm font-body-sm"
                >
                  <span class="text-on-surface-variant truncate">E60 King's Indian Defense</span>
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >54 Moves</span
                  >
                </div>
              </div>
              <!-- Match 3: Victory vs Omar Farooq -->
              <div
                class="p-space-lg bg-surface-container-low hover:bg-surface-container rounded-xl shadow-md transition-all flex flex-col justify-between gap-space-md"
              >
                <div class="flex items-center justify-between">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                    >Round 18 • Nov 04</span
                  >
                  <!-- Victory Chip -->
                  <span
                    class="font-label-badge text-label-badge px-2.5 py-1 rounded bg-primary/20 text-primary font-bold"
                  >
                    1 - 0 (+20 pts)
                  </span>
                </div>
                <!-- Versus Matchup Display -->
                <div class="flex items-center justify-between gap-space-sm my-space-xs">
                  <!-- Left: Adam Chen -->
                  <div class="flex items-center gap-space-xs min-w-0">
                    <div
                      class="w-10 h-10 rounded-lg overflow-hidden shrink-0 bg-surface-container-high"
                    >
                      <img
                        class="w-full h-full object-cover"
                        data-alt="Adam Chen side angle chess play."
                        src="/images/b0f2358e4f52.webp"
                        alt=""
                      />
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Adam Chen</span
                      >
                      <span class="font-body-sm text-body-sm text-primary">White • 2172</span>
                    </div>
                  </div>
                  <!-- Center VS Badge -->
                  <div
                    class="px-2 py-1 rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge shrink-0"
                  >
                    VS
                  </div>
                  <!-- Right: Omar Farooq -->
                  <div class="flex items-center gap-space-xs min-w-0 justify-end text-right">
                    <div class="flex flex-col min-w-0">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Omar Farooq</span
                      >
                      <span class="font-body-sm text-body-sm text-on-surface-variant"
                        >Black • 2085</span
                      >
                    </div>
                    <div
                      class="w-10 h-10 rounded-lg overflow-hidden shrink-0 bg-surface-container-high"
                    >
                      <img
                        class="w-full h-full object-cover"
                        data-alt="Portrait of Omar Farooq, experienced tournament chess player with calm focused stare."
                        src="/images/f503e1bd8006.webp"
                        alt=""
                      />
                    </div>
                  </div>
                </div>
                <!-- Opening & Meta -->
                <div
                  class="p-space-sm bg-surface-container rounded-lg flex items-center justify-between text-body-sm font-body-sm"
                >
                  <span class="text-on-surface-variant truncate">C88 Ruy Lopez: Closed</span>
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >42 Moves</span
                  >
                </div>
              </div>
            </div>
          </div>
          <!-- Interactive Tactical Quote / Arbiter Verification Stamp Footer Box -->
          <div
            class="p-space-lg bg-surface-container-lowest rounded-xl flex flex-col md:flex-row items-center justify-between gap-space-md"
          >
            <div class="flex items-center gap-space-md">
              <div
                class="w-12 h-12 rounded-xl bg-surface-container-high flex items-center justify-center text-primary shrink-0"
              >
                <span class="material-symbols-outlined text-[28px]" aria-hidden="true">gavel</span>
              </div>
              <div>
                <span class="font-title-md text-title-md text-on-surface"
                  >Official FIDE Rated Club Member</span
                >
                <p class="font-body-sm text-body-sm text-on-surface-variant mt-0.5">
                  Rating computations and Swiss pairings adhere strictly to the 2024 International
                  Chess Federation Standard Regulations.
                </p>
              </div>
            </div>
            <div class="flex items-center gap-space-sm shrink-0">
              <span
                class="font-label-badge text-label-badge text-secondary bg-secondary/10 px-3 py-1.5 rounded-full uppercase tracking-wider"
              >
                Fair Play Status: Excellent
              </span>
            </div>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
