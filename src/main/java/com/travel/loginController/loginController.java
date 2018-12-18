package com.travel.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//로그인 컨트롤러

@Controller
public class loginController {
	@RequestMapping("login")
	public String login() {
		System.out.println("user,company login창");
		return "thymeleaf/login";
	}
}
