<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
import SettingsContextBar from '../../components/navigation/SettingsContextBar.vue'
import SettingsSidebar from '../../components/navigation/SettingsSidebar.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin md:px-margin-desktop">
      <div class="flex flex-col w-full pb-space-xl">
        <SettingsContextBar />
        <div class="grid grid-cols-1 items-start gap-space-lg lg:grid-cols-12">
          <SettingsSidebar />
          <div class="flex min-w-0 flex-col gap-space-lg lg:col-span-9">
            <!-- Section Title & Meta Header -->
            <div
              class="app-panel flex flex-col justify-between gap-space-sm p-space-lg sm:flex-row sm:items-end"
            >
              <div>
                <div class="flex items-center gap-space-xs mb-1">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >manage_accounts</span
                  >
                  <span
                    class="font-label-badge text-label-badge text-primary uppercase tracking-widest"
                    >Federation Master Config</span
                  >
                </div>
                <h1 class="app-page-title">
                  Account Settings
                </h1>
                <p class="font-body-md text-body-md text-on-surface-variant mt-1">
                  Manage your public identity, security credentials, and club preferences.
                </p>
              </div>
              <div class="flex items-center gap-space-sm">
                <span class="font-body-sm text-body-sm text-on-surface-variant"
                  >Profile completeness:</span
                >
                <div class="w-24 bg-surface-container-highest h-2 rounded-full overflow-hidden">
                  <div class="bg-primary h-full rounded-full" style="width: 88%"></div>
                </div>
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface">88%</span>
              </div>
            </div>
            <!-- Module 1: Profile & Identity Specification -->
            <section
              class="app-panel flex flex-col gap-space-lg p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >id_card</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    Player Identity &amp; Bio
                  </h2>
                </div>
                <div
                  class="flex items-center gap-space-xs bg-surface-container-high px-space-sm py-1 rounded-lg"
                >
                  <span
                    class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                    >Club Registration:</span
                  >
                  <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                    >CH-2044</span
                  >
                </div>
              </div>
              <!-- Avatar Media Manager -->
              <div
                class="flex flex-col sm:flex-row sm:items-center gap-space-lg bg-surface-container rounded-xl p-space-md"
              >
                <div
                  class="relative w-20 h-20 rounded-xl overflow-hidden bg-surface-container-highest shrink-0 shadow-md"
                >
                  <img
                    class="w-full h-full object-cover"
                    data-alt="Close up sharp square portrait of Hispanic male chess player Alex Rivera in dark tournament hall, subtle green ambient light, intense analytical gaze"
                    id="avatarPreview"
                    src="/images/b6484caccaf1.webp"
                    alt=""
                  />
                  <div
                    class="absolute inset-0 bg-surface-container-lowest/30 opacity-0 hover:opacity-100 transition-opacity flex items-center justify-center cursor-pointer"
                  >
                    <span
                      class="material-symbols-outlined text-on-surface text-[22px]"
                      aria-hidden="true"
                      >photo_camera</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs grow">
                  <div class="flex items-center gap-space-sm">
                    <span class="font-title-md text-title-md text-on-surface"
                      >Official FIDE Photo</span
                    >
                    <span class="font-label-badge text-label-badge text-on-surface-variant"
                      >PNG, JPG up to 4MB</span
                    >
                  </div>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">
                    This badge portrait will be broadcast on tournament stream overlays, round
                    pairings, and public arbiter lists.
                  </p>
                  <div class="flex items-center gap-space-sm pt-space-xs">
                    <label
                      class="cursor-pointer px-space-md py-space-xs rounded-lg bg-surface-container-highest hover:bg-surface-bright text-on-surface font-title-md text-title-md transition-colors flex items-center gap-space-xs"
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >upload_file</span
                      >
                      <span>Change Avatar</span>
                      <input accept="image/*" class="hidden" type="file" />
                    </label>
                    <button
                      class="px-space-md py-space-xs rounded-lg text-error hover:bg-error-container/20 font-body-md text-body-md transition-colors"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Remove
                    </button>
                  </div>
                </div>
              </div>
              <!-- Form Rows: 2-Column Mesh -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <!-- First Name -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                    >First Name</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-body-lg text-body-lg focus:outline-none focus:bg-surface-container-high transition-colors shadow-inner"
                      type="text"
                      value="Alex"
                    />
                    <span
                      class="material-symbols-outlined absolute right-3 top-3 text-[18px] text-outline"
                      aria-hidden="true"
                      >person</span
                    >
                  </div>
                </div>
                <!-- Last Name -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                    >Last Name</label
                  >
                  <div class="relative">
                    <input
                      class="w-full bg-surface-container rounded-lg px-space-md py-space-sm text-on-surface font-body-lg text-body-lg focus:outline-none focus:bg-surface-container-high transition-colors shadow-inner"
                      type="text"
                      value="Rivera"
                    />
                    <span
                      class="material-symbols-outlined absolute right-3 top-3 text-[18px] text-outline"
                      aria-hidden="true"
                      >badge</span
                    >
                  </div>
                </div>
                <!-- Username -->
                <div class="flex flex-col gap-space-xs">
                  <div class="flex items-center justify-between">
                    <label
                      class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                      >Handle</label
                    >
                    <span class="font-label-badge text-label-badge text-primary"
                      >Federation Validated</span
                    >
                  </div>
                  <div class="relative flex items-center">
                    <span
                      class="absolute left-3 font-label-numeric-md text-label-numeric-md text-outline"
                      >@</span
                    >
                    <input
                      class="w-full bg-surface-container rounded-lg pl-8 pr-space-md py-space-sm text-on-surface font-body-lg text-body-lg focus:outline-none focus:bg-surface-container-high transition-colors shadow-inner"
                      type="text"
                      value="alex_rivera"
                    />
                  </div>
                </div>
                <!-- Experience Tier Segmented Selector -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                    >Experience Level</label
                  >
                  <div class="grid grid-cols-3 bg-surface-container p-1 rounded-lg gap-1">
                    <button
                      class="py-space-xs rounded font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high transition-colors text-center"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Beginner
                    </button>
                    <button
                      class="py-space-xs rounded font-title-md text-title-md bg-surface-container-high text-primary shadow-sm text-center flex items-center justify-center gap-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span>Intermediate</span>
                      <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                    </button>
                    <button
                      class="py-space-xs rounded font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high transition-colors text-center"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Advanced
                    </button>
                  </div>
                </div>
              </div>
              <!-- Bio Textarea -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label
                    class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                    >Tactical Bio &amp; Preferred Repertoire</label
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant"
                    >68 / 240 chars</span
                  >
                </div>
                <textarea
                  class="w-full bg-surface-container rounded-lg p-space-md text-on-surface font-body-md text-body-md focus:outline-none focus:bg-surface-container-high transition-colors resize-none shadow-inner"
                  rows="3"
                >
Active club player focusing on English Opening and tactical endgames.</textarea>
              </div>
            </section>
            <!-- Module 2: Security Quick View & 2FA Engine -->
            <section
              class="app-panel flex flex-col gap-space-md p-space-lg"
              id="security"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >security</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    Security &amp; Credentials
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-secondary bg-surface-container-high px-space-sm py-1 rounded"
                  >Vault Protected</span
                >
              </div>
              <div class="grid grid-cols-1 md:grid-cols-3 gap-space-md">
                <!-- Email Block -->
                <div
                  class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between gap-space-sm"
                >
                  <div class="flex items-center justify-between">
                    <span
                      class="font-label-badge text-label-badge text-on-surface-variant uppercase"
                      >Federation Email</span
                    >
                    <span
                      class="flex items-center gap-1 font-label-badge text-label-badge text-primary bg-primary/10 px-1.5 py-0.5 rounded"
                    >
                      <span class="material-symbols-outlined text-[12px]" aria-hidden="true"
                        >verified</span
                      >
                      Verified
                    </span>
                  </div>
                  <div class="flex flex-col">
                    <span class="font-title-md text-title-md text-on-surface truncate"
                      >alex.rivera@example.com</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Primary arbiter communications</span
                    >
                  </div>
                  <button
                    class="text-left font-body-sm text-body-sm text-primary hover:underline"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Update Email Address
                  </button>
                </div>
                <!-- Password Block -->
                <div
                  class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between gap-space-sm"
                >
                  <div class="flex items-center justify-between">
                    <span
                      class="font-label-badge text-label-badge text-on-surface-variant uppercase"
                      >Master Password</span
                    >
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >key</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <span class="font-title-md text-title-md text-on-surface tracking-widest"
                      >••••••••••••</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Last changed 3 months ago</span
                    >
                  </div>
                  <button
                    class="text-left font-body-sm text-body-sm text-primary hover:underline"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Modify Passphrase
                  </button>
                </div>
                <!-- Two-Factor Authentication Interactive Toggle -->
                <div
                  class="bg-surface-container p-space-md rounded-xl flex flex-col justify-between gap-space-sm"
                >
                  <div class="flex items-center justify-between">
                    <span
                      class="font-label-badge text-label-badge text-on-surface-variant uppercase"
                      >Two-Factor (TOTP)</span
                    >
                    <span
                      class="px-1.5 py-0.5 rounded font-label-badge text-label-badge bg-primary/20 text-primary"
                      >Active</span
                    >
                  </div>
                  <div class="flex items-center justify-between">
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface"
                        >FIDE Authenticator</span
                      >
                      <span class="font-body-sm text-body-sm text-on-surface-variant"
                        >Required for cash brackets</span
                      >
                    </div>
                    <!-- Pure CSS Interactive Toggle Switch -->
                    <label class="relative inline-flex items-center cursor-pointer">
                      <input checked class="sr-only peer" id="twoFactorToggle" type="checkbox" />
                      <div
                        class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-surface after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-on-surface after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary-container peer-checked:after:bg-on-primary"
                      ></div>
                    </label>
                  </div>
                  <span class="font-body-sm text-body-sm text-secondary"
                    >Hardware key backup registered</span
                  >
                </div>
              </div>
            </section>
            <!-- Module 3: Match & Club Notification Dispatch Rules -->
            <section
              class="app-panel flex flex-col gap-space-md p-space-lg"
              id="notifications"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >campaign</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    Notification Preferences
                  </h2>
                </div>
                <span class="font-body-sm text-body-sm text-on-surface-variant"
                  >Push &amp; Digest Routing</span
                >
              </div>
              <div class="flex flex-col divide-y divide-surface-container-highest">
                <!-- Item 1: Match Invitations -->
                <div
                  class="py-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-sm first:pt-0"
                >
                  <div class="flex flex-col">
                    <span class="font-title-md text-title-md text-on-surface"
                      >Match Invitations &amp; Pairing Alerts</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Instant push triggers when an arbiter finalizes Swiss or Round Robin pairings
                      (Email + In-App).</span
                    >
                  </div>
                  <label class="relative inline-flex items-center cursor-pointer shrink-0">
                    <input checked class="sr-only peer" type="checkbox" />
                    <div
                      class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-on-surface after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary-container peer-checked:after:bg-on-primary"
                    ></div>
                  </label>
                </div>
                <!-- Item 2: Match Result Validation -->
                <div
                  class="py-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-sm"
                >
                  <div class="flex flex-col">
                    <span class="font-title-md text-title-md text-on-surface"
                      >Match Result Validation Alerts</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Notifies when your opponent registers scorecards or flags for draw
                      verification.</span
                    >
                  </div>
                  <label class="relative inline-flex items-center cursor-pointer shrink-0">
                    <input checked class="sr-only peer" type="checkbox" />
                    <div
                      class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-on-surface after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary-container peer-checked:after:bg-on-primary"
                    ></div>
                  </label>
                </div>
                <!-- Item 3: Club Event Updates -->
                <div
                  class="py-space-md flex flex-col sm:flex-row sm:items-center justify-between gap-space-sm last:pb-0"
                >
                  <div class="flex flex-col">
                    <span class="font-title-md text-title-md text-on-surface"
                      >Club Event Updates &amp; Workshops</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Invitations to masterclasses, live blitz arenas, and monthly grandmaster
                      lectures.</span
                    >
                  </div>
                  <label class="relative inline-flex items-center cursor-pointer shrink-0">
                    <input class="sr-only peer" type="checkbox" />
                    <div
                      class="w-11 h-6 bg-surface-container-highest peer-focus:outline-none rounded-full peer peer-checked:after:translate-x-full after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-on-surface after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-primary-container peer-checked:after:bg-on-primary"
                    ></div>
                  </label>
                </div>
              </div>
            </section>
            <!-- Module 4: Appearance & Language Configuration -->
            <section
              class="app-panel flex flex-col gap-space-md p-space-lg"
              id="appearance"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >display_settings</span
                  >
                  <h2 class="font-headline-sm text-headline-sm text-on-surface">
                    Appearance &amp; Localization
                  </h2>
                </div>
                <span class="font-label-badge text-label-badge text-outline">Engine Display</span>
              </div>
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-lg">
                <!-- Theme Selector -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                    >Visual Interface Theme</label
                  >
                  <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-sm">
                    <!-- Dark Mode Option (Active) -->
                    <div
                      class="bg-surface-container-high p-space-sm rounded-lg flex items-center justify-between cursor-pointer shadow-sm"
                    >
                      <div class="flex items-center gap-space-sm">
                        <div
                          class="w-8 h-8 rounded bg-surface-container-lowest flex items-center justify-center text-primary"
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >dark_mode</span
                          >
                        </div>
                        <div class="flex flex-col">
                          <span class="font-title-md text-title-md text-on-surface"
                            >Grandmaster Dark</span
                          >
                          <span class="font-body-sm text-body-sm text-primary"
                            >Default &amp; Active</span
                          >
                        </div>
                      </div>
                      <span
                        class="material-symbols-outlined text-primary text-[20px]"
                        aria-hidden="true"
                        >check_circle</span
                      >
                    </div>
                    <!-- Tournament Classic Option (Inactive) -->
                    <div
                      class="bg-surface-container p-space-sm rounded-lg flex items-center justify-between opacity-50 cursor-not-allowed"
                    >
                      <div class="flex items-center gap-space-sm">
                        <div
                          class="w-8 h-8 rounded bg-surface-container-highest flex items-center justify-center text-on-surface-variant"
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >wb_sunny</span
                          >
                        </div>
                        <div class="flex flex-col">
                          <span class="font-title-md text-title-md text-on-surface"
                            >Tournament Light</span
                          >
                          <span class="font-body-sm text-body-sm text-on-surface-variant"
                            >Daylight Halls</span
                          >
                        </div>
                      </div>
                      <span
                        class="material-symbols-outlined text-outline-variant text-[20px]"
                        aria-hidden="true"
                        >lock</span
                      >
                    </div>
                  </div>
                </div>
                <!-- Language Selector -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                    >Notation &amp; UI Language</label
                  >
                  <div class="grid grid-cols-3 bg-surface-container p-1 rounded-lg gap-1">
                    <button
                      class="py-space-xs rounded font-title-md text-title-md bg-surface-container-high text-primary shadow-sm text-center flex items-center justify-center gap-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span>English</span>
                      <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                    </button>
                    <button
                      class="py-space-xs rounded font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high transition-colors text-center"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      Français
                    </button>
                    <button
                      class="py-space-xs rounded font-title-md text-title-md text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high transition-colors text-center"
                      dir="rtl"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      العربية
                    </button>
                  </div>
                  <span class="font-body-sm text-body-sm text-on-surface-variant mt-1"
                    >PGN algebraic pieces will automatically localize to selected regional
                    standard.</span
                  >
                </div>
              </div>
            </section>
            <!-- Action Confirmation Strip -->
            <div
              class="bg-surface-container-low rounded-xl p-space-md flex flex-col sm:flex-row items-center justify-between gap-space-md shadow-sm"
            >
              <div
                class="flex items-center gap-space-sm text-on-surface-variant font-body-sm text-body-sm"
              >
                <span class="material-symbols-outlined text-primary text-[18px]" aria-hidden="true"
                  >verified_user</span
                >
                <span
                  >Changes will sync instantly to FIDE Arbiter Live Desk and pairing nodes.</span
                >
              </div>
              <div class="flex items-center gap-space-sm w-full sm:w-auto justify-end">
                <button
                  class="px-space-lg py-space-sm rounded-lg bg-surface-container hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors"
                  id="cancelBtn"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Cancel
                </button>
                <button
                  class="app-action-primary px-space-xl"
                  id="saveBtn"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true">save</span>
                  <span>Save Changes</span>
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
