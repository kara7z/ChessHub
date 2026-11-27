<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'
</script>

<template>
  <div
    class="flex min-h-dvh min-w-0 flex-col bg-surface bg-chess-grid font-body-md text-body-md text-on-surface antialiased [&>main]:min-h-0 [&>main]:flex-1"
    data-preview-screen
  >
    <header class="px-margin py-space-md md:px-margin-desktop">
      <RouterLink
        class="inline-flex items-center gap-space-sm text-on-surface hover:text-primary transition-colors"
        to="/home"
      >
        <span
          class="w-8 h-8 rounded-lg bg-primary-container text-on-primary-container flex items-center justify-center"
        >
          <AppIcon class="text-[20px]" name="chess" />
        </span>
        <span class="font-title-md text-title-md tracking-tight">ChessHub Academy</span>
      </RouterLink>
    </header>
    <slot />
  </div>
</template>
