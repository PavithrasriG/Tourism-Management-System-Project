package com.example.demo.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	private HttpStatus status;
	private String message;
	
// generate the setter and getter method	
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
// generate the to string	
	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", message=" + message + "]";
	}
// generate the constructor(within the argument)	
	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

// generate the constructor(without the argument)		
	public ErrorMessage() {
		super();
		
	}
	
	
}
