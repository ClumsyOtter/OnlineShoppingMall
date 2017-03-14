package com.onlinemall.content.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinemall.common.pojo.EasyUIDataTreeNode;
import com.onlinemall.content.service.ContentCategoryService;
import com.onlinemall.dao.TbContentCategoryMapper;
import com.onlinemall.pojo.TbContentCategory;
import com.onlinemall.pojo.TbContentCategoryExample;
import com.onlinemall.pojo.TbContentCategoryExample.Criteria;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	TbContentCategoryMapper tbContentCategoryMapper;

	@Override
	public List<EasyUIDataTreeNode> getCategoryList(long parentId) {
		List<EasyUIDataTreeNode> lists = new ArrayList<>();
		TbContentCategoryExample tbContentCategoryExample = new TbContentCategoryExample();
		// 设置查询条件
		Criteria criteria = tbContentCategoryExample.createCriteria();
		// 设置父节点
		criteria.andParentIdEqualTo(parentId);

		List<TbContentCategory> nodes = tbContentCategoryMapper.selectByExample(tbContentCategoryExample);
		// 转化结果
		for (TbContentCategory category : nodes) {
			EasyUIDataTreeNode easyUIDataTreeNode = new EasyUIDataTreeNode();
			easyUIDataTreeNode.setId(category.getId());
			easyUIDataTreeNode.setText(category.getName());
			easyUIDataTreeNode.setState(category.getIsParent() ? "closed" : "open");
			lists.add(easyUIDataTreeNode);
		}
		return lists;
	}

}
