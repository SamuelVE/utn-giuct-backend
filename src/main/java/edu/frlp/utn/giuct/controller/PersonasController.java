package edu.frlp.utn.giuct.controller;


import edu.frlp.utn.giuct.models.PersonaModel;
import edu.frlp.utn.giuct.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gestiondepersonas")
public class PersonasController {

    @Autowired
    private PersonaService personaService;

    //CONSULTA

    @RequestMapping("/")
    public List<PersonaModel> consultarPersonas(){
        return personaService.findAll();
    }

    @RequestMapping("/id/{id}")
    public PersonaModel getPersonById(@PathVariable Integer id) {
        System.out.println("GestionDePersonasController -> getPersonById()");
        return personaService.findPersonById(id);
    }

    @RequestMapping("/nombre/{nombre}")
    public PersonaModel getPersonByNombre(@PathVariable String nombre) {
        System.out.println("GestionDePersonasController -> getPersonByNombre()");
        return personaService.findPersonByNombre(nombre);
    }

    //ALTA
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    List<PersonaModel> createPerson(@RequestBody PersonaModel person) {
        System.out.println("GestionDePersonasController -> createPerson()");
        personaService.createPerson(person);
        return personaService.findAll();
    }

    //MODIFICACION
    @RequestMapping(path = "/id/{id}", method = RequestMethod.PUT)
    public @ResponseBody List<PersonaModel> updatePerson(@PathVariable Integer id, @RequestBody PersonaModel person) {
        System.out.println("GestionDePersonasController -> updatePerson()");
        personaService.updatePerson(id, person);
        return personaService.findAll();
    }

    //BAJA
    @RequestMapping(method = RequestMethod.DELETE, value="/id/{id}")
    public @ResponseBody List<PersonaModel> removePerson(@PathVariable Integer id) {
        System.out.println("GestionDePersonasController -> removePerson()");
        personaService.deletePerson(id);
        return personaService.findAll();
    }

}
