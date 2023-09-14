package com.mikels.web.app.spring_mvc_basics.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mikels.web.app.spring_mvc_basics.models.Usuario;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    // notice that here we use $ not @ like in the html file
    @Value("${texto.indexcontroller.index.title}")
    private String textoIndex;
    @Value("${texto.indexcontroller.profile.title}")
    private String textoProfile;
    @Value("${texto.indexcontroller.listar.title}")
    private String textoListar;

    @GetMapping({ "/index", "/", "/home " })
    public String index(Model model) {
        model.addAttribute("title", textoIndex);
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
        model.addAttribute("title", user.getNombre() + textoProfile);
        return "profile";
    }

    // @RequestMapping("/listar") // Should use a presice mapping anotation like
    // @Getmapping or @PutMapping
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
        // new Usuario("Miguel", "Lara", "miguel.lara@gmail.com"),
        // new Usuario("Jhon", "Doe", "jhon.doe@gmail.com"),
        // new Usuario("Jane", "Doe", "jane.doe@gmail.com"),
        // new Usuario("Olger", "Doe", "olger.doe@gmail.com"));

        // model.addAttribute("usuarios", usuarios);

        model.addAttribute("title", textoListar);
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
