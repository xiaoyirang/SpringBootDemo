package com.community.dao;

import java.util.List;
import java.util.Map;

import com.community.entity.Complain;

public interface ComplainDao {
	
	/**
	 * 获取单个投诉信息--1
	 * @return
	 */
	public Complain getComplainById(int id);
	
	/**
	 * 分页获取投诉信息--1
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List<Complain> getAllCompalinByPage(int offset,int pageSize);
	
	/**
	 * 添加投诉信息--2
	 * @param complain
	 * @return
	 */
	public int addComplain(Complain complain);
	
	/**
	 * 删除投诉信息--1
	 * @param id
	 * @return
	 */
	public int deleteComplain(int id);
	
	/**
	 * 更新投诉信息--1
	 * @param complain
	 * @return
	 */
	public int updateComplain(Complain complain);
	
	/**
	 * 根据用户id获取投诉信息--2
	 * @param userId
	 * @return
	 */
	public List<Complain> getComplainByUser(Map<String, Object> map);
	
	/**
	 * 根据status获取投诉信息--2
	 * @param userId
	 * @return
	 */
	public List<Complain> getComplainByStatus(String status);

}
