package com.example.temperatura.converter.controller

import com.example.temperatura.converter.interfaces.CalculadoraTemperatura
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/converter"])
class TemperaturaConverterController(val calculadoraTemperatura: CalculadoraTemperatura) {

    @GetMapping("/ctof/{tempCelsius}")
    fun celsiusToFareinheit(@PathVariable(name = "tempCelsius") tempCelsius: Double) =
        calculadoraTemperatura.celsiusToFarenheit(tempCelsius)

    @GetMapping("/ctok/{tempCelsius}")
    fun celsiusToKelvin(@PathVariable(name = "tempCelsius") tempCelsius: Double) =
        calculadoraTemperatura.celsiusToKelvin(tempCelsius)

    @GetMapping("/ftoc/{tempFarenheit}")
    fun farenheitToCelsius(@PathVariable(name = "tempFarenheit") tempFarenheit: Double) =
        calculadoraTemperatura.farenheitToCelsius(tempFarenheit)

    @GetMapping("/ftok/{tempFarenheit}")
    fun farenheitToKelvin(@PathVariable(name = "tempFarenheit") tempFarenheit: Double) =
        calculadoraTemperatura.farenheitToKelvin(tempFarenheit)

    @GetMapping("/ktoc/{tempKelvin}")
    fun kelvinToCelsius(@PathVariable(name = "tempKelvin") tempKelvin: Double) =
        calculadoraTemperatura.kelvinToCelsius(tempKelvin)

    @GetMapping("/ktof/{tempKelvin}")
    fun kelvinToFarenheit(@PathVariable(name = "tempKelvin") tempKelvin: Double) =
        calculadoraTemperatura.kelvinToFarenheit(tempKelvin)
}