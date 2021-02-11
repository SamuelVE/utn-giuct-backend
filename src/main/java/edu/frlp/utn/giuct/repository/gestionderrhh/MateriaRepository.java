package edu.frlp.utn.giuct.repository.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.MateriaModel;
import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriaRepository extends JpaRepository<MateriaModel, Integer> {

    List<PersonaModel> findByNombre(String nombre);

    boolean existsByNombre(String nombre);
}
