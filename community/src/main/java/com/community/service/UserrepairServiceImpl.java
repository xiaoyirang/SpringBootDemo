package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.UserrepairDao;
import com.community.entity.Userrepair;

@Service
public class UserrepairServiceImpl implements UserrepairService {

	@Autowired
	private UserrepairDao userrepairDao;
	
	@Override
	public int addUserrepair(Userrepair userrepair) {
		return userrepairDao.addUserrepair(userrepair);
	}

	@Override
	public int deleteUserrepair(int id) {
		return userrepairDao.deleteUserrepair(id);
	}

	@Override
	public int updateUserrepair(Userrepair userrepair) {
		return userrepairDao.updateUserrepair(userrepair);
	}

	@Override
	public List<Userrepair> getUserrepairById(int id,int status) {
		return userrepairDao.getUserrepairById(id,status);
	}

	@Override
	public List<Userrepair> getUserrepairByPage(int offset, int pageSize) {
		return userrepairDao.getUserrepairByPage(offset, pageSize);
	}

	@Override
	public List<Userrepair> getUserrepairByStatus(int status) {
		return userrepairDao.getUserrepairByStatus(status);
	}

}
