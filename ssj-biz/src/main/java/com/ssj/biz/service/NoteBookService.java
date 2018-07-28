package com.ssj.biz.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssj.biz.dao.NoteBookDao;
import com.ssj.common.db.PageData;
import com.ssj.common.enums.ErrorCode;
import com.ssj.common.exception.SsjException;
import com.ssj.common.po.NoteBookPo;
import com.ssj.common.vo.NoteBookVo;


/**
 * 随手记
 * NoteBook
 * @author zhiya.chai
 * 2018-07-02 24:10:02
 */
@Service
public class NoteBookService extends BaseService{
	
	@Autowired
	private NoteBookDao noteBookDao;
	
	/**
	 * 分页查找随手记内容
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageData<NoteBookVo> findByMap(Map<String, Object> map, int pageNo, int pageSize) {
		Page<?> page = PageHelper.startPage(pageNo, pageSize, true);
		List<NoteBookVo> list = noteBookDao.findByMap(map);
		return new PageData<>(page.getTotal(), page.getPages(), list);
	}
	/**
	 * 根据Id查找随手记内容
	 * @param id
	 * @return
	 */
	public NoteBookVo getById(int id) {
		return noteBookDao.getById(id);
	}
	/**
	 * 编辑随手记
	 * @param noteBooke
	 * @return
	 */
	public NoteBookVo editNoteBooke(NoteBookVo noteBook) {
		NoteBookPo noteBookPo = new NoteBookPo();
		BeanUtils.copyProperties(noteBook, noteBookPo);
		int n = -1;
		if(noteBookPo.getId() == null) {
			n = noteBookDao.insert(noteBookPo);
		} else {
			n = noteBookDao.update(noteBookPo);
		}
		if(n <= 0){
			throw new SsjException(ErrorCode.EDIT_ERROR);
		} else {
			noteBook.setId(noteBookPo.getId());
			return noteBook;
		}
	}
	
}
