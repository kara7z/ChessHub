<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'

defineProps<{ dashboard?: boolean }>()

const playerLinks = [
  { to: '/my-events', label: 'My Events' },
  { to: '/my-workshops', label: 'My Workshops' },
]
</script>

<template>
  <div class="relative">
    <button
      aria-label="Profile menu"
      class="flex items-center gap-space-sm rounded-full"
      type="button"
      v-preview-disclosure="'profile-menu'"
    >
      <span class="profile-avatar grid size-8 shrink-0 place-items-center rounded-full bg-primary text-on-primary">
        <AppIcon class="text-[18px]" name="person" />
      </span>
      <slot />
    </button>
    <div
      id="profile-menu"
      class="preview-disclosure absolute right-0 top-full z-50 hidden w-48 pt-space-xs"
    >
      <div class="max-h-[calc(100dvh-4rem)] overflow-y-auto rounded-xl bg-surface-container-high p-space-xs shadow-xl">
        <RouterLink class="profile-link" to="/profile">My Profile</RouterLink>
        <template v-if="!dashboard">
          <RouterLink v-for="{ to, label } in playerLinks" :key="to" :to="to" class="profile-link">
            {{ label }}
          </RouterLink>
        </template>
        <RouterLink class="profile-link lg:hidden" to="/settings">Settings</RouterLink>
        <div :class="{ 'lg:hidden': dashboard }">
          <div class="my-space-xs h-px bg-surface-container-highest"></div>
          <RouterLink class="profile-link text-error" to="/login">Logout</RouterLink>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
@reference '../../style.css';

.profile-avatar {
  box-shadow: 0 0 8px color-mix(in srgb, var(--color-primary) 22%, transparent);
}

@layer components {
  .profile-link {
    @apply block rounded px-space-md py-space-xs font-body-md text-body-md text-on-surface-variant hover:bg-surface-container-highest hover:text-on-surface;
  }
}
</style>
