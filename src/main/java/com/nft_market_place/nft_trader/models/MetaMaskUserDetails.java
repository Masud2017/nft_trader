package com.nft_market_place.nft_trader.models;

import java.util.Collections;

public class MetaMaskUserDetails extends org.springframework.security.core.userdetails.User {
    private final Integer nonce;


    public MetaMaskUserDetails(String address, String signature, Integer nonce) {
        super(address, signature, Collections.emptyList());

        this.nonce = nonce;
    }
   
    
}
