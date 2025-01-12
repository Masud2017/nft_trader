package com.nft_market_place.nft_trader.models;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @JsonIgnore
    @Column(name = "password")
    private String password;
    @Column(name = "roles")
    private List<String> roles;
    @OneToMany(mappedBy = "user", targetEntity = Nft.class, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Nft> nfts;
    @OneToOne(mappedBy = "user", targetEntity = ProfileImage.class, cascade = CascadeType.ALL)
    private ProfileImage profileImage;
}
