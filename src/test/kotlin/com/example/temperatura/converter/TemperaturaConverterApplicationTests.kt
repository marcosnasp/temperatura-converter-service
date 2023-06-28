package com.example.temperatura.converter

import com.example.temperatura.converter.controller.TemperaturaConverterController
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@WebMvcTest(controllers = [TemperaturaConverterController::class])
class TemperaturaConverterApplicationTests(
    @Autowired val mockMvc: MockMvc) {

    @MockBean
    lateinit var temperaturaConverterController: TemperaturaConverterController

    @Test
    @Throws(Exception::class)
    fun testConvertCelsiusToFareinheit() {
        val temperaturaCelsius = 10.0
        Mockito.`when`<Double>(temperaturaConverterController.celsiusToFareinheit(temperaturaCelsius)).thenReturn(50.0)
        mockMvc.perform(MockMvcRequestBuilders.get("/converter/ctof/{tempCelsius}", temperaturaCelsius))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("50.0"))
    }

	@Test
	@Throws(java.lang.Exception::class)
	fun testConvertCelsiusToKelvin() {
		val temperaturaCelsius = 10.0
		`when`(temperaturaConverterController.celsiusToKelvin(temperaturaCelsius)).thenReturn(283.15)
		mockMvc.perform(MockMvcRequestBuilders.get("/converter/ctok/{tempCelsius}", temperaturaCelsius)).andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("283.15"))
	}

	@Test
	@Throws(java.lang.Exception::class)
	fun testConvertFarenheitToCelsius() {
		val temperaturaFarenheit = 10.0
		`when`(temperaturaConverterController.farenheitToCelsius(temperaturaFarenheit)).thenReturn(-12.22)
		mockMvc.perform(MockMvcRequestBuilders.get("/converter/ftoc/{tempFarenheit}", temperaturaFarenheit)).andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("-12.22"))
	}

	@Test
	@Throws(java.lang.Exception::class)
	fun testConvertFarenheitToKelvin() {
		val temperaturaFarenheit = 10.0
		`when`(temperaturaConverterController.farenheitToKelvin(temperaturaFarenheit)).thenReturn(260.92)
		mockMvc.perform(MockMvcRequestBuilders.get("/converter/ftok/{tempFarenheit}", temperaturaFarenheit)).andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("260.92"))
	}

	@Test
	@Throws(java.lang.Exception::class)
	fun testConvertKelvinToCelsius() {
		val temperaturaKelvin = 0.0
		`when`(temperaturaConverterController.kelvinToCelsius(temperaturaKelvin)).thenReturn(-273.15)
		mockMvc.perform(MockMvcRequestBuilders.get("/converter/ktoc/{tempKelvin}", temperaturaKelvin)).andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("-273.15"))
	}

	@Test
	@Throws(java.lang.Exception::class)
	fun testConvertKelvinToFareinheit() {
		val temperaturaFareinheit = 0.0
		`when`(temperaturaConverterController.kelvinToFarenheit(temperaturaFareinheit)).thenReturn(-459.67)
		mockMvc.perform(MockMvcRequestBuilders.get("/converter/ktof/{tempKelvin}", temperaturaFareinheit)).andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("-459.67"))
	}

}