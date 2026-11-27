<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'

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
  <footer class="w-full bg-surface-container-lowest mt-space-xl py-space-xl px-margin-desktop">
    <div class="max-w-7xl mx-auto flex flex-col md:flex-row justify-between gap-space-xl">
      <div class="max-w-sm">
        <div class="flex items-center gap-space-sm mb-space-sm">
          <div
            class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center"
          >
            <AppIcon class="text-primary text-[20px]" name="shield" />
          </div>
          <span class="font-headline-sm text-headline-sm text-on-surface">ChessHub</span>
        </div>
        <p class="font-body-sm text-body-sm text-on-surface-variant">
          The tournament-grade digital arena for grandmasters, tacticians, and competitive club
          players worldwide.
        </p>
      </div>
      <div class="grid grid-cols-2 sm:grid-cols-3 gap-space-xl">
        <div v-for="section of sections" :key="section.title" class="flex flex-col gap-space-xs">
          <span class="font-title-md text-title-md text-on-surface">{{ section.title }}</span>
          <RouterLink
            v-for="link of section.links"
            :key="link.to"
            :to="link.to"
            class="font-body-sm text-body-sm text-on-surface-variant hover:text-on-surface transition-colors"
            >{{ link.label }}</RouterLink
          >
        </div>
        <div class="flex flex-col gap-space-xs font-body-sm text-body-sm text-on-surface-variant">
          <span class="font-title-md text-title-md text-on-surface">Club Desk</span>
          <span>arbiter@chesshub.io</span>
          <span>+1 (800) CHESS-HUB</span>
          <span>UTC Standard Hall</span>
        </div>
      </div>
    </div>
    <div
      class="max-w-7xl mx-auto mt-space-xl pt-space-md flex flex-col sm:flex-row items-center justify-between text-on-surface-variant font-body-sm text-body-sm"
    >
      <span>© 2025 ChessHub Federation. Engineered for tactical precision.</span>
      <div class="flex gap-space-md mt-space-xs sm:mt-0">
        <span class="font-label-badge text-label-badge uppercase tracking-wider text-secondary">
          FIDE Swiss Compliant
        </span>
      </div>
    </div>
  </footer>
</template>
