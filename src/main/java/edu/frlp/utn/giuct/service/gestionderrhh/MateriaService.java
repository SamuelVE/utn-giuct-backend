package edu.frlp.utn.giuct.service.gestionderrhh;

import edu.frlp.utn.giuct.models.gestionderrhh.MateriaModel;
import edu.frlp.utn.giuct.repository.gestionderrhh.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository repository;

    public List<MateriaModel> findAll() {
        return repository.findAll();
    }

    public void createMateria(MateriaModel materia) {repository.save(materia);}
}
