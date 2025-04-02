package com.example.BabyLionIsRoaring.controller;

import java.util.Map;

public class UserResponse {
    private final String username;
    private final String userpart;
    private final String message;

    public UserResponse(String username, String userpart, String message) {
        this.username = username;
        this.userpart = userpart;
        this.message = message;
    }

    public String getUsername() {
        return username;
    }
    public String getUserpart() {
        return userpart;
    }
    public String getMessage() {
        return message;
    }
}
