package com.mikels.web.app.spring_mvc_basics.dto;

import com.mikels.web.app.spring_mvc_basics.models.User;

public class UserDto {
    private String name;
    private String lastName;
    private String email;
    private String title;
    private String fullName;

    public UserDto(User user, String title) {
        this.name = user.getNombre();
        this.lastName = user.getApellido();
        this.email = user.getEmail();
        this.title = title;
        this.fullName = this.title + " " + this.name + " " + this.lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.fullName = this.title + " " + this.name + " " + this.lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.fullName = this.title + " " + this.name + " " + this.lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.fullName = this.title + " " + this.name + " " + this.lastName;
    }

    public String getFullName() {
        return fullName;
    }

}
