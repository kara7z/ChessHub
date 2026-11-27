<script setup lang="ts">
import ClubFooter from './ClubFooter.vue'
import ClubHeader from './ClubHeader.vue'
</script>

<template>
  <div
    class="text-on-surface antialiased flex flex-col selection:bg-primary selection:text-on-primary min-h-dvh min-w-0"
    data-preview-screen
  >
    <ClubHeader />
    <div class="page-layout flex flex-1 flex-col min-w-0">
      <slot />
      <ClubFooter />
    </div>
  </div>
</template>
