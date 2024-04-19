package com.mikels.web.app.spring_mvc_basics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    /* Using redirect we loose the parameters of the request while using 
     * forward the parameters are not lost, the route is maintained
     * use forward only for controller routes
     */
    // a comment to test something
    @GetMapping("/home")
    private String home(){
        return "forward:/app/index";
    }
}
