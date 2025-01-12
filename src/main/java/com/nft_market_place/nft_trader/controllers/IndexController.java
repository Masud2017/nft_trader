package com.nft_market_place.nft_trader.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// https://stackoverflow.com/questions/64058885/how-to-integrate-a-react-webapp-inside-a-spring-boot-application-with-jar-packag

@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Welcome to NFT Trader!";
    }    
}
