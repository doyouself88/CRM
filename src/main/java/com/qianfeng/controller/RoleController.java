package com.qianfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.entity.SysRole;
import com.qianfeng.service.SysRoleService;
import com.qianfeng.vo.JsonBean;

/**
 * @author 张毅
 *
 * @date 2019年5月22日下午2:27:15
 */
@Controller
@ResponseBody
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private SysRoleService sysRoleService;
	
	@RequestMapping("/list.do")
	public JsonBean findAllRole() {
		List<SysRole> list = sysRoleService.findRole();
		return new JsonBean(1, list);
	}
}
