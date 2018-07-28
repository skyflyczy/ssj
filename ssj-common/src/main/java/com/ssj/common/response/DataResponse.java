package com.ssj.common.response;

import java.io.Serializable;

import com.ssj.common.enums.ErrorCode;


public class DataResponse<T> implements Serializable{
	
	private static final long serialVersionUID = 6296361397569742734L;
	private ErrorCode errorCode;
	private T data;
	
	public static <T> DataResponse<T> create() {
		return new DataResponse<T>();
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}
	public DataResponse<T> setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
		return this;
	}
	
	public T getData() {
		return data;
	}
	public DataResponse<T> setData(T data) {
		this.data = data;
		return this;
	}

	
}
