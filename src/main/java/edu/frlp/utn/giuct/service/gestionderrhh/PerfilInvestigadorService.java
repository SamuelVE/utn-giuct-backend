package edu.frlp.utn.giuct.service.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.InvestigadorModel;
import edu.frlp.utn.giuct.repository.gestionderrhh.PerfilInvestigadorRepository;
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

    public void createPerfilInvestigador(InvestigadorModel perfilInvestigador) {repository.save(perfilInvestigador);}
}
