package edu.frlp.utn.giuct.service.gestiondeformacionacademica;

import edu.frlp.utn.giuct.customMappers.gestiondeformacionacademica.PracticaMapper;
import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import edu.frlp.utn.giuct.repository.gestiondeformacionacademica.PracticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class PracticaService {

    @Autowired
    private PracticaRepository repository;

    @Autowired
    private PracticaMapper mapper;

    //nombres cargados en la base de datos desde el mock
    final static String ENSAYO_CATEDRA= "ensayo_catedra";
    final static String PRACTICA_PROFESIONALIZANTE= "practica_profesionalizante";
    final static String PRACTICA_SUPERVISADA= "practica_supervisada";
    final static String PROYECTO_FINAL_INGENIERIA= "proyecto_final_ingenieria";
    final static String TESIS_LICENCIATURA= "tesis_licenciatura";
    final static String TESIS_POSTGRADO= "tesis_postgrado";

    //CONSULTA
    public List<PracticaModel> findAll() {
        return repository.findAll();
    }

    public List<PracticaModel> findAllPracticas() {
        return repository.findByTipoDePracticaTipoDePracticaIn(
                new HashSet<String>(Arrays.asList(PRACTICA_PROFESIONALIZANTE,
                        ENSAYO_CATEDRA,
                        PRACTICA_SUPERVISADA)));
    }

    public List<PracticaModel> findAllTesis() {
        return repository.findByTipoDePracticaTipoDePracticaIn(
                new HashSet<String>(Arrays.asList(PROYECTO_FINAL_INGENIERIA,
                        TESIS_LICENCIATURA,
                        TESIS_POSTGRADO)));
    }

    public List<PracticaModel> findAllEnsayoCatedra() {
        return repository.findByTipoDePracticaTipoDePractica(ENSAYO_CATEDRA);
    }

    public List<PracticaModel> findAllPracticaProfesionalizante() {
        return repository.findByTipoDePracticaTipoDePractica(PRACTICA_PROFESIONALIZANTE);
    }

    public List<PracticaModel> findAllPracticaSupervisada() {
        return repository.findByTipoDePracticaTipoDePractica(PRACTICA_SUPERVISADA);
    }

    public List<PracticaModel> findAllProyectoFinalDeIngenieria() {
        return repository.findByTipoDePracticaTipoDePractica(PROYECTO_FINAL_INGENIERIA);
    }

    public List<PracticaModel> findAllTesisDeLicenciatura() {
        return repository.findByTipoDePracticaTipoDePractica(TESIS_LICENCIATURA);
    }

    public List<PracticaModel> findAllTesisDePostgrado() {
        return repository.findByTipoDePracticaTipoDePractica(TESIS_POSTGRADO);
    }

    public PracticaModel findPracticaById(Integer id) {
        return repository.findById(id).get();
    }

    public List<PracticaModel> findByProyecto(String proyecto) {
        return repository.findByVinculacionConProyectoName(proyecto);
    }

    public List<PracticaModel> findByFuenteDeFinanciamiento(String fuenteDeFinanciamiento) {
        return repository.findByFuenteDeFinanciamientoFuente(fuenteDeFinanciamiento);
    }

    //ALTA
    public void createPractica(PracticaModel practica) {
        if (!repository.existsByTitulo(practica.getTitulo())) {
            repository.save(practica);
        }
    }

    //MODIFICACION
    public void updatePractica(Integer id, PracticaModel practicaToUpdate) {
        PracticaModel practicaExistente = repository.findById(id).orElse(null);
        Assert.notNull(practicaExistente, "Error: this person doesn't exists");
        mapper.updatePracticaFromResponse(practicaToUpdate, practicaExistente);
        repository.save(practicaExistente);
    }

    //ELIMINACION
    public void deletePractica(Integer id) {repository.deleteById(id);}
}
