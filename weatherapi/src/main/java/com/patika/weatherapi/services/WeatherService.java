package com.patika.weatherapi.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.patika.weatherapi.entities.Root;
import com.patika.weatherapi.exceptions.CityNameException;
import com.patika.weatherapi.exceptions.DaysException;


@Service
public class WeatherService {


	private RestTemplate restTemplate;
	@Value("${weatherApiUrl}")
	private String url;
	@Value("${weatherApiKey}")
	private String apiKey;
	@Value("${defaultQueries}")
	private String defaultQueries;
	
	public WeatherService() {
		restTemplate = new RestTemplate();
	}
	
	public Root getForecast(String city, int days) {
		// Business rules
		cityBlankCheck(city);
		daysShouldBeGreaterThan0(days);
		daysShouldBeLessThan15(days);
		
		StringBuilder sb = new StringBuilder();
		sb.append(url).append(apiKey).append("&q=").append(city)
		  .append("&days=").append(days).append(defaultQueries);
		
		Root result = restTemplate.getForObject(sb.toString(), Root.class);
		return result;
	}
	
	public void cityBlankCheck(String city) {
		if(city.isBlank())
			throw new CityNameException("Sehir ya da ülke adı giriniz.",new Throwable());
	}
	
	public void daysShouldBeGreaterThan0(int days) {
		if(days < 1)
			throw new DaysException("Gün değeri 1'den küçük olamaz");
	}
	
	public void daysShouldBeLessThan15(int days) {
		if(days >14)
			throw new DaysException("Gün değeri 14 ile sınırlıdır.");
	}
}
