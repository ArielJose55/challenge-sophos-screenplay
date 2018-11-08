package com.sophos.challenge.demoaut.util.exceptions;

public class InitializationBrowserException extends RuntimeException {

	private static final long serialVersionUID = -7732071344390669048L;

	public InitializationBrowserException() {}

	public InitializationBrowserException(String message) {
		super(message);
	}

	public InitializationBrowserException(Throwable cause) {
		super(cause);
	}

	public InitializationBrowserException(String message, Throwable cause) {
		super(message, cause);
	}
}
