package com.travel.title;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//타이틀 컨트롤러

@Controller
public class TitleController {
	@RequestMapping("title")
	public String title() {
		System.out.println("Title 나타남");
		return "thymeleaf/title";
	}
}
