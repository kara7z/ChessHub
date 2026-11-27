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
            class="relative w-full rounded-xl bg-surface-container p-space-xl shadow-xl overflow-hidden"
          >
            <div
              class="pointer-events-none absolute -top-16 -right-16 h-48 w-48 rounded-full bg-primary/10 blur-3xl"
            ></div>
            <div
              class="pointer-events-none absolute -bottom-16 -left-16 h-40 w-40 rounded-full bg-tertiary/10 blur-3xl"
            ></div>
            <div class="relative flex flex-col items-center text-center">
              <div
                class="mb-space-lg flex h-16 w-16 items-center justify-center rounded-xl bg-surface-container-high shadow-md"
              >
                <span
                  class="material-symbols-outlined text-primary"
                  style="font-size: 32px; font-variation-settings: 'FILL' 1"
                  aria-hidden="true"
                  >schedule</span
                >
              </div>
              <div
                class="mb-space-md inline-flex items-center gap-space-xs rounded-full bg-primary/15 px-space-md py-space-xs text-primary"
              >
                <span class="h-2 w-2 rounded-full bg-primary animate-pulse"></span>
                <span class="font-label-badge text-label-badge uppercase">Pending Approval</span>
              </div>
              <h1 class="font-headline-md text-headline-md text-on-surface mb-space-sm">
                Your Account is Pending Administrator Approval
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant mb-space-xl">
                Thank you for registering with ChessHub Academy. An administrator will review your
                credentials and activate your account shortly.
              </p>
              <div
                class="w-full rounded-lg bg-surface-container-low p-space-md mb-space-xl text-left"
              >
                <div class="flex items-center justify-between py-space-xs">
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Verification Status</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-primary"
                    >In Review</span
                  >
                </div>
                <div class="flex items-center justify-between py-space-xs">
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Estimated Turnaround</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >12 – 24 hrs</span
                  >
                </div>
                <div class="flex items-center justify-between py-space-xs">
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Notification</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface"
                    >Email upon activation</span
                  >
                </div>
              </div>
              <RouterLink
                class="w-full inline-flex items-center justify-center gap-space-sm rounded-lg bg-primary-container px-space-lg py-space-md font-title-md text-title-md text-on-primary-container transition-all duration-200 hover:bg-primary active:scale-[0.99] shadow-sm"
                id="logout-btn"
                to="/login"
              >
                <span class="material-symbols-outlined" style="font-size: 20px" aria-hidden="true"
                  >logout</span
                >
                <span>Logout</span>
              </RouterLink>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
