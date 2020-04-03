package com.community.service;

import java.util.List;

import com.community.entity.Equipment;

public interface EquipmentService {
	/**
	 * 获取单个设备信息
	 * @return
	 */
	public Equipment getEquipmentByName(String name);
	
	/**
	 * 获取多个设备信息
	 * @return
	 */
	public List<Equipment> getEquipmentByNames(String name);
	
	/**
	 * 获取设备列表
	 * @return
	 */
	public List<Equipment> getAllEquipmentByPage(int offset,int pageSize);
	
	
	/**
	 * 更新设备信息
	 * @param equipment
	 * @return
	 */
	public int updateEquipment(Equipment equipment);
	
	/**
	 * 删除设备
	 * @param id
	 * @return
	 */
	public int deleteEquipment(int id);
	
	/**
	 * 添加设备
	 * @param equipment
	 * @return
	 */
	public int addEquipment(Equipment equipment);

}
