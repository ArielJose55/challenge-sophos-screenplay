package com.sophos.challenge.demoaut.util.exceptions;

public class ReaderPropertiesFailException extends Exception {

	private static final long serialVersionUID = 1L;

	public ReaderPropertiesFailException() {
		super();
	}

	public ReaderPropertiesFailException(String message) {
		super(message);
	}

	public ReaderPropertiesFailException(Throwable cause) {
		super(cause);
	}

	public ReaderPropertiesFailException(String message, Throwable cause) {
		super(message, cause);
	}
}
