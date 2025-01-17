import { Avatar, Box, Button, Center, HStack } from "@chakra-ui/react";
import { LuSearch } from "react-icons/lu";
import SearchBar from "./SearchBar";

const Header = ()=> {
    

    return (
       <Box p = {"4"} w = {"100%"} bg = {"#262523"} color = {"white"}>
            <HStack flex={1} justifyContent={"space-between"}>
                <Center>Image</Center>
                <HStack justifyContent={"space-between"} flex = {1}>
                    <SearchBar/>
                    <HStack>
                        <Button>Home</Button>
                        <Button>My NFTs</Button>
                        <Button>My Collections</Button>
                        <Button>My Profile</Button>
                    </HStack>
                </HStack>
            </HStack>
       </Box>
      )    
}

export default Header;