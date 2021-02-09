package edu.frlp.utn.giuct.service;

import edu.frlp.utn.giuct.models.PersonaModel;
import edu.frlp.utn.giuct.repository.PersonaRepository;
import edu.frlp.utn.giuct.utils.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

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

    public void createPerson(PersonaModel persona) {repository.save(persona);}

    public void updatePerson(Integer id, PersonaModel personaToUpdate) {
        PersonaModel personaExistente = repository.findById(id).orElseGet(()-> null);
        Assert.notNull(personaExistente, "Error: this person doesn't exists");
        mapper.updatePersonaFromResponse(personaToUpdate, personaExistente);
        repository.save(personaExistente);
    }

    public void deletePerson(Integer id) {repository.deleteById(id);}
}
