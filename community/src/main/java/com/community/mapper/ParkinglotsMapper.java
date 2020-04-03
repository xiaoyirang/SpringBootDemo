package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Parkinglots;
@Mapper
public interface ParkinglotsMapper {
	
	/**
	 * 添加停车场
	 * @param parkinglots
	 * @return
	 */
	public int addParkinglots(Parkinglots parkinglots);
	
	/**
	 * 删除停车场
	 * @param id
	 * @return
	 */
	public int deleteParkinglots(int id);
	
	/**
	 * 更新停车场信息
	 * @param parkinglots
	 * @return
	 */
	public int updateParkinglots(Parkinglots parkinglots);
	
	/**
	 * 分页获取所有的停车场信息
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List<Parkinglots> getAllParkinglotsByPage(int offset,int pageSize);
	
	/**
	 * 根据id获取停车场信息
	 * @param id
	 * @return
	 */
	public Parkinglots getParkinglotsById(int id);
	
	/**
	 * 根据serialNumber获取停车场信息
	 * @param id
	 * @return
	 */
	public Parkinglots getParkinglotsByserialNumber(String serialNumber);

}
