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
            class="relative w-full bg-surface-container rounded-xl p-space-xl shadow-xl overflow-hidden"
          >
            <div
              class="absolute -top-12 -right-12 w-40 h-40 rounded-full bg-error/10 blur-2xl pointer-events-none"
            ></div>
            <div class="relative flex flex-col items-center text-center">
              <div
                class="w-16 h-16 rounded-full bg-error-container/40 text-error flex items-center justify-center mb-space-lg shadow-md"
              >
                <span
                  class="material-symbols-outlined text-[32px]"
                  style="font-variation-settings: 'FILL' 1"
                  aria-hidden="true"
                  >gpp_bad</span
                >
              </div>
              <div
                class="inline-flex items-center gap-space-xs px-space-md py-space-xs rounded-full bg-error-container/50 text-error font-label-badge text-label-badge uppercase tracking-wider mb-space-md"
              >
                <span class="w-1.5 h-1.5 rounded-full bg-error"></span>
                <span>Account Rejected</span>
              </div>
              <h1 class="font-headline-md text-headline-md text-on-surface mb-space-sm">
                Registration Not Approved
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant mb-space-lg">
                Your ChessHub Academy account application was reviewed and could not be approved at
                this time. This may be due to incomplete verification details or eligibility
                requirements.
              </p>
              <div
                class="w-full bg-surface-container-low rounded-lg p-space-md mb-space-xl text-left"
              >
                <div class="flex items-center justify-between mb-space-xs">
                  <span class="font-label-badge text-label-badge text-outline uppercase"
                    >Application Status</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-error"
                    >Declined</span
                  >
                </div>
                <div class="flex items-center justify-between">
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Reference ID</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >CH-8492-RJ</span
                  >
                </div>
              </div>
              <div class="flex flex-col sm:flex-row gap-space-md w-full">
                <a
                  class="flex-1 inline-flex items-center justify-center gap-space-sm px-space-lg py-space-md rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md hover:bg-primary transition-colors shadow-sm"
                  href="mailto:support@chesshub.academy?subject=Account%20Application%20Review%20(CH-8492-RJ)"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >support_agent</span
                  >
                  <span>Contact Support</span>
                </a>
                <RouterLink
                  class="flex-1 inline-flex items-center justify-center gap-space-sm px-space-lg py-space-md rounded-lg bg-surface-container-high text-on-surface font-title-md text-title-md hover:bg-surface-bright transition-colors"
                  id="logout-btn"
                  to="/login"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >logout</span
                  >
                  <span>Logout</span>
                </RouterLink>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
