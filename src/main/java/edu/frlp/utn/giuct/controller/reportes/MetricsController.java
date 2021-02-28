package edu.frlp.utn.giuct.controller.reportes;


import edu.frlp.utn.giuct.models.reportes.MetricsModel;
import edu.frlp.utn.giuct.service.gestiondeformacionacademica.PracticaService;
import edu.frlp.utn.giuct.service.reportes.MetricsService;
import edu.frlp.utn.giuct.setup.DownloadFileFromBytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;

@RestController
@RequestMapping("/reportes")
public class MetricsController {

    @Autowired
    private MetricsService service;

    @Autowired
    private PracticaService practicaService;

    //CONSULTA

    @RequestMapping("/")
    public @ResponseBody MetricsModel getGeneralMetrics() {
        System.out.println("MetricsController -> getGeneralMetrics()");
        return service.getMetrics();
    }

    @RequestMapping("/tesisDeLicenciatura/csv")
    public @ResponseBody void getTesisDeLicenciaturaCsv(HttpServletResponse response) throws IOException{
        System.out.println("MetricsController -> getTesisDeLicenciaturaCsv()");
        String fileName = "tesisDeLicenciatura"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllTesisDeLicenciatura());
    }

    @RequestMapping("/tesisDePostgrado/csv")
    public @ResponseBody void getTesisDePostgradoCsv(HttpServletResponse response) throws IOException {
        System.out.println("MetricsController -> getTesisDePostgradoCsv()");
        String fileName = "tesisDePostgrado"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllTesisDePostgrado());
    }

    @RequestMapping("/practicasProfesionalizantes/csv")
    public @ResponseBody void getPracticasProfesionalizantesCsv(HttpServletResponse response) throws IOException{
        System.out.println("MetricsController -> getGeneralMetrics()");
        String fileName = "practicasProfesionalizantes"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllPracticaProfesionalizante());
    }

    @RequestMapping("/proyectosFinales/csv")
    public @ResponseBody void getProyectosFinalesCsv(HttpServletResponse response) throws IOException{
        System.out.println("MetricsController -> getProyectosFinalesCsv()");
        String fileName = "proyectosFinales"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllProyectoFinalDeIngenieria());
    }

    @RequestMapping("/practicasSupervisadas/csv")
    public @ResponseBody void getPracticasSupervisadasCsv(HttpServletResponse response) throws IOException{
        System.out.println("MetricsController -> getPracticasSupervisadasCsv()");
        String fileName = "practicasSupervisadas"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllPracticaSupervisada());
    }

    @RequestMapping("/ensayoDeCatedra/csv")
    public void getEnsayoDeCatedraCsv(HttpServletResponse response) throws IOException{
        System.out.println("MetricsController -> getEnsayoDeCatedraCsv()");
        String fileName = "ensayoDeCatedra"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllEnsayoCatedra());
    }

    @RequestMapping("/totalTesis/csv")
    public void getTotalTesisCsv(HttpServletResponse response) throws IOException{
        System.out.println("MetricsController -> getTotalTesisCsv()");
        String fileName = "totalTesis"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllTesis());
    }

    @RequestMapping("/totalPracticas/csv")
    public void getTotalPracticasCsv(HttpServletResponse response) throws IOException{
        System.out.println("MetricsController -> getTotalPracticasCsv()");
        String fileName = "totalPracticas"+ Instant.now()+ ".csv";
        DownloadFileFromBytes.mapObjectsToCsv(fileName, response,  practicaService.findAllPracticas());
    }
}
