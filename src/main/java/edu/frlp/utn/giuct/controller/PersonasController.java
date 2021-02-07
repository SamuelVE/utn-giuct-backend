package edu.frlp.utn.giuct.controller;


import edu.frlp.utn.giuct.models.PersonaModel;
import edu.frlp.utn.giuct.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/gestiondepersonas")
public class PersonasController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping("/")
    public List<PersonaModel> consultarPersonas(){
        return personaService.findAll();
    }

    @RequestMapping("/all")
    public List<String> getAll() {
        System.out.println("GestionDePersonasController -> findAll()");
        return Collections.singletonList("Hola");
    }
}
