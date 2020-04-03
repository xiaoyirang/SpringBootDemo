package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.UserDao;
import com.community.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(int id){
		Integer nid = Integer.valueOf(id);
		return userDao.getUserById(nid);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public int getUserCountByIdCard(String idcard) {
		return userDao.getUserCountByIdCard(idcard);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public List<User> getUsersByLimit(int start, int end) {
		return userDao.getUsersByLimit(start, end);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUser(int id) {
		return userDao.deleteUser(id);
	}

	@Override
	public int updatePassword(User user) {
		return userDao.updatePassword(user);
	}

	@Override
	public User getUserByidCardNum(String idCardNum) {
		return userDao.getUserByidCardNum(idCardNum);
	}

}
