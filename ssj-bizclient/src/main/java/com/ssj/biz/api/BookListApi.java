package com.ssj.biz.api;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssj.common.db.PageData;
import com.ssj.common.response.DataResponse;
import com.ssj.common.vo.BookListVo;
/**
 * 礼单簿
 * @author zhiya.chai
 * @date 2018年7月3日 下午5:01:44
 */
@FeignClient(value = "ssj-biz",path="/bookList")
public interface BookListApi{

	
	/**
	 * 分页查找礼单簿信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(path="/page/list", method= RequestMethod.GET)
	public PageData<BookListVo> findByMap(@RequestParam("map") Map<String,Object> map,@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize);
	
	/**
	 * 根据Id查找礼单簿信息
	 * @param id
	 * @return
	 */
	@RequestMapping(path="/getById", method= RequestMethod.GET)
	public BookListVo getById(@RequestParam("id") int id);
	/**
	 * 编辑礼单簿信息
	 * @param bookList
	 * @return
	 */
	@RequestMapping(value = "/editBookList", method = RequestMethod.POST)
	public DataResponse<BookListVo> editBookList(@RequestBody BookListVo bookList);
}
