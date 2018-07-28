package com.ssj.biz.dao;

import java.util.List;
import java.util.Map;

import com.ssj.common.db.annotation.MyBatisDao;
import com.ssj.common.po.InviteUserPo;

/**
 * 
 * InviteUser
 * @author zhiya.chai
 * 2018-07-02 24:10:02
 */
@MyBatisDao
public interface InviteUserDao {
	
	public void insertBatch(List<InviteUserPo> list);
	
	public void deleteByInviteMsgId(Integer inviteMsgId);
	
	public List<InviteUserPo> getInviteUserByMsgId(int inviteMsgId);
	public List<InviteUserPo> select(Map<String, Object> map);
}
