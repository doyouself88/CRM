package com.qianfeng.service;


import com.qianfeng.entity.SysUser;
import com.qianfeng.vo.VSysUser;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface SysUserService {

    /**
     * 增加
     */
	SysUser add(SysUser sysUser);

    /**
     * 修改
     */
    void update(SysUser sysUser);

    /**
     * 删除
     */
    void remove(String usrId);

    /**
     * 根据ID查询
     */
	SysUser getByUsrId(String usrId);
	
	public SysUser selectByName(String usrName, String usrPassword);
	public Map<String, Object> findByPage(int page);

	public void importUserInfo(List<SysUser> users);
}
