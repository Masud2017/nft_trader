package com.nft_market_place.nft_trader.services;

import com.nft_market_place.nft_trader.models.Nft;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NftServiceImpl implements NftService {
    @Override
    public ResponseEntity<List<Nft>> getNfts(String address) {
        
        return null;
    }

    @Override
    public ResponseEntity<Nft> getNft(Long id) {
        
        return null;
    }

    @Override
    public ResponseEntity<Nft> getNft(String address) {
        
        return null;
    }

    @Override
    public ResponseEntity<Nft> addNft(Nft nft) {
        
        return null;
    }

    @Override
    public ResponseEntity<Nft> updateNft(Nft nft) {
        
        return null;
    }

    @Override
    public ResponseEntity<Nft> deleteNft(Long id) {
        
        return null;
    }

}
