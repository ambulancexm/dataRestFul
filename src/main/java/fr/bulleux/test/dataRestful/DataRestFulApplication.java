package fr.bulleux.test.dataRestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.webmvc.RepositoryRestExceptionHandler;

import fr.bulleux.test.dataRestful.transaction.TransProjet;

@SpringBootApplication
public class DataRestFulApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DataRestFulApplication.class, args);
			
		} catch (Exception e) {
			System.out.println("soucis de l'appli : " + e.getMessage());
		}
		
		
	}

}
