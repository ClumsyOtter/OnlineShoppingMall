package com.onlinemall.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinemall.common.pojo.EasyUIDataTreeNode;
import com.onlinemall.dao.TbItemCatMapper;
import com.onlinemall.pojo.TbItemCat;
import com.onlinemall.pojo.TbItemCatExample;
import com.onlinemall.pojo.TbItemCatExample.Criteria;
import com.onlinemall.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	TbItemCatMapper tbItemCatMapper;

	@Override
	public List<EasyUIDataTreeNode> getItemCatList(long parentId) {
		// 根据父节点id查询
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		// 设置查询条件
		criteria.andParentIdEqualTo(parentId);
		// 查询结果
		List<TbItemCat> selectByExample = tbItemCatMapper.selectByExample(example);
		// 将结果转为成easyUIDataTreeNode格式
		List<EasyUIDataTreeNode> dataTreeNodes = new ArrayList<>();
		for (TbItemCat tbItemCat : selectByExample) {
			EasyUIDataTreeNode easyUIDataTreeNode = new EasyUIDataTreeNode();
			easyUIDataTreeNode.setId(tbItemCat.getId());
			easyUIDataTreeNode.setState(tbItemCat.getIsParent() ? "closed" : "open");
			easyUIDataTreeNode.setText(tbItemCat.getName());
			dataTreeNodes.add(easyUIDataTreeNode);
		}
		return dataTreeNodes;
	}

}
