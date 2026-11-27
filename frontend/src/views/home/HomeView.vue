<script setup lang="ts">
import CompactLayout from '../../components/layout/CompactLayout.vue'
import AppIcon from '../../components/ui/AppIcon.vue'

const clubStats = [
  { label: 'Active Players', value: 142, icon: 'group', note: '+12 this week' },
  { label: 'Matches Played', value: 890, icon: 'sports_esports', note: 'Club points rules' },
  { label: 'Seasons Finished', value: 4, icon: 'workspace_premium', note: 'Archive cataloged' },
  { label: 'Upcoming Events', value: 6, icon: 'event', note: 'Rapid & Blitz next' },
]

const leaders = [
  {
    rank: 1,
    name: 'Adam Chen',
    image: '/images/11ca73344b9e.webp',
    points: 330,
    wins: 15,
    card: 'col-start-2 min-h-44 border-amber-400/50 from-amber-400/20 text-amber-200 sm:min-h-48',
    medal: 'bg-amber-300 text-amber-950',
    portrait: 'size-12 sm:size-14',
  },
  {
    rank: 2,
    name: 'Youssef Mansour',
    image: '/images/aabf90635c8e.webp',
    points: 280,
    wins: 12,
    card: 'col-start-1 min-h-38 border-slate-300/35 from-slate-300/15 text-slate-200 sm:min-h-40',
    medal: 'bg-slate-300 text-slate-950',
    portrait: 'size-11 sm:size-13',
  },
  {
    rank: 3,
    name: 'Omar Farooq',
    image: '/images/4e180c0793a4.webp',
    points: 250,
    wins: 10,
    card: 'col-start-3 min-h-36 border-orange-400/35 from-orange-400/15 text-orange-200 sm:min-h-38',
    medal: 'bg-orange-300 text-orange-950',
    portrait: 'size-10 sm:size-12',
  },
]
</script>

<template>
  <CompactLayout>
    <main class="w-full flex-1 pt-16">
      <div class="flex flex-col gap-space-lg px-margin pt-space-sm pb-space-xl lg:gap-space-xl lg:px-margin-desktop lg:pt-space-lg">
        <section class="app-panel relative isolate overflow-hidden rounded-2xl">
          <!-- Chess photograph by franco alva: https://unsplash.com/photos/nn-qVzkOgGw -->
          <img
            class="absolute inset-0 size-full object-cover object-[center_55%] opacity-45 lg:opacity-60"
            src="/images/home-hero-chess.webp"
            alt=""
            fetchpriority="high"
          />
          <div class="absolute inset-0 bg-linear-to-t from-surface-container via-surface-container/80 to-transparent lg:bg-linear-to-r"></div>
          <div class="relative z-10 flex max-w-2xl flex-col items-start justify-center gap-space-md p-space-lg sm:p-space-xl lg:min-h-[26rem] lg:p-12">
            <span class="inline-flex items-center gap-space-sm rounded-full bg-secondary-container/50 px-3 py-1 font-label-badge text-label-badge uppercase tracking-widest text-primary">
              <span class="size-1.5 rounded-full bg-primary"></span>
              Competitive Season IV
            </span>
            <div class="space-y-space-sm">
              <h1 class="font-display-lg text-4xl leading-[1.05] font-bold tracking-tight text-on-surface sm:text-5xl lg:text-[clamp(3rem,4.5vw,4.25rem)]">
                Your Next Move <span class="text-primary lg:block">Starts Here.</span>
              </h1>
              <p class="max-w-md font-body-lg text-body-lg text-on-surface-variant">
                Connect with chess players, compete in exciting matches, improve your skills, and
                become part of a passionate chess community.
              </p>
            </div>
            <div class="flex w-full flex-col gap-space-sm pt-space-xs sm:w-auto sm:flex-row">
              <RouterLink class="app-action-primary py-3" to="/register">
                <AppIcon class="text-[20px]" name="person_add" />
                Join the Club
              </RouterLink>
              <RouterLink class="app-action-secondary py-3" to="/leaderboard">
                <AppIcon class="text-[20px]" name="leaderboard" />
                View Leaderboard
              </RouterLink>
            </div>
          </div>
        </section>

        <section aria-labelledby="club-stats" class="space-y-space-sm">
          <h2 id="club-stats" class="font-label-badge text-label-badge uppercase tracking-widest text-on-surface-variant">
            Club at a glance
          </h2>
          <dl class="grid grid-cols-2 gap-space-sm lg:grid-cols-4 lg:gap-space-md">
            <div v-for="stat in clubStats" :key="stat.label" class="app-panel min-w-0 p-space-md">
              <dt class="flex items-center justify-between gap-space-xs font-body-sm text-body-sm text-on-surface-variant">
                {{ stat.label }}
                <span class="grid size-8 shrink-0 place-items-center rounded-lg bg-primary/10 text-primary">
                  <AppIcon class="text-[18px]" :name="stat.icon" />
                </span>
              </dt>
              <dd class="mt-space-sm">
                <span class="block font-label-numeric-lg text-label-numeric-lg text-on-surface">{{ stat.value }}</span>
                <span class="font-label-badge text-label-badge text-secondary">{{ stat.note }}</span>
              </dd>
            </div>
          </dl>
        </section>

        <div class="grid gap-space-md lg:grid-cols-[minmax(0,0.9fr)_minmax(0,1.1fr)] lg:gap-space-lg">
          <section aria-labelledby="active-season" class="app-panel flex min-w-0 flex-col gap-space-md p-space-md sm:p-space-lg">
            <div class="flex items-start justify-between gap-space-sm">
              <div class="min-w-0">
                <div class="mb-space-xs flex flex-wrap items-center gap-space-sm">
                  <span class="rounded-full bg-secondary-container px-2 py-0.5 font-label-badge text-label-badge uppercase tracking-wider text-secondary">
                    Active Season
                  </span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant">Mar 1 – May 30, 2025</span>
                </div>
                <h2 id="active-season" class="font-headline-md text-headline-md text-on-surface">
                  Grandmaster Spring League
                </h2>
              </div>
              <span class="grid size-10 shrink-0 place-items-center rounded-lg bg-primary/10 text-primary">
                <AppIcon class="text-[22px]" name="military_tech" />
              </span>
            </div>
            <div class="space-y-space-xs rounded-xl bg-surface-container-low px-space-md py-space-sm">
              <div class="flex justify-between gap-space-sm font-label-numeric-md text-label-numeric-md">
                <span class="text-on-surface-variant">Season completion</span>
                <span class="font-label-numeric-lg text-label-numeric-lg text-primary">65%</span>
              </div>
              <div
                class="h-2 overflow-hidden rounded-full bg-surface-container-highest"
                role="progressbar"
                aria-label="Season completion"
                :aria-valuenow="65"
              >
                <div class="h-full w-[65%] rounded-full bg-primary"></div>
              </div>
            </div>
            <dl class="grid flex-1 grid-cols-2 gap-space-sm">
              <div class="flex min-w-0 flex-col justify-center gap-space-xs rounded-xl bg-surface-container-low p-space-sm sm:px-space-md">
                <dt class="flex items-center gap-space-xs font-body-sm text-body-sm text-on-surface-variant">
                  <AppIcon class="shrink-0 text-[16px] text-primary" name="group" />
                  Players
                </dt>
                <dd class="font-label-numeric-lg text-label-numeric-lg">64</dd>
              </div>
              <div class="flex min-w-0 flex-col justify-center gap-space-xs rounded-xl bg-surface-container-low p-space-sm sm:px-space-md">
                <dt class="flex items-center gap-space-xs font-body-sm text-body-sm text-on-surface-variant">
                  <AppIcon class="shrink-0 text-[16px] text-primary" name="sports_esports" />
                  Completed matches
                </dt>
                <dd class="font-label-numeric-lg text-label-numeric-lg">182</dd>
              </div>
            </dl>
            <RouterLink class="app-action-secondary self-start" to="/leaderboard">
              View Standings
              <AppIcon class="text-[18px]" name="chevron_right" />
            </RouterLink>
          </section>

          <section aria-labelledby="club-leaders" class="app-panel flex min-w-0 flex-col gap-space-md p-space-md sm:p-space-lg">
            <div class="flex flex-wrap items-start justify-between gap-space-sm">
              <div class="min-w-0">
                <p class="font-label-badge text-label-badge uppercase tracking-widest text-secondary">Spring League 2025</p>
                <h2 id="club-leaders" class="mt-1 font-headline-md text-headline-md text-on-surface">Season Leaderboard</h2>
                <p class="font-body-sm text-body-sm text-on-surface-variant">Top players by club points</p>
              </div>
              <RouterLink class="inline-flex items-center gap-space-xs rounded-lg px-space-xs py-space-xs font-label-numeric-md text-label-numeric-md text-primary hover:underline" to="/leaderboard">
                Full Leaderboard
                <AppIcon class="text-[16px]" name="arrow_forward" />
              </RouterLink>
            </div>
            <ol class="mt-auto grid grid-cols-3 items-end gap-space-xs sm:gap-space-sm" role="list">
              <li
                v-for="leader in leaders"
                :key="leader.rank"
                class="row-start-1 flex min-w-0 flex-col items-center justify-center gap-1 rounded-xl border border-t-2 bg-linear-to-b to-surface-container-low px-1.5 py-space-sm text-center"
                :class="leader.card"
              >
                <div class="relative mb-space-xs">
                  <img :src="leader.image" alt="" class="rounded-full object-cover" :class="leader.portrait" loading="lazy" />
                  <span
                    class="absolute -right-1 -bottom-1 grid size-5 place-items-center rounded-full font-label-badge text-label-badge"
                    :class="leader.medal"
                    :aria-label="`Rank ${leader.rank}`"
                  >{{ leader.rank }}</span>
                </div>
                <span class="font-title-md text-body-sm leading-tight font-semibold text-on-surface [overflow-wrap:anywhere] sm:text-body-md">
                  {{ leader.name }}
                </span>
                <span class="font-label-numeric-md text-label-numeric-md whitespace-nowrap tabular-nums">
                  {{ leader.points }} pts
                </span>
                <span class="font-body-sm text-body-sm text-on-surface-variant">{{ leader.wins }} wins</span>
              </li>
            </ol>
          </section>
        </div>

        <div class="grid gap-space-md lg:grid-cols-2 lg:gap-space-lg">
          <section aria-labelledby="featured-match" class="app-panel min-w-0 space-y-space-md p-space-md sm:p-space-lg">
            <div class="flex flex-wrap items-center justify-between gap-space-xs">
              <h2 id="featured-match" class="font-headline-sm text-headline-sm text-on-surface">Featured Showdown</h2>
              <span class="rounded-full bg-secondary-container px-2 py-0.5 font-label-badge text-label-badge text-secondary">Confirmed</span>
            </div>
            <div class="grid grid-cols-[minmax(0,1fr)_auto_minmax(0,1fr)] items-center gap-space-xs rounded-xl bg-surface-container-low p-space-sm sm:p-space-md">
              <div class="min-w-0">
                <span class="block font-title-md text-title-md">M. Vance</span>
                <span class="font-body-sm text-body-sm text-on-surface-variant">210 pts · White</span>
              </div>
              <span class="rounded-full bg-surface-container-high px-2 py-1 font-label-badge text-label-badge text-primary">VS</span>
              <div class="min-w-0 text-right">
                <span class="block font-title-md text-title-md">E. Rostova</span>
                <span class="font-body-sm text-body-sm text-on-surface-variant">195 pts · Black</span>
              </div>
            </div>
            <div class="flex flex-wrap items-center justify-between gap-space-sm font-body-sm text-body-sm text-on-surface-variant">
              <span class="inline-flex items-center gap-1">
                <AppIcon class="text-[16px] text-primary" name="schedule" />
                Tomorrow, 18:30 · Board 1 · 60+30 Classical
              </span>
              <RouterLink class="font-title-md text-body-sm text-primary hover:underline" to="/matches">All Matches</RouterLink>
            </div>
          </section>

          <section aria-labelledby="club-events" class="app-panel min-w-0 space-y-space-md p-space-md sm:p-space-lg">
            <div class="flex flex-wrap items-center justify-between gap-space-xs">
              <h2 id="club-events" class="font-headline-sm text-headline-sm text-on-surface">Club Events</h2>
              <RouterLink class="font-label-numeric-md text-label-numeric-md text-primary hover:underline" to="/events">View All</RouterLink>
            </div>
            <div class="flex items-center gap-space-sm sm:gap-space-md">
              <div class="grid size-14 shrink-0 place-content-center rounded-lg bg-surface-container-high text-center">
                <span class="font-label-badge text-label-badge text-primary">APR</span>
                <span class="font-headline-md text-headline-md leading-none">12</span>
              </div>
              <div class="min-w-0 flex-1">
                <h3 class="font-title-md text-title-md text-on-surface">Spring Rapid Open 2025</h3>
                <p class="font-body-sm text-body-sm text-on-surface-variant">Saturday · 5 Rounds Swiss</p>
                <div class="mt-space-xs flex flex-wrap items-center gap-space-xs font-label-badge text-label-badge text-on-surface-variant">
                  <div class="h-1.5 w-20 overflow-hidden rounded-full bg-surface-container-highest" aria-hidden="true">
                    <div class="h-full w-3/4 rounded-full bg-primary"></div>
                  </div>
                  <span>48/64 registered</span>
                </div>
              </div>
            </div>
            <RouterLink class="app-action-secondary" aria-label="View Event: Spring Rapid Open" to="/events/spring-rapid-open">
              View Event
              <AppIcon class="text-[16px]" name="arrow_forward" />
            </RouterLink>
          </section>
        </div>

        <section aria-labelledby="featured-tactic" class="app-panel overflow-hidden sm:grid sm:grid-cols-[minmax(0,0.8fr)_minmax(0,1.2fr)]">
          <div class="relative min-h-40 overflow-hidden bg-surface-container-lowest">
            <img class="absolute inset-0 size-full object-cover" src="/images/1b168b55344f.webp" alt="" loading="lazy" />
          </div>
          <div class="space-y-space-sm p-space-md sm:p-space-lg lg:p-space-xl">
            <div class="flex flex-wrap items-center gap-space-sm font-label-badge text-label-badge">
              <span class="uppercase tracking-wider text-primary">Master Tactics</span>
              <span class="text-on-surface-variant">3 min read</span>
            </div>
            <h2 id="featured-tactic" class="font-headline-md text-headline-md text-on-surface">The Greek Gift Sacrifice</h2>
            <p class="max-w-xl font-body-md text-body-md text-on-surface-variant">
              Learn how Bxh7+ dismantles castled kings and forces relentless mating nets in classical setups.
            </p>
            <RouterLink class="app-action-secondary mt-space-sm" to="/chess-tricks">
              Analyze Tactic
              <AppIcon class="text-[16px]" name="menu_book" />
            </RouterLink>
          </div>
        </section>
      </div>
    </main>
  </CompactLayout>
</template>
