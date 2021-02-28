package edu.frlp.utn.giuct.service.reportes;

import edu.frlp.utn.giuct.models.reportes.MetricsModel;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Service
public class MetricsService {
    @PersistenceContext
    private EntityManager entityManager;

    public MetricsModel getMetrics() {
        Session session = entityManager.unwrap(Session.class).getSession();
        Long ensayosDeCatedraCreadas = session.createQuery("SELECT COUNT(*) FROM PracticaModel p WHERE p.tipoDePractica.tipoDePractica='ensayo_catedra'", Long.class).getSingleResult();
        Long practicasProfesionalizantesCreadas = session.createQuery("SELECT COUNT(*) FROM PracticaModel p WHERE p.tipoDePractica.tipoDePractica='practica_profesionalizante'", Long.class).getSingleResult();
        Long practicasSupervisadasCreadas = session.createQuery("SELECT COUNT(*) FROM PracticaModel p WHERE p.tipoDePractica.tipoDePractica='practica_supervisada'", Long.class).getSingleResult();
        Long tesisLicenciaturaCreadas = session.createQuery("SELECT COUNT(*) FROM PracticaModel p WHERE p.tipoDePractica.tipoDePractica='tesis_licenciatura'", Long.class).getSingleResult();
        Long tesisPostgradoCreadas = session.createQuery("SELECT COUNT(*) FROM PracticaModel p WHERE p.tipoDePractica.tipoDePractica='tesis_postgrado'", Long.class).getSingleResult();;
        Long proyectosFinalesCreados= session.createQuery("SELECT COUNT(*) FROM PracticaModel p WHERE p.tipoDePractica.tipoDePractica='proyecto_final_ingenieria'", Long.class).getSingleResult();;
        return MetricsModel.builder()
                .ensayosDeCatedraCreadas(ensayosDeCatedraCreadas)
                .practicasProfesionalizantesCreadas(practicasProfesionalizantesCreadas)
                .practicasSupervisadasCreadas(practicasSupervisadasCreadas)
                .tesisLicenciaturaCreadas(tesisLicenciaturaCreadas)
                .TesisPostgradoCreadas(tesisPostgradoCreadas)
                .totalDePracticas(practicasProfesionalizantesCreadas+ensayosDeCatedraCreadas+practicasSupervisadasCreadas)
                .totalDeTesis(tesisLicenciaturaCreadas+tesisPostgradoCreadas+proyectosFinalesCreados)
                .proyectosFinalesCreados(proyectosFinalesCreados)
                .build();
    }
}
