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
            class="bg-surface-container rounded-xl p-space-xl shadow-xl relative overflow-hidden"
          >
            <div
              class="absolute -top-24 -right-24 w-48 h-48 rounded-full bg-primary/10 blur-3xl pointer-events-none"
            ></div>
            <div class="relative flex flex-col gap-space-lg">
              <div class="flex flex-col gap-space-sm">
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-10 h-10 rounded-lg bg-primary-container text-on-primary-container flex items-center justify-center shadow-sm"
                  >
                    <span
                      class="material-symbols-outlined text-[22px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >chess</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <span class="font-label-badge text-label-badge uppercase text-primary"
                      >ChessHub Academy</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Tournament &amp; Club Portal</span
                    >
                  </div>
                </div>
                <h1 class="font-headline-md text-headline-md text-on-surface mt-space-sm">
                  Sign in to ChessHub
                </h1>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Enter your credentials to access live pairings, tournament clocks, and Swiss
                  standings.
                </p>
              </div>
              <div
                class="bg-error-container text-on-error-container rounded-lg p-space-md flex items-start gap-space-sm"
                id="login-error-banner"
                role="alert"
              >
                <span
                  class="material-symbols-outlined text-[20px] shrink-0 mt-0.5"
                  aria-hidden="true"
                  >error</span
                >
                <div class="flex-1 min-w-0">
                  <p class="font-body-sm text-body-sm font-semibold">Invalid credentials</p>
                  <p class="font-body-sm text-body-sm opacity-90" id="login-error-text">
                    The email or password you entered does not match our records.
                  </p>
                </div>
                <button
                  aria-label="Dismiss error"
                  class="text-on-error-container/80 hover:text-on-error-container transition-colors shrink-0"
                  id="dismiss-error-btn"
                  type="button"
                  disabled
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >close</span
                  >
                </button>
              </div>
              <form
                class="flex flex-col gap-space-md"
                id="login-form"
                novalidate
                @submit.prevent=""
              >
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant" for="email"
                    >Email address</label
                  >
                  <div class="relative flex items-center">
                    <span
                      class="material-symbols-outlined text-[18px] text-outline absolute left-3 pointer-events-none"
                      aria-hidden="true"
                      >mail</span
                    >
                    <input
                      autocomplete="email"
                      class="w-full bg-surface-container-low text-on-surface placeholder:text-outline rounded-lg pl-10 pr-space-md py-3 font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors"
                      id="email"
                      name="email"
                      placeholder="grandmaster@chesshub.academy"
                      required
                      type="email"
                      value="director@chesshub.academy"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-body-sm text-body-sm text-on-surface-variant" for="password"
                    >Password</label
                  >
                  <div class="relative flex items-center">
                    <span
                      class="material-symbols-outlined text-[18px] text-outline absolute left-3 pointer-events-none"
                      aria-hidden="true"
                      >lock</span
                    >
                    <input
                      autocomplete="current-password"
                      class="w-full bg-surface-container-low text-on-surface placeholder:text-outline rounded-lg pl-10 pr-11 py-3 font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors"
                      id="password"
                      name="password"
                      placeholder="Enter your password"
                      required
                      type="password"
                    />
                    <PasswordToggle
                      input-id="password"
                      label="Show password"
                      class="absolute right-3 text-outline hover:text-on-surface transition-colors flex items-center justify-center"
                      id="toggle-password-btn"
                      icon-id="toggle-password-icon"
                      icon-class="text-[20px]"
                    />
                  </div>
                </div>
                <div class="flex items-center justify-between gap-space-sm pt-space-xs">
                  <label class="inline-flex items-center gap-space-sm cursor-pointer select-none">
                    <input checked class="sr-only peer" id="remember-me" type="checkbox" />
                    <span
                      class="w-4 h-4 rounded bg-surface-container-low peer-checked:bg-primary-container text-on-primary-container flex items-center justify-center transition-colors"
                    >
                      <span
                        class="material-symbols-outlined text-[14px] opacity-0 peer-checked:opacity-100"
                        aria-hidden="true"
                        >check</span
                      >
                    </span>
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Remember me</span
                    >
                  </label>
                  <RouterLink
                    class="font-body-sm text-body-sm text-primary hover:text-primary-fixed transition-colors"
                    data-path="forgot-password"
                    to="/forgot-password"
                  >
                    Forgot password?
                  </RouterLink>
                </div>
                <div class="flex flex-col gap-space-sm pt-space-sm">
                  <button
                    class="w-full bg-primary-container hover:bg-primary text-on-primary-container font-title-md text-title-md py-3 rounded-lg transition-colors flex items-center justify-center gap-space-sm cursor-pointer shadow-sm"
                    id="login-submit-btn"
                    type="submit"
                    disabled
                    title="Design preview"
                  >
                    <span>Login</span>
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >arrow_forward</span
                    >
                  </button>
                  <div
                    class="bg-surface-container-low rounded-lg px-space-md py-space-sm flex items-center gap-space-sm"
                  >
                    <span
                      class="material-symbols-outlined text-[16px] text-primary shrink-0"
                      aria-hidden="true"
                      >info</span
                    >
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      <span class="text-on-surface font-semibold">ADMIN</span> redirects to
                      <span class="text-primary">/dashboard</span> · active
                      <span class="text-on-surface font-semibold">PLAYER</span> redirects to
                      <span class="text-primary">/home</span>
                    </p>
                  </div>
                </div>
              </form>
              <div class="flex items-center gap-space-md">
                <div class="h-px flex-1 bg-surface-container-high"></div>
                <span class="font-label-badge text-label-badge uppercase text-outline"
                  >New to ChessHub?</span
                >
                <div class="h-px flex-1 bg-surface-container-high"></div>
              </div>
              <RouterLink
                class="w-full bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-title-md py-3 rounded-lg transition-colors flex items-center justify-center gap-space-sm"
                data-path="register"
                to="/register"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >person_add</span
                >
                <span>Register</span>
              </RouterLink>
            </div>
          </div>
        </div>
      </div>
    </main>
  </PublicLayout>
</template>
