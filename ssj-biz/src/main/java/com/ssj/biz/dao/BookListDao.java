package com.ssj.biz.dao;

import java.util.List;
import java.util.Map;

import com.ssj.common.db.annotation.MyBatisDao;
import com.ssj.common.po.BookListPo;
import com.ssj.common.vo.BookListVo;

/**
 * 
 * BookList
 * @author zhiya.chai
 * 2018-07-02 24:10:01
 */
@MyBatisDao
public interface BookListDao {
	public int insert(BookListPo o);
	
	public int update(BookListPo o);
	
	public void delete(Integer id);
	
	public BookListVo getById(Integer id);
	
	public List<BookListVo> findByMap(Map<String, Object> map);
}
