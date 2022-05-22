package com.foth.petinder.Classes.Aid;

public class Aid {

    private String profilePhoto;
    private String location;
    private String explanation;

    public Aid(String profilePhoto, String location, String explanation) {
        this.profilePhoto = profilePhoto;
        this.location = location;
        this.explanation = explanation;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
