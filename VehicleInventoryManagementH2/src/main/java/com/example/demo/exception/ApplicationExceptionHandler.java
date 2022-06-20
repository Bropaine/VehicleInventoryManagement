//Written by Jared Hall 6/18/2022

package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//capture exceptions and translate to HTTP responses

public class ApplicationExceptionHandler {
//define exception handler method
	
		
		//handles all general exceptions
		@ExceptionHandler(Exception.class)
		public ResponseEntity<ApiError> genericExceptionHandler(Exception e){
			ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
			apiError.setMessage(e.getMessage());
			return new ResponseEntity<ApiError>(apiError, apiError.getStatus());
		}
}


