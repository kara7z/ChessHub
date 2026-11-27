<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'

defineProps<{
  section: string
  title: string
  description?: string
  badge?: string
}>()
</script>

<template>
  <div class="@container">
    <div class="flex flex-col gap-space-md pt-space-lg pb-space-md @min-[50rem]:flex-row @min-[50rem]:items-center @min-[50rem]:justify-between">
      <div class="flex min-w-0 flex-col gap-space-xs">
        <nav aria-label="Dashboard breadcrumb" class="flex flex-wrap items-center gap-space-xs font-body-sm text-body-sm text-outline">
          <RouterLink class="hover:text-on-surface transition-colors" to="/dashboard">
            Dashboard
          </RouterLink>
          <AppIcon class="text-[14px]" name="chevron_right" />
          <span class="font-title-md text-title-md text-on-surface" aria-current="page">{{ section }}</span>
        </nav>
        <div class="flex flex-wrap items-baseline gap-x-space-md gap-y-space-xs">
          <h1 class="app-page-title">
            {{ title }}
          </h1>
          <span
            v-if="badge"
            class="rounded bg-surface-container-high px-space-xs py-0.5 font-label-badge text-label-badge uppercase tracking-wider text-outline"
          >{{ badge }}</span>
        </div>
        <p v-if="description" class="max-w-2xl font-body-md text-body-md text-on-surface-variant">
          {{ description }}
        </p>
        <slot name="meta" />
      </div>
      <div v-if="$slots.actions" class="flex shrink-0 flex-wrap items-center gap-space-sm">
        <slot name="actions" />
      </div>
    </div>
  </div>
</template>
