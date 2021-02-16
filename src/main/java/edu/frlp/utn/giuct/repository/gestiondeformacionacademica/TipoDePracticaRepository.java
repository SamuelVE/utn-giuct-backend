package edu.frlp.utn.giuct.repository.gestiondeformacionacademica;

import edu.frlp.utn.giuct.models.gestiondeformacionacademica.TipoDePracticaEnumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDePracticaRepository extends JpaRepository<TipoDePracticaEnumModel, String> {

    TipoDePracticaEnumModel findByTipoDePractica(String tipoDePractica);

    boolean existsByTipoDePractica(String tipoDePractica);
}
