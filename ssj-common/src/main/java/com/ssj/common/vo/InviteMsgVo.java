package com.ssj.common.vo;

import java.util.ArrayList;
import java.util.List;

import com.ssj.common.po.InviteMsgPo;
import com.ssj.common.po.InviteUserPo;


/**
 * 邀请内容
 * InviteMsg
 * @author zhiya.chai
 * 2018-07-02 24:10:01
 */
public class InviteMsgVo extends InviteMsgPo{

	private static final long serialVersionUID = -5542185358021412693L;
	
	private String inviteUserIds;//邀请用户Id集合
	private List<InviteUserPo> inviteUserList = new ArrayList<InviteUserPo>();//邀请用户集合

	public String getInviteUserIds() {
		return inviteUserIds;
	}
	public void setInviteUserIds(String inviteUserIds) {
		this.inviteUserIds = inviteUserIds;
	}
	public List<InviteUserPo> getInviteUserList() {
		return inviteUserList;
	}
	public void setInviteUserList(List<InviteUserPo> inviteUserList) {
		this.inviteUserList = inviteUserList;
	}

}

