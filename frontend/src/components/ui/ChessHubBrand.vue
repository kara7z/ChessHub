<script setup lang="ts">
import AppIcon from './AppIcon.vue'
</script>

<template>
  <span class="inline-flex items-center gap-space-sm">
    <span class="grid size-9 shrink-0 place-items-center rounded-lg bg-primary text-on-primary">
      <AppIcon class="text-[22px]" name="military_tech" />
    </span>
    <span class="flex flex-col">
      <span
        class="font-headline-sm text-headline-sm tracking-tight text-on-surface leading-none group-hover:text-primary transition-colors"
        >ChessHub</span
      >
      <span
        class="font-label-badge text-label-badge uppercase tracking-wider text-outline leading-tight"
        >Academy</span
      >
    </span>
  </span>
</template>
