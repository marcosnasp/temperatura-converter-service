package com.example.temperatura.converter;

import com.example.temperatura.converter.interfaces.CalculadoraTemperatura;
import com.example.temperatura.converter.interfaces.impl.CalculadoraTemperaturaImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
public class TemperaturaConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperaturaConverterApplication.class, args);
	}
	
	@Bean
	public CalculadoraTemperatura calculadoraTemperatura() {
		return new CalculadoraTemperaturaImpl();
	}

}
