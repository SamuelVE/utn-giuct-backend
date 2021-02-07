package edu.frlp.utn.giuct.service;

import edu.frlp.utn.giuct.models.InvestigadorModel;
import edu.frlp.utn.giuct.repository.PerfilInvestigadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilInvestigadorService {

    @Autowired
    private PerfilInvestigadorRepository repository;

    public List<InvestigadorModel> findAll() {
        return repository.findAll();
    }
}
