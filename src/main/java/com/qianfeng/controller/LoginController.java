package com.qianfeng.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.common.CommonInfo;
import com.qianfeng.entity.SysUser;
import com.qianfeng.service.SysUserService;
import com.qianfeng.vo.JsonBean;

/**
 * @author 张毅
 *
 * @date 2019年5月21日下午2:12:29
 */
@Controller
@ResponseBody
public class LoginController {

	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/login.do")
	public JsonBean login(String usrName, String usrPassword, HttpSession session) {
		SysUser sysUser = sysUserService.selectByName(usrName, usrPassword);
		session.setAttribute(CommonInfo.LOGIN_USER, sysUser);
		return new JsonBean(1, null);
		
		
	}
}
