<script setup lang="ts">
import ClubMenu from '../navigation/ClubMenu.vue'
import { clubNavigation } from '../navigation/club-navigation'
import AppIcon from '../ui/AppIcon.vue'

defineProps<{ academy?: boolean }>()

const matchLinks = [
  { to: '/matches', label: 'Upcoming Matches' },
  { to: '/matches/history', label: 'Match History' },
]

const profileLinks = [
  { to: '/profile', label: 'My Profile' },
  { to: '/my-events', label: 'My Events' },
  { to: '/my-workshops', label: 'My Workshops' },
  { to: '/settings', label: 'Settings' },
]
</script>

<template>
  <header
    class="fixed top-0 left-0 z-50 backdrop-blur-xl"
    :class="
      academy
        ? 'right-0 bg-surface-container-lowest/90 shadow-[0_1px_8px_rgba(0,0,0,0.65)]'
        : 'w-full bg-surface/90 shadow-[0_1px_8px_rgba(0,0,0,0.4)]'
    "
  >
    <div
      class="h-16 w-full px-margin md:px-margin-desktop flex items-center justify-between"
      :class="{ 'gap-space-sm md:gap-space-lg': academy }"
    >
      <div class="flex items-center gap-space-lg">
        <RouterLink class="group flex items-center gap-space-sm" to="/">
          <div
            class="w-9 h-9 rounded-lg flex items-center justify-center"
            :class="academy ? 'bg-primary' : 'bg-surface-container-high'"
          >
            <AppIcon
              :name="academy ? 'military_tech' : 'shield'"
              :class="academy ? 'text-on-primary text-[22px]' : 'text-primary text-[24px]'"
            />
          </div>
          <div v-if="academy" class="flex flex-col">
            <span
              class="font-headline-sm text-headline-sm tracking-tight text-on-surface leading-none group-hover:text-primary transition-colors"
              >ChessHub</span
            >
            <span
              class="font-label-badge text-label-badge uppercase tracking-wider text-outline leading-tight"
              >Academy</span
            >
          </div>
          <span v-else class="font-headline-sm text-headline-sm tracking-tight text-on-surface">
            ChessHub
          </span>
        </RouterLink>
        <nav aria-label="Club navigation" class="hidden xl:flex items-center gap-space-xs">
          <template v-for="{ to, label } of clubNavigation" :key="to">
            <div v-if="to === '/matches' && !academy" class="relative group">
              <button
                class="flex items-center gap-1 px-space-md py-space-xs rounded-lg font-title-md text-title-md text-on-surface-variant group-hover:text-on-surface group-hover:bg-surface-container transition-colors"
                type="button"
                v-preview-disclosure="'club-match-menu'"
              >
                <span>Matches</span>
                <AppIcon
                  class="text-[18px] text-on-surface-variant group-hover:text-on-surface transition-transform group-hover:rotate-180"
                  name="expand_more"
                />
              </button>
              <div
                id="club-match-menu"
                class="absolute left-0 top-full pt-space-xs hidden w-52 z-50 preview-disclosure"
              >
                <div
                  class="bg-surface-container-high rounded-xl p-space-xs shadow-[0_16px_36px_-4px_rgba(0,0,0,0.65)]"
                >
                  <RouterLink
                    v-for="link of matchLinks"
                    :key="link.to"
                    :to="link.to"
                    class="block px-space-md py-space-xs rounded font-body-md text-body-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                    >{{ link.label }}</RouterLink
                  >
                </div>
              </div>
            </div>
            <RouterLink
              v-else
              :to="to"
              class="px-space-md py-space-xs rounded-lg font-title-md transition-colors"
              :class="
                academy
                  ? $route.path.startsWith('/workshops/') && to === '/workshops'
                    ? 'bg-surface-container-highest text-primary font-semibold'
                    : 'text-body-md text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface'
                  : 'text-title-md text-on-surface-variant hover:bg-surface-container hover:text-on-surface'
              "
              >{{ label }}</RouterLink
            >
          </template>
        </nav>
      </div>
      <div class="flex items-center gap-space-md">
        <ClubMenu />
        <div class="relative">
          <RouterLink
            aria-label="Notifications"
            :class="
              academy
                ? 'relative p-space-xs rounded-lg text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors'
                : 'w-9 h-9 rounded-lg bg-surface-container-low flex items-center justify-center text-on-surface-variant hover:text-on-surface hover:bg-surface-container transition-colors'
            "
            to="/notifications"
          >
            <AppIcon :class="academy ? 'text-[22px]' : 'text-[20px]'" name="notifications" />
            <span
              class="absolute w-2 h-2 rounded-full bg-primary"
              :class="academy ? 'top-1.5 right-1.5' : 'top-1 right-1'"
            ></span>
          </RouterLink>
        </div>
        <div
          v-if="academy"
          class="w-8 h-8 rounded-full bg-primary flex items-center justify-center"
        >
          <AppIcon class="text-on-primary text-[18px]" name="person" />
        </div>
        <div v-else class="relative group">
          <button
            aria-label="Profile menu"
            class="flex items-center gap-space-xs rounded-full focus:outline-none"
            type="button"
            v-preview-disclosure="'club-profile-menu'"
          >
            <div class="w-8 h-8 rounded-full bg-primary flex items-center justify-center">
              <AppIcon class="text-on-primary text-[18px]" name="person" />
            </div>
          </button>
          <div
            id="club-profile-menu"
            class="absolute right-0 top-full pt-space-xs hidden w-48 z-50 preview-disclosure"
          >
            <div
              class="bg-surface-container-high rounded-xl p-space-xs shadow-[0_16px_36px_-4px_rgba(0,0,0,0.65)]"
            >
              <RouterLink
                v-for="{ to, label } of profileLinks"
                :key="to"
                :to="to"
                class="block px-space-md py-space-xs rounded font-body-md text-body-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container-highest transition-colors"
                >{{ label }}</RouterLink
              >
              <div class="my-space-xs bg-surface-container-highest h-px"></div>
              <RouterLink
                class="block px-space-md py-space-xs rounded font-body-md text-body-md text-error hover:bg-surface-container-highest transition-colors"
                to="/login"
                >Logout</RouterLink
              >
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>
</template>
