package com.ssj.common.enums;
/**
 * 礼单类型
 * 
 * @author zhiya.chai
 * @date 2018年7月2日 下午4:52:44
 */
public enum BookType {

	收到(1),送出(2);
	
	public int type;
	
	private BookType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}
}
