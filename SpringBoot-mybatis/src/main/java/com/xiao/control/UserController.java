package com.xiao.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiao.dto.UserDto;
import com.xiao.entity.User;
import com.xiao.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "listUserDto")
    public List<UserDto> listUserDto() {
        return userService.listUserDto();
    }
}
