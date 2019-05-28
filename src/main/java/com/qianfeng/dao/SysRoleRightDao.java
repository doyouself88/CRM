package com.qianfeng.dao;

import com.qianfeng.entity.SysRoleRight;
import org.springframework.stereotype.Repository;


@Repository
public interface SysRoleRightDao {

    /**
     * 增加
     */
	String add(SysRoleRight sysRoleRight);

    /**
     * 修改
     */
    void update(SysRoleRight sysRoleRight);

    /**
     * 删除
     */
    void remove(String rfId);

    /**
     * 根据ID查询
     */
	SysRoleRight getByRfId(String rfId);

}
