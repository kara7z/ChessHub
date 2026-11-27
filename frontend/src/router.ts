import { createRouter, createWebHistory } from 'vue-router'
import type { Component } from 'vue'
import type { RouteRecordRaw } from 'vue-router'
import { screenGroups } from './screens'

const views = import.meta.glob<{ default: Component }>('./views/**/*.vue')

const screens: RouteRecordRaw[] = screenGroups.flatMap(({ screens }) =>
  screens.map(([view, path, title, alias]) => {
    const component = views[`./views/${view}.vue`]
    if (!component) {
      throw new Error(`Missing view: ${view}`)
    }

    const name = view.slice(view.lastIndexOf('/') + 1)
    return { path, name, component, ...(alias ? { alias } : {}), meta: { title } }
  }),
)

export const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    ...screens,
    {
      path: '/designs',
      component: () => import('./views/designs/DesignDirectoryView.vue'),
      meta: { title: 'Screen directory' },
    },
    {
      path: '/:pathMatch(.*)*',
      component: views['./views/errors/PageNotFoundView.vue'],
      meta: { title: 'Page not found' },
    },
  ],
  scrollBehavior(_to, _from, savedPosition) {
    return savedPosition ?? { top: 0 }
  },
})

router.afterEach((to) => {
  document.title = to.path === '/' ? 'ChessHub' : `${to.meta.title} · ChessHub`
})
