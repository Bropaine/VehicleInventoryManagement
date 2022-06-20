//Written by Jared Hall 6/18/2022

package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class ApiError {
	//Hold status of Http request
	private HttpStatus status;
	//define the time stamp pattern to store in this format
	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
	//store time stamp when exception is thrown
	private LocalDateTime timestamp;
    //store the exception message
	private String message;
	//constructor
	public ApiError() {
		timestamp = LocalDateTime.now();
	}
	//pass HttpStatus store status in status field,parameterized constructor
	public ApiError(HttpStatus status) {
		this();
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

