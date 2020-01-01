package com.xiao.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserControl {

    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }
}
