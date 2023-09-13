package com.mikels.web.app.spring_web_app_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/params")
public class ParamsController {

    @GetMapping("/")
    public String index(){
        return "params/index";
    }

    /* When using the @RequestParam anotation the url must send the parameter
     *  /params/string?text=Hola otherwise there are parameters to add to 
     * @rRequestParam() like the defaultValue to add a value if there isn't a 
     * value sent, or adding the required = false, in this case you should add
     * validations for a null in the parameter
     */
    @GetMapping("/string")
    public String param (@RequestParam(name = "text",required = false) String text,  Model model){
        model.addAttribute("textito", "Texto enviado: " + text);
        return "params/string";
    }
    
}
