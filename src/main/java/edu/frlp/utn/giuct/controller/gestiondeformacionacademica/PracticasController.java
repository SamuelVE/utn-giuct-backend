package edu.frlp.utn.giuct.controller.gestiondeformacionacademica;


import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import edu.frlp.utn.giuct.service.gestiondeformacionacademica.PracticaService;
import edu.frlp.utn.giuct.setup.DownloadFileFromBytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/gestiondeformacionacademica")
public class PracticasController {

    @Autowired
    private PracticaService service;

    //CONSULTA

    @RequestMapping("/id/{id}")
    public PracticaModel getPracticaById(@PathVariable Integer id) {
        System.out.println("GestionDePracticasController -> getPracticaById()");
        return service.findPracticaById(id);
    }

    @RequestMapping("/totalTesis")
    public List<PracticaModel> getTotalTesis() {
        System.out.println("GestionDePracticasController -> getTotalTesisCsv()");
        return service.findAllTesis();
    }

    @RequestMapping("/totalPracticas")
    public List<PracticaModel> getTotalPracticas() {
        System.out.println("GestionDePracticasController -> getTotalPracticas()");
        return service.findAllPracticas();
    }

    @RequestMapping("/ensayodecatedra")
    public List<PracticaModel> consultarEnsayosDeCatedra(){
        System.out.println("GestionDePracticasController -> consultarEnsayosDeCatedra()");
        return service.findAllEnsayoCatedra();
    }

    @RequestMapping("/practicaprofesionalizante")
    public List<PracticaModel> consultarPracticaProfesionalizante(){
        System.out.println("GestionDePracticasController -> consultarPracticaProfesionalizante()");
        return service.findAllPracticaProfesionalizante();
    }

    @RequestMapping("/practicasupervisada")
    public List<PracticaModel> consultarPracticaSupervisada(){
        System.out.println("GestionDePracticasController -> consultarPracticaSupervisada()");
        return service.findAllPracticaSupervisada();
    }

    @RequestMapping("/proyectofinaldeingenieria")
    public List<PracticaModel> consultarProyectoFinalDeIngenieria(){
        System.out.println("GestionDePracticasController -> consultarProyectoFinalDeIngenieria()");
        return service.findAllProyectoFinalDeIngenieria();
    }

    @RequestMapping("/tesislicenciatura")
    public List<PracticaModel> consultarTesisDeLicenciatura(){
        System.out.println("GestionDePracticasController -> consultarTesisDeLicenciatura()");
        return service.findAllTesisDeLicenciatura();
    }

    @RequestMapping("/tesispostgrado")
    public List<PracticaModel> consultarTesisDePostgrado(){
        System.out.println("GestionDePracticasController -> consultarTesisDePostgrado()");
        return service.findAllTesisDePostgrado();
    }

    //ALTA
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public @ResponseBody
    List<PracticaModel> createPractica(@RequestBody PracticaModel practica) {
        System.out.println("GestionDePracticasController -> createPractica()");
        service.createPractica(practica);
        return service.findAll();
    }

    //MODIFICACION
    @RequestMapping(path = "/id/{id}", method = RequestMethod.PUT)
    public @ResponseBody List<PracticaModel> updatePractica(@PathVariable Integer id, @RequestBody PracticaModel practica) {
        System.out.println("GestionDePracticasController -> updatePractica()");
        service.updatePractica(id, practica);
        return service.findAll();
    }

    //BAJA
    @RequestMapping(method = RequestMethod.DELETE, value="/id/{id}")
    public @ResponseBody List<PracticaModel> removePractica(@PathVariable Integer id) {
        System.out.println("GestionDePracticasController -> removePractica()");
        service.deletePractica(id);
        return service.findAll();
    }
}
