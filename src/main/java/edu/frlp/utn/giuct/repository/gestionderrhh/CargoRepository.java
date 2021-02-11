package edu.frlp.utn.giuct.repository.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.CargoModel;
import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargoRepository extends JpaRepository<CargoModel, Integer> {

    List<PersonaModel> findByCargo(String cargo);

    boolean existsByCargo(String cargo);
}
