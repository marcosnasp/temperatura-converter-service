package com.example.temperatura.converter.interfaces.impl

import com.example.temperatura.converter.interfaces.CalculadoraTemperatura
import org.springframework.stereotype.Service

@Service
class CalculadoraTemperaturaImpl : CalculadoraTemperatura {
    override fun celsiusToFarenheit(tempCelsius: Double): Double = (tempCelsius * 9 / 5) + 32

    override fun celsiusToKelvin(tempCelsius: Double): Double = tempCelsius + 273.15

    override fun farenheitToCelsius(tempFarenheit: Double): Double = ((tempFarenheit - 32) * 5) / 9

    override fun farenheitToKelvin(tempFarenheit: Double): Double = (tempFarenheit - 32) * 5 / 9 + 273.15

    override fun kelvinToCelsius(tempKelvin: Double): Double = tempKelvin - 273.15

    override fun kelvinToFarenheit(tempKelvin: Double): Double = (tempKelvin - 273.15) * 9 / 5 + 32
}