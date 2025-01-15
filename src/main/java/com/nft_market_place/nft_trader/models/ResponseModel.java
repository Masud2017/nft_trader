package com.nft_market_place.nft_trader.models;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseModel {
    private String message;
    private HttpStatus statusCode;

    public ResponseModel setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResponseModel setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
