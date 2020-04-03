package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.CarDao;
import com.community.entity.Car;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDao carDao;

	@Override
	public List<Car> getAllCatByPage(int offset, int pageSize) {
		return carDao.getAllCatByPage(offset, pageSize);
	}

	@Override
	public Car getCarById(int id) {
		Integer nid = Integer.valueOf(id);
		return carDao.getCarById(nid);
	}

	@Override
	public int updateCar(Car car) {
		return carDao.updateCar(car);
	}

	@Override
	public int deleteCarById(String id) {
		Integer nid = Integer.valueOf(id);
		return carDao.deleteCarById(nid);
	}

	@Override
	public int addCar(Car car) {
		return carDao.addCar(car);
	}

	@Override
	public List<Car> getCarByStatus(int ststus) {
		return carDao.getCarByStatus(ststus);
	}

	@Override
	public void deleteCar(String[] ids) {
		
	}

	@Override
	public Car getCarByCarId(int id) {
		return carDao.getCarByCarId(id);
	}

}
