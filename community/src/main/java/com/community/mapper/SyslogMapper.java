package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Syslog;
@Mapper
public interface SyslogMapper {
	
	public int addSyslog(Syslog syslog);
	
	public int deleteSyslog(int id);
	
	public int updateSyslog(Syslog syslog);
	
	public Syslog getSyslogById(int id);
	
	public List<Syslog> getSyslogByPage(int offset,int pageSize);

}
