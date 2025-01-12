package com.nft_market_place.nft_trader.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/auth", method = RequestMethod.GET)
public class AuthController {
    @GetMapping("/register")
    public String register() {
        return "Register";
    }
}
