package com.qianfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.service.SysRightService;
import com.qianfeng.vo.JsonBean;
import com.qianfeng.vo.VTreeInfo;

/**
 * @author 张毅
 *
 * @date 2019年5月22日下午3:09:54
 */
@Controller
@RequestMapping("/right")
@ResponseBody
public class RightController {
	
	@Autowired
	private SysRightService sysRightService;
	
	@RequestMapping("/tree.do")
	public JsonBean findTreeNodes(int roleId) {
		
		List<VTreeInfo> list = sysRightService.findTreeNode(roleId);
		
		return new JsonBean(1, list);
	}
	

}
