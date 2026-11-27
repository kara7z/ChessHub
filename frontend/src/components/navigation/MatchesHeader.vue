<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'

defineProps<{ description: string }>()

const tabs = [
  { id: 'tab-upcoming', to: '/matches', label: 'Upcoming Matches', icon: 'event_upcoming' },
  { id: 'tab-history', to: '/matches/history', label: 'Match History', count: 24 },
]
</script>

<template>
  <div class="flex flex-col gap-space-sm px-margin pt-space-sm pb-space-xs lg:px-0">
    <div class="flex items-center justify-between gap-space-sm">
      <div class="min-w-0">
        <h1 class="app-page-title">
          My Matches
        </h1>
        <p class="font-body-sm text-body-sm text-on-surface-variant">{{ description }}</p>
      </div>
      <slot />
    </div>

    <nav
      aria-label="Matches navigation"
      class="mt-1 flex items-stretch gap-space-xs rounded-xl bg-surface-container-lowest p-1 lg:self-start"
    >
      <RouterLink
        v-for="{ id, to, label, icon, count } of tabs"
        :id="id"
        :key="to"
        :to="to"
        class="flex min-w-0 flex-1 items-center justify-center gap-1.5 rounded-lg px-space-xs py-2 text-center font-title-md text-title-md text-on-surface-variant transition-colors hover:bg-surface-container hover:text-on-surface aria-[current=page]:bg-surface-container-high aria-[current=page]:text-primary aria-[current=page]:shadow-sm sm:px-3 lg:flex-none lg:px-space-lg"
      >
        <AppIcon v-if="icon" class="shrink-0 text-[18px]" :name="icon" />
        <span>{{ label }}</span>
        <span v-if="count" class="shrink-0 rounded-full bg-surface-container px-1.5 py-0.5 font-label-badge text-label-badge text-on-surface-variant">
          {{ count }}
        </span>
      </RouterLink>
    </nav>
  </div>
</template>
