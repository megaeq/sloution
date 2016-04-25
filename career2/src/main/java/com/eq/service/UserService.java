/**
 * 
 */
package com.eq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eq.dao.user.entity.User;
import com.eq.dao.user.inte.IUser;

/**
 * @author wisdom
 *
 */
@Component
public class UserService {
	@Autowired
	private IUser iUser;
	public void add() {
		User user = new User();
		user.setPassword("11");
		user.setUserName("megaeq");
		iUser.save(user);
	}
}
