package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Fee;
@Mapper
public interface FeeMapper {
	
	public int addFee(Fee fee);
	
	public int deleteFee(int id);
	
	public int updateFee(Fee fee);
	
	public Fee getFeeById(int id);
	
	public List<Fee> getFeeByPage(int offset,int pageSize);
}
