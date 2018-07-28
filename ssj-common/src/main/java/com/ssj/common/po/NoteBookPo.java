package com.ssj.common.po;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 随手记
 * NoteBook
 * @author zhiya.chai
 * 2018-07-02 24:10:02
 */
public class NoteBookPo implements Serializable{
	private static final long serialVersionUID = -5508762940114174997L;
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 用户Id
	 */
	private Integer userInfoId;
	/**
	 * 标题
	 */
	private String noteTitle;
	/**
	 * 角色，1：本人，2：家人，3：朋友，4：其他
	 */
	private Integer noteRole;
	/**
	 * 类别：1：结婚纪念日，2：生日，3：其他
	 */
	private Integer noteType;
	/**
	 * 重复：1：只记录一次，2：每年，3：农历每年，4：每月，5：每周，6：每天
	 */
	private Integer noteRepeat;
	/**
	 * 提醒：1：无，2,：准时，3：提前一天，4：提前一周
	 */
	private Integer noteRemind;
	/**
	 * 不再提醒：0：否，1：是
	 */
	private Integer notRemind;
	/**
	 * 事件日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")  
	private java.util.Date noteDate;
	/**
	 * 事件等级：1到5级
	 */
	private Integer noteLevel;
	/**
	 * 事件地址
	 */
	private String noteAddress;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;
	/**
	 * 更新日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date updateTime;

	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getId() {
		return this.id;
	}
	public void setNoteTitle(String value) {
		this.noteTitle = value;
	}
	public String getNoteTitle() {
		return this.noteTitle;
	}
	public void setNoteRole(Integer value) {
		this.noteRole = value;
	}
	public Integer getNoteRole() {
		return this.noteRole;
	}
	public void setNoteType(Integer value) {
		this.noteType = value;
	}
	public Integer getNoteType() {
		return this.noteType;
	}
	public void setNoteRepeat(Integer value) {
		this.noteRepeat = value;
	}
	public Integer getNoteRepeat() {
		return this.noteRepeat;
	}
	public void setNoteRemind(Integer value) {
		this.noteRemind = value;
	}
	public Integer getNoteRemind() {
		return this.noteRemind;
	}
	public void setNotRemind(Integer value) {
		this.notRemind = value;
	}
	public Integer getNotRemind() {
		return this.notRemind;
	}
	public void setNoteDate(java.util.Date value) {
		this.noteDate = value;
	}
	public java.util.Date getNoteDate() {
		return this.noteDate;
	}
	public void setNoteLevel(Integer value) {
		this.noteLevel = value;
	}
	public Integer getNoteLevel() {
		return this.noteLevel;
	}
	public void setNoteAddress(String value) {
		this.noteAddress = value;
	}
	public String getNoteAddress() {
		return this.noteAddress;
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
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}

}

