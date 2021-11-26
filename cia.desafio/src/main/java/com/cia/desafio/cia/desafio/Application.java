package com.cia.desafio.cia.desafio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cia.desafio.cia.desafio.service.ComunaService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	
	 ComunaService comunaService = new ComunaService();
	 comunaService.getAllComunas();
		
		SpringApplication.run(Application.class, args);
	}

}
