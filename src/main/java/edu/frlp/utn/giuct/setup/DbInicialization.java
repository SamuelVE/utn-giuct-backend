package edu.frlp.utn.giuct.setup;

import edu.frlp.utn.giuct.models.fuentesdefinanciamiento.FuenteDeFinanciamientoModel;
import edu.frlp.utn.giuct.models.gestiondeformacionacademica.PracticaModel;
import edu.frlp.utn.giuct.models.gestiondepids.PidModel;
import edu.frlp.utn.giuct.models.gestiondeformacionacademica.TipoDePracticaEnumModel;
import edu.frlp.utn.giuct.models.gestionderrhh.PersonaModel;
import edu.frlp.utn.giuct.repository.fuentesdefinanciamiento.FuenteDeFinanciamientoRepository;
import edu.frlp.utn.giuct.repository.gestiondeformacionacademica.PracticaRepository;
import edu.frlp.utn.giuct.repository.gestiondepids.PidRepository;
import edu.frlp.utn.giuct.repository.gestiondeformacionacademica.TipoDePracticaRepository;
import edu.frlp.utn.giuct.repository.gestionderrhh.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class DbInicialization {

    @Autowired
    private RestTemplateBuilder restTemplate;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private FuenteDeFinanciamientoRepository fuenteDeFinanciamientoRepository;

    @Autowired
    private PidRepository pidRepository;

    @Autowired
    private TipoDePracticaRepository tipoDePracticaRepository;

    @Autowired
    private PracticaRepository practicaRepository;

    @Value("${variables.personasMockUrl}")
    private String personasMockUrl;

    @Value("${variables.fuentesDeFinanciamientoMockUrl}")
    private String fuentesDeFinanciamientoMockUrl;

    @Value("${variables.pidsMockUrl}")
    private String pidsMockUrl;

    @Value("${variables.practicasMockUrl}")
    private String practicasMockUrl;

    @Value("${variables.tesisMockUrl}")
    private String tesisMockUrl;


    @PostConstruct
    public void makeLogs() {
        System.out.println("Ejecutando los scripts de inicializacion...");
    }

    @PostConstruct
    public void initializeTablesFromMocks() {
        System.out.println("Inicializando personas desde el mock");
        restTemplate.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        PersonaModel[] mockPersonas = restTemplate.build().getForObject(personasMockUrl, PersonaModel[].class);
        if (!personaRepository.existsByDni(mockPersonas[0].getDni())) {
            personaRepository.saveAll(Arrays.asList(mockPersonas));
        }
        System.out.println("Inicializando Fuentes De Financiamiento desde el mock");
        FuenteDeFinanciamientoModel[] mockFuentes = restTemplate.build().getForObject(fuentesDeFinanciamientoMockUrl, FuenteDeFinanciamientoModel[].class);
        if (!fuenteDeFinanciamientoRepository.existsByFuente(mockFuentes[0].getFuente())) {
            Arrays.stream(mockFuentes).forEach(m -> fuenteDeFinanciamientoRepository.save(m));
        }
        System.out.println("Inicializando pids desde el mock");
        String[] mockPids = restTemplate.build().getForObject(pidsMockUrl, String[].class);
        if (!pidRepository.existsByName(mockPids[0])) {
            Arrays.stream(mockPids).forEach(m -> pidRepository.save(new PidModel(m)));
        }
        System.out.println("Inicializando practicasenum desde el mock");
        String[] mockPracticasEnum = restTemplate.build().getForObject(practicasMockUrl, String[].class);
        if (!tipoDePracticaRepository.existsByTipoDePractica(mockPracticasEnum[0])) {
            Arrays.stream(mockPracticasEnum).forEach(m -> tipoDePracticaRepository.save(new TipoDePracticaEnumModel(m)));
        }
        System.out.println("Inicializando practicas desde el mock");
        PracticaModel[] mockPracticas = restTemplate.build().getForObject(tesisMockUrl, PracticaModel[].class);
        if (!practicaRepository.existsByTitulo(mockPracticas[0].getTitulo())) {
            Arrays.stream(mockPracticas).forEach(m -> practicaRepository.save(m));
        }
    }
}
