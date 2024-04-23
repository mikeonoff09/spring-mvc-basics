package com.mikels.web.app.spring_mvc_basics.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikels.web.app.spring_mvc_basics.dto.UserDto;
import com.mikels.web.app.spring_mvc_basics.dto.UserDto2;
import com.mikels.web.app.spring_mvc_basics.models.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping("/get/one")
    public UserDto getUser() {
        User user = new User("Mikel", "Lara", "email@mail.com");
        UserDto userDto = new UserDto(user, "Mr.");

        return userDto;
    }

    // Different structure of data returned
    @RequestMapping("/get/one2")
    public UserDto2 getUserDto2() {
        User user = new User("Mikel", "Lara", "email@mail.com");
        UserDto2 userDto2 = new UserDto2(user, "Mr.");

        return userDto2;
    }

    @RequestMapping("/get/list")
    public List<UserDto> getUserList() {
        List<UserDto> userList = new ArrayList<UserDto>();
        User user = new User("Mikel", "Lara", "email@mail.com");
        UserDto userDto = new UserDto(user, "Mr.");
        UserDto userDto2 = new UserDto(user, "Master");
        UserDto userDto3 = new UserDto(user, "Doctor");
        userList.add(userDto);
        userList.add(userDto2);
        userList.add(userDto3);
        return userList;
    }

    // Different structure of data returned
    @RequestMapping("/get/list2")
    public List<UserDto2> getUserDto2List() {
        List<UserDto2> userList = new ArrayList<UserDto2>();
        User user = new User("Mikel", "Lara", "email@mail.com");
        UserDto2 userDto = new UserDto2(user, "Mr.");
        UserDto2 userDto2 = new UserDto2(user, "Master");
        UserDto2 userDto3 = new UserDto2(user, "Doctor");
        userList.add(userDto);
        userList.add(userDto2);
        userList.add(userDto3);
        return userList;
    }

}
