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
              class="pointer-events-none absolute -top-16 -right-16 h-48 w-48 rounded-full bg-primary/10 blur-3xl"
            ></div>
            <div
              class="pointer-events-none absolute -bottom-16 -left-16 h-40 w-40 rounded-full bg-primary-container/10 blur-2xl"
            ></div>
            <div class="relative z-10 flex flex-col items-center text-center">
              <div
                class="mb-space-lg flex items-center gap-space-sm rounded-full bg-surface-container-high px-space-md py-space-xs text-on-surface-variant"
              >
                <span class="h-2 w-2 rounded-full bg-error"></span>
                <span class="font-label-badge text-label-badge uppercase tracking-wider"
                  >Illegal Move · Square Unavailable</span
                >
              </div>
              <div class="relative mb-space-md flex items-center justify-center">
                <div
                  class="flex h-20 w-20 items-center justify-center rounded-xl bg-surface-container-low shadow-md"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[40px]"
                    style="font-variation-settings: 'FILL' 1"
                    aria-hidden="true"
                    >search_off</span
                  >
                </div>
                <div
                  class="absolute -bottom-2 -right-2 flex h-8 w-8 items-center justify-center rounded-lg bg-primary-container text-on-primary-container shadow-sm"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >chess</span
                  >
                </div>
              </div>
              <div class="font-display-lg text-display-lg text-on-surface tracking-tight">404</div>
              <h1 class="mt-space-xs font-headline-md text-headline-md text-on-surface">
                Page Not Found
              </h1>
              <p class="mt-space-sm font-body-md text-body-md text-on-surface-variant max-w-xs">
                The requested board, tournament, or academy page does not exist or has been moved to
                another square.
              </p>
              <div class="mt-space-xl flex w-full flex-col gap-space-sm sm:flex-row">
                <button
                  class="flex-1 inline-flex items-center justify-center gap-space-sm rounded-lg bg-surface-container-high px-space-lg py-3 font-title-md text-title-md text-on-surface transition-all hover:bg-surface-bright active:scale-[0.99]"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >arrow_back</span
                  >
                  <span>Go Back</span>
                </button>
                <RouterLink
                  class="flex-1 inline-flex items-center justify-center gap-space-sm rounded-lg bg-primary-container px-space-lg py-3 font-title-md text-title-md text-on-primary-container shadow-sm transition-all hover:bg-primary active:scale-[0.99]"
                  data-path="home"
                  to="/home"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true">home</span>
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
