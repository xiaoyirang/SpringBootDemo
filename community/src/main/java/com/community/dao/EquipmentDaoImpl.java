package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Equipment;
import com.community.mapper.EquipmentMapper;

@Repository
public class EquipmentDaoImpl implements EquipmentDao {
	
	@Autowired
	private EquipmentMapper equipmentMapper;
	
	@Override
	public Equipment getEquipmentByName(String name) {
		return equipmentMapper.getEquipmentByName(name);
	}

	@Override
	public List<Equipment> getAllEquipmentByPage(int offset,int pageSize) {
		return equipmentMapper.getAllEquipmentByPage(offset,pageSize);
	}

	@Override
	public int updateEquipment(Equipment equipment) {
		return equipmentMapper.updateEquipment(equipment);
	}

	@Override
	public int deleteEquipment(int id) {
		return equipmentMapper.deleteEquipment(id);
	}

	@Override
	public int addEquipment(Equipment equipment) {
		return equipmentMapper.addEquipment(equipment);
	}

	@Override
	public List<Equipment> getEquipmentByNames(String name) {
		return equipmentMapper.getEquipmentByNames(name);
	}

}
