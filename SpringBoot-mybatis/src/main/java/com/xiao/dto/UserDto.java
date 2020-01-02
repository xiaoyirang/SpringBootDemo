package com.xiao.dto;

import java.util.List;

import com.xiao.entity.Role;
import com.xiao.entity.User;

import lombok.Data;

@Data
public class UserDto extends User {

    private List<Role> roles;
}
