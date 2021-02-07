package edu.frlp.utn.giuct.repository;

import edu.frlp.utn.giuct.models.InvestigadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilInvestigadorRepository extends JpaRepository<InvestigadorModel, Integer> {

}
