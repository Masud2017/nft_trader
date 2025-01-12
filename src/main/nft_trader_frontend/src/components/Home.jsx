import { Button } from "@chakra-ui/react";
import { useSDK } from "@metamask/sdk-react";
import React, { useState } from "react";


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
            <h1 className = "kanit-thin">Home</h1>
            <Button onClick={connect}>Connect</Button>

            {connected && (
                <div>
                <>
                    {chainId && `Connected chain: ${chainId}`}
                    <p></p>
                    {account && `Connected account: ${account}`}
                </>
                </div>
            )}
        </>
    );
}
export default Home;