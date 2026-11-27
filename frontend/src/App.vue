<script setup lang="ts">
import { computed } from 'vue'
import { useRoute } from 'vue-router'
import BottomNavigation from './components/navigation/BottomNavigation.vue'
import { findDashboardSection } from './components/navigation/dashboard-navigation'

const route = useRoute()
const dashboardSection = computed(() => findDashboardSection(route.matched.at(-1)?.path ?? ''))
</script>

<template>
  <RouterView :key="$route.path" />
  <BottomNavigation :key="`navigation:${$route.path}`" :dashboard-section="dashboardSection?.to" />
</template>
