import type { ObjectDirective } from 'vue'

const listeners = new WeakMap<HTMLButtonElement, AbortController>()
const lastOpeners = new WeakMap<HTMLElement, HTMLButtonElement>()

function dialogControls(panel: HTMLElement) {
  return Array.from(
    panel.querySelectorAll<HTMLElement>('a[href], button, input, select, textarea, [tabindex]'),
  ).filter(
    (control) =>
      control.tabIndex >= 0 && !control.matches(':disabled') && control.getClientRects().length > 0,
  )
}

function startListening(button: HTMLButtonElement) {
  const controller = new AbortController()
  listeners.set(button, controller)
  return { signal: controller.signal }
}

function stopListening(button: HTMLButtonElement) {
  listeners.get(button)?.abort()
  listeners.delete(button)
}

export const previewDisclosure: ObjectDirective<HTMLButtonElement, string> = {
  mounted(button, { value }) {
    const screen = button.closest('[data-preview-screen]')
    const panel = screen?.querySelector<HTMLElement>(`#${CSS.escape(value)}`)
    if (!screen || !panel) return

    const options = startListening(button)
    button.setAttribute('aria-controls', value)
    const dismiss = button.hasAttribute('data-preview-dismiss')
    const modal = panel.getAttribute('aria-modal') === 'true'
    if (!dismiss) button.setAttribute('aria-expanded', 'false')

    const setOpen = (open: boolean) => {
      panel.toggleAttribute('data-open', open)
      const openers = screen.querySelectorAll<HTMLButtonElement>(
        `[aria-controls="${CSS.escape(value)}"]:not([data-preview-dismiss])`,
      )
      openers.forEach((opener) => opener.setAttribute('aria-expanded', String(open)))
      if (!open) {
        const opener = lastOpeners.get(panel) ?? openers[0]
        lastOpeners.delete(panel)
        opener?.focus()
      } else {
        lastOpeners.set(panel, button)
        if (modal) {
          panel.tabIndex = -1
          const firstControl = dialogControls(panel)[0] ?? panel
          firstControl.focus()
        }
      }
    }

    button.addEventListener(
      'click',
      () => setOpen(!dismiss && !panel.hasAttribute('data-open')),
      options,
    )
    if (dismiss) return
    for (const element of [button, panel]) {
      element.addEventListener(
        'keydown',
        (event: KeyboardEvent) => {
          if (!panel.hasAttribute('data-open') || event.defaultPrevented) return
          if (event.key === 'Escape') {
            event.preventDefault()
            setOpen(false)
          } else if (modal && event.key === 'Tab') {
            const controls = dialogControls(panel)
            const first = controls[0]
            const last = controls.at(-1)
            const target = event.shiftKey ? last : first
            const boundary = event.shiftKey ? first : last
            if (document.activeElement === panel || document.activeElement === boundary) {
              event.preventDefault()
              const focusTarget = target ?? panel
              focusTarget.focus()
            }
          }
        },
        options,
      )
    }
  },
  unmounted: stopListening,
}

export const previewPassword: ObjectDirective<HTMLButtonElement, string> = {
  mounted(button, { value }) {
    const input = button.closest('[data-preview-screen]')
      ?.querySelector<HTMLInputElement>(`#${CSS.escape(value)}`)
    if (!input) return

    const options = startListening(button)
    const icon = button.querySelector('.material-symbols-outlined')
    button.setAttribute('aria-controls', value)
    button.setAttribute('aria-pressed', 'false')
    button.addEventListener('click', () => {
      const visible = input.type === 'password'
      input.type = visible ? 'text' : 'password'
      button.setAttribute('aria-pressed', String(visible))
      button.setAttribute('aria-label', visible ? 'Hide password' : 'Show password')
      if (icon) icon.textContent = visible ? 'visibility_off' : 'visibility'
    }, options)
  },
  unmounted: stopListening,
}
