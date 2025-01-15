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
    // @JsonIgnore
    @Column(name = "password")
    private String password;
    @Column(name = "roles")
    private List<String> roles;
    @OneToMany(mappedBy = "user", targetEntity = Nft.class, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Nft> nfts;
    @JsonIgnore
    @OneToOne(mappedBy = "ownerUser", targetEntity = ProfileImage.class, cascade = CascadeType.ALL)
    private ProfileImage profileImage;

    // generate getter and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    public Set<Nft> getNfts() {
        return nfts;
    }
    public void setNfts(Set<Nft> nfts) {
        this.nfts = nfts;
    }
    public ProfileImage getProfileImage() {
        return profileImage;
    }
    public void setProfileImage(ProfileImage profileImage) {
        this.profileImage = profileImage;
    }

}
