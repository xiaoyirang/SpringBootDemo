package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Equipmentrepair;
@Mapper
public interface EquipmentrepairMapper {
	
	public int addEquipmentrepair(Equipmentrepair equipmentrepair);
	
	public int deleteEquipmentrepair(int id);
	
	public int updateEquipmentrepair(Equipmentrepair equipmentrepair);
	
	public List<Equipmentrepair> getEquipmentrepairById(int id,int status);
	
	public List<Equipmentrepair> getEquipmentrepairByStatus(int status);
	
	public List<Equipmentrepair> getEquipmentrepairByPage(int offset,int pageSize);

}
