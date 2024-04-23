package com.mikels.web.app.spring_mvc_basics.dto;

import com.mikels.web.app.spring_mvc_basics.models.User;

public class UserDto2 {
    private User user;
    private String title;
    private String fullName;

    // getters ans setters
    public UserDto2(User user, String title) {
        this.user = user;
        this.title = title;
        this.fullName = this.title + " " + this.user.getNombre() + " " + this.user.getApellido();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        this.fullName = this.title + " " + this.user.getNombre() + " " + this.user.getApellido();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.fullName = this.title + " " + this.user.getNombre() + " " + this.user.getApellido();
    }

    public String getFullName() {
        return fullName;
    }
}
