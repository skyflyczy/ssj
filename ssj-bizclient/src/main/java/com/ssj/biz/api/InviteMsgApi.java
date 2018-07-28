package com.ssj.biz.api;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssj.common.db.PageData;
import com.ssj.common.response.DataResponse;
import com.ssj.common.vo.InviteMsgVo;

/**
 * 邀请信息
 * @author zhiya.chai
 * @date 2018年7月3日 下午4:00:27
 */
@FeignClient(value = "ssj-biz",path="/invite")
public interface InviteMsgApi{
	

	/**
	 * 分页查找邀请信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(path="/page/list", method= RequestMethod.GET)
	public PageData<InviteMsgVo> findByMap(@RequestParam("map") Map<String,Object> map,@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize);
	/**
	 * 根据Id查找邀请信息
	 * @param id
	 * @return
	 */
	@RequestMapping(path="/getById", method= RequestMethod.GET)
	public InviteMsgVo getById(@RequestParam("id") int id);
	
	/**
	 * 编辑邀请信息
	 * @param inviteMsg
	 * @return
	 */
	@RequestMapping(path="/editInviteMsg", method= RequestMethod.POST)
	public DataResponse<InviteMsgVo> editInviteMsg(@RequestBody InviteMsgVo inviteMsg);
}
