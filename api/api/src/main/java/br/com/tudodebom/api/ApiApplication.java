package br.com.tudodebom.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tudodebom.api.model.Produto;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		Produto test = new Produto();
		
		System.out.println(test.getTipo());
		SpringApplication.run(ApiApplication.class, args);
	}

}
