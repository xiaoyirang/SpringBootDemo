package com.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.community.entity.User;
import com.community.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityApplicationTests {
	
	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user = userMapper.getUserById(1);
		
		System.out.println(user.toString());
	}

}
