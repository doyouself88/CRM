package com.qianfeng.vo;

/**
 * 将返回的数据封装到该类中
 * 
 * @author 张毅
 *
 * @date 2019年4月20日下午4:30:35
 */
public class JsonBean {
	
	//状态：1，成功；0，失败
	private int code;

	//返回的数据
	private Object info;

	@Override
	public String toString() {
		return "JsonBean [code=" + code + ", info=" + info + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public JsonBean(int code, Object info) {
		super();
		this.code = code;
		this.info = info;
	}

	
}
