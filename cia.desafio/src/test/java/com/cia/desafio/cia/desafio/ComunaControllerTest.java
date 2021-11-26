package com.cia.desafio.cia.desafio;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


import com.cia.desafio.cia.desafio.controller.ComunaController;
@ExtendWith(SpringExtension.class)
@WebMvcTest(ComunaController.class)
public class ComunaControllerTest {
	
	@Autowired
	private MockMvc mock;
	
	@Test
	void GetComunas() throws Exception {
		
		mock.perform(get("/comuna"))
        .andExpect(status().isOk());
       
		
		
	}

}
