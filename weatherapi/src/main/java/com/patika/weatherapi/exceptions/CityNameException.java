package com.patika.weatherapi.exceptions;

public class CityNameException extends RuntimeException {

	public CityNameException() {
		super();
	}

	public CityNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public CityNameException(String message) {
		super(message);
	}

	public CityNameException(Throwable cause) {
		super(cause);
	}
	
}
