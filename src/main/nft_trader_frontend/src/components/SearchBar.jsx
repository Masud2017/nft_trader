import { Box, Group, Input, InputElement } from "@chakra-ui/react";
import { useState } from "react";
import { LuSearch } from "react-icons/lu";

const SearchBar = ({ search, setSearch, w }) => {
    const [searchInput, setSearchInput] = useState("");
    const [showDropBox, setShowDropBox] = useState(false);

    return (
        <>
            <Group w = {w} bg = "#262523" borderRadius = "md" shadow = "md" whiteX ={0} position={"relative"}>
                {/* <InputAddon children={<LuSearch/>} /> */}
                <InputElement children = {<LuSearch/>} bg={"white"} placement={"start"}/>
                <Input

                    placeholder="Search for NFTs"
                    value={search}
                    onChange={(e) => {
                        setSearchInput(e.target.value);
                        
                    }}
                    onFocus={()=>setShowDropBox(false)}
                    variant={"flushed"}
                />
                <Box boxOrient={"vertical"} display={(showDropBox == false) ? "none" : "flex"} position={"absolute"} bottom = {"-10rem"} bg={"#262523"} w= "100%" p = {3} h = {"10rem"}>
                    <h6>Searching for : {searchInput}</h6>
                    <hr/>
                    <h5>Results</h5>
                    <Box overflow={"auto"} w = {"100%"} h = {"6rem"}>
                        jklj
                    </Box>
                </Box> 
            </Group>
            
        </>
    )
}
export default SearchBar;