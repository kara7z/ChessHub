<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Micro Breadcrumbs and Context Line -->
        <div class="flex items-center justify-between py-space-sm mb-space-md">
          <div class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <span class="hover:text-on-surface transition-colors cursor-pointer">Dashboard</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="hover:text-on-surface transition-colors cursor-pointer">Matches</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="hover:text-on-surface transition-colors cursor-pointer text-secondary"
              >Match #CH-2025-092</span
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-on-surface font-title-md text-title-md">Edit Fixture</span>
          </div>
          <div class="flex items-center gap-space-sm">
            <span
              class="font-label-badge text-label-badge uppercase tracking-wider px-space-sm py-0.5 rounded bg-surface-container-high text-outline"
              >Tier 1 Swiss Board</span
            >
            <span
              class="inline-flex items-center gap-1 font-label-numeric-md text-label-numeric-md text-primary bg-secondary-container/40 px-space-sm py-0.5 rounded"
            >
              <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
              Fixture Status: Confirmed
            </span>
          </div>
        </div>
        <!-- Header Title Section -->
        <div class="flex flex-col gap-space-xs mb-space-lg">
          <div class="flex items-center justify-between">
            <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
              Edit &amp; Reschedule Match
            </h1>
            <span class="font-label-numeric-md text-label-numeric-md text-outline"
              >Match ID: CH-2025-092</span
            >
          </div>
          <p class="font-body-md text-body-md text-on-surface-variant max-w-3xl">
            Modify player assignments, schedule or venue. Significant changes will reset player
            acceptance and require re-confirmation.
          </p>
        </div>
        <!-- Warning Banner -->
        <div
          class="rounded-xl bg-surface-container-low p-space-md mb-space-lg flex items-start gap-space-md relative overflow-hidden shadow-sm"
        >
          <div class="absolute left-0 top-0 bottom-0 w-1 bg-secondary"></div>
          <div
            class="w-8 h-8 rounded-lg bg-surface-container-high flex items-center justify-center text-secondary shrink-0 mt-0.5"
          >
            <span class="material-symbols-outlined text-[20px]" aria-hidden="true">warning</span>
          </div>
          <div class="flex flex-col gap-0.5">
            <span class="font-title-md text-title-md text-on-surface"
              >Arbitration Protocol Warning</span
            >
            <p class="font-body-md text-body-md text-on-surface-variant">
              Notice: If date, time, or assigned players are changed, both players will receive new
              invitation notices and their acceptance status will reset to
              <span class="text-secondary font-semibold">Pending</span>.
            </p>
          </div>
        </div>
        <!-- Main Grid Workspace -->
        <div class="grid grid-cols-12 gap-gutter-desktop items-start">
          <!-- Left Column: Form Core Configuration (7 cols) -->
          <div class="col-span-12 lg:col-span-7 flex flex-col gap-space-lg">
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-lg"
            >
              <!-- Player Assignments Section -->
              <div class="flex flex-col gap-space-md">
                <div class="flex items-center justify-between">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Player Allocations</span
                  >
                  <span
                    class="font-body-sm text-body-sm text-secondary cursor-pointer hover:underline flex items-center gap-1"
                  >
                    <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                      >swap_horiz</span
                    >
                    Swap Colors
                  </span>
                </div>
                <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-md">
                  <!-- White Player Selector -->
                  <div
                    class="bg-surface-container rounded-lg p-space-md flex flex-col gap-space-xs"
                  >
                    <div
                      class="flex items-center justify-between text-outline font-label-badge text-label-badge uppercase tracking-wider"
                    >
                      <span class="flex items-center gap-1.5 text-on-surface">
                        <span class="w-2.5 h-2.5 rounded-full bg-on-surface"></span> White Pieces
                      </span>
                      <span class="text-secondary font-semibold">Active</span>
                    </div>
                    <div class="relative mt-space-xs">
                      <div
                        class="flex items-center justify-between w-full bg-surface-container-lowest px-space-md py-space-sm rounded-lg cursor-pointer hover:bg-surface-container-high transition-colors"
                      >
                        <div class="flex items-center gap-space-sm min-w-0">
                          <div
                            class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-headline-sm text-[12px] text-on-surface shrink-0"
                          >
                            LN
                          </div>
                          <div class="flex flex-col min-w-0">
                            <span class="font-title-md text-title-md text-on-surface truncate"
                              >Liam Novak</span
                            >
                            <span class="font-body-sm text-body-sm text-outline"
                              >180 pts • Seat 01</span
                            >
                          </div>
                        </div>
                        <span
                          class="material-symbols-outlined text-outline text-[18px]"
                          aria-hidden="true"
                          >unfold_more</span
                        >
                      </div>
                    </div>
                  </div>
                  <!-- Black Player Selector -->
                  <div
                    class="bg-surface-container rounded-lg p-space-md flex flex-col gap-space-xs"
                  >
                    <div
                      class="flex items-center justify-between text-outline font-label-badge text-label-badge uppercase tracking-wider"
                    >
                      <span class="flex items-center gap-1.5 text-on-surface">
                        <span class="w-2.5 h-2.5 rounded-full bg-surface-container-highest"></span>
                        Black Pieces
                      </span>
                      <span class="text-secondary font-semibold">Active</span>
                    </div>
                    <div class="relative mt-space-xs">
                      <div
                        class="flex items-center justify-between w-full bg-surface-container-lowest px-space-md py-space-sm rounded-lg cursor-pointer hover:bg-surface-container-high transition-colors"
                      >
                        <div class="flex items-center gap-space-sm min-w-0">
                          <div
                            class="w-7 h-7 rounded-full bg-surface-container-highest flex items-center justify-center font-headline-sm text-[12px] text-on-surface shrink-0"
                          >
                            AR
                          </div>
                          <div class="flex flex-col min-w-0">
                            <span class="font-title-md text-title-md text-on-surface truncate"
                              >Amine Rahmani</span
                            >
                            <span class="font-body-sm text-body-sm text-outline"
                              >200 pts • Seat 02</span
                            >
                          </div>
                        </div>
                        <span
                          class="material-symbols-outlined text-outline text-[18px]"
                          aria-hidden="true"
                          >unfold_more</span
                        >
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!-- Tournament & Season (Locked context) -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Target Season</label
                >
                <div
                  class="flex items-center justify-between bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                >
                  <div class="flex items-center gap-space-sm">
                    <span
                      class="material-symbols-outlined text-primary text-[18px]"
                      aria-hidden="true"
                      >lock</span
                    >
                    <span class="font-title-md text-title-md text-on-surface"
                      >Spring League 2025</span
                    >
                    <span
                      class="px-space-xs py-0.5 rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge"
                      >ACTIVE COMPETITION</span
                    >
                  </div>
                  <span class="font-body-sm text-body-sm text-outline">Stage: Round 4 Swiss</span>
                </div>
              </div>
              <!-- Schedule & Match Physics Parameters -->
              <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-md">
                <!-- Date Picker Field -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline flex items-center justify-between"
                  >
                    <span>Date</span>
                    <span class="text-on-surface-variant font-label-numeric-md">UTC Calendar</span>
                  </label>
                  <div
                    class="flex items-center gap-space-sm bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >calendar_today</span
                    >
                    <input
                      class="bg-transparent font-title-md text-title-md text-on-surface focus:outline-none w-full"
                      id="input-date"
                      type="text"
                      value="April 15, 2025"
                    />
                  </div>
                </div>
                <!-- Time Picker Field -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline flex items-center justify-between"
                  >
                    <span>Time Slot</span>
                    <span class="text-secondary font-label-numeric-md">Synchronized</span>
                  </label>
                  <div
                    class="flex items-center gap-space-sm bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >schedule</span
                    >
                    <input
                      class="bg-transparent font-title-md text-title-md text-on-surface focus:outline-none w-full"
                      id="input-time"
                      type="text"
                      value="18:30 UTC"
                    />
                  </div>
                </div>
                <!-- Venue / Table Field -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Location / Venue</label
                  >
                  <div
                    class="flex items-center gap-space-sm bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-outline text-[18px]"
                      aria-hidden="true"
                      >location_on</span
                    >
                    <input
                      class="bg-transparent font-title-md text-title-md text-on-surface focus:outline-none w-full"
                      id="input-venue"
                      type="text"
                      value="Club Hall A (Table 02)"
                    />
                  </div>
                </div>
                <!-- Time Control Selector -->
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Time Control</label
                  >
                  <div class="relative">
                    <select
                      class="w-full bg-surface-container-lowest text-on-surface font-title-md text-title-md px-space-md py-space-sm rounded-lg appearance-none focus:outline-none cursor-pointer"
                    >
                      <option selected>Classical 90 min + 30 sec increment</option>
                      <option>Rapid 15 min + 10 sec increment</option>
                      <option>Blitz 5 min + 3 sec increment</option>
                    </select>
                    <span
                      class="material-symbols-outlined text-outline text-[18px] absolute right-3 top-3 pointer-events-none"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
              </div>
              <!-- Invitation Response Deadline -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Invitation Response Deadline</label
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Calculated: 48h prior to clock start</span
                  >
                </div>
                <div
                  class="flex items-center gap-space-sm bg-surface-container-lowest px-space-md py-space-sm rounded-lg"
                >
                  <span
                    class="material-symbols-outlined text-outline text-[18px]"
                    aria-hidden="true"
                    >timer</span
                  >
                  <input
                    class="bg-transparent font-title-md text-title-md text-on-surface focus:outline-none w-full"
                    type="text"
                    value="April 13, 2025, 18:30 UTC"
                  />
                  <span
                    class="font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-surface-container-high text-outline"
                    >AUTO</span
                  >
                </div>
              </div>
              <!-- Reset Acceptance Checkbox -->
              <label
                class="flex items-start gap-space-sm p-space-md rounded-lg bg-surface-container cursor-pointer select-none"
              >
                <input
                  checked
                  class="mt-1 w-4 h-4 rounded bg-surface-container-lowest accent-primary-container text-on-primary-container cursor-pointer"
                  type="checkbox"
                />
                <div class="flex flex-col">
                  <span class="font-title-md text-title-md text-on-surface"
                    >Require players to re-accept modified match</span
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Both competitors will receive a new fixture assignment notification with fresh
                    accept/decline action buttons.</span
                  >
                </div>
              </label>
              <!-- Admin Notification Note -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Admin Notification Note</label
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Dispatched with dispatch alert</span
                  >
                </div>
                <textarea
                  class="w-full bg-surface-container-lowest p-space-md rounded-lg text-on-surface font-body-md text-body-md focus:outline-none placeholder-outline resize-none"
                  id="admin-note-input"
                  rows="3"
                >
Table rescheduled due to hall maintenance</textarea>
              </div>
              <!-- Primary Form Actions -->
              <div class="flex flex-wrap items-center gap-space-md pt-space-xs">
                <button
                  class="px-space-lg py-space-sm rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md font-semibold hover:bg-secondary transition-colors flex items-center gap-space-xs shadow-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true">send</span>
                  Save &amp; Dispatch Updates
                </button>
                <button
                  class="px-space-md py-space-sm rounded-lg bg-surface-container-high text-on-surface font-title-md text-title-md hover:bg-surface-bright transition-colors flex items-center gap-space-xs"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >update</span
                  >
                  Reschedule Only
                </button>
                <span
                  class="px-space-md py-space-sm rounded-lg text-outline hover:text-on-surface font-title-md text-title-md transition-colors ml-auto"
                >
                  Cancel
                </span>
              </div>
            </div>
          </div>
          <!-- Right Column: Dispatch Preview & Arbiter Oversight (5 cols) -->
          <div class="col-span-12 lg:col-span-5 flex flex-col gap-space-lg">
            <!-- Player Notification Preview Card -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-secondary text-[20px]"
                    aria-hidden="true"
                    >mark_email_unread</span
                  >
                  <span class="font-title-md text-title-md text-on-surface font-semibold"
                    >Player Notification Preview</span
                  >
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase px-space-xs py-0.5 rounded bg-surface-container-high text-outline"
                  >Email &amp; In-App</span
                >
              </div>
              <p class="font-body-sm text-body-sm text-outline">
                Rendered preview of automated bulletin delivered to
                <span class="text-on-surface font-medium">Liam Novak</span> and
                <span class="text-on-surface font-medium">Amine Rahmani</span> upon commit:
              </p>
              <!-- Simulated Dispatch Card in Player View -->
              <div
                class="bg-surface-container-lowest rounded-xl p-space-md flex flex-col gap-space-md relative overflow-hidden shadow-sm"
              >
                <div class="flex items-center justify-between">
                  <div class="flex items-center gap-space-xs">
                    <span
                      class="w-6 h-6 rounded bg-primary-container text-on-primary-container flex items-center justify-center font-label-badge text-label-badge"
                      >CH</span
                    >
                    <span
                      class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                      >Official Match Order</span
                    >
                  </div>
                  <span class="font-label-numeric-md text-label-numeric-md text-secondary"
                    >ID #CH-2025-092</span
                  >
                </div>
                <div class="flex flex-col gap-1">
                  <span class="font-headline-sm text-headline-sm text-on-surface"
                    >Fixture Rescheduled: Classical Swiss R4</span
                  >
                  <span class="font-body-sm text-body-sm text-outline"
                    >Spring League 2025 • Sanctioned League Play</span
                  >
                </div>
                <!-- Match Pair Visual -->
                <div
                  class="bg-surface-container-low rounded-lg p-space-sm flex items-center justify-between"
                >
                  <div class="flex items-center gap-space-sm">
                    <span class="w-3 h-3 rounded-full bg-on-surface inline-block"></span>
                    <span class="font-title-md text-title-md text-on-surface">L. Novak</span>
                    <span class="font-label-badge text-label-badge text-outline">180 pts</span>
                  </div>
                  <span class="font-label-badge text-label-badge uppercase text-secondary font-bold"
                    >VS</span
                  >
                  <div class="flex items-center gap-space-sm">
                    <span class="font-label-badge text-label-badge text-outline">200 pts</span>
                    <span class="font-title-md text-title-md text-on-surface">A. Rahmani</span>
                    <span
                      class="w-3 h-3 rounded-full bg-surface-container-highest inline-block"
                    ></span>
                  </div>
                </div>
                <!-- Schedule Meta Matrix -->
                <div
                  class="grid grid-cols-2 gap-space-sm bg-surface-container rounded-lg p-space-sm font-body-sm text-body-sm"
                >
                  <div class="flex flex-col">
                    <span class="text-outline font-label-badge text-label-badge uppercase"
                      >Match Date</span
                    >
                    <span class="text-on-surface font-semibold" id="preview-date"
                      >April 15, 2025</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <span class="text-outline font-label-badge text-label-badge uppercase"
                      >Clock Call</span
                    >
                    <span class="text-on-surface font-semibold" id="preview-time">18:30 UTC</span>
                  </div>
                  <div class="flex flex-col">
                    <span class="text-outline font-label-badge text-label-badge uppercase"
                      >Board &amp; Venue</span
                    >
                    <span class="text-on-surface font-semibold truncate" id="preview-venue"
                      >Club Hall A (Table 02)</span
                    >
                  </div>
                  <div class="flex flex-col">
                    <span class="text-outline font-label-badge text-label-badge uppercase"
                      >Time Control</span
                    >
                    <span class="text-on-surface font-semibold">Classical 90+30</span>
                  </div>
                </div>
                <!-- Dynamic Arbiter Note Preview -->
                <div class="bg-surface-container-low rounded-lg p-space-sm flex flex-col gap-0.5">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-secondary"
                    >Chief Arbiter Notice</span
                  >
                  <p class="font-body-sm text-body-sm text-on-surface italic" id="preview-note">
                    "Table rescheduled due to hall maintenance"
                  </p>
                </div>
                <!-- Interactive Actions Simulation -->
                <div class="flex items-center gap-space-sm pt-space-xs">
                  <div
                    class="flex-1 py-1.5 rounded bg-primary-container text-on-primary-container text-center font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                  >
                    Accept Match
                  </div>
                  <div
                    class="flex-1 py-1.5 rounded bg-surface-container-high text-on-surface text-center font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    Request Conflict
                  </div>
                </div>
              </div>
              <div
                class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm pt-space-xs"
              >
                <span class="material-symbols-outlined text-[16px]" aria-hidden="true">info</span>
                <span>Response countdown will initiate automatically at 48 hours.</span>
              </div>
            </div>
            <!-- Tournament Hall Blueprint / Visual Context -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col gap-space-md"
            >
              <div class="flex items-center justify-between">
                <span class="font-title-md text-title-md text-on-surface font-semibold"
                  >Hall A Seating Plan</span
                >
                <span class="font-label-numeric-md text-label-numeric-md text-primary"
                  >Table 02 Selected</span
                >
              </div>
              <div
                class="relative w-full h-36 rounded-lg overflow-hidden bg-surface-container-lowest flex items-center justify-center"
              >
                <img
                  class="w-full h-full object-cover opacity-35"
                  data-alt="Overhead architectural top-down minimalist floor plan of a prestigious competition chess tournament hall with partitioned wood tables and directional soft lighting in dark emerald and graphite hues"
                  src="/images/8c131411c43c.webp"
                  alt=""
                />
                <div
                  class="absolute inset-0 bg-gradient-to-t from-surface-container-lowest via-transparent to-transparent"
                ></div>
                <div
                  class="absolute inset-0 flex items-center justify-around px-space-md pointer-events-none"
                >
                  <div class="flex flex-col items-center gap-1 opacity-40">
                    <span class="w-12 h-6 rounded bg-surface-container-high"></span>
                    <span class="font-label-badge text-label-badge text-outline">Table 01</span>
                  </div>
                  <div class="flex flex-col items-center gap-1">
                    <span
                      class="w-14 h-8 rounded bg-primary-container flex items-center justify-center text-on-primary-container font-label-numeric-md text-label-numeric-md shadow-md animate-pulse"
                      >02</span
                    >
                    <span class="font-label-badge text-label-badge text-primary font-bold"
                      >Active Fix</span
                    >
                  </div>
                  <div class="flex flex-col items-center gap-1 opacity-40">
                    <span class="w-12 h-6 rounded bg-surface-container-high"></span>
                    <span class="font-label-badge text-label-badge text-outline">Table 03</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- Bottom Danger Zone -->
        <div class="mt-space-xl pt-space-lg">
          <div
            class="bg-surface-container-lowest rounded-xl p-space-lg flex flex-col sm:flex-row sm:items-center justify-between gap-space-md shadow-sm"
          >
            <div class="flex items-start gap-space-md">
              <div
                class="w-10 h-10 rounded-lg bg-error-container/30 text-error flex items-center justify-center shrink-0 mt-0.5"
              >
                <span class="material-symbols-outlined text-[24px]" aria-hidden="true">gavel</span>
              </div>
              <div class="flex flex-col gap-0.5">
                <div class="flex items-center gap-space-sm">
                  <span class="font-title-md text-title-md text-error font-semibold"
                    >Danger Zone: Fixture Cancellation</span
                  >
                  <span
                    class="font-label-badge text-label-badge uppercase px-space-xs py-0.5 rounded bg-error-container/40 text-on-error-container"
                    >Irreversible</span
                  >
                </div>
                <p class="font-body-md text-body-md text-on-surface-variant max-w-2xl">
                  Cancel this scheduled encounter entirely. Cancelled matches will not be
                  rescheduled, will record a mutual forfeit, and award 0 points to both Liam Novak
                  and Amine Rahmani in the Spring League standings.
                </p>
              </div>
            </div>
            <div class="shrink-0">
              <button
                class="px-space-md py-space-sm rounded-lg bg-surface-container text-error hover:bg-error hover:text-on-error transition-colors font-title-md text-title-md font-semibold flex items-center gap-space-xs"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">cancel</span>
                Cancel Match Fixture
              </button>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
