<script setup lang="ts">
import ClubFooter from './ClubFooter.vue'
import ClubHeader from './ClubHeader.vue'

defineProps<{ academy?: boolean }>()
</script>

<template>
  <div
    class="page-layout font-body-md text-on-surface antialiased min-h-dvh min-w-0"
    :class="{ 'text-body-md': academy }"
    data-preview-screen
  >
    <ClubHeader />
    <slot />
    <ClubFooter />
  </div>
</template>
