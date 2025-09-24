package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.UserMapper;
import com.example.test.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public int insertUser(UserVO userVO) throws Exception {
		System.out.println("오나2");
		return userMapper.insertUser(userVO);
	}
}
