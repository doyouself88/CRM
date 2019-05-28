package com.qianfeng.service.impl;

import javax.annotation.Resource;

import com.qianfeng.entity.SysRoleRight;
import com.qianfeng.dao.SysRoleRightDao;
import com.qianfeng.service.SysRoleRightService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class SysRoleRightServiceImpl implements SysRoleRightService {

	@Resource
	private SysRoleRightDao sysRoleRightDao;

    /**
     * 增加
     */
	@Override
	public SysRoleRight add(SysRoleRight sysRoleRight) {
		sysRoleRightDao.add(sysRoleRight);
		return sysRoleRight;
	}

    /**
     * 修改
     */
	@Override
	public void update(SysRoleRight sysRoleRight) {
		sysRoleRightDao.update(sysRoleRight);
	}

    /**
     * 删除
     */
	@Override
	public void remove(String rfId) {
		sysRoleRightDao.remove(rfId);
	}

    /**
     * 根据ID查询
     */
	@Override
	public SysRoleRight getByRfId(String rfId) {
		return sysRoleRightDao.getByRfId(rfId);
	}

}
