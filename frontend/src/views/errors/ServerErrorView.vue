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
            class="app-panel relative w-full overflow-hidden p-space-lg text-on-surface sm:p-space-xl"
          >
            <div
              class="absolute -top-16 -right-16 w-48 h-48 rounded-full bg-error/10 blur-2xl pointer-events-none"
            ></div>
            <div
              class="absolute -bottom-16 -left-16 w-40 h-40 rounded-full bg-primary/10 blur-2xl pointer-events-none"
            ></div>
            <div class="relative flex flex-col items-center text-center">
              <div
                class="inline-flex items-center gap-space-xs px-space-md py-space-xs rounded-full bg-error-container text-on-error-container mb-space-lg"
              >
                <span
                  class="material-symbols-outlined text-[16px]"
                  style="font-variation-settings: 'FILL' 1"
                  aria-hidden="true"
                  >warning</span
                >
                <span class="font-label-badge text-label-badge uppercase tracking-wider"
                  >Server Fault</span
                >
              </div>
              <div class="relative flex items-center justify-center mb-space-md">
                <span
                  class="font-display-lg text-display-lg text-on-surface tracking-tight select-none"
                  >500</span
                >
              </div>
              <h1 class="font-headline-md text-headline-md text-on-surface mb-space-sm">
                Something Went Wrong
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant max-w-xs mb-space-xl">
                An unexpected error occurred on our tournament servers. Our arbiters have been
                notified and are investigating the issue.
              </p>
              <div
                class="w-full rounded-lg bg-surface-container-low p-space-md mb-space-xl flex items-center justify-between text-left"
              >
                <div class="flex items-center gap-space-sm min-w-0">
                  <span class="w-2 h-2 rounded-full bg-error shrink-0 animate-pulse"></span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                    >ERR_INTERNAL_ENGINE_TIMEOUT</span
                  >
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-outline shrink-0"
                  >HTTP 500</span
                >
              </div>
              <div class="flex flex-col sm:flex-row items-center gap-space-md w-full">
                <button
                  class="w-full sm:flex-1 inline-flex items-center justify-center gap-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface px-space-lg py-space-md font-title-md text-title-md transition-colors cursor-pointer"
                  id="retry-btn"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span
                    class="material-symbols-outlined text-[18px]"
                    id="retry-icon"
                    aria-hidden="true"
                    >refresh</span
                  >
                  <span id="retry-text">Try Again</span>
                </button>
                <RouterLink
                  class="w-full sm:flex-1 inline-flex items-center justify-center gap-space-sm rounded-lg bg-primary-container hover:bg-primary text-on-primary-container px-space-lg py-space-md font-title-md text-title-md transition-colors shadow-sm"
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
