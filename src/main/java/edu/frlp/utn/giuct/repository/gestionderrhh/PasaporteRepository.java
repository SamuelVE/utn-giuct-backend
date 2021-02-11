package edu.frlp.utn.giuct.repository.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.PasaporteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasaporteRepository extends JpaRepository<PasaporteModel, Integer> {

}
