<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
import SettingsContextBar from '../../components/navigation/SettingsContextBar.vue'
import SettingsSidebar from '../../components/navigation/SettingsSidebar.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <div class="w-full px-margin pb-space-xl md:px-margin-desktop">
          <SettingsContextBar />
          <div class="grid grid-cols-1 items-start gap-space-lg lg:grid-cols-12">
            <SettingsSidebar />
            <section class="min-w-0 space-y-space-xl lg:col-span-9">
              <div
                class="app-panel relative flex flex-col justify-between gap-space-lg overflow-hidden p-space-lg md:flex-row md:items-center"
              >
                <div
                  class="absolute inset-0 bg-gradient-to-br from-primary/5 via-transparent to-transparent pointer-events-none"
                ></div>
                <div class="relative z-10 space-y-space-xs">
                  <div class="flex items-center gap-space-sm">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-primary"
                      >Communications</span
                    >
                    <span class="text-outline">/</span>
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      >Match &amp; Event Alerts</span
                    >
                  </div>
                  <h1 class="app-page-title">
                    Notification Preferences
                  </h1>
                  <p class="font-body-md text-body-md text-on-surface-variant max-w-2xl">
                    Configure how ChessHub delivers tournament pairings, round countdowns, validated
                    FIDE result slips, and masterclass schedule updates.
                  </p>
                </div>
                <div
                  class="relative z-10 flex items-center gap-space-md bg-surface-container rounded-xl px-space-lg py-space-md shadow-sm shrink-0"
                >
                  <div class="space-y-0.5">
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline block"
                      >7-Day Volume</span
                    >
                    <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface block"
                      >28 Alerts</span
                    >
                  </div>
                  <svg
                    aria-hidden="true"
                    class="text-primary shrink-0"
                    fill="none"
                    height="32"
                    viewBox="0 0 72 32"
                    width="72"
                  >
                    <path
                      d="M2 26L14 20L26 23L38 11L50 15L62 6L70 9"
                      stroke="currentColor"
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      stroke-width="2"
                    ></path>
                    <circle cx="70" cy="9" fill="currentColor" r="3"></circle>
                  </svg>
                </div>
              </div>
              <div
                class="app-panel relative overflow-hidden p-space-lg"
              >
                <div
                  class="absolute inset-0 bg-gradient-to-r from-primary/10 via-transparent to-transparent pointer-events-none"
                ></div>
                <div
                  class="relative z-10 flex flex-col sm:flex-row sm:items-center justify-between gap-space-md"
                >
                  <div class="flex items-start gap-space-md">
                    <div
                      class="w-11 h-11 rounded-xl bg-primary/15 text-primary flex items-center justify-center shrink-0"
                    >
                      <span class="material-symbols-outlined text-[24px]" aria-hidden="true"
                        >mail</span
                      >
                    </div>
                    <div class="space-y-space-xs">
                      <div class="flex items-center gap-space-sm">
                        <h3 class="font-headline-sm text-headline-sm text-on-surface">
                          Email Notifications
                        </h3>
                        <span
                          class="font-label-badge text-label-badge uppercase px-space-sm py-0.5 rounded-full bg-primary/15 text-primary"
                          id="email-master-badge"
                          >Active</span
                        >
                      </div>
                      <p class="font-body-md text-body-md text-on-surface-variant">
                        Master toggle for all outbound email dispatches to
                        <span class="text-on-surface font-medium">gm.player@chesshub.org</span>.
                      </p>
                    </div>
                  </div>
                  <button
                    aria-checked="true"
                    class="toggle-switch relative inline-flex h-7 w-12 shrink-0 cursor-pointer rounded-full bg-primary p-1 transition-colors duration-200 ease-in-out focus:outline-none"
                    data-toggle="email-master"
                    id="toggle-email-master"
                    role="switch"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="sr-only">Toggle Email Notifications</span>
                    <span
                      class="toggle-thumb pointer-events-none inline-block h-5 w-5 transform rounded-full bg-on-primary shadow-sm transition duration-200 ease-in-out translate-x-5"
                    ></span>
                  </button>
                </div>
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-lg">
                <div
                  class="app-panel flex flex-col justify-between gap-space-lg p-space-lg"
                >
                  <div class="flex items-start gap-space-md">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high text-primary flex items-center justify-center shrink-0"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >swords</span
                      >
                    </div>
                    <div class="space-y-space-xs">
                      <h3 class="font-title-md text-title-md text-on-surface">
                        Match Invitation Preferences
                      </h3>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Direct challenges, Swiss round pairings, and private club match requests.
                      </p>
                    </div>
                  </div>
                  <div class="space-y-space-md bg-surface-container-low rounded-lg p-space-md">
                    <div class="flex items-center justify-between gap-space-md">
                      <div class="min-w-0">
                        <span class="font-body-md text-body-md text-on-surface block truncate"
                          >In-app Alerts</span
                        >
                        <span class="font-body-sm text-body-sm text-outline block truncate"
                          >Instant terminal banner &amp; sound</span
                        >
                      </div>
                      <button
                        aria-checked="true"
                        class="toggle-switch relative inline-flex h-6 w-11 shrink-0 cursor-pointer rounded-full bg-primary p-0.5 transition-colors duration-200 ease-in-out focus:outline-none"
                        data-toggle="invite-inapp"
                        role="switch"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="sr-only">In-app match invitations</span>
                        <span
                          class="toggle-thumb pointer-events-none inline-block h-5 w-5 transform rounded-full bg-on-primary shadow-sm transition duration-200 ease-in-out translate-x-5"
                        ></span>
                      </button>
                    </div>
                    <div class="flex items-center justify-between gap-space-md email-dependent">
                      <div class="min-w-0">
                        <span class="font-body-md text-body-md text-on-surface block truncate"
                          >Email Dispatch</span
                        >
                        <span class="font-body-sm text-body-sm text-outline block truncate"
                          >Pairing sheet &amp; accept link</span
                        >
                      </div>
                      <button
                        aria-checked="true"
                        class="toggle-switch relative inline-flex h-6 w-11 shrink-0 cursor-pointer rounded-full bg-primary p-0.5 transition-colors duration-200 ease-in-out focus:outline-none"
                        data-toggle="invite-email"
                        role="switch"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="sr-only">Email match invitations</span>
                        <span
                          class="toggle-thumb pointer-events-none inline-block h-5 w-5 transform rounded-full bg-on-primary shadow-sm transition duration-200 ease-in-out translate-x-5"
                        ></span>
                      </button>
                    </div>
                  </div>
                </div>
                <div
                  class="app-panel flex flex-col justify-between gap-space-lg p-space-lg"
                >
                  <div class="flex items-start gap-space-md">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high text-primary flex items-center justify-center shrink-0"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >timer</span
                      >
                    </div>
                    <div class="space-y-space-xs">
                      <h3 class="font-title-md text-title-md text-on-surface">
                        Match Reminder Preferences
                      </h3>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Pre-round clock warnings to prevent forfeit penalties on classical boards.
                      </p>
                    </div>
                  </div>
                  <div class="space-y-space-md bg-surface-container-low rounded-lg p-space-md">
                    <div class="flex items-center justify-between gap-space-md">
                      <div class="min-w-0">
                        <span class="font-body-md text-body-md text-on-surface block truncate"
                          >24 Hours Before Match</span
                        >
                        <span class="font-body-sm text-body-sm text-outline block truncate"
                          >Opponent prep &amp; board number</span
                        >
                      </div>
                      <button
                        aria-checked="true"
                        class="toggle-switch relative inline-flex h-6 w-11 shrink-0 cursor-pointer rounded-full bg-primary p-0.5 transition-colors duration-200 ease-in-out focus:outline-none"
                        data-toggle="reminder-24h"
                        role="switch"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="sr-only">24 hours before match reminder</span>
                        <span
                          class="toggle-thumb pointer-events-none inline-block h-5 w-5 transform rounded-full bg-on-primary shadow-sm transition duration-200 ease-in-out translate-x-5"
                        ></span>
                      </button>
                    </div>
                    <div class="flex items-center justify-between gap-space-md">
                      <div class="min-w-0">
                        <span class="font-body-md text-body-md text-on-surface block truncate"
                          >1 Hour Before Match</span
                        >
                        <span class="font-body-sm text-body-sm text-outline block truncate"
                          >Final check-in &amp; live board link</span
                        >
                      </div>
                      <button
                        aria-checked="true"
                        class="toggle-switch relative inline-flex h-6 w-11 shrink-0 cursor-pointer rounded-full bg-primary p-0.5 transition-colors duration-200 ease-in-out focus:outline-none"
                        data-toggle="reminder-1h"
                        role="switch"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="sr-only">1 hour before match reminder</span>
                        <span
                          class="toggle-thumb pointer-events-none inline-block h-5 w-5 transform rounded-full bg-on-primary shadow-sm transition duration-200 ease-in-out translate-x-5"
                        ></span>
                      </button>
                    </div>
                  </div>
                </div>
                <div
                  class="app-panel flex flex-col justify-between gap-space-lg p-space-lg"
                >
                  <div class="flex items-start gap-space-md">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high text-primary flex items-center justify-center shrink-0"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >verified</span
                      >
                    </div>
                    <div class="space-y-space-xs">
                      <h3 class="font-title-md text-title-md text-on-surface">
                        Match Result Preferences
                      </h3>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Official match points and arbiter-signed PGN archival notifications.
                      </p>
                    </div>
                  </div>
                  <div class="space-y-space-md bg-surface-container-low rounded-lg p-space-md">
                    <div class="flex items-center justify-between gap-space-md">
                      <div class="min-w-0">
                        <span class="font-body-md text-body-md text-on-surface block truncate"
                          >Official Results Validated</span
                        >
                        <span class="font-body-sm text-body-sm text-outline block truncate"
                          >Notify when arbiter signs score</span
                        >
                      </div>
                      <button
                        aria-checked="true"
                        class="toggle-switch relative inline-flex h-6 w-11 shrink-0 cursor-pointer rounded-full bg-primary p-0.5 transition-colors duration-200 ease-in-out focus:outline-none"
                        data-toggle="result-validated"
                        role="switch"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="sr-only">When official results are validated</span>
                        <span
                          class="toggle-thumb pointer-events-none inline-block h-5 w-5 transform rounded-full bg-on-primary shadow-sm transition duration-200 ease-in-out translate-x-5"
                        ></span>
                      </button>
                    </div>
                  </div>
                </div>
                <div
                  class="app-panel flex flex-col justify-between gap-space-lg p-space-lg"
                >
                  <div class="flex items-start gap-space-md">
                    <div
                      class="w-10 h-10 rounded-lg bg-surface-container-high text-primary flex items-center justify-center shrink-0"
                    >
                      <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                        >event_available</span
                      >
                    </div>
                    <div class="space-y-space-xs">
                      <h3 class="font-title-md text-title-md text-on-surface">
                        Event &amp; Workshop Preferences
                      </h3>
                      <p class="font-body-sm text-body-sm text-on-surface-variant">
                        Grandmaster clinics, endgame labs, and seasonal Swiss schedule changes.
                      </p>
                    </div>
                  </div>
                  <div class="space-y-space-md bg-surface-container-low rounded-lg p-space-md">
                    <div class="flex items-center justify-between gap-space-md">
                      <div class="min-w-0">
                        <span class="font-body-md text-body-md text-on-surface block truncate"
                          >Reminders &amp; Schedule Updates</span
                        >
                        <span class="font-body-sm text-body-sm text-outline block truncate"
                          >Session start times &amp; room shifts</span
                        >
                      </div>
                      <button
                        aria-checked="false"
                        class="toggle-switch relative inline-flex h-6 w-11 shrink-0 cursor-pointer rounded-full bg-surface-container-highest p-0.5 transition-colors duration-200 ease-in-out focus:outline-none"
                        data-toggle="event-updates"
                        role="switch"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="sr-only"
                          >Event and workshop reminders and schedule updates</span
                        >
                        <span
                          class="toggle-thumb pointer-events-none inline-block h-5 w-5 transform rounded-full bg-on-surface-variant shadow-sm transition duration-200 ease-in-out translate-x-0"
                        ></span>
                      </button>
                    </div>
                  </div>
                </div>
              </div>
              <div
                class="bg-surface-container-low rounded-xl p-space-lg shadow-md flex flex-col sm:flex-row items-center justify-between gap-space-md"
              >
                <div class="flex items-center gap-space-sm">
                  <span class="w-2.5 h-2.5 rounded-full bg-primary" id="save-status-dot"></span>
                  <span
                    class="font-body-sm text-body-sm text-on-surface-variant"
                    id="save-status-text"
                    >All notification preferences are synchronized.</span
                  >
                </div>
                <div class="flex items-center gap-space-md w-full sm:w-auto justify-end">
                  <button
                    class="px-space-lg py-space-sm rounded-lg bg-surface-container-high text-on-surface font-title-md text-body-md hover:bg-surface-bright transition-colors"
                    id="reset-prefs-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Reset
                  </button>
                  <button
                    class="px-space-xl py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-body-md hover:bg-primary-fixed-dim transition-colors flex items-center gap-space-sm shadow-sm"
                    id="save-prefs-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >check_circle</span
                    >
                    <span>Save Preferences</span>
                  </button>
                </div>
              </div>
            </section>
          </div>
        </div>
        <div
          class="fixed bottom-6 right-6 z-50 hidden items-center gap-space-sm bg-surface-container-highest text-on-surface px-space-lg py-space-md rounded-xl shadow-xl"
          id="toast-notification"
        >
          <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
            >check_circle</span
          >
          <span class="font-body-md text-body-md">Notification preferences saved.</span>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
