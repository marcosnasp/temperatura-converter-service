package com.example.temperatura.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.temperatura.converter.interfaces.CalculadoraTemperatura;
import com.example.temperatura.converter.interfaces.impl.CalculadoraTemperaturaImpl;

@SpringBootApplication
public class TemperaturaConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperaturaConverterApplication.class, args);
	}
	
	@Bean
	public CalculadoraTemperatura calculadoraTemperatura() {
		return new CalculadoraTemperaturaImpl();
	}

}
