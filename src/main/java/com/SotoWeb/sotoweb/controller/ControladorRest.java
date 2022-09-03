package com.SotoWeb.sotoweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludo() {
        return "Este es mi primer pagina Wen con Sprint Boot";
    }
}
