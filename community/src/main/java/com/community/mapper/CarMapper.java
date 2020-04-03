package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Car;

@Mapper
public interface CarMapper {
	
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
	 * 删除车辆
	 * @param id
	 * @return
	 */
	public void deleteCar(String[] ids );
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
	 * 添加车辆信息
	 * @param car
	 * @return
	 */
	public int addCar(Car car);

}
