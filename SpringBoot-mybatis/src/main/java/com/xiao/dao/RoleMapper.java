package com.xiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xiao.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    @Select("select r.* from role r join user_role ur on r.id=ur.role_id join user u on u.id=ur.user_id where u.id=#{userId}")
    List<Role> listByUserId(Long userId);
}