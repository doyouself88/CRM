package com.qianfeng.service;


import com.qianfeng.entity.SysRight;
import com.qianfeng.vo.VMenuInfo;
import com.qianfeng.vo.VTreeInfo;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SysRightService {

    /**
     * 增加
     */
	SysRight add(SysRight sysRight);

    /**
     * 修改
     */
    void update(SysRight sysRight);

    /**
     * 删除
     */
    void remove(String rightId);

    /**
     * 根据ID查询
     */
	SysRight getByRightId(String rightId);
	
	public List<VMenuInfo> findMenu(int roleId);
	
	 
    //获取所有节点
    public List<VTreeInfo> findTreeNode(int roleId);
    
    //获取某个角色分配的权限id
//    public List<Integer> selectCheckNodeId(Integer roleId);


}
