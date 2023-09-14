package com.mikels.web.app.spring_mvc_basics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariableController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Send Parameters from Controller to View");
        
        return "variable/index";
    }

    @GetMapping("/ver/{pathVariable}")
    public String variableString(@PathVariable String pathVariable, Model model) {
        model.addAttribute("text", " The Parameter is:" + pathVariable);
        return "variable/ver";
    }

    @GetMapping("/ver/{pathVariable}/{number}")
    public String variableString(@PathVariable String pathVariable, @PathVariable Integer number, Model model) {

        model.addAttribute("text", " The Parameter is: " + pathVariable + " number: " + number);
        return "variable/ver";
    }
}
