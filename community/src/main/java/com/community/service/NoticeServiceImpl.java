package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.NoticeDao;
import com.community.entity.Notice;
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeDao noticedao;
	
	@Override
	public List<Notice> getNoticeByPage(int offset, int pageSize) {
		
		return noticedao.getNoticeByPage(offset, pageSize);
	}

	@Override
	public Notice getNoticeById(int id) {
		
		return noticedao.getNoticeById(id);
	}

	@Override
	public int addNotice(Notice notice) {
		
		return noticedao.addNotice(notice);
	}

	@Override
	public int deleteNotice(int id) {
		
		return noticedao.deleteNotice(id);
	}

	@Override
	public int updateNotice(Notice notice) {
		
		return noticedao.updateNotice(notice);
	}

}
