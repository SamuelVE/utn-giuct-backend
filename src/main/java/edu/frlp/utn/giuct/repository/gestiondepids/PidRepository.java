package edu.frlp.utn.giuct.repository.gestiondepids;

import edu.frlp.utn.giuct.models.gestiondepids.PidModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PidRepository extends JpaRepository<PidModel, String> {

    PidModel findByName(String cargo);

    boolean existsByName(String cargo);
}
