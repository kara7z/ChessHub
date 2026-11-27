<script setup lang="ts">
import { computed } from 'vue'
import AppIcon from '../ui/AppIcon.vue'

const props = defineProps<{ dashboard?: boolean }>()

const links = computed(() => [
  { to: '/', label: 'Home', icon: 'home' },
  {
    to: props.dashboard ? '/dashboard/matches' : '/matches',
    label: 'Matches',
    icon: 'sports_kabaddi',
  },
  { to: '/leaderboard', label: 'Rankings', icon: 'trophy' },
  {
    to: props.dashboard ? '/dashboard/events' : '/events',
    label: 'Events',
    icon: 'calendar_month',
  },
  { to: '/dashboard', label: 'Admin', icon: 'shield' },
])
</script>

<template>
  <nav
    aria-label="Primary navigation"
    class="fixed bottom-0 w-full z-50 pb-safe bg-surface-container-lowest/90 backdrop-blur-xl shadow-[0_-4px_16px_rgba(0,0,0,0.5)]"
  >
    <div class="h-16 px-space-xs flex items-center justify-around">
      <RouterLink
        v-for="{ to, label, icon } of links"
        :key="to"
        :to="to"
        class="flex flex-col items-center justify-center w-14 h-12 transition-colors"
        v-slot="{ isExactActive }"
      >
        <span
          class="contents"
          :class="isExactActive ? 'text-primary' : 'text-on-surface-variant hover:text-on-surface'"
        >
          <AppIcon class="text-[22px]" :name="icon" />
          <span class="font-label-badge text-label-badge mt-1">{{ label }}</span>
        </span>
      </RouterLink>
    </div>
  </nav>
</template>
