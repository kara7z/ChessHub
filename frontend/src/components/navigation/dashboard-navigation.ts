export const dashboardNavigation = [
  { to: '/dashboard', label: 'Overview', icon: 'grid_view' },
  { to: '/dashboard/accounts', label: 'Accounts', icon: 'group' },
  { to: '/dashboard/matches', label: 'Matches', icon: 'swords' },
  { to: '/dashboard/seasons', label: 'Seasons', icon: 'emoji_events' },
  { to: '/dashboard/events', label: 'Events', icon: 'event_available' },
  { to: '/dashboard/workshops', label: 'Workshops', icon: 'co_present' },
  { to: '/dashboard/chess-tricks', label: 'Chess tricks', icon: 'lightbulb' },
  { to: '/dashboard/activity-logs', label: 'Activity logs', icon: 'history_edu' },
]

export function findDashboardSection(path: string) {
  return dashboardNavigation.find(
    ({ to }) => path === to || (to !== '/dashboard' && path.startsWith(`${to}/`)),
  )
}
