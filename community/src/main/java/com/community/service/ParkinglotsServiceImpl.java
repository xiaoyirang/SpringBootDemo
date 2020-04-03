package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.ParkinglotsDao;
import com.community.entity.Parkinglots;

@Service
public class ParkinglotsServiceImpl implements ParkinglotsService {
	
	@Autowired
	private ParkinglotsDao parkinglotsDao;

	@Override
	public int addParkinglots(Parkinglots parkinglots) {
		return parkinglotsDao.addParkinglots(parkinglots);
	}

	@Override
	public int deleteParkinglots(int id) {
		return parkinglotsDao.deleteParkinglots(id);
	}

	@Override
	public int updateParkinglots(Parkinglots parkinglots) {
		return parkinglotsDao.updateParkinglots(parkinglots);
	}

	@Override
	public List<Parkinglots> getAllParkinglotsByPage(int offset, int pageSize) {
		return parkinglotsDao.getAllParkinglotsByPage(offset, pageSize);
	}

	@Override
	public Parkinglots getParkinglotsById(int id) {
		return parkinglotsDao.getParkinglotsById(id);
	}

	@Override
	public Parkinglots getParkinglotsByserialNumber(String serialNumber) {
		return parkinglotsDao.getParkinglotsByserialNumber(serialNumber);
	}

}
