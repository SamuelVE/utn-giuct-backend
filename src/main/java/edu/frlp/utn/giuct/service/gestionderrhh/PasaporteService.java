package edu.frlp.utn.giuct.service.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.PasaporteModel;
import edu.frlp.utn.giuct.repository.gestionderrhh.PasaporteRepository;
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

    public void createPasaporte(PasaporteModel pasaporte) {repository.save(pasaporte);}
}
