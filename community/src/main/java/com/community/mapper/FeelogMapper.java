package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Feelog;
@Mapper
public interface FeelogMapper {
	
	public int addFeelog(Feelog feelog);
	
	public int deleteFeelog(Feelog feelog);
	
	public int updateFeelog(Feelog feelog);
	
	public Feelog getFeelogById(int id);
	
	public List<Feelog> getFeelogByPage(int offset,int pageSize);
}
