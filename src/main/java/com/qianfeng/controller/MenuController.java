package com.qianfeng.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.common.CommonInfo;
import com.qianfeng.entity.SysUser;
import com.qianfeng.service.SysRightService;
import com.qianfeng.vo.JsonBean;
import com.qianfeng.vo.VMenuInfo;

//@Controller
//@ResponseBody

@RestController
public class MenuController {

	@Autowired
	private SysRightService rightService;
	
	@RequestMapping("/menu.do")
	public JsonBean menu(HttpSession session){
		
		SysUser user = (SysUser)session.getAttribute(CommonInfo.LOGIN_USER);
		if(user == null){
			return new JsonBean(0, "还未登陆");
		}
		List<VMenuInfo> list = rightService.findMenu(user.getUsrRoleId());
		for (VMenuInfo vMenuInfo : list) {
			System.out.println(vMenuInfo.getMenuName());
			System.out.println(vMenuInfo.getMenuId());
			
		}
		
		return new JsonBean(1, list);
		
	}
}


	







     