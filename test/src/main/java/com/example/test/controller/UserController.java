package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test.service.UserService;
import com.example.test.vo.UserVO;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/signUp")
	public String signUp() throws Exception {
		System.out.println("오나");
		return "signUp";
	}
	
	@PostMapping("/signUp/save")
	public String save(@ModelAttribute UserVO userVO) throws Exception{
		int insertUser = userService.insertUser(userVO);
		if(insertUser > 0) {
			System.out.println("완료");
		} else {
			System.out.println("실패");
		}
		return "/";
	}
}
