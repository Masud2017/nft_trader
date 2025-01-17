import { Center, HStack } from '@chakra-ui/react';
import Header from './components/Header';
import Home from './components/Home';
function App() {
  

  return (
    <HStack boxOrient={"vertical"} h={"100vh"} w={"100vw"} spacing={0}>
      <Center w="100%" h="100%" flex={true} flexDirection="column" alignItems={"center"}> 
        <Home />    
      </Center>
    </HStack>
  )
}

export default App
