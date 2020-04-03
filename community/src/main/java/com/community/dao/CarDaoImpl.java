package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Car;
import com.community.mapper.CarMapper;

@Repository
public class CarDaoImpl implements CarDao {
	
	@Autowired
	private CarMapper carMapper;

	@Override
	public List<Car> getAllCatByPage(int offset, int pageSize) {
		return carMapper.getAllCatByPage(offset, pageSize);
	}

	@Override
	public Car getCarById(int id) {
		return carMapper.getCarById(id);
	}

	@Override
	public int updateCar(Car car) {
		return carMapper.updateCar(car);
	}

	@Override
	public int deleteCarById(int id) {
		return carMapper.deleteCarById(id);
	}

	@Override
	public int addCar(Car car) {
		return carMapper.addCar(car);
	}

	@Override
	public List<Car> getCarByStatus(int ststus) {
		return carMapper.getCarByStatus(ststus);
	}

	@Override
	public void deleteCar(String[] ids) {
		
	}

	@Override
	public Car getCarByCarId(int id) {
		return carMapper.getCarByCarId(id);
	}

}
