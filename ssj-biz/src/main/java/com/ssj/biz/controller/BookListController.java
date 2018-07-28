package com.ssj.biz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssj.biz.service.BookListService;
import com.ssj.common.db.PageData;
import com.ssj.common.enums.ErrorCode;
import com.ssj.common.response.DataResponse;
import com.ssj.common.vo.BookListVo;
/**
 * 礼单簿
 * @author zhiya.chai
 * @date 2018年7月3日 下午5:01:44
 */
@RestController
@RequestMapping("/bookList")
public class BookListController extends BaseController{

	@Autowired
	private BookListService bookListService;
	
	/**
	 * 分页查找礼单簿信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/page/list")
	public PageData<BookListVo> findByMap(@RequestParam Map<String,Object> map,@RequestParam int pageNo, @RequestParam int pageSize) {
		log.info("分页查找礼单簿信息，pageNo:"+pageNo+",pageSize:"+pageSize);
		return bookListService.findByMap(map, pageNo, pageSize);
	}
	
	/**
	 * 根据Id查找礼单簿信息
	 * @param id
	 * @return
	 */
	@GetMapping("/getById")
	public BookListVo getById(@RequestParam int id) {
		return bookListService.getById(id);
	}
	/**
	 * 编辑礼单簿信息
	 * @param bookList
	 * @return
	 */
	public DataResponse<BookListVo> editBookList(@RequestBody BookListVo bookList) {
		log.info("分页编辑礼单簿信息...");
		BookListVo newBookList = bookListService.editBookList(bookList);
		DataResponse<BookListVo> dataResponse = DataResponse.create();
		return dataResponse.setErrorCode(ErrorCode.SUCCESS).setData(newBookList);
	}
}
