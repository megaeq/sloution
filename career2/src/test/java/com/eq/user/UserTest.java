package com.eq.user;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eq.dao.user.entity.User;
import com.eq.dao.user.inte.IUser;
import com.eq.service.UserService;

import net.sf.json.JSONObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
	@Resource
	private UserService userService;
	@Resource
	private IUser iUser;
	//@Test
	public void test() {
		//userService.add();
		User user = new User();
		user.setPassword("123456");
		user.setUserName("mm");
		iUser.save(user);
	}
	@Test
	public void findByUserName() {
		Sort sort = new Sort(Sort.Direction.ASC,"id").and(new Sort(Sort.Direction.DESC,"userName"));
		Pageable pageable = new PageRequest(0, 2,sort);
		
		Page<User> page = iUser.findByUserName("mm", pageable);
		System.out.println(JSONObject.fromObject(page).toString());
	}
	
}
