package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Equipmentrepair;
import com.community.mapper.EquipmentrepairMapper;

@Repository
public class EquipmentrepairDaoImpl implements EquipmentrepairDao {
	
	@Autowired
	private EquipmentrepairMapper equipmentrepairMapper;
	
	@Override
	public int addEquipmentrepair(Equipmentrepair equipmentrepair) {
		return equipmentrepairMapper.addEquipmentrepair(equipmentrepair);
	}

	@Override
	public int deleteEquipmentrepair(int id) {
		return equipmentrepairMapper.deleteEquipmentrepair(id);
	}

	@Override
	public int updateEquipmentrepair(Equipmentrepair equipmentrepair) {
		return equipmentrepairMapper.updateEquipmentrepair(equipmentrepair);
	}

	@Override
	public List<Equipmentrepair> getEquipmentrepairById(int id,int status) {
		return equipmentrepairMapper.getEquipmentrepairById(id,status);
	}

	@Override
	public List<Equipmentrepair> getEquipmentrepairByPage(int offset, int pageSize) {
		return equipmentrepairMapper.getEquipmentrepairByPage(offset, pageSize);
	}

	@Override
	public List<Equipmentrepair> getEquipmentrepairByStatus(int status) {
		return equipmentrepairMapper.getEquipmentrepairByStatus(status);
	}

}
