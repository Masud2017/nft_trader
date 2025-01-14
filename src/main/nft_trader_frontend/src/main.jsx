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
        infuraAPIKey: process.env.REACT_APP_INFURA_API_KEY,
      }}
    >
      <Provider>
        <App />
      </Provider>
    </MetaMaskProvider>
  </StrictMode>,
)