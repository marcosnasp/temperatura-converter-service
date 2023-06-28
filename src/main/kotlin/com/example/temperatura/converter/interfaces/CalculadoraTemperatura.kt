package com.example.temperatura.converter.interfaces

interface CalculadoraTemperatura {
    fun celsiusToFarenheit(tempCelsius: Double): Double
    fun celsiusToKelvin(tempCelsius: Double): Double
    fun farenheitToCelsius(tempFarenheit: Double): Double
    fun farenheitToKelvin(tempFarenheit: Double): Double
    fun kelvinToCelsius(tempKelvin: Double): Double
    fun kelvinToFarenheit(tempKelvin: Double): Double
}