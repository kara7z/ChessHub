<script setup lang="ts">
import { ref } from 'vue'
import ProfileMenu from '../navigation/ProfileMenu.vue'
import { clubNavigation } from '../navigation/club-navigation'
import AppIcon from '../ui/AppIcon.vue'
import ChessHubBrand from '../ui/ChessHubBrand.vue'

const matchLinks = [
  { to: '/matches', label: 'Upcoming Matches' },
  { to: '/matches/history', label: 'Match History' },
]

const matchesMenu = ref<'closed' | 'hover' | 'open'>('closed')

function hoverMatches(event: PointerEvent) {
  if (event.pointerType === 'mouse' && matchesMenu.value === 'closed') {
    matchesMenu.value = 'hover'
  }
}

function leaveMatches(event: PointerEvent) {
  const menu = event.currentTarget as HTMLElement
  if (
    event.pointerType === 'mouse' &&
    matchesMenu.value === 'hover' &&
    !menu.contains(document.activeElement)
  ) {
    matchesMenu.value = 'closed'
  }
}

function toggleMatches() {
  matchesMenu.value = matchesMenu.value === 'open' ? 'closed' : 'open'
}

function leaveMatchesFocus(event: FocusEvent) {
  const menu = event.currentTarget as HTMLElement
  if (!menu.contains(event.relatedTarget as Node | null)) matchesMenu.value = 'closed'
}

function dismissMatches(event: KeyboardEvent) {
  if (matchesMenu.value === 'closed') return
  event.preventDefault()
  event.stopPropagation()
  matchesMenu.value = 'closed'
  const menu = event.currentTarget as HTMLElement
  menu.querySelector('button')?.focus()
}
</script>

<template>
  <header
    class="club-navbar navbar-profile-gradient fixed inset-x-0 top-0 z-50 bg-surface/90 shadow-[0_1px_8px_rgba(0,0,0,0.4)] backdrop-blur-xl md:[--navbar-profile-inset:3.5rem]"
  >
    <div class="relative flex h-16 w-full items-center justify-between px-margin md:px-margin-desktop">
      <div class="flex items-center gap-space-lg">
        <RouterLink class="group flex items-center" to="/">
          <ChessHubBrand />
        </RouterLink>
        <nav aria-label="Club navigation" class="hidden lg:flex items-center gap-space-xs">
          <template v-for="{ to, label } of clubNavigation" :key="to">
            <div
              v-if="to === '/matches'"
              class="relative"
              @pointerenter="hoverMatches"
              @pointerleave="leaveMatches"
              @focusout="leaveMatchesFocus"
              @keydown.esc="dismissMatches"
            >
              <button
                aria-controls="club-match-menu"
                :aria-expanded="matchesMenu !== 'closed'"
                class="flex items-center gap-1 rounded-lg px-space-sm py-space-xs font-title-md text-title-md transition-colors hover:bg-surface-container xl:px-space-md"
                :class="
                  $route.path === '/matches' || $route.path.startsWith('/matches/')
                    ? 'bg-surface-container text-primary'
                    : 'text-on-surface-variant hover:text-on-surface'
                "
                type="button"
                @click="toggleMatches"
              >
                <span>Matches</span>
                <AppIcon
                  class="text-[18px] text-on-surface-variant transition-transform"
                  :class="{ 'rotate-180': matchesMenu !== 'closed' }"
                  name="expand_more"
                />
              </button>
              <div
                v-show="matchesMenu !== 'closed'"
                id="club-match-menu"
                class="absolute left-0 top-full z-50 w-52 pt-space-xs"
              >
                <div
                  class="bg-surface-container-high rounded-xl p-space-xs shadow-[0_16px_36px_-4px_rgba(0,0,0,0.65)]"
                >
                  <RouterLink
                    v-for="link of matchLinks"
                    :key="link.to"
                    :to="link.to"
                    class="block px-space-md py-space-xs rounded font-body-md text-body-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                    @click="matchesMenu = 'closed'"
                    >{{ link.label }}</RouterLink
                  >
                </div>
              </div>
            </div>
            <RouterLink
              v-else
              :to="to"
              class="px-space-sm py-space-xs rounded-lg font-title-md text-title-md text-on-surface-variant hover:bg-surface-container hover:text-on-surface transition-colors aria-[current=page]:bg-surface-container aria-[current=page]:text-primary xl:px-space-md"
              >{{ label }}</RouterLink
            >
          </template>
        </nav>
      </div>
      <div class="flex items-center gap-space-md">
        <RouterLink
          aria-label="Settings"
          class="hidden size-9 items-center justify-center rounded-lg bg-surface-container-low text-on-surface-variant transition-colors hover:bg-surface-container hover:text-on-surface lg:flex"
          to="/settings"
        >
          <AppIcon class="text-[20px]" name="tune" />
        </RouterLink>
        <div class="relative">
          <RouterLink
            aria-label="Notifications"
            class="w-9 h-9 rounded-lg bg-surface-container-low flex items-center justify-center text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-colors"
            to="/notifications"
          >
            <AppIcon class="text-[20px]" name="notifications" />
            <span class="absolute top-1 right-1 w-2 h-2 rounded-full bg-primary"></span>
          </RouterLink>
        </div>
        <ProfileMenu />
      </div>
    </div>
  </header>
</template>

<style scoped>
.club-navbar::before {
  position: absolute;
  inset-block: 0;
  inset-inline-start: 0;
  width: min(19rem, 65vw);
  background:
    radial-gradient(ellipse at 25% 0%, color-mix(in srgb, var(--color-primary) 12%, transparent), transparent 66%),
    radial-gradient(ellipse at 33% 80%, color-mix(in srgb, var(--color-secondary-container) 32%, transparent), transparent 68%),
    radial-gradient(ellipse at 0% 100%, color-mix(in srgb, var(--color-inverse-primary) 16%, transparent), transparent 60%);
  content: '';
  pointer-events: none;
}
</style>
