package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Notice;
@Mapper
public interface NoticeMapper {
	
	public int addNotice(Notice notice);
	
	public int deleteNotice(int id);
	
	public int updateNotice(Notice notice);
	
	public Notice getNoticeById(int id);
	
	public List<Notice> getNoticeByPage(int offset,int pageSize);

}
