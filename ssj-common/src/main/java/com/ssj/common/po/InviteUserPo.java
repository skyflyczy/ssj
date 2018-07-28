package com.ssj.common.po;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 邀请用户
 * InviteUser
 * @author zhiya.chai
 * 2018-07-02 24:10:02
 */
public class InviteUserPo {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 邀请用户Id
	 */
	private Integer inviteUserId;
	/**
	 * 邀请信息Id
	 */
	private Integer inviteMsgId;
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
	public void setInviteUserId(Integer value) {
		this.inviteUserId = value;
	}
	public Integer getInviteUserId() {
		return this.inviteUserId;
	}
	public void setInviteMsgId(Integer value) {
		this.inviteMsgId = value;
	}
	public Integer getInviteMsgId() {
		return this.inviteMsgId;
	}
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}

}

