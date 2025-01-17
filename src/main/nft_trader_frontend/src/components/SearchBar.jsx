import { Box, Group, Input, InputAddon, InputElement } from "@chakra-ui/react";
import { useState } from "react";
import { LuSearch } from "react-icons/lu";

const SearchBar = ({ search, setSearch }) => {
    const [searchInput, setSearchInput] = useState("");
    const [showDropBox, setShowDropBox] = useState(false);

    return (
        <>
            <Group w = {"30rem"} bg = "#262523" borderRadius = "md" shadow = "md" whiteX ={0} position={"relative"}>
                {/* <InputAddon children={<LuSearch/>} /> */}
                <InputElement children = {<LuSearch/>} bg={"white"} placement={"start"}/>
                <Input

                    placeholder="Search for NFTs"
                    value={search}
                    onChange={(e) => {
                        setSearchInput(e.target.value);
                        
                    }}
                    onFocus={()=>setShowDropBox(true)}
                    variant={"flushed"}
                />
                <Box boxOrient={"vertical"} display={showDropBox} position={"absolute"} bottom = {"-10rem"} bg={"#262523"} w= "100%" p = {3} h = {"10rem"}>
                    <h6>Searching for : {searchInput}</h6>
                    <hr/>
                    <h5>Results</h5>
                    <Box overflow={"auto"} w = {"100%"} h = {"6rem"}>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                        <h7>Hello world</h7>
                    </Box>
                </Box> 
            </Group>
            
        </>
    )
}
export default SearchBar;