<script setup lang="ts">
import CompactLayout from '../../components/layout/CompactLayout.vue'
</script>

<template>
  <CompactLayout title="Matches">
    <main class="flex-1 flex flex-col relative w-full pt-16 pb-24 bg-background">
      <div class="flex flex-col w-full pb-8">
        <!-- Sub-Header & Controls Container -->
        <div class="px-margin flex flex-col gap-space-sm pt-space-sm pb-space-xs">
          <div class="flex items-center justify-between gap-space-sm">
            <div>
              <p
                class="font-headline-lg-mobile text-headline-lg-mobile text-on-surface tracking-tight"
              >
                My Matches
              </p>
              <p class="font-body-sm text-body-sm text-on-surface-variant">
                Round 6 Pairings &amp; League Fixtures
              </p>
            </div>
            <!-- Season Selector Dropdown Pill -->
            <div class="relative inline-flex items-center">
              <button
                aria-expanded="false"
                aria-haspopup="listbox"
                class="flex items-center gap-1.5 px-3 py-1.5 rounded-full bg-surface-container-high hover:bg-surface-variant transition-colors shadow-sm"
                id="season-selector-btn"
                type="button"
                v-preview-disclosure="'season-dropdown'"
              >
                <span class="material-symbols-outlined text-[16px] text-primary" aria-hidden="true"
                  >emoji_events</span
                >
                <span
                  class="font-label-numeric-md text-label-numeric-md text-on-surface"
                  id="current-season-label"
                  >Spring League 2025</span
                >
                <span
                  class="material-symbols-outlined text-[16px] text-on-surface-variant transition-transform duration-200"
                  id="season-chevron"
                  aria-hidden="true"
                  >expand_more</span
                >
              </button>
              <!-- Season Menu -->
              <div
                class="hidden absolute right-0 top-full mt-2 w-52 bg-surface-container-highest rounded-xl shadow-2xl p-1 z-30 flex-col preview-disclosure"
                id="season-dropdown"
              >
                <button
                  class="season-opt flex items-center justify-between px-3 py-2 rounded-lg text-left bg-surface-container text-primary font-body-sm text-body-sm"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>Spring League 2025</span>
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                    >check</span
                  >
                </button>
                <button
                  class="season-opt flex items-center justify-between px-3 py-2 rounded-lg text-left text-on-surface-variant hover:text-on-surface hover:bg-surface-container font-body-sm text-body-sm"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>Winter Invitational 2024</span>
                </button>
                <button
                  class="season-opt flex items-center justify-between px-3 py-2 rounded-lg text-left text-on-surface-variant hover:text-on-surface hover:bg-surface-container font-body-sm text-body-sm"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span>Autumn Swiss Open</span>
                </button>
              </div>
            </div>
          </div>
          <!-- Navigation Tabs -->
          <div
            class="flex items-center gap-space-xs p-1 rounded-xl bg-surface-container-lowest mt-1"
          >
            <RouterLink
              class="flex-1 py-2 px-3 rounded-lg bg-surface-container-high text-primary font-headline-sm text-headline-sm text-center shadow-sm flex items-center justify-center gap-1.5 transition-all"
              id="tab-upcoming"
              to="/matches"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                >event_upcoming</span
              >
              <span class="font-title-md text-title-md">Upcoming Matches</span>
            </RouterLink>
            <RouterLink
              class="flex-1 py-2 px-3 rounded-lg text-on-surface-variant hover:text-on-surface font-title-md text-title-md text-center flex items-center justify-center gap-2 transition-all"
              id="tab-history"
              to="/matches/history"
            >
              <span>Match History</span>
              <span
                class="px-1.5 py-0.5 rounded-full bg-surface-container text-on-surface-variant font-label-badge text-label-badge"
                >24</span
              >
            </RouterLink>
          </div>
        </div>
        <!-- Main Content Feed -->
        <div class="px-margin flex flex-col gap-space-lg mt-space-sm">
          <!-- FEATURED NEXT SCHEDULED MATCH CARD -->
          <section
            class="flex flex-col relative rounded-2xl bg-surface-container p-space-md shadow-md overflow-hidden"
          >
            <!-- Ambient subtle board glow -->
            <div
              class="absolute -right-16 -top-16 w-44 h-44 rounded-full bg-primary/10 blur-3xl pointer-events-none"
            ></div>
            <!-- Card Top Badge Bar -->
            <div class="flex items-center justify-between mb-space-sm">
              <div
                class="flex items-center gap-1.5 px-2.5 py-1 rounded-full bg-surface-container-high"
              >
                <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
                <span
                  class="font-label-badge text-label-badge text-primary uppercase tracking-wider"
                  >Next Scheduled Match</span
                >
              </div>
              <div
                class="flex items-center gap-1 px-2.5 py-0.5 rounded-full bg-surface-container-highest text-on-surface-variant font-label-numeric-md text-label-numeric-md"
              >
                <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                  >lock_clock</span
                >
                <span>Apr 14 • 18:30</span>
              </div>
            </div>
            <!-- Head to Head Clash Showcase -->
            <div class="flex items-center justify-between gap-space-xs py-space-xs">
              <!-- White Player Card (Alex Rivera) -->
              <div
                class="flex-1 flex flex-col items-center text-center p-space-xs rounded-xl bg-surface-container-low"
              >
                <div class="relative mb-2">
                  <img
                    class="w-14 h-14 rounded-full object-cover shadow-md"
                    data-alt="Close-up portrait of Alex Rivera, a focused young male chess master in charcoal knit sweater with soft studio lighting and green ambient tones."
                    src="/images/89b625ef487a.webp"
                    alt=""
                  />
                  <div
                    class="absolute -bottom-1 -right-1 w-6 h-6 rounded-full bg-surface-container-highest flex items-center justify-center shadow"
                  >
                    <span class="text-[14px] leading-none text-on-surface select-none">♔</span>
                  </div>
                </div>
                <span class="font-title-md text-title-md text-on-surface truncate max-w-full"
                  >Alex Rivera</span
                >
                <div class="flex items-center gap-1 mt-0.5">
                  <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                    >220</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant">pts</span>
                </div>
                <span
                  class="mt-2 inline-flex items-center gap-1 px-2 py-0.5 rounded-full bg-secondary-container/60 text-primary font-label-badge text-label-badge"
                >
                  <span class="material-symbols-outlined text-[12px]" aria-hidden="true"
                    >check_circle</span
                  >
                  Accepted
                </span>
              </div>
              <!-- Center Clash Divider & Countdown -->
              <div class="flex flex-col items-center justify-center px-1">
                <div
                  class="w-9 h-9 rounded-full bg-surface-container-high flex items-center justify-center shadow-inner mb-1.5"
                >
                  <span
                    class="font-headline-sm text-headline-sm text-on-surface-variant font-bold italic tracking-tighter"
                    >VS</span
                  >
                </div>
                <span
                  class="font-label-numeric-md text-label-numeric-md text-primary font-bold leading-none"
                  >Starts in</span
                >
                <span
                  class="font-label-badge text-label-badge text-on-surface tracking-wider font-mono mt-0.5"
                  >1d 04h</span
                >
                <span
                  class="mt-2 text-[10px] font-label-badge uppercase tracking-wider text-secondary px-1.5 py-0.5 rounded bg-surface-container-high"
                  >Confirmed</span
                >
              </div>
              <!-- Black Player Card (Sofia Chen) -->
              <div
                class="flex-1 flex flex-col items-center text-center p-space-xs rounded-xl bg-surface-container-low"
              >
                <div class="relative mb-2">
                  <img
                    class="w-14 h-14 rounded-full object-cover shadow-md"
                    data-alt="Championship portrait of Sofia Chen, confident Asian female international master with sleek dark hair in deep green tournament hall ambiance."
                    src="/images/b19db7e13b8e.webp"
                    alt=""
                  />
                  <div
                    class="absolute -bottom-1 -right-1 w-6 h-6 rounded-full bg-surface-container-lowest flex items-center justify-center shadow"
                  >
                    <span class="text-[14px] leading-none text-on-surface select-none">♚</span>
                  </div>
                </div>
                <span class="font-title-md text-title-md text-on-surface truncate max-w-full"
                  >Sofia Chen</span
                >
                <div class="flex items-center gap-1 mt-0.5">
                  <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
                    >240</span
                  >
                  <span class="font-body-sm text-body-sm text-on-surface-variant">pts</span>
                </div>
                <span
                  class="mt-2 inline-flex items-center gap-1 px-2 py-0.5 rounded-full bg-secondary-container/60 text-primary font-label-badge text-label-badge"
                >
                  <span class="material-symbols-outlined text-[12px]" aria-hidden="true"
                    >check_circle</span
                  >
                  Accepted
                </span>
              </div>
            </div>
            <!-- Match Metadata Pill -->
            <div
              class="mt-space-md py-2 px-space-sm rounded-lg bg-surface-container-high flex items-center justify-center gap-2 text-center text-on-surface"
            >
              <span class="material-symbols-outlined text-[16px] text-primary" aria-hidden="true"
                >timer</span
              >
              <span class="font-body-sm text-body-sm font-medium"
                >Board 2 • Classical (90+30) • Club Hall A</span
              >
            </div>
            <!-- Action Buttons -->
            <div class="grid grid-cols-2 gap-space-sm mt-space-sm">
              <button
                class="py-2.5 px-3 rounded-lg bg-primary text-on-primary font-title-md text-title-md flex items-center justify-center gap-1.5 shadow active:scale-[0.98] transition-transform"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >description</span
                >
                <span>View Dossier</span>
              </button>
              <button
                class="py-2.5 px-3 rounded-lg bg-surface-container-high hover:bg-surface-variant text-on-surface font-title-md text-title-md flex items-center justify-center gap-1.5 transition-colors"
                id="sync-cal-btn"
                type="button"
                disabled
                title="Design preview"
              >
                <span
                  class="material-symbols-outlined text-[18px] text-secondary"
                  aria-hidden="true"
                  >calendar_add_on</span
                >
                <span id="sync-cal-text">Sync to Cal</span>
              </button>
            </div>
          </section>
          <!-- PENDING MATCH INVITATIONS -->
          <section class="flex flex-col gap-space-sm">
            <div class="flex items-center justify-between">
              <div class="flex items-center gap-1.5">
                <span
                  class="material-symbols-outlined text-secondary text-[20px]"
                  aria-hidden="true"
                  >mark_email_unread</span
                >
                <h2 class="font-headline-sm text-headline-sm text-on-surface">
                  Pending Invitations
                </h2>
              </div>
              <span
                class="px-2 py-0.5 rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge"
                >1 Action Required</span
              >
            </div>
            <!-- Pending Invitation Card -->
            <div
              class="flex flex-col p-space-md rounded-2xl bg-surface-container shadow-sm transition-all duration-300"
              id="invitation-card"
            >
              <div class="flex items-center justify-between mb-space-sm">
                <span
                  class="inline-flex items-center gap-1 px-2.5 py-1 rounded-full bg-surface-container-highest text-amber-400 font-label-badge text-label-badge"
                >
                  <span class="w-1.5 h-1.5 rounded-full bg-amber-400 animate-ping"></span>
                  Pending Your Response
                </span>
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                  >Blitz 5+3</span
                >
              </div>
              <div class="flex items-center justify-between gap-space-sm">
                <div class="flex items-center gap-space-sm min-w-0">
                  <div class="relative">
                    <img
                      class="w-11 h-11 rounded-full object-cover"
                      data-alt="Challenger Liam Novak, thoughtful young chess player seated across a digital wooden chess board in cinematic moody warm library."
                      src="/images/e0e8a2bda9ac.webp"
                      alt=""
                    />
                    <div
                      class="absolute -bottom-1 -right-1 w-5 h-5 rounded-full bg-surface-container-highest flex items-center justify-center text-[10px]"
                    >
                      ♔
                    </div>
                  </div>
                  <div class="flex flex-col min-w-0">
                    <span class="font-title-md text-title-md text-on-surface truncate"
                      >Liam Novak (W)</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Rated 1980 vs You (B ♚)</span
                    >
                  </div>
                </div>
                <div class="text-right">
                  <p class="font-title-md text-title-md text-on-surface">Apr 18</p>
                  <p class="font-body-sm text-body-sm text-on-surface-variant">19:00 UTC</p>
                </div>
              </div>
              <div class="grid grid-cols-2 gap-space-sm mt-space-md pt-space-xs">
                <button
                  class="py-2.5 px-3 rounded-lg bg-primary-container hover:bg-primary text-on-primary font-title-md text-title-md flex items-center justify-center gap-1.5 transition-colors"
                  id="accept-match-btn"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true">done</span>
                  <span>Accept Match</span>
                </button>
                <button
                  class="py-2.5 px-3 rounded-lg bg-surface-container-high hover:bg-error-container text-error hover:text-on-error font-title-md text-title-md flex items-center justify-center gap-1.5 transition-colors"
                  id="refuse-match-btn"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >close</span
                  >
                  <span>Refuse</span>
                </button>
              </div>
            </div>
          </section>
          <!-- FILTER & SEARCH TOOLBAR -->
          <section class="flex flex-col gap-space-xs mt-space-xs">
            <div class="flex items-center gap-space-sm">
              <!-- Search Input -->
              <div class="relative flex-1">
                <span
                  class="material-symbols-outlined absolute left-3 top-1/2 -translate-y-1/2 text-on-surface-variant text-[18px]"
                  aria-hidden="true"
                  >search</span
                >
                <input
                  class="w-full pl-9 pr-3 py-2 rounded-xl bg-surface-container text-on-surface placeholder:text-on-surface-variant font-body-md text-body-md outline-none focus:bg-surface-container-high transition-colors"
                  id="opponent-search"
                  placeholder="Search opponent or board..."
                  type="text"
                />
              </div>
              <!-- Status Filter Toggle -->
              <button
                class="w-10 h-10 flex items-center justify-center rounded-xl bg-surface-container text-on-surface-variant hover:text-on-surface transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >filter_list</span
                >
              </button>
            </div>
            <!-- Color Chips Row -->
            <div class="flex items-center gap-space-xs overflow-x-auto py-1">
              <button
                class="color-filter-btn px-3 py-1 rounded-full bg-primary text-on-primary font-label-badge text-label-badge whitespace-nowrap"
                data-filter="all"
                type="button"
                disabled
                title="Design preview"
              >
                All Colors
              </button>
              <button
                class="color-filter-btn px-3 py-1 rounded-full bg-surface-container hover:bg-surface-container-high text-on-surface font-label-badge text-label-badge flex items-center gap-1 whitespace-nowrap"
                data-filter="white"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="text-[13px] leading-none">♔</span> Playing White
              </button>
              <button
                class="color-filter-btn px-3 py-1 rounded-full bg-surface-container hover:bg-surface-container-high text-on-surface font-label-badge text-label-badge flex items-center gap-1 whitespace-nowrap"
                data-filter="black"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="text-[13px] leading-none">♚</span> Playing Black
              </button>
              <button
                class="color-filter-btn px-3 py-1 rounded-full bg-surface-container hover:bg-surface-container-high text-on-surface font-label-badge text-label-badge whitespace-nowrap"
                data-filter="confirmed"
                type="button"
                disabled
                title="Design preview"
              >
                Confirmed Only
              </button>
            </div>
          </section>
          <!-- UPCOMING CONFIRMED MATCHES LIST -->
          <section class="flex flex-col gap-space-sm">
            <div class="flex items-center justify-between">
              <h2 class="font-headline-sm text-headline-sm text-on-surface">Confirmed Roster</h2>
              <span class="font-body-sm text-body-sm text-on-surface-variant">2 Fixtures</span>
            </div>
            <div class="flex flex-col gap-space-xs" id="confirmed-list">
              <!-- Fixture 1: David Kim -->
              <div
                class="match-item flex items-center justify-between p-space-sm rounded-xl bg-surface-container hover:bg-surface-container-high transition-colors"
                data-color="white"
                data-name="David Kim"
              >
                <div class="flex items-center gap-space-sm min-w-0">
                  <div class="relative flex-shrink-0">
                    <img
                      class="w-10 h-10 rounded-full object-cover"
                      data-alt="Sharp portrait of chess contender David Kim wearing spectacles in a dimly lit tournament match room."
                      src="/images/51a272ea8c85.webp"
                      alt=""
                    />
                    <div
                      class="absolute -bottom-1 -right-1 w-4 h-4 rounded-full bg-surface-container-highest flex items-center justify-center text-[9px] text-on-surface"
                    >
                      ♔
                    </div>
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >David Kim</span
                      >
                      <span
                        class="px-1.5 py-0.2 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge"
                        >CM</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                      >May 2 • Rapid 15+10 • Board 4</span
                    >
                  </div>
                </div>
                <div class="flex items-center gap-space-xs flex-shrink-0">
                  <span
                    class="px-2 py-0.5 rounded-full bg-secondary-container/50 text-secondary font-label-badge text-label-badge"
                    >Confirmed</span
                  >
                  <button
                    aria-label="Match Options"
                    class="w-8 h-8 flex items-center justify-center rounded-lg text-on-surface-variant hover:text-on-surface"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >chevron_right</span
                    >
                  </button>
                </div>
              </div>
              <!-- Fixture 2: Maya Patel -->
              <div
                class="match-item flex items-center justify-between p-space-sm rounded-xl bg-surface-container hover:bg-surface-container-high transition-colors"
                data-color="black"
                data-name="Maya Patel"
              >
                <div class="flex items-center gap-space-sm min-w-0">
                  <div class="relative flex-shrink-0">
                    <img
                      class="w-10 h-10 rounded-full object-cover"
                      data-alt="Challenger Maya Patel smiling subtly in chess grandmaster hall with warm ambient backlight."
                      src="/images/c8aab4ff095f.webp"
                      alt=""
                    />
                    <div
                      class="absolute -bottom-1 -right-1 w-4 h-4 rounded-full bg-surface-container-lowest flex items-center justify-center text-[9px] text-on-surface"
                    >
                      ♚
                    </div>
                  </div>
                  <div class="flex flex-col min-w-0">
                    <div class="flex items-center gap-1.5">
                      <span class="font-title-md text-title-md text-on-surface truncate"
                        >Maya Patel</span
                      >
                      <span
                        class="px-1.5 py-0.2 rounded bg-surface-container-highest text-secondary font-label-badge text-label-badge"
                        >WFM</span
                      >
                    </div>
                    <span class="font-body-sm text-body-sm text-on-surface-variant truncate"
                      >May 9 • Classical 90+30 • Board 1</span
                    >
                  </div>
                </div>
                <div class="flex items-center gap-space-xs flex-shrink-0">
                  <span
                    class="px-2 py-0.5 rounded-full bg-secondary-container/50 text-secondary font-label-badge text-label-badge"
                    >Confirmed</span
                  >
                  <button
                    aria-label="Match Options"
                    class="w-8 h-8 flex items-center justify-center rounded-lg text-on-surface-variant hover:text-on-surface"
                    type="button"
                    disabled
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >chevron_right</span
                    >
                  </button>
                </div>
              </div>
            </div>
          </section>
          <!-- OFFICIAL POINTS RULES NOTICE BOX -->
          <section
            class="p-space-md rounded-2xl bg-surface-container-lowest flex flex-col gap-space-xs shadow-sm"
          >
            <div class="flex items-center gap-2">
              <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                >gavel</span
              >
              <span class="font-title-md text-title-md text-on-surface"
                >League Scoring Regulations</span
              >
            </div>
            <p class="font-body-sm text-body-sm text-on-surface-variant">
              Standard FIDE rated points table applies to Spring 2025 seasonal leaderboard
              calculation:
            </p>
            <div class="grid grid-cols-3 gap-space-xs pt-1">
              <div
                class="flex flex-col items-center justify-center py-2 px-1 rounded-xl bg-surface-container text-center"
              >
                <span class="font-body-sm text-body-sm text-on-surface-variant">Victory</span>
                <span class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
                  >+20</span
                >
                <span class="font-label-badge text-label-badge text-on-surface-variant">1 - 0</span>
              </div>
              <div
                class="flex flex-col items-center justify-center py-2 px-1 rounded-xl bg-surface-container text-center"
              >
                <span class="font-body-sm text-body-sm text-on-surface-variant">Draw</span>
                <span class="font-label-numeric-lg text-label-numeric-lg text-amber-400 font-bold"
                  >+10</span
                >
                <span class="font-label-badge text-label-badge text-on-surface-variant">½ - ½</span>
              </div>
              <div
                class="flex flex-col items-center justify-center py-2 px-1 rounded-xl bg-surface-container text-center"
              >
                <span class="font-body-sm text-body-sm text-on-surface-variant">Defeat</span>
                <span class="font-label-numeric-lg text-label-numeric-lg text-error font-bold"
                  >0</span
                >
                <span class="font-label-badge text-label-badge text-on-surface-variant">0 - 1</span>
              </div>
            </div>
          </section>
        </div>
        <!-- REFUSAL MODAL DIALOG (Interactive) -->
        <div
          class="hidden fixed inset-0 z-50 flex items-center justify-center px-margin bg-background/80 backdrop-blur-sm"
          id="refuse-modal"
        >
          <div
            class="w-full max-w-sm rounded-2xl bg-surface-container-highest p-space-md flex flex-col gap-space-sm shadow-2xl"
          >
            <div class="flex items-center gap-2 text-error">
              <span class="material-symbols-outlined text-[24px]" aria-hidden="true">warning</span>
              <h3 class="font-headline-sm text-headline-sm text-on-surface">Decline Match?</h3>
            </div>
            <p class="font-body-sm text-body-sm text-on-surface-variant">
              Declining Liam Novak's blitz match won't incur a penalty if submitted 48h prior to
              clock-in. Would you like to attach a note?
            </p>
            <textarea
              class="w-full p-2.5 rounded-lg bg-surface-container text-on-surface font-body-sm text-body-sm outline-none resize-none h-20 placeholder:text-on-surface-variant"
              placeholder="Optional reason (e.g. scheduling conflict)..."
            ></textarea>
            <div class="flex items-center justify-end gap-space-xs mt-1">
              <button
                class="px-3 py-2 rounded-lg text-on-surface-variant font-title-md text-title-md hover:text-on-surface"
                id="modal-cancel-btn"
                type="button"
                disabled
                title="Design preview"
              >
                Keep Match
              </button>
              <button
                class="px-4 py-2 rounded-lg bg-error-container text-on-error font-title-md text-title-md hover:opacity-90"
                id="modal-confirm-refuse-btn"
                type="button"
                disabled
                title="Design preview"
              >
                Confirm Decline
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </CompactLayout>
</template>
