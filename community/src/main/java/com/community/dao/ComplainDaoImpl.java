package com.community.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Complain;
import com.community.mapper.ComplainMapper;

@Repository
public class ComplainDaoImpl implements ComplainDao {
	
	@Autowired
	private ComplainMapper complainMapper;

	@Override
	public Complain getComplainById(int id) {
		return complainMapper.getComplainById(id);
	}

	@Override
	public List<Complain> getAllCompalinByPage(int offset, int pageSize) {
		return complainMapper.getAllCompalinByPage(offset, pageSize);
	}

	@Override
	public int addComplain(Complain complain) {
		return complainMapper.addComplain(complain);
	}

	@Override
	public int deleteComplain(int id) {
		return complainMapper.deleteComplain(id);
	}

	@Override
	public int updateComplain(Complain complain) {
		return complainMapper.updateComplain(complain);
	}

	@Override
	public List<Complain> getComplainByUser(Map<String, Object> map) {
		return complainMapper.getComplainByUser(map);
	}

	@Override
	public List<Complain> getComplainByStatus(String status) {
		return complainMapper.getComplainByStatus(status);
	}

}
