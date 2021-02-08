package edu.frlp.utn.giuct.setup;

import edu.frlp.utn.giuct.models.PersonaModel;
import edu.frlp.utn.giuct.repository.PasaporteRepository;
import edu.frlp.utn.giuct.repository.PerfilInvestigadorRepository;
import edu.frlp.utn.giuct.repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.stream.Collectors;

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
        if (!personaRepository.existsByNombre(mockPersonas[0].getNombre())) {
            perfilInvestigadorRepository.saveAll(Arrays.stream(mockPersonas)
                    .map(PersonaModel::getInvestigador)
                    .collect(Collectors.toList()));
            pasaporteRepository.saveAll(Arrays.stream(mockPersonas)
                    .map(PersonaModel::getPasaporte)
                    .collect(Collectors.toList()));
            personaRepository.saveAll(Arrays.asList(mockPersonas));
        }
    }
}
