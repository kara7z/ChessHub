<script setup lang="ts">
import ClubFooter from './ClubFooter.vue'
import ClubHeader from './ClubHeader.vue'
</script>

<template>
  <div
    class="page-layout flex min-h-dvh min-w-0 flex-col bg-chess-grid pt-16 font-body-md text-body-md text-on-surface antialiased [&>main]:min-h-0 [&>main]:flex-1"
    data-preview-screen
  >
    <ClubHeader />
    <slot />
    <ClubFooter />
  </div>
</template>
