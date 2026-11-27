<script setup lang="ts">
import PublicLayout from '../../components/layout/PublicLayout.vue'
</script>

<template>
  <PublicLayout>
    <main
      class="w-full min-h-screen flex items-center justify-center px-margin-desktop py-space-xl"
    >
      <div class="w-full max-w-md">
        <div class="flex flex-col w-full">
          <div
            class="app-panel relative overflow-hidden p-space-lg sm:p-space-xl"
          >
            <div
              class="pointer-events-none absolute -top-24 -right-24 h-48 w-48 rounded-full bg-primary/10 blur-3xl"
            ></div>
            <div
              class="pointer-events-none absolute -bottom-24 -left-24 h-48 w-48 rounded-full bg-error/5 blur-3xl"
            ></div>
            <div class="relative z-10 flex flex-col items-center text-center">
              <div
                class="mb-space-lg flex items-center gap-space-sm rounded-full bg-surface-container-high px-space-md py-space-xs"
              >
                <span class="h-2 w-2 rounded-full bg-error"></span>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                  >Restricted Sector</span
                >
              </div>
              <div class="relative mb-space-md flex items-center justify-center">
                <div
                  class="flex h-20 w-20 items-center justify-center rounded-xl bg-surface-container-low shadow-md"
                >
                  <span
                    class="material-symbols-outlined text-[40px] text-primary"
                    style="font-variation-settings: 'FILL' 1"
                    aria-hidden="true"
                    >shield_lock</span
                  >
                </div>
              </div>
              <div class="font-display-lg text-display-lg tracking-tight text-on-surface">403</div>
              <h1 class="mt-space-xs font-headline-md text-headline-md text-on-surface">
                Access Denied
              </h1>
              <p class="mt-space-sm max-w-xs font-body-md text-body-md text-on-surface-variant">
                You do not have permission to view this page. This route is restricted to tournament
                arbiters and academy administrators.
              </p>
              <div
                class="mt-space-lg w-full rounded-lg bg-surface-container-lowest px-space-md py-space-sm"
              >
                <div
                  class="flex items-center justify-between font-body-sm text-body-sm text-outline"
                >
                  <span>Clearance</span>
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                    >ADMIN_ONLY</span
                  >
                </div>
              </div>
              <div class="mt-space-xl flex w-full flex-col gap-space-sm">
                <RouterLink
                  class="inline-flex w-full items-center justify-center gap-space-sm rounded-lg bg-primary-container px-space-lg py-space-md font-title-md text-title-md text-on-primary-container shadow-md transition-all hover:bg-primary active:scale-[0.99]"
                  data-path="home"
                  to="/home"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >arrow_back</span
                  >
                  <span>Return Home</span>
                </RouterLink>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
