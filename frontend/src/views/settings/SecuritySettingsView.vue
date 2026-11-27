<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
import SettingsContextBar from '../../components/navigation/SettingsContextBar.vue'
import SettingsSidebar from '../../components/navigation/SettingsSidebar.vue'
import PasswordToggle from '../../components/ui/PasswordToggle.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <div class="w-full px-margin pb-space-xl md:px-margin-desktop">
          <SettingsContextBar />
          <div class="grid grid-cols-1 items-start gap-space-lg lg:grid-cols-12">
            <SettingsSidebar />
            <section class="flex min-w-0 flex-col gap-space-xl lg:col-span-9">
              <div class="flex flex-col sm:flex-row sm:items-end justify-between gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-primary"
                    >Account Protection</span
                  >
                  <h1 class="app-page-title">
                    Security &amp; Authentication
                  </h1>
                  <p class="font-body-md text-body-md text-on-surface-variant">
                    Manage your verified federation email, password credentials, and active
                    tournament terminal sessions.
                  </p>
                </div>
                <div
                  class="inline-flex items-center gap-space-xs px-space-md py-space-xs rounded-full bg-secondary-container text-primary self-start sm:self-auto"
                >
                  <span
                    class="material-symbols-outlined text-[16px]"
                    style="font-variation-settings: 'FILL' 1"
                    aria-hidden="true"
                    >verified_user</span
                  >
                  <span class="font-label-badge text-label-badge uppercase tracking-wider"
                    >2FA Ready</span
                  >
                </div>
              </div>
              <div
                class="app-panel flex flex-col gap-space-lg p-space-lg"
              >
                <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-sm">
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-9 h-9 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >mail</span
                      >
                    </div>
                    <div class="flex flex-col">
                      <h3 class="font-headline-sm text-headline-sm text-on-surface">
                        Email Address
                      </h3>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Used for tournament pairings, arbiter alerts, and account recovery.
                      </p>
                    </div>
                  </div>
                  <span
                    class="inline-flex items-center gap-space-xs px-space-sm py-space-xs rounded-full bg-secondary-container text-primary self-start sm:self-center"
                  >
                    <span
                      class="material-symbols-outlined text-[14px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >check_circle</span
                    >
                    <span class="font-label-badge text-label-badge uppercase">Verified</span>
                  </span>
                </div>
                <form
                  class="flex flex-col sm:flex-row items-stretch sm:items-end gap-space-md"
                  id="email-form"
                  @submit.prevent=""
                >
                  <div class="flex-1 flex flex-col gap-space-xs">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      for="email-input"
                      >Primary Email</label
                    >
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface placeholder-outline font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors"
                      id="email-input"
                      type="email"
                      value="a.karpov@chesshub.org"
                    />
                  </div>
                  <button
                    class="px-space-lg py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-body-md transition-colors shrink-0 cursor-pointer"
                    type="submit"
                    disabled
                    title="Design preview"
                  >
                    Update Email
                  </button>
                </form>
                <div
                  class="hidden font-body-sm text-body-sm text-primary"
                  id="email-feedback"
                ></div>
              </div>
              <div
                class="app-panel flex flex-col gap-space-lg p-space-lg"
              >
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-9 h-9 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                  >
                    <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                      >lock_reset</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <h3 class="font-headline-sm text-headline-sm text-on-surface">
                      Change Password
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Use at least 12 characters with a mix of uppercase, numbers, and symbols.
                    </p>
                  </div>
                </div>
                <form class="flex flex-col gap-space-md" id="password-form" @submit.prevent="">
                  <div class="flex flex-col gap-space-xs">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      for="current-password"
                      >Current Password</label
                    >
                    <div class="relative">
                      <input
                        class="w-full px-space-md py-space-sm pr-10 rounded-lg bg-surface-container-lowest text-on-surface placeholder-outline font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors"
                        id="current-password"
                        placeholder="Enter current password"
                        required
                        type="password"
                      />
                      <PasswordToggle
                        input-id="current-password"
                        label="Toggle password visibility"
                        class="absolute right-3 top-1/2 -translate-y-1/2 text-outline hover:text-on-surface transition-colors cursor-pointer"
                      />
                    </div>
                  </div>
                  <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                    <div class="flex flex-col gap-space-xs">
                      <label
                        class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                        for="new-password"
                        >New Password</label
                      >
                      <div class="relative">
                        <input
                          class="w-full px-space-md py-space-sm pr-10 rounded-lg bg-surface-container-lowest text-on-surface placeholder-outline font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors"
                          id="new-password"
                          placeholder="Enter new password"
                          required
                          type="password"
                        />
                        <PasswordToggle
                          input-id="new-password"
                          label="Toggle password visibility"
                          class="absolute right-3 top-1/2 -translate-y-1/2 text-outline hover:text-on-surface transition-colors cursor-pointer"
                        />
                      </div>
                      <div class="flex items-center gap-space-xs pt-space-xs">
                        <div
                          class="h-1 flex-1 rounded-full bg-surface-container-highest overflow-hidden"
                        >
                          <div
                            class="h-full w-0 bg-primary transition-all duration-300"
                            id="strength-bar"
                          ></div>
                        </div>
                        <span
                          class="font-label-badge text-label-badge text-outline"
                          id="strength-label"
                          >Strength</span
                        >
                      </div>
                    </div>
                    <div class="flex flex-col gap-space-xs">
                      <label
                        class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                        for="confirm-password"
                        >Confirm New Password</label
                      >
                      <div class="relative">
                        <input
                          class="w-full px-space-md py-space-sm pr-10 rounded-lg bg-surface-container-lowest text-on-surface placeholder-outline font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors"
                          id="confirm-password"
                          placeholder="Confirm new password"
                          required
                          type="password"
                        />
                        <PasswordToggle
                          input-id="confirm-password"
                          label="Toggle password visibility"
                          class="absolute right-3 top-1/2 -translate-y-1/2 text-outline hover:text-on-surface transition-colors cursor-pointer"
                        />
                      </div>
                    </div>
                  </div>
                  <div
                    class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md pt-space-xs"
                  >
                    <span
                      class="font-body-sm text-body-sm text-on-surface-variant"
                      id="password-feedback"
                      >Last updated 42 days ago</span
                    >
                    <button
                      class="px-space-lg py-space-sm rounded-lg bg-primary hover:bg-primary-fixed text-on-primary font-title-md text-body-md transition-colors cursor-pointer self-start sm:self-auto"
                      type="submit"
                      disabled
                      title="Design preview"
                    >
                      Change Password
                    </button>
                  </div>
                </form>
              </div>
              <div
                class="app-panel flex flex-col gap-space-lg p-space-lg"
              >
                <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md">
                  <div class="flex items-center gap-space-sm">
                    <div
                      class="w-9 h-9 rounded-lg bg-surface-container-high flex items-center justify-center text-primary"
                    >
                      <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                        >devices</span
                      >
                    </div>
                    <div class="flex flex-col">
                      <h3 class="font-headline-sm text-headline-sm text-on-surface">
                        Active Sessions
                      </h3>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Devices currently authenticated with your ChessHub Academy credentials.
                      </p>
                    </div>
                  </div>
                  <button
                    class="px-space-md py-space-sm rounded-lg bg-error-container/40 hover:bg-error-container text-error font-title-md text-body-sm transition-colors cursor-pointer self-start sm:self-auto"
                    id="signout-others-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Sign Out Other Sessions
                  </button>
                </div>
                <div class="flex flex-col gap-space-sm" id="sessions-list">
                  <div
                    class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md p-space-md rounded-lg bg-surface-container-low"
                  >
                    <div class="flex items-center gap-space-md min-w-0">
                      <div
                        class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-primary shrink-0"
                      >
                        <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                          >laptop_mac</span
                        >
                      </div>
                      <div class="flex flex-col min-w-0">
                        <div class="flex items-center gap-space-sm flex-wrap">
                          <span class="font-title-md text-title-md text-on-surface truncate"
                            >Chrome on macOS</span
                          >
                          <span
                            class="px-space-sm py-0.5 rounded-full bg-secondary-container text-primary font-label-badge text-label-badge uppercase"
                            >Current Session</span
                          >
                        </div>
                        <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                          >Oslo, Norway · 192.168.1.42</span
                        >
                      </div>
                    </div>
                    <span class="font-label-numeric-md text-label-numeric-md text-primary shrink-0"
                      >Active now</span
                    >
                  </div>
                  <div
                    class="flex flex-col sm:flex-row sm:items-center justify-between gap-space-md p-space-md rounded-lg bg-surface-container-low"
                    data-other-session="true"
                  >
                    <div class="flex items-center gap-space-md min-w-0">
                      <div
                        class="w-10 h-10 rounded-lg bg-surface-container-high flex items-center justify-center text-on-surface-variant shrink-0"
                      >
                        <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                          >smartphone</span
                        >
                      </div>
                      <div class="flex flex-col min-w-0">
                        <span class="font-title-md text-title-md text-on-surface truncate"
                          >Mobile Safari on iOS</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                          >Oslo, Norway · 172.16.0.18</span
                        >
                      </div>
                    </div>
                    <span class="font-body-sm text-body-sm text-outline shrink-0"
                      >Last active 2h ago</span
                    >
                  </div>
                </div>
              </div>
            </section>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
