import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { Provider } from "./components/ui/provider"
import App from './App.jsx'
import { MetaMaskProvider } from '@metamask/sdk-react'
// module.createRequire(import.meta.url)('dotenv').config()

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <MetaMaskProvider
      sdkOptions={{
        dappMetadata: {
          name: "Example React Dapp",
          url: window.location.href,
        },
        infuraAPIKey: "f6634e92a7534141bae3bc1be99d7390",
      }}
    >
      <Provider>
        <App />
      </Provider>
    </MetaMaskProvider>
  </StrictMode>,
)