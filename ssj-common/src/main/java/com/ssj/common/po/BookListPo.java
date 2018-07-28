package com.ssj.common.po;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 礼单簿
 * BookList
 * @author zhiya.chai
 * 2018-07-02 24:10:01
 */
public class BookListPo implements Serializable{
	
	private static final long serialVersionUID = 1521687396985550392L;
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 收到用户Id
	 */
	private Integer receiveUserId;
	/**
	 * 收到用户名称
	 */
	private String receiveUserName;
	/**
	 * 收到用户Id
	 */
	private Integer sendUserId;
	/**
	 * 收到用户名称
	 */
	private String sendUserName;
	/**
	 * 礼单日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")  
	private java.util.Date bookDate;
	/**
	 * 礼单金额
	 */
	private java.math.BigDecimal bookMoney;
	/**
	 * 礼单物品
	 */
	private String bookGift;
	/**
	 * 事由
	 */
	private String bookCause;
	/**
	 * 祝福语
	 */
	private String bookGreetings;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;
	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date updateTime;

	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getId() {
		return this.id;
	}
	public void setBookDate(java.util.Date value) {
		this.bookDate = value;
	}
	public java.util.Date getBookDate() {
		return this.bookDate;
	}
	public void setBookMoney(java.math.BigDecimal value) {
		this.bookMoney = value;
	}
	public java.math.BigDecimal getBookMoney() {
		return this.bookMoney;
	}
	public void setBookGift(String value) {
		this.bookGift = value;
	}
	public String getBookGift() {
		return this.bookGift;
	}
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	public String getBookCause() {
		return bookCause;
	}
	public void setBookCause(String bookCause) {
		this.bookCause = bookCause;
	}
	public String getBookGreetings() {
		return bookGreetings;
	}
	public void setBookGreetings(String bookGreetings) {
		this.bookGreetings = bookGreetings;
	}
	public Integer getReceiveUserId() {
		return receiveUserId;
	}
	public void setReceiveUserId(Integer receiveUserId) {
		this.receiveUserId = receiveUserId;
	}
	public String getReceiveUserName() {
		return receiveUserName;
	}
	public void setReceiveUserName(String receiveUserName) {
		this.receiveUserName = receiveUserName;
	}
	public Integer getSendUserId() {
		return sendUserId;
	}
	public void setSendUserId(Integer sendUserId) {
		this.sendUserId = sendUserId;
	}
	public String getSendUserName() {
		return sendUserName;
	}
	public void setSendUserName(String sendUserName) {
		this.sendUserName = sendUserName;
	}
	
}

