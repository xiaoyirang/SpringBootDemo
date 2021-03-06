package com.community.dao;

import java.util.List;

import com.community.entity.Room;

public interface RoomDao {
	/**
	 * 添加房屋信息
	 * @param room
	 * @return
	 */
	public int addRoom(Room room);
	
	/**
	 * 删除房屋
	 * @param id
	 * @return
	 */
	public int deleteRoom(int id);
	
	/**
	 * 更新房屋信息
	 * @param room
	 * @return
	 */
	public int updateRoom(Room room);
	
	/**
	 * 根据id获取房屋信息
	 * @param id
	 * @return
	 */
	public Room getRoomById(int id);
	
	/**
	 * 根据sold获取房屋信息
	 * @param sold
	 * @return
	 */
	public List<Room> getRoomBySold(int sold);
	
	/**
	 * 分页获取房屋信息
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List<Room> getRoomByPage(int offset,int pageSize);
	
	/**
	 * 根据用户id获取房屋信息
	 * @param id
	 * @return
	 */
	public Room getRoomByUserId(int id);
}
