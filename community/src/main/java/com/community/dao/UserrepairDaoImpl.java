package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Userrepair;
import com.community.mapper.UserrepairMapper;

@Repository
public class UserrepairDaoImpl implements UserrepairDao {
	@Autowired
	private UserrepairMapper userrepairMapper;
	
	@Override
	public int addUserrepair(Userrepair userrepair) {
		return userrepairMapper.addUserrepair(userrepair);
	}

	@Override
	public int deleteUserrepair(int id) {
		return userrepairMapper.deleteUserrepair(id);
	}

	@Override
	public int updateUserrepair(Userrepair userrepair) {
		return userrepairMapper.updateUserrepair(userrepair);
	}

	@Override
	public List<Userrepair> getUserrepairById(int id,int status) {
		return userrepairMapper.getUserrepairById(id,status);
	}

	@Override
	public List<Userrepair> getUserrepairByPage(int offset, int pageSize) {
		return userrepairMapper.getUserrepairByPage(offset, pageSize);
	}

	@Override
	public List<Userrepair> getUserrepairByStatus(int status) {
		return userrepairMapper.getUserrepairByStatus(status);
	}

}
