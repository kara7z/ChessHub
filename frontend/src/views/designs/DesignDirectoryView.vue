<script setup lang="ts">
import ClubFooter from '../../components/layout/ClubFooter.vue'
import ClubHeader from '../../components/layout/ClubHeader.vue'
import { screenGroups } from '../../screens'

const sampleIds: Record<string, string> = {
  eventId: 'spring-rapid-open',
  workshopId: 'strategy-masterclass',
  playerId: 'adam-chen',
  matchId: 'sample-match',
  accountId: 'tariq-al-mansoor',
  seasonId: 'spring-2025',
  trickId: 'greek-gift',
}

function samplePath(path: string) {
  return path.replace(/:(\w+)/g, (_match, id: string) => sampleIds[id] ?? 'sample')
}
</script>

<template>
  <div class="page-layout min-h-dvh pt-16" data-preview-screen>
    <ClubHeader />
    <main class="w-full px-margin py-space-xl md:px-margin-desktop">
      <RouterLink class="text-primary underline-offset-4 hover:underline" to="/">
        Back to ChessHub
      </RouterLink>
      <h1 class="mt-space-md font-headline-lg text-headline-lg">Screen directory</h1>
      <p class="mt-space-xs text-on-surface-variant">
        Open any Grandmaster Dark design. The screens use sample data.
      </p>

      <div class="mt-space-xl grid gap-gutter md:grid-cols-2 xl:grid-cols-3">
        <section
          v-for="group of screenGroups"
          :key="group.title"
          class="rounded-xl bg-surface-container p-space-md"
        >
          <h2 class="font-headline-sm text-headline-sm text-primary">{{ group.title }}</h2>
          <ul class="mt-space-sm">
            <li v-for="[view, path, title] of group.screens" :key="view">
              <RouterLink
                :to="samplePath(path)"
                class="block rounded px-space-sm py-space-xs hover:bg-surface-container-high"
              >
                {{ title }}
              </RouterLink>
            </li>
          </ul>
        </section>
      </div>
    </main>
    <ClubFooter />
  </div>
</template>
