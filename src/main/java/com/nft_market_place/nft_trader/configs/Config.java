package com.nft_market_place.nft_trader.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Config {
    @Autowired
    private PasswordEncoder passwordEncoder;

    
}
