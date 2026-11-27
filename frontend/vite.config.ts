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

  const env = loadEnv(mode, envDir, ['API_PROXY_TARGET', 'CHESSHUB_API_PORT'])
  const target = env.API_PROXY_TARGET ?? `http://127.0.0.1:${env.CHESSHUB_API_PORT || '8080'}`
  if (!URL.canParse(target) || !['http:', 'https:'].includes(new URL(target).protocol)) {
    throw new Error('API_PROXY_TARGET must be an absolute HTTP or HTTPS URL')
  }

  return {
    ...config,
    server: { proxy: { '^/api(?:[/?]|$)': { target } } },
  }
})
