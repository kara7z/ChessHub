<script setup lang="ts">
import BottomNavigation from '../navigation/BottomNavigation.vue'
import ClubMenu from '../navigation/ClubMenu.vue'
import AppIcon from '../ui/AppIcon.vue'

defineProps<{ title: string; dashboard?: boolean }>()
</script>

<template>
  <div
    class="bg-background text-on-surface antialiased flex flex-col min-h-screen selection:bg-primary selection:text-on-primary min-h-dvh min-w-0"
    data-preview-screen
  >
    <header
      class="fixed top-0 w-full z-50 pt-safe bg-surface-container-lowest/85 backdrop-blur-xl shadow-[0_1px_8px_rgba(0,0,0,0.4)]"
    >
      <div class="h-16 px-margin flex items-center justify-between gap-space-sm">
        <div class="flex items-center gap-space-sm min-w-0">
          <img
            alt="ChessHub Logo"
            class="h-8 w-auto object-contain"
            src="/images/chesshub-mark.svg"
          />
          <div class="flex flex-col min-w-0">
            <span
              class="font-headline-sm text-headline-sm text-primary leading-none tracking-tight"
            >
              ChessHub
            </span>
            <span class="font-body-sm text-body-sm text-on-surface-variant truncate">{{
              title
            }}</span>
          </div>
        </div>
        <div class="flex items-center gap-space-xs">
          <ClubMenu v-if="dashboard" dashboard />
          <RouterLink
            aria-label="Notifications"
            class="relative w-11 h-11 flex items-center justify-center rounded-lg text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high transition-colors"
            to="/notifications"
          >
            <AppIcon class="text-[22px]" name="notifications" />
            <span
              class="absolute top-2 right-2 flex items-center justify-center min-w-[16px] h-4 px-1 rounded-full bg-primary-container text-on-primary font-label-badge text-label-badge leading-none"
              >3</span
            >
          </RouterLink>
          <RouterLink
            aria-label="User profile and menu"
            class="w-11 h-11 flex items-center justify-center rounded-lg hover:bg-surface-container-high transition-colors"
            to="/profile"
          >
            <div class="w-8 h-8 rounded-full bg-primary flex items-center justify-center">
              <AppIcon class="text-on-primary text-[18px]" name="person" />
            </div>
          </RouterLink>
        </div>
      </div>
    </header>
    <slot />
    <BottomNavigation :dashboard="dashboard" />
  </div>
</template>
