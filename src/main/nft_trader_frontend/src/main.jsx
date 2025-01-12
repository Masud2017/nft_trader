import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { Provider } from "./components/ui/provider"
import App from './App.jsx'
import { MetaMaskProvider } from '@metamask/sdk-react'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <MetaMaskProvider
      sdkOptions={{
        dappMetadata: {
          name: "Example React Dapp",
          url: window.location.href,
        },
        infuraAPIKey: "291de4047d444eb4b51ca7e682520be5",
      }}
    >
      <Provider>
        <App />
      </Provider>
    </MetaMaskProvider>
  </StrictMode>,
)