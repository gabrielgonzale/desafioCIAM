package com.cia.desafio.cia.desafio.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cia.desafio.cia.desafio.model.ComunaModel;
import com.cia.desafio.cia.desafio.service.ComunaService;

// TODO: Auto-generated Javadoc
/**
 * The Class ComunaController
 * .
 */
@RestController
@RequestMapping("/comuna")
public class ComunaController {
	
	/** The log. */
	private final Logger LOG = LoggerFactory.getLogger(ComunaController.class);
	
	/** The comuna service. */
	@Autowired
	@Qualifier("ComunaService")
	private ComunaService comunaService;

	/**
	 * Gets the comunas.
	 *
	 * @param comuna the comuna
	 * @return the response entity 
	 * @throws FileNotFoundException the file not found exception
	 */
	@GetMapping(path = "/{comuna}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<ComunaModel>> GetComunas(@PathVariable String comuna) throws FileNotFoundException {
		LOG.info("Consumiendo servicio Comuna");

		
		List<ComunaModel> comunas = comunaService.getComuna(comuna);
		System.out.println(comunas.size());

		return new ResponseEntity<List<ComunaModel>>(comunas, HttpStatus.OK);
	}

}
