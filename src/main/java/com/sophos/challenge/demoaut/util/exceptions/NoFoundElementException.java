package com.sophos.challenge.demoaut.util.exceptions;

public class NoFoundElementException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NoFoundElementException() {
		super();
	}

	public NoFoundElementException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoFoundElementException(String message) {
		super(message);
	}

	public NoFoundElementException(Throwable cause) {
		super(cause);
	}
}
