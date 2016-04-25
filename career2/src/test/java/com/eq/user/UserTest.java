package com.eq.user;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eq.dao.user.entity.User;
import com.eq.dao.user.inte.UserImpl2;
import com.eq.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
	@Resource
	private UserService userService;
	@Resource
	private UserImpl2 userImpl;
	@Test
	public void test() {
		//userService.add();
		User user = new User();
		user.setPassword("123456");
		user.setUserName("mm");
		userImpl.save(user);
	}
}
