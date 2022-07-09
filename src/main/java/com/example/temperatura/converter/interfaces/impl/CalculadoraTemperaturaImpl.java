package com.example.temperatura.converter.interfaces.impl;

import com.example.temperatura.converter.interfaces.CalculadoraTemperatura;

public class CalculadoraTemperaturaImpl implements CalculadoraTemperatura {

	public Double celsiusToFarenheit(Double tempCelsius) {
		return (tempCelsius * 9/5) + 32;
	}

	public Double celsiusToKelvin(Double tempCelsius) {
		return tempCelsius + 273.15;
	}

	public Double farenheitToCelsius(Double tempFarenheit) {
		return ((tempFarenheit - 32) * 5)/9;
	}

	public Double farenheitToKelvin(Double tempFarenkeit) {
		return ((tempFarenkeit - 32) * 5)/9 + 273.15;
	}

	public Double kelvinToCelsius(Double tempKelvin) {
		return tempKelvin - 273.15;
	}

	public Double kelvinToFarenheit(Double tempKelvin) {
		return ((tempKelvin - 273.15) * 9)/5 + 32;
	}

}