package com.qianfeng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.qianfeng.entity.SysRole;
import com.qianfeng.dao.SysRoleDao;
import com.qianfeng.service.SysRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class SysRoleServiceImpl implements SysRoleService {

	@Resource
	private SysRoleDao sysRoleDao;

    /**
     * 增加
     */
	@Override
	public SysRole add(SysRole sysRole) {
		sysRoleDao.add(sysRole);
		return sysRole;
	}

    /**
     * 修改
     */
	@Override
	public void update(SysRole sysRole) {
		sysRoleDao.update(sysRole);
	}

    /**
     * 删除
     */
	@Override
	public void remove(String rileId) {
		sysRoleDao.remove(rileId);
	}

    /**
     * 根据ID查询
     */
	@Override
	public SysRole getByRileId(String rileId) {
		return sysRoleDao.getByRileId(rileId);
	}

	/**
	 * 
	 */
	@Override
	public List<SysRole> findRole() {
		// TODO Auto-generated method stub
		return sysRoleDao.selectRole();
	}

}
