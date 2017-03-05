package com.onlinemall.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlinemall.common.pojo.EasyUIDataGridResult;
import com.onlinemall.pojo.TbItem;
import com.onlinemall.service.ItemService;

@Controller
public class ItemControl {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId) {
		return itemService.getItemById(itemId);
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult list(Integer page, Integer rows) {
		EasyUIDataGridResult itemList = itemService.getItemList(page, rows);
		return itemList;
	}
}
