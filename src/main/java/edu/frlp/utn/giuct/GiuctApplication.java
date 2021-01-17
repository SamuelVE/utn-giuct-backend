package edu.frlp.utn.giuct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"edu.frlp.utn.giuct.repository"})
@SpringBootApplication
public class GiuctApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiuctApplication.class, args);
	}

}
