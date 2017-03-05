package com.onlinemall.service;

import com.onlinemall.common.pojo.EasyUIDataGridResult;
import com.onlinemall.pojo.TbItem;

public interface ItemService {
	public TbItem getItemById(long id);
	public EasyUIDataGridResult getItemList(int page,int rows);
}
