<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full">
        <!-- Top Command & Breadcrumb Context -->
        <div class="flex flex-col gap-space-xs pt-space-md pb-space-lg">
          <div class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <span class="hover:text-on-surface transition-colors cursor-pointer">Dashboard</span>
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-primary font-title-md text-title-md font-semibold">Accounts</span>
            <span
              class="ml-space-sm px-space-xs py-[2px] rounded bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
              >Arbiter Desk</span
            >
          </div>
          <div
            class="flex flex-col md:flex-row md:items-end justify-between gap-space-md mt-space-xs"
          >
            <div>
              <h1
                class="font-headline-lg text-headline-lg text-on-surface tracking-tight font-bold"
              >
                Account Management
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant mt-space-xs max-w-2xl">
                Manage club player accounts, verification dossiers, and role privileges across Swiss
                and Round Robin ladders.
              </p>
            </div>
            <!-- Bulk & Global Exports -->
            <div class="flex items-center gap-space-sm flex-wrap">
              <div class="relative inline-block text-left" id="batchDropdownContainer">
                <button
                  class="flex items-center gap-space-xs px-space-md py-space-sm rounded bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors text-title-md font-title-md shadow-sm"
                  id="batchBtn"
                  type="button"
                  v-preview-disclosure="'batchMenu'"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >checklist</span
                  >
                  <span>Batch Actions</span>
                  <span
                    class="material-symbols-outlined text-[18px] text-outline"
                    aria-hidden="true"
                    >expand_more</span
                  >
                </button>
                <div
                  class="hidden absolute right-0 mt-2 w-56 rounded bg-surface-container-highest shadow-xl z-30 p-space-xs flex flex-col gap-1 preview-disclosure preview-disclosure-flex"
                  id="batchMenu"
                >
                  <button
                    class="flex items-center gap-space-sm px-space-md py-space-xs text-left text-body-md font-body-md text-on-surface hover:bg-surface-container-low rounded transition-colors"
                    disabled
                    title="Design preview"
                  >
                    <span
                      class="material-symbols-outlined text-[18px] text-primary"
                      aria-hidden="true"
                      >verified</span
                    >
                    <span>Approve Selected (0)</span>
                  </button>
                  <button
                    class="flex items-center gap-space-sm px-space-md py-space-xs text-left text-body-md font-body-md text-on-surface hover:bg-surface-container-low rounded transition-colors"
                    disabled
                    title="Design preview"
                  >
                    <span
                      class="material-symbols-outlined text-[18px] text-outline"
                      aria-hidden="true"
                      >mail</span
                    >
                    <span>Send Verification Blast</span>
                  </button>
                  <button
                    class="flex items-center gap-space-sm px-space-md py-space-xs text-left text-body-md font-body-md text-error hover:bg-surface-container-low rounded transition-colors"
                    disabled
                    title="Design preview"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >block</span
                    >
                    <span>Suspend Selected</span>
                  </button>
                </div>
              </div>
              <button
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded bg-surface-container-high text-on-surface hover:bg-surface-variant transition-colors text-title-md font-title-md shadow-sm"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px] text-outline" aria-hidden="true"
                  >download</span
                >
                <span>Export CSV</span>
              </button>
              <button
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded bg-primary text-on-primary hover:bg-primary-fixed-dim transition-colors text-title-md font-title-md shadow-sm font-semibold"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >person_add</span
                >
                <span>Invite Competitor</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Metric Gauges Row -->
        <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-space-md mb-space-lg">
          <!-- Stat 1 -->
          <div
            class="relative overflow-hidden rounded bg-surface-container-low p-space-md flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Total Registered</span
              >
              <div
                class="w-8 h-8 rounded bg-surface-container flex items-center justify-center text-outline"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">badge</span>
              </div>
            </div>
            <div class="flex items-baseline justify-between mt-space-md">
              <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface">164</span>
              <span
                class="font-label-badge text-label-badge text-secondary flex items-center gap-[2px]"
              >
                <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                  >arrow_upward</span
                >
                +14 this wk
              </span>
            </div>
            <div
              class="w-full bg-surface-container-highest h-1 rounded-full mt-space-sm overflow-hidden"
            >
              <div class="bg-outline h-full w-[82%]"></div>
            </div>
          </div>
          <!-- Stat 2 -->
          <div
            class="relative overflow-hidden rounded bg-surface-container-low p-space-md flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Pending Verification</span
              >
              <div
                class="w-8 h-8 rounded bg-surface-container flex items-center justify-center text-tertiary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >hourglass_top</span
                >
              </div>
            </div>
            <div class="flex items-baseline justify-between mt-space-md">
              <span class="font-label-numeric-lg text-label-numeric-lg text-tertiary">7</span>
              <span
                class="px-space-xs py-[2px] rounded bg-tertiary-container/30 text-tertiary font-label-badge text-label-badge"
                >Needs Review</span
              >
            </div>
            <div
              class="w-full bg-surface-container-highest h-1 rounded-full mt-space-sm overflow-hidden"
            >
              <div class="bg-tertiary-container h-full w-[24%]"></div>
            </div>
          </div>
          <!-- Stat 3 -->
          <div
            class="relative overflow-hidden rounded bg-surface-container-low p-space-md flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Active Competitors</span
              >
              <div
                class="w-8 h-8 rounded bg-surface-container flex items-center justify-center text-primary"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >sports_esports</span
                >
              </div>
            </div>
            <div class="flex items-baseline justify-between mt-space-md">
              <span class="font-label-numeric-lg text-label-numeric-lg text-primary">142</span>
              <span
                class="px-space-xs py-[2px] rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge font-semibold"
                >92.4% Verified</span
              >
            </div>
            <div
              class="w-full bg-surface-container-highest h-1 rounded-full mt-space-sm overflow-hidden"
            >
              <div class="bg-primary h-full w-[92%]"></div>
            </div>
          </div>
          <!-- Stat 4 -->
          <div
            class="relative overflow-hidden rounded bg-surface-container-low p-space-md flex flex-col justify-between shadow-sm"
          >
            <div class="flex items-center justify-between">
              <span class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Sanctions / Inactive</span
              >
              <div
                class="w-8 h-8 rounded bg-surface-container flex items-center justify-center text-error"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true">gavel</span>
              </div>
            </div>
            <div class="flex items-baseline justify-between mt-space-md">
              <div class="flex items-baseline gap-space-xs">
                <span class="font-label-numeric-lg text-label-numeric-lg text-error">3</span>
                <span class="font-body-sm text-body-sm text-outline">susp.</span>
                <span class="text-outline mx-1">/</span>
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface-variant"
                  >12</span
                >
                <span class="font-body-sm text-body-sm text-outline">rej.</span>
              </div>
              <span
                class="px-space-xs py-[2px] rounded bg-error-container text-on-error-container font-label-badge text-label-badge"
                >High Risk</span
              >
            </div>
            <div
              class="w-full bg-surface-container-highest h-1 rounded-full mt-space-sm overflow-hidden"
            >
              <div class="bg-error h-full w-[10%]"></div>
            </div>
          </div>
        </div>
        <!-- Filters & Controls Bar -->
        <div
          class="rounded bg-surface-container p-space-md flex flex-col gap-space-md shadow-sm mb-space-sm"
        >
          <!-- Search and Direct Filters -->
          <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-sm items-center">
            <!-- Search Input -->
            <div class="lg:col-span-5 relative flex items-center">
              <span
                class="material-symbols-outlined absolute left-space-md text-outline text-[20px]"
                aria-hidden="true"
                >search</span
              >
              <input
                class="w-full bg-surface-container-lowest text-on-surface placeholder:text-outline text-body-md font-body-md pl-11 pr-space-md py-space-sm rounded focus:outline-none focus:ring-1 focus:ring-primary shadow-inner"
                placeholder="Search by player name, email, or handle..."
                type="text"
              />
            </div>
            <!-- Role Filter -->
            <div class="lg:col-span-2 relative">
              <select
                class="w-full bg-surface-container-lowest text-on-surface text-body-md font-body-md px-space-md py-space-sm rounded focus:outline-none focus:ring-1 focus:ring-primary appearance-none cursor-pointer"
              >
                <option value="all">Role: All Assigned</option>
                <option value="player">Role: Player</option>
                <option value="arbiter">Role: Arbiter</option>
                <option value="admin">Role: Club Admin</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-space-sm top-1/2 -translate-y-1/2 pointer-events-none text-outline text-[18px]"
                aria-hidden="true"
                >unfold_more</span
              >
            </div>
            <!-- Experience Filter -->
            <div class="lg:col-span-2 relative">
              <select
                class="w-full bg-surface-container-lowest text-on-surface text-body-md font-body-md px-space-md py-space-sm rounded focus:outline-none focus:ring-1 focus:ring-primary appearance-none cursor-pointer"
              >
                <option value="all">Level: All Tiers</option>
                <option value="beginner">Beginner (&lt;1200)</option>
                <option value="intermediate">Intermediate (1200-1800)</option>
                <option value="advanced">Advanced (1800+)</option>
              </select>
              <span
                class="material-symbols-outlined absolute right-space-sm top-1/2 -translate-y-1/2 pointer-events-none text-outline text-[18px]"
                aria-hidden="true"
                >unfold_more</span
              >
            </div>
            <!-- Date Range Picker Simulator -->
            <div
              class="lg:col-span-3 flex items-center gap-space-xs bg-surface-container-lowest px-space-md py-space-sm rounded cursor-pointer hover:bg-surface-container-low transition-colors"
            >
              <span class="material-symbols-outlined text-[18px] text-outline" aria-hidden="true"
                >calendar_today</span
              >
              <span class="text-body-sm font-body-sm text-on-surface-variant truncate"
                >Joined: Last 90 Days (Q1 2025)</span
              >
              <span
                class="material-symbols-outlined text-[16px] text-outline ml-auto"
                aria-hidden="true"
                >arrow_drop_down</span
              >
            </div>
          </div>
          <!-- Status Segmented Pills Filter -->
          <div class="flex items-center justify-between flex-wrap gap-space-sm pt-space-xs">
            <div class="flex items-center gap-space-xs overflow-x-auto pb-1 max-w-full">
              <button
                class="px-space-md py-space-xs rounded bg-primary-container text-on-primary-container font-label-badge text-label-badge font-semibold transition-colors flex items-center gap-space-xs"
                disabled
                title="Design preview"
              >
                <span>All Status</span>
                <span
                  class="bg-on-primary-container/20 text-on-primary-container px-1.5 py-0.5 rounded text-[10px]"
                  >164</span
                >
              </button>
              <button
                class="px-space-md py-space-xs rounded bg-surface-container-lowest text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-label-badge text-label-badge transition-colors flex items-center gap-space-xs"
                disabled
                title="Design preview"
              >
                <span>Pending Review</span>
                <span
                  class="bg-tertiary-container/30 text-tertiary px-1.5 py-0.5 rounded text-[10px]"
                  >7</span
                >
              </button>
              <button
                class="px-space-md py-space-xs rounded bg-surface-container-lowest text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-label-badge text-label-badge transition-colors flex items-center gap-space-xs"
                disabled
                title="Design preview"
              >
                <span>Active</span>
                <span
                  class="bg-secondary-container text-on-secondary-container px-1.5 py-0.5 rounded text-[10px]"
                  >142</span
                >
              </button>
              <button
                class="px-space-md py-space-xs rounded bg-surface-container-lowest text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-label-badge text-label-badge transition-colors flex items-center gap-space-xs"
                disabled
                title="Design preview"
              >
                <span>Suspended</span>
                <span
                  class="bg-error-container text-on-error-container px-1.5 py-0.5 rounded text-[10px]"
                  >3</span
                >
              </button>
              <button
                class="px-space-md py-space-xs rounded bg-surface-container-lowest text-on-surface-variant hover:text-on-surface hover:bg-surface-container-high font-label-badge text-label-badge transition-colors flex items-center gap-space-xs"
                disabled
                title="Design preview"
              >
                <span>Rejected</span>
                <span
                  class="bg-surface-container-highest text-outline px-1.5 py-0.5 rounded text-[10px]"
                  >12</span
                >
              </button>
            </div>
            <div class="flex items-center gap-space-sm text-outline font-body-sm text-body-sm">
              <span class="flex items-center gap-1"
                ><span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span> Arbiter live
                synch active</span
              >
            </div>
          </div>
        </div>
        <!-- Main Standings & User Ledger Table -->
        <div class="rounded bg-surface-container-low overflow-hidden shadow-md flex flex-col">
          <div class="overflow-x-auto w-full">
            <table class="w-full text-left border-collapse">
              <!-- Table Head -->
              <thead>
                <tr
                  class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                >
                  <th class="py-space-md px-space-md w-12 text-center">
                    <input
                      class="w-4 h-4 rounded bg-surface-container-high accent-primary cursor-pointer"
                      type="checkbox"
                    />
                  </th>
                  <th class="py-space-md px-space-md">Player Profile</th>
                  <th class="py-space-md px-space-md">Contact &amp; Auth</th>
                  <th class="py-space-md px-space-md">Skill tier</th>
                  <th class="py-space-md px-space-md">Account Status</th>
                  <th class="py-space-md px-space-md">Registered</th>
                  <th class="py-space-md px-space-md">Last Active</th>
                  <th class="py-space-md px-space-md text-right pr-space-lg">Actions</th>
                </tr>
              </thead>
              <!-- Table Body -->
              <tbody class="divide-y divide-surface-container-high/40">
                <!-- Row 1: Tariq Al-Mansoor (Pending) -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md text-center">
                    <input
                      class="w-4 h-4 rounded bg-surface-container-high accent-primary cursor-pointer"
                      type="checkbox"
                    />
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-10 h-10 rounded-full bg-surface-container-high flex-shrink-0 flex items-center justify-center font-headline-sm text-headline-sm text-secondary overflow-hidden"
                      >
                        <img
                          class="w-full h-full object-cover"
                          data-alt="Portrait photo of Tariq, a focused male Middle Eastern chess grandmaster candidate wearing dark linen blazer under moody tournament spotlighting"
                          src="/images/94d8095c3dad.webp"
                          alt=""
                        />
                      </div>
                      <div class="flex flex-col min-w-0">
                        <div class="flex items-center gap-space-xs">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold truncate"
                            >Tariq Al-Mansoor</span
                          >
                          <span
                            class="px-1.5 py-0.5 rounded bg-primary-container text-on-primary-container text-[10px] font-bold font-label-badge uppercase"
                            >FM</span
                          >
                        </div>
                        <span class="font-body-sm text-body-sm text-outline font-mono truncate"
                          >@tariq_chess</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >tariq@chesshub.io</span
                      >
                      <span
                        class="flex items-center gap-1 font-body-sm text-body-sm text-secondary"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >mark_email_read</span
                        >
                        Domain Verified
                      </span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="inline-flex items-center w-max px-space-xs py-[2px] rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge font-semibold"
                      >
                        Advanced
                      </span>
                      <span class="font-label-numeric-md text-label-numeric-md text-primary mt-0.5"
                        >2184 FIDE</span
                      >
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-0.5">
                      <span
                        class="inline-flex items-center gap-1 px-space-xs py-[2px] rounded bg-tertiary-container/20 text-tertiary font-label-badge text-label-badge font-semibold w-max"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-tertiary animate-ping"></span>
                        PENDING
                      </span>
                      <span class="font-body-sm text-body-sm text-outline">Application queued</span>
                    </div>
                  </td>
                  <td
                    class="py-space-sm px-space-md text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    Today, 12:28
                  </td>
                  <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                    2 hours ago
                  </td>
                  <td class="py-space-sm px-space-md text-right pr-space-lg">
                    <div class="flex items-center justify-end gap-space-xs">
                      <button
                        class="px-space-sm py-1 rounded bg-primary text-on-primary font-label-badge text-label-badge font-semibold hover:bg-primary-fixed-dim transition-colors flex items-center gap-1"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >check</span
                        >
                        Approve
                      </button>
                      <button
                        class="px-space-sm py-1 rounded bg-surface-container-highest text-error font-label-badge text-label-badge hover:bg-error-container hover:text-on-error-container transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Reject
                      </button>
                      <RouterLink
                        class="p-1 rounded text-outline hover:text-on-surface transition-colors"
                        title="View Dossier"
                        to="/dashboard/accounts/tariq-al-mansoor"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </RouterLink>
                    </div>
                  </td>
                </tr>
                <!-- Row 2: Elena Garcia (Pending) -->
                <tr
                  class="bg-surface-container/30 hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md text-center">
                    <input
                      class="w-4 h-4 rounded bg-surface-container-high accent-primary cursor-pointer"
                      type="checkbox"
                    />
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-10 h-10 rounded-full bg-surface-container-high flex-shrink-0 flex items-center justify-center font-headline-sm text-headline-sm text-on-surface overflow-hidden"
                      >
                        <img
                          class="w-full h-full object-cover"
                          data-alt="Natural expressive portrait of Elena, a young Spanish woman with dark pulled back hair studying a chess opening manual in a modern minimalist wood room"
                          src="/images/bd8aea396523.webp"
                          alt=""
                        />
                      </div>
                      <div class="flex flex-col min-w-0">
                        <span
                          class="font-title-md text-title-md text-on-surface font-semibold truncate"
                          >Elena Garcia</span
                        >
                        <span class="font-body-sm text-body-sm text-outline font-mono truncate"
                          >@elena_g</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >elena.garcia@mail.com</span
                      >
                      <span class="flex items-center gap-1 font-body-sm text-body-sm text-outline">
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >mail</span
                        >
                        Unverified Email
                      </span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="inline-flex items-center w-max px-space-xs py-[2px] rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-semibold"
                      >
                        Beginner
                      </span>
                      <span class="font-label-numeric-md text-label-numeric-md text-outline mt-0.5"
                        >Unranked</span
                      >
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-0.5">
                      <span
                        class="inline-flex items-center gap-1 px-space-xs py-[2px] rounded bg-tertiary-container/20 text-tertiary font-label-badge text-label-badge font-semibold w-max"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-tertiary animate-pulse"></span>
                        PENDING
                      </span>
                      <span class="font-body-sm text-body-sm text-outline">First-time entrant</span>
                    </div>
                  </td>
                  <td
                    class="py-space-sm px-space-md text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    Today, 09:14
                  </td>
                  <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                    5 hours ago
                  </td>
                  <td class="py-space-sm px-space-md text-right pr-space-lg">
                    <div class="flex items-center justify-end gap-space-xs">
                      <button
                        class="px-space-sm py-1 rounded bg-primary text-on-primary font-label-badge text-label-badge font-semibold hover:bg-primary-fixed-dim transition-colors flex items-center gap-1"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >check</span
                        >
                        Approve
                      </button>
                      <button
                        class="px-space-sm py-1 rounded bg-surface-container-highest text-error font-label-badge text-label-badge hover:bg-error-container hover:text-on-error-container transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Reject
                      </button>
                      <RouterLink
                        class="p-1 rounded text-outline hover:text-on-surface transition-colors"
                        title="View Dossier"
                        to="/dashboard/accounts/tariq-al-mansoor"
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >visibility</span
                        >
                      </RouterLink>
                    </div>
                  </td>
                </tr>
                <!-- Row 3: Adam Chen (Active) -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md text-center">
                    <input
                      class="w-4 h-4 rounded bg-surface-container-high accent-primary cursor-pointer"
                      type="checkbox"
                    />
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-10 h-10 rounded-full bg-surface-container-high flex-shrink-0 flex items-center justify-center font-headline-sm text-headline-sm text-on-surface overflow-hidden"
                      >
                        <img
                          class="w-full h-full object-cover"
                          data-alt="Sharp portrait profile of Adam Chen, East Asian professional chess player with thin rimmed glasses against an out-of-focus analytical chessboard display screen"
                          src="/images/f40a356ec49c.webp"
                          alt=""
                        />
                      </div>
                      <div class="flex flex-col min-w-0">
                        <div class="flex items-center gap-space-xs">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold truncate"
                            >Adam Chen</span
                          >
                          <span
                            class="px-1.5 py-0.5 rounded bg-surface-container-highest text-secondary text-[10px] font-bold font-label-badge uppercase"
                            >IM</span
                          >
                        </div>
                        <span class="font-body-sm text-body-sm text-outline font-mono truncate"
                          >@adam_chen</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >adam@club.io</span
                      >
                      <span
                        class="flex items-center gap-1 font-body-sm text-body-sm text-secondary"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >verified</span
                        >
                        KYC Completed
                      </span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="inline-flex items-center w-max px-space-xs py-[2px] rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge font-semibold"
                      >
                        Advanced
                      </span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-on-surface mt-0.5"
                        >2410 FIDE</span
                      >
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-0.5">
                      <span
                        class="inline-flex items-center gap-1 px-space-xs py-[2px] rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge font-semibold w-max"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span> ACTIVE
                      </span>
                      <span class="font-body-sm text-body-sm text-outline">Tournament Ready</span>
                    </div>
                  </td>
                  <td
                    class="py-space-sm px-space-md text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    14 Oct 2023
                  </td>
                  <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                    18 mins ago
                  </td>
                  <td class="py-space-sm px-space-md text-right pr-space-lg">
                    <div class="flex items-center justify-end gap-space-xs">
                      <RouterLink
                        class="px-space-sm py-1 rounded bg-surface-container-high text-on-surface font-label-badge text-label-badge hover:bg-surface-variant transition-colors"
                        to="/dashboard/accounts/tariq-al-mansoor"
                      >
                        View Profile
                      </RouterLink>
                      <button
                        class="px-space-sm py-1 rounded bg-surface-container-high text-outline hover:text-error hover:bg-error-container hover:text-on-error-container font-label-badge text-label-badge transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Suspend
                      </button>
                      <button
                        class="p-1 rounded text-outline hover:text-on-surface transition-colors"
                        title="Download Arbiter Dossier"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >folder_shared</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 4: Youssef Mansour (Active) -->
                <tr
                  class="bg-surface-container/30 hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md text-center">
                    <input
                      class="w-4 h-4 rounded bg-surface-container-high accent-primary cursor-pointer"
                      type="checkbox"
                    />
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-10 h-10 rounded-full bg-surface-container-high flex-shrink-0 flex items-center justify-center font-headline-sm text-headline-sm text-secondary overflow-hidden"
                      >
                        <img
                          class="w-full h-full object-cover"
                          data-alt="Headshot of Youssef Mansour, a North African tournament player with neatly trimmed beard smiling subtly against matte dark charcoal studio backdrop"
                          src="/images/88ad323f8514.webp"
                          alt=""
                        />
                      </div>
                      <div class="flex flex-col min-w-0">
                        <div class="flex items-center gap-space-xs">
                          <span
                            class="font-title-md text-title-md text-on-surface font-semibold truncate"
                            >Youssef Mansour</span
                          >
                        </div>
                        <span class="font-body-sm text-body-sm text-outline font-mono truncate"
                          >@youssef_m</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-body-md text-body-md text-on-surface truncate"
                        >youssef@chesshub.io</span
                      >
                      <span
                        class="flex items-center gap-1 font-body-sm text-body-sm text-secondary"
                      >
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >mark_email_read</span
                        >
                        Domain Verified
                      </span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="inline-flex items-center w-max px-space-xs py-[2px] rounded bg-surface-container-highest text-on-surface font-label-badge text-label-badge font-semibold"
                      >
                        Intermediate
                      </span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-on-surface-variant mt-0.5"
                        >Club player</span
                      >
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-0.5">
                      <span
                        class="inline-flex items-center gap-1 px-space-xs py-[2px] rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge font-semibold w-max"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span> ACTIVE
                      </span>
                      <span class="font-body-sm text-body-sm text-outline"
                        >Registered Season 4</span
                      >
                    </div>
                  </td>
                  <td
                    class="py-space-sm px-space-md text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    08 Jan 2024
                  </td>
                  <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                    Yesterday, 21:05
                  </td>
                  <td class="py-space-sm px-space-md text-right pr-space-lg">
                    <div class="flex items-center justify-end gap-space-xs">
                      <RouterLink
                        class="px-space-sm py-1 rounded bg-surface-container-high text-on-surface font-label-badge text-label-badge hover:bg-surface-variant transition-colors"
                        to="/dashboard/accounts/tariq-al-mansoor"
                      >
                        View Profile
                      </RouterLink>
                      <button
                        class="px-space-sm py-1 rounded bg-surface-container-high text-outline hover:text-error hover:bg-error-container hover:text-on-error-container font-label-badge text-label-badge transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Suspend
                      </button>
                      <button
                        class="p-1 rounded text-outline hover:text-on-surface transition-colors"
                        title="Download Arbiter Dossier"
                        type="button"
                        disabled
                      >
                        <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                          >folder_shared</span
                        >
                      </button>
                    </div>
                  </td>
                </tr>
                <!-- Row 5: Liam Novak (Suspended) -->
                <tr
                  class="bg-surface-container-low hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md text-center">
                    <input
                      class="w-4 h-4 rounded bg-surface-container-high accent-primary cursor-pointer"
                      type="checkbox"
                    />
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-10 h-10 rounded-full bg-surface-container-high flex-shrink-0 flex items-center justify-center font-headline-sm text-headline-sm text-error overflow-hidden"
                      >
                        <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                          >person_off</span
                        >
                      </div>
                      <div class="flex flex-col min-w-0">
                        <span
                          class="font-title-md text-title-md text-on-surface font-semibold truncate"
                          >Liam Novak</span
                        >
                        <span class="font-body-sm text-body-sm text-outline font-mono truncate"
                          >@novak_l</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-body-md text-body-md text-on-surface-variant truncate"
                        >liam.novak@gmail.com</span
                      >
                      <span class="flex items-center gap-1 font-body-sm text-body-sm text-error">
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >warning</span
                        >
                        Sanctioned Flag
                      </span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="inline-flex items-center w-max px-space-xs py-[2px] rounded bg-surface-container-highest text-on-surface-variant font-label-badge text-label-badge font-semibold"
                      >
                        Intermediate
                      </span>
                      <span class="font-label-numeric-md text-label-numeric-md text-outline mt-0.5"
                        >Club player</span
                      >
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-0.5">
                      <span
                        class="inline-flex items-center gap-1 px-space-xs py-[2px] rounded bg-error-container text-on-error-container font-label-badge text-label-badge font-semibold w-max"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-error"></span> SUSPENDED
                      </span>
                      <span
                        class="font-body-sm text-body-sm text-error/90 max-w-xs truncate"
                        title="Unsportsmanlike conduct in Round 4"
                      >
                        Unsportsmanlike conduct in Round 4
                      </span>
                    </div>
                  </td>
                  <td
                    class="py-space-sm px-space-md text-on-surface-variant font-label-numeric-md text-label-numeric-md"
                  >
                    19 Apr 2024
                  </td>
                  <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                    3 days ago
                  </td>
                  <td class="py-space-sm px-space-md text-right pr-space-lg">
                    <div class="flex items-center justify-end gap-space-xs">
                      <button
                        class="px-space-sm py-1 rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge font-semibold hover:bg-secondary hover:text-on-secondary transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Reactivate
                      </button>
                      <RouterLink
                        class="px-space-sm py-1 rounded bg-surface-container-high text-on-surface-variant hover:text-on-surface font-label-badge text-label-badge transition-colors"
                        to="/dashboard/activity-logs"
                      >
                        View Audit
                      </RouterLink>
                    </div>
                  </td>
                </tr>
                <!-- Row 6: David Miller (Rejected) -->
                <tr
                  class="bg-surface-container/30 hover:bg-surface-container transition-colors group"
                >
                  <td class="py-space-sm px-space-md text-center">
                    <input
                      class="w-4 h-4 rounded bg-surface-container-high accent-primary cursor-pointer"
                      type="checkbox"
                    />
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex items-center gap-space-sm">
                      <div
                        class="w-10 h-10 rounded-full bg-surface-container-high flex-shrink-0 flex items-center justify-center font-headline-sm text-headline-sm text-outline overflow-hidden"
                      >
                        <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                          >block</span
                        >
                      </div>
                      <div class="flex flex-col min-w-0">
                        <span
                          class="font-title-md text-title-md text-on-surface-variant font-semibold truncate"
                          >David Miller</span
                        >
                        <span class="font-body-sm text-body-sm text-outline font-mono truncate"
                          >@dmiller</span
                        >
                      </div>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span class="font-body-md text-body-md text-outline truncate"
                        >dmiller@web.de</span
                      >
                      <span class="flex items-center gap-1 font-body-sm text-body-sm text-outline">
                        <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                          >cancel</span
                        >
                        Rejected Verification
                      </span>
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col">
                      <span
                        class="inline-flex items-center w-max px-space-xs py-[2px] rounded bg-surface-container-highest text-outline font-label-badge text-label-badge font-semibold"
                      >
                        Beginner
                      </span>
                      <span class="font-label-numeric-md text-label-numeric-md text-outline mt-0.5"
                        >Unranked</span
                      >
                    </div>
                  </td>
                  <td class="py-space-sm px-space-md">
                    <div class="flex flex-col gap-0.5">
                      <span
                        class="inline-flex items-center gap-1 px-space-xs py-[2px] rounded bg-surface-container-highest text-outline font-label-badge text-label-badge font-semibold w-max"
                      >
                        REJECTED
                      </span>
                      <span
                        class="font-body-sm text-body-sm text-outline truncate max-w-xs"
                        title="Duplicate profile attempt"
                      >
                        Duplicate profile attempt
                      </span>
                    </div>
                  </td>
                  <td
                    class="py-space-sm px-space-md text-outline font-label-numeric-md text-label-numeric-md"
                  >
                    02 Mar 2025
                  </td>
                  <td class="py-space-sm px-space-md text-outline font-body-sm text-body-sm">
                    12 days ago
                  </td>
                  <td class="py-space-sm px-space-md text-right pr-space-lg">
                    <div class="flex items-center justify-end gap-space-xs">
                      <RouterLink
                        class="px-space-sm py-1 rounded bg-surface-container-high text-on-surface-variant hover:text-on-surface font-label-badge text-label-badge transition-colors"
                        to="/dashboard/accounts/tariq-al-mansoor"
                      >
                        Review Application
                      </RouterLink>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
          <!-- Table Bottom Navigation & Pagination -->
          <div
            class="bg-surface-container-lowest px-space-lg py-space-md flex flex-col sm:flex-row items-center justify-between gap-space-md"
          >
            <div class="flex items-center gap-space-sm text-outline font-body-sm text-body-sm">
              <span
                >Showing
                <strong class="text-on-surface font-label-numeric-md text-label-numeric-md"
                  >1</strong
                >
                to
                <strong class="text-on-surface font-label-numeric-md text-label-numeric-md"
                  >6</strong
                >
                of
                <strong class="text-on-surface font-label-numeric-md text-label-numeric-md"
                  >164</strong
                >
                registered competitors</span
              >
              <span class="hidden sm:inline">|</span>
              <div class="hidden sm:flex items-center gap-1">
                <span>Rows per page:</span>
                <select
                  class="bg-surface-container-high text-on-surface rounded px-space-xs py-[2px] font-label-numeric-md text-label-numeric-md focus:outline-none"
                >
                  <option>10</option>
                  <option selected>20</option>
                  <option>50</option>
                </select>
              </div>
            </div>
            <!-- Pagination Buttons -->
            <div class="flex items-center gap-1">
              <button
                class="w-8 h-8 rounded bg-surface-container-high text-outline hover:text-on-surface flex items-center justify-center disabled:opacity-40 transition-colors"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >keyboard_double_arrow_left</span
                >
              </button>
              <button
                class="w-8 h-8 rounded bg-surface-container-high text-outline hover:text-on-surface flex items-center justify-center disabled:opacity-40 transition-colors"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >chevron_left</span
                >
              </button>
              <button
                class="w-8 h-8 rounded bg-primary text-on-primary font-label-numeric-md text-label-numeric-md font-semibold flex items-center justify-center"
                disabled
                title="Design preview"
              >
                1
              </button>
              <button
                class="w-8 h-8 rounded bg-surface-container-high text-on-surface-variant hover:text-on-surface font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                2
              </button>
              <button
                class="w-8 h-8 rounded bg-surface-container-high text-on-surface-variant hover:text-on-surface font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                3
              </button>
              <span class="text-outline px-1">...</span>
              <button
                class="w-8 h-8 rounded bg-surface-container-high text-on-surface-variant hover:text-on-surface font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                17
              </button>
              <button
                class="w-8 h-8 rounded bg-surface-container-high text-outline hover:text-on-surface flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >chevron_right</span
                >
              </button>
              <button
                class="w-8 h-8 rounded bg-surface-container-high text-outline hover:text-on-surface flex items-center justify-center transition-colors"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >keyboard_double_arrow_right</span
                >
              </button>
            </div>
          </div>
        </div>
        <!-- Arbiter Audit & Quick Rules Reference Callout Bento -->
        <div class="grid grid-cols-1 lg:grid-cols-3 gap-space-md mt-space-lg mb-space-xl">
          <div
            class="rounded bg-surface-container-low p-space-md flex flex-col gap-space-xs shadow-sm"
          >
            <div class="flex items-center gap-space-xs text-secondary">
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                >verified_user</span
              >
              <span class="font-title-md text-title-md font-semibold text-on-surface"
                >Auto-Verification Trigger</span
              >
            </div>
            <p class="font-body-sm text-body-sm text-on-surface-variant mt-1">
              FIDE titled arbiters or players with valid linked Verified profiles are flagged for
              streamlined single-click pass-through.
            </p>
          </div>
          <div
            class="rounded bg-surface-container-low p-space-md flex flex-col gap-space-xs shadow-sm"
          >
            <div class="flex items-center gap-space-xs text-tertiary">
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                >lock_clock</span
              >
              <span class="font-title-md text-title-md font-semibold text-on-surface"
                >Fair-Play Sanction Policy</span
              >
            </div>
            <p class="font-body-sm text-body-sm text-on-surface-variant mt-1">
              Suspensions require formal Arbiter rationale and are synchronized with the Central
              League Registry. Players are immediately pulled from next round Swiss pairings.
            </p>
          </div>
          <div
            class="rounded bg-surface-container-low p-space-md flex flex-col gap-space-xs shadow-sm"
          >
            <div class="flex items-center gap-space-xs text-primary">
              <span class="material-symbols-outlined text-[20px]" aria-hidden="true">database</span>
              <span class="font-title-md text-title-md font-semibold text-on-surface"
                >Club Roster Sync</span
              >
            </div>
            <p class="font-body-sm text-body-sm text-on-surface-variant mt-1">
              Weekly ledger exports generate automated FIDE TRF paired reports. Next automated cloud
              synchronization scheduled in <strong>2h 31m</strong>.
            </p>
          </div>
        </div>
        <!-- Slide-out Modal / Drawer for Sanction (Reject / Suspend) -->
        <div
          class="hidden fixed inset-0 bg-surface-container-lowest/80 backdrop-blur-sm z-50 flex items-center justify-center p-space-md"
          id="sanctionModalBackdrop"
        >
          <div
            class="relative w-full max-w-lg rounded-xl bg-surface-container-high shadow-2xl p-space-lg flex flex-col gap-space-md"
          >
            <!-- Modal Header -->
            <div class="flex items-center justify-between">
              <div class="flex items-center gap-space-sm">
                <div
                  class="w-10 h-10 rounded bg-error-container text-on-error-container flex items-center justify-center"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >gavel</span
                  >
                </div>
                <div>
                  <h3
                    class="font-headline-sm text-headline-sm text-on-surface font-semibold"
                    id="modalTitle"
                  >
                    Account Action
                  </h3>
                  <p class="font-body-sm text-body-sm text-outline" id="modalSubtitle">
                    Target: Tariq Al-Mansoor
                  </p>
                </div>
              </div>
              <button
                class="text-outline hover:text-on-surface transition-colors p-1"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[22px]" aria-hidden="true">close</span>
              </button>
            </div>
            <!-- Action Type Selection -->
            <div class="flex flex-col gap-space-xs">
              <label class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                >Sanction Category</label
              >
              <div class="grid grid-cols-2 gap-space-xs">
                <label
                  class="flex items-center gap-2 p-space-sm rounded bg-surface-container-lowest cursor-pointer hover:bg-surface-container transition-colors"
                >
                  <input
                    checked
                    class="accent-primary"
                    name="sanctionType"
                    type="radio"
                    value="suspend"
                  />
                  <span class="font-title-md text-title-md text-on-surface">Suspend Player</span>
                </label>
                <label
                  class="flex items-center gap-2 p-space-sm rounded bg-surface-container-lowest cursor-pointer hover:bg-surface-container transition-colors"
                >
                  <input class="accent-primary" name="sanctionType" type="radio" value="reject" />
                  <span class="font-title-md text-title-md text-on-surface"
                    >Reject Application</span
                  >
                </label>
              </div>
            </div>
            <!-- Reason Textarea -->
            <div class="flex flex-col gap-space-xs">
              <div class="flex justify-between items-center">
                <label
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  for="sanctionReason"
                  >Mandatory Arbiter Log Reason *</label
                >
                <span class="font-body-sm text-body-sm text-outline"
                  >Visible to player &amp; arbiters</span
                >
              </div>
              <textarea
                class="w-full bg-surface-container-lowest text-on-surface placeholder:text-outline text-body-md font-body-md p-space-md rounded focus:outline-none focus:ring-1 focus:ring-error shadow-inner resize-none"
                id="sanctionReason"
                placeholder="Specify clear violation details (e.g., Unsportsmanlike conduct in Round 4, engine correlation detection, identity mismatch, duplicate registration)..."
                rows="4"
              ></textarea>
            </div>
            <!-- Duration (if suspend) -->
            <div
              class="flex items-center justify-between bg-surface-container-lowest p-space-sm rounded"
            >
              <div class="flex items-center gap-space-xs">
                <span class="material-symbols-outlined text-[18px] text-outline" aria-hidden="true"
                  >timer</span
                >
                <span class="font-body-md text-body-md text-on-surface">Sanction Term:</span>
              </div>
              <select
                class="bg-surface-container-high text-on-surface text-body-md font-body-md px-space-sm py-1 rounded focus:outline-none"
              >
                <option>1 Tournament Cycle (14 Days)</option>
                <option>Full Season (90 Days)</option>
                <option>Indefinite Arbiter Review</option>
              </select>
            </div>
            <!-- Confirm / Cancel buttons -->
            <div class="flex items-center justify-end gap-space-sm pt-space-xs">
              <button
                class="px-space-md py-space-sm rounded bg-surface-container-lowest text-on-surface hover:bg-surface-variant font-title-md text-title-md transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel
              </button>
              <button
                class="px-space-lg py-space-sm rounded bg-error text-on-error font-title-md text-title-md font-semibold hover:bg-opacity-90 transition-colors flex items-center gap-1 shadow-md"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                  >verified</span
                >
                <span>Apply Sanction</span>
              </button>
            </div>
          </div>
        </div>
        <!-- Notification Toast Simulated Banner -->
        <div
          class="fixed bottom-6 right-6 hidden z-50 transform transition-all duration-300 translate-y-2 opacity-0"
          id="toastNotification"
        >
          <div
            class="flex items-center gap-space-sm px-space-md py-space-sm rounded-lg bg-surface-container-highest text-on-surface shadow-2xl"
          >
            <span
              class="material-symbols-outlined text-primary text-[20px]"
              id="toastIcon"
              aria-hidden="true"
              >check_circle</span
            >
            <span class="font-title-md text-title-md" id="toastMessage"
              >Action completed successfully</span
            >
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
