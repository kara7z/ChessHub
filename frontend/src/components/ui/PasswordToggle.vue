<script setup lang="ts">
import AppIcon from './AppIcon.vue'

withDefaults(
  defineProps<{
    inputId: string
    label?: string
    iconClass?: string
    iconId?: string
  }>(),
  {
    label: 'Show password',
    iconClass: 'text-[18px]',
  },
)
</script>

<template>
  <button type="button" :aria-label="label" v-preview-password="inputId">
    <AppIcon :id="iconId" :class="iconClass" name="visibility" />
  </button>
</template>
