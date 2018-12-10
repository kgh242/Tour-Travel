package com.travel.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//패키지 기능 분배 컨트롤러

@Controller
public class PackController {
	@RequestMapping("/packAdd")
	public String packAdd() {
		return "pack/packAdd";
	}
	@RequestMapping("/packBook")
	public String packBook() {
		return "pack/packBook";
	}
	@RequestMapping("/packDetail")
	public String packDetail() {
		return "pack/packDetail";
	}
	@RequestMapping("/packDetailSchedule")
	public String packDetailSchedule() {
		return "pack/packDetailSchedule";
	}
}
