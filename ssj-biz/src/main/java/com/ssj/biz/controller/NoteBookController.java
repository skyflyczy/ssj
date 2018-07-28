package com.ssj.biz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssj.biz.service.NoteBookService;
import com.ssj.common.db.PageData;
import com.ssj.common.enums.ErrorCode;
import com.ssj.common.response.DataResponse;
import com.ssj.common.vo.NoteBookVo;
/**
 * 随手记
 * @author zhiya.chai
 * @date 2018年7月3日 下午3:59:54
 */
@RestController
@RequestMapping("/noteBook")
public class NoteBookController extends BaseController{
	
	@Autowired
	private NoteBookService noteBookService;

	/**
	 * 分页查找随手记信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/page/list")
	public PageData<NoteBookVo> findByMap(@RequestParam Map<String,Object> map,@RequestParam int pageNo, @RequestParam int pageSize) {
		log.info("分页查找随手记信息，pageNo:"+pageNo+",pageSize:"+pageSize);
		return noteBookService.findByMap(map, pageNo, pageSize);
	}
	
	/**
	 * 根据Id查找随手记信息
	 * @param id
	 * @return
	 */
	@GetMapping("/getById")
	public NoteBookVo getById(@RequestParam int id) {
		return noteBookService.getById(id);
	}
	
	/**
	 * 编辑随手记信息
	 * @param noteBooke
	 * @return
	 */
	@PostMapping("/editNoteBooke")
	public DataResponse<NoteBookVo> editNoteBooke(@RequestBody NoteBookVo noteBook) {
		log.info("调用编辑随手记信息...");
		NoteBookVo newNoteBook = noteBookService.editNoteBooke(noteBook);
		DataResponse<NoteBookVo> dataResponse = DataResponse.create();
		return dataResponse.setErrorCode(ErrorCode.SUCCESS).setData(newNoteBook);
	} 
	
}
