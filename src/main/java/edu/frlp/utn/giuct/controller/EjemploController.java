package edu.frlp.utn.giuct.controller;

import edu.frlp.utn.giuct.models.City;
import edu.frlp.utn.giuct.service.CityService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EjemploController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> findCities() {
        return cityService.findAll();
    }
}
