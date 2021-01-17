package edu.frlp.utn.giuct.controller;

import edu.frlp.utn.giuct.models.City;
import edu.frlp.utn.giuct.repository.CityRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EjemploController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/cities")
    public List<City> findCities() {
        return cityRepository.findAll();
    }
}
