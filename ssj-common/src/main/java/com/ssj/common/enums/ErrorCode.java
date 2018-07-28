package com.ssj.common.enums;

public enum ErrorCode {
	
	SUCCESS(0, "成功"),
	EDIT_ERROR(10001,"编辑失败"),
	HTTP_METHOD_ERROR(80001,"http方法调用错误"),
	SYS_ERROR(99999,"系统异常");

	private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
