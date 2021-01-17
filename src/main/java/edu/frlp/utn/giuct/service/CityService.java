package edu.frlp.utn.giuct.service;

import java.util.List;

import edu.frlp.utn.giuct.models.City;
import edu.frlp.utn.giuct.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService{

    @Autowired
    private CityRepository repository;

    public List<City> findAll() {
        return repository.findAll();
    }
}
