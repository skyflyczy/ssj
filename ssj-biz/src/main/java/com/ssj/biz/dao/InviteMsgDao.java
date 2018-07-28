package com.ssj.biz.dao;

import java.util.List;
import java.util.Map;

import com.ssj.common.db.annotation.MyBatisDao;
import com.ssj.common.po.InviteMsgPo;
import com.ssj.common.vo.InviteMsgVo;

/**
 * 
 * InviteMsg
 * @author zhiya.chai
 * 2018-07-02 24:10:01
 */
@MyBatisDao
public interface InviteMsgDao {
	public int insert(InviteMsgPo o);
	
	public int update(InviteMsgPo o);
	
	public void delete(Integer id);
	
	public InviteMsgVo getById(Integer id);
	
	public List<InviteMsgVo> findByMap(Map<String, Object> map);
}
