<script setup lang="ts">
import { computed } from 'vue'
import { clubNavigation } from './club-navigation'
import { dashboardNavigation } from './dashboard-navigation'

const props = defineProps<{ dashboard?: boolean }>()

const items = computed(() =>
  props.dashboard
    ? dashboardNavigation
    : [...clubNavigation, { to: '/settings', label: 'Settings' }],
)
const label = computed(() => (props.dashboard ? 'Dashboard navigation' : 'Club navigation'))
</script>

<template>
  <details class="relative" :class="{ 'xl:hidden': !dashboard }">
    <summary
      :aria-label="label"
      class="flex size-10 cursor-pointer list-none items-center justify-center rounded-lg bg-surface-container-high"
    >
      <span aria-hidden="true" class="text-lg leading-none">☰</span>
    </summary>
    <nav
      :aria-label="label"
      class="absolute right-0 top-full z-50 mt-2 grid w-48 gap-1 rounded-xl bg-surface-container-high p-2 shadow-xl"
    >
      <RouterLink v-for="item of items" :key="item.to" :to="item.to">
        {{ item.label }}
      </RouterLink>
    </nav>
  </details>
</template>

<style scoped>
a {
  border-radius: 0.5rem;
  padding: 0.25rem 0.5rem;
}

a:hover,
a:focus-visible {
  background: var(--color-surface-container-highest);
}
</style>
