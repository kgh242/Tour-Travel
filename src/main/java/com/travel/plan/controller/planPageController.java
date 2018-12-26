package com.travel.plan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class planPageController {
	@RequestMapping("planList")
	public String planList() {
		System.out.println("planList 출력");
		return "thymeleaf/plan/planList";
	}
	
	@RequestMapping("plan")
	public String plan(){
		System.out.println("plan 출력");
		return "thymeleaf/plan/plan";
	}
}
