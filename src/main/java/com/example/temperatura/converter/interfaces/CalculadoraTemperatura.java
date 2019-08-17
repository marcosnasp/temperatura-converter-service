package com.example.temperatura.converter.interfaces;

public interface CalculadoraTemperatura {

	Double celsiusToFarenheit(Double tempCelsius);

	Double celsiusToKelvin(Double tempCelsius);

	Double farenheitToCelsius(Double tempFarenheit);

	Double farenheitToKelvin(Double tempFarenkeit);

	Double kelvinToCelsius(Double tempKelvin);

	Double kelvinToFarenheit(Double tempKelvin);

}
