package com.github.vidaniello.temuapi.exceptions;

public class TemuException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TemuException() {
		
	}
	
	public TemuException(String message) {
		super(message);
	}
	
	public TemuException(Exception exception) {
		super(exception);
	}
	
	public TemuException(String message, Exception exception) {
		super(message, exception);
	}

}
