package edu.frlp.utn.giuct.setup;

import edu.frlp.utn.giuct.models.fuentesDeFinanciamiento.FuenteDeFinanciamientoModel;
import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import edu.frlp.utn.giuct.repository.fuentesDeFinanciamiento.FuenteDeFinanciamientoRepository;
import edu.frlp.utn.giuct.repository.gestionderrhh.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.stream.Stream;

@Component
public class DbInicialization {

    @Autowired
    private RestTemplateBuilder restTemplate;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private FuenteDeFinanciamientoRepository fuenteDeFinanciamientoRepository;

    @Value("${variables.personasMockUrl}")
    private String personasMockUrl;

    @Value("${variables.fuentesDeFinanciamientoMockUrl}")
    private String fuentesDeFinanciamientoMockUrl;

    @PostConstruct
    public void makeLogs() {
        System.out.println("Ejecutando los scripts de inicializacion...");
    }

    @PostConstruct
    public void initializePersonasTableFromMock() {
        System.out.println("Inicializando personas desde el mock");
        restTemplate.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        PersonaModel[] mockPersonas = restTemplate.build().getForObject(personasMockUrl, PersonaModel[].class);
        if (!personaRepository.existsByDni(mockPersonas[0].getDni())) {
            personaRepository.saveAll(Arrays.asList(mockPersonas));
        }
        FuenteDeFinanciamientoModel[] mockFuentes = restTemplate.build().getForObject(fuentesDeFinanciamientoMockUrl, FuenteDeFinanciamientoModel[].class);
        System.out.println(mockFuentes);
        if (!fuenteDeFinanciamientoRepository.existsByFuente(mockFuentes[0].getFuente())) {
            Arrays.stream(mockFuentes).forEach(m -> fuenteDeFinanciamientoRepository.save(m));
        }
    }
}
