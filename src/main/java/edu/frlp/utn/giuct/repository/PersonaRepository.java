package edu.frlp.utn.giuct.repository;

import edu.frlp.utn.giuct.models.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Integer> {

}
