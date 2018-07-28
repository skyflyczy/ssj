package com.ssj.biz.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssj.biz.dao.InviteMsgDao;
import com.ssj.biz.dao.InviteUserDao;
import com.ssj.common.db.PageData;
import com.ssj.common.enums.ErrorCode;
import com.ssj.common.exception.SsjException;
import com.ssj.common.po.InviteMsgPo;
import com.ssj.common.po.InviteUserPo;
import com.ssj.common.vo.InviteMsgVo;


/**
 * 邀请信息
 * InviteMsg
 * @author zhiya.chai
 * 2018-07-02 24:10:01
 */
@Service
public class InviteMsgService extends BaseService{
	
	@Autowired
	private InviteMsgDao inviteMsgDao;
	@Autowired
	private InviteUserDao inviteUserDao;
	/**
	 * 分页查找邀请信息
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageData<InviteMsgVo> findByMap(Map<String, Object> map, int pageNo, int pageSize) {
		Page<?> page = PageHelper.startPage(pageNo, pageSize, true);
		List<InviteMsgVo> list = inviteMsgDao.findByMap(map);
		return new PageData<>(page.getTotal(), page.getPages(), list);
	}
	/**
	 * 根据Id查找邀请信息
	 * @param id
	 * @return
	 */
	public InviteMsgVo getById(int id) {
		InviteMsgVo inviteMsg = inviteMsgDao.getById(id);
		List<InviteUserPo> inviteUserList = inviteUserDao.getInviteUserByMsgId(id);
		inviteMsg.setInviteUserList(inviteUserList);
		return inviteMsg;
	}
	/**
	 * 编辑邀请信息
	 * @param inviteMsg
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class)
	public InviteMsgVo editInviteMsg(InviteMsgVo inviteMsg) {
		InviteMsgPo inviteMsgPo = new InviteMsgPo();
		BeanUtils.copyProperties(inviteMsg, inviteMsgPo);
		int n = -1;
		if(inviteMsgPo.getId() == null) {
			log.info("添加邀请信息");
			n = inviteMsgDao.insert(inviteMsgPo);
		} else {
			log.info("更新邀请信息");
			n = inviteMsgDao.update(inviteMsgPo);
			log.info("删除邀请用户信息");
			inviteUserDao.deleteByInviteMsgId(inviteMsgPo.getId());
		}
		if(n <= 0) {
			throw new SsjException(ErrorCode.EDIT_ERROR);
		}
		log.info("添加邀请用户信息，用户Id集合：" + inviteMsg.getInviteUserIds());
		inviteMsg.setId(inviteMsgPo.getId());
		if(StringUtils.isBlank(inviteMsg.getInviteUserIds())) {
			return inviteMsg;
		}
		String[] userIds = inviteMsg.getInviteUserIds().split(",");
		List<InviteUserPo> inviteUserList = Arrays.asList(userIds).stream().map(userId ->{
			InviteUserPo inviteUser = new InviteUserPo();
			inviteUser.setInviteMsgId(inviteMsg.getId());
			inviteUser.setInviteUserId(Integer.parseInt(userId));
			return inviteUser;
		}).collect(Collectors.toList());
		if(CollectionUtils.isEmpty(inviteUserList)) {
			inviteUserDao.insertBatch(inviteUserList);
		}
		inviteMsg.setInviteUserList(inviteUserList);
		return inviteMsg;
	}
	
}
