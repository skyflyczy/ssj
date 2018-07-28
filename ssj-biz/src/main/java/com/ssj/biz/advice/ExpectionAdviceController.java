package com.ssj.biz.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.ssj.common.enums.ErrorCode;
import com.ssj.common.exception.SsjException;
import com.ssj.common.response.DataResponse;

@ControllerAdvice
@RestController
public class ExpectionAdviceController {
	private Logger log = LoggerFactory.getLogger(getClass());
	
	
	
	@ExceptionHandler(SsjException.class)
	public DataResponse handleErrorCodeException(SsjException exception) {
		log.error("Handle request fail!", exception);
		return DataResponse.create().setErrorCode(exception.getErrorCode());
	}

	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public DataResponse handleMothodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
		log.error("Handle request fail，Http request method not supported!", exception);
		return DataResponse.create().setErrorCode(ErrorCode.HTTP_METHOD_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public DataResponse handleException(Exception exception) {
		log.error("Handle request fail!", exception);
		return DataResponse.create().setErrorCode(ErrorCode.SYS_ERROR);
	}
}
