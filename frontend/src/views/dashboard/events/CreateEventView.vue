<script setup lang="ts">
import DashboardLayout from '../../../components/layout/DashboardLayout.vue'
</script>

<template>
  <DashboardLayout>
    <main class="w-full pt-16 px-margin-desktop bg-surface">
      <div class="flex flex-col w-full pb-16">
        <!-- Sub-header & Breadcrumb Navigation -->
        <div class="flex flex-col gap-space-xs pt-space-md pb-space-lg">
          <nav class="flex items-center gap-space-xs text-outline font-body-sm text-body-sm">
            <RouterLink class="hover:text-primary transition-colors" to="/dashboard"
              >Dashboard</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <RouterLink class="hover:text-primary transition-colors" to="/dashboard/events"
              >Events</RouterLink
            >
            <span class="material-symbols-outlined text-[14px]" aria-hidden="true"
              >chevron_right</span
            >
            <span class="text-on-surface font-semibold">Create Event</span>
          </nav>
          <div class="flex flex-wrap items-end justify-between gap-space-md">
            <div class="flex flex-col">
              <h1 class="font-headline-lg text-headline-lg text-on-surface tracking-tight">
                Create New Event
              </h1>
              <p class="font-body-md text-body-md text-on-surface-variant mt-space-xs">
                Configure tournament or club event details, venue, capacity, and schedule.
              </p>
            </div>
            <div class="flex items-center gap-space-sm">
              <span
                class="inline-flex items-center gap-space-xs px-space-md py-space-xs rounded-full bg-surface-container-high text-on-surface-variant font-label-badge text-label-badge uppercase tracking-wider"
              >
                <span class="w-1.5 h-1.5 rounded-full bg-outline animate-pulse"></span>
                Form Auto-Saved
              </span>
            </div>
          </div>
        </div>
        <!-- Main Asymmetric Workspace Layout -->
        <div class="grid grid-cols-1 lg:grid-cols-12 gap-gutter-desktop items-start">
          <!-- Left Column: Primary Config Form (7 Cols) -->
          <div class="lg:col-span-7 flex flex-col gap-space-lg">
            <!-- Section 1: Core Details -->
            <section
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="w-7 h-7 rounded-lg bg-surface-container flex items-center justify-center text-primary"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >chess</span
                    >
                  </span>
                  <h2
                    class="font-headline-sm text-headline-sm text-on-surface font-semibold tracking-tight"
                  >
                    1. Basic Details
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Mandatory</span
                >
              </div>
              <!-- Event Title Input -->
              <div class="flex flex-col gap-space-xs">
                <label
                  class="font-title-md text-title-md text-on-surface flex items-center justify-between"
                  for="event-title"
                >
                  <span>Event Title</span>
                  <span class="font-body-sm text-body-sm text-outline">Max 80 chars</span>
                </label>
                <input
                  class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md"
                  id="event-title"
                  name="event-title"
                  placeholder="e.g. Summer Blitz Open 2025"
                  type="text"
                  value="Summer Blitz Open 2025"
                />
              </div>
              <!-- Category & Format Split -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="event-category"
                    >Event Category</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md pr-10 cursor-pointer"
                      id="event-category"
                      name="event-category"
                    >
                      <option selected value="TOURNAMENT">Tournament</option>
                      <option value="SIMULTANEOUS EXHIBITION">Simultaneous Exhibition</option>
                      <option value="CLUB SOCIAL">Club Social</option>
                      <option value="FRIENDLY MATCH">Friendly Match</option>
                      <option value="CHAMPIONSHIP">Championship</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-3 top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[20px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="time-control"
                    >Time Control Preset</label
                  >
                  <div class="relative">
                    <select
                      class="w-full appearance-none px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md pr-10 cursor-pointer"
                      id="time-control"
                      name="time-control"
                    >
                      <option value="3+2">Blitz 3+2 (FIDE Standard)</option>
                      <option value="5+0">Blitz 5+0 (Rapid Fire)</option>
                      <option value="10+5">Rapid 10+5 (Casual Rapid)</option>
                      <option value="15+10">Classical Club 15+10</option>
                      <option value="custom">Custom Arbitrated Control</option>
                    </select>
                    <span
                      class="material-symbols-outlined absolute right-3 top-1/2 -translate-y-1/2 text-outline pointer-events-none text-[20px]"
                      aria-hidden="true"
                      >expand_more</span
                    >
                  </div>
                </div>
              </div>
              <!-- Description with Markdown Action Bar -->
              <div class="flex flex-col gap-space-xs">
                <div class="flex items-center justify-between">
                  <label class="font-title-md text-title-md text-on-surface" for="event-desc"
                    >Description &amp; Charter</label
                  >
                  <div
                    class="flex items-center gap-space-xs bg-surface-container px-space-xs py-1 rounded-md text-outline font-label-badge text-label-badge"
                  >
                    <span class="hover:text-on-surface cursor-pointer px-1">B</span>
                    <span class="hover:text-on-surface cursor-pointer px-1 italic">I</span>
                    <span class="hover:text-on-surface cursor-pointer px-1">#</span>
                    <span
                      class="hover:text-on-surface cursor-pointer px-1 material-symbols-outlined text-[14px]"
                      aria-hidden="true"
                      >link</span
                    >
                  </div>
                </div>
                <textarea
                  class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md resize-y"
                  id="event-desc"
                  placeholder="Outline rounds structure, Swiss pairing guidelines, dress code, or tie-break mechanics..."
                  rows="4"
                >
Annual 7-round Swiss system blitz open. Open to all registered club members and grandmaster invitees. Cash prizes awarded to top 3 table finishers following strict tie-break arbitration.</textarea>
              </div>
              <!-- Cover Photo Asset Uploader -->
              <div class="flex flex-col gap-space-xs">
                <span class="font-title-md text-title-md text-on-surface">Cover Artwork</span>
                <div
                  class="relative w-full rounded-xl bg-surface-container p-space-md flex flex-col md:flex-row items-center gap-space-md overflow-hidden group"
                >
                  <div
                    class="w-full md:w-36 h-24 rounded-lg overflow-hidden shrink-0 relative bg-surface-container-high"
                  >
                    <img
                      alt="Chess Board Preview"
                      class="w-full h-full object-cover transition-transform duration-300 group-hover:scale-105"
                      data-alt="Macro atmospheric side shot of dark wooden tournament chess pieces on a board with a mechanical analog chess clock bathed in moody emerald and warm ambient rim lighting, cinematic realism"
                      id="uploader-preview-img"
                      src="/images/2734136ef35b.webp"
                    />
                    <div
                      class="absolute inset-0 bg-surface/40 flex items-center justify-center opacity-0 group-hover:opacity-100 transition-opacity"
                    >
                      <span
                        class="material-symbols-outlined text-primary text-[22px]"
                        aria-hidden="true"
                        >swap_horiz</span
                      >
                    </div>
                  </div>
                  <div class="flex min-w-0 flex-1 flex-col gap-1 w-full">
                    <div class="flex flex-wrap items-center justify-between gap-1">
                      <span class="font-title-md text-title-md text-on-surface font-medium [overflow-wrap:anywhere]"
                        >blitz_tournament_hero.webp</span
                      >
                      <span
                        class="font-label-badge text-label-badge text-secondary bg-secondary-container/50 px-2 py-0.5 rounded"
                        >Uploaded</span
                      >
                    </div>
                    <p class="font-body-sm text-body-sm text-outline">
                      Recommended dimension 1920x1080 (16:9). JPG, WebP or PNG up to 8MB.
                    </p>
                    <div class="flex flex-wrap items-center gap-space-sm mt-space-xs">
                      <button
                        class="px-space-sm py-1 rounded bg-surface-container-high hover:bg-surface-bright text-on-surface font-body-sm text-body-sm transition-colors flex items-center gap-1"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >file_upload</span
                        >
                        Replace Photo
                      </button>
                      <button
                        class="px-space-sm py-1 rounded text-error hover:bg-error-container/20 font-body-sm text-body-sm transition-colors flex items-center gap-1"
                        type="button"
                        disabled
                        title="Design preview"
                      >
                        <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                          >delete</span
                        >
                        Remove
                      </button>
                    </div>
                  </div>
                </div>
              </div>
            </section>
            <!-- Section 2: Logistics & Schedule -->
            <section
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center justify-between pb-space-xs">
                <div class="flex items-center gap-space-sm">
                  <span
                    class="w-7 h-7 rounded-lg bg-surface-container flex items-center justify-center text-primary"
                  >
                    <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                      >calendar_month</span
                    >
                  </span>
                  <h2
                    class="font-headline-sm text-headline-sm text-on-surface font-semibold tracking-tight"
                  >
                    2. Logistics &amp; Schedule
                  </h2>
                </div>
                <span
                  class="font-label-badge text-label-badge text-outline uppercase tracking-wider"
                  >Arbitration Rules</span
                >
              </div>
              <!-- Venue Location -->
              <div class="flex flex-col gap-space-xs">
                <label class="font-title-md text-title-md text-on-surface" for="event-venue"
                  >Physical Venue or Online Room</label
                >
                <div class="relative">
                  <span
                    class="material-symbols-outlined absolute left-3 top-1/2 -translate-y-1/2 text-outline text-[20px]"
                    aria-hidden="true"
                    >location_on</span
                  >
                  <input
                    class="w-full pl-10 pr-space-md py-space-sm rounded-lg bg-surface-container text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md"
                    id="event-venue"
                    name="event-venue"
                    placeholder="e.g. Main Club Hall, 4th Floor or Online Lichess Arena"
                    type="text"
                    value="Main Club Hall, 4th Floor"
                  />
                </div>
              </div>
              <!-- Date & Time Grid -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="start-time"
                    >Start Date &amp; Time (UTC)</label
                  >
                  <div class="relative">
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md [color-scheme:dark]"
                      id="start-time"
                      type="datetime-local"
                      value="2025-06-15T10:00"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="end-time"
                    >End Date &amp; Time (UTC)</label
                  >
                  <div class="relative">
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md [color-scheme:dark]"
                      id="end-time"
                      type="datetime-local"
                      value="2025-06-15T18:00"
                    />
                  </div>
                </div>
              </div>
              <!-- Player Cap & Registration Deadline -->
              <div class="grid grid-cols-1 md:grid-cols-2 gap-space-md">
                <div class="flex flex-col gap-space-xs">
                  <label
                    class="font-title-md text-title-md text-on-surface flex items-center justify-between"
                    for="player-cap"
                  >
                    <span>Max Capacity (Player Cap)</span>
                    <span class="font-label-badge text-label-badge text-outline">Swiss Limit</span>
                  </label>
                  <div class="relative">
                    <span
                      class="material-symbols-outlined absolute left-3 top-1/2 -translate-y-1/2 text-outline text-[20px]"
                      aria-hidden="true"
                      >groups</span
                    >
                    <input
                      class="w-full pl-10 pr-space-md py-space-sm rounded-lg bg-surface-container text-on-surface placeholder:text-outline focus:outline-none focus:bg-surface-container-high transition-colors font-label-numeric-md text-label-numeric-md"
                      id="player-cap"
                      max="256"
                      min="4"
                      type="number"
                      value="64"
                    />
                  </div>
                </div>
                <div class="flex flex-col gap-space-xs">
                  <label class="font-title-md text-title-md text-on-surface" for="deadline-time"
                    >Registration Deadline (UTC)</label
                  >
                  <div class="relative">
                    <input
                      class="w-full px-space-md py-space-sm rounded-lg bg-surface-container text-on-surface focus:outline-none focus:bg-surface-container-high transition-colors font-body-md text-body-md [color-scheme:dark]"
                      id="deadline-time"
                      type="datetime-local"
                      value="2025-06-12T23:59"
                    />
                  </div>
                </div>
              </div>
              <!-- Arbiter Configuration Options -->
              <div class="pt-space-xs flex flex-col gap-space-sm">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Tournament Controls</span
                >
                <div class="grid grid-cols-1 sm:grid-cols-2 gap-space-sm">
                  <label
                    class="flex items-center gap-space-sm p-space-sm rounded-lg bg-surface-container cursor-pointer hover:bg-surface-container-high transition-colors"
                  >
                    <input
                      checked
                      class="w-4 h-4 rounded bg-surface-container-highest text-primary accent-primary focus:ring-0"
                      type="checkbox"
                    />
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface leading-tight"
                        >Instant Confirmation</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Auto-admit players upon joining</span
                      >
                    </div>
                  </label>
                  <label
                    class="flex items-center gap-space-sm p-space-sm rounded-lg bg-surface-container cursor-pointer hover:bg-surface-container-high transition-colors"
                  >
                    <input
                      checked
                      class="w-4 h-4 rounded bg-surface-container-highest text-primary accent-primary focus:ring-0"
                      type="checkbox"
                    />
                    <div class="flex flex-col">
                      <span class="font-title-md text-title-md text-on-surface leading-tight"
                        >Public Spectator Feed</span
                      >
                      <span class="font-body-sm text-body-sm text-outline"
                        >Stream PGN moves to site catalog</span
                      >
                    </div>
                  </label>
                </div>
              </div>
            </section>
            <!-- Section 3: Action Buttons Footer -->
            <div
              class="bg-surface-container-low rounded-xl p-space-md flex flex-wrap items-center justify-between gap-space-md"
            >
              <div class="flex items-center gap-space-sm">
                <button
                  class="px-space-md py-space-sm rounded-lg text-outline hover:text-on-surface hover:bg-surface-container transition-colors font-title-md text-title-md"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  Cancel
                </button>
                <button
                  class="px-space-md py-space-sm rounded-lg bg-surface-container hover:bg-surface-container-high text-on-surface transition-colors font-title-md text-title-md flex items-center gap-1.5"
                  type="button"
                  disabled
                  title="Design preview"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >draft</span
                  >
                  Save as Draft
                </button>
              </div>
              <RouterLink
                class="px-space-lg py-space-sm rounded-lg bg-primary hover:bg-primary-fixed-dim text-on-primary font-title-md text-title-md font-semibold transition-all transform active:scale-95 shadow-md flex items-center gap-2"
                to="/dashboard/events/create"
              >
                <span class="material-symbols-outlined text-[20px]" aria-hidden="true"
                  >check_circle</span
                >
                Publish Event
              </RouterLink>
            </div>
          </div>
          <!-- Right Column: Live Event Preview & Tournament Rules (5 Cols) -->
          <div class="lg:col-span-5 flex flex-col gap-space-lg lg:sticky lg:top-20">
            <!-- Public Event Card Live Preview -->
            <div class="flex flex-col gap-space-xs">
              <div class="flex items-center justify-between px-space-xs">
                <div class="flex items-center gap-space-xs">
                  <span class="w-2 h-2 rounded-full bg-primary"></span>
                  <span
                    class="font-label-badge text-label-badge uppercase tracking-wider text-primary font-bold"
                    >Public Catalog Preview</span
                  >
                </div>
                <span class="font-body-sm text-body-sm text-outline">Real-time sync</span>
              </div>
              <div
                class="bg-surface-container-low rounded-xl overflow-hidden shadow-xl transition-all duration-300"
              >
                <!-- Card Image Header -->
                <div class="relative h-48 w-full overflow-hidden bg-surface-container-highest">
                  <img
                    alt="Public Event Preview Cover"
                    class="w-full h-full object-cover"
                    data-alt="Dramatic perspective shot of a competitive chess match with wooden Staunton pieces, tournament clock displaying time, in high contrast ambient green illumination"
                    id="preview-cover"
                    src="/images/dea59a4ab647.webp"
                  />
                  <div
                    class="absolute inset-0 bg-gradient-to-t from-surface-container-low via-surface-container-low/40 to-transparent"
                  ></div>
                  <!-- Category Badge -->
                  <div class="absolute top-space-md left-space-md flex items-center gap-space-xs">
                    <span
                      class="px-space-sm py-1 rounded bg-surface/80 backdrop-blur-md text-primary font-label-badge text-label-badge uppercase tracking-wider font-bold"
                      id="preview-badge"
                    >
                      TOURNAMENT
                    </span>
                    <span
                      class="px-space-sm py-1 rounded bg-secondary-container text-on-secondary-container font-label-badge text-label-badge uppercase tracking-wider font-semibold"
                      id="preview-status"
                    >
                      Draft
                    </span>
                  </div>
                  <!-- Fast Quick-Stats Pin -->
                  <div
                    class="absolute bottom-space-sm right-space-md flex items-center gap-space-xs bg-surface-container-lowest/80 backdrop-blur-md px-space-sm py-1 rounded text-on-surface font-label-numeric-md text-label-numeric-md"
                  >
                    <span
                      class="material-symbols-outlined text-[16px] text-secondary"
                      aria-hidden="true"
                      >timer</span
                    >
                    <span>3+2 Blitz</span>
                  </div>
                </div>
                <!-- Card Body -->
                <div class="p-space-lg flex flex-col gap-space-md">
                  <div class="flex flex-col gap-1">
                    <h3
                      class="font-headline-sm text-headline-sm text-on-surface font-bold tracking-tight"
                      id="preview-title-text"
                    >
                      Summer Blitz Open 2025
                    </h3>
                    <div
                      class="flex items-center gap-space-sm text-on-surface-variant font-body-sm text-body-sm mt-0.5"
                    >
                      <span class="flex items-center gap-1">
                        <span
                          class="material-symbols-outlined text-[16px] text-primary"
                          aria-hidden="true"
                          >event</span
                        >
                        <span id="preview-date-text">Jun 15, 2025 • 10:00 UTC</span>
                      </span>
                    </div>
                  </div>
                  <!-- Venue line -->
                  <div
                    class="flex items-center gap-space-xs text-on-surface-variant font-body-sm text-body-sm bg-surface-container px-space-md py-space-xs rounded-lg"
                  >
                    <span
                      class="material-symbols-outlined text-[16px] text-secondary shrink-0"
                      aria-hidden="true"
                      >location_on</span
                    >
                    <span class="truncate" id="preview-venue-text">Main Club Hall, 4th Floor</span>
                  </div>
                  <!-- Capacity Progress Indicator -->
                  <div class="flex flex-col gap-space-xs pt-space-xs">
                    <div class="flex justify-between items-center font-body-sm text-body-sm">
                      <span class="text-outline">Roster Fill</span>
                      <span
                        class="font-label-numeric-md text-label-numeric-md text-on-surface font-semibold"
                        id="preview-cap-text"
                        >0 / 64 Registered</span
                      >
                    </div>
                    <div class="w-full h-2 rounded-full bg-surface-container overflow-hidden">
                      <div
                        class="h-full bg-primary rounded-full transition-all duration-300"
                        style="width: 8%"
                      ></div>
                    </div>
                  </div>
                  <!-- Card Interactive Preview Footer -->
                  <div class="pt-space-xs flex items-center justify-between">
                    <div class="flex -space-x-2 overflow-hidden">
                      <div
                        class="inline-block h-6 w-6 rounded-full bg-surface-container-high ring-2 ring-surface-container text-[10px] flex items-center justify-center font-bold text-outline"
                      >
                        GM
                      </div>
                      <div
                        class="inline-block h-6 w-6 rounded-full bg-surface-container-highest ring-2 ring-surface-container text-[10px] flex items-center justify-center font-bold text-outline"
                      >
                        IM
                      </div>
                      <div
                        class="inline-block h-6 w-6 rounded-full bg-secondary-container ring-2 ring-surface-container text-[10px] flex items-center justify-center font-bold text-on-secondary-container"
                      >
                        +12
                      </div>
                    </div>
                    <span
                      class="text-primary font-body-sm text-body-sm font-semibold flex items-center gap-0.5"
                    >
                      Join Bracket
                      <span class="material-symbols-outlined text-[16px]" aria-hidden="true"
                        >arrow_forward</span
                      >
                    </span>
                  </div>
                </div>
              </div>
            </div>
            <!-- Official Tournament Arbitration Rules Card -->
            <div
              class="dashboard-panel flex flex-col gap-space-md p-space-lg"
            >
              <div class="flex items-center gap-space-sm pb-space-xs">
                <span
                  class="w-7 h-7 rounded-lg bg-surface-container flex items-center justify-center text-secondary"
                >
                  <span class="material-symbols-outlined text-[18px]" aria-hidden="true"
                    >gavel</span
                  >
                </span>
                <div class="flex flex-col">
                  <h3 class="font-title-md text-title-md text-on-surface font-bold leading-tight">
                    Rules &amp; Regulations
                  </h3>
                  <span class="font-body-sm text-body-sm text-outline"
                    >Platform Scoring System</span
                  >
                </div>
              </div>
              <!-- Official Match Points Scale -->
              <div class="flex flex-col gap-space-xs">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Official Points (No Elo)</span
                >
                <div class="grid grid-cols-3 gap-space-xs">
                  <div
                    class="flex flex-col items-center justify-center py-space-sm px-1 rounded-lg bg-surface-container"
                  >
                    <span class="font-label-numeric-lg text-label-numeric-lg text-primary font-bold"
                      >+20</span
                    >
                    <span class="font-label-badge text-label-badge uppercase text-outline mt-0.5"
                      >Win</span
                    >
                  </div>
                  <div
                    class="flex flex-col items-center justify-center py-space-sm px-1 rounded-lg bg-surface-container"
                  >
                    <span
                      class="font-label-numeric-lg text-label-numeric-lg text-tertiary font-bold"
                      >+10</span
                    >
                    <span class="font-label-badge text-label-badge uppercase text-outline mt-0.5"
                      >Draw</span
                    >
                  </div>
                  <div
                    class="flex flex-col items-center justify-center py-space-sm px-1 rounded-lg bg-surface-container"
                  >
                    <span class="font-label-numeric-lg text-label-numeric-lg text-error font-bold"
                      >0</span
                    >
                    <span class="font-label-badge text-label-badge uppercase text-outline mt-0.5"
                      >Loss</span
                    >
                  </div>
                </div>
              </div>
              <!-- Role Architecture -->
              <div class="flex flex-col gap-space-xs">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Participant Roles</span
                >
                <div class="flex flex-col gap-space-xs">
                  <div
                    class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container"
                  >
                    <div class="flex items-center gap-space-sm">
                      <span
                        class="material-symbols-outlined text-primary text-[18px]"
                        aria-hidden="true"
                        >verified_user</span
                      >
                      <span class="font-title-md text-title-md text-on-surface">ADMIN</span>
                    </div>
                    <span class="font-body-sm text-body-sm text-outline"
                      >Full pairing &amp; dispute override</span
                    >
                  </div>
                  <div
                    class="flex items-center justify-between p-space-sm rounded-lg bg-surface-container"
                  >
                    <div class="flex items-center gap-space-sm">
                      <span
                        class="material-symbols-outlined text-secondary text-[18px]"
                        aria-hidden="true"
                        >person</span
                      >
                      <span class="font-title-md text-title-md text-on-surface">PLAYER</span>
                    </div>
                    <span class="font-body-sm text-body-sm text-outline"
                      >Active tournament participant</span
                    >
                  </div>
                </div>
              </div>
              <!-- Tie-break Ranking Policy -->
              <div class="flex flex-col gap-space-xs pt-space-xs">
                <span
                  class="font-label-badge text-label-badge uppercase tracking-wider text-outline"
                  >Simplified Ranking Priority</span
                >
                <ol
                  class="flex flex-col gap-space-xs font-body-sm text-body-sm text-on-surface-variant"
                >
                  <li
                    class="flex items-center gap-space-sm bg-surface-container/60 px-space-md py-space-xs rounded-lg"
                  >
                    <span
                      class="w-5 h-5 rounded-full bg-primary-container text-on-primary-container font-label-badge text-label-badge flex items-center justify-center font-bold"
                      >1</span
                    >
                    <span class="text-on-surface font-medium">Total Match Points</span>
                  </li>
                  <li
                    class="flex items-center gap-space-sm bg-surface-container/60 px-space-md py-space-xs rounded-lg"
                  >
                    <span
                      class="w-5 h-5 rounded-full bg-surface-container-high text-on-surface font-label-badge text-label-badge flex items-center justify-center font-bold"
                      >2</span
                    >
                    <span>Total Number of Wins</span>
                  </li>
                  <li
                    class="flex items-center gap-space-sm bg-surface-container/60 px-space-md py-space-xs rounded-lg"
                  >
                    <span
                      class="w-5 h-5 rounded-full bg-surface-container-high text-on-surface font-label-badge text-label-badge flex items-center justify-center font-bold"
                      >3</span
                    >
                    <span>Overall Win Percentage (Win Rate)</span>
                  </li>
                </ol>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </DashboardLayout>
</template>
