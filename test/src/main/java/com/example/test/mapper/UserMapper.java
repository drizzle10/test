package com.example.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.vo.UserVO;

@Mapper
public interface UserMapper {
	int insertUser(UserVO userVO);
}
