package com.example.snykbootweb;

import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    private String userName = "admin";
    private String password = "shwhehe67whd!";

    public String getPassword () {
        return password;
    }
}