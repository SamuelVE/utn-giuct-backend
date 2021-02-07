package edu.frlp.utn.giuct.service;

import edu.frlp.utn.giuct.models.PasaporteModel;
import edu.frlp.utn.giuct.repository.PasaporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasaporteService {

    @Autowired
    private PasaporteRepository repository;

    public List<PasaporteModel> findAll() {
        return repository.findAll();
    }
}
