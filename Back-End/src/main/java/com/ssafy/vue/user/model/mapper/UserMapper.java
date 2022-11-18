package com.ssafy.vue.user.model.mapper;

import java.sql.SQLException;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.user.model.UserDto;

@Mapper
public interface UserMapper {
	
	int checkID(String userId) throws SQLException;

	String findPass(Map<String, Object> map) throws SQLException;

	int joinUser(UserDto userDto) throws SQLException;

	UserDto loginUser(Map<String, Object> map) throws SQLException;

	int modifyUser(UserDto userDto) throws SQLException;

	int deleteUser(String userId) throws SQLException;

}