package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.RoomDao;
import com.community.entity.Room;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomDao roomDao;

	@Override
	public int addRoom(Room room) {
		return roomDao.addRoom(room);
	}

	@Override
	public int deleteRoom(String id) {
		Integer nid = Integer.valueOf(id);
		return roomDao.deleteRoom(nid);
	}

	@Override
	public int updateRoom(Room room) {
		return roomDao.updateRoom(room);
	}

	@Override
	public Room getRoomById(String id) {
		Integer nid = Integer.valueOf(id);
		return roomDao.getRoomById(nid);
	}

	@Override
	public List<Room> getRoomByPage(int offset, int pageSize) {
		return roomDao.getRoomByPage(offset, pageSize);
	}

	@Override
	public Room getRoomByUserId(int id) {
		return roomDao.getRoomByUserId(id);
	}

	@Override
	public List<Room> getRoomBySold(int sold) {
		return roomDao.getRoomBySold(sold);
	}

	

}
