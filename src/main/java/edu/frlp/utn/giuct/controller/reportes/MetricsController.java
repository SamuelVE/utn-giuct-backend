package edu.frlp.utn.giuct.controller.reportes;


import edu.frlp.utn.giuct.models.reportes.MetricsModel;
import edu.frlp.utn.giuct.service.reportes.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reportes")
public class MetricsController {

    @Autowired
    private MetricsService service;

    //CONSULTA

    @RequestMapping(value = "/", produces={MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody MetricsModel getGeneralMetrics() {
        System.out.println("MetricsController -> getGeneralMetrics()");
        return service.getMetrics();
    }
}
