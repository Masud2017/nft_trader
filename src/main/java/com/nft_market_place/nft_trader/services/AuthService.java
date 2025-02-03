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


public interface AuthService {
    ResponseModel getNonce(String address);
    ResponseModel authenticate(User user);
    ResponseModel register(User user);
    ResponseModel addProfileImage(ProfileImage profileImage, Long userId)
    ResponseModel addProfileImage(ProfileImage profileImage, String address)
}
