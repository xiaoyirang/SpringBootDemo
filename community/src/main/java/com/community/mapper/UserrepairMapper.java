package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Userrepair;
@Mapper
public interface UserrepairMapper {
	
	public int addUserrepair(Userrepair userrepair);
	
	public int deleteUserrepair(int id);
	
	public int updateUserrepair(Userrepair userrepair);
	
	public List<Userrepair> getUserrepairById(int id,int status);
	
	public List<Userrepair> getUserrepairByStatus(int status);
	
	public List<Userrepair> getUserrepairByPage(int offset,int pageSize);
	
}
