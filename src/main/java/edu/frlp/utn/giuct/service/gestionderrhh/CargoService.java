package edu.frlp.utn.giuct.service.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.CargoModel;
import edu.frlp.utn.giuct.models.gestionderrhh.PasaporteModel;
import edu.frlp.utn.giuct.repository.gestionderrhh.CargoRepository;
import edu.frlp.utn.giuct.repository.gestionderrhh.PasaporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    public List<CargoModel> findAll() {
        return repository.findAll();
    }

    public void createCargo(CargoModel cargo) {repository.save(cargo);}
}
