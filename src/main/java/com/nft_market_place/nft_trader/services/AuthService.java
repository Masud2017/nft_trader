package com.nft_market_place.nft_trader.services;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.nft_market_place.nft_trader.models.ProfileImage;
import com.nft_market_place.nft_trader.models.ResponseModel;
import com.nft_market_place.nft_trader.models.User;
import com.nft_market_place.nft_trader.repositories.UserRepository;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    private Logger logger = LoggerFactory.getLogger(AuthService.class);
    

    public ResponseModel getNonce(String address) {
        User user = this.userRepository.findByAddress(address);

        return new ResponseModel().setMessage(String.valueOf(user.getNonce())).setStatusCode(HttpStatus.OK);
    }
    
    public ResponseModel authenticate(User user) {
        User result = this.userRepository.findByAddress(user.getAddress());
        

        if (result == null) {
            return new ResponseModel().setMessage("User not found").setStatusCode(HttpStatus.NOT_FOUND);
        }
        // if (!this.passwordEncoder.matches(user.getPassword(), result.getPassword())) {
        //     return new ResponseModel().setMessage("Invalid password").setStatusCode(HttpStatus.UNAUTHORIZED);
        // }

        

        return new ResponseModel().setMessage("User authenticated successfully").setStatusCode(HttpStatus.OK);
    }

    public ResponseModel register(User user) {
        User result = this.userRepository.findByAddress(user.getAddress());
        if (result != null) {
            return new ResponseModel().setMessage("The user is already registered").setStatusCode(HttpStatus.BAD_REQUEST);
        }


        user.setPassword(this.passwordEncoder.encode(user.getPassword()));

        this.userRepository.save(user);
        return new ResponseModel().setMessage("User registered successfully").setStatusCode(HttpStatus.OK);
    }

    public ResponseModel addProfileImage(ProfileImage profileImage, Long userId) {
        User user = this.userRepository.findById(userId).get();
        user.setProfileImage(profileImage);
        this.userRepository.save(user);
        return new ResponseModel().setMessage("Profile image added successfully").setStatusCode(HttpStatus.OK);
    }
}
