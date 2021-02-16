package edu.frlp.utn.giuct.service.gestiondeformacionacademica;

import edu.frlp.utn.giuct.customMappers.gestiondeformacionacademica.PracticaMapper;
import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import edu.frlp.utn.giuct.repository.gestiondeformacionacademica.PracticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class PracticaService {

    @Autowired
    private PracticaRepository repository;

    @Autowired
    private PracticaMapper mapper;

    //nombres cargados en la base de datos desde el mock
    private final static String ENSAYO_CATEDRA= "ensayo_catedra";
    private final static String PRACTICA_PROFESIONALIZANTE= "practica_profesionalizante";
    private final static String PRACTICA_SUPERVISADA= "practica_supervisada";
    private final static String PROYECTO_FINAL_INGENIERIA= "proyecto_final_ingenieria";
    private final static String TESIS_LICENCIATURA= "tesis_licenciatura";
    private final static String TESIS_POSTGRADO= "tesis_postgrado";

    public List<PracticaModel> findAll() {
        return repository.findAll();
    }

    public List<PracticaModel> findAllEnsayoCatedra() {
        return repository.findByTipoDePractica(ENSAYO_CATEDRA);
    }

    public List<PracticaModel> findAllPracticaProfesionalizante() {
        return repository.findByTipoDePractica(PRACTICA_PROFESIONALIZANTE);
    }

    public List<PracticaModel> findAllPracticaSupervisada() {
        return repository.findByTipoDePractica(PRACTICA_SUPERVISADA);
    }

    public List<PracticaModel> findAllProyectoFinalDeIngenieria() {
        return repository.findByTipoDePractica(PROYECTO_FINAL_INGENIERIA);
    }

    public List<PracticaModel> findAllTesisDeLicenciatura() {
        return repository.findByTipoDePractica(TESIS_LICENCIATURA);
    }

    public List<PracticaModel> findAllTesisDePostgrado() {
        return repository.findByTipoDePractica(TESIS_POSTGRADO);
    }

    public PracticaModel findPracticaById(Integer id) {
        return repository.findById(id).get();
    }


    public void createPractica(PracticaModel practica) {
        if (!repository.existsByTitulo(practica.getTitulo())) {
            repository.save(practica);
        }
    }

    public void updatePractica(Integer id, PracticaModel practicaToUpdate) {
        PracticaModel practicaExistente = repository.findById(id).orElse(null);
        Assert.notNull(practicaExistente, "Error: this person doesn't exists");
        mapper.updatePracticaFromResponse(practicaToUpdate, practicaExistente);
        repository.save(practicaExistente);
    }

    public void deletePractica(Integer id) {repository.deleteById(id);}
}
