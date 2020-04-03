package com.community.service;

import java.util.List;
import java.util.Map;

import com.community.entity.Complain;

public interface ComplainService {
	
	/**
	 * 获取单个投诉信息
	 * @return
	 */
	public Complain getComplainById(String id);
	
	/**
	 * 分页获取投诉信息
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List<Complain> getAllCompalinByPage(int offset,int pageSize);
	
	/**
	 * 添加投诉信息
	 * @param complain
	 * @return
	 */
	public int addComplain(Complain complain);
	
	/**
	 * 删除投诉信息
	 * @param id
	 * @return
	 */
	public int deleteComplain(String id);
	
	/**
	 * 更新投诉信息
	 * @param complain
	 * @return
	 */
	public int updateComplain(Complain complain);
	
	/**
	 * 根据用户id获取投诉信息
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
