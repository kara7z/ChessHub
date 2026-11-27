<script setup lang="ts">
import PublicLayout from '../../components/layout/PublicLayout.vue'
import PasswordToggle from '../../components/ui/PasswordToggle.vue'
</script>

<template>
  <PublicLayout>
    <main
      class="w-full min-h-screen flex items-center justify-center px-margin-desktop py-space-xl"
    >
      <div class="w-full max-w-md">
        <div class="flex flex-col w-full">
          <div
            class="relative w-full rounded-xl bg-surface-container shadow-xl p-space-lg sm:p-space-xl overflow-hidden"
          >
            <div
              class="absolute -top-24 -right-24 w-48 h-48 rounded-full bg-primary/10 blur-3xl pointer-events-none"
            ></div>
            <div class="relative flex flex-col gap-space-lg">
              <div class="flex flex-col gap-space-xs">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-primary"
                  >Membership</span
                >
                <h1 class="font-headline-md text-headline-md text-on-surface">
                  Create Your ChessHub Account
                </h1>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Join rated Swiss tournaments, live analysis rooms, and club ladders.
                </p>
              </div>
              <form
                class="flex flex-col gap-space-md"
                id="register-form"
                novalidate
                @submit.prevent=""
              >
                <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-md">
                  <div class="flex flex-col gap-space-xs">
                    <label
                      class="font-body-sm text-body-sm text-on-surface-variant"
                      for="first-name"
                      >First Name</label
                    >
                    <input
                      class="w-full rounded-lg bg-surface-container-low px-space-md py-2.5 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors"
                      id="first-name"
                      name="firstName"
                      placeholder="Magnus"
                      required
                      type="text"
                    />
                  </div>
                  <div class="flex flex-col gap-space-xs">
                    <label class="font-body-sm text-body-sm text-on-surface-variant" for="last-name"
                      >Last Name</label
                    >
                    <input
                      class="w-full rounded-lg bg-surface-container-low px-space-md py-2.5 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors"
                      id="last-name"
                      name="lastName"
                      placeholder="Carlsen"
                      required
                      type="text"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant" for="username"
                    >Username</label
                  >
                  <div class="relative flex items-center">
                    <span
                      class="material-symbols-outlined absolute left-3 text-[18px] text-outline pointer-events-none"
                      aria-hidden="true"
                      >alternate_email</span
                    >
                    <input
                      class="w-full rounded-lg bg-surface-container-low pl-10 pr-space-md py-2.5 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors"
                      id="username"
                      name="username"
                      placeholder="gm_handle"
                      required
                      type="text"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant" for="email"
                    >Email</label
                  >
                  <div class="relative flex items-center">
                    <span
                      class="material-symbols-outlined absolute left-3 text-[18px] text-outline pointer-events-none"
                      aria-hidden="true"
                      >mail</span
                    >
                    <input
                      class="w-full rounded-lg bg-surface-container-low pl-10 pr-space-md py-2.5 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors"
                      id="email"
                      name="email"
                      placeholder="player@chesshub.org"
                      required
                      type="email"
                    />
                  </div>
                </div>
                <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-md">
                  <div class="flex flex-col gap-space-xs">
                    <label class="font-body-sm text-body-sm text-on-surface-variant" for="password"
                      >Password</label
                    >
                    <div class="relative flex items-center">
                      <input
                        class="w-full rounded-lg bg-surface-container-low pl-space-md pr-10 py-2.5 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors"
                        id="password"
                        name="password"
                        placeholder="••••••••"
                        required
                        type="password"
                      />
                      <PasswordToggle
                        input-id="password"
                        label="Toggle password visibility"
                        class="absolute right-2.5 text-outline hover:text-on-surface transition-colors flex items-center justify-center"
                      />
                    </div>
                  </div>
                  <div class="flex flex-col gap-space-xs">
                    <label
                      class="font-body-sm text-body-sm text-on-surface-variant"
                      for="confirm-password"
                      >Confirm Password</label
                    >
                    <div class="relative flex items-center">
                      <input
                        class="w-full rounded-lg bg-surface-container-low pl-space-md pr-10 py-2.5 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors"
                        id="confirm-password"
                        name="confirmPassword"
                        placeholder="••••••••"
                        required
                        type="password"
                      />
                      <PasswordToggle
                        input-id="confirm-password"
                        label="Toggle confirm password visibility"
                        class="absolute right-2.5 text-outline hover:text-on-surface transition-colors flex items-center justify-center"
                      />
                    </div>
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >Chess Experience Level</span
                  >
                  <input
                    id="experience-level"
                    name="experienceLevel"
                    type="hidden"
                    value="Intermediate"
                  />
                  <div
                    aria-label="Chess Experience Level"
                    class="grid grid-cols-3 gap-space-sm"
                    role="radiogroup"
                  >
                    <button
                      class="level-option rounded-lg bg-surface-container-low text-on-surface-variant hover:bg-surface-container-high py-2.5 px-space-sm font-body-sm text-body-sm transition-colors flex flex-col items-center gap-0.5"
                      data-level="Beginner"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="font-title-md text-body-sm">Beginner</span>
                      <span class="font-label-badge text-label-badge text-outline">&lt; 1200</span>
                    </button>
                    <button
                      class="level-option rounded-lg bg-secondary-container text-on-secondary-fixed-variant py-2.5 px-space-sm font-body-sm text-body-sm transition-colors flex flex-col items-center gap-0.5"
                      data-level="Intermediate"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="font-title-md text-body-sm text-secondary-fixed"
                        >Intermediate</span
                      >
                      <span class="font-label-badge text-label-badge text-secondary"
                        >1200–1800</span
                      >
                    </button>
                    <button
                      class="level-option rounded-lg bg-surface-container-low text-on-surface-variant hover:bg-surface-container-high py-2.5 px-space-sm font-body-sm text-body-sm transition-colors flex flex-col items-center gap-0.5"
                      data-level="Advanced"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="font-title-md text-body-sm">Advanced</span>
                      <span class="font-label-badge text-label-badge text-outline">1800+</span>
                    </button>
                  </div>
                </div>
                <label class="flex items-start gap-space-sm cursor-pointer select-none pt-space-xs">
                  <input class="sr-only" id="terms-checkbox" required type="checkbox" />
                  <span
                    class="mt-0.5 w-4 h-4 rounded bg-surface-container-low flex items-center justify-center shrink-0 transition-colors"
                    id="terms-box"
                  >
                    <span
                      class="material-symbols-outlined text-[14px] text-on-primary-container hidden"
                      id="terms-icon"
                      aria-hidden="true"
                      >check</span
                    >
                  </span>
                  <span class="font-body-sm text-body-sm text-on-surface-variant leading-snug">
                    I agree to the
                    <span class="text-primary hover:underline" data-path="terms"
                      >Terms and Conditions</span
                    >
                    and Fair Play Policy.
                  </span>
                </label>
                <button
                  class="w-full rounded-lg bg-primary-container text-on-primary-container hover:bg-primary py-3 px-space-md font-title-md text-title-md transition-colors flex items-center justify-center gap-space-sm mt-space-xs"
                  id="submit-btn"
                  type="submit"
                  disabled
                  title="Design preview"
                >
                  <span>Create Account</span>
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
              </form>
              <div class="flex items-center justify-center pt-space-xs">
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Already have an account?
                  <RouterLink
                    class="text-primary hover:underline font-title-md text-body-sm ml-1"
                    data-path="login"
                    to="/login"
                    >Login</RouterLink
                  >
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
