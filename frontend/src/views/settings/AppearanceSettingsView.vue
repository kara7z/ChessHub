<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <div class="w-full max-w-[1440px] mx-auto px-margin-desktop py-space-xl">
          <div class="flex flex-col lg:flex-row gap-space-xl items-start">
            <aside
              class="w-full lg:w-[260px] shrink-0 bg-surface-container-low rounded-xl p-space-md shadow-md"
            >
              <div class="px-space-sm pb-space-md mb-space-sm">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Account Terminal</span
                >
                <h2 class="font-headline-sm text-headline-sm text-on-surface mt-space-xs">
                  Settings
                </h2>
              </div>
              <nav aria-label="Settings Navigation" class="flex flex-col gap-space-xs">
                <RouterLink
                  class="flex items-center gap-space-md px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors"
                  data-path="settings-profile"
                  to="/settings/profile"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >person</span
                  >
                  <span class="font-title-md text-body-md">Profile</span>
                </RouterLink>
                <RouterLink
                  class="flex items-center justify-between px-space-md py-space-sm rounded-lg bg-surface-container-highest text-primary shadow-sm transition-colors"
                  data-path="settings-appearance"
                  to="/settings/appearance"
                >
                  <div class="flex items-center gap-space-md">
                    <span
                      class="material-symbols-outlined text-[20px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >palette</span
                    >
                    <span class="font-title-md text-body-md">Appearance</span>
                  </div>
                  <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                </RouterLink>
                <RouterLink
                  class="flex items-center gap-space-md px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors"
                  data-path="settings-security"
                  to="/settings/security"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >shield</span
                  >
                  <span class="font-title-md text-body-md">Security</span>
                </RouterLink>
                <RouterLink
                  class="flex items-center gap-space-md px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors"
                  data-path="settings-notifications"
                  to="/settings/notifications"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >notifications</span
                  >
                  <span class="font-title-md text-body-md">Notifications</span>
                </RouterLink>
              </nav>
              <div class="mt-space-xl pt-space-md bg-surface-container rounded-lg p-space-md">
                <div class="flex items-center gap-space-sm text-primary mb-space-xs">
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >verified_user</span
                  >
                  <span class="font-label-badge text-label-badge uppercase tracking-wider"
                    >FIDE Synced</span
                  >
                </div>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Preferences are synchronized across your tournament boards and analysis terminals.
                </p>
              </div>
            </aside>
            <section class="flex-1 min-w-0 w-full flex flex-col gap-space-xl">
              <div
                class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
              >
                <div>
                  <div class="flex items-center gap-space-sm mb-space-xs">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-primary bg-secondary-container px-space-sm py-space-xs rounded"
                      >Display &amp; Locale</span
                    >
                    <span class="font-label-badge text-label-badge text-outline"
                      >v2.4 Terminal</span
                    >
                  </div>
                  <h1 class="font-headline-lg text-headline-lg text-on-surface">Appearance</h1>
                  <p class="font-body-md text-body-md text-on-surface-variant mt-space-xs">
                    Calibrate your board contrast, low-light interface theme, and federation
                    language.
                  </p>
                </div>
                <div
                  class="hidden sm:flex items-center gap-space-sm bg-surface-container-low px-space-md py-space-sm rounded-lg"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >contrast</span
                  >
                  <div class="flex flex-col">
                    <span class="font-label-badge text-label-badge text-outline uppercase"
                      >Active Profile</span
                    >
                    <span
                      class="font-label-numeric-md text-label-numeric-md text-on-surface"
                      id="active-summary-label"
                      >Grandmaster Dark · EN</span
                    >
                  </div>
                </div>
              </div>
              <div
                class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col gap-space-lg"
              >
                <div class="flex items-center justify-between gap-space-md">
                  <div>
                    <h2 class="font-headline-sm text-headline-sm text-on-surface">
                      Interface Theme
                    </h2>
                    <p class="font-body-sm text-body-sm text-on-surface-variant mt-space-xs">
                      Select a surface calibration optimized for your tournament lighting
                      environment.
                    </p>
                  </div>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >3 Presets</span
                  >
                </div>
                <div class="grid grid-cols-1 md:grid-cols-3 gap-space-lg" id="theme-selector-grid">
                  <button
                    class="theme-card group text-left rounded-xl bg-surface-container-high p-space-md shadow-xl transition-all hover:bg-surface-bright focus:outline-none relative overflow-hidden"
                    data-theme-card="dark"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <div
                      class="w-full h-28 rounded-lg bg-surface-container-lowest p-space-sm mb-space-md flex flex-col justify-between shadow-sm"
                    >
                      <div class="flex items-center justify-between">
                        <div class="flex items-center gap-space-xs">
                          <span class="w-2.5 h-2.5 rounded-full bg-primary"></span>
                          <span class="w-10 h-2 rounded bg-surface-container-highest"></span>
                        </div>
                        <span class="w-6 h-2 rounded bg-primary-container"></span>
                      </div>
                      <div class="grid grid-cols-4 gap-space-xs">
                        <div class="h-10 rounded bg-surface-container"></div>
                        <div class="h-10 rounded bg-surface-container-high"></div>
                        <div class="h-10 rounded bg-surface-container"></div>
                        <div class="h-10 rounded bg-primary-container/30"></div>
                      </div>
                    </div>
                    <div class="flex items-start justify-between gap-space-sm">
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block">Dark</span>
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Grandmaster Dark</span
                        >
                      </div>
                      <span
                        class="theme-badge font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-space-xs rounded bg-primary text-on-primary"
                        >Active</span
                      >
                    </div>
                  </button>
                  <button
                    class="theme-card group text-left rounded-xl bg-surface-container-low p-space-md shadow-sm transition-all hover:bg-surface-container-high focus:outline-none relative overflow-hidden"
                    data-theme-card="light"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <div
                      class="w-full h-28 rounded-lg bg-inverse-surface p-space-sm mb-space-md flex flex-col justify-between shadow-sm"
                    >
                      <div class="flex items-center justify-between">
                        <div class="flex items-center gap-space-xs">
                          <span class="w-2.5 h-2.5 rounded-full bg-inverse-primary"></span>
                          <span class="w-10 h-2 rounded bg-on-surface-variant"></span>
                        </div>
                        <span class="w-6 h-2 rounded bg-inverse-primary"></span>
                      </div>
                      <div class="grid grid-cols-4 gap-space-xs">
                        <div class="h-10 rounded bg-on-surface-variant/30"></div>
                        <div class="h-10 rounded bg-on-surface-variant/20"></div>
                        <div class="h-10 rounded bg-on-surface-variant/30"></div>
                        <div class="h-10 rounded bg-inverse-primary/30"></div>
                      </div>
                    </div>
                    <div class="flex items-start justify-between gap-space-sm">
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block">Light</span>
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >Daylight Arbiter</span
                        >
                      </div>
                      <span
                        class="theme-badge hidden font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-space-xs rounded bg-primary text-on-primary"
                        >Active</span
                      >
                    </div>
                  </button>
                  <button
                    class="theme-card group text-left rounded-xl bg-surface-container-low p-space-md shadow-sm transition-all hover:bg-surface-container-high focus:outline-none relative overflow-hidden"
                    data-theme-card="system"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <div
                      class="w-full h-28 rounded-lg bg-surface-container-lowest p-space-sm mb-space-md flex overflow-hidden shadow-sm gap-space-xs"
                    >
                      <div
                        class="w-1/2 h-full rounded bg-surface-container p-space-xs flex flex-col justify-between"
                      >
                        <span class="w-6 h-2 rounded bg-primary"></span>
                        <div class="h-10 rounded bg-surface-container-high"></div>
                      </div>
                      <div
                        class="w-1/2 h-full rounded bg-inverse-surface p-space-xs flex flex-col justify-between"
                      >
                        <span class="w-6 h-2 rounded bg-inverse-primary"></span>
                        <div class="h-10 rounded bg-on-surface-variant/30"></div>
                      </div>
                    </div>
                    <div class="flex items-start justify-between gap-space-sm">
                      <div>
                        <span class="font-title-md text-title-md text-on-surface block"
                          >System</span
                        >
                        <span class="font-body-sm text-body-sm text-on-surface-variant"
                          >OS Auto-Sync</span
                        >
                      </div>
                      <span
                        class="theme-badge hidden font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-space-xs rounded bg-primary text-on-primary"
                        >Active</span
                      >
                    </div>
                  </button>
                </div>
              </div>
              <div
                class="bg-surface-container rounded-xl p-space-lg shadow-md flex flex-col gap-space-lg"
              >
                <div class="flex items-center justify-between gap-space-md">
                  <div>
                    <h2 class="font-headline-sm text-headline-sm text-on-surface">
                      Language &amp; Notation
                    </h2>
                    <p class="font-body-sm text-body-sm text-on-surface-variant mt-space-xs">
                      Choose your preferred interface language for tournament rules, clocks, and PGN
                      annotations.
                    </p>
                  </div>
                  <span
                    class="material-symbols-outlined text-outline text-[22px]"
                    aria-hidden="true"
                    >translate</span
                  >
                </div>
                <div
                  class="grid grid-cols-1 md:grid-cols-3 gap-space-md"
                  id="language-selector-grid"
                >
                  <button
                    class="lang-card flex items-center justify-between p-space-md rounded-xl bg-surface-container-high text-on-surface shadow-md transition-all hover:bg-surface-bright focus:outline-none"
                    data-lang-card="en"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <div class="flex items-center gap-space-md min-w-0">
                      <div
                        class="w-10 h-10 rounded-lg bg-primary text-on-primary flex items-center justify-center shrink-0"
                      >
                        <span class="font-label-numeric-md text-label-numeric-md">EN</span>
                      </div>
                      <div class="text-left min-w-0">
                        <span class="font-title-md text-title-md text-on-surface block truncate"
                          >English</span
                        >
                        <span
                          class="font-body-sm text-body-sm text-on-surface-variant block truncate"
                          >International (FIDE)</span
                        >
                      </div>
                    </div>
                    <span
                      class="lang-check material-symbols-outlined text-primary text-[22px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >check_circle</span
                    >
                  </button>
                  <button
                    class="lang-card flex items-center justify-between p-space-md rounded-xl bg-surface-container-low text-on-surface shadow-sm transition-all hover:bg-surface-container-high focus:outline-none"
                    data-lang-card="fr"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <div class="flex items-center gap-space-md min-w-0">
                      <div
                        class="w-10 h-10 rounded-lg bg-surface-container-highest text-on-surface-variant flex items-center justify-center shrink-0"
                      >
                        <span class="font-label-numeric-md text-label-numeric-md">FR</span>
                      </div>
                      <div class="text-left min-w-0">
                        <span class="font-title-md text-title-md text-on-surface block truncate"
                          >French</span
                        >
                        <span
                          class="font-body-sm text-body-sm text-on-surface-variant block truncate"
                          >Français</span
                        >
                      </div>
                    </div>
                    <span
                      class="lang-check hidden material-symbols-outlined text-primary text-[22px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >check_circle</span
                    >
                  </button>
                  <button
                    class="lang-card flex items-center justify-between p-space-md rounded-xl bg-surface-container-low text-on-surface shadow-sm transition-all hover:bg-surface-container-high focus:outline-none"
                    data-lang-card="ar"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <div class="flex items-center gap-space-md min-w-0">
                      <div
                        class="w-10 h-10 rounded-lg bg-surface-container-highest text-on-surface-variant flex items-center justify-center shrink-0"
                      >
                        <span class="font-label-numeric-md text-label-numeric-md">AR</span>
                      </div>
                      <div class="text-left min-w-0">
                        <span class="font-title-md text-title-md text-on-surface block truncate"
                          >Arabic</span
                        >
                        <span
                          class="font-body-sm text-body-sm text-on-surface-variant block truncate"
                          >العربية</span
                        >
                      </div>
                    </div>
                    <span
                      class="lang-check hidden material-symbols-outlined text-primary text-[22px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >check_circle</span
                    >
                  </button>
                </div>
              </div>
              <div
                class="flex flex-col sm:flex-row items-center justify-between gap-space-md bg-surface-container-low rounded-xl p-space-lg shadow-sm"
              >
                <div
                  class="flex items-center gap-space-sm text-on-surface-variant"
                  id="save-status-feedback"
                >
                  <span
                    class="material-symbols-outlined text-[18px] text-primary"
                    aria-hidden="true"
                    >info</span
                  >
                  <span class="font-body-sm text-body-sm"
                    >Changes apply immediately to your local ChessHub terminal upon saving.</span
                  >
                </div>
                <button
                  class="w-full sm:w-auto px-space-xl py-space-sm rounded-lg bg-primary-container hover:bg-primary text-on-primary font-title-md text-body-md shadow-md transition-all flex items-center justify-center gap-space-sm"
                  id="save-preferences-btn"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true">save</span>
                  <span>Save Preferences</span>
                </button>
              </div>
            </section>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
