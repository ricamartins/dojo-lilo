package com.dojodolilo.controler;

public class ErroResponse {

	private String code;
	private String field;
	private String message;

	public ErroResponse(String code, String field, String message) {
		this.code = code;
		this.field = field;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getField() {
		return field;
	}

	public String getMessage() {
		return message;
	}

}
