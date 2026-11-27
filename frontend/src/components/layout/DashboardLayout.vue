<script setup lang="ts">
import DashboardSidebar from '../navigation/DashboardSidebar.vue'
import AppIcon from '../ui/AppIcon.vue'
</script>

<template>
  <div
    class="bg-surface font-body-md text-on-surface antialiased min-h-dvh min-w-0"
    data-preview-screen
  >
    <DashboardSidebar />
    <div class="md:pl-64">
      <header
        class="fixed top-0 left-0 md:left-64 right-0 h-16 bg-surface/80 backdrop-blur-xl shadow-[0_1px_8px_rgba(0,0,0,0.04)] z-40 flex items-center justify-between px-margin md:px-margin-desktop"
      >
        <button
          aria-label="Open dashboard navigation"
          type="button"
          class="mr-2 shrink-0 rounded p-2 text-primary md:hidden"
          v-preview-disclosure="'dashboard-sidebar'"
        >
          <span aria-hidden="true" class="text-lg leading-none">☰</span>
        </button>
        <div class="flex items-center gap-space-sm text-outline font-body-sm text-body-sm">
          <AppIcon class="text-[16px]" name="shield" />
          <span>Admin</span>
          <AppIcon class="text-[14px]" name="chevron_right" />
          <span class="text-on-surface font-title-md text-title-md">Console</span>
        </div>
        <div class="flex items-center gap-space-sm md:gap-space-lg">
          <div
            class="hidden sm:flex items-center gap-space-xs px-space-md py-space-xs rounded-lg bg-surface-container-low"
          >
            <AppIcon class="text-secondary text-[16px]" name="schedule" />
            <span
              class="font-label-numeric-md text-label-numeric-md text-on-surface tracking-wider"
            >
              14:28:42 UTC
            </span>
          </div>
          <div class="relative flex items-center">
            <RouterLink
              class="text-outline hover:text-on-surface transition-colors relative p-space-xs"
              to="/notifications"
              aria-label="Notifications"
            >
              <AppIcon class="text-[22px]" name="notifications" />
              <span class="absolute top-1.5 right-1.5 w-2 h-2 rounded-full bg-primary"></span>
            </RouterLink>
          </div>
          <div class="flex items-center gap-space-sm pl-space-sm cursor-pointer">
            <div class="w-8 h-8 rounded-full bg-primary flex items-center justify-center">
              <AppIcon class="text-on-primary text-[18px]" name="person" />
            </div>
            <div class="hidden md:flex flex-col">
              <span class="font-title-md text-title-md text-on-surface leading-none"
                >Admin Core</span
              >
              <span class="font-body-sm text-body-sm text-outline leading-tight">Online</span>
            </div>
            <AppIcon class="text-outline text-[16px]" name="arrow_drop_down" />
          </div>
        </div>
      </header>
      <slot />
    </div>
  </div>
</template>
