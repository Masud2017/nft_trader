import { Box, Button } from "@chakra-ui/react";

const Header = ()=> {
    const { isOpen, onToggle } = useDisclosure()

    return (
       <Box>
        <Button className = "">Login</Button>
       </Box>
      )    
}

export default Header;