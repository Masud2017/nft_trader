package com.nft_market_place.nft_trader.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public List<String> getExclusionUrlList() {
        List<String> urlList = new ArrayList<String>();
        urlList.add("/");
        urlList.add("/login");
        urlList.add("/register");
        return urlList;
    }



}
