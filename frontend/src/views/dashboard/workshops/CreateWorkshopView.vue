<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin md:px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-16">
        <!-- Dynamic Status & Header Bar -->
        <div
          class="flex flex-col md:flex-row md:items-end justify-between gap-space-md py-space-lg mb-space-lg"
        >
          <div class="flex flex-col gap-space-xs">
            <div
              class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm mb-space-xs"
            >
              <span>Dashboard</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span>Workshops</span>
              <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
                >chevron_right</span
              >
              <span class="text-primary font-title-md text-title-md">Create Workshop</span>
            </div>
            <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight font-bold">
              Create New Workshop
            </h1>
            <p class="font-body-md text-body-md text-on-surface-variant max-w-2xl">
              Configure masterclass, clinical seminar, syllabus objectives, and seat capacity.
            </p>
          </div>
          <!-- Quick State & Actions -->
          <div class="flex flex-wrap items-center gap-space-sm">
            <span
              class="inline-flex items-center gap-space-xs px-space-md py-space-xs rounded-full bg-surface-container-high text-outline text-label-badge font-label-badge tracking-wider uppercase"
            >
              <span class="w-1.5 h-1.5 rounded-full bg-secondary"></span>
              Autosave Active
            </span>
            <button
              class="px-space-md py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors"
              type="button"
              disabled
              title="Design preview"
            >
              Discard
            </button>
            <button
              class="px-space-lg py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md font-semibold hover:bg-primary-fixed shadow-md transition-all flex items-center gap-space-xs"
              id="btn-publish-header"
              type="button"
              disabled
              title="Design preview"
            >
              <span class="material-symbols-outlined text-[18px]" aria-hidden="true">bolt</span>
              Publish Workshop
            </button>
          </div>
        </div>
        <!-- Two Column Layout: Editor (Left 7 cols) & Live Inspector (Right 5 cols) -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-space-xl items-start">
          <!-- LEFT COLUMN: Main Form Builder -->
          <div class="lg:col-span-7 flex flex-col gap-space-xl">
            <!-- Section 1: Workshop Identity -->
            <div
              class="rounded-xl bg-surface-container-low p-space-lg flex flex-col gap-space-md shadow-sm"
            >
              <div class="flex items-center justify-between pb-space-sm">
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-7 h-7 rounded-md bg-secondary-container text-on-secondary-container flex items-center justify-center font-label-badge"
                  >
                    01
                  </div>
                  <div>
                    <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                      Workshop Identity
                    </h2>
                    <p class="font-body-sm text-body-sm text-outline">
                      Pedagogical scope, seminar title, and lead lecturer designation.
                    </p>
                  </div>
                </div>
                <span
                  class="px-space-sm py-0.5 rounded bg-surface-container text-secondary font-label-badge text-label-badge uppercase tracking-wider"
                  >Required</span
                >
              </div>
              <!-- Title -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-title-md text-title-md text-on-surface font-medium flex items-center justify-between"
                  for="ws-title"
                >
                  <span>Workshop Title</span>
                  <span class="text-outline font-body-sm text-body-sm" id="title-char-count"
                    >64/120</span
                  >
                </label>
                <input
                  class="w-full px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-body-md text-body-md focus:outline-none focus:ring-2 focus:ring-primary/40 transition-all placeholder:text-outline"
                  id="ws-title"
                  maxlength="120"
                  placeholder="e.g. Masterclass on Rook Endgames"
                  type="text"
                  value="Attacking the Sicilian Defense: Open Lines &amp; Pawn Storms"
                />
              </div>
              <!-- Instructor & Category -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface font-medium"
                    for="ws-instructor"
                    >Chief Instructor</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-body-md text-body-md focus:outline-none focus:ring-2 focus:ring-primary/40 pr-10 cursor-pointer"
                      id="ws-instructor"
                    >
                      <option selected value="GM Tariq Al-Mansoor">
                        GM Tariq Al-Mansoor (FIDE 2642)
                      </option>
                      <option value="GM Marcus Vance">GM Marcus Vance (FIDE 2598)</option>
                      <option value="IM Elena Rostova">IM Elena Rostova (FIDE 2420)</option>
                      <option value="FM Alex Rivera">FM Alex Rivera (FIDE 2315)</option>
                      <option value="WGM Sophia Chen">WGM Sophia Chen (FIDE 2380)</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[20px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface font-medium"
                    for="ws-category"
                    >Curriculum Category</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-body-md text-body-md focus:outline-none focus:ring-2 focus:ring-primary/40 pr-10 cursor-pointer"
                      id="ws-category"
                    >
                      <option selected value="Opening Repertoire">Opening Repertoire</option>
                      <option value="Middlegame Strategy">Middlegame Strategy</option>
                      <option value="Tactical Calculation">Tactical Calculation</option>
                      <option value="Endgame Theory">Endgame Theory</option>
                      <option value="Time Trouble Management">Time Trouble Management</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[20px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
              </div>
              <!-- Difficulty Pill Selector -->
              <div class="flex flex-col gap-space-xs">
                <label class="font-title-md text-title-md text-on-surface font-medium"
                  >Target Participant Tier</label
                >
                <div class="grid grid-cols-2 sm:grid-cols-4 gap-space-xs" id="difficulty-selector">
                  <button
                    class="difficulty-btn py-space-sm px-space-md rounded-lg font-title-md text-title-md bg-surface-container-lowest text-outline hover:text-on-surface hover:bg-surface-container text-center transition-all"
                    data-diff="Beginner"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Beginner
                  </button>
                  <button
                    class="difficulty-btn py-space-sm px-space-md rounded-lg font-title-md text-title-md bg-surface-container-lowest text-outline hover:text-on-surface hover:bg-surface-container text-center transition-all"
                    data-diff="Intermediate"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Intermediate
                  </button>
                  <button
                    class="difficulty-btn py-space-sm px-space-md rounded-lg font-title-md text-title-md bg-primary-container text-on-primary-container font-semibold text-center transition-all shadow-sm"
                    data-diff="Advanced"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    Advanced
                  </button>
                  <button
                    class="difficulty-btn py-space-sm px-space-md rounded-lg font-title-md text-title-md bg-surface-container-lowest text-outline hover:text-on-surface hover:bg-surface-container text-center transition-all"
                    data-diff="All Levels"
                    type="button"
                    disabled
                    title="Design preview"
                  >
                    All Levels
                  </button>
                </div>
              </div>
              <!-- Description & Syllabus -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-title-md text-title-md text-on-surface font-medium flex items-center justify-between"
                  for="ws-description"
                >
                  <span>Seminar Syllabus &amp; Methodology</span>
                  <span class="text-outline font-body-sm text-body-sm">Markdown supported</span>
                </label>
                <div class="flex flex-col rounded-lg bg-surface-container-lowest overflow-hidden">
                  <!-- Mini Formatting toolbar -->
                  <div
                    class="flex items-center gap-space-xs px-space-sm py-space-xs bg-surface-container-high text-outline"
                  >
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Bold"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >format_bold</span
                      >
                    </button>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Italic"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >format_italic</span
                      >
                    </button>
                    <span class="w-[1px] h-4 bg-outline-variant mx-1"></span>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Bulleted List"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >format_list_bulleted</span
                      >
                    </button>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Numbered List"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >format_list_numbered</span
                      >
                    </button>
                    <button
                      class="p-1 hover:text-on-surface transition-colors"
                      title="Chess Glyph"
                      type="button"
                      disabled
                    >
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >token</span
                      >
                    </button>
                  </div>
                  <textarea
                    class="w-full p-space-md bg-transparent text-on-surface font-body-md text-body-md focus:outline-none resize-y placeholder:text-outline"
                    id="ws-description"
                    placeholder="Provide a granular breakdown of theoretical themes, key positions, and candidate move analysis..."
                    rows="4"
                  >
A clinical exploration of sharp Sicilian lines with an emphasis on Yugoslav &amp; English attack formations. Players analyze historical dynamic sacrifices from Tal and Kasparov before testing defensive fortresses against modern engine evaluations.</textarea>
                </div>
              </div>
              <!-- Dynamic Learning Objectives -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label class="font-title-md text-title-md text-on-surface font-medium"
                    >Core Learning Objectives</label
                  >
                  <span class="font-body-sm text-body-sm text-outline">3 items configured</span>
                </div>
                <div class="flex flex-col gap-space-xs" id="objectives-list">
                  <div
                    class="flex items-center gap-space-sm bg-surface-container-lowest px-space-md py-space-xs rounded-lg group"
                  >
                    <span
                      class="material-symbols-outlined text-secondary text-[18px]"
                      aria-hidden="true"
                      >check_circle</span
                    >
                    <input
                      class="min-w-0 bg-transparent text-on-surface font-body-md text-body-md flex-1 focus:outline-none"
                      type="text"
                      value="Calculate King's pawn sacrifices (e6/f5 strikes)"
                    />
                    <button
                      class="text-outline hover:text-error transition-colors p-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >close</span
                      >
                    </button>
                  </div>
                  <div
                    class="flex items-center gap-space-sm bg-surface-container-lowest px-space-md py-space-xs rounded-lg group"
                  >
                    <span
                      class="material-symbols-outlined text-secondary text-[18px]"
                      aria-hidden="true"
                      >check_circle</span
                    >
                    <input
                      class="min-w-0 bg-transparent text-on-surface font-body-md text-body-md flex-1 focus:outline-none"
                      type="text"
                      value="Master d5 and f5 tactical break timing"
                    />
                    <button
                      class="text-outline hover:text-error transition-colors p-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >close</span
                      >
                    </button>
                  </div>
                  <div
                    class="flex items-center gap-space-sm bg-surface-container-lowest px-space-md py-space-xs rounded-lg group"
                  >
                    <span
                      class="material-symbols-outlined text-secondary text-[18px]"
                      aria-hidden="true"
                      >check_circle</span
                    >
                    <input
                      class="min-w-0 bg-transparent text-on-surface font-body-md text-body-md flex-1 focus:outline-none"
                      type="text"
                      value="Defend accurately against opposite-side castling storms"
                    />
                    <button
                      class="text-outline hover:text-error transition-colors p-1"
                      type="button"
                      disabled
                      title="Design preview"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >close</span
                      >
                    </button>
                  </div>
                </div>
                <button
                  class="self-start mt-space-xs inline-flex items-center gap-space-xs px-space-md py-space-xs rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-secondary font-title-md text-title-md transition-colors"
                  id="btn-add-objective"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[16px]" aria-hidden="true">add</span>
                  Add Objective
                </button>
              </div>
              <!-- Cover Image Uploader with Preview -->
              <div class="flex flex-col gap-space-xs">
                <label class="font-title-md text-title-md text-on-surface font-medium"
                  >Workshop Cover Image</label
                >
                <div
                  class="flex flex-col sm:flex-row items-center gap-space-md p-space-md rounded-xl bg-surface-container-lowest"
                >
                  <div
                    class="w-full sm:w-44 h-28 rounded-lg overflow-hidden shrink-0 relative bg-surface-container-high shadow-inner"
                  >
                    <img
                      class="w-full h-full object-cover"
                      data-alt="Macro cinematic shot of hand-carved dark ebony and pale boxwood chess pieces on a tournament-grade vinyl board, lit with precise emerald rim lighting, high contrast, shallow depth of field, dramatic tournament ambiance."
                      id="cover-preview-img"
                      src="/images/233cb83d5255.webp"
                      alt=""
                    />
                    <span
                      class="absolute bottom-1 right-1 bg-surface-container-lowest/80 text-on-surface text-[10px] font-mono px-1 rounded"
                      >16:9 HD</span
                    >
                  </div>
                  <div class="flex flex-col gap-space-xs flex-1 text-center sm:text-left">
                    <div
                      class="flex items-center justify-center sm:justify-start gap-space-xs text-on-surface font-title-md text-title-md"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[20px]"
                        aria-hidden="true"
                        >cloud_upload</span
                      >
                      <span>Select high-resolution tournament graphic</span>
                    </div>
                    <p class="font-body-sm text-body-sm text-outline">
                      Supported formats: WEBP, PNG, JPG (1920x1080 recommended, max 4MB)
                    </p>
                    <div
                      class="flex items-center justify-center sm:justify-start gap-space-xs mt-space-xs"
                    >
                      <button
                        class="px-space-md py-1.5 rounded-lg bg-surface-container-high hover:bg-surface-bright text-on-surface font-body-md text-body-md transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Upload Replacement
                      </button>
                      <button
                        class="px-space-sm py-1.5 rounded-lg text-outline hover:text-error font-body-sm text-body-sm transition-colors"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        Remove
                      </button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- Section 2: Logistics & Seat Allocation -->
            <div
              class="rounded-xl bg-surface-container-low p-space-lg flex flex-col gap-space-md shadow-sm"
            >
              <div class="flex items-center justify-between pb-space-sm">
                <div class="flex items-center gap-space-sm">
                  <div
                    class="w-7 h-7 rounded-md bg-secondary-container text-on-secondary-container flex items-center justify-center font-label-badge"
                  >
                    02
                  </div>
                  <div>
                    <h2 class="font-headline-sm text-headline-sm text-on-surface font-semibold">
                      Logistics &amp; Capacity
                    </h2>
                    <p class="font-body-sm text-body-sm text-outline">
                      Physical room routing, sensory DGT boards, and strict attendee caps.
                    </p>
                  </div>
                </div>
                <span
                  class="px-space-sm py-0.5 rounded bg-surface-container text-secondary font-label-badge text-label-badge uppercase tracking-wider"
                  >Required</span
                >
              </div>
              <!-- Date & Duration Grid -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface font-medium flex items-center justify-between"
                    for="ws-datetime"
                  >
                    <span>Date &amp; Time (UTC)</span>
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >calendar_clock</span
                    >
                  </label>
                  <input
                    class="w-full px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-label-numeric-md text-label-numeric-md focus:outline-none focus:ring-2 focus:ring-primary/40 font-mono"
                    id="ws-datetime"
                    type="text"
                    value="2025-06-20 16:00 UTC"
                  />
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface font-medium flex items-center justify-between"
                    for="ws-duration"
                  >
                    <span>Estimated Duration</span>
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >timelapse</span
                    >
                  </label>
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-body-md text-body-md focus:outline-none focus:ring-2 focus:ring-primary/40 pr-10 cursor-pointer"
                      id="ws-duration"
                    >
                      <option value="1.5 Hours / 90 mins">1.5 Hours / 90 mins</option>
                      <option value="2.0 Hours / 120 mins">2.0 Hours / 120 mins</option>
                      <option selected value="2.5 Hours / 150 mins">2.5 Hours / 150 mins</option>
                      <option value="3.0 Hours / 180 mins">3.0 Hours / 180 mins</option>
                      <option value="Full Day Intensive">Full Day Intensive (6 Hours)</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[20px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
              </div>
              <!-- Venue & Capacity -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface font-medium flex items-center justify-between"
                    for="ws-location"
                  >
                    <span>Physical Room / Sensory Hub</span>
                    <span
                      class="material-symbols-outlined text-[16px] text-outline"
                      aria-hidden="true"
                      >meeting_room</span
                    >
                  </label>
                  <input
                    class="w-full px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-body-md text-body-md focus:outline-none focus:ring-2 focus:ring-primary/40"
                    id="ws-location"
                    type="text"
                    value="Alpha Seminar Room &amp; Sensory DGT Boards"
                  />
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface font-medium flex items-center justify-between"
                    for="ws-capacity"
                  >
                    <span>Max Capacity (Player Seats)</span>
                    <span class="text-secondary font-label-badge text-label-badge">Hard Limit</span>
                  </label>
                  <div class="relative flex items-center">
                    <input
                      class="w-full px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-label-numeric-md text-label-numeric-md focus:outline-none focus:ring-2 focus:ring-primary/40 font-mono"
                      id="ws-capacity"
                      max="64"
                      min="4"
                      type="number"
                      value="16"
                    />
                    <span
                      class="absolute right-3 text-outline font-body-sm text-body-sm pointer-events-none"
                      >Players</span
                    >
                  </div>
                </div>
              </div>
              <!-- Registration Deadline -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-title-md text-title-md text-on-surface font-medium flex items-center justify-between"
                  for="ws-deadline"
                >
                  <span>Registration Freeze Deadline</span>
                  <span class="text-outline font-body-sm text-body-sm"
                    >48 hours prior recommended</span
                  >
                </label>
                <div class="relative">
                  <input
                    class="w-full px-space-md py-space-sm bg-surface-container-lowest text-on-surface rounded-lg font-label-numeric-md text-label-numeric-md focus:outline-none focus:ring-2 focus:ring-primary/40 font-mono"
                    id="ws-deadline"
                    type="text"
                    value="2025-06-18 23:59 UTC"
                  />
                  <span
                    class="material-symbols-outlined absolute right-3 top-2.5 text-outline pointer-events-none text-[20px]"
                    aria-hidden="true"
                    >lock_clock</span
                  >
                </div>
              </div>
              <!-- Checkbox / Toggle Options -->
              <div class="pt-space-xs flex flex-col gap-space-sm">
                <label class="flex items-center gap-space-sm cursor-pointer select-none">
                  <input
                    checked
                    class="w-4 h-4 rounded bg-surface-container-lowest accent-primary cursor-pointer"
                    type="checkbox"
                  />
                  <span class="font-body-md text-body-md text-on-surface"
                    >Auto-assign Sensory DGT Board pairing tags to registered PLAYER attendees</span
                  >
                </label>
                <label class="flex items-center gap-space-sm cursor-pointer select-none">
                  <input
                    checked
                    class="w-4 h-4 rounded bg-surface-container-lowest accent-primary cursor-pointer"
                    type="checkbox"
                  />
                  <span class="font-body-md text-body-md text-on-surface"
                    >Instantly distribute private Zoom backup bridge &amp; PGN package upon
                    confirmation</span
                  >
                </label>
              </div>
            </div>
            <!-- Action Footer -->
            <div
              class="flex flex-col sm:flex-row items-center justify-between gap-space-md pt-space-xs"
            >
              <button
                class="w-full sm:w-auto px-space-lg py-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high text-outline hover:text-on-surface font-title-md text-title-md transition-colors"
                type="button"
                disabled
                title="Design preview"
              >
                Cancel &amp; Exit
              </button>
              <div class="flex items-center gap-space-sm w-full sm:w-auto justify-end">
                <button
                  class="w-full sm:w-auto px-space-lg py-space-sm rounded-lg bg-surface-container-high hover:bg-surface-container-highest text-on-surface font-title-md text-title-md transition-colors flex items-center justify-center gap-space-xs"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true">save</span>
                  Save as Draft
                </button>
                <button
                  class="w-full sm:w-auto px-space-xl py-space-sm rounded-lg bg-primary text-on-primary font-title-md text-title-md font-bold hover:bg-primary-fixed shadow-md transition-all flex items-center justify-center gap-space-xs"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >publish</span
                  >
                  Publish Workshop
                </button>
              </div>
            </div>
          </div>
          <!-- RIGHT COLUMN: Sticky Live Preview & Standards -->
          <div class="lg:col-span-5 flex flex-col gap-space-lg sticky top-20">
            <!-- Live Card Preview Card -->
            <div
              class="rounded-xl bg-surface-container-low p-space-lg flex flex-col gap-space-md shadow-md"
            >
              <div class="flex items-center justify-between">
                <div class="flex items-center gap-space-xs">
                  <span class="w-2 h-2 rounded-full bg-primary animate-pulse"></span>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                    >Discovery Feed Card Preview</span
                  >
                </div>
                <span class="font-body-sm text-body-sm text-outline">Live 1:1 Rendering</span>
              </div>
              <!-- Rendered Discovery Card -->
              <div
                class="rounded-xl bg-surface-container overflow-hidden shadow-lg transition-all group flex flex-col"
              >
                <!-- Thumbnail Header with Overlaid Chips -->
                <div class="relative w-full h-44 bg-surface-container-highest overflow-hidden">
                  <img
                    class="w-full h-full object-cover transition-transform duration-500 group-hover:scale-105"
                    data-alt="Overhead dramatic studio view of dark green tournament chess board with pristine wooden pieces aligned in Sicilian Defense configuration, subtle soft volumetric shadows, low key dark studio aesthetic."
                    id="preview-card-img"
                    src="/images/8d3b815a1345.webp"
                    alt=""
                  />
                  <div
                    class="absolute inset-0 bg-gradient-to-t from-surface-container via-surface-container/20 to-transparent"
                  ></div>
                  <!-- Category & Difficulty Pill Overlays -->
                  <div class="absolute top-3 left-3 flex items-center gap-space-xs">
                    <span
                      class="px-space-sm py-0.5 rounded-full text-label-badge font-label-badge uppercase tracking-wider bg-primary text-on-primary font-bold shadow-sm"
                      id="preview-diff-badge"
                    >
                      Advanced
                    </span>
                    <span
                      class="px-space-sm py-0.5 rounded-full text-label-badge font-label-badge uppercase tracking-wider bg-surface-container-lowest/80 backdrop-blur-md text-on-surface"
                      id="preview-cat-badge"
                    >
                      Opening Repertoire
                    </span>
                  </div>
                  <div
                    class="absolute bottom-3 right-3 px-space-xs py-0.5 rounded bg-surface-container-lowest/90 backdrop-blur-md font-mono text-[11px] text-secondary font-semibold"
                  >
                    <span id="preview-duration-chip">2.5 Hours</span>
                  </div>
                </div>
                <!-- Card Content Body -->
                <div class="p-space-md flex flex-col gap-space-sm">
                  <h3
                    class="font-title-md text-title-md text-on-surface font-bold leading-snug line-clamp-2"
                    id="preview-title"
                  >
                    Attacking the Sicilian Defense: Open Lines &amp; Pawn Storms
                  </h3>
                  <!-- Lecturer Info -->
                  <div class="flex items-center gap-space-sm pt-space-xs">
                    <div
                      class="w-8 h-8 rounded-full bg-secondary-container text-on-secondary-container flex items-center justify-center shrink-0"
                    >
                      <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                        >school</span
                      >
                    </div>
                    <div class="flex flex-col min-w-0">
                      <span
                        class="font-title-md text-title-md text-on-surface font-semibold truncate leading-tight"
                        id="preview-instructor"
                        >GM Tariq Al-Mansoor</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Lead Master Arbitrator</span
                      >
                    </div>
                  </div>
                  <!-- Date & Location -->
                  <div
                    class="flex flex-col gap-1 py-space-xs text-on-surface-variant font-body-sm text-body-sm"
                  >
                    <div class="flex items-center gap-space-xs">
                      <span
                        class="material-symbols-outlined text-secondary text-[16px]"
                        aria-hidden="true"
                        >calendar_today</span
                      >
                      <span id="preview-datetime">2025-06-20 16:00 UTC</span>
                    </div>
                    <div class="flex items-center gap-space-xs truncate">
                      <span
                        class="material-symbols-outlined text-outline text-[16px]"
                        aria-hidden="true"
                        >location_on</span
                      >
                      <span class="truncate" id="preview-location"
                        >Alpha Seminar Room &amp; Sensory DGT Boards</span
                      >
                    </div>
                  </div>
                  <!-- Capacity Progress Bar -->
                  <div class="flex flex-col gap-space-xs pt-space-xs">
                    <div class="flex items-center justify-between text-body-sm font-body-sm">
                      <span class="text-outline">Enrollment Status</span>
                      <span
                        class="font-mono text-on-surface font-semibold"
                        id="preview-capacity-counter"
                        >0 / 16 Registered</span
                      >
                    </div>
                    <div
                      class="w-full h-1.5 rounded-full bg-surface-container-high overflow-hidden"
                    >
                      <div class="h-full bg-primary w-[5%] rounded-full"></div>
                    </div>
                  </div>
                  <!-- Simulated Action -->
                  <div class="pt-space-xs mt-space-xs flex items-center gap-space-sm">
                    <button
                      class="w-full py-space-xs rounded-lg bg-primary-container text-on-primary-container font-title-md text-title-md font-semibold text-center opacity-90 cursor-not-allowed"
                      disabled
                      type="button"
                      title="Design preview"
                    >
                      Register for Workshop
                    </button>
                  </div>
                </div>
              </div>
            </div>
            <!-- Workshop Delivery Standards Card -->
            <div
              class="rounded-xl bg-surface-container-low p-space-lg flex flex-col gap-space-md shadow-sm"
            >
              <div class="flex items-center gap-space-sm pb-space-xs">
                <span
                  class="material-symbols-outlined text-secondary text-[22px]"
                  aria-hidden="true"
                  >verified</span
                >
                <div>
                  <h3 class="font-title-md text-title-md text-on-surface font-bold">
                    Workshop Delivery Standards
                  </h3>
                  <p class="font-body-sm text-body-sm text-outline">
                    Automated benefits applied to this operational masterclass.
                  </p>
                </div>
              </div>
              <div class="flex flex-col gap-space-sm">
                <!-- Item 1: DGT Sensor Boards -->
                <div
                  class="flex items-start gap-space-sm p-space-sm rounded-lg bg-surface-container-lowest"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[20px] shrink-0 mt-0.5"
                    aria-hidden="true"
                    >sensors</span
                  >
                  <div class="flex flex-col min-w-0">
                    <span class="font-title-md text-title-md text-on-surface font-medium"
                      >Interactive Sensory Boards</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Live hardware moves stream directly to the arbiter console with sub-100ms
                      latency.</span
                    >
                  </div>
                </div>
                <!-- Item 2: Lifetime Recording -->
                <div
                  class="flex items-start gap-space-sm p-space-sm rounded-lg bg-surface-container-lowest"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[20px] shrink-0 mt-0.5"
                    aria-hidden="true"
                    >smart_display</span
                  >
                  <div class="flex flex-col min-w-0">
                    <span class="font-title-md text-title-md text-on-surface font-medium"
                      >Lifetime Video &amp; Audio Vault</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >4K recordings with synchronized camera-on-board angle auto-indexed by move
                      variation.</span
                    >
                  </div>
                </div>
                <!-- Item 3: Master PGN -->
                <div
                  class="flex items-start gap-space-sm p-space-sm rounded-lg bg-surface-container-lowest"
                >
                  <span
                    class="material-symbols-outlined text-primary text-[20px] shrink-0 mt-0.5"
                    aria-hidden="true"
                    >file_download</span
                  >
                  <div class="flex flex-col min-w-0">
                    <span class="font-title-md text-title-md text-on-surface font-medium"
                      >Annotated Master PGN File</span
                    >
                    <span class="font-body-sm text-body-sm text-on-surface-variant"
                      >Full commentary notes, GM sidelines, and engine novelty tags distributed to
                      registered PLAYER accounts.</span
                    >
                  </div>
                </div>
              </div>
              <!-- Role Badges info -->
              <div
                class="pt-space-xs flex items-center justify-between text-body-sm font-body-sm text-outline"
              >
                <span>Supported Platform Roles:</span>
                <div class="flex items-center gap-space-xs font-mono font-semibold">
                  <span
                    class="px-space-xs py-0.5 rounded bg-surface-container text-secondary text-[11px]"
                    >ADMIN</span
                  >
                  <span
                    class="px-space-xs py-0.5 rounded bg-surface-container text-tertiary text-[11px]"
                    >PLAYER</span
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
