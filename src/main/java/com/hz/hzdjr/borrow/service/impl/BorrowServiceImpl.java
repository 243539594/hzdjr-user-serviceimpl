package com.hz.hzdjr.borrow.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.hz.hzdjr.borrow.service.BorrowService;
import com.hz.hzdjr.example.service.DemoService;


/**
 * 演示示例服务类
 * @author lch 2016-05-16
 * @version 1.0
 *
 */
@Service("borrowService")
public class BorrowServiceImpl implements BorrowService {

	@Override
	public String getTime() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date();
		return dateFormater.format(date);
	}
}
