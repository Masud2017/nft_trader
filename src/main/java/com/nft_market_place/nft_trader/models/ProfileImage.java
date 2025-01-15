package com.nft_market_place.nft_trader.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "profile_images")
@Getter
@Setter
public class ProfileImage {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String url;
    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User ownerUser;

    // generate getter and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public User getOwnerUser() {
        return ownerUser;
    }
    public void setOwnerUser(User ownerUser) {
        this.ownerUser = ownerUser;
    }

}
