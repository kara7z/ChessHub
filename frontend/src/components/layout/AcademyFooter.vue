<script setup lang="ts">
import AppIcon from '../ui/AppIcon.vue'
</script>

<template>
  <footer
    class="w-full bg-surface-container-lowest shadow-[0_-1px_12px_rgba(0,0,0,0.5)] mt-space-xl"
  >
    <div class="w-full px-margin-desktop py-space-xl">
      <div class="grid grid-cols-1 md:grid-cols-4 gap-space-xl mb-space-xl">
        <div class="md:col-span-1 space-y-space-sm">
          <div class="flex items-center gap-space-sm">
            <div class="w-7 h-7 rounded bg-primary flex items-center justify-center">
              <AppIcon class="text-on-primary text-[16px]" name="military_tech" />
            </div>
            <span class="font-headline-sm text-headline-sm text-on-surface">ChessHub</span>
          </div>
          <p class="font-body-sm text-body-sm text-on-surface-variant">
            The analytical performance terminal for competitive grandmasters, club directors, and
            aspirational scholastic players worldwide.
          </p>
        </div>
        <div class="space-y-space-sm">
          <h4 class="font-title-md text-title-md text-on-surface uppercase tracking-wider">
            Club Links
          </h4>
          <ul class="space-y-space-xs font-body-sm text-body-sm text-on-surface-variant">
            <li>
              <RouterLink class="hover:text-primary transition-colors" to="/workshops">
                Masterclasses &amp; Clinics
              </RouterLink>
            </li>
            <li>Live Broadcast Boards</li>
            <li>
              <RouterLink class="hover:text-primary transition-colors" to="/leaderboard">
                National Club Rankings
              </RouterLink>
            </li>
            <li>
              <RouterLink class="hover:text-primary transition-colors" to="/chess-tricks">
                Tactical Drills &amp; Traps
              </RouterLink>
            </li>
          </ul>
        </div>
        <div class="space-y-space-sm">
          <h4 class="font-title-md text-title-md text-on-surface uppercase tracking-wider">
            Federations
          </h4>
          <ul class="space-y-space-xs font-body-sm text-body-sm text-on-surface-variant">
            <li>FIDE Official Ratings</li>
            <li>US Chess Federation</li>
            <li>European Chess Union</li>
            <li>Arbiters Commission</li>
          </ul>
        </div>
        <div class="space-y-space-sm">
          <h4 class="font-title-md text-title-md text-on-surface uppercase tracking-wider">
            Sanctioning
          </h4>
          <p class="font-body-sm text-body-sm text-on-surface-variant">
            All tournament workshops and classical Swiss leagues are compliant with FIDE Swiss
            pairing rules and club points.
          </p>
          <div
            class="pt-space-xs flex items-center gap-space-sm text-outline font-label-badge text-label-badge"
          >
            <AppIcon class="text-[16px] text-primary" name="verified" />
            <span>OFFICIAL ARBITER AFFILIATED</span>
          </div>
        </div>
      </div>
      <div
        class="pt-space-lg flex flex-col md:flex-row items-center justify-between gap-space-md bg-surface-container-low px-space-lg py-space-md rounded-lg"
      >
        <p class="font-body-sm text-body-sm text-outline">
          © 2025 ChessHub International Federation &amp; Academy. All rights reserved.
        </p>
        <div
          class="flex items-center gap-space-lg font-body-sm text-body-sm text-on-surface-variant"
        >
          <span>Fair Play Policy</span>
          <span>FIDE Rules of Chess</span>
          <span>Tournament Regulations</span>
        </div>
      </div>
    </div>
  </footer>
</template>
