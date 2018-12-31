package com.travel.member.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.travel.member.user.dto.UserDTO;
import com.travel.member.user.service.UserService;
import com.travel.paging.PageMaker;

@Controller
@RequestMapping(value = "/Travel")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/userAdd", method = RequestMethod.GET)
	public String userAdd() {
		System.out.println("user 회원가입 창으로 이동......UserController.java");
		return "thymeleaf/member/user/userAdd";
	}

	@RequestMapping(value = "/userAdd", method = RequestMethod.POST)
	public String userAdd(UserDTO userDTO, 
			@RequestParam(value = "interest", required=false) String[] interest, 
			@RequestParam(value = "language", required=false) String[] language, 
			@RequestParam(value = "location", required=false) String[] location) {
		System.out.println("user 회원가입 액션......UserController.java");
		int result = userService.userAdd(userDTO, interest, language, location);

		if(result==0) {
			System.out.println("회원가입실패");
			return "thymeleaf/member/user/userAdd";
		}else {
			if(result == 1) {
				System.out.println("회원가입성공 (이미지없음)");
			} else if(result == 2) {
				System.out.println("회원가입성공 (이미지있음)");
			}
			return "thymeleaf/login/login";
		}
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin() {
		System.out.println("user 로그인창으로 이동......UserController.java");
		return "member/userLogin";
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String userLogin(HttpSession session, UserDTO userDTO) {
		System.out.println("user 로그인 액션......UserController.java");
		
		int result = userService.userLogin(userDTO);
		if(result == 1) {
			System.out.println("로그인 성공......UserController.java");
			session.setAttribute("LOGINID", userDTO.getUser_id());
			return "thymeleaf/index"; 
		}else {
			System.out.println("로그인 실패");
			return "thymeleaf/login/login";
		}
	}
	
	@RequestMapping(value = "/userLogout", method = RequestMethod.GET)
	public String userLogout(HttpSession session) {
		System.out.println("user 로그아웃 액션......UserController.java");
		session.invalidate();
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/userGetInfo", method = RequestMethod.GET)
	public String userGetInfo(HttpSession session, Model model) {
		System.out.println("user 내정보 보기......UserController.java");
		String user_id = session.getAttribute("LOGINID").toString();
		model.addAttribute("userDTO", userService.userGetInfo(user_id));
		return "thymeleaf/member/user/userGetInfo";
	}
		
	@RequestMapping(value = "/userUpdate", method = RequestMethod.POST)
	public String userUpdate(Model model, UserDTO userDTO) {
		System.out.println("user 업데이트 이동......UserController.java");
		model.addAttribute("userDTO", userDTO);
		return "thymeleaf/member/user/userUpdate";
	}
	
	@RequestMapping(value = "/userUpdateAction", method = RequestMethod.POST)
	public String userUpdateAction(UserDTO userDTO) {
		System.out.println("user 업데이트 액션......UserController.java");
		int result = userService.userUpdate(userDTO);
		if(result==1) {
			System.out.println("user 업데이트성공 ......UserController.java");
		}else {
			System.out.println("user 업데이트실패 ......UserController.java");
		}
		return "member/userGetInfo";
	}
	
	@RequestMapping(value = "/userAuth", method = RequestMethod.GET)
	public String userAuth(@RequestParam(value = "user_id") String user_id,HttpSession session) {
		System.out.println("user 인증신청......UserController.java");
		String admin_id = (String) session.getAttribute("LOGINID");
		
		int result = userService.userAuth(user_id, admin_id);
		if(result==1) {
			System.out.println("user 인증신청성공 ......UserController.java");
		}else {
			System.out.println("user 인증신청실패 ......UserController.java");
		}
		return "redirect:/Travel/userList";
	}

	@RequestMapping(value = "/userDelete", method = RequestMethod.GET)
	public String userDelete(@RequestParam(value = "user_id") String user_id) {
		System.out.println("user 탈퇴......UserController.java");
		int result = userService.userDelete(user_id);
		if(result==1) {
			System.out.println("user 탈퇴성공 ......UserController.java");
		}else {
			System.out.println("user 탈퇴실패 ......UserController.java");
		}
		return "redirect:/thymeleaf/index";
	}
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String userList(@RequestParam(value="currentPage", defaultValue = "1") int currentPage, Model model,PageMaker pageMaker) {
		System.out.println("user 회원리스트......UserController.java");
		pageMaker.setCurrentPage(currentPage);
		List<UserDTO> userList = userService.userList(pageMaker);
		model.addAttribute("userList", userList);
		model.addAttribute("currentPage", currentPage);
        model.addAttribute("pagePerBlock", pageMaker.getPagePerBlock());
        model.addAttribute("currentBlock", pageMaker.getCurrentBlock());
        model.addAttribute("startPage", pageMaker.getStartPage());
        model.addAttribute("endPage", pageMaker.getEndPage());
        model.addAttribute("prevPage", pageMaker.isPrevPage());
        model.addAttribute("nextPage", pageMaker.isNextPage());
		return "thymeleaf/list/userList";
	}

}
