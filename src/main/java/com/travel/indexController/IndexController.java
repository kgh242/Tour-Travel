package com.travel.indexController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//인덱스 컨트롤러

@Controller

public class IndexController {
	@RequestMapping("index")
	public String index() {
		System.out.println("Index 나타남");
		return "thymeleaf/index";
	}
}
