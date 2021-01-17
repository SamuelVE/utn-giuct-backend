package edu.frlp.utn.giuct.repository;

import edu.frlp.utn.giuct.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
