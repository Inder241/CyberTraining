package com.example.cybertraining.Models;

public class ProfileModel {

    private String name;
    private String email;


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ProfileModel(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
