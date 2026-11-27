<script setup lang="ts">
import { computed, ref } from 'vue'
import { useRoute } from 'vue-router'
import AppIcon from '../ui/AppIcon.vue'
import { clubNavigation } from './club-navigation'
import { dashboardNavigation } from './dashboard-navigation'

const props = defineProps<{ dashboardSection?: string }>()
const route = useRoute()
const more = ref<HTMLDetailsElement>()

const clubTabs = [
  { to: '/', label: 'Home', icon: 'home' },
  { to: '/matches', label: 'Matches', icon: 'sports_kabaddi' },
  { to: '/leaderboard', label: 'Rankings', icon: 'trophy' },
  { to: '/events', label: 'Events', icon: 'calendar_month' },
]

const clubMore = [
  ...clubNavigation.filter(({ to }) => !clubTabs.some((tab) => tab.to === to)),
  { to: '/matches/history', label: 'Match History' },
  { to: '/dashboard', label: 'Admin' },
]

const dashboardTabs = dashboardNavigation.slice(0, 4)
const dashboardMore = [
  ...dashboardNavigation.slice(4),
  { to: '/', label: 'View Website' },
]

const tabs = computed(() => (props.dashboardSection ? dashboardTabs : clubTabs))
const moreLinks = computed(() => (props.dashboardSection ? dashboardMore : clubMore))
const moreIsActive = computed(() =>
  moreLinks.value.some(({ to }) => to === (props.dashboardSection ?? route.path)),
)

function closeMore(restoreFocus = false) {
  if (!more.value?.open) return
  more.value.open = false
  if (restoreFocus) more.value.querySelector('summary')?.focus()
}
</script>

<template>
  <nav
    :aria-label="dashboardSection ? 'Dashboard navigation' : 'Primary navigation'"
    class="fixed inset-x-0 bottom-0 z-30 bg-surface-container-lowest/95 pb-safe shadow-[0_-4px_16px_rgba(0,0,0,0.5)] backdrop-blur-xl lg:hidden"
  >
    <div class="grid h-16 grid-cols-5 items-center px-space-xs">
      <RouterLink
        v-for="{ to, label, icon } of tabs"
        :key="to"
        :to="to"
        class="flex h-12 min-w-0 flex-col items-center justify-center rounded-lg transition-colors"
        @click="closeMore()"
        v-slot="{ isExactActive }"
      >
        <span
          class="contents"
          :class="
            isExactActive || dashboardSection === to
              ? 'text-primary'
              : 'text-on-surface-variant hover:text-on-surface'
          "
        >
          <AppIcon class="text-[22px]" :name="icon" />
          <span class="font-label-badge text-label-badge mt-1">{{ label }}</span>
        </span>
      </RouterLink>
      <details ref="more" class="relative" @keydown.esc.stop.prevent="closeMore(true)">
        <summary
          class="flex h-12 cursor-pointer list-none flex-col items-center justify-center rounded-lg [&::-webkit-details-marker]:hidden"
          :class="moreIsActive ? 'text-primary' : 'text-on-surface-variant hover:text-on-surface'"
        >
          <AppIcon class="text-[22px]" name="more_vert" />
          <span class="mt-1 font-label-badge text-label-badge">More</span>
        </summary>
        <ul
          class="absolute right-0 bottom-full mb-3 grid max-h-[calc(100dvh-8.5rem-env(safe-area-inset-top,0px)-env(safe-area-inset-bottom,0px))] w-60 max-w-[calc(100vw-1rem)] gap-1 overflow-y-auto overscroll-contain rounded-xl bg-surface-container-high p-space-xs shadow-xl"
        >
          <li v-for="{ to, label } of moreLinks" :key="to">
            <RouterLink
              :to="to"
              class="block rounded-lg px-space-md py-space-sm hover:bg-surface-container-highest hover:text-on-surface aria-[current=page]:text-primary"
              :class="dashboardSection === to ? 'text-primary' : 'text-on-surface-variant'"
              @click="closeMore(true)"
            >
              {{ label }}
            </RouterLink>
          </li>
        </ul>
      </details>
    </div>
  </nav>
</template>
