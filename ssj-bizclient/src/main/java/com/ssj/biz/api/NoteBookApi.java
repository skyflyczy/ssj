package com.ssj.biz.api;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssj.common.db.PageData;
import com.ssj.common.response.DataResponse;
import com.ssj.common.vo.NoteBookVo;
/**
 * 随手记
 * @author zhiya.chai
 * @date 2018年7月3日 下午3:59:54
 */
@FeignClient(value = "ssj-biz",path="/noteBook")
public interface NoteBookApi{

	/**
	 * 分页查找随手记信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(path="/page/list", method= RequestMethod.GET)
	public PageData<NoteBookVo> findByMap(@RequestParam("map") Map<String,Object> map,@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize);
	
	/**
	 * 根据Id查找随手记信息
	 * @param id
	 * @return
	 */
	@GetMapping("/getById")
	public NoteBookVo getById(@RequestParam("id") int id);
	
	/**
	 * 编辑随手记信息
	 * @param noteBooke
	 * @return
	 */
	@RequestMapping(value = "/editNoteBooke", method = RequestMethod.POST)
	public DataResponse<NoteBookVo> editNoteBooke(@RequestBody NoteBookVo noteBook);
	
}
