package com.qianfeng.service;


import com.qianfeng.entity.SysRoleRight;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleRightService {

    /**
     * 增加
     */
	SysRoleRight add(SysRoleRight sysRoleRight);

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
