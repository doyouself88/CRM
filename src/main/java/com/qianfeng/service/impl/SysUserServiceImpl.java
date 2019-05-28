package com.qianfeng.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.qianfeng.entity.SysUser;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.SysUserDao;
import com.qianfeng.service.SysUserService;
import com.qianfeng.vo.VSysUser;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class SysUserServiceImpl implements SysUserService {

	@Resource
	private SysUserDao sysUserDao;

	/**
	 * 增加
	 */
	@Override
	public SysUser add(SysUser sysUser) {
		sysUserDao.add(sysUser);
		return sysUser;
	}

	/**
	 * 修改
	 */
	@Override
	public void update(SysUser sysUser) {
		sysUserDao.update(sysUser);
	}

	/**
	 * 删除
	 */
	@Override
	public void remove(String usrId) {
		sysUserDao.remove(usrId);
	}

	/**
	 * 根据ID查询
	 */
	@Override
	public SysUser getByUsrId(String usrId) {
		return sysUserDao.getByUsrId(usrId);
	}

	/**
	 * 
	 */
	@Override
	public SysUser selectByName(String usrName, String usrPassword) {
		// TODO Auto-generated method stub
		SysUser user = sysUserDao.selectByName(usrName);

		if (null == user) {
			throw new RuntimeException("用户名错误");
		}
		if (!user.getUsrPassword().equals(usrPassword)) {

			throw new RuntimeException("密码错误");

		}
		return user;
	}

	/**
	 * 
	 */
	@Override
	public Map<String, Object> findByPage(int page) {
		// TODO Auto-generated method stub
		//参数一：页码   参数二：每页数据条数
		PageHelper.startPage(page, 5);
		List<VSysUser> list = sysUserDao.selectAll();
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("total", ((Page)list).getTotal());
		
		map.put("rows", list);
		return map;
	}

	@Override
	public void importUserInfo(List<SysUser> users) {
		// TODO Auto-generated method stub
		
		sysUserDao.insertUsers(users);
		
	}

}
