<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout>
    <main class="w-full pt-16 bg-surface px-margin-desktop">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Top Utility Context Bar -->
        <div
          class="flex flex-col md:flex-row md:items-center justify-between gap-space-md py-space-lg"
        >
          <div
            class="flex items-center gap-space-sm text-on-surface-variant font-body-sm text-body-sm"
          >
            <span class="material-symbols-outlined text-[18px]" aria-hidden="true">chess</span>
            <span>Federation Portal</span>
            <span class="text-outline-variant">/</span>
            <span class="text-on-surface font-title-md text-title-md">Player Configuration</span>
            <span class="text-outline-variant">/</span>
            <span
              class="px-space-xs py-0.5 rounded bg-surface-container-high text-primary font-label-badge text-label-badge uppercase tracking-wider"
              >CH-2044</span
            >
          </div>
          <!-- Rating & Status Monospace Capsule -->
          <div
            class="flex items-center gap-space-md self-start md:self-auto bg-surface-container-low px-space-md py-space-xs rounded-xl shadow-sm"
          >
            <div class="flex items-center gap-space-xs">
              <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
              <span
                class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                >FIDE Blitz</span
              >
              <span class="font-label-numeric-md text-label-numeric-md text-on-surface">2148</span>
            </div>
            <div class="h-3 w-px bg-surface-container-highest"></div>
            <div class="flex items-center gap-space-xs">
              <span
                class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                >Sync State</span
              >
              <span class="font-label-numeric-md text-label-numeric-md text-secondary"
                >Verified</span
              >
            </div>
          </div>
        </div>
        <!-- Master Layout: 12-Column Spatial Distribution -->
        <div class="grid grid-cols-12 gap-space-lg items-start">
          <!-- LEFT: Settings Sidebar Column (3 cols) -->
          <aside class="col-span-12 lg:col-span-3 flex flex-col gap-space-md">
            <!-- Player Mini-Card Navigation Header -->
            <div
              class="bg-surface-container-low rounded-xl p-space-md flex items-center gap-space-md shadow-sm"
            >
              <div
                class="relative w-12 h-12 rounded-xl overflow-hidden bg-surface-container-high shrink-0 shadow-inner"
              >
                <img
                  class="w-full h-full object-cover"
                  data-alt="Moody cinematic portrait of a competitive grandmaster looking intensely sideways against dark studio lighting with soft verdant rim highlights, ultra-sharp detail"
                  src="/images/3b19de57057c.webp"
                  alt=""
                />
                <div class="absolute bottom-0 right-0 w-3 h-3 bg-primary rounded-full"></div>
              </div>
              <div class="flex flex-col min-w-0">
                <div class="flex items-center gap-space-xs">
                  <span class="font-title-md text-title-md text-on-surface truncate"
                    >Alex Rivera</span
                  >
                  <span
                    class="px-1.5 py-0.2 rounded bg-surface-container-highest text-primary font-label-badge text-label-badge uppercase"
                    >FM</span
                  >
                </div>
                <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                  >@alex_rivera</span
                >
              </div>
            </div>
            <!-- Navigation Tabs -->
            <nav
              class="bg-surface-container-low rounded-xl p-space-xs flex flex-col gap-1 shadow-sm"
            >
              <RouterLink
                class="flex items-center justify-between px-space-md py-space-sm rounded-lg bg-surface-container text-primary font-title-md text-title-md transition-all"
                to="/settings"
              >
                <div class="flex items-center gap-space-sm">
                  <span
                    class="material-symbols-outlined text-[20px]"
                    style="font-variation-settings: 'FILL' 1"
                    aria-hidden="true"
                    >tune</span
                  >
                  <span>General</span>
                </div>
                <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
              </RouterLink>
              <RouterLink
                class="flex items-center justify-between px-space-md py-space-sm rounded-lg text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-body-md text-body-md transition-all"
                to="/settings/profile"
              >
                <div class="flex items-center gap-space-sm">
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >badge</span
                  >
                  <span>Profile</span>
                </div>
                <span class="font-label-badge text-label-badge text-outline">Public</span>
              </RouterLink>
              <RouterLink
                class="flex items-center justify-between px-space-md py-space-sm rounded-lg text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-body-md text-body-md transition-all"
                to="/settings/security"
              >
                <div class="flex items-center gap-space-sm">
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >lock_clock</span
                  >
                  <span>Security</span>
                </div>
                <span class="w-2 h-2 rounded-full bg-secondary"></span>
              </RouterLink>
              <RouterLink
                class="flex items-center justify-between px-space-md py-space-sm rounded-lg text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-body-md text-body-md transition-all"
                to="/settings/notifications"
              >
                <div class="flex items-center gap-space-sm">
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >notifications_active</span
                  >
                  <span>Notifications</span>
                </div>
                <span
                  class="px-1.5 py-0.2 rounded-full bg-surface-container-highest text-on-surface font-label-badge text-label-badge"
                  >3</span
                >
              </RouterLink>
              <RouterLink
                class="flex items-center justify-between px-space-md py-space-sm rounded-lg text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-body-md text-body-md transition-all"
                to="/settings/appearance"
              >
                <div class="flex items-center gap-space-sm">
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >palette</span
                  >
                  <span>Appearance</span>
                </div>
                <span class="font-label-badge text-label-badge text-outline-variant">Dark</span>
              </RouterLink>
            </nav>
            <!-- Tactical Analytics Micro-Card -->
            <div
              class="bg-surface-container-low rounded-xl p-space-md flex flex-col gap-space-sm shadow-sm"
            >
              <div class="flex items-center justify-between">
                <span
                  class="font-label-badge text-label-badge text-on-surface-variant uppercase tracking-wider"
                  >Tournament Tier</span
                >
                <span class="text-primary font-label-badge text-label-badge">Swiss Master</span>
              </div>
              <div class="flex items-end justify-between pt-space-xs">
                <span class="font-headline-md text-headline-md text-on-surface">Round VII</span>
                <span class="font-label-numeric-md text-label-numeric-md text-primary"
                  >Completed</span
                >
              </div>
              <!-- Sparkline Visualization -->
              <div class="w-full h-8 pt-1">
                <svg
                  class="w-full h-full text-primary"
                  fill="none"
                  preserveAspectRatio="none"
                  viewBox="0 0 160 30"
                >
                  <path
                    d="M0 24 L25 18 L50 22 L75 12 L100 15 L125 7 L160 3"
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                  ></path>
                  <path
                    d="M0 24 L25 18 L50 22 L75 12 L100 15 L125 7 L160 3 L160 30 L0 30 Z"
                    fill="currentColor"
                    fill-opacity="0.1"
                  ></path>
                </svg>
              </div>
            </div>
          </aside>
          <!-- RIGHT: Configuration Engine (9 cols) -->
          <main class="col-span-12 lg:col-span-9 flex flex-col gap-space-lg">
            <!-- Section Title & Meta Header -->
            <div
              class="flex flex-col sm:flex-row sm:items-end justify-between gap-space-sm bg-surface-container-low p-space-lg rounded-xl shadow-sm"
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
                <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
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
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-lg"
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
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
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
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
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
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
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
                  <div class="grid grid-cols-2 gap-space-sm">
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
                  class="px-space-xl py-space-sm rounded-lg bg-primary-container hover:bg-primary text-on-primary-container font-title-md text-title-md transition-all shadow-md flex items-center gap-space-xs"
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
          </main>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
