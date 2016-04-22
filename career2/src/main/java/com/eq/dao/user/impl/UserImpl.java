package com.eq.dao.user.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eq.dao.common.AbstractImpl;
import com.eq.dao.user.entity.User;
import com.eq.dao.user.inte.UserInte;

public class UserImpl extends AbstractImpl<User> implements UserInte {
	@PersistenceContext
	private EntityManager em;
	public UserImpl() {
		super(User.class);
	}

	@Override
	protected EntityManager getEM() {
		return em;
	}

}
