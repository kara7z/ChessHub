<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-space-xl">
        <!-- Subtle ambient glow background decoration -->
        <div class="relative w-full overflow-clip">
          <div
            class="absolute -top-16 -right-16 w-96 h-96 bg-primary-container/10 rounded-full blur-3xl pointer-events-none -z-10"
          ></div>
          <div
            class="absolute top-48 left-1/3 w-64 h-64 bg-tertiary-container/5 rounded-full blur-3xl pointer-events-none -z-10"
          ></div>
          <!-- Header & Action Section -->
          <div
            class="flex flex-col lg:flex-row lg:items-end justify-between gap-space-md pt-space-md pb-space-lg"
          >
            <div class="flex flex-col gap-space-xs max-w-3xl">
              <div class="flex items-center gap-space-xs">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-primary font-semibold px-space-xs py-0.5 rounded bg-secondary-container/30"
                  >Tactical Engine v17</span
                >
                <span class="text-outline text-body-sm">•</span>
                <span class="font-label-badge text-label-badge text-outline">Arbiter Registry</span>
              </div>
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                Chess Tricks &amp; Tactical Patterns Desk
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant">
                Curate interactive tactical puzzles, opening traps, and instructional FEN patterns
                for club players.
              </p>
            </div>
            <div class="flex items-center gap-space-sm self-start lg:self-auto">
              <button
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface font-title-md text-title-md shadow-sm transition-colors cursor-pointer"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[18px] text-outline" aria-hidden="true"
                  >download</span
                >
                <span>Export Lessons CSV</span>
              </button>
              <button
                class="flex items-center gap-space-xs px-space-md py-space-sm rounded-lg bg-primary-container hover:bg-primary text-on-primary-container font-title-md text-title-md font-semibold shadow-md transition-all cursor-pointer"
                type="button"
                disabled
                title="Design preview"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >add_circle</span
                >
                <span>Create New Trick</span>
              </button>
            </div>
          </div>
          <!-- 4 Overview Metric Cards -->
          <div class="grid grid-cols-1 sm:grid-cols-2 xl:grid-cols-4 gap-gutter mb-space-lg">
            <!-- Metric 1 -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-start justify-between">
                <div class="flex flex-col">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-space-xs"
                    >Pattern Library</span
                  >
                  <div class="flex items-baseline gap-space-xs">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                      >248</span
                    >
                    <span class="font-title-md text-title-md text-primary font-semibold"
                      >Verified</span
                    >
                  </div>
                </div>
                <div
                  class="w-10 h-10 rounded-lg bg-surface-container flex items-center justify-center text-primary"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >extension</span
                  >
                </div>
              </div>
              <div
                class="mt-space-md pt-space-xs flex items-center justify-between text-body-sm font-body-sm text-on-surface-variant"
              >
                <span>Across all tactical categories</span>
                <span class="text-primary font-semibold flex items-center text-[11px]"
                  ><span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >arrow_upward</span
                  >
                  +14 this mo</span
                >
              </div>
              <div
                class="absolute bottom-0 left-0 right-0 h-0.5 bg-primary/30 group-hover:bg-primary transition-colors"
              ></div>
            </div>
            <!-- Metric 2 -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-start justify-between">
                <div class="flex flex-col">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-space-xs"
                    >Thematic Taxonomies</span
                  >
                  <div class="flex items-baseline gap-space-xs">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                      >32</span
                    >
                    <span class="font-title-md text-title-md text-secondary font-semibold"
                      >Tactical Themes</span
                    >
                  </div>
                </div>
                <div
                  class="w-10 h-10 rounded-lg bg-surface-container flex items-center justify-center text-secondary"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >category</span
                  >
                </div>
              </div>
              <div
                class="mt-space-md pt-space-xs flex items-center justify-between text-body-sm font-body-sm text-on-surface-variant"
              >
                <span class="truncate">Greek Gift, Lucena, Smothered Mate...</span>
                <span class="font-label-numeric-md text-label-numeric-md text-outline"
                  >100% active</span
                >
              </div>
              <div
                class="absolute bottom-0 left-0 right-0 h-0.5 bg-secondary/30 group-hover:bg-secondary transition-colors"
              ></div>
            </div>
            <!-- Metric 3 -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-start justify-between">
                <div class="flex flex-col">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-space-xs"
                    >Club Success Metric</span
                  >
                  <div class="flex items-baseline gap-space-xs">
                    <span class="font-label-numeric-lg text-label-numeric-lg text-on-surface"
                      >94.8%</span
                    >
                    <span class="font-title-md text-title-md text-primary font-semibold"
                      >Completion</span
                    >
                  </div>
                </div>
                <div
                  class="w-10 h-10 rounded-lg bg-surface-container flex items-center justify-center text-tertiary"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >task_alt</span
                  >
                </div>
              </div>
              <div
                class="mt-space-md pt-space-xs flex items-center gap-space-sm text-body-sm font-body-sm text-on-surface-variant"
              >
                <div class="w-full bg-surface-container-highest h-1.5 rounded-full overflow-hidden">
                  <div class="bg-primary h-full rounded-full" style="width: 94.8%"></div>
                </div>
                <span
                  class="font-label-numeric-md text-label-numeric-md text-on-surface whitespace-nowrap"
                  >Player Solves</span
                >
              </div>
              <div
                class="absolute bottom-0 left-0 right-0 h-0.5 bg-tertiary/30 group-hover:bg-tertiary transition-colors"
              ></div>
            </div>
            <!-- Metric 4 -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg flex flex-col justify-between shadow-sm relative overflow-hidden group"
            >
              <div class="flex items-start justify-between">
                <div class="flex flex-col">
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline mb-space-xs"
                    >Validation Protocol</span
                  >
                  <div class="flex items-baseline gap-space-xs">
                    <span class="font-headline-sm text-headline-sm text-on-surface font-bold"
                      >Stockfish 17</span
                    >
                  </div>
                </div>
                <div
                  class="w-10 h-10 rounded-lg bg-surface-container flex items-center justify-center text-primary-fixed-dim"
                >
                  <span class="material-symbols-outlined text-[22px]" aria-hidden="true"
                    >memory</span
                  >
                </div>
              </div>
              <div
                class="mt-space-md pt-space-xs flex items-center justify-between text-body-sm font-body-sm text-on-surface-variant"
              >
                <span class="flex items-center gap-1 text-primary">
                  <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                    >verified</span
                  >
                  FEN Lines Verified
                </span>
                <span class="font-label-numeric-md text-label-numeric-md text-outline"
                  >0 errors</span
                >
              </div>
              <div
                class="absolute bottom-0 left-0 right-0 h-0.5 bg-primary-fixed-dim/30 group-hover:bg-primary-fixed-dim transition-colors"
              ></div>
            </div>
          </div>
          <!-- Filter & Search Toolbar -->
          <div
            class="bg-surface-container-low rounded-xl p-space-md mb-space-md flex flex-col lg:flex-row items-stretch lg:items-center justify-between gap-space-md shadow-sm"
          >
            <!-- Search Input -->
            <div class="relative flex-1">
              <span
                class="material-symbols-outlined absolute left-3 top-1/2 -translate-y-1/2 text-outline text-[20px]"
                aria-hidden="true"
                >search</span
              >
              <input
                class="w-full bg-surface-container-lowest text-on-surface placeholder:text-outline font-body-md text-body-md rounded-lg pl-10 pr-space-md py-space-sm outline-none focus:ring-1 focus:ring-primary shadow-inner"
                placeholder="Search tricks by title, ECO code, tactic type, or FEN..."
                type="text"
              />
            </div>
            <!-- Dropdown Filters Group -->
            <div class="flex flex-wrap items-center gap-space-sm">
              <!-- Category Dropdown -->
              <div class="relative min-w-[170px] flex-1 sm:flex-initial">
                <select
                  class="w-full appearance-none bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg px-space-md py-space-sm pr-8 outline-none focus:ring-1 focus:ring-primary cursor-pointer"
                >
                  <option value="all">All Categories</option>
                  <option value="opening_traps">Opening Traps</option>
                  <option value="tactics_combinations">Tactics &amp; Combinations</option>
                  <option value="endgame_finesse">Endgame Finesse</option>
                  <option value="checkmate_patterns">Checkmate Patterns</option>
                  <option value="defense_counterplay">Defense &amp; Counterplay</option>
                </select>
                <span
                  class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                  aria-hidden="true"
                  >expand_more</span
                >
              </div>
              <!-- Difficulty Dropdown -->
              <div class="relative min-w-[140px] flex-1 sm:flex-initial">
                <select
                  class="w-full appearance-none bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg px-space-md py-space-sm pr-8 outline-none focus:ring-1 focus:ring-primary cursor-pointer"
                >
                  <option value="all">All Difficulties</option>
                  <option value="beginner">Beginner</option>
                  <option value="intermediate">Intermediate</option>
                  <option value="advanced">Advanced</option>
                </select>
                <span
                  class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                  aria-hidden="true"
                  >expand_more</span
                >
              </div>
              <!-- Status Dropdown -->
              <div class="relative min-w-[130px] flex-1 sm:flex-initial">
                <select
                  class="w-full appearance-none bg-surface-container-lowest text-on-surface font-body-md text-body-md rounded-lg px-space-md py-space-sm pr-8 outline-none focus:ring-1 focus:ring-primary cursor-pointer"
                >
                  <option value="all">All Statuses</option>
                  <option value="published">Published</option>
                  <option value="draft">Draft</option>
                  <option value="archived">Archived</option>
                </select>
                <span
                  class="material-symbols-outlined absolute right-2.5 top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[18px]"
                  aria-hidden="true"
                  >expand_more</span
                >
              </div>
              <button
                class="p-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high text-outline hover:text-on-surface transition-colors cursor-pointer"
                title="Reset Filters"
                type="button"
                disabled
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >filter_alt_off</span
                >
              </button>
            </div>
          </div>
          <!-- Chess Tricks Management Table -->
          <div class="bg-surface-container-low rounded-xl shadow-sm overflow-hidden">
            <div class="overflow-x-auto">
              <table class="w-full text-left border-collapse">
                <thead>
                  <tr
                    class="bg-surface-container-lowest text-outline font-label-badge text-label-badge uppercase tracking-wider"
                  >
                    <th class="py-space-md px-space-md w-24 text-center" scope="col">
                      Board Preview
                    </th>
                    <th class="py-space-md px-space-md" scope="col">Title &amp; Reference Code</th>
                    <th class="py-space-md px-space-md" scope="col">Category</th>
                    <th class="py-space-md px-space-md" scope="col">Difficulty</th>
                    <th class="py-space-md px-space-md" scope="col">Added Date</th>
                    <th class="py-space-md px-space-md" scope="col">Publication Status</th>
                    <th class="py-space-md px-space-md text-right" scope="col">Actions</th>
                  </tr>
                </thead>
                <tbody
                  class="divide-y divide-surface-container-highest/20 font-body-md text-body-md text-on-surface"
                >
                  <!-- Row 1: Greek Gift Sacrifice -->
                  <tr class="hover:bg-surface-container transition-colors group">
                    <td class="py-space-sm px-space-md text-center">
                      <!-- Mini 8x8 Chess Diagram Thumbnail (SVG Representation) -->
                      <div
                        class="w-14 h-14 mx-auto rounded overflow-hidden shadow-inner bg-surface-container-highest relative flex items-center justify-center p-0.5"
                      >
                        <svg aria-hidden="true" class="w-full h-full rounded" viewBox="0 0 64 64">
                          <rect fill="#303630" height="64" width="64"></rect>
                          <!-- 8x8 alternating squares in emerald/moss palette -->
                          <g fill="#81B64C" opacity="0.85">
                            <rect height="8" width="8" x="8" y="0"></rect>
                            <rect height="8" width="8" x="24" y="0"></rect>
                            <rect height="8" width="8" x="40" y="0"></rect>
                            <rect height="8" width="8" x="56" y="0"></rect>
                            <rect height="8" width="8" x="0" y="8"></rect>
                            <rect height="8" width="8" x="16" y="8"></rect>
                            <rect height="8" width="8" x="32" y="8"></rect>
                            <rect height="8" width="8" x="48" y="8"></rect>
                            <rect height="8" width="8" x="8" y="16"></rect>
                            <rect height="8" width="8" x="24" y="16"></rect>
                            <rect height="8" width="8" x="40" y="16"></rect>
                            <rect height="8" width="8" x="56" y="16"></rect>
                            <rect height="8" width="8" x="0" y="24"></rect>
                            <rect height="8" width="8" x="16" y="24"></rect>
                            <rect height="8" width="8" x="32" y="24"></rect>
                            <rect height="8" width="8" x="48" y="24"></rect>
                            <rect height="8" width="8" x="8" y="32"></rect>
                            <rect height="8" width="8" x="24" y="32"></rect>
                            <rect height="8" width="8" x="40" y="32"></rect>
                            <rect height="8" width="8" x="56" y="32"></rect>
                            <rect height="8" width="8" x="0" y="40"></rect>
                            <rect height="8" width="8" x="16" y="40"></rect>
                            <rect height="8" width="8" x="32" y="40"></rect>
                            <rect height="8" width="8" x="48" y="40"></rect>
                            <rect height="8" width="8" x="8" y="48"></rect>
                            <rect height="8" width="8" x="24" y="48"></rect>
                            <rect height="8" width="8" x="40" y="48"></rect>
                            <rect height="8" width="8" x="56" y="48"></rect>
                            <rect height="8" width="8" x="0" y="56"></rect>
                            <rect height="8" width="8" x="16" y="56"></rect>
                            <rect height="8" width="8" x="32" y="56"></rect>
                            <rect height="8" width="8" x="48" y="56"></rect>
                          </g>
                          <!-- Target strike marker h7 -->
                          <circle cx="52" cy="12" fill="#EF4444" opacity="0.9" r="3.5"></circle>
                          <path
                            d="M52 10 L52 14 M50 12 L54 12"
                            stroke="#FFFFFF"
                            stroke-width="1.2"
                          ></path>
                        </svg>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <div class="flex flex-col">
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface group-hover:text-primary transition-colors"
                          >The Greek Gift Sacrifice — Bxh7+ Tactical Masterclass</span
                        >
                        <div class="flex items-center gap-space-xs mt-0.5">
                          <span
                            class="font-label-badge text-label-badge bg-surface-container px-1.5 py-0.5 rounded text-outline"
                            >ECO: C50</span
                          >
                          <span class="text-outline text-body-sm">•</span>
                          <span class="font-body-sm text-body-sm text-on-surface-variant"
                            >Kingside Decoy Line</span
                          >
                        </div>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center px-space-xs py-0.5 rounded bg-surface-container text-on-surface font-body-sm text-body-sm"
                      >
                        Tactics &amp; Combinations
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-secondary-container/40 text-secondary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Intermediate
                      </span>
                    </td>
                    <td
                      class="py-space-sm px-space-md text-outline font-label-numeric-md text-label-numeric-md"
                    >
                      Apr 12, 2025
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1.5 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-primary-container/20 text-primary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                        Published
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container transition-colors"
                          title="Preview Board"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >visibility</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-primary hover:bg-surface-container transition-colors"
                          title="Edit Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >edit</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-error hover:bg-surface-container transition-colors"
                          title="Delete Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >delete</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Row 2: Blackburne Shilling Gambit -->
                  <tr class="hover:bg-surface-container transition-colors group">
                    <td class="py-space-sm px-space-md text-center">
                      <div
                        class="w-14 h-14 mx-auto rounded overflow-hidden shadow-inner bg-surface-container-highest relative flex items-center justify-center p-0.5"
                      >
                        <svg aria-hidden="true" class="w-full h-full rounded" viewBox="0 0 64 64">
                          <rect fill="#303630" height="64" width="64"></rect>
                          <g fill="#81B64C" opacity="0.85">
                            <rect height="8" width="8" x="8" y="0"></rect>
                            <rect height="8" width="8" x="24" y="0"></rect>
                            <rect height="8" width="8" x="40" y="0"></rect>
                            <rect height="8" width="8" x="56" y="0"></rect>
                            <rect height="8" width="8" x="0" y="8"></rect>
                            <rect height="8" width="8" x="16" y="8"></rect>
                            <rect height="8" width="8" x="32" y="8"></rect>
                            <rect height="8" width="8" x="48" y="8"></rect>
                            <rect height="8" width="8" x="8" y="16"></rect>
                            <rect height="8" width="8" x="24" y="16"></rect>
                            <rect height="8" width="8" x="40" y="16"></rect>
                            <rect height="8" width="8" x="56" y="16"></rect>
                            <rect height="8" width="8" x="0" y="24"></rect>
                            <rect height="8" width="8" x="16" y="24"></rect>
                            <rect height="8" width="8" x="32" y="24"></rect>
                            <rect height="8" width="8" x="48" y="24"></rect>
                            <rect height="8" width="8" x="8" y="32"></rect>
                            <rect height="8" width="8" x="24" y="32"></rect>
                            <rect height="8" width="8" x="40" y="32"></rect>
                            <rect height="8" width="8" x="56" y="32"></rect>
                            <rect height="8" width="8" x="0" y="40"></rect>
                            <rect height="8" width="8" x="16" y="40"></rect>
                            <rect height="8" width="8" x="32" y="40"></rect>
                            <rect height="8" width="8" x="48" y="40"></rect>
                            <rect height="8" width="8" x="8" y="48"></rect>
                            <rect height="8" width="8" x="24" y="48"></rect>
                            <rect height="8" width="8" x="40" y="48"></rect>
                            <rect height="8" width="8" x="56" y="48"></rect>
                            <rect height="8" width="8" x="0" y="56"></rect>
                            <rect height="8" width="8" x="16" y="56"></rect>
                            <rect height="8" width="8" x="32" y="56"></rect>
                            <rect height="8" width="8" x="48" y="56"></rect>
                          </g>
                          <!-- Knight leap indicator e4 -> d4 -->
                          <circle cx="28" cy="36" fill="#AFD190" r="3"></circle>
                          <circle cx="36" cy="28" fill="#EF4444" r="2.5"></circle>
                          <line
                            stroke="#AFD190"
                            stroke-dasharray="2,2"
                            stroke-width="1.5"
                            x1="28"
                            x2="36"
                            y1="36"
                            y2="28"
                          ></line>
                        </svg>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <div class="flex flex-col">
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface group-hover:text-primary transition-colors"
                          >The Blackburne Shilling Gambit Trap</span
                        >
                        <div class="flex items-center gap-space-xs mt-0.5">
                          <span
                            class="font-label-badge text-label-badge bg-surface-container px-1.5 py-0.5 rounded text-outline"
                            >ECO: E51</span
                          >
                          <span class="text-outline text-body-sm">•</span>
                          <span class="font-body-sm text-body-sm text-on-surface-variant"
                            >Italian Game 3...Nd4</span
                          >
                        </div>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center px-space-xs py-0.5 rounded bg-surface-container text-on-surface font-body-sm text-body-sm"
                      >
                        Opening Traps
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-secondary-container/40 text-secondary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Intermediate
                      </span>
                    </td>
                    <td
                      class="py-space-sm px-space-md text-outline font-label-numeric-md text-label-numeric-md"
                    >
                      Apr 08, 2025
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1.5 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-primary-container/20 text-primary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                        Published
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container transition-colors"
                          title="Preview Board"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >visibility</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-primary hover:bg-surface-container transition-colors"
                          title="Edit Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >edit</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-error hover:bg-surface-container transition-colors"
                          title="Delete Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >delete</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Row 3: Lucena Position -->
                  <tr class="hover:bg-surface-container transition-colors group">
                    <td class="py-space-sm px-space-md text-center">
                      <div
                        class="w-14 h-14 mx-auto rounded overflow-hidden shadow-inner bg-surface-container-highest relative flex items-center justify-center p-0.5"
                      >
                        <svg aria-hidden="true" class="w-full h-full rounded" viewBox="0 0 64 64">
                          <rect fill="#303630" height="64" width="64"></rect>
                          <g fill="#81B64C" opacity="0.85">
                            <rect height="8" width="8" x="8" y="0"></rect>
                            <rect height="8" width="8" x="24" y="0"></rect>
                            <rect height="8" width="8" x="40" y="0"></rect>
                            <rect height="8" width="8" x="56" y="0"></rect>
                            <rect height="8" width="8" x="0" y="8"></rect>
                            <rect height="8" width="8" x="16" y="8"></rect>
                            <rect height="8" width="8" x="32" y="8"></rect>
                            <rect height="8" width="8" x="48" y="8"></rect>
                            <rect height="8" width="8" x="8" y="16"></rect>
                            <rect height="8" width="8" x="24" y="16"></rect>
                            <rect height="8" width="8" x="40" y="16"></rect>
                            <rect height="8" width="8" x="56" y="16"></rect>
                            <rect height="8" width="8" x="0" y="24"></rect>
                            <rect height="8" width="8" x="16" y="24"></rect>
                            <rect height="8" width="8" x="32" y="24"></rect>
                            <rect height="8" width="8" x="48" y="24"></rect>
                            <rect height="8" width="8" x="8" y="32"></rect>
                            <rect height="8" width="8" x="24" y="32"></rect>
                            <rect height="8" width="8" x="40" y="32"></rect>
                            <rect height="8" width="8" x="56" y="32"></rect>
                            <rect height="8" width="8" x="0" y="40"></rect>
                            <rect height="8" width="8" x="16" y="40"></rect>
                            <rect height="8" width="8" x="32" y="40"></rect>
                            <rect height="8" width="8" x="48" y="40"></rect>
                            <rect height="8" width="8" x="8" y="48"></rect>
                            <rect height="8" width="8" x="24" y="48"></rect>
                            <rect height="8" width="8" x="40" y="48"></rect>
                            <rect height="8" width="8" x="56" y="48"></rect>
                            <rect height="8" width="8" x="0" y="56"></rect>
                            <rect height="8" width="8" x="16" y="56"></rect>
                            <rect height="8" width="8" x="32" y="56"></rect>
                            <rect height="8" width="8" x="48" y="56"></rect>
                          </g>
                          <!-- Bridge highlight 4th rank Rook shield -->
                          <rect
                            fill="#7AA6FF"
                            height="8"
                            opacity="0.3"
                            width="64"
                            x="0"
                            y="32"
                          ></rect>
                          <circle cx="36" cy="36" fill="#ADC6FF" r="3"></circle>
                        </svg>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <div class="flex flex-col">
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface group-hover:text-primary transition-colors"
                          >The Lucena Position: Building the Bridge</span
                        >
                        <div class="flex items-center gap-space-xs mt-0.5">
                          <span
                            class="font-label-badge text-label-badge bg-surface-container px-1.5 py-0.5 rounded text-outline"
                            >R+P Endgame</span
                          >
                          <span class="text-outline text-body-sm">•</span>
                          <span class="font-body-sm text-body-sm text-on-surface-variant"
                            >4th Rank Rook Shield</span
                          >
                        </div>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center px-space-xs py-0.5 rounded bg-surface-container text-on-surface font-body-sm text-body-sm"
                      >
                        Endgame Finesse
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-error-container/30 text-error"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-error"></span>
                        Advanced
                      </span>
                    </td>
                    <td
                      class="py-space-sm px-space-md text-outline font-label-numeric-md text-label-numeric-md"
                    >
                      Apr 03, 2025
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1.5 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-primary-container/20 text-primary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                        Published
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container transition-colors"
                          title="Preview Board"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >visibility</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-primary hover:bg-surface-container transition-colors"
                          title="Edit Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >edit</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-error hover:bg-surface-container transition-colors"
                          title="Delete Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >delete</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Row 4: Smothered Mate -->
                  <tr class="hover:bg-surface-container transition-colors group">
                    <td class="py-space-sm px-space-md text-center">
                      <div
                        class="w-14 h-14 mx-auto rounded overflow-hidden shadow-inner bg-surface-container-highest relative flex items-center justify-center p-0.5"
                      >
                        <svg aria-hidden="true" class="w-full h-full rounded" viewBox="0 0 64 64">
                          <rect fill="#303630" height="64" width="64"></rect>
                          <g fill="#81B64C" opacity="0.85">
                            <rect height="8" width="8" x="8" y="0"></rect>
                            <rect height="8" width="8" x="24" y="0"></rect>
                            <rect height="8" width="8" x="40" y="0"></rect>
                            <rect height="8" width="8" x="56" y="0"></rect>
                            <rect height="8" width="8" x="0" y="8"></rect>
                            <rect height="8" width="8" x="16" y="8"></rect>
                            <rect height="8" width="8" x="32" y="8"></rect>
                            <rect height="8" width="8" x="48" y="8"></rect>
                            <rect height="8" width="8" x="8" y="16"></rect>
                            <rect height="8" width="8" x="24" y="16"></rect>
                            <rect height="8" width="8" x="40" y="16"></rect>
                            <rect height="8" width="8" x="56" y="16"></rect>
                            <rect height="8" width="8" x="0" y="24"></rect>
                            <rect height="8" width="8" x="16" y="24"></rect>
                            <rect height="8" width="8" x="32" y="24"></rect>
                            <rect height="8" width="8" x="48" y="24"></rect>
                            <rect height="8" width="8" x="8" y="32"></rect>
                            <rect height="8" width="8" x="24" y="32"></rect>
                            <rect height="8" width="8" x="40" y="32"></rect>
                            <rect height="8" width="8" x="56" y="32"></rect>
                            <rect height="8" width="8" x="0" y="40"></rect>
                            <rect height="8" width="8" x="16" y="40"></rect>
                            <rect height="8" width="8" x="32" y="40"></rect>
                            <rect height="8" width="8" x="48" y="40"></rect>
                            <rect height="8" width="8" x="8" y="48"></rect>
                            <rect height="8" width="8" x="24" y="48"></rect>
                            <rect height="8" width="8" x="40" y="48"></rect>
                            <rect height="8" width="8" x="56" y="48"></rect>
                            <rect height="8" width="8" x="0" y="56"></rect>
                            <rect height="8" width="8" x="16" y="56"></rect>
                            <rect height="8" width="8" x="32" y="56"></rect>
                            <rect height="8" width="8" x="48" y="56"></rect>
                          </g>
                          <!-- Corner trap Nf7# -->
                          <circle cx="60" cy="4" fill="#E2E3DF" r="3.5"></circle>
                          <circle cx="52" cy="12" fill="#81B64C" r="3.5"></circle>
                        </svg>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <div class="flex flex-col">
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface group-hover:text-primary transition-colors"
                          >Smothered Mate with Queen Sacrifice</span
                        >
                        <div class="flex items-center gap-space-xs mt-0.5">
                          <span
                            class="font-label-badge text-label-badge bg-surface-container px-1.5 py-0.5 rounded text-outline"
                            >Qg8+ Force</span
                          >
                          <span class="text-outline text-body-sm">•</span>
                          <span class="font-body-sm text-body-sm text-on-surface-variant"
                            >Philidor Legacy</span
                          >
                        </div>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center px-space-xs py-0.5 rounded bg-surface-container text-on-surface font-body-sm text-body-sm"
                      >
                        Checkmate Patterns
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-primary-container/20 text-primary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-primary"></span>
                        Beginner
                      </span>
                    </td>
                    <td
                      class="py-space-sm px-space-md text-outline font-label-numeric-md text-label-numeric-md"
                    >
                      Mar 28, 2025
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1.5 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-primary-container/20 text-primary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                        Published
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container transition-colors"
                          title="Preview Board"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >visibility</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-primary hover:bg-surface-container transition-colors"
                          title="Edit Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >edit</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-error hover:bg-surface-container transition-colors"
                          title="Delete Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >delete</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                  <!-- Row 5: Fried Liver Attack -->
                  <tr class="hover:bg-surface-container transition-colors group">
                    <td class="py-space-sm px-space-md text-center">
                      <div
                        class="w-14 h-14 mx-auto rounded overflow-hidden shadow-inner bg-surface-container-highest relative flex items-center justify-center p-0.5"
                      >
                        <svg aria-hidden="true" class="w-full h-full rounded" viewBox="0 0 64 64">
                          <rect fill="#303630" height="64" width="64"></rect>
                          <g fill="#81B64C" opacity="0.85">
                            <rect height="8" width="8" x="8" y="0"></rect>
                            <rect height="8" width="8" x="24" y="0"></rect>
                            <rect height="8" width="8" x="40" y="0"></rect>
                            <rect height="8" width="8" x="56" y="0"></rect>
                            <rect height="8" width="8" x="0" y="8"></rect>
                            <rect height="8" width="8" x="16" y="8"></rect>
                            <rect height="8" width="8" x="32" y="8"></rect>
                            <rect height="8" width="8" x="48" y="8"></rect>
                            <rect height="8" width="8" x="8" y="16"></rect>
                            <rect height="8" width="8" x="24" y="16"></rect>
                            <rect height="8" width="8" x="40" y="16"></rect>
                            <rect height="8" width="8" x="56" y="16"></rect>
                            <rect height="8" width="8" x="0" y="24"></rect>
                            <rect height="8" width="8" x="16" y="24"></rect>
                            <rect height="8" width="8" x="32" y="24"></rect>
                            <rect height="8" width="8" x="48" y="24"></rect>
                            <rect height="8" width="8" x="8" y="32"></rect>
                            <rect height="8" width="8" x="24" y="32"></rect>
                            <rect height="8" width="8" x="40" y="32"></rect>
                            <rect height="8" width="8" x="56" y="32"></rect>
                            <rect height="8" width="8" x="0" y="40"></rect>
                            <rect height="8" width="8" x="16" y="40"></rect>
                            <rect height="8" width="8" x="32" y="40"></rect>
                            <rect height="8" width="8" x="48" y="40"></rect>
                            <rect height="8" width="8" x="8" y="48"></rect>
                            <rect height="8" width="8" x="24" y="48"></rect>
                            <rect height="8" width="8" x="40" y="48"></rect>
                            <rect height="8" width="8" x="56" y="48"></rect>
                            <rect height="8" width="8" x="0" y="56"></rect>
                            <rect height="8" width="8" x="16" y="56"></rect>
                            <rect height="8" width="8" x="32" y="56"></rect>
                            <rect height="8" width="8" x="48" y="56"></rect>
                          </g>
                          <!-- Fork on f7 -->
                          <circle cx="44" cy="12" fill="#EF4444" r="3.5"></circle>
                          <circle cx="44" cy="20" fill="#81B64C" opacity="0.6" r="3"></circle>
                        </svg>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <div class="flex flex-col">
                        <span
                          class="font-title-md text-title-md font-semibold text-on-surface group-hover:text-primary transition-colors"
                          >The Fried Liver Attack &amp; Knight Sacrifice</span
                        >
                        <div class="flex items-center gap-space-xs mt-0.5">
                          <span
                            class="font-label-badge text-label-badge bg-surface-container px-1.5 py-0.5 rounded text-outline"
                            >ECO: C57</span
                          >
                          <span class="text-outline text-body-sm">•</span>
                          <span class="font-body-sm text-body-sm text-on-surface-variant"
                            >Nxf7 King Magnet</span
                          >
                        </div>
                      </div>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center px-space-xs py-0.5 rounded bg-surface-container text-on-surface font-body-sm text-body-sm"
                      >
                        Opening Traps
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-secondary-container/40 text-secondary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
                        Intermediate
                      </span>
                    </td>
                    <td
                      class="py-space-sm px-space-md text-outline font-label-numeric-md text-label-numeric-md"
                    >
                      Mar 22, 2025
                    </td>
                    <td class="py-space-sm px-space-md">
                      <span
                        class="inline-flex items-center gap-1.5 font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-primary-container/20 text-primary"
                      >
                        <span class="w-1.5 h-1.5 rounded-full bg-primary animate-pulse"></span>
                        Published
                      </span>
                    </td>
                    <td class="py-space-sm px-space-md text-right">
                      <div class="flex items-center justify-end gap-space-xs">
                        <button
                          class="p-1 rounded text-outline hover:text-on-surface hover:bg-surface-container transition-colors"
                          title="Preview Board"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >visibility</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-primary hover:bg-surface-container transition-colors"
                          title="Edit Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >edit</span
                          >
                        </button>
                        <button
                          class="p-1 rounded text-outline hover:text-error hover:bg-surface-container transition-colors"
                          title="Delete Pattern"
                          type="button"
                          disabled
                        >
                          <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                            >delete</span
                          >
                        </button>
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
            </div>
            <!-- Pagination Footer -->
            <div
              class="bg-surface-container-lowest px-space-md py-space-sm flex flex-col sm:flex-row items-center justify-between gap-space-sm"
            >
              <span class="font-body-sm text-body-sm text-outline">
                Showing
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface">1-5</span>
                of
                <span class="font-label-numeric-md text-label-numeric-md text-on-surface">248</span>
                tactical patterns
              </span>
              <div class="flex items-center gap-1">
                <button
                  class="p-1 rounded bg-surface-container text-outline hover:text-on-surface transition-colors disabled:opacity-40"
                  disabled
                  type="button"
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >chevron_left</span
                  >
                </button>
                <button
                  class="w-7 h-7 rounded bg-primary-container text-on-primary-container font-label-numeric-md text-label-numeric-md flex items-center justify-center font-bold"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  1
                </button>
                <button
                  class="w-7 h-7 rounded bg-surface-container hover:bg-surface-container-high text-on-surface font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  2
                </button>
                <button
                  class="w-7 h-7 rounded bg-surface-container hover:bg-surface-container-high text-on-surface font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  3
                </button>
                <span class="px-1 text-outline font-label-numeric-md">...</span>
                <button
                  class="w-7 h-7 rounded bg-surface-container hover:bg-surface-container-high text-on-surface font-label-numeric-md text-label-numeric-md flex items-center justify-center transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  50
                </button>
                <button
                  class="p-1 rounded bg-surface-container text-outline hover:text-on-surface transition-colors"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >chevron_right</span
                  >
                </button>
              </div>
            </div>
          </div>
          <!-- Editorial FEN Quick Preview Drawer / Analytical Spotlight Card -->
          <div class="mt-space-lg grid grid-cols-1 lg:grid-cols-3 gap-gutter">
            <!-- FEN Terminal Visualizer -->
            <div
              class="lg:col-span-2 bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col justify-between"
            >
              <div class="flex items-center justify-between pb-space-sm mb-space-sm">
                <div class="flex items-center gap-space-xs">
                  <span
                    class="material-symbols-outlined text-primary text-[20px]"
                    aria-hidden="true"
                    >terminal</span
                  >
                  <span class="font-title-md text-title-md text-on-surface"
                    >Instructional FEN Inspector</span
                  >
                </div>
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Engine Synchronized</span
                >
              </div>
              <div
                class="bg-surface-container-lowest rounded-lg p-space-md font-mono text-body-sm text-secondary-fixed-dim select-all overflow-x-auto shadow-inner"
              >
                <code>r1bqkb1r/pppp1ppp/2n5/4p3/2B1n3/5N2/PPPP1PPP/RNBQK2R w KQkq - 0 4</code>
              </div>
              <div
                class="flex flex-wrap items-center justify-between gap-space-sm mt-space-md pt-space-xs text-body-sm font-body-sm text-outline"
              >
                <div class="flex items-center gap-space-md">
                  <span>Halfmove: <strong class="text-on-surface">0</strong></span>
                  <span>Fullmove: <strong class="text-on-surface">4</strong></span>
                  <span>Castling Rights: <strong class="text-on-surface">KQkq</strong></span>
                </div>
                <div class="flex items-center gap-space-xs">
                  <button
                    class="px-space-sm py-1 rounded bg-surface-container hover:bg-surface-container-high text-on-surface text-body-sm transition-colors"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Copy FEN
                  </button>
                  <button
                    class="px-space-sm py-1 rounded bg-secondary-container/40 text-secondary hover:bg-secondary-container text-body-sm transition-colors"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Launch Board Sandbox
                  </button>
                </div>
              </div>
            </div>
            <!-- Arbiter Rule Note Card -->
            <div
              class="bg-surface-container-low rounded-xl p-space-lg shadow-sm flex flex-col justify-between"
            >
              <div class="flex items-center gap-space-xs text-secondary mb-space-xs">
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >verified_user</span
                >
                <span class="font-title-md text-title-md">Arbiter Publishing Rules</span>
              </div>
              <p class="font-body-sm text-body-sm text-on-surface-variant leading-relaxed">
                Tactical patterns published here are immediately propagated to the club Player study
                hub. Ensure all move sequences offer distinct refutations and no dual solutions
                exist past ply 3.
              </p>
              <div class="mt-space-md pt-space-xs flex items-center justify-between">
                <span class="font-label-badge text-label-badge uppercase text-outline"
                  >Role Enforcement</span
                >
                <span
                  class="font-label-badge text-label-badge px-space-xs py-0.5 rounded bg-secondary-container text-on-secondary-container font-semibold"
                  >ADMIN ONLY</span
                >
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
