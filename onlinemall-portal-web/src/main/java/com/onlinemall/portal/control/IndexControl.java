package com.onlinemall.portal.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControl {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
