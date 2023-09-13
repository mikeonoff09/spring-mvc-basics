package com.mikels.web.app.spring_web_app_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mikels.web.app.spring_web_app_1.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({ "/index", "/", "/home " })
    public String index(Model model) {
        model.addAttribute("title", "Spring Web App 1");
        return "index";
    }

    // @RequestMapping("/profile")
    @GetMapping("/profile")
    public String profile(Model model) {
        Usuario user = new Usuario();
        user.setNombre("Miguel");
        user.setApellido("Lara");
        user.setEmail("miguel@mail.com");
        model.addAttribute("usuario", user);
        model.addAttribute("title", user.getNombre() + " Profile Page");
        return "profile";
    }

    // @RequestMapping("/listar") // Should use a presice mapping anotation like @Getmapping or @PutMapping
    @GetMapping("/listar")
    public String listar(Model model) {
        // a way to add attributes to the model
        // List<Usuario> usuarios = new ArrayList<Usuario>();
        // usuarios.add(new Usuario("Miguel", "Lara", "miguel.lara@gmail.com"));
        // usuarios.add(new Usuario("Jhon", "Doe", "jhon.doe@gmail.com"));
        // usuarios.add(new Usuario("Jane", "Doe", "jane.doe@gmail.com"));

        // Atribute added in the addUsersAttributes
        // Another way to add is using the Arrays.asList
        // List<Usuario> usuarios = Arrays.asList(
        //         new Usuario("Miguel", "Lara", "miguel.lara@gmail.com"),
        //         new Usuario("Jhon", "Doe", "jhon.doe@gmail.com"),
        //         new Usuario("Jane", "Doe", "jane.doe@gmail.com"),
        //         new Usuario("Olger", "Doe", "olger.doe@gmail.com"));

        // model.addAttribute("usuarios", usuarios);

        model.addAttribute("title", "Listado de Usuarios");
        return "listar";
    }

    // This adds atributes for all the other methods
    @ModelAttribute
    public void addUsersAttributes(Model model) {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Miguel", "Lara", "miguel.lara@gmail.com"),
                new Usuario("Jhon", "Doe", "jhon.doe@gmail.com"),
                new Usuario("Jane", "Doe", "jane.doe@gmail.com"),
                new Usuario("Olger", "Doe", "olger.doe@gmail.com"));
        model.addAttribute("usuarios", usuarios);
    }

}
