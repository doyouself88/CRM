package com.qianfeng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.qianfeng.entity.SysRight;
import com.qianfeng.dao.SysRightDao;
import com.qianfeng.service.SysRightService;
import com.qianfeng.vo.VMenuInfo;
import com.qianfeng.vo.VTreeInfo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class SysRightServiceImpl implements SysRightService {

	@Resource
	private SysRightDao sysRightDao;

	/**
	 * 增加
	 */
	@Override
	public SysRight add(SysRight sysRight) {
		sysRightDao.add(sysRight);
		return sysRight;
	}

	/**
	 * 修改
	 */
	@Override
	public void update(SysRight sysRight) {
		sysRightDao.update(sysRight);
	}

	/**
	 * 删除
	 */
	@Override
	public void remove(String rightId) {
		sysRightDao.remove(rightId);
	}

	/**
	 * 根据ID查询
	 */
	@Override
	public SysRight getByRightId(String rightId) {
		return sysRightDao.getByRightId(rightId);
	}

	/**
	 * 
	 */
	@Override
	public List<VMenuInfo> findMenu(int roleId) {
		// TODO Auto-generated method stub
		return sysRightDao.selectMenu(roleId);
	}

	/**
	 * 
	 */
	@Override
	public List<VTreeInfo> findTreeNode(int roleId) {
		// TODO Auto-generated method stub

		List<VTreeInfo> list = sysRightDao.selectAllTreeNode();
		List<Integer> clist = sysRightDao.selectCheckNodeId(roleId);
		
		if (clist != null) {
			for (VTreeInfo info : list) {
				if (clist.contains(info.getRightId())) {
					info.setChecked(true);
				}
			}
		}
		return list;
	}

}
