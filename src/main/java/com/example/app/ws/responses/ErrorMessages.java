package com.example.app.ws.responses;

public enum ErrorMessages {
	
	MISSING_REQUIRED_FIELD("Missing required field."),
	RECORD_ALREADY_EXISTS("Record already exists"),
	INTERNAL_SERVER_ERROR("Internal server error"),
	NO_RECORD_FOUND("Record with provided id is not found");
	
	private String errorMessageString;

	private ErrorMessages(String errorMessageString) {
		this.errorMessageString = errorMessageString;
	}

	public String getErrorMessageString() {
		return errorMessageString;
	}

	public void setErrorMessageString(String errorMessageString) {
		this.errorMessageString = errorMessageString;
	}

}
