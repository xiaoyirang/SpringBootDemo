package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Parkinglots;
import com.community.mapper.ParkinglotsMapper;

@Repository
public class ParkinglotsDaoImpl implements ParkinglotsDao {
	
	@Autowired
	private ParkinglotsMapper parkinglotsMapper;

	@Override
	public int addParkinglots(Parkinglots parkinglots) {
		return parkinglotsMapper.addParkinglots(parkinglots);
	}

	@Override
	public int deleteParkinglots(int id) {
		return parkinglotsMapper.deleteParkinglots(id);
	}

	@Override
	public int updateParkinglots(Parkinglots parkinglots) {
		return parkinglotsMapper.updateParkinglots(parkinglots);
	}

	@Override
	public List<Parkinglots> getAllParkinglotsByPage(int offset, int pageSize) {
		return parkinglotsMapper.getAllParkinglotsByPage(offset, pageSize);
	}

	@Override
	public Parkinglots getParkinglotsById(int id) {
		return parkinglotsMapper.getParkinglotsById(id);
	}

	@Override
	public Parkinglots getParkinglotsByserialNumber(String serialNumber) {
		return parkinglotsMapper.getParkinglotsByserialNumber(serialNumber);
	}

}
