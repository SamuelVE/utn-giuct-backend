package edu.frlp.utn.giuct.service;

import edu.frlp.utn.giuct.models.PersonaModel;
import edu.frlp.utn.giuct.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public List<PersonaModel> findAll() {
        return repository.findAll();
    }
}
