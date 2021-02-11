package edu.frlp.utn.giuct.service.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import edu.frlp.utn.giuct.repository.gestionderrhh.PersonaRepository;
import edu.frlp.utn.giuct.customMappers.gestionderrhh.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    @Autowired
    private PersonaMapper mapper;

    public List<PersonaModel> findAll() {
        return repository.findAll();
    }

    public PersonaModel findPersonById(Integer id) {
        return repository.findById(id).get();
    }

    public PersonaModel findPersonByNombre(String nombre) {
        return repository.findByNombre(nombre).get(0);
    }

    public void createPerson(PersonaModel persona) {
        if (repository.existsByDni(persona.getDni())) {
            repository.save(persona);
        }
    }

    public void updatePerson(Integer id, PersonaModel personaToUpdate) {
        PersonaModel personaExistente = repository.findById(id).orElseGet(()-> null);
        Assert.notNull(personaExistente, "Error: this person doesn't exists");
        mapper.updatePersonaFromResponse(personaToUpdate, personaExistente);
        repository.save(personaExistente);
    }

    public void deletePerson(Integer id) {repository.deleteById(id);}
}
