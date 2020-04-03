package com.community.dao;

import com.community.entity.Fee;
import com.community.entity.FeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeMapper {
    long countByExample(FeeExample example);

    int deleteByExample(FeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fee record);

    int insertSelective(Fee record);

    List<Fee> selectByExample(FeeExample example);

    Fee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fee record, @Param("example") FeeExample example);

    int updateByExample(@Param("record") Fee record, @Param("example") FeeExample example);

    int updateByPrimaryKeySelective(Fee record);

    int updateByPrimaryKey(Fee record);
}