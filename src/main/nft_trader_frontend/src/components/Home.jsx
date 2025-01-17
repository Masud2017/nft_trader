import { Box, Button, Center, Flex, HStack, Tooltip } from "@chakra-ui/react";
import { useSDK } from "@metamask/sdk-react";
import React, { useState } from "react";
import { LuInfo } from "react-icons/lu";
import Header from "./Header";


const Home = () => {
    const [account, setAccount] = useState();
    const { sdk, connected, connecting, provider, chainId } = useSDK();

    const connect = async () => {
        try {
            const accounts = await sdk?.connect();
            setAccount(accounts?.[0]);
        } catch (err) {
            console.warn("failed to connect..", err);
        }
    };
    return (
        <>
        <Header/>
         <Flex direction = "horizontal" w = "100vw" h = "100vh" p = {4}>
                <Box w = "50%" h = "100%">

                </Box>

                <Box w = {"50%"} h={"100%"}>
                    <Box shadow={"2xl"} bg = "#262523" w={"35rem"} p={4} color="white" style={{marginBottom:"1rem"}} borderRadius={"md"}>
                    <Center>
                            <HStack spacing={4}>
                                <h1 className = "kanit-bold">Please connect with your metamask wallet to continue further.</h1>
                            {/* <Tooltip content={"Connect with your metamask wallet to continue further."} aria-label="A tooltip"> */}
                                <LuInfo/>
                            {/* </Tooltip> */}

                            </HStack>
                        
                    </Center>
                    <Center mt={4}>
                        <Button onClick={connect}>Connect</Button>
                    </Center>
                </Box>

                {connected && (
                    <div>
                    <>
                        {chainId && `Connected chain: ${chainId}`}
                        <p></p>
                        {account && `Connected account: ${account}`}
                    </>
                    </div>
                )}
                </Box>
            </Flex>
        </>
    );
}
export default Home;