package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.EquipmentDao;
import com.community.entity.Equipment;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentDao equipmentDao;
	
	@Override
	public Equipment getEquipmentByName(String name) {
		return equipmentDao.getEquipmentByName(name);
	}

	@Override
	public List<Equipment> getAllEquipmentByPage(int offset,int pageSize) {
		return equipmentDao.getAllEquipmentByPage(offset,pageSize);
	}

	@Override
	public int updateEquipment(Equipment equipment) {
		return equipmentDao.updateEquipment(equipment);
	}

	@Override
	public int deleteEquipment(int id) {
		return equipmentDao.deleteEquipment(id);
	}

	@Override
	public int addEquipment(Equipment equipment) {
		return equipmentDao.addEquipment(equipment);
	}

	@Override
	public List<Equipment> getEquipmentByNames(String name) {
		return equipmentDao.getEquipmentByNames(name);
	}

}
