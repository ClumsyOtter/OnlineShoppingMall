package com.onlinemall.content.service;

import java.util.List;

import com.onlinemall.common.pojo.EasyUIDataTreeNode;

public interface ContentCategoryService {
	public List<EasyUIDataTreeNode> getCategoryList(long parentId);
}
