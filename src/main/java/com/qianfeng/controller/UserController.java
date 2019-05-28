package com.qianfeng.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.service.SysUserService;
import com.qianfeng.vo.JsonBean;

/**
 * @author 张毅
 *
 * @date 2019年5月22日上午10:06:48
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/list.do")
	public JsonBean findUserByPage(int page) {
		Map<String, Object> map = sysUserService.findByPage(page);
		return new JsonBean(1, map);
	}

}
