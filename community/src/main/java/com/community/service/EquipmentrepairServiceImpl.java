package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.EquipmentrepairDao;
import com.community.entity.Equipmentrepair;

@Service
public class EquipmentrepairServiceImpl implements EquipmentrepairService {

	@Autowired
	private EquipmentrepairDao equipmentrepairDao;
	
	@Override
	public int addEquipmentrepair(Equipmentrepair equipmentrepair) {
		return equipmentrepairDao.addEquipmentrepair(equipmentrepair);
	}

	@Override
	public int deleteEquipmentrepair(int id) {
		return equipmentrepairDao.deleteEquipmentrepair(id);
	}

	@Override
	public int updateEquipmentrepair(Equipmentrepair equipmentrepair) {
		return equipmentrepairDao.updateEquipmentrepair(equipmentrepair);
	}

	@Override
	public List<Equipmentrepair> getEquipmentrepairById(int id,int status) {
		return equipmentrepairDao.getEquipmentrepairById(id,status);
	}

	@Override
	public List<Equipmentrepair> getEquipmentrepairByPage(int offset, int pageSize) {
		return equipmentrepairDao.getEquipmentrepairByPage(offset, pageSize);
	}

	@Override
	public List<Equipmentrepair> getEquipmentrepairByStatus(int status) {
		return equipmentrepairDao.getEquipmentrepairByStatus(status);
	}

}
