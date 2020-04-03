package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Room;
import com.community.mapper.RoomMapper;

@Repository
public class RoomDaoImpl implements RoomDao {
	
	@Autowired
	private RoomMapper roomMapper;

	@Override
	public int addRoom(Room room) {
		return roomMapper.addRoom(room);
	}

	@Override
	public int deleteRoom(int id) {
		return roomMapper.deleteRoom(id);
	}

	@Override
	public int updateRoom(Room room) {
		return roomMapper.updateRoom(room);
	}

	@Override
	public Room getRoomById(int id) {
		return roomMapper.getRoomById(id);
	}

	@Override
	public List<Room> getRoomByPage(int offset, int pageSize) {
		return roomMapper.getRoomByPage(offset, pageSize);
	}

	@Override
	public Room getRoomByUserId(int id) {
		return roomMapper.getRoomByUserId(id);
	}

	@Override
	public List<Room> getRoomBySold(int sold) {
		return roomMapper.getRoomBySold(sold);
	}

	

}
