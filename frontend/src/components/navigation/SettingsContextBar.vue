<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'
</script>

<template>
  <div class="flex flex-col justify-between gap-space-md py-space-lg md:flex-row md:items-center">
    <nav aria-label="Settings breadcrumb">
      <ol class="flex flex-wrap items-center gap-space-sm font-body-sm text-body-sm text-on-surface-variant">
        <li>
          <RouterLink class="flex items-center gap-space-sm hover:text-primary" to="/">
            <AppIcon class="text-[18px]" name="chess" />
            Federation Portal
          </RouterLink>
        </li>
        <li class="flex items-center gap-space-sm">
          <span class="text-outline-variant" aria-hidden="true">/</span>
          <RouterLink
            class="font-title-md text-title-md text-on-surface hover:text-primary"
            to="/settings"
          >
            Player Configuration
          </RouterLink>
        </li>
        <li class="flex items-center gap-space-sm">
          <span class="text-outline-variant" aria-hidden="true">/</span>
          <span class="rounded bg-surface-container-high px-space-xs py-0.5 font-label-badge text-label-badge uppercase tracking-wider text-primary">
            CH-2044
          </span>
        </li>
      </ol>
    </nav>

    <div class="flex shrink-0 flex-wrap items-center gap-space-md self-start rounded-xl bg-surface-container-low px-space-md py-space-xs shadow-sm md:self-auto">
      <div class="flex items-center gap-space-xs">
        <span class="size-2 animate-pulse rounded-full bg-primary" aria-hidden="true"></span>
        <span class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant">
          FIDE Blitz
        </span>
        <span class="font-label-numeric-md text-label-numeric-md text-on-surface">2148</span>
      </div>
      <span class="h-3 w-px bg-surface-container-highest" aria-hidden="true"></span>
      <div class="flex items-center gap-space-xs">
        <span class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant">
          Sync State
        </span>
        <span class="font-label-numeric-md text-label-numeric-md text-secondary">Verified</span>
      </div>
    </div>
  </div>
</template>
