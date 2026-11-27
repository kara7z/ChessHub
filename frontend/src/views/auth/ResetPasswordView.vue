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
            class="app-panel relative overflow-hidden p-space-lg sm:p-space-xl"
          >
            <div
              class="absolute -top-24 -right-24 w-48 h-48 bg-primary/10 rounded-full blur-3xl pointer-events-none"
            ></div>
            <div class="relative flex flex-col gap-space-lg">
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="w-8 h-8 rounded-lg bg-secondary-container text-secondary flex items-center justify-center"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >lock_reset</span
                    >
                  </span>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                    >Account Security</span
                  >
                </div>
                <h1 class="font-headline-md text-headline-md text-on-surface mt-space-xs">
                  Set New Password
                </h1>
                <p class="font-body-md text-body-md text-on-surface-variant">
                  Create a strong password to secure your tournament profile and rating history.
                </p>
              </div>
              <form
                class="flex flex-col gap-space-md"
                id="resetPasswordForm"
                novalidate
                @submit.prevent=""
              >
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant" for="newPassword"
                    >New Password</label
                  >
                  <div
                    class="relative flex items-center bg-surface-container-low rounded-lg transition-all focus-within:bg-surface-container-high"
                  >
                    <span
                      class="material-symbols-outlined text-[18px] text-outline pl-space-md select-none"
                      aria-hidden="true"
                      >key</span
                    >
                    <input
                      autocomplete="new-password"
                      class="w-full bg-transparent px-space-sm py-3 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none"
                      id="newPassword"
                      placeholder="Enter new password"
                      required
                      type="password"
                    />
                    <PasswordToggle
                      input-id="newPassword"
                      label="Toggle new password visibility"
                      class="pr-space-md pl-space-xs text-outline hover:text-on-surface transition-colors flex items-center justify-center"
                      id="toggleNewPassword"
                    />
                  </div>
                </div>
                <div
                  class="flex flex-col gap-space-sm bg-surface-container-low rounded-lg p-space-md"
                >
                  <div class="flex items-center justify-between">
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Password Strength</span
                    >
                    <span
                      class="font-label-badge text-label-badge uppercase text-outline"
                      id="strengthLabel"
                      >Empty</span
                    >
                  </div>
                  <div
                    class="w-full h-1.5 bg-surface-container-highest rounded-full overflow-hidden"
                  >
                    <div
                      class="h-full w-0 bg-primary-container rounded-full transition-all duration-300"
                      id="strengthBar"
                    ></div>
                  </div>
                  <ul class="grid grid-cols-2 gap-x-space-md gap-y-space-xs pt-space-xs">
                    <li
                      class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline transition-colors"
                      id="reqLength"
                    >
                      <span class="material-symbols-outlined text-[15px]" aria-hidden="true"
                        >radio_button_unchecked</span
                      >
                      <span>8+ characters</span>
                    </li>
                    <li
                      class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline transition-colors"
                      id="reqUpper"
                    >
                      <span class="material-symbols-outlined text-[15px]" aria-hidden="true"
                        >radio_button_unchecked</span
                      >
                      <span>Uppercase letter</span>
                    </li>
                    <li
                      class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline transition-colors"
                      id="reqNumber"
                    >
                      <span class="material-symbols-outlined text-[15px]" aria-hidden="true"
                        >radio_button_unchecked</span
                      >
                      <span>Number (0–9)</span>
                    </li>
                    <li
                      class="flex items-center gap-space-xs font-body-sm text-body-sm text-outline transition-colors"
                      id="reqSpecial"
                    >
                      <span class="material-symbols-outlined text-[15px]" aria-hidden="true"
                        >radio_button_unchecked</span
                      >
                      <span>Special symbol</span>
                    </li>
                  </ul>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-body-sm text-body-sm text-on-surface-variant"
                    for="confirmPassword"
                    >Confirm Password</label
                  >
                  <div
                    class="relative flex items-center bg-surface-container-low rounded-lg transition-all focus-within:bg-surface-container-high"
                  >
                    <span
                      class="material-symbols-outlined text-[18px] text-outline pl-space-md select-none"
                      aria-hidden="true"
                      >verified_user</span
                    >
                    <input
                      autocomplete="new-password"
                      class="w-full bg-transparent px-space-sm py-3 font-body-md text-body-md text-on-surface placeholder:text-outline focus:outline-none"
                      id="confirmPassword"
                      placeholder="Re-enter new password"
                      required
                      type="password"
                    />
                    <PasswordToggle
                      input-id="confirmPassword"
                      label="Toggle confirm password visibility"
                      class="pr-space-md pl-space-xs text-outline hover:text-on-surface transition-colors flex items-center justify-center"
                      id="toggleConfirmPassword"
                    />
                  </div>
                  <p class="font-body-sm text-body-sm text-error hidden" id="matchFeedback">
                    Passwords do not match.
                  </p>
                </div>
                <button
                  class="w-full mt-space-xs py-3 px-space-md rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md hover:bg-primary transition-colors flex items-center justify-center gap-space-sm shadow-sm"
                  id="submitBtn"
                  type="submit"
                  disabled
                  title="Design preview"
                >
                  <span>Reset Password</span>
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >arrow_forward</span
                  >
                </button>
              </form>
              <div
                class="hidden flex-col gap-space-sm bg-secondary-container text-secondary rounded-lg p-space-md"
                id="successBanner"
              >
                <div class="flex items-center gap-space-sm">
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >check_circle</span
                  >
                  <span class="font-title-md text-title-md">Password Updated</span>
                </div>
                <p class="font-body-sm text-body-sm text-on-secondary-container">
                  Your credentials have been securely updated. You can now sign in with your new
                  password.
                </p>
              </div>
              <div class="flex items-center justify-center pt-space-xs">
                <RouterLink
                  class="inline-flex items-center gap-space-xs font-body-md text-body-md text-on-surface-variant hover:text-primary transition-colors"
                  data-path="login"
                  to="/login"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >arrow_back</span
                  >
                  <span>Back to Login</span>
                </RouterLink>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
