package com.Mentis.Mentis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// anotador rest controller
// este permite tener varias rutas
@RestController
public class ControladorRest {

    // get mapping define una ruta para que responda el método
    @GetMapping("/")
    public String saludar() {
        return "Hola mundo, primera página web con Spring Boot";
    }


    @GetMapping("/about")
    public String presentar() {
        return "Proyecto Mentis del grupo Ada Lovelace";
    }
}
