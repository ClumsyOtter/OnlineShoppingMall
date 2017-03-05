package com.onlinemall.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlinemall.common.pojo.EasyUIDataTreeNode;
import com.onlinemall.service.ItemCatService;

@Controller
public class ItemCatControl {

	@Autowired
	ItemCatService itemCatService;

	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<EasyUIDataTreeNode> getItemCat(@RequestParam(name = "id", defaultValue = "0") long parentId) {
		List<EasyUIDataTreeNode> itemCatList = itemCatService.getItemCatList(parentId);
		return itemCatList;
	}
}
