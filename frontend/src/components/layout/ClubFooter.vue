<script setup lang="ts">
import ChessHubBrand from '../ui/ChessHubBrand.vue'

const sections = [
  {
    title: 'Competition',
    links: [
      { to: '/matches', label: 'Matches' },
      { to: '/leaderboard', label: 'Leaderboard' },
      { to: '/events', label: 'Tournaments' },
    ],
  },
  {
    title: 'Academy',
    links: [
      { to: '/workshops', label: 'Workshops' },
      { to: '/chess-tricks', label: 'Chess Tricks' },
      { to: '/matches/history', label: 'Archives' },
    ],
  },
]
</script>

<template>
  <footer
    class="mt-space-xl hidden w-full bg-surface-container-lowest py-space-xl lg:block"
  >
    <div class="app-frame @container px-margin-desktop">
      <div class="flex flex-col justify-between gap-space-xl @min-[48rem]:flex-row">
        <div class="max-w-sm">
          <RouterLink class="group mb-space-sm inline-flex" to="/">
            <ChessHubBrand />
          </RouterLink>
          <p class="font-body-sm text-body-sm text-on-surface-variant">
            The tournament-grade digital arena for grandmasters, tacticians, and competitive club
            players worldwide.
          </p>
        </div>
        <div class="grid grid-cols-3 gap-space-xl">
          <div v-for="section of sections" :key="section.title" class="flex flex-col gap-space-xs">
            <span class="font-title-md text-title-md text-on-surface">{{ section.title }}</span>
            <RouterLink
              v-for="link of section.links"
              :key="link.to"
              :to="link.to"
              class="font-body-sm text-body-sm text-on-surface-variant transition-colors hover:text-on-surface"
            >{{ link.label }}</RouterLink>
          </div>
          <div class="flex flex-col gap-space-xs font-body-sm text-body-sm text-on-surface-variant">
            <span class="font-title-md text-title-md text-on-surface">Club Desk</span>
            <span>arbiter@chesshub.io</span>
            <span>+1 (800) CHESS-HUB</span>
            <span>UTC Standard Hall</span>
          </div>
        </div>
      </div>
      <div class="mt-space-xl flex items-center justify-between gap-space-sm border-t border-outline-variant/30 pt-space-md font-body-sm text-body-sm text-on-surface-variant">
        <span>© 2025 ChessHub Federation. Engineered for tactical precision.</span>
        <span class="font-label-badge text-label-badge uppercase tracking-wider text-secondary">
          FIDE Swiss Compliant
        </span>
      </div>
    </div>
  </footer>
</template>
