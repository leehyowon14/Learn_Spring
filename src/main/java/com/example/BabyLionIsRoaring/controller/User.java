package com.example.BabyLionIsRoaring.controller;

public class User {
    private final String username;
    private final String userpart;

    public User(String username, String userpart) {
        this.username = username;
        this.userpart = userpart;
    }

    public String getUsername() {
        return username;
    }
    public String getUserpart() {
        return userpart;
    }
}
