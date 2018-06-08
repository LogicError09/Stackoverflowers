package com.leentantu.stackoverflowers.model;

import java.util.List;

public class StackoverflowUser {

    private String userName;
    private String userLocation;
    private String userImage;
    private List<Badges> userBadges;

    public StackoverflowUser(String name, String location, List<Badges> badges){
        userName = name;
        userLocation = location;
        userBadges = badges;

    }

}
