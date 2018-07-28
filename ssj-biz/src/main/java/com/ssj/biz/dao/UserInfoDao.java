package com.ssj.biz.dao;

import java.util.List;
import java.util.Map;

import com.ssj.common.db.annotation.MyBatisDao;
import com.ssj.common.po.UserInfoPo;

/**
 * 
 * UserInfo
 * @author zhiya.chai
 * 2018-07-02 24:10:02
 */
@MyBatisDao
public interface UserInfoDao {
	public int insert(UserInfoPo o);
	
	public int update(UserInfoPo o);
	
	public void delete(Integer id);
	
	public UserInfoPo getById(Integer id);
	
	public List<UserInfoPo> select(Map<String, Object> map);
}
