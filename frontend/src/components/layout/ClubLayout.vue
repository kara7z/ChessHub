<script setup lang="ts">
import AcademyFooter from './AcademyFooter.vue'
import ClubFooter from './ClubFooter.vue'
import ClubHeader from './ClubHeader.vue'

defineProps<{ academy?: boolean }>()
</script>

<template>
  <div
    class="bg-surface font-body-md text-on-surface antialiased min-h-dvh min-w-0"
    :class="{ 'text-body-md': academy }"
    data-preview-screen
  >
    <ClubHeader :academy="academy" />
    <slot />
    <AcademyFooter v-if="academy" />
    <ClubFooter v-else />
  </div>
</template>
