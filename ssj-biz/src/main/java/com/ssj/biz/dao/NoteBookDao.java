package com.ssj.biz.dao;

import java.util.List;
import java.util.Map;

import com.ssj.common.db.annotation.MyBatisDao;
import com.ssj.common.po.NoteBookPo;
import com.ssj.common.vo.NoteBookVo;

/**
 * 
 * NoteBook
 * @author zhiya.chai
 * 2018-07-02 24:10:02
 */
@MyBatisDao
public interface NoteBookDao {
	
	public int insert(NoteBookPo o);
	
	public int update(NoteBookPo o);
	
	public void delete(Integer id);
	
	public NoteBookVo getById(Integer id);
	
	public List<NoteBookVo> findByMap(Map<String, Object> map);
}
