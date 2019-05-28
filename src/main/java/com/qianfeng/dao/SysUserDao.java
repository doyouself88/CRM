package com.qianfeng.dao;

import com.qianfeng.entity.SysUser;
import com.qianfeng.vo.VSysUser;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface SysUserDao {

    /**
     * 增加
     */
	String add(SysUser sysUser);

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
	
	public SysUser selectByName(String usrName);
	public List<VSysUser> selectAll();

	// 插入多条用户数据
    public void insertUsers(List<SysUser> users);
}
