package com.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.community.entity.Instrument;
@Mapper
public interface InstrumentMapper {
	
	public int addInstrument(Instrument instrument);
	
	public int deleteInstrument(int id);
	
	public int updateInstrument(Instrument instrument);
	
	public Instrument getInstrumentById(int id);
	
	public List<Instrument> getInstrumentByPage(int offset,int pageSize);

}
