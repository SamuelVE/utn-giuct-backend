package edu.frlp.utn.giuct.repository.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.MateriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<MateriaModel, Integer> {

    MateriaModel findByNombre(String nombre);

    boolean existsByNombre(String nombre);
}
