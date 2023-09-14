package com.mikels.web.app.spring_mvc_basics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    /*
     * When using the @RequestParam anotation the url must send the parameter
     * /params/string?text=Hola otherwise there are parameters to add to
     * 
     * @rRequestParam() like the defaultValue to add a value if there isn't a
     * value sent, or adding the required = false, in this case you should add
     * validations for a null in the parameter
    */
    @GetMapping("/string")
    public String param(@RequestParam(name = "text", required = false) String text, Model model) {
        model.addAttribute("textito", "Texto enviado: " + text);
        return "params/string";
    }

    @GetMapping("/multi-params")
    public String param(@RequestParam String text, @RequestParam Integer number, Model model) {
        model.addAttribute("textito", "Texto enviado: " + text + " number: '" + number + "'");
        return "params/string";
    }
    @GetMapping("/multi-params-servlet")
    public String param(HttpServletRequest request, Model model) {
        String saludo = request.getParameter("text");
        Integer number = null;
        try {
            number = Integer.parseInt(request.getParameter("number"));
        } catch (Exception e) {
            number = 0;
        }
        model.addAttribute("textito", "Texto enviado: " + saludo + ", number: '" + number + "'");
        return "params/string";
    }

}
