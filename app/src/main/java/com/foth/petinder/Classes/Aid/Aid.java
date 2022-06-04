package com.foth.petinder.Classes.Aid;

import com.foth.petinder.Classes.User.User;

public class Aid {

    private User user;
    private String location;
    private String explanation;

    public Aid(User user, String location, String explanation) {
        this.user = user;
        this.location = location;
        this.explanation = explanation;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
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
