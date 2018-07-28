package com.ssj.biz.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssj.biz.dao.BookListDao;
import com.ssj.common.db.PageData;
import com.ssj.common.enums.ErrorCode;
import com.ssj.common.exception.SsjException;
import com.ssj.common.po.BookListPo;
import com.ssj.common.vo.BookListVo;


/**
 * 礼单簿
 * BookList
 * @author zhiya.chai
 * 2018-07-02 24:10:01
 */
@Service
public class BookListService extends BaseService{
	
	@Autowired
	private BookListDao bookListDao;
	/**
	 * 分页查找礼单簿信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageData<BookListVo> findByMap(Map<String, Object> map, int pageNo, int pageSize) {
		Page<?> page = PageHelper.startPage(pageNo, pageSize, true);
		List<BookListVo> list = bookListDao.findByMap(map);
		return new PageData<>(page.getTotal(), page.getPages(), list);
	}
	/**
	 * 根据Id查找礼单簿信息
	 * @param id
	 * @return
	 */
	public BookListVo getById(int id){
		return bookListDao.getById(id);
	}
	/**
	 * 编辑礼单簿信息
	 * @param bookList
	 * @return
	 */
	public BookListVo editBookList(BookListVo bookList) {
		BookListPo bookListPo = new BookListPo();
		BeanUtils.copyProperties(bookList, bookListPo);
		int n = -1;
		if(bookListPo.getId() == null) {
			n = bookListDao.insert(bookListPo);
		} else {
			n = bookListDao.update(bookListPo);
		}
		if(n <= 0) {
			throw new SsjException(ErrorCode.EDIT_ERROR);
		}
		bookList.setId(bookListPo.getId());
		return bookList;
	}
}
