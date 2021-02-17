package edu.frlp.utn.giuct.repository.gestiondeformacionacademica;

import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PracticaRepository extends JpaRepository<PracticaModel, Integer> {
    Optional<PracticaModel> findByFechaInicio(String fecha);
    Optional<PracticaModel> findByFechaFinal(String fecha);
    List<PracticaModel> findByCatedra(String catedra);
    List<PracticaModel> findByUniversidad(String universidad);
    List<PracticaModel> findByEscuela(String escuela);
    List<PracticaModel> findByDirector(String director);
    List<PracticaModel> findByCarrera(String carrera);
    List<PracticaModel> findByTitulo(String titulo);
    List<PracticaModel> findByTutor(String tutor);
    List<PracticaModel> findByDocente(String docente);

    List<PracticaModel> findByTipoDePracticaTipoDePractica(String tipoDePractica);

    boolean existsByTitulo(String titulo);
}
