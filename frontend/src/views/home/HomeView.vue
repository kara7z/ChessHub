<script setup lang="ts">
import CompactLayout from '../../components/layout/CompactLayout.vue'
</script>

<template>
  <CompactLayout title="Home">
    <main class="flex-1 flex flex-col relative w-full pt-16 pb-24 bg-background">
      <div class="flex flex-col w-full px-margin space-y-space-lg pb-space-xl">
        <!-- Hero Section -->
        <section class="relative w-full rounded-xl overflow-hidden bg-surface-container shadow-xl">
          <div
            class="bg-cover bg-center absolute inset-0 w-full h-full opacity-35"
            data-alt="Cinematic macro shot of an ebony wooden king chess piece standing on a dark minimalist checkered board, dramatic low key green volumetric rim lighting, ambient studio shadows, depth of field, atmospheric haze, tournament grade precision, sleek obsidian and moss green tones"
            style="background-image: url('/images/1aae3b1bac89.webp')"
          ></div>
          <div
            class="absolute inset-0 bg-gradient-to-t from-surface-container via-surface-container/80 to-transparent"
          ></div>
          <div class="relative p-space-lg flex flex-col space-y-space-md">
            <div
              class="inline-flex items-center gap-space-xs self-start px-space-sm py-1 rounded-full bg-surface-container-high text-primary font-label-badge text-label-badge"
            >
              <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
              Competitive Season IV
            </div>
            <div class="space-y-space-xs">
              <h2 class="font-headline-lg-mobile text-headline-lg-mobile text-on-surface">
                Your Next Move Starts Here.
              </h2>
              <p class="font-body-md text-body-md text-on-surface-variant">
                Connect with chess players, compete in exciting matches, improve your skills, and
                become part of a passionate chess community.
              </p>
            </div>
            <div class="flex flex-col sm:flex-row gap-space-sm pt-space-xs">
              <RouterLink
                class="w-full py-3 px-space-md rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md flex items-center justify-center gap-space-xs shadow-md active:scale-[0.98] transition-transform"
                to="/register"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >person_add</span
                >
                <span>Join the Club</span>
              </RouterLink>
              <RouterLink
                class="w-full py-3 px-space-md rounded-lg bg-surface-container-high text-on-surface font-title-md text-title-md flex items-center justify-center gap-space-xs hover:bg-surface-bright active:scale-[0.98] transition-colors"
                to="/leaderboard"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >leaderboard</span
                >
                <span>View Leaderboard</span>
              </RouterLink>
            </div>
          </div>
        </section>
        <!-- Club Key Metrics Grid (2x2) -->
        <section class="grid grid-cols-2 gap-space-sm">
          <div
            class="p-space-md rounded-xl bg-surface-container flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant">Active Players</span>
              <div
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">group</span>
              </div>
            </div>
            <div class="mt-space-sm">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">142</span>
              <div class="flex items-center gap-1 mt-0.5">
                <span class="material-symbols-outlined text-primary text-[14px]" aria-hidden="true"
                  >trending_up</span
                >
                <span class="font-label-badge text-label-badge text-primary">+12 this week</span>
              </div>
            </div>
          </div>
          <div
            class="p-space-md rounded-xl bg-surface-container flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant">Matches Played</span>
              <div
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >sports_esports</span
                >
              </div>
            </div>
            <div class="mt-space-sm">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">890</span>
              <div class="flex items-center gap-1 mt-0.5">
                <span class="material-symbols-outlined text-primary text-[14px]" aria-hidden="true"
                  >bolt</span
                >
                <span class="font-label-badge text-label-badge text-on-surface-variant"
                  >Club points rules</span
                >
              </div>
            </div>
          </div>
          <div
            class="p-space-md rounded-xl bg-surface-container flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant"
                >Seasons Finished</span
              >
              <div
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >workspace_premium</span
                >
              </div>
            </div>
            <div class="mt-space-sm">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">4</span>
              <div class="flex items-center gap-1 mt-0.5">
                <span
                  class="material-symbols-outlined text-secondary text-[14px]"
                  aria-hidden="true"
                  >history_edu</span
                >
                <span class="font-label-badge text-label-badge text-on-surface-variant"
                  >Archive cataloged</span
                >
              </div>
            </div>
          </div>
          <div
            class="p-space-md rounded-xl bg-surface-container flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant">Upcoming Events</span>
              <div
                class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">event</span>
              </div>
            </div>
            <div class="mt-space-sm">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">6</span>
              <div class="flex items-center gap-1 mt-0.5">
                <span class="material-symbols-outlined text-primary text-[14px]" aria-hidden="true"
                  >flag</span
                >
                <span class="font-label-badge text-label-badge text-primary"
                  >Rapid &amp; Blitz next</span
                >
              </div>
            </div>
          </div>
        </section>
        <!-- Current Active Season Card -->
        <section
          class="rounded-xl bg-surface-container p-space-md space-y-space-md shadow-md relative overflow-hidden"
        >
          <div class="flex items-start justify-between gap-space-xs">
            <div class="space-y-0.5">
              <div class="flex items-center gap-space-xs">
                <span
                  class="px-2 py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider"
                  >Active</span
                >
                <span class="font-body-sm text-body-sm text-on-surface-variant"
                  >Mar 1 - May 30, 2025</span
                >
              </div>
              <h3 class="font-headline-sm text-headline-sm text-on-surface">
                Grandmaster Spring League
              </h3>
            </div>
            <div
              class="w-9 h-9 rounded-lg bg-surface-container-high flex items-center justify-center text-primary flex-shrink-0"
            >
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                >military_tech</span
              >
            </div>
          </div>
          <div class="space-y-space-xs">
            <div
              class="flex items-center justify-between font-label-numeric-md text-label-numeric-md"
            >
              <span class="text-on-surface-variant">Season Completion</span>
              <span class="text-primary font-bold">65%</span>
            </div>
            <div class="w-full h-2 rounded-full bg-surface-container-high overflow-hidden">
              <div
                class="h-full bg-primary rounded-full transition-all duration-500"
                style="width: 65%"
              ></div>
            </div>
          </div>
          <div
            class="grid grid-cols-2 gap-space-xs py-space-xs px-space-sm rounded-lg bg-surface-container-low text-center"
          >
            <div>
              <p class="font-label-numeric-md text-label-numeric-md text-on-surface">64</p>
              <p class="font-body-sm text-body-sm text-on-surface-variant">Players</p>
            </div>
            <div>
              <p class="font-label-numeric-md text-label-numeric-md text-on-surface">182</p>
              <p class="font-body-sm text-body-sm text-on-surface-variant">Completed Matches</p>
            </div>
          </div>
          <RouterLink
            class="w-full py-2.5 rounded-lg bg-surface-container-high text-primary font-title-md text-title-md flex items-center justify-center gap-space-xs hover:bg-surface-bright active:scale-[0.98] transition-colors"
            to="/leaderboard"
          >
            <span>View Standings</span>
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
              >chevron_right</span
            >
          </RouterLink>
        </section>
        <!-- Featured Top 3 Leaderboard Podium -->
        <section class="space-y-space-sm">
          <div class="flex items-center justify-between">
            <div class="space-y-0.5">
              <h3 class="font-headline-sm text-headline-sm text-on-surface">Leaderboard Leaders</h3>
              <p class="font-body-sm text-body-sm text-on-surface-variant">
                Current seasonal standings
              </p>
            </div>
            <RouterLink
              class="font-label-numeric-md text-label-numeric-md text-primary flex items-center gap-1 hover:underline"
              to="/leaderboard"
            >
              <span>Full Board</span>
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                >arrow_forward</span
              >
            </RouterLink>
          </div>
          <!-- Visual Podium Arrangement (2nd, 1st, 3rd) -->
          <div class="grid grid-cols-3 gap-2 pt-space-md items-end">
            <!-- 2nd Place -->
            <div
              class="flex flex-col items-center bg-surface-container rounded-t-xl p-space-sm pb-space-md text-center shadow-sm"
            >
              <div class="relative mb-2">
                <div
                  class="w-12 h-12 rounded-full bg-surface-container-highest flex items-center justify-center text-on-surface font-headline-sm text-headline-sm"
                >
                  YM
                </div>
                <span
                  class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-surface-variant text-on-surface flex items-center justify-center font-label-badge text-label-badge shadow"
                  >2</span
                >
              </div>
              <p class="font-title-md text-title-md text-on-surface truncate w-full">Youssef M.</p>
              <p class="font-label-numeric-md text-label-numeric-md text-primary mt-1">280 pts</p>
              <span class="font-body-sm text-body-sm text-on-surface-variant">12W</span>
            </div>
            <!-- 1st Place -->
            <div
              class="flex flex-col items-center bg-surface-container-high rounded-t-xl p-space-sm pb-space-lg text-center shadow-md relative -translate-y-2"
            >
              <div
                class="absolute -top-3 px-2 py-0.5 rounded-full bg-primary text-on-primary font-label-badge text-label-badge flex items-center gap-1"
              >
                <span
                  class="material-symbols-outlined text-[13px]"
                  style="font-variation-settings: 'FILL' 1"
                  aria-hidden="true"
                  >workspace_premium</span
                >
                <span>Leader</span>
              </div>
              <div class="relative mb-2 mt-2">
                <div
                  class="w-14 h-14 rounded-full bg-primary-container text-on-primary-container flex items-center justify-center font-headline-sm text-headline-sm"
                >
                  AC
                </div>
                <span
                  class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-primary text-on-primary flex items-center justify-center font-label-badge text-label-badge shadow font-bold"
                  >1</span
                >
              </div>
              <p class="font-title-md text-title-md text-on-surface truncate w-full font-bold">
                Adam Chen
              </p>
              <p class="font-label-numeric-md text-label-numeric-md text-primary mt-1 font-bold">
                330 pts
              </p>
              <span class="font-body-sm text-body-sm text-on-surface-variant">15W</span>
            </div>
            <!-- 3rd Place -->
            <div
              class="flex flex-col items-center bg-surface-container rounded-t-xl p-space-sm pb-space-md text-center shadow-sm"
            >
              <div class="relative mb-2">
                <div
                  class="w-12 h-12 rounded-full bg-surface-container-highest flex items-center justify-center text-on-surface font-headline-sm text-headline-sm"
                >
                  OF
                </div>
                <span
                  class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-secondary-container text-on-secondary-container flex items-center justify-center font-label-badge text-label-badge shadow"
                  >3</span
                >
              </div>
              <p class="font-title-md text-title-md text-on-surface truncate w-full">Omar F.</p>
              <p class="font-label-numeric-md text-label-numeric-md text-primary mt-1">250 pts</p>
              <span class="font-body-sm text-body-sm text-on-surface-variant">10W</span>
            </div>
          </div>
        </section>
        <!-- Upcoming Confirmed Match Card -->
        <section class="space-y-space-sm">
          <div class="flex items-center justify-between">
            <h3 class="font-headline-sm text-headline-sm text-on-surface">Featured Showdown</h3>
            <span
              class="px-2 py-0.5 rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge flex items-center gap-1"
            >
              <span class="w-1.5 h-1.5 rounded-full bg-primary animate-ping"></span>
              Confirmed
            </span>
          </div>
          <div class="p-space-md rounded-xl bg-surface-container shadow-md space-y-space-md">
            <!-- Players Pairing -->
            <div class="flex items-center justify-between gap-space-xs">
              <!-- White Player -->
              <div class="flex flex-col items-start min-w-0 flex-1">
                <div class="flex items-center gap-1.5">
                  <span
                    class="w-3.5 h-3.5 rounded-full bg-white flex-shrink-0 shadow-sm"
                    title="Playing White"
                  ></span>
                  <span class="font-title-md text-title-md text-on-surface truncate">M. Vance</span>
                </div>
                <span class="font-body-sm text-body-sm text-on-surface-variant"
                  >210 pts • White</span
                >
              </div>
              <!-- VS Glyph -->
              <div
                class="w-8 h-8 rounded-full bg-surface-container-high flex items-center justify-center text-on-surface-variant font-label-badge text-label-badge flex-shrink-0"
              >
                VS
              </div>
              <!-- Black Player -->
              <div class="flex flex-col items-end min-w-0 flex-1 text-right">
                <div class="flex items-center gap-1.5 justify-end">
                  <span class="font-title-md text-title-md text-on-surface truncate"
                    >E. Rostova</span
                  >
                  <span
                    class="w-3.5 h-3.5 rounded-full bg-surface-container-lowest flex-shrink-0 shadow-sm"
                    title="Playing Black"
                  ></span>
                </div>
                <span class="font-body-sm text-body-sm text-on-surface-variant"
                  >195 pts • Black</span
                >
              </div>
            </div>
            <!-- Match Details Bar -->
            <div
              class="pt-space-sm flex items-center justify-between bg-surface-container-low px-space-sm py-2 rounded-lg text-on-surface-variant font-body-sm text-body-sm"
            >
              <div class="flex items-center gap-1.5">
                <span class="material-symbols-outlined text-[16px] text-primary" aria-hidden="true"
                  >schedule</span
                >
                <span>Tomorrow, 18:30</span>
              </div>
              <div class="flex items-center gap-2">
                <span
                  class="px-1.5 py-0.5 rounded bg-surface-container-high font-label-badge text-label-badge"
                  >Board 1</span
                >
                <span>60+30 Classical</span>
              </div>
            </div>
          </div>
        </section>
        <!-- Upcoming Club Events Preview -->
        <section class="space-y-space-sm">
          <div class="flex items-center justify-between">
            <h3 class="font-headline-sm text-headline-sm text-on-surface">Club Events</h3>
            <RouterLink
              class="font-label-numeric-md text-label-numeric-md text-primary flex items-center gap-1 hover:underline"
              to="/events"
            >
              <span>View All</span>
              <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                >chevron_right</span
              >
            </RouterLink>
          </div>
          <div
            class="p-space-md rounded-xl bg-surface-container shadow-sm flex items-center gap-space-md"
          >
            <!-- Calendar Icon Block -->
            <div
              class="w-14 h-14 rounded-lg bg-surface-container-high flex flex-col items-center justify-center flex-shrink-0 text-center"
            >
              <span class="font-label-badge text-label-badge text-primary uppercase">APR</span>
              <span class="font-headline-md text-headline-md text-on-surface leading-none">12</span>
            </div>
            <!-- Details -->
            <div class="flex-1 min-w-0 space-y-1">
              <h4 class="font-title-md text-title-md text-on-surface truncate">
                Spring Rapid Open 2025
              </h4>
              <p class="font-body-sm text-body-sm text-on-surface-variant">
                Saturday • 5 Rounds Swiss
              </p>
              <div class="flex items-center gap-2 pt-0.5">
                <div class="w-20 h-1.5 rounded-full bg-surface-container-highest overflow-hidden">
                  <div class="h-full bg-primary rounded-full" style="width: 75%"></div>
                </div>
                <span class="font-label-badge text-label-badge text-on-surface-variant"
                  >48/64 registered</span
                >
              </div>
            </div>
            <!-- Registration Trigger -->
            <RouterLink
              aria-label="Register for Spring Rapid Open"
              class="w-9 h-9 rounded-lg bg-surface-container-high text-on-surface flex items-center justify-center hover:bg-primary hover:text-on-primary transition-colors flex-shrink-0"
              to="/events/spring-rapid-open"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">add</span>
            </RouterLink>
          </div>
        </section>
        <!-- Educational Chess Tricks Teaser -->
        <section
          class="p-space-md rounded-xl bg-surface-container shadow-md relative overflow-hidden space-y-space-sm"
        >
          <div class="flex items-center justify-between">
            <div class="flex items-center gap-1.5">
              <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                >psychology</span
              >
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-primary"
                >Master Tactics</span
              >
            </div>
            <span class="font-body-sm text-body-sm text-on-surface-variant">3 min read</span>
          </div>
          <div class="flex gap-space-md items-center">
            <div
              class="w-20 h-20 rounded-lg overflow-hidden flex-shrink-0 bg-surface-container-highest relative"
            >
              <img
                class="w-full h-full object-cover"
                data-alt="Close up top-down view of a classic chess tactic on a dark vinyl chess board showing a bishop sacrificing itself on the h7 square against a castled black king with tactical green motion lines and arrows"
                src="/images/1b168b55344f.webp"
                alt=""
              />
            </div>
            <div class="flex-1 min-w-0 space-y-1">
              <h4 class="font-title-md text-title-md text-on-surface">The Greek Gift Sacrifice</h4>
              <p class="font-body-sm text-body-sm text-on-surface-variant line-clamp-2">
                Learn how Bxh7+ dismantles castled kings and forces relentless mating nets in
                classical setups.
              </p>
            </div>
          </div>
          <RouterLink
            class="w-full py-2 rounded-lg bg-surface-container-high text-on-surface font-title-md text-title-md flex items-center justify-center gap-1 text-center hover:bg-surface-bright transition-colors"
            to="/chess-tricks"
          >
            <span>Analyze Tactic</span>
            <span class="material-symbols-outlined text-[16px]" aria-hidden="true">menu_book</span>
          </RouterLink>
        </section>
      </div>
    </main>
  </CompactLayout>
</template>
