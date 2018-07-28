package com.ssj.common.enums;
/**
 * 随手记主角
 * @author zhiya.chai
 * @date 2018年7月2日 上午11:49:57
 */
public enum NoteRole {
	
	本人(1),
	家人(2),
	朋友(3),
	其他(-1);

	public int value;
	
	private NoteRole(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
}
