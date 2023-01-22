package com.patika.weatherapi.entities;

import java.util.List;

public class Forecast {
	private List<Forecastday> forecastday;
	
	public Forecast() {
		
	}
	
	public Forecast(List<Forecastday> forecastday) {
		this.forecastday = forecastday;
	}

	public List<Forecastday> getForecastday() {
		return forecastday;
	}

	public void setForecastday(List<Forecastday> forecastday) {
		this.forecastday = forecastday;
	}
	
}
