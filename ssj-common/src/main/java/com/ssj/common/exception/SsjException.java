package com.ssj.common.exception;

import com.ssj.common.enums.ErrorCode;

public class SsjException extends RuntimeException{

	private static final long serialVersionUID = 7428818080722071837L;
	
	private String message;
	
	private ErrorCode errorCode;

	public SsjException(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	public SsjException(String message) {
		errorCode = ErrorCode.SYS_ERROR;
		this.message = message;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public String getMessage() {
		return message;
	}

}
