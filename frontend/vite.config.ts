import { fileURLToPath } from 'node:url'
import tailwindcss from '@tailwindcss/vite'
import vue from '@vitejs/plugin-vue'
import { defineConfig, loadEnv } from 'vite'

const envDir = fileURLToPath(new URL('..', import.meta.url))

export default defineConfig(({ command, mode }) => {
  const config = { plugins: [vue(), tailwindcss()], envDir }
  if (command !== 'serve') {
    return config
  }

  const target = loadEnv(mode, envDir, 'API_PROXY_TARGET').API_PROXY_TARGET
    ?? 'http://127.0.0.1:8080'
  if (!URL.canParse(target) || !['http:', 'https:'].includes(new URL(target).protocol)) {
    throw new Error('API_PROXY_TARGET must be an absolute HTTP or HTTPS URL')
  }

  return {
    ...config,
    server: { proxy: { '^/api(?:/|$)': { target } } },
  }
})
