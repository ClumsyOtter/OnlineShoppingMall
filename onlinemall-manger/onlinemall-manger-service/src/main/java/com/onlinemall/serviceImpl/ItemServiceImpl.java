package com.onlinemall.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.onlinemall.common.pojo.EasyUIDataGridResult;
import com.onlinemall.dao.TbItemMapper;
import com.onlinemall.pojo.TbItem;
import com.onlinemall.pojo.TbItemExample;
import com.onlinemall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById(long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		PageHelper.startPage(page, rows);
		TbItemExample tbItemExample = new TbItemExample();
		List<TbItem> selectByExample = tbItemMapper.selectByExample(tbItemExample);
		PageInfo<TbItem> pageInfo = new PageInfo<>(selectByExample);
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult();
		easyUIDataGridResult.setTotal(pageInfo.getTotal());
		easyUIDataGridResult.setRows(pageInfo.getList());
		return easyUIDataGridResult;
	}

}
