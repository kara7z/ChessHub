<script setup lang="ts">
import { useRoute } from 'vue-router'
import { dashboardNavigation } from './dashboard-navigation'

const route = useRoute()

function isCurrentSection(path: string) {
  return route.path === path || (path !== '/dashboard' && route.path.startsWith(`${path}/`))
}
</script>

<template>
  <aside
    id="dashboard-sidebar"
    class="dashboard-sidebar fixed left-0 top-0 z-50 flex h-full w-64 flex-col justify-between overflow-y-auto bg-surface-container-lowest shadow-[0_1px_8px_rgba(0,0,0,0.04)]"
  >
    <div>
      <div class="flex h-16 items-center justify-between px-margin">
        <div class="flex items-center gap-space-sm">
          <span
            class="material-symbols-outlined grid size-8 place-items-center rounded-lg bg-primary-container text-[20px] text-on-primary-container"
            aria-hidden="true"
            >token</span
          >
          <div class="flex flex-col">
            <span class="font-headline-sm text-headline-sm leading-none tracking-tight"
              >ChessHub</span
            >
            <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
              >Arbitration</span
            >
          </div>
        </div>
        <button
          v-preview-disclosure="'dashboard-sidebar'"
          aria-label="Close dashboard navigation"
          class="p-space-xs text-outline hover:text-on-surface md:hidden"
          data-preview-dismiss
          type="button"
        >
          <span class="material-symbols-outlined text-[20px]" aria-hidden="true">menu_open</span>
        </button>
      </div>
      <div class="px-margin pb-space-xs pt-space-md">
        <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
          >Operations</span
        >
      </div>
      <nav aria-label="Dashboard navigation" class="flex flex-col gap-space-xs px-space-sm">
        <RouterLink
          v-for="{ to, label, icon } of dashboardNavigation"
          :key="to"
          :to="to"
          :class="
            isCurrentSection(to)
              ? 'bg-primary-container font-semibold text-on-primary-container'
              : 'text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface'
          "
          class="flex items-center gap-space-sm rounded-lg px-space-md py-space-sm transition-colors"
        >
          <span class="material-symbols-outlined text-[20px]" aria-hidden="true">{{ icon }}</span>
          <span class="font-body-md text-body-md">{{ label }}</span>
        </RouterLink>
      </nav>
    </div>
    <div class="flex flex-col gap-space-xs px-space-sm pb-space-md">
      <div class="mx-space-sm mb-space-xs h-px bg-surface-container-highest"></div>
      <RouterLink
        to="/"
        class="flex items-center gap-space-sm rounded-lg px-space-md py-space-sm text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface"
      >
        <span class="material-symbols-outlined text-[20px]" aria-hidden="true">captive_portal</span>
        <span class="font-body-md text-body-md">View Website</span>
      </RouterLink>
      <RouterLink
        to="/settings"
        class="flex items-center gap-space-sm rounded-lg px-space-md py-space-sm text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface"
      >
        <span class="material-symbols-outlined text-[20px]" aria-hidden="true">tune</span>
        <span class="font-body-md text-body-md">Settings</span>
      </RouterLink>
      <div
        class="mt-space-xs flex items-center justify-between rounded-lg bg-surface-container-low px-space-md py-space-sm"
      >
        <div class="flex items-center gap-space-sm">
          <span
            class="material-symbols-outlined grid size-8 place-items-center rounded-full bg-primary text-[18px] text-on-primary"
            aria-hidden="true"
            >person</span
          >
          <div class="flex flex-col">
            <span class="font-title-md text-title-md leading-tight">Chief Arbiter</span>
            <span class="font-body-sm text-body-sm text-outline">GM #1440</span>
          </div>
        </div>
        <RouterLink to="/login" aria-label="Log in" class="text-outline hover:text-on-surface">
          <span class="material-symbols-outlined text-[20px]" aria-hidden="true">logout</span>
        </RouterLink>
      </div>
    </div>
  </aside>
</template>
