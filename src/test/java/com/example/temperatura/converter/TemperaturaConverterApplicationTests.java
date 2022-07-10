package com.example.temperatura.converter;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.temperatura.converter.controller.TemperaturaConverterController;

@WebMvcTest(controllers = TemperaturaConverterController.class)
public class TemperaturaConverterApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TemperaturaConverterController temperaturaConverterController;

	@Test
	public void testConvertCelsiusToFareinheit() throws Exception {
		Double temperaturaCelsius = 10.0;

		when(temperaturaConverterController.celsiusToFareinheit(temperaturaCelsius)).thenReturn(50.0);

		this.mockMvc.perform(get("/converter/ctof/{tempCelsius}", temperaturaCelsius)).andExpect(status().isOk())
				.andExpect(content().string("50.0"));
	}

	@Test
	public void testConvertCelsiusToKelvin() throws Exception {
		Double temperaturaCelsius = 10.0;

		when(temperaturaConverterController.celsiusToKelvin(temperaturaCelsius)).thenReturn(283.15);

		this.mockMvc.perform(get("/converter/ctok/{tempCelsius}", temperaturaCelsius)).andExpect(status().isOk())
				.andExpect(content().string("283.15"));
	}

	@Test
	public void testConvertFarenheitToCelsius() throws Exception {
		Double temperaturaFarenheit = 10.0;

		when(temperaturaConverterController.farenheitToCelsius(temperaturaFarenheit)).thenReturn(-12.22);

		this.mockMvc.perform(get("/converter/ftoc/{tempFarenheit}", temperaturaFarenheit)).andExpect(status().isOk())
				.andExpect(content().string("-12.22"));
	}

	@Test
	public void testConvertFarenheitToKelvin() throws Exception {
		Double temperaturaFarenheit = 10.0;

		when(temperaturaConverterController.farenheitToKelvin(temperaturaFarenheit)).thenReturn(260.92);

		this.mockMvc.perform(get("/converter/ftok/{tempFarenheit}", temperaturaFarenheit)).andExpect(status().isOk())
				.andExpect(content().string("260.92"));
	}

	@Test
	public void testConvertKelvinToCelsius() throws Exception {
		Double temperaturaKelvin = 0.0;

		when(temperaturaConverterController.kelvinToCelsius(temperaturaKelvin)).thenReturn(-273.15);

		this.mockMvc.perform(get("/converter/ktoc/{tempKelvin}", temperaturaKelvin)).andExpect(status().isOk())
				.andExpect(content().string("-273.15"));
	}

	@Test
	public void testConvertKelvinToFareinheit() throws Exception {
		Double temperaturaFareinheit = 0.0;

		when(temperaturaConverterController.kelvinToFarenheit(temperaturaFareinheit)).thenReturn(-459.67);

		this.mockMvc.perform(get("/converter/ktof/{tempKelvin}", temperaturaFareinheit)).andExpect(status().isOk())
				.andExpect(content().string("-459.67"));
	}
	
}
