package com.qianfeng.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qianfeng.entity.SysUser;
import com.qianfeng.service.SysUserService;
import com.qianfeng.utils.ExcelUtils;
import com.qianfeng.vo.JsonBean;

@RestController
public class ImportController {

	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/import.do")
	public JsonBean importExcel(@RequestParam MultipartFile excelFile){
		
		
		try {
			// 获取上传文件的输入流
			InputStream inputStream = excelFile.getInputStream();
			// 获取上传文件的文件名
			String fileName = excelFile.getOriginalFilename();
			// 读取excel中内容，将数据保存到一个结构中
			List<Map<String, Object>> list = ExcelUtils.readExcel(fileName, inputStream);
			
			// 将数据转为json格式字符串
			ObjectMapper objMapper = new ObjectMapper();
			String jsonStr = objMapper.writeValueAsString(list);
			
			// 将json格式的字符串转为指定类型的对象
			List<SysUser> userList = objMapper.readValue(jsonStr, new TypeReference<List<SysUser>>() {});
			// 将数据导入数据库
			sysUserService.importUserInfo(userList);
			
			return new JsonBean(1, null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonBean(0, e.getMessage());
		}
		
		
	}
}
