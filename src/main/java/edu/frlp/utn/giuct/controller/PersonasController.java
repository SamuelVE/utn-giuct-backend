package edu.frlp.utn.giuct.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/gestiondepersonas")
public class PersonasController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/all")
    public List<String> getAll() {
        System.out.println("GestionDePersonasController -> findAll()");
        return Collections.singletonList("Hola");
    }
}
