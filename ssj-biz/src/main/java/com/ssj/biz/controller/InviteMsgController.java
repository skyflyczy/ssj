package com.ssj.biz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssj.biz.service.InviteMsgService;
import com.ssj.common.db.PageData;
import com.ssj.common.enums.ErrorCode;
import com.ssj.common.response.DataResponse;
import com.ssj.common.vo.InviteMsgVo;

/**
 * 邀请信息
 * @author zhiya.chai
 * @date 2018年7月3日 下午4:00:27
 */
@RestController
@RequestMapping("/invite")
public class InviteMsgController extends BaseController{
	
	@Autowired
	private InviteMsgService inviteMsgService;

	/**
	 * 分页查找邀请信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/page/list")
	public PageData<InviteMsgVo> findByMap(@RequestParam Map<String,Object> map,@RequestParam int pageNo, @RequestParam int pageSize) {
		log.info("分页查找邀请信息，pageNo:"+pageNo+",pageSize:"+pageSize);
		return inviteMsgService.findByMap(map, pageNo, pageSize);
	}
	/**
	 * 根据Id查找邀请信息
	 * @param id
	 * @return
	 */
	@GetMapping("/getById")
	public InviteMsgVo getById(@RequestParam int id) {
		return inviteMsgService.getById(id);
	}
	
	/**
	 * 编辑邀请信息
	 * @param inviteMsg
	 * @return
	 */
	@PostMapping("/editInviteMsg")
	public DataResponse<InviteMsgVo> editInviteMsg(@RequestBody InviteMsgVo inviteMsg) {
		log.info("调用编辑邀请信息...");
		InviteMsgVo newInviteMsg = inviteMsgService.editInviteMsg(inviteMsg);
		DataResponse<InviteMsgVo> dataResponse = DataResponse.create();
		return dataResponse.setErrorCode(ErrorCode.SUCCESS).setData(newInviteMsg);
	}
}
