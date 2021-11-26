package com.cia.desafio.cia.desafio.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cia.desafio.cia.desafio.model.ComunaModel;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

// TODO: Auto-generated Javadoc
/**
 * The Class ComunaService.
 */
@Service("ComunaService")
public class ComunaService {
	
	/** The uri. */
	final String uri = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=8";
	
	/** The log. */
	private final Logger LOG = LoggerFactory.getLogger(ComunaService.class);
	
	/** The rest template. */
	private RestTemplate restTemplate = new RestTemplate();
	
	/**
	 * Gets the all comunas.
	 *
	 * @return the all comunas
	 */
	public void getAllComunas() {
		LOG.info("consumiendo la api externa:");

		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();        
		//Add the Jackson Message converter
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

		// Note: here we are making this converter to process any kind of response, 
		// not only application/*son, which is the default behavior
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters); 
		ComunaModel[] comunas = restTemplate.getForObject(uri, ComunaModel[].class);
		
		
		
		try {
			
			 ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("./comuna.json"), comunas );
			LOG.info("Guardando datos en un archivo .json:");
			
		}catch(IOException  e) {
			  e.printStackTrace();  
		}
	
	    
	    
	    
	}
	
	/**
	 * Gets the comuna.
	 *
	 * @param comuna the comuna
	 * @return the comuna
	 * @throws FileNotFoundException the file not found exception
	 */
	public List<ComunaModel> getComuna(String comuna) throws FileNotFoundException  {
		LOG.info("Obteniendo comunas :");
		
				List<ComunaModel> resultComunas = new ArrayList<ComunaModel>();
			  BufferedReader br = new BufferedReader(new FileReader("./comuna.json"));
			  ComunaModel[] sample = new Gson().fromJson(br, ComunaModel[].class);
			  System.out.println(comuna);
			
			  
			  for (int i = 0; i < sample.length; i++) {
				if(sample[i].getComuna_nombre().equals(comuna) ) {
					ComunaModel newcomuna = new ComunaModel();
					newcomuna.setLocal_nombre(sample[i].getLocal_nombre());
					newcomuna.setLocal_direccion(sample[i].getLocal_direccion());
					newcomuna.setLocal_telefono(sample[i].getLocal_telefono());
					newcomuna.setLocal_lat(sample[i].getLocal_lat());
					newcomuna.setLocal_lng(sample[i].getLocal_lng());
					newcomuna.setComuna_nombre(sample[i].getComuna_nombre());
					resultComunas.add(newcomuna);
				}else {
					
				}
			}
			  LOG.info("Retornando comunas:");
			  return resultComunas;
			  
		
		
		
		
	}
}
