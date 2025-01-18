import { Avatar, AvatarIcon, Box, Button, Center, HStack } from "@chakra-ui/react";
import { LuChrome, LuLightbulb, LuSearch, LuShoppingBag, LuWallet } from "react-icons/lu";
import SearchBar from "./SearchBar";

const Header = ()=> {
    

    return (
       <Box p = {"4"} w = {"100%"} bg = {"#262523"} color = {"white"}>
            <HStack flex={1} justifyContent={"space-between"}>
                <Center><AvatarIcon/></Center>
                <Box w={"75%"}>
                    <HStack justifyContent={"space-between"} flex = {1}>
                        <SearchBar w = {"30rem"}/>
                        <HStack>
                            <Button><LuShoppingBag/> MarketPlace</Button>
                            <Button><LuLightbulb/> My NFTs</Button>
                            <Button><LuWallet/> My Collections</Button>
                            <Button><AvatarIcon />My Profile</Button>
                        </HStack>
                    </HStack>
                </Box>
            </HStack>
       </Box>
      )    
}

export default Header;