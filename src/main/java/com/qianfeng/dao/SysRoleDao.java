package com.qianfeng.dao;

import com.qianfeng.entity.SysRole;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface SysRoleDao {

    /**
     * 增加
     */
	String add(SysRole sysRole);

    /**
     * 修改
     */
    void update(SysRole sysRole);

    /**
     * 删除
     */
    void remove(String rileId);

    /**
     * 根据ID查询
     */
	SysRole getByRileId(String rileId);
	
	List<SysRole> selectRole();

}
