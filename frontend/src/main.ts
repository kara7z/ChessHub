import { createPinia } from 'pinia'
import { createApp } from 'vue'
import { createRouter, createWebHistory } from 'vue-router'
import App from './App.vue'
import ScaffoldView from './views/ScaffoldView.vue'
import './style.css'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [{ path: '/', component: ScaffoldView }],
})

createApp(App).use(createPinia()).use(router).mount('#app')
