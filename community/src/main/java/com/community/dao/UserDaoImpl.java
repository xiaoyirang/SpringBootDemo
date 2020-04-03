package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.User;
import com.community.mapper.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	@Override
	public User getUserByUsername(String username) {
		return userMapper.getUserByUsername(username);
	}

	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public int getUserCountByIdCard(String idcard) {
		return userMapper.getUserCountByIdCard(idcard);
	}

	@Override
	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}

	@Override
	public List<User> getUsersByLimit(int start, int end) {
		return userMapper.getUsersByLimit(start, end);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	@Override
	public int deleteUser(int id) {
		return userMapper.deleteUser(id);
	}

	@Override
	public int updatePassword(User user) {
		return userMapper.updatePassword(user);
	}

	@Override
	public User getUserByidCardNum(String idCardNum) {
		return userMapper.getUserByidCardNum(idCardNum);
	}

}
