package com.nft_market_place.nft_trader.services;


import com.nft_market_place.nft_trader.models.Nft;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NftService {
    ResponseEntity<List<Nft>> getNfts(String address);
    ResponseEntity<Nft> getNft(Long id);
    ResponseEntity<Nft> getNft(String address);
    ResponseEntity<Nft> addNft(Nft nft);
    ResponseEntity<Nft> updateNft(Nft nft);
    ResponseEntity<Nft> deleteNft(Long id); // It does not delete anything rather it sends the nft to the trash node.
}
