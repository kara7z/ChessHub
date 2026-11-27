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
              class="absolute -top-16 -right-16 w-40 h-40 rounded-full bg-primary/10 blur-2xl pointer-events-none"
            ></div>
            <div class="relative flex flex-col gap-space-lg">
              <div class="flex items-start justify-between gap-space-md">
                <div
                  class="w-12 h-12 rounded-xl bg-surface-container-high text-primary flex items-center justify-center shadow-sm"
                >
                  <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                    >lock_reset</span
                  >
                </div>
                <span
                  class="px-space-sm py-space-xs rounded-full bg-surface-container-low text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
                >
                  Account Recovery
                </span>
              </div>
              <div class="flex flex-col gap-space-xs">
                <h1 class="font-headline-lg text-headline-lg text-on-surface">Forgot Password?</h1>
                <p class="font-body-md text-body-md text-on-surface-variant">
                  Enter the email address associated with your ChessHub account and we’ll send you a
                  secure link to reset your password.
                </p>
              </div>
              <div
                class="flex items-start gap-space-sm p-space-md rounded-lg bg-secondary-container text-secondary"
                id="reset-success-banner"
              >
                <span
                  class="material-symbols-outlined text-[20px] shrink-0 mt-0.5"
                  style="font-variation-settings: 'FILL' 1"
                  aria-hidden="true"
                  >check_circle</span
                >
                <div class="flex flex-col gap-space-xs min-w-0">
                  <p class="font-body-sm text-body-sm text-secondary font-semibold">
                    Reset link sent! Check your inbox for instructions.
                  </p>
                </div>
              </div>
              <form
                class="flex flex-col gap-space-md"
                id="forgot-password-form"
                novalidate
                @submit.prevent=""
              >
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant" for="email">
                    Email Address
                  </label>
                  <div class="relative flex items-center">
                    <span
                      class="material-symbols-outlined text-[18px] text-outline absolute left-3 pointer-events-none"
                      aria-hidden="true"
                      >mail</span
                    >
                    <input
                      class="w-full bg-surface-container-lowest text-on-surface placeholder:text-outline font-body-md text-body-md rounded-lg pl-10 pr-4 py-3 focus:outline-none focus:bg-surface-container-low transition-colors"
                      id="email"
                      name="email"
                      placeholder="grandmaster@chesshub.academy"
                      required
                      type="email"
                    />
                  </div>
                </div>
                <button
                  class="w-full bg-primary-container hover:bg-primary text-on-primary-container font-title-md text-title-md rounded-lg py-3 px-space-lg flex items-center justify-center gap-space-sm transition-colors shadow-md cursor-pointer"
                  type="submit"
                  disabled
                  title="Design preview"
                >
                  <span>Send Reset Link</span>
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
              </form>
              <div class="flex items-center justify-between pt-space-sm">
                <RouterLink
                  class="inline-flex items-center gap-space-xs font-body-md text-body-md text-on-surface-variant hover:text-primary transition-colors"
                  data-path="login"
                  to="/login"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >arrow_back</span
                  >
                  <span>Back to Login</span>
                </RouterLink>
                <span class="font-label-badge text-label-badge text-outline">
                  256-BIT ENCRYPTED
                </span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
