package edu.frlp.utn.giuct.service.gestiondeformacionacademica;

import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import edu.frlp.utn.giuct.repository.gestiondeformacionacademica.PracticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static edu.frlp.utn.giuct.service.gestiondeformacionacademica.PracticaService.*;

@Service
public class PracticaFiltersService {
    @Autowired
    private PracticaRepository repository;

    //FILTERS

    //ENSAYO CATEDRA
    public List<PracticaModel> findEnsayoCatedraByFechaInicio(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicio(ENSAYO_CATEDRA,fecha);
    }

    public List<PracticaModel> findEnsayoCatedraByAño(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicioContaining(ENSAYO_CATEDRA,fecha);
    }

    public List<PracticaModel> findEnsayoCatedraByFechaFinal(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaFinal(ENSAYO_CATEDRA,fecha);
    }

    public List<PracticaModel> findEnsayoCatedraByCatedra(String catedra) {
        return repository.findByTipoDePracticaTipoDePracticaAndCatedra(ENSAYO_CATEDRA,catedra);
    }

    public List<PracticaModel> findEnsayoCatedraByUniversidad(String universidad) {
        return repository.findByTipoDePracticaTipoDePracticaAndUniversidad(ENSAYO_CATEDRA,universidad);
    }

    public List<PracticaModel> findEnsayoCatedraByEscuela(String escuela) {
        return repository.findByTipoDePracticaTipoDePracticaAndEscuela(ENSAYO_CATEDRA,escuela);
    }

    public List<PracticaModel> findEnsayoCatedraByDirector(String director) {
        return repository.findByTipoDePracticaTipoDePracticaAndDirector(ENSAYO_CATEDRA,director);
    }

    public List<PracticaModel> findEnsayoCatedraByCarrera(String carrera) {
        return repository.findByTipoDePracticaTipoDePracticaAndCarrera(ENSAYO_CATEDRA,carrera);
    }

    public List<PracticaModel> findEnsayoCatedraByTitulo(String titulo) {
        return repository.findByTipoDePracticaTipoDePracticaAndTitulo(ENSAYO_CATEDRA,titulo);
    }

    public List<PracticaModel> findEnsayoCatedraByTutor(String tutor) {
        return repository.findByTipoDePracticaTipoDePracticaAndTutor(ENSAYO_CATEDRA,tutor);
    }

    public List<PracticaModel> findEnsayoCatedraByDocente(String docente) {
        return repository.findByTipoDePracticaTipoDePracticaAndDocente(ENSAYO_CATEDRA,docente);
    }

    public List<PracticaModel> findEnsayoCatedraByProyecto(String proyecto) {
        return repository.findByTipoDePracticaTipoDePracticaAndVinculacionConProyectoName(ENSAYO_CATEDRA,proyecto);
    }

    public List<PracticaModel> findEnsayoCatedraByFuenteDeFinanciamientoFuente(String fuenteDeFinanciamiento) {
        return repository.findByTipoDePracticaTipoDePracticaAndFuenteDeFinanciamientoFuente(ENSAYO_CATEDRA,fuenteDeFinanciamiento);
    }

    //PRACTICA_PROFESIONALIZANTE
    public List<PracticaModel> findPracticaProfesionalizanteByAño(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicioContaining(PRACTICA_PROFESIONALIZANTE,fecha);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByFechaInicio(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicio(PRACTICA_PROFESIONALIZANTE,fecha);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByFechaFinal(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaFinal(PRACTICA_PROFESIONALIZANTE,fecha);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByCatedra(String catedra) {
        return repository.findByTipoDePracticaTipoDePracticaAndCatedra(PRACTICA_PROFESIONALIZANTE,catedra);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByUniversidad(String universidad) {
        return repository.findByTipoDePracticaTipoDePracticaAndUniversidad(PRACTICA_PROFESIONALIZANTE,universidad);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByEscuela(String escuela) {
        return repository.findByTipoDePracticaTipoDePracticaAndEscuela(PRACTICA_PROFESIONALIZANTE,escuela);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByDirector(String director) {
        return repository.findByTipoDePracticaTipoDePracticaAndDirector(PRACTICA_PROFESIONALIZANTE,director);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByCarrera(String carrera) {
        return repository.findByTipoDePracticaTipoDePracticaAndCarrera(PRACTICA_PROFESIONALIZANTE,carrera);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByTitulo(String titulo) {
        return repository.findByTipoDePracticaTipoDePracticaAndTitulo(PRACTICA_PROFESIONALIZANTE,titulo);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByTutor(String tutor) {
        return repository.findByTipoDePracticaTipoDePracticaAndTutor(PRACTICA_PROFESIONALIZANTE,tutor);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByDocente(String docente) {
        return repository.findByTipoDePracticaTipoDePracticaAndDocente(PRACTICA_PROFESIONALIZANTE,docente);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByProyecto(String proyecto) {
        return repository.findByTipoDePracticaTipoDePracticaAndVinculacionConProyectoName(PRACTICA_PROFESIONALIZANTE,proyecto);
    }

    public List<PracticaModel> findPracticaProfesionalizanteByFuenteDeFinanciamientoFuente(String fuenteDeFinanciamiento) {
        return repository.findByTipoDePracticaTipoDePracticaAndFuenteDeFinanciamientoFuente(PRACTICA_PROFESIONALIZANTE,fuenteDeFinanciamiento);
    }
    //PRACTICA_SUPERVISADA
    public List<PracticaModel> findPracticaSupervisadaByFechaInicio(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicio(PRACTICA_SUPERVISADA,fecha);
    }

    public List<PracticaModel> findPracticaSupervisadaByAño(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicioContaining(PRACTICA_SUPERVISADA,fecha);
    }

    public List<PracticaModel> findPracticaSupervisadaByFechaFinal(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaFinal(PRACTICA_SUPERVISADA,fecha);
    }

    public List<PracticaModel> findPracticaSupervisadaByCatedra(String catedra) {
        return repository.findByTipoDePracticaTipoDePracticaAndCatedra(PRACTICA_SUPERVISADA,catedra);
    }

    public List<PracticaModel> findPracticaSupervisadaByUniversidad(String universidad) {
        return repository.findByTipoDePracticaTipoDePracticaAndUniversidad(PRACTICA_SUPERVISADA,universidad);
    }

    public List<PracticaModel> findPracticaSupervisadaByEscuela(String escuela) {
        return repository.findByTipoDePracticaTipoDePracticaAndEscuela(PRACTICA_SUPERVISADA,escuela);
    }

    public List<PracticaModel> findPracticaSupervisadaByDirector(String director) {
        return repository.findByTipoDePracticaTipoDePracticaAndDirector(PRACTICA_SUPERVISADA,director);
    }

    public List<PracticaModel> findPracticaSupervisadaByCarrera(String carrera) {
        return repository.findByTipoDePracticaTipoDePracticaAndCarrera(PRACTICA_SUPERVISADA,carrera);
    }

    public List<PracticaModel> findPracticaSupervisadaByTitulo(String titulo) {
        return repository.findByTipoDePracticaTipoDePracticaAndTitulo(PRACTICA_SUPERVISADA,titulo);
    }

    public List<PracticaModel> findPracticaSupervisadaByTutor(String tutor) {
        return repository.findByTipoDePracticaTipoDePracticaAndTutor(PRACTICA_SUPERVISADA,tutor);
    }

    public List<PracticaModel> findPracticaSupervisadaByDocente(String docente) {
        return repository.findByTipoDePracticaTipoDePracticaAndDocente(PRACTICA_SUPERVISADA,docente);
    }

    public List<PracticaModel> findPracticaSupervisadaByProyecto(String proyecto) {
        return repository.findByTipoDePracticaTipoDePracticaAndVinculacionConProyectoName(PRACTICA_SUPERVISADA,proyecto);
    }

    public List<PracticaModel> findPracticaSupervisadaByFuenteDeFinanciamientoFuente(String fuenteDeFinanciamiento) {
        return repository.findByTipoDePracticaTipoDePracticaAndFuenteDeFinanciamientoFuente(PRACTICA_SUPERVISADA,fuenteDeFinanciamiento);
    }

    //PROYECTO_FINAL_INGENIERIA
    public List<PracticaModel> findProyectoFinalByFechaInicio(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicio(PROYECTO_FINAL_INGENIERIA,fecha);
    }

    public List<PracticaModel> findProyectoFinalByAño(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicioContaining(PROYECTO_FINAL_INGENIERIA,fecha);
    }

    public List<PracticaModel> findProyectoFinalByFechaFinal(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaFinal(PROYECTO_FINAL_INGENIERIA,fecha);
    }

    public List<PracticaModel> findProyectoFinalByCatedra(String catedra) {
        return repository.findByTipoDePracticaTipoDePracticaAndCatedra(PROYECTO_FINAL_INGENIERIA,catedra);
    }

    public List<PracticaModel> findProyectoFinalByUniversidad(String universidad) {
        return repository.findByTipoDePracticaTipoDePracticaAndUniversidad(PROYECTO_FINAL_INGENIERIA,universidad);
    }

    public List<PracticaModel> findProyectoFinalByEscuela(String escuela) {
        return repository.findByTipoDePracticaTipoDePracticaAndEscuela(PROYECTO_FINAL_INGENIERIA,escuela);
    }

    public List<PracticaModel> findProyectoFinalByDirector(String director) {
        return repository.findByTipoDePracticaTipoDePracticaAndDirector(PROYECTO_FINAL_INGENIERIA,director);
    }

    public List<PracticaModel> findProyectoFinalByCarrera(String carrera) {
        return repository.findByTipoDePracticaTipoDePracticaAndCarrera(PROYECTO_FINAL_INGENIERIA,carrera);
    }

    public List<PracticaModel> findProyectoFinalByTitulo(String titulo) {
        return repository.findByTipoDePracticaTipoDePracticaAndTitulo(PROYECTO_FINAL_INGENIERIA,titulo);
    }

    public List<PracticaModel> findProyectoFinalByTutor(String tutor) {
        return repository.findByTipoDePracticaTipoDePracticaAndTutor(PROYECTO_FINAL_INGENIERIA,tutor);
    }

    public List<PracticaModel> findProyectoFinalByDocente(String docente) {
        return repository.findByTipoDePracticaTipoDePracticaAndDocente(PROYECTO_FINAL_INGENIERIA,docente);
    }

    public List<PracticaModel> findProyectoFinalByProyecto(String proyecto) {
        return repository.findByTipoDePracticaTipoDePracticaAndVinculacionConProyectoName(PROYECTO_FINAL_INGENIERIA,proyecto);
    }

    public List<PracticaModel> findProyectoFinalByFuenteDeFinanciamientoFuente(String fuenteDeFinanciamiento) {
        return repository.findByTipoDePracticaTipoDePracticaAndFuenteDeFinanciamientoFuente(PROYECTO_FINAL_INGENIERIA,fuenteDeFinanciamiento);
    }

    //TESIS_LICENCIATURA
    public List<PracticaModel> findTesisLicenciaturaByFechaInicio(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicio(TESIS_LICENCIATURA,fecha);
    }

    public List<PracticaModel> findTesisLicenciaturaByAño(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicioContaining(TESIS_LICENCIATURA,fecha);
    }

    public List<PracticaModel> findTesisLicenciaturaByFechaFinal(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaFinal(TESIS_LICENCIATURA,fecha);
    }

    public List<PracticaModel> findTesisLicenciaturaByCatedra(String catedra) {
        return repository.findByTipoDePracticaTipoDePracticaAndCatedra(TESIS_LICENCIATURA,catedra);
    }

    public List<PracticaModel> findTesisLicenciaturaByUniversidad(String universidad) {
        return repository.findByTipoDePracticaTipoDePracticaAndUniversidad(TESIS_LICENCIATURA,universidad);
    }

    public List<PracticaModel> findTesisLicenciaturaByEscuela(String escuela) {
        return repository.findByTipoDePracticaTipoDePracticaAndEscuela(TESIS_LICENCIATURA,escuela);
    }

    public List<PracticaModel> findTesisLicenciaturaByDirector(String director) {
        return repository.findByTipoDePracticaTipoDePracticaAndDirector(TESIS_LICENCIATURA,director);
    }

    public List<PracticaModel> findTesisLicenciaturaByCarrera(String carrera) {
        return repository.findByTipoDePracticaTipoDePracticaAndCarrera(TESIS_LICENCIATURA,carrera);
    }

    public List<PracticaModel> findTesisLicenciaturaByTitulo(String titulo) {
        return repository.findByTipoDePracticaTipoDePracticaAndTitulo(TESIS_LICENCIATURA,titulo);
    }

    public List<PracticaModel> findTesisLicenciaturaByTutor(String tutor) {
        return repository.findByTipoDePracticaTipoDePracticaAndTutor(TESIS_LICENCIATURA,tutor);
    }

    public List<PracticaModel> findTesisLicenciaturaByDocente(String docente) {
        return repository.findByTipoDePracticaTipoDePracticaAndDocente(TESIS_LICENCIATURA,docente);
    }

    public List<PracticaModel> findTesisLicenciaturaByProyecto(String proyecto) {
        return repository.findByTipoDePracticaTipoDePracticaAndVinculacionConProyectoName(TESIS_LICENCIATURA,proyecto);
    }

    public List<PracticaModel> findTesisLicenciaturaByFuenteDeFinanciamientoFuente(String fuenteDeFinanciamiento) {
        return repository.findByTipoDePracticaTipoDePracticaAndFuenteDeFinanciamientoFuente(TESIS_LICENCIATURA,fuenteDeFinanciamiento);
    }

    //TESIS_POSTGRADO
    public List<PracticaModel> findTesisPostgradoByFechaInicio(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicio(TESIS_POSTGRADO,fecha);
    }

    public List<PracticaModel> findTesisPostgradoByAño(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaInicioContaining(TESIS_POSTGRADO,fecha);
    }

    public List<PracticaModel> findTesisPostgradoByFechaFinal(String fecha) {
        return repository.findByTipoDePracticaTipoDePracticaAndFechaFinal(TESIS_POSTGRADO,fecha);
    }

    public List<PracticaModel> findTesisPostgradoByCatedra(String catedra) {
        return repository.findByTipoDePracticaTipoDePracticaAndCatedra(TESIS_POSTGRADO,catedra);
    }

    public List<PracticaModel> findTesisPostgradoByUniversidad(String universidad) {
        return repository.findByTipoDePracticaTipoDePracticaAndUniversidad(TESIS_POSTGRADO,universidad);
    }

    public List<PracticaModel> findTesisPostgradoByEscuela(String escuela) {
        return repository.findByTipoDePracticaTipoDePracticaAndEscuela(TESIS_POSTGRADO,escuela);
    }

    public List<PracticaModel> findTesisPostgradoByDirector(String director) {
        return repository.findByTipoDePracticaTipoDePracticaAndDirector(TESIS_POSTGRADO,director);
    }

    public List<PracticaModel> findTesisPostgradoByCarrera(String carrera) {
        return repository.findByTipoDePracticaTipoDePracticaAndCarrera(TESIS_POSTGRADO,carrera);
    }

    public List<PracticaModel> findTesisPostgradoByTitulo(String titulo) {
        return repository.findByTipoDePracticaTipoDePracticaAndTitulo(TESIS_POSTGRADO,titulo);
    }

    public List<PracticaModel> findTesisPostgradoByTutor(String tutor) {
        return repository.findByTipoDePracticaTipoDePracticaAndTutor(TESIS_POSTGRADO,tutor);
    }

    public List<PracticaModel> findTesisPostgradoByDocente(String docente) {
        return repository.findByTipoDePracticaTipoDePracticaAndDocente(TESIS_POSTGRADO,docente);
    }

    public List<PracticaModel> findTesisPostgradoByProyecto(String proyecto) {
        return repository.findByTipoDePracticaTipoDePracticaAndVinculacionConProyectoName(TESIS_POSTGRADO,proyecto);
    }

    public List<PracticaModel> findTesisPostgradoByFuenteDeFinanciamientoFuente(String fuenteDeFinanciamiento) {
        return repository.findByTipoDePracticaTipoDePracticaAndFuenteDeFinanciamientoFuente(TESIS_POSTGRADO,fuenteDeFinanciamiento);
    }

}
