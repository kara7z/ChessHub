<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'
</script>

<template>
  <div
    class="bg-surface bg-chess-grid font-body-md text-body-md text-on-surface antialiased min-h-dvh min-w-0"
    data-preview-screen
  >
    <div class="fixed top-0 left-0 z-50 px-margin-desktop py-space-lg">
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
    </div>
    <slot />
  </div>
</template>
