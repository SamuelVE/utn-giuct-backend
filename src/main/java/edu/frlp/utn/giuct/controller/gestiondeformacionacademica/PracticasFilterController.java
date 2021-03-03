package edu.frlp.utn.giuct.controller.gestiondeformacionacademica;


import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import edu.frlp.utn.giuct.service.gestiondeformacionacademica.PracticaFiltersService;
import edu.frlp.utn.giuct.service.gestiondeformacionacademica.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("/gestiondeformacionacademica/filter")
public class PracticasFilterController {

    @Autowired
    private PracticaService service;

    @Autowired
    private PracticaFiltersService filter;

    @RequestMapping("/ensayodecatedra")
    public List<PracticaModel> consultarEnsayosDeCatedra(@RequestParam(required = false) Optional<String> fechaInicio,
                                                         @RequestParam(required = false) Optional<String> fechaFinal,
                                                         @RequestParam(required = false) Optional<String> catedra,
                                                         @RequestParam(required = false) Optional<String> universidad,
                                                         @RequestParam(required = false) Optional<String> escuela,
                                                         @RequestParam(required = false) Optional<String> director,
                                                         @RequestParam(required = false) Optional<String> carrera,
                                                         @RequestParam(required = false) Optional<String> titulo,
                                                         @RequestParam(required = false) Optional<String> tutor,
                                                         @RequestParam(required = false) Optional<String> docente,
                                                         @RequestParam(required = false) Optional<String> proyecto,
                                                         @RequestParam(required = false) Optional<String> fuenteDeFinanciamiento,
                                                         @RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarEnsayosDeCatedra()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllEnsayoCatedra());
        fechaInicio.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByFechaInicio(f)));
        fechaFinal.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByFechaFinal(f)));
        catedra.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByCatedra(f)));
        universidad.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByUniversidad(f)));
        escuela.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByEscuela(f)));
        director.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByDirector(f)));
        carrera.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByCarrera(f)));
        titulo.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByTitulo(f)));
        tutor.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByTutor(f)));
        docente.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByDocente(f)));
        proyecto.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByProyecto(f)));
        fuenteDeFinanciamiento.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByFuenteDeFinanciamientoFuente(f)));
        año.ifPresent(f -> listToReturn.set(filter.findEnsayoCatedraByAño(f)));
        return listToReturn.get();
    }

    @RequestMapping("/practicaprofesionalizante")
    public List<PracticaModel> consultarPracticaProfesionalizante(@RequestParam(required = false) Optional<String> fechaInicio,
                                                                  @RequestParam(required = false) Optional<String> fechaFinal,
                                                                  @RequestParam(required = false) Optional<String> catedra,
                                                                  @RequestParam(required = false) Optional<String> universidad,
                                                                  @RequestParam(required = false) Optional<String> escuela,
                                                                  @RequestParam(required = false) Optional<String> director,
                                                                  @RequestParam(required = false) Optional<String> carrera,
                                                                  @RequestParam(required = false) Optional<String> titulo,
                                                                  @RequestParam(required = false) Optional<String> tutor,
                                                                  @RequestParam(required = false) Optional<String> docente,
                                                                  @RequestParam(required = false) Optional<String> proyecto,
                                                                  @RequestParam(required = false) Optional<String> fuenteDeFinanciamiento,
                                                                  @RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarPracticaProfesionalizante()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllPracticaProfesionalizante());
        fechaInicio.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByFechaInicio(f)));
        fechaFinal.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByFechaFinal(f)));
        catedra.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByCatedra(f)));
        universidad.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByUniversidad(f)));
        escuela.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByEscuela(f)));
        director.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByDirector(f)));
        carrera.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByCarrera(f)));
        titulo.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByTitulo(f)));
        tutor.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByTutor(f)));
        docente.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByDocente(f)));
        proyecto.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByProyecto(f)));
        fuenteDeFinanciamiento.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByFuenteDeFinanciamientoFuente(f)));
        año.ifPresent(f -> listToReturn.set(filter.findPracticaProfesionalizanteByAño(f)));
        return listToReturn.get();
    }

    @RequestMapping("/practicasupervisada")
    public List<PracticaModel> consultarPracticaSupervisada(@RequestParam(required = false) Optional<String> fechaInicio,
                                                            @RequestParam(required = false) Optional<String> fechaFinal,
                                                            @RequestParam(required = false) Optional<String> catedra,
                                                            @RequestParam(required = false) Optional<String> universidad,
                                                            @RequestParam(required = false) Optional<String> escuela,
                                                            @RequestParam(required = false) Optional<String> director,
                                                            @RequestParam(required = false) Optional<String> carrera,
                                                            @RequestParam(required = false) Optional<String> titulo,
                                                            @RequestParam(required = false) Optional<String> tutor,
                                                            @RequestParam(required = false) Optional<String> docente,
                                                            @RequestParam(required = false) Optional<String> proyecto,
                                                            @RequestParam(required = false) Optional<String> fuenteDeFinanciamiento,
                                                            @RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarPracticaSupervisada()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllPracticaSupervisada());
        fechaInicio.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByFechaInicio(f)));
        fechaFinal.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByFechaFinal(f)));
        catedra.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByCatedra(f)));
        universidad.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByUniversidad(f)));
        escuela.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByEscuela(f)));
        director.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByDirector(f)));
        carrera.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByCarrera(f)));
        titulo.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByTitulo(f)));
        tutor.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByTutor(f)));
        docente.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByDocente(f)));
        proyecto.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByProyecto(f)));
        fuenteDeFinanciamiento.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByFuenteDeFinanciamientoFuente(f)));
        año.ifPresent(f -> listToReturn.set(filter.findPracticaSupervisadaByAño(f)));
        return listToReturn.get();
    }

    @RequestMapping("/proyectofinaldeingenieria")
    public List<PracticaModel> consultarProyectoFinalDeIngenieria(@RequestParam(required = false) Optional<String> fechaInicio,
                                                                  @RequestParam(required = false) Optional<String> fechaFinal,
                                                                  @RequestParam(required = false) Optional<String> catedra,
                                                                  @RequestParam(required = false) Optional<String> universidad,
                                                                  @RequestParam(required = false) Optional<String> escuela,
                                                                  @RequestParam(required = false) Optional<String> director,
                                                                  @RequestParam(required = false) Optional<String> carrera,
                                                                  @RequestParam(required = false) Optional<String> titulo,
                                                                  @RequestParam(required = false) Optional<String> tutor,
                                                                  @RequestParam(required = false) Optional<String> docente,
                                                                  @RequestParam(required = false) Optional<String> proyecto,
                                                                  @RequestParam(required = false) Optional<String> fuenteDeFinanciamiento,
                                                                  @RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarProyectoFinalDeIngenieria()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllProyectoFinalDeIngenieria());
        fechaInicio.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByFechaInicio(f)));
        fechaFinal.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByFechaFinal(f)));
        catedra.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByCatedra(f)));
        universidad.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByUniversidad(f)));
        escuela.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByEscuela(f)));
        director.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByDirector(f)));
        carrera.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByCarrera(f)));
        titulo.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByTitulo(f)));
        tutor.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByTutor(f)));
        docente.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByDocente(f)));
        proyecto.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByProyecto(f)));
        fuenteDeFinanciamiento.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByFuenteDeFinanciamientoFuente(f)));
        año.ifPresent(f -> listToReturn.set(filter.findProyectoFinalByAño(f)));
        return listToReturn.get();
    }

    @RequestMapping("/tesislicenciatura")
    public List<PracticaModel> consultarTesisDeLicenciatura(@RequestParam(required = false) Optional<String> fechaInicio,
                                                            @RequestParam(required = false) Optional<String> fechaFinal,
                                                            @RequestParam(required = false) Optional<String> catedra,
                                                            @RequestParam(required = false) Optional<String> universidad,
                                                            @RequestParam(required = false) Optional<String> escuela,
                                                            @RequestParam(required = false) Optional<String> director,
                                                            @RequestParam(required = false) Optional<String> carrera,
                                                            @RequestParam(required = false) Optional<String> titulo,
                                                            @RequestParam(required = false) Optional<String> tutor,
                                                            @RequestParam(required = false) Optional<String> docente,
                                                            @RequestParam(required = false) Optional<String> proyecto,
                                                            @RequestParam(required = false) Optional<String> fuenteDeFinanciamiento,
                                                            @RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarTesisDeLicenciatura()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllTesisDeLicenciatura());
        fechaInicio.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByFechaInicio(f)));
        fechaFinal.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByFechaFinal(f)));
        catedra.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByCatedra(f)));
        universidad.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByUniversidad(f)));
        escuela.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByEscuela(f)));
        director.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByDirector(f)));
        carrera.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByCarrera(f)));
        titulo.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByTitulo(f)));
        tutor.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByTutor(f)));
        docente.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByDocente(f)));
        proyecto.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByProyecto(f)));
        fuenteDeFinanciamiento.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByFuenteDeFinanciamientoFuente(f)));
        año.ifPresent(f -> listToReturn.set(filter.findTesisLicenciaturaByAño(f)));
        return listToReturn.get();
    }

    @RequestMapping("/tesispostgrado")
    public List<PracticaModel> consultarTesisDePostgrado(@RequestParam(required = false) Optional<String> fechaInicio,
                                                         @RequestParam(required = false) Optional<String> fechaFinal,
                                                         @RequestParam(required = false) Optional<String> catedra,
                                                         @RequestParam(required = false) Optional<String> universidad,
                                                         @RequestParam(required = false) Optional<String> escuela,
                                                         @RequestParam(required = false) Optional<String> director,
                                                         @RequestParam(required = false) Optional<String> carrera,
                                                         @RequestParam(required = false) Optional<String> titulo,
                                                         @RequestParam(required = false) Optional<String> tutor,
                                                         @RequestParam(required = false) Optional<String> docente,
                                                         @RequestParam(required = false) Optional<String> proyecto,
                                                         @RequestParam(required = false) Optional<String> fuenteDeFinanciamiento,
                                                         @RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarTesisDePostgrado()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllTesisDePostgrado());
        fechaInicio.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByFechaInicio(f)));
        fechaFinal.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByFechaFinal(f)));
        catedra.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByCatedra(f)));
        universidad.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByUniversidad(f)));
        escuela.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByEscuela(f)));
        director.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByDirector(f)));
        carrera.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByCarrera(f)));
        titulo.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByTitulo(f)));
        tutor.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByTutor(f)));
        docente.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByDocente(f)));
        proyecto.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByProyecto(f)));
        fuenteDeFinanciamiento.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByFuenteDeFinanciamientoFuente(f)));
        año.ifPresent(f -> listToReturn.set(filter.findTesisPostgradoByAño(f)));
        return listToReturn.get();
    }

    @RequestMapping("/totalPracticas")
    public List<PracticaModel> consultarTotalPracticas(@RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarTotalPracticas()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllPracticas());
        año.ifPresent(f -> listToReturn.set(service.findAllPracticas()));
        return listToReturn.get();
    }

    @RequestMapping("/totalTesis")
    public List<PracticaModel> consultarTotalTesis(@RequestParam(required = false) Optional<String> año){
        System.out.println("GestionDePracticasController -> consultarTotalTesis()");
        AtomicReference<List<PracticaModel>> listToReturn = new AtomicReference<>(service.findAllTesis());
        año.ifPresent(f -> listToReturn.set(service.findAllTesis()));
        return listToReturn.get();
    }
}
