import {Box} from '@chakra-ui/react';
import Header from './components/Header';
import Home from './components/Home';
import MessageBox from './components/MessageBox';
import SearchBar from './components/SearchBar';
function App() {
  

  return (
    <Box flex={1} flexDirection={"column"} h = {"100%"} w={"100%"} position = {"relative"}>
      <Header/>
      <Home />    
      <MessageBox/>
    </Box>
  )
}

export default App
