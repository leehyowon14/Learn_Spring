package com.example.BabyLionIsRoaring.controller;

public class UserRequest {
    private final String username;
    private final String userpart;

    public UserRequest(String username, String userpart) {
        this.username = username;
        this.userpart = userpart;
    }

    public String getUsername() {
        return this.username;
    }

    public String getUserpart() {
        return this.userpart;
    }
}
