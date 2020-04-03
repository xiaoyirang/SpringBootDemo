package com.community.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.ComplainDao;
import com.community.entity.Complain;

@Service
public class ComplainServiceImpl implements ComplainService {
	
	@Autowired
	private ComplainDao complainDao;

	@Override
	public Complain getComplainById(String id) {
		Integer nid = Integer.valueOf(id);
		return complainDao.getComplainById(nid);
	}

	@Override
	public List<Complain> getAllCompalinByPage(int offset, int pageSize) {
		return complainDao.getAllCompalinByPage(offset, pageSize);
	}

	@Override
	public int addComplain(Complain complain) {
		return complainDao.addComplain(complain);
	}

	@Override
	public int deleteComplain(String id) {
		Integer nid = Integer.valueOf(id);
		return complainDao.deleteComplain(nid);
	}

	@Override
	public int updateComplain(Complain complain) {
		return complainDao.updateComplain(complain);
	}

	@Override
	public List<Complain> getComplainByUser(Map<String, Object> map) {
		return complainDao.getComplainByUser(map);
	}

	@Override
	public List<Complain> getComplainByStatus(String status) {
		return complainDao.getComplainByStatus(status);
	}

}
