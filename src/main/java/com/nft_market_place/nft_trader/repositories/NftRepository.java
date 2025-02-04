package com.nft_market_place.nft_trader.repositories;

import com.nft_market_place.nft_trader.models.Nft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NftRepository extends JpaRepository<Nft, Long> {

}
