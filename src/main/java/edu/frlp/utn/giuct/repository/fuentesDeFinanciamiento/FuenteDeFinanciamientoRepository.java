package edu.frlp.utn.giuct.repository.fuentesDeFinanciamiento;

import edu.frlp.utn.giuct.models.fuentesDeFinanciamiento.FuenteDeFinanciamientoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuenteDeFinanciamientoRepository extends JpaRepository<FuenteDeFinanciamientoModel, String> {

    FuenteDeFinanciamientoModel findByFuente(String cargo);

    boolean existsByFuente(String fuente);
}
