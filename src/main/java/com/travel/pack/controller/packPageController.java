package com.travel.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class packPageController {
	@RequestMapping("packList")
	public String packList() {
		System.out.println("packList page");
		return "thymeleaf/pack/packList";
	}
}
