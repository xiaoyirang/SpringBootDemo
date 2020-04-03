package com.community.service;

import java.util.List;

import com.community.entity.Equipmentrepair;

public interface EquipmentrepairService {

	public int addEquipmentrepair(Equipmentrepair equipmentrepair);
	
	public int deleteEquipmentrepair(int id);
	
	public int updateEquipmentrepair(Equipmentrepair equipmentrepair);
	
	public List<Equipmentrepair> getEquipmentrepairById(int id,int status);
	
	public List<Equipmentrepair> getEquipmentrepairByStatus(int status);
	
	public List<Equipmentrepair> getEquipmentrepairByPage(int offset,int pageSize);
}
