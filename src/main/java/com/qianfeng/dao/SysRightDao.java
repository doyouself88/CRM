package com.qianfeng.dao;

import com.qianfeng.entity.SysRight;
import com.qianfeng.vo.VMenuInfo;
import com.qianfeng.vo.VTreeInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SysRightDao {

    /**
     * 增加
     */
	String add(SysRight sysRight);

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
	
	 // 根据角色id，获取菜单信息
    public List<VMenuInfo> selectMenu(Integer roleId);
    
    //获取所有节点
    public List<VTreeInfo> selectAllTreeNode();
    
    //获取某个角色分配的权限id
    public List<Integer> selectCheckNodeId(Integer roleId);

    
    public void deleteById(Integer roleId);
    
    public void insertRoleAndRight(@Param("roleId")Integer roleId, @Param("rightIds")Integer[] rightIds);
}
