import { Box, Heading, HStack, IconButton, Input } from "@chakra-ui/react";
import { useState } from "react";
import { LuArrowDown, LuArrowUp, LuGlobe } from "react-icons/lu";
import { animated, useSpring } from '@react-spring/web'


const MessageBox = ()=> {
    const [messageBoxToggle, setMessageBoxToggle] = useState(false);

    const msgBoxToggle = ()=> {
        setMessageBoxToggle(!messageBoxToggle);
        
    }

    return(
        <>
             {messageBoxToggle ? 
             <Box id = "message" h = "40rem" w = "30rem" bg = "#262523" bottom = {"0"}  right = {"0"}  color = "white" position={"fixed"} zIndex={"343434"}>
            <HStack bg={"black"} flex={1} flexDirection={"row"} justifyContent={"space-between"}  h = "5rem" w = "100%" p = {"3"}>
                <HStack>
                    <Heading as={"h3"}>Global Chat 
                    </Heading>
                    <LuGlobe/>
                </HStack>
                 <IconButton rounded = {"full"} onClick={()=> msgBoxToggle()}>
                    <LuArrowDown/>
                 </IconButton>
            </HStack>

            {/* Body */}
            <Box p = {3} overflow={"auto"} h = "75%">
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
                <h1>Hello world</h1>
            </Box>
            {/* message input */}
            <Box bg = "black" position={"absolute"} bottom = {"0"} p = {3} w = {"100%"} flex = {1} flexDirection={"row"}>
                <Input placeholder="Type your message ..." value = {"YOYO"}/>
            </Box>
        </Box> : 
        <Box h = "5rem" w = "30rem" bg = "#262523" bottom = {"0"}  right = {"0"}  color = "white" position={"fixed"} zIndex={"343434"}>
            
            <HStack bg={"black"} flex={1} flexDirection={"row"} justifyContent={"space-between"}  h = "5rem" w = "100%" p = {"3"}>
                <HStack>
                    <Heading as={"h3"}>Global Chat 
                    </Heading>
                    <LuGlobe/>
                </HStack>
                 <IconButton rounded = {"full"} onClick={()=> msgBoxToggle()}>
                    <LuArrowUp/>
                 </IconButton>
            </HStack>
            
        </Box>
        }
        </>
        
    );
}

export default MessageBox;