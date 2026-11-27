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
            class="app-panel relative w-full overflow-hidden p-space-lg sm:p-space-xl"
          >
            <div
              class="absolute -top-24 -right-24 w-48 h-48 rounded-full bg-error-container/20 blur-3xl pointer-events-none"
            ></div>
            <div class="relative flex flex-col items-center text-center">
              <div
                class="w-16 h-16 rounded-xl bg-error-container text-error flex items-center justify-center mb-space-lg shadow-md"
              >
                <span
                  class="material-symbols-outlined text-[32px]"
                  style="font-variation-settings: 'FILL' 1"
                  aria-hidden="true"
                  >gpp_maybe</span
                >
              </div>
              <span
                class="inline-flex items-center gap-space-xs px-space-md py-space-xs rounded-full bg-error-container/60 text-on-error-container font-label-badge text-label-badge uppercase tracking-wider mb-space-md"
              >
                <span class="w-1.5 h-1.5 rounded-full bg-error"></span>
                Account Suspended
              </span>
              <h1 class="font-headline-md text-headline-md text-on-surface mb-space-sm">
                Your Account Has Been Suspended
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant mb-space-lg">
                Access to your ChessHub Academy profile, rated tournaments, and club pairings has
                been restricted due to a violation of our Fair Play &amp; Club Conduct Policy.
              </p>
              <div
                class="w-full bg-surface-container-low rounded-lg p-space-md mb-space-xl text-left flex flex-col gap-space-sm"
              >
                <div class="flex items-center justify-between gap-space-sm">
                  <span class="font-body-sm text-body-sm text-outline">Case Reference</span>
                  <span class="font-label-numeric-md text-label-numeric-md text-on-surface"
                    >CH-MOD-8492</span
                  >
                </div>
                <div class="flex items-center justify-between gap-space-sm">
                  <span class="font-body-sm text-body-sm text-outline">Policy Section</span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Section 4.2 • Fair Play</span
                  >
                </div>
                <div class="flex items-center justify-between gap-space-sm">
                  <span class="font-body-sm text-body-sm text-outline">Review Status</span>
                  <span class="font-body-sm text-body-sm text-error">Pending Appeal</span>
                </div>
              </div>
              <div class="w-full flex flex-col gap-space-sm">
                <a
                  class="w-full inline-flex items-center justify-center gap-space-sm bg-primary-container text-on-primary-container hover:bg-primary font-title-md text-title-md py-space-md px-space-lg rounded-lg transition-colors"
                  href="mailto:support@chesshub.academy?subject=Account%20Suspension%20Appeal%20(CH-MOD-8492)"
                  id="contact-support-btn"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >support_agent</span
                  >
                  Contact Support
                </a>
                <RouterLink
                  class="w-full inline-flex items-center justify-center gap-space-sm bg-surface-container-high text-on-surface hover:bg-surface-bright font-title-md text-title-md py-space-md px-space-lg rounded-lg transition-colors"
                  data-path="logout"
                  to="/login"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >logout</span
                  >
                  Logout
                </RouterLink>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
