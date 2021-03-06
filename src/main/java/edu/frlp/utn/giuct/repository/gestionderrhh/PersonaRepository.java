package edu.frlp.utn.giuct.repository.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Integer> {

    List<PersonaModel> findByNombre(String name);
    List<PersonaModel> findByNombreContaining(String name);
    List<PersonaModel> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    List<PersonaModel> findByDniContaining(String dni);
    List<PersonaModel> findByEmailPersonalContaining(String email);

    List<PersonaModel> findByInvestigadorTipoDeInvestigador(String tipoDeInvestigador);
    List<PersonaModel> findByInvestigadorCategoriaDeInvestigador(String categoriaDeInvestigador);

    boolean existsByNombre(String name);
    boolean existsByDni(String dni);
}
