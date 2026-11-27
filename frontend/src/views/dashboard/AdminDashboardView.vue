<script setup lang="ts">
import DashboardLayout from '../../components/layout/DashboardLayout.vue'
import DashboardPageHeader from '../../components/layout/DashboardPageHeader.vue'
</script>

<template>
  <DashboardLayout>
    <main class="relative w-full bg-surface pt-16">
      <div
        class="flex w-full flex-col gap-space-md pb-space-xl lg:grid lg:grid-cols-2 lg:items-start lg:gap-space-lg"
      >
        <DashboardPageHeader class="lg:col-span-2" section="Overview" title="Admin Operations">
          <template #meta>
              <div class="flex items-center gap-2 mt-1.5 flex-wrap">
                <span
                  class="inline-flex items-center gap-1.5 px-2.5 py-0.5 rounded-full bg-secondary-container text-secondary font-label-badge text-label-badge shadow-sm"
                >
                  <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                  Spring League 2025 • Week 7
                </span>
                <span class="font-body-sm text-body-sm text-outline">System Clock: 14:38 UTC</span>
              </div>
          </template>
          <template #actions>
            <div class="relative shrink-0">
              <button
                aria-expanded="false"
                class="dashboard-primary-action"
                id="quick-action-btn"
                type="button"
                v-preview-disclosure="'quick-action-menu'"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >add_circle</span
                >
                <span>Quick Actions</span>
                <span
                  class="material-symbols-outlined text-[18px] transition-transform duration-200"
                  id="quick-action-chevron"
                  aria-hidden="true"
                  >expand_more</span
                >
              </button>
              <!-- Dropdown Menu -->
              <div
                class="hidden absolute left-0 mt-2 w-56 rounded-xl bg-surface-container-high shadow-xl p-1.5 z-40 preview-disclosure @min-[50rem]:right-0 @min-[50rem]:left-auto"
                id="quick-action-menu"
              >
                <RouterLink
                  class="w-full flex items-center gap-2.5 px-3 py-2 text-left rounded-lg text-on-surface hover:bg-surface-container hover:text-primary transition-colors font-body-md text-body-md"
                  to="/dashboard/matches/create"
                >
                  <span
                    class="material-symbols-outlined text-[18px] text-primary"
                    aria-hidden="true"
                    >event_available</span
                  >
                  <span>Schedule Match</span>
                </RouterLink>
                <RouterLink
                  class="w-full flex items-center gap-2.5 px-3 py-2 text-left rounded-lg text-on-surface hover:bg-surface-container hover:text-primary transition-colors font-body-md text-body-md"
                  to="/dashboard/accounts"
                >
                  <span
                    class="material-symbols-outlined text-[18px] text-secondary"
                    aria-hidden="true"
                    >verified_user</span
                  >
                  <span>Validate Account</span>
                </RouterLink>
                <RouterLink
                  class="w-full flex items-center gap-2.5 px-3 py-2 text-left rounded-lg text-on-surface hover:bg-surface-container hover:text-primary transition-colors font-body-md text-body-md"
                  to="/dashboard/seasons/create"
                >
                  <span
                    class="material-symbols-outlined text-[18px] text-tertiary"
                    aria-hidden="true"
                    >emoji_events</span
                  >
                  <span>Create Season</span>
                </RouterLink>
                <RouterLink
                  class="w-full flex items-center gap-2.5 px-3 py-2 text-left rounded-lg text-on-surface hover:bg-surface-container hover:text-primary transition-colors font-body-md text-body-md"
                  to="/dashboard/events/create"
                >
                  <span
                    class="material-symbols-outlined text-[18px] text-on-surface-variant"
                    aria-hidden="true"
                    >campaign</span
                  >
                  <span>Publish Event</span>
                </RouterLink>
              </div>
            </div>
          </template>
        </DashboardPageHeader>
        <!-- Operational Action Shortcut Strip -->
        <div
          class="flex items-center gap-2 overflow-x-auto pb-1 -mx-margin px-margin scrollbar-none lg:col-span-2 lg:mx-0 lg:flex-wrap lg:px-0"
        >
          <RouterLink
            class="shrink-0 flex items-center gap-2 px-3 py-2 rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors text-on-surface shadow-sm active:scale-98"
            to="/dashboard/accounts"
          >
            <span class="material-symbols-outlined text-primary text-[18px]" aria-hidden="true"
              >how_to_reg</span
            >
            <span class="font-body-md text-body-md font-medium">Validate Accounts</span>
            <span
              class="px-1.5 py-0.5 rounded-full bg-error-container text-on-error-container font-label-badge text-label-badge leading-none"
              >7</span
            >
          </RouterLink>
          <RouterLink
            class="shrink-0 flex items-center gap-2 px-3 py-2 rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors text-on-surface shadow-sm active:scale-98"
            to="/dashboard/matches/create"
          >
            <span class="material-symbols-outlined text-secondary text-[18px]" aria-hidden="true"
              >calendar_add_on</span
            >
            <span class="font-body-md text-body-md font-medium">Schedule Match</span>
          </RouterLink>
          <RouterLink
            class="shrink-0 flex items-center gap-2 px-3 py-2 rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors text-on-surface shadow-sm active:scale-98"
            to="/dashboard/events/create"
          >
            <span class="material-symbols-outlined text-tertiary text-[18px]" aria-hidden="true"
              >add_moderator</span
            >
            <span class="font-body-md text-body-md font-medium">New Event</span>
          </RouterLink>
          <RouterLink
            class="shrink-0 flex items-center gap-2 px-3 py-2 rounded-lg bg-surface-container hover:bg-surface-container-high transition-colors text-on-surface shadow-sm active:scale-98"
            to="/dashboard/matches/sample-match"
          >
            <span class="material-symbols-outlined text-surface-tint text-[18px]" aria-hidden="true"
              >scoreboard</span
            >
            <span class="font-body-md text-body-md font-medium">Record Result</span>
          </RouterLink>
        </div>
        <!-- 4-Tile KPI Metric Matrix -->
        <div class="grid grid-cols-2 gap-space-sm lg:col-span-2 lg:grid-cols-4">
          <!-- Active Players -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant font-medium"
                >Active Players</span
              >
              <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                >groups</span
              >
            </div>
            <div class="mt-3">
              <div
                class="font-label-numeric-lg text-label-numeric-lg text-on-surface tracking-tight"
              >
                142
              </div>
              <div class="flex items-center gap-1 mt-1 text-primary font-body-sm text-body-sm">
                <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                  >trending_up</span
                >
                <span>+12 this month</span>
              </div>
            </div>
            <div
              class="absolute -right-3 -bottom-3 w-14 h-14 rounded-full bg-primary/5 pointer-events-none"
            ></div>
          </div>
          <!-- Pending Registrations -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant font-medium"
                >Pending Approvals</span
              >
              <span class="material-symbols-outlined text-error text-[20px]" aria-hidden="true"
                >pending_actions</span
              >
            </div>
            <div class="mt-3">
              <div
                class="font-label-numeric-lg text-label-numeric-lg text-on-surface tracking-tight"
              >
                7
              </div>
              <div
                class="inline-flex items-center gap-1 mt-1 px-1.5 py-0.5 rounded bg-surface-container-highest text-secondary-fixed font-label-badge text-label-badge"
              >
                <span class="w-1.5 h-1.5 rounded-full bg-surface-tint animate-ping"></span>
                Requires Action
              </div>
            </div>
            <div
              class="absolute -right-3 -bottom-3 w-14 h-14 rounded-full bg-error-container/10 pointer-events-none"
            ></div>
          </div>
          <!-- Scheduled Matches -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant font-medium"
                >Scheduled</span
              >
              <span class="material-symbols-outlined text-tertiary text-[20px]" aria-hidden="true"
                >schedule</span
              >
            </div>
            <div class="mt-3">
              <div
                class="font-label-numeric-lg text-label-numeric-lg text-on-surface tracking-tight"
              >
                28
              </div>
              <p class="mt-1 font-body-sm text-body-sm text-outline truncate">
                4 pending acceptance
              </p>
            </div>
            <div
              class="absolute -right-3 -bottom-3 w-14 h-14 rounded-full bg-tertiary/5 pointer-events-none"
            ></div>
          </div>
          <!-- Active Season Matches -->
          <div
            class="dashboard-metric"
          >
            <div class="flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-on-surface-variant font-medium"
                >Completed</span
              >
              <span class="material-symbols-outlined text-secondary text-[20px]" aria-hidden="true"
                >military_tech</span
              >
            </div>
            <div class="mt-3">
              <div
                class="font-label-numeric-lg text-label-numeric-lg text-on-surface tracking-tight"
              >
                182
              </div>
              <p class="mt-1 font-body-sm text-body-sm text-primary font-medium">
                Spring Tourney '25
              </p>
            </div>
            <div
              class="absolute -right-3 -bottom-3 w-14 h-14 rounded-full bg-secondary/5 pointer-events-none"
            ></div>
          </div>
        </div>
        <!-- Season Progression Micro-Widget -->
        <div
          class="dashboard-panel flex flex-col space-y-space-sm p-space-md lg:col-span-2"
        >
          <div class="flex items-center justify-between">
            <div class="flex items-center gap-2">
              <span class="material-symbols-outlined text-primary text-[20px]" aria-hidden="true"
                >flag</span
              >
              <span class="font-title-md text-title-md text-on-surface">Spring League 2025</span>
            </div>
            <span class="font-label-numeric-md text-label-numeric-md text-primary font-bold"
              >65% Completed</span
            >
          </div>
          <!-- Progress Track -->
          <div class="w-full h-2.5 rounded-full bg-surface-container-highest overflow-hidden">
            <div
              class="h-full bg-gradient-to-r from-secondary to-primary rounded-full transition-all duration-700"
              style="width: 65%"
            ></div>
          </div>
          <div class="flex items-center justify-between text-body-sm font-body-sm text-outline">
            <span class="flex items-center gap-1">
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >timelapse</span
              >
              Next Round Closes in 3 Days
            </span>
            <span>Round 7 of 10</span>
          </div>
        </div>
        <!-- Account Approvals Moderation Section -->
        <div class="flex flex-col space-y-space-sm">
          <div class="flex items-center justify-between">
            <div class="flex items-center gap-2">
              <h2 class="font-title-md text-title-md text-on-surface">Pending Approvals Queue</h2>
              <span
                class="px-2 py-0.5 rounded-full bg-error-container text-on-error-container font-label-badge text-label-badge font-semibold"
                >2 urgent</span
              >
            </div>
            <RouterLink
              class="font-body-sm text-body-sm text-primary hover:underline"
              to="/dashboard/accounts"
              >View All (7)</RouterLink
            >
          </div>
          <!-- Registration Card 1 -->
          <div
            class="dashboard-panel flex flex-col space-y-space-sm p-3.5 transition-all duration-300"
            id="reg-card-1"
          >
            <div class="flex items-start justify-between gap-space-sm">
              <div class="flex items-center gap-3 min-w-0">
                <div
                  class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center text-primary font-headline-sm text-headline-sm shrink-0"
                >
                  T
                </div>
                <div class="min-w-0 flex flex-col">
                  <div class="flex items-center gap-2">
                    <span class="font-title-md text-title-md text-on-surface truncate"
                      >Tariq Al-Mansoor</span
                    >
                    <span
                      class="px-1.5 py-0.5 rounded bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge"
                      >Intermediate</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline truncate"
                    >FIDE ID: 15409211 • Registered 2h ago</span
                  >
                </div>
              </div>
            </div>
            <div class="flex items-center gap-2 pt-1">
              <button
                class="flex-1 py-2 px-3 rounded-lg bg-primary hover:bg-secondary text-on-primary font-title-md text-body-md flex items-center justify-center gap-1.5 transition-colors active:scale-98 shadow-sm"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >check_circle</span
                >
                <span>Approve</span>
              </button>
              <button
                class="flex-1 py-2 px-3 rounded-lg bg-surface-container-high hover:bg-error-container hover:text-on-error-container text-error font-title-md text-body-md flex items-center justify-center gap-1.5 transition-colors active:scale-98"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">cancel</span>
                <span>Reject</span>
              </button>
            </div>
          </div>
          <!-- Registration Card 2 -->
          <div
            class="dashboard-panel flex flex-col space-y-space-sm p-3.5 transition-all duration-300"
            id="reg-card-2"
          >
            <div class="flex items-start justify-between gap-space-sm">
              <div class="flex items-center gap-3 min-w-0">
                <div
                  class="w-10 h-10 rounded-full bg-surface-container-high flex items-center justify-center text-secondary font-headline-sm text-headline-sm shrink-0"
                >
                  E
                </div>
                <div class="min-w-0 flex flex-col">
                  <div class="flex items-center gap-2">
                    <span class="font-title-md text-title-md text-on-surface truncate"
                      >Elena Garcia</span
                    >
                    <span
                      class="px-1.5 py-0.5 rounded bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge"
                      >Beginner</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline truncate"
                    >Club Rookie • Registered 5h ago</span
                  >
                </div>
              </div>
            </div>
            <div class="flex items-center gap-2 pt-1">
              <button
                class="flex-1 py-2 px-3 rounded-lg bg-primary hover:bg-secondary text-on-primary font-title-md text-body-md flex items-center justify-center gap-1.5 transition-colors active:scale-98 shadow-sm"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >check_circle</span
                >
                <span>Approve</span>
              </button>
              <button
                class="flex-1 py-2 px-3 rounded-lg bg-surface-container-high hover:bg-error-container hover:text-on-error-container text-error font-title-md text-body-md flex items-center justify-center gap-1.5 transition-colors active:scale-98"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">cancel</span>
                <span>Reject</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Upcoming Matches Moderation Section -->
        <div class="flex flex-col space-y-space-sm">
          <div class="flex items-center justify-between">
            <div class="flex items-center gap-2">
              <h2 class="font-title-md text-title-md text-on-surface">Matches Moderation</h2>
              <span class="w-2 h-2 rounded-full bg-primary"></span>
            </div>
            <span class="font-body-sm text-body-sm text-on-surface-variant">Round 7 Desk</span>
          </div>
          <!-- Match 1: Confirmed & Completed Result Pending Entry -->
          <div
            class="dashboard-panel flex flex-col space-y-space-sm p-space-md"
          >
            <div class="flex items-center justify-between text-body-sm font-body-sm">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Board 1 • Championship Tier</span
              >
              <span
                class="inline-flex items-center gap-1 px-2 py-0.5 rounded-full bg-secondary-container text-secondary font-label-badge text-label-badge font-semibold"
              >
                <span class="material-symbols-outlined text-[12px]" aria-hidden="true"
                  >verified</span
                >
                Confirmed
              </span>
            </div>
            <!-- Competitors Head-to-Head -->
            <div class="grid grid-cols-5 items-center gap-2 py-1">
              <!-- White Player -->
              <div class="col-span-2 flex flex-col">
                <div class="flex items-center gap-1.5">
                  <span
                    class="w-2.5 h-2.5 rounded-full bg-inverse-surface border border-outline"
                  ></span>
                  <span class="font-title-md text-body-md text-on-surface truncate">M. Vance</span>
                </div>
                <span class="font-body-sm text-body-sm text-outline mt-0.5">Rating 2140</span>
              </div>
              <!-- VS Divider -->
              <div class="col-span-1 flex flex-col items-center justify-center">
                <span
                  class="font-label-badge text-label-badge font-bold text-on-surface-variant/70 uppercase"
                  >VS</span
                >
                <span class="font-label-badge text-label-badge text-outline">Rapid 15+10</span>
              </div>
              <!-- Black Player -->
              <div class="col-span-2 flex flex-col items-end text-right">
                <div class="flex items-center gap-1.5 justify-end">
                  <span class="font-title-md text-body-md text-on-surface truncate"
                    >E. Rostova</span
                  >
                  <span
                    class="w-2.5 h-2.5 rounded-full bg-surface-container-lowest border border-outline-variant"
                  ></span>
                </div>
                <span class="font-body-sm text-body-sm text-outline mt-0.5">Rating 2085</span>
              </div>
            </div>
            <!-- Action Button -->
            <div class="pt-1 flex gap-2">
              <button
                class="w-full py-2 px-3 rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-title-md text-body-md flex items-center justify-center gap-2 transition-colors active:scale-98"
                id="score-modal-btn"
                type="button"
                v-preview-disclosure="'score-drawer'"
              >
                <span class="material-symbols-outlined text-primary text-[18px]" aria-hidden="true"
                  >rate_review</span
                >
                <span>Enter Score / Validate Result</span>
              </button>
            </div>
            <!-- Quick Inline Score Submission Drawer (Collapsed by default) -->
            <div
              class="hidden flex-col space-y-2 pt-2 border-t border-surface-container-highest preview-disclosure"
              id="score-drawer"
            >
              <span class="font-body-sm text-body-sm text-on-surface-variant font-medium"
                >Record Final Board Decision:</span
              >
              <div class="grid grid-cols-3 gap-2">
                <button
                  class="py-1.5 rounded-lg bg-surface-container-highest hover:bg-primary hover:text-on-primary text-on-surface font-title-md text-body-sm transition-colors text-center"
                  disabled
                  title="Design preview"
                >
                  1 - 0
                </button>
                <button
                  class="py-1.5 rounded-lg bg-surface-container-highest hover:bg-secondary hover:text-on-secondary text-on-surface font-title-md text-body-sm transition-colors text-center"
                  disabled
                  title="Design preview"
                >
                  ½ - ½
                </button>
                <button
                  class="py-1.5 rounded-lg bg-surface-container-highest hover:bg-primary hover:text-on-primary text-on-surface font-title-md text-body-sm transition-colors text-center"
                  disabled
                  title="Design preview"
                >
                  0 - 1
                </button>
              </div>
            </div>
          </div>
          <!-- Match 2: Awaiting Black Confirmation -->
          <div
            class="dashboard-panel flex flex-col space-y-space-sm p-space-md"
          >
            <div class="flex items-center justify-between text-body-sm font-body-sm">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Board 2 • Premier Tier</span
              >
              <span
                class="inline-flex items-center gap-1 px-2 py-0.5 rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge"
              >
                <span
                  class="material-symbols-outlined text-[12px] text-surface-tint"
                  aria-hidden="true"
                  >hourglass_top</span
                >
                Awaiting Acceptance
              </span>
            </div>
            <!-- Competitors Head-to-Head -->
            <div class="grid grid-cols-5 items-center gap-2 py-1">
              <!-- White Player -->
              <div class="col-span-2 flex flex-col">
                <div class="flex items-center gap-1.5">
                  <span
                    class="w-2.5 h-2.5 rounded-full bg-inverse-surface border border-outline"
                  ></span>
                  <span class="font-title-md text-body-md text-on-surface truncate"
                    >Liam Novak</span
                  >
                </div>
                <span
                  class="font-body-sm text-body-sm text-primary mt-0.5 flex items-center gap-0.5"
                >
                  <span class="material-symbols-outlined text-[12px]" aria-hidden="true"
                    >check</span
                  >
                  Accepted
                </span>
              </div>
              <!-- VS Divider -->
              <div class="col-span-1 flex flex-col items-center justify-center">
                <span
                  class="font-label-badge text-label-badge font-bold text-on-surface-variant/70 uppercase"
                  >VS</span
                >
                <span class="font-label-badge text-label-badge text-outline">Sat 18:00</span>
              </div>
              <!-- Black Player -->
              <div class="col-span-2 flex flex-col items-end text-right">
                <div class="flex items-center gap-1.5 justify-end">
                  <span class="font-title-md text-body-md text-on-surface truncate"
                    >A. Rahmani</span
                  >
                  <span
                    class="w-2.5 h-2.5 rounded-full bg-surface-container-lowest border border-outline-variant"
                  ></span>
                </div>
                <span
                  class="font-body-sm text-body-sm text-outline mt-0.5 flex items-center gap-0.5 justify-end"
                >
                  <span class="material-symbols-outlined text-[12px]" aria-hidden="true">mail</span>
                  Pending Black
                </span>
              </div>
            </div>
            <div class="pt-1 flex items-center justify-between">
              <span class="font-body-sm text-body-sm text-outline"
                >Confirmation deadline: 12h remaining</span
              >
              <button
                class="px-2.5 py-1 rounded-lg bg-surface-container-high text-primary hover:bg-surface-bright font-title-md text-body-sm transition-colors"
                disabled
                title="Design preview"
              >
                Send Nudge
              </button>
            </div>
          </div>
        </div>
        <!-- Operational Audit & Activity Stream -->
        <div class="flex flex-col space-y-space-sm pt-space-xs lg:col-span-2">
          <div class="flex items-center justify-between">
            <div class="flex items-center gap-2">
              <span class="material-symbols-outlined text-outline text-[18px]" aria-hidden="true"
                >history</span
              >
              <h2 class="font-title-md text-title-md text-on-surface">Recent Operational Logs</h2>
            </div>
            <button
              class="font-body-sm text-body-sm text-outline hover:text-primary transition-colors"
              disabled
              title="Design preview"
            >
              Filter
            </button>
          </div>
          <div class="dashboard-panel space-y-2 p-space-sm">
            <!-- Log 1 -->
            <div
              class="flex items-start gap-3 p-2 rounded-lg hover:bg-surface-container transition-colors"
            >
              <div
                class="w-7 h-7 rounded-full bg-secondary-container flex items-center justify-center text-secondary shrink-0 mt-0.5"
              >
                <span class="material-symbols-outlined text-[15px]" aria-hidden="true"
                  >person_check</span
                >
              </div>
              <div class="flex flex-col min-w-0 flex-1">
                <p class="font-body-md text-body-md text-on-surface">
                  <span class="font-title-md text-secondary">Admin Sarah</span> approved player
                  account <span class="font-title-md text-on-surface">John Doe</span>
                </p>
                <span class="font-body-sm text-body-sm text-outline"
                  >15m ago • IP: 194.22.81.4</span
                >
              </div>
            </div>
            <!-- Log 2 -->
            <div
              class="flex items-start gap-3 p-2 rounded-lg hover:bg-surface-container transition-colors"
            >
              <div
                class="w-7 h-7 rounded-full bg-surface-container-high flex items-center justify-center text-primary shrink-0 mt-0.5"
              >
                <span class="material-symbols-outlined text-[15px]" aria-hidden="true"
                  >check_circle</span
                >
              </div>
              <div class="flex flex-col min-w-0 flex-1">
                <p class="font-body-md text-body-md text-on-surface">
                  <span class="font-title-md text-primary">Admin Marcus</span> validated result
                  <span class="font-title-md text-on-surface">Vance 1 - 0 Rostova</span>
                  <span
                    class="inline-block px-1.5 py-0.2 rounded bg-surface-container text-primary font-label-badge text-label-badge ml-1"
                    >+20 pts</span
                  >
                </p>
                <span class="font-body-sm text-body-sm text-outline"
                  >1h ago • Board 1 Auto-Rating Recalculated</span
                >
              </div>
            </div>
          </div>
        </div>
        <!-- Notification Toast Placeholder for Interactions -->
        <div
          class="fixed bottom-20 left-1/2 -translate-x-1/2 px-4 py-2.5 rounded-full bg-surface-container-highest text-on-surface text-body-sm font-title-md shadow-xl border border-surface-tint/20 transition-all duration-300 opacity-0 pointer-events-none z-50 flex items-center gap-2"
          id="admin-toast"
        >
          <span class="material-symbols-outlined text-primary text-[18px]" aria-hidden="true"
            >verified</span
          >
          <span id="toast-message">Action processed</span>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
