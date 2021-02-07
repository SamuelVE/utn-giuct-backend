package edu.frlp.utn.giuct;

import edu.frlp.utn.giuct.setup.DbInicialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"edu.frlp.utn.giuct.repository"})
@SpringBootApplication
public class GiuctApplication {

	@Autowired
	private static DbInicialization dbInicialization;

	public static void main(String[] args) {
	    SpringApplication.run(GiuctApplication.class, args);
		System.out.println("Server configured!...");
	}
}
