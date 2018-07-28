package com.ssj.common.enums;
/**
 * 随手记类别
 * 
 * @author zhiya.chai
 * @date 2018年7月2日 下午4:48:14
 */
public enum NoteType {

	结婚纪念日(1),生日(2),其他(-1);
	
	public int type;
	
	private NoteType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}
}
