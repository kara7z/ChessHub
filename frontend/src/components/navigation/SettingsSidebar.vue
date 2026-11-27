<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'

const links = [
  { to: '/settings', label: 'General', icon: 'tune' },
  { to: '/settings/profile', label: 'Profile', icon: 'badge', badge: 'Public', badgeClass: 'text-outline' },
  { to: '/settings/security', label: 'Security', icon: 'lock_clock' },
  {
    to: '/settings/notifications',
    label: 'Notifications',
    icon: 'notifications_active',
    badge: '3',
    badgeClass: 'rounded-full bg-surface-container-highest px-1.5 py-0.2 text-on-surface',
  },
  {
    to: '/settings/appearance',
    label: 'Appearance',
    icon: 'palette',
    badge: 'Dark',
    badgeClass: 'text-outline-variant',
  },
]
</script>

<template>
  <aside class="flex min-w-0 flex-col gap-space-md lg:col-span-3">
    <div class="flex items-center gap-space-md rounded-xl bg-surface-container-low p-space-md shadow-sm">
      <div class="relative size-12 shrink-0 overflow-hidden rounded-xl bg-surface-container-high shadow-inner">
        <img class="size-full object-cover" src="/images/3b19de57057c.webp" alt="" />
        <span class="absolute bottom-0 right-0 size-3 rounded-full bg-primary"></span>
      </div>
      <div class="flex min-w-0 flex-col">
        <div class="flex items-center gap-space-xs">
          <span class="truncate font-title-md text-title-md text-on-surface">Alex Rivera</span>
          <span class="rounded bg-surface-container-highest px-1.5 py-0.2 font-label-badge text-label-badge text-primary">FM</span>
        </div>
        <span class="truncate font-body-sm text-body-sm text-on-surface-variant">@alex_rivera</span>
      </div>
    </div>

    <nav aria-label="Settings navigation" class="flex flex-col gap-1 rounded-xl bg-surface-container-low p-space-xs shadow-sm">
      <RouterLink
        v-for="link in links"
        :key="link.to"
        :to="link.to"
        class="flex items-center justify-between gap-2 rounded-lg px-space-md py-space-sm font-body-md text-body-md text-on-surface-variant transition-colors hover:bg-surface-container-high hover:text-on-surface aria-[current=page]:bg-surface-container aria-[current=page]:font-title-md aria-[current=page]:text-title-md aria-[current=page]:text-primary"
        v-slot="{ isExactActive }"
      >
        <span class="flex min-w-0 items-center gap-space-sm">
          <AppIcon class="shrink-0 text-[20px]" :name="link.icon" />
          <span>{{ link.label }}</span>
        </span>
        <span v-if="isExactActive" class="size-1.5 shrink-0 rounded-full bg-primary" aria-hidden="true"></span>
        <span v-else-if="link.to === '/settings/security'" class="size-2 shrink-0 rounded-full bg-secondary" aria-hidden="true"></span>
        <span
          v-else-if="link.badge"
          class="shrink-0 font-label-badge text-label-badge"
          :class="link.badgeClass"
        >{{ link.badge }}</span>
      </RouterLink>
    </nav>

    <div class="flex flex-col gap-space-sm rounded-xl bg-surface-container-low p-space-md shadow-sm">
      <div class="flex flex-wrap items-center justify-between gap-1">
        <span class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant">Tournament Tier</span>
        <span class="font-label-badge text-label-badge text-primary">Swiss Master</span>
      </div>
      <div class="flex flex-wrap items-end justify-between gap-1 pt-space-xs">
        <span class="font-headline-md text-headline-md text-on-surface">Round VII</span>
        <span class="font-label-numeric-md text-label-numeric-md text-primary">Completed</span>
      </div>
      <div class="h-8 w-full pt-1" aria-hidden="true">
        <svg class="size-full text-primary" fill="none" preserveAspectRatio="none" viewBox="0 0 160 30">
          <path d="M0 24 L25 18 L50 22 L75 12 L100 15 L125 7 L160 3" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" />
          <path d="M0 24 L25 18 L50 22 L75 12 L100 15 L125 7 L160 3 L160 30 L0 30 Z" fill="currentColor" fill-opacity="0.1" />
        </svg>
      </div>
    </div>
  </aside>
</template>

<style scoped>
[aria-current='page'] .material-symbols-outlined {
  font-variation-settings: 'FILL' 1;
}
</style>
