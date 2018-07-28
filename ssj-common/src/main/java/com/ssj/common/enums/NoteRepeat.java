package com.ssj.common.enums;
/**
 * 随手记重复
 * 
 * @author zhiya.chai
 * @date 2018年7月2日 下午4:49:58
 */
public enum NoteRepeat {
	
	无(1),准时(2),提前一天(3),提前一周(4);
	
	public int value;
	
	private NoteRepeat(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
