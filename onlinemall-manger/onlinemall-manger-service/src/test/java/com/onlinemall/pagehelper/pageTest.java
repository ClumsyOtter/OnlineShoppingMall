package com.onlinemall.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.onlinemall.dao.TbItemMapper;
import com.onlinemall.pojo.TbItem;
import com.onlinemall.pojo.TbItemExample;

public class pageTest {

	@Test
	public void pagetest() {
		// 初始化page设置初始条件
		PageHelper.startPage(1, 10);
		// 执行查询
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-dao.xml");
		TbItemMapper tbItemMapper = ac.getBean(TbItemMapper.class);
		// 创建example对象
		TbItemExample tbItemExample = new TbItemExample();
		List<TbItem> selectByExample = tbItemMapper.selectByExample(tbItemExample);
		// 获取结果集
		PageInfo<TbItem> pageInfo = new PageInfo<>(selectByExample);
		System.out.println("页数" + pageInfo.getPageNum());
		System.out.println("总数" + pageInfo.getTotal());
	}
}
