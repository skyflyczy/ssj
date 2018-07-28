package com.ssj.common.po;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 邀请内容
 * InviteMsg
 * @author zhiya.chai
 * 2018-07-02 24:10:01
 */
public class InviteMsgPo implements Serializable{
	
	private static final long serialVersionUID = 2003165813757632168L;
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 邀请主题
	 */
	private String inviteTheme;
	/**
	 * 邀请内容
	 */
	private String inviteContent;
	/**
	 * 邀请时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date inviteTime;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;

	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getId() {
		return this.id;
	}
	public void setInviteTheme(String value) {
		this.inviteTheme = value;
	}
	public String getInviteTheme() {
		return this.inviteTheme;
	}
	
	public void setInviteTime(java.util.Date value) {
		this.inviteTime = value;
	}
	public java.util.Date getInviteTime() {
		return this.inviteTime;
	}
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public String getInviteContent() {
		return inviteContent;
	}
	public void setInviteContent(String inviteContent) {
		this.inviteContent = inviteContent;
	}

}

