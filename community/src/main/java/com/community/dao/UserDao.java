package com.community.dao;

import java.util.List;

import com.community.entity.User;

public interface UserDao {
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();
	
	// start is the first page number,end is the last page number ,query users by pages
	public List<User> getUsersByLimit(int start,int end);
	
	//to filter the users when someone is registering and ensure the username is unique
	public User getUserByUsername(String username);
	
	//register
	public int addUser(User user);
	
	//update the member-variables of user
	public int updateUser(User user);

	public int deleteUser(int id);
	
	//to query the count of users that have the same IDCard when a user is registering
	public int getUserCountByIdCard(String idcard);
	
	public int updatePassword(User user);
	
	public User getUserByidCardNum(String idCardNum);

}
