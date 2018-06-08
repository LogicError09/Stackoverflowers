package com.leentantu.stackoverflowers.model;

import android.support.annotation.NonNull;

import java.util.List;
import java.util.Objects;

public class StackoverflowUser {

    private String userName;
    private String userLocation;
    private String userImageURL;
    private List<Badges> userBadges;
    private long userId;

    public StackoverflowUser(String name, String location
            , String imageURL, List<Badges> badges) {
        userName = name;
        userLocation = location;
        userImageURL = imageURL;
        userBadges = badges;
    }
    @NonNull
    public String getUserName() {
        return userName;
    }

    public void setUserName(@NonNull String userName) {
        this.userName = userName;
    }
    @NonNull
    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(@NonNull String userLocation) {
        this.userLocation = userLocation;
    }
    @NonNull
    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(@NonNull String userImage) {
        this.userImageURL = userImage;
    }
    @NonNull
    public List<Badges> getUserBadges() {
        return userBadges;
    }

    public void setUserBadges(@NonNull List<Badges> userBadges) {
        this.userBadges = userBadges;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StackoverflowUser)) return false;
        StackoverflowUser that = (StackoverflowUser) o;
        return Objects.equals(getUserName(), that.getUserName()) &&
                Objects.equals(getUserLocation(), that.getUserLocation()) &&
                Objects.equals(getUserImageURL(), that.getUserImageURL()) &&
                Objects.equals(getUserBadges(), that.getUserBadges()) &&
                Objects.equals(getUserId(), that.getUserId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserName(), getUserLocation(), getUserImageURL(), getUserBadges(), getUserId());
    }

}
