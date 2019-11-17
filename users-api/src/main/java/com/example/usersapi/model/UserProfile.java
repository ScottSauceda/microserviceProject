package com.example.usersapi.model;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "address")
    private String address;


    @Column(name = "username")
    private String username;

    public UserProfile() {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("User{")
                .append("id:").append(id)
                .append(",email:").append(email)
                .append(",mobile:").append(mobile)
                .append(",username:").append(address)
                .append("}");
        return s.toString();
    }

}
