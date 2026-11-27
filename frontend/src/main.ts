import { createPinia } from 'pinia'
import { createApp } from 'vue'
import App from './App.vue'
import { previewDisclosure, previewPassword } from './directives/preview-controls'
import { router } from './router'
import './style.css'

createApp(App)
  .use(createPinia())
  .use(router)
  .directive('preview-disclosure', previewDisclosure)
  .directive('preview-password', previewPassword)
  .mount('#app')
