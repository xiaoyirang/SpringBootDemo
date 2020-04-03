package com.community.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.community.entity.Notice;
import com.community.mapper.NoticeMapper;

@Repository
public class NoticeDaoImpl implements NoticeDao {
	
	@Autowired
	private NoticeMapper noticemapper;
	
	@Override
	public List<Notice> getNoticeByPage(int offset, int pageSize) {
		
		return noticemapper.getNoticeByPage(offset, pageSize);
	}

	@Override
	public Notice getNoticeById(int id) {
		
		return noticemapper.getNoticeById(id);
	}

	@Override
	public int addNotice(Notice notice) {
		
		return noticemapper.addNotice(notice);
	}

	@Override
	public int deleteNotice(int id) {
		
		return noticemapper.deleteNotice(id);
	}

	@Override
	public int updateNotice(Notice notice) {
		
		return noticemapper.updateNotice(notice);
	}


}
