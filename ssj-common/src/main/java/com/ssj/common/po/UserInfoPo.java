package com.ssj.common.po;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * UserInfo
 * @author zhiya.chai
 * 2018-07-02 24:10:02
 */
public class UserInfoPo implements Serializable{
	private static final long serialVersionUID = -962663023208812456L;
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 电话号码
	 */
	private String phoneNumber;
	/**
	 * 密码,MD5加密
	 */
	private String secrectCode;
	/**
	 * 密码盐
	 */
	private String secrectSalt;
	/**
	 * 创建日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date creatTime;
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
	public void setUserName(String value) {
		this.userName = value;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setSecrectCode(String value) {
		this.secrectCode = value;
	}
	public String getSecrectCode() {
		return this.secrectCode;
	}
	public void setSecrectSalt(String value) {
		this.secrectSalt = value;
	}
	public String getSecrectSalt() {
		return this.secrectSalt;
	}
	public void setCreatTime(java.util.Date value) {
		this.creatTime = value;
	}
	public java.util.Date getCreatTime() {
		return this.creatTime;
	}
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

}

