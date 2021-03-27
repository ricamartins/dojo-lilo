package com.dojodolilo.controler;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiError {

    private LocalDateTime dateTime;
    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ApiError(HttpStatus status,  List<String> errors) {
        this.dateTime = LocalDateTime.now();
        this.status = status;
        this.message = "Por favor verificar campos enviados";
        this.errors = errors;
    }

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public List<String> getErrors() {
		return errors;
	}
    
}
