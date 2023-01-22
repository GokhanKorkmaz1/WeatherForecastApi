package com.patika.weatherapi.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patika.weatherapi.entities.Root;
import com.patika.weatherapi.services.WeatherService;
import com.patika.weatherapi.validation.ForecastQueryParamValidation.GetTaskRequestParameters;

@RestController
@RequestMapping("/api/weatherForecast")
@Validated
public class WeatherForecastController {
	
	private WeatherService weatherService;

	@Autowired
	public WeatherForecastController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	@GetMapping("/getForecast")
	public ResponseEntity<Root> getForecast(@Valid GetTaskRequestParameters params) {
		Root result = weatherService.getForecast(params.city(), params.days());
		return ResponseEntity.ok(result);
	}
	
}
