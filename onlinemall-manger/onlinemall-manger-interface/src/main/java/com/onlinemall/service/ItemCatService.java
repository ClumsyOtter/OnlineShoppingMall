package com.onlinemall.service;

import java.util.List;

import com.onlinemall.common.pojo.EasyUIDataTreeNode;

public interface ItemCatService {
	public List<EasyUIDataTreeNode> getItemCatList(long parentId);
}
