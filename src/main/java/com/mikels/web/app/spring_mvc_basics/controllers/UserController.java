package com.mikels.web.app.spring_mvc_basics.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mikels.web.app.spring_mvc_basics.models.User;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public String getUserList(Model model) {
        User user1 = new User("One","lara", "mail+1@gmail.com");
        User user2 = new User("Two","lara", "mail+2@gmail.com");
        User user3 = new User("Three","lara", "mail+3@gmail.com");
        List<User> users = new ArrayList<User>();
        String title = "A bigass title";
        users.add(user1);
        users.add(user2);
        users.add(user3);
        model.addAttribute("users",users); // The name in "" is the one that will be used in the template
        model.addAttribute("title", title);
        return "user_list";
    }
}
