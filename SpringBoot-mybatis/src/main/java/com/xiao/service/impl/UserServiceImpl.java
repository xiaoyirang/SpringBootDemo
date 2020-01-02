package com.xiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiao.dao.UserMapper;
import com.xiao.dto.UserDto;
import com.xiao.entity.User;
import com.xiao.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<UserDto> listUserDto() {
        return userMapper.listUserDto();
    }

}
