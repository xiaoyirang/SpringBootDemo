package com.xiao.service;

import java.util.List;

import com.xiao.dto.UserDto;
import com.xiao.entity.User;

public interface UserService {

    List<User> findAll();

    List<UserDto> listUserDto();
}
