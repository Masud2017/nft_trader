package com.nft_market_place.nft_trader.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nft_market_place.nft_trader.models.ProfileImage;
import com.nft_market_place.nft_trader.models.ResponseModel;
import com.nft_market_place.nft_trader.models.User;

import com.nft_market_place.nft_trader.services.AuthService;

@RestController
@RequestMapping(value = "/api/auth", method = RequestMethod.GET)
public class AuthController {
    @Autowired
    private AuthService authService;
    private Logger logger = LoggerFactory.getLogger(AuthController.class);


    @PostMapping("/register")
    public ResponseModel register(@RequestBody User user) {
        this.logger.info("The value of user is : " + user.getPassword());
        return this.authService.register(user);
    }

    @PostMapping("/nonce/{address}")
    public ResponseEntity<ResponseModel> getNonce(@PathVariable String address) {
        return ResponseEntity.ok(this.authService.getNonce(address));
    }

    @PostMapping("/profile_image/{address}")
    public ResponseEntity<ResponseModel> addProfileImage(@ModelAttribute ProfileImage profileImage, @PathVariable String address) {
        return ResponseEntity.ok(this.authService.addProfileImage(profileImage,address));
    }
}
