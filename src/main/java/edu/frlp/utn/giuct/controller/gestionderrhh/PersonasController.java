package edu.frlp.utn.giuct.controller.gestionderrhh;


import edu.frlp.utn.giuct.models.gestionderrhh.*;
import edu.frlp.utn.giuct.service.gestionderrhh.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gestiondepersonas")
public class PersonasController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private PerfilInvestigadorService perfilInvestigadorService;

    @Autowired
    private PasaporteService pasaporteService;

    @Autowired
    private CargoService cargoService;

    @Autowired
    private MateriaService materiaService;

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

    @RequestMapping(method = RequestMethod.POST, value = "/perfilInvestigador")
    public @ResponseBody
    List<InvestigadorModel> createPerfilInvestigador(@RequestBody InvestigadorModel perfilInvestigador) {
        System.out.println("GestionDePersonasController -> createPerfilInvestigador()");
        perfilInvestigadorService.createPerfilInvestigador(perfilInvestigador);
        return perfilInvestigadorService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pasaporte")
    public @ResponseBody
    List<PasaporteModel> createPasaporte(@RequestBody PasaporteModel pasaporte) {
        System.out.println("GestionDePersonasController -> createPasaporte()");
        pasaporteService.createPasaporte(pasaporte);
        return pasaporteService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cargo")
    public @ResponseBody
    List<CargoModel> createCargo(@RequestBody CargoModel cargoModel) {
        System.out.println("GestionDePersonasController -> createCargo()");
        cargoService.createCargo(cargoModel);
        return cargoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/materia")
    public @ResponseBody
    List<MateriaModel> createMateria(@RequestBody MateriaModel materia) {
        System.out.println("GestionDePersonasController -> createMateria()");
        materiaService.createMateria(materia);
        return materiaService.findAll();
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
