<script setup lang="ts">
import ClubLayout from '../../components/layout/ClubLayout.vue'
</script>

<template>
  <ClubLayout academy>
    <main class="w-full pt-16 bg-surface min-h-[calc(100vh-16rem)]">
      <div class="flex flex-col w-full">
        <div class="w-full px-margin-desktop py-space-xl">
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop items-start">
            <aside
              class="lg:col-span-3 flex flex-col gap-space-sm bg-surface-container-low p-space-md rounded-xl shadow-md"
            >
              <div class="px-space-md pt-space-xs pb-space-sm">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-widest text-outline"
                  >Account Terminal</span
                >
              </div>
              <nav class="flex flex-col gap-space-xs">
                <RouterLink
                  class="flex items-center justify-between px-space-md py-space-sm rounded-lg bg-surface-container-highest text-primary shadow-sm"
                  to="/settings/profile"
                >
                  <div class="flex items-center gap-space-sm">
                    <span
                      class="material-symbols-outlined text-[20px]"
                      style="font-variation-settings: 'FILL' 1"
                      aria-hidden="true"
                      >person</span
                    >
                    <span class="font-title-md text-title-md">Profile</span>
                  </div>
                  <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                </RouterLink>
                <RouterLink
                  class="flex items-center gap-space-sm px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors"
                  to="/settings/security"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >shield_lock</span
                  >
                  <span class="font-title-md text-title-md">Security</span>
                </RouterLink>
                <RouterLink
                  class="flex items-center gap-space-sm px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors"
                  to="/settings/notifications"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >notifications_active</span
                  >
                  <span class="font-title-md text-title-md">Notifications</span>
                </RouterLink>
                <RouterLink
                  class="flex items-center gap-space-sm px-space-md py-space-sm rounded-lg text-on-surface-variant hover:bg-surface-container-high hover:text-on-surface transition-colors"
                  to="/settings/appearance"
                >
                  <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                    >palette</span
                  >
                  <span class="font-title-md text-title-md">Appearance</span>
                </RouterLink>
              </nav>
              <div
                class="mt-space-md p-space-md rounded-lg bg-surface-container flex flex-col gap-space-xs"
              >
                <div class="flex items-center justify-between">
                  <span class="font-label-badge text-label-badge uppercase text-outline"
                    >FIDE Sync</span
                  >
                  <span
                    class="font-label-badge text-label-badge text-primary bg-secondary-container px-space-sm py-space-xs rounded-full"
                    >VERIFIED</span
                  >
                </div>
                <p class="font-body-sm text-body-sm text-on-surface-variant">
                  Rating &amp; title updates sync every 24h with official federation records.
                </p>
              </div>
            </aside>
            <section class="lg:col-span-9 flex flex-col gap-space-lg">
              <div class="flex flex-col sm:flex-row sm:items-end justify-between gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-widest text-primary"
                    >01 / Player Dossier</span
                  >
                  <h2 class="font-headline-lg text-headline-lg text-on-surface">
                    Profile Settings
                  </h2>
                  <p class="font-body-md text-body-md text-on-surface-variant">
                    Manage your public tournament identity, biographical notes, and competitive
                    tier.
                  </p>
                </div>
                <div
                  class="hidden items-center gap-space-xs px-space-md py-space-xs rounded-full bg-secondary-container text-on-secondary-container font-label-badge text-label-badge"
                  id="save-status"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >check_circle</span
                  >
                  <span>CHANGES SAVED</span>
                </div>
              </div>
              <div
                class="bg-surface-container p-space-lg rounded-xl shadow-md flex flex-col sm:flex-row items-start sm:items-center justify-between gap-space-lg"
              >
                <div class="flex items-center gap-space-lg">
                  <div class="relative shrink-0">
                    <img
                      alt="Current profile avatar"
                      class="w-20 h-20 rounded-xl object-cover shadow-lg bg-surface-container-high"
                      data-alt="Studio portrait of a focused competitive chess grandmaster in dark minimalist attire, dramatic low-key lighting with subtle emerald green rim light, obsidian background, sharp editorial photography"
                      id="avatar-preview"
                      src="/images/77c29585fbb7.webp"
                    />
                    <div
                      class="hidden w-20 h-20 rounded-xl bg-surface-container-highest flex items-center justify-center text-outline shadow-lg"
                      id="avatar-fallback"
                    >
                      <span class="material-symbols-outlined text-[32px]" aria-hidden="true"
                        >person</span
                      >
                    </div>
                    <span
                      class="absolute -bottom-1.5 -right-1.5 px-space-xs py-0.5 rounded bg-primary text-on-primary font-label-badge text-label-badge shadow-sm"
                      >GM</span
                    >
                  </div>
                  <div class="flex flex-col gap-space-xs min-w-0">
                    <h3 class="font-headline-sm text-headline-sm text-on-surface">
                      Tournament Portrait
                    </h3>
                    <p class="font-body-sm text-body-sm text-on-surface-variant">
                      Displayed on live broadcast boards, pairing sheets, and club leaderboards. PNG
                      or JPG up to 5MB.
                    </p>
                  </div>
                </div>
                <div class="flex items-center gap-space-sm shrink-0">
                  <input accept="image/*" class="hidden" id="avatar-input" type="file" />
                  <button
                    class="px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-body-md transition-colors flex items-center gap-space-xs shadow-sm"
                    id="upload-avatar-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >upload</span
                    >
                    <span>Upload New Photo</span>
                  </button>
                  <button
                    class="px-space-md py-space-sm rounded-lg bg-error-container/40 hover:bg-error-container/70 text-error font-title-md text-body-md transition-colors"
                    id="remove-avatar-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Remove
                  </button>
                </div>
              </div>
              <form
                class="bg-surface-container p-space-lg rounded-xl shadow-md flex flex-col gap-space-lg"
                id="profile-form"
                @submit.prevent=""
              >
                <div class="grid grid-cols-1 md:grid-cols-2 gap-space-lg">
                  <div class="flex flex-col gap-space-xs">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                      for="first-name"
                      >First Name</label
                    >
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md placeholder:text-outline focus:outline-none focus:bg-surface-container-low transition-colors shadow-inner"
                      id="first-name"
                      type="text"
                      value="Magnus"
                    />
                  </div>
                  <div class="flex flex-col gap-space-xs">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                      for="last-name"
                      >Last Name</label
                    >
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md placeholder:text-outline focus:outline-none focus:bg-surface-container-low transition-colors shadow-inner"
                      id="last-name"
                      type="text"
                      value="Vance"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                    for="username"
                    >Username</label
                  >
                  <div
                    class="flex items-center rounded-lg bg-surface-container-lowest overflow-hidden shadow-inner"
                  >
                    <span
                      class="px-space-md py-space-sm bg-surface-container-low text-outline font-label-numeric-md text-label-numeric-md"
                      >@</span
                    >
                    <input
                      class="w-full px-space-md py-space-sm bg-transparent text-on-surface font-body-md text-body-md placeholder:text-outline focus:outline-none"
                      id="username"
                      type="text"
                      value="mvance_gm"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <div class="flex items-center justify-between">
                    <label
                      class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                      for="biography"
                      >Biography</label
                    >
                    <span class="font-label-numeric-md text-body-sm text-outline" id="bio-counter"
                      >118 / 280</span
                    >
                  </div>
                  <textarea
                    class="w-full px-space-md py-space-sm rounded-lg bg-surface-container-lowest text-on-surface font-body-md text-body-md placeholder:text-outline focus:outline-none focus:bg-surface-container-low transition-colors resize-none shadow-inner"
                    id="biography"
                    maxlength="280"
                    rows="4"
                  >
Classical specialist and FIDE Arbiter. Focusing on Sicilian Najdorf theory and endgame precision in 90+30 formats.</textarea>
                </div>
                <div class="flex flex-col gap-space-sm">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-on-surface-variant"
                    >Chess Experience Level</span
                  >
                  <div
                    class="grid grid-cols-1 md:grid-cols-3 gap-space-md"
                    id="experience-selector"
                  >
                    <button
                      class="exp-option text-left p-space-md rounded-xl bg-surface-container-low hover:bg-surface-container-high transition-colors flex flex-col gap-space-xs"
                      data-level="Beginner"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <div class="flex items-center justify-between">
                        <span class="font-title-md text-title-md text-on-surface">Beginner</span>
                        <span
                          class="exp-dot w-2.5 h-2.5 rounded-full bg-surface-container-highest"
                        ></span>
                      </div>
                      <span class="font-body-sm text-body-sm text-on-surface-variant"
                        >Learning core tactics &amp; opening principles.</span
                      >
                    </button>
                    <button
                      class="exp-option text-left p-space-md rounded-xl bg-surface-container-low hover:bg-surface-container-high transition-colors flex flex-col gap-space-xs"
                      data-level="Intermediate"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <div class="flex items-center justify-between">
                        <span class="font-title-md text-title-md text-on-surface"
                          >Intermediate</span
                        >
                        <span
                          class="exp-dot w-2.5 h-2.5 rounded-full bg-surface-container-highest"
                        ></span>
                      </div>
                      <span class="font-body-sm text-body-sm text-on-surface-variant"
                        >Club competitor &amp; positional planning.</span
                      >
                    </button>
                    <button
                      class="exp-option text-left p-space-md rounded-xl bg-secondary-container text-on-secondary-container shadow-sm transition-colors flex flex-col gap-space-xs"
                      data-level="Advanced"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <div class="flex items-center justify-between">
                        <span class="font-title-md text-title-md text-primary">Advanced</span>
                        <span class="exp-dot w-2.5 h-2.5 rounded-full bg-primary"></span>
                      </div>
                      <span class="font-body-sm text-body-sm text-on-surface"
                        >Titled player, deep theory &amp; classical Swiss.</span
                      >
                    </button>
                  </div>
                  <input id="experience-value" type="hidden" value="Advanced" />
                </div>
                <div class="pt-space-md flex items-center justify-end gap-space-md">
                  <button
                    class="px-space-lg py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-body-md transition-colors"
                    id="cancel-btn"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Cancel
                  </button>
                  <button
                    class="px-space-lg py-space-sm rounded-lg bg-primary hover:bg-primary-fixed-dim text-on-primary font-title-md text-body-md transition-colors shadow-md flex items-center gap-space-xs"
                    id="save-btn"
                    type="submit"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >save</span
                    >
                    <span>Save Changes</span>
                  </button>
                </div>
              </form>
            </section>
          </div>
        </div>
      </div>
    </main>
  </ClubLayout>
</template>
