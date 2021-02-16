package edu.frlp.utn.giuct.repository.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Integer> {

    List<PersonaModel> findByNombre(String name);
    List<PersonaModel> findByNombreContaining(String infix);
    PersonaModel findByDni(String dni);

    boolean existsByNombre(String name);
    boolean existsByDni(String dni);
}
