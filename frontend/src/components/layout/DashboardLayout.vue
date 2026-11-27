<script setup lang="ts">
import { computed } from 'vue'
import { useRoute } from 'vue-router'
import DashboardSidebar from '../navigation/DashboardSidebar.vue'
import ProfileMenu from '../navigation/ProfileMenu.vue'
import { findDashboardSection } from '../navigation/dashboard-navigation'
import AppIcon from '../ui/AppIcon.vue'

const route = useRoute()
const pagePath = computed(() => route.matched.at(-1)?.path ?? route.path)
const section = computed(() => findDashboardSection(pagePath.value))
const parentSection = computed(() => (section.value?.to === pagePath.value ? undefined : section.value))
const pageLabel = computed(() => {
  if (section.value && !parentSection.value) return section.value.label
  return typeof route.meta.title === 'string' ? route.meta.title : 'Dashboard'
})
</script>

<template>
  <div
    class="font-body-md text-on-surface antialiased min-h-dvh min-w-0"
    data-preview-screen
  >
    <DashboardSidebar />
    <div class="dashboard-workspace page-layout lg:pl-64">
      <header
        class="navbar-profile-gradient fixed top-0 left-0 lg:left-64 right-0 h-16 bg-surface/80 backdrop-blur-xl shadow-[0_1px_8px_rgba(0,0,0,0.04)] z-40 flex items-center justify-between px-margin [--navbar-profile-inset:3.5rem] md:px-margin-desktop md:[--navbar-profile-inset:9.5rem]"
      >
        <nav
          aria-label="Admin breadcrumb"
          class="flex min-w-0 flex-1 items-center gap-space-xs pr-space-xs font-body-sm text-body-sm text-outline sm:gap-space-sm"
        >
          <RouterLink
            to="/dashboard"
            class="flex shrink-0 items-center gap-space-xs rounded-sm hover:text-on-surface"
            aria-current-value="false"
          >
            <AppIcon class="text-[16px]" name="shield" />
            Admin
          </RouterLink>
          <AppIcon class="shrink-0 text-[14px]" name="chevron_right" />
          <template v-if="parentSection">
            <RouterLink
              :to="parentSection.to"
              class="hidden shrink-0 rounded-sm hover:text-on-surface md:inline"
            >
              {{ parentSection.label }}
            </RouterLink>
            <AppIcon class="hidden shrink-0 text-[14px] md:inline-block" name="chevron_right" />
          </template>
          <span class="truncate font-title-md text-title-md text-on-surface" aria-current="page">
            {{ pageLabel }}
          </span>
        </nav>
        <div class="flex shrink-0 items-center gap-space-sm md:gap-space-lg">
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
          <ProfileMenu dashboard>
            <div class="hidden md:flex flex-col">
              <span class="font-title-md text-title-md text-on-surface leading-none"
                >Admin Core</span
              >
              <span class="font-body-sm text-body-sm text-outline leading-tight">Online</span>
            </div>
            <AppIcon class="text-outline text-[16px]" name="arrow_drop_down" />
          </ProfileMenu>
        </div>
      </header>
      <slot />
    </div>
  </div>
</template>
