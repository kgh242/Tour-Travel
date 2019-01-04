package com.travel.member.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travel.member.user.service.UserService;

@RestController
@RequestMapping("/Travel")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/idChecker.do", method=RequestMethod.GET)
	public int idChecker(@RequestParam(value="inputId") String inputId) {
		return userService.idChecker(inputId); 
	}
	
}
