package edu.frlp.utn.giuct.repository.gestiondeformacionacademica;

import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface PracticaRepository extends JpaRepository<PracticaModel, Integer> {


    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndFechaInicio(String tipoDePractica, String fecha);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndFechaInicioContaining(String tipoDePractica, String fecha);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndFechaFinal(String tipoDePractica, String fecha);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndCatedra(String tipoDePractica, String catedra);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndUniversidadContaining(String tipoDePractica, String universidad);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndEscuela(String tipoDePractica, String escuela);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndDirector(String tipoDePractica, String director);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndCarrera(String tipoDePractica, String carrera);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndTituloContaining(String tipoDePractica, String titulo);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndTutor(String tipoDePractica, String tutor);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndDocente(String tipoDePractica, String docente);

    List<PracticaModel> findByTipoDePracticaTipoDePractica(String tipoDePractica);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaIn(Set<String> tipoDePractica);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndVinculacionConProyectoNameContaining(String tipoDePractica, String vinculacionConProyecto);
    List<PracticaModel> findByVinculacionConProyectoName(String vinculacionConProyecto);
    List<PracticaModel> findByFuenteDeFinanciamientoFuente(String fuenteDeFinanciamiento);
    List<PracticaModel> findByTipoDePracticaTipoDePracticaAndFuenteDeFinanciamientoFuenteContaining(String tipoDePractica, String fuenteDeFinanciamiento);

    boolean existsByTitulo(String titulo);
}
