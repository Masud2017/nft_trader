import { Box, Button, Center, Flex, HStack, Text, Tooltip } from "@chakra-ui/react";
import { useSDK } from "@metamask/sdk-react";
import React, { useEffect, useRef, useState } from "react";
import { LuInfo } from "react-icons/lu";
import Header from "./Header";

import NET from 'vanta/dist/vanta.net.min'
import { ReactTyped } from "react-typed";


const Home = () => {
    const [account, setAccount] = useState();
    const { sdk, connected, connecting, provider, chainId } = useSDK();

    const [vantaEffect, setVantaEffect] = useState(null)
    
    
    const myRef = useRef(null)
    useEffect(() => {
        if (!vantaEffect) {
          setVantaEffect(NET({
            el: myRef.current,
            mouseControls: true,
            touchControls: true,
            gyroControls: false,
            minHeight: 200.00,
            minWidth: 200.00,
            scale: 1.00,
            scaleMobile: 1.00
          }))
        }
        return () => {
          if (vantaEffect) vantaEffect.destroy()
        }
      }, [vantaEffect])

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
        <Flex direction={"column"} w = "100vw" h = "100vh" p = {4} ref = {myRef}>
            <Box w = "100%" p = {4}>
                <Center>
                    <Text fontSize={"xxx-large"} fontWeight={"bold"}>NFT Trader</Text>
                    
                    
                </Center>
                <Center>
                    <ReactTyped
                        strings={[
                            "Marketplace for nft",
                            "Trade any type of digital image",
                        ]}
                        typeSpeed={40}
                        backSpeed={50}
                        // attr="placeholder"
                        loop
                        >
                        {/* <input type="text" /> */}
                    </ReactTyped>
                </Center>
            </Box>

            <Center>
                <Box mt={"5"} w = "50rem" bg = "#262523" h = {"10rem"} p = {3} borderRadius={"md"}>
                    kk
                </Box>
            </Center>
        </Flex>
         {/* <Flex direction = "horizontal" w = "100vw" h = "100vh" p = {4} ref = {myRef}>
                <Box w = "50%" h = "100%" color = "white">
                    Hello world
                </Box>

                <Box w = {"50%"} h={"100%"}>
                    <Box shadow={"2xl"} bg = "#262523" w={"35rem"} p={4} color="white" style={{marginBottom:"1rem"}} borderRadius={"md"}>
                    <Center>
                            <HStack spacing={4}>
                                <h1 className = "kanit-bold">Please connect with your metamask wallet to continue further.</h1>
                                <LuInfo/>

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
            </Flex> */}
        </>
    );
}
export default Home;