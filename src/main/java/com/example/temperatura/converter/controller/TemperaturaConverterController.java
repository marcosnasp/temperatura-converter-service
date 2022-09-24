package com.example.temperatura.converter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.temperatura.converter.interfaces.CalculadoraTemperatura;

@RestController
@RequestMapping("/converter")
public class TemperaturaConverterController {
	private final CalculadoraTemperatura calculadoraTemperatura;

	@Autowired
	public TemperaturaConverterController(CalculadoraTemperatura calculadoraTemperatura) {
		this.calculadoraTemperatura = calculadoraTemperatura;
	}

	@GetMapping("/ctof/{tempCelsius}")
	public Double celsiusToFareinheit(@PathVariable(name = "tempCelsius") Double tempCelsius) {
		return calculadoraTemperatura.celsiusToFarenheit(tempCelsius);
	}
	
	@GetMapping("/ctok/{tempCelsius}")
	public Double celsiusToKelvin(@PathVariable(name = "tempCelsius") Double tempCelsius) {
		return calculadoraTemperatura.celsiusToKelvin(tempCelsius);
	}
	
	@GetMapping("/ftoc/{tempFarenheit}")
	public Double farenheitToCelsius(@PathVariable(name = "tempFarenheit") Double tempFarenheit) {
		return calculadoraTemperatura.farenheitToCelsius(tempFarenheit);
	}
	
	@GetMapping("/ftok/{tempFarenheit}")
	public Double farenheitToKelvin(@PathVariable(name = "tempFarenheit") Double tempFarenheit) {
		return calculadoraTemperatura.farenheitToKelvin(tempFarenheit);
	}
	
	@GetMapping("/ktoc/{tempKelvin}")
	public Double kelvinToCelsius(@PathVariable(name = "tempKelvin") Double tempKelvin) {
		return calculadoraTemperatura.kelvinToCelsius(tempKelvin);
	}
	
	@GetMapping("/ktof/{tempKelvin}")
	public Double kelvinToFarenheit(@PathVariable(name = "tempKelvin") Double tempKelvin) {
		return calculadoraTemperatura.kelvinToFarenheit(tempKelvin);
	}
	
}
