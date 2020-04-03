package com.community.service;

import java.util.List;

import com.community.entity.Userrepair;

public interface UserrepairService {
	public int addUserrepair(Userrepair userrepair);
	
	public int deleteUserrepair(int id);
	
	public int updateUserrepair(Userrepair userrepair);
	
	public List<Userrepair> getUserrepairById(int id,int status);
	
	public List<Userrepair> getUserrepairByStatus(int status);
	
	public List<Userrepair> getUserrepairByPage(int offset,int pageSize);
}
