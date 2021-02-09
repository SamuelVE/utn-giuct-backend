package edu.frlp.utn.giuct.repository;

import edu.frlp.utn.giuct.models.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Integer> {

    List<PersonaModel> findByNombre(String name);

    boolean existsByNombre(String name);
}
