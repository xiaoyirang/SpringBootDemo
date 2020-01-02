package com.xiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import com.xiao.dto.UserDto;
import com.xiao.entity.User;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user")
    @Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(column = "id", property = "roles", many = @Many(select = "com.xiao.dao.RoleMapper.listByUserId", fetchType = FetchType.EAGER)) })
    List<UserDto> listUserDto();
}