package com.patika.weatherapi.exceptions;

public class DaysException extends RuntimeException {

	public DaysException() {
		super();
	}

	public DaysException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaysException(String message) {
		super(message);
	}

	public DaysException(Throwable cause) {
		super(cause);
	}

}
