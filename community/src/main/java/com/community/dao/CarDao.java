package com.community.dao;

import java.util.List;

import com.community.entity.Car;

public interface CarDao {
	/**
	 * 分页查询车辆
	 * @param start 开始偏移数
	 * @param end	每页记录数
	 * @return
	 */
	public List<Car> getAllCatByPage(int offset,int pageSize);
	/**
	 * 根据id查询车辆
	 * @param id
	 * @return
	 */
	public Car getCarById(int id);
	
	public Car getCarByCarId(int id);
	/**
	 * 根据状态查询车辆
	 * @param status
	 * @return
	 */
	public List<Car> getCarByStatus(int ststus);
	/**
	 * 更新车辆信息
	 * @param car
	 * @return
	 */
	public int updateCar(Car car);
	/**
	 * 根据id删除车辆
	 * @param id
	 * @return
	 */
	public int deleteCarById(int id);
	/**
	 * 删除车辆
	 * @param id
	 * @return
	 */
	public void deleteCar(String[] ids );
	/**
	 * 添加车辆信息
	 * @param car
	 * @return
	 */
	public int addCar(Car car);
}
