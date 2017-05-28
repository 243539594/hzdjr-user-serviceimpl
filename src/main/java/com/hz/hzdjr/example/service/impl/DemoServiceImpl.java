package com.hz.hzdjr.example.service.impl;

import org.springframework.stereotype.Service;

import com.hz.hzdjr.example.service.DemoService;


/**
 * 演示示例服务类
 * @author lch 2016-05-16
 * @version 1.0
 *
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
	/**
	 * 演示信息
	 * @return
	 */
	public String showMessage() {
		return "汇中网贷演示页!演示时间："+System.currentTimeMillis();
	}
	/**
	 * 演示信息(参数)
	 * @param param SessionId
	 * @return
	 */
	public String showParamsMessage(String param) {
		return "汇中网贷演示页!"+param+"演示时间："+System.currentTimeMillis();
	}
}
