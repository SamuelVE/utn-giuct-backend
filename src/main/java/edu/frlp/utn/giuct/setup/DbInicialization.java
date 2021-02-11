package edu.frlp.utn.giuct.setup;

import edu.frlp.utn.giuct.models.gestionderrhh.MateriaModel;
import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import edu.frlp.utn.giuct.repository.gestionderrhh.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbInicialization {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PasaporteRepository pasaporteRepository;

    @Autowired
    private PerfilInvestigadorRepository perfilInvestigadorRepository;

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Value("${variables.personasMockUrl}")
    private String personasMockUrl;

    @PostConstruct
    public void makeLogs() {
        System.out.println("Ejecutando los scripts de inicializacion...");
    }

    @PostConstruct
    public void initializePersonasTableFromMock() {
        System.out.println("Inicializando personas desde el mock");
        PersonaModel[] mockPersonas = restTemplateBuilder.build().getForObject(personasMockUrl, PersonaModel[].class);

        //TODO validar si al menos existe una persona en la tabla persona
        //if (!personaRepository.existsByNombre(mockPersonas[0].getNombre())) {
//            perfilInvestigadorRepository.saveAll(Arrays.stream(mockPersonas)
//                    .map(PersonaModel::getInvestigador)
//                    .collect(Collectors.toList()));
//            pasaporteRepository.saveAll(Arrays.stream(mockPersonas)
//                    .map(PersonaModel::getPasaporte)
//                    .collect(Collectors.toList()));
//            Arrays.stream(mockPersonas)
//                    .map(PersonaModel::getMaterias)
//                    .forEach(listOfSetOfMateria ->
//                            cargoRepository.saveAll(listOfSetOfMateria.stream()
//                                    .map(MateriaModel::getCargo)
//                                    .collect(Collectors.toList())
//                            )
//                    );
//            Arrays.stream(mockPersonas)
//                    .map(PersonaModel::getMaterias)
//                    .forEach(listOfSetOfMateria ->
//                            materiaRepository.saveAll(listOfSetOfMateria));
        //if (isPersonaTableEmpty())
        personaRepository.saveAll(Arrays.asList(mockPersonas));
      //  }
    }
}
