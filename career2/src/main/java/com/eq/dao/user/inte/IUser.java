package com.eq.dao.user.inte;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eq.dao.user.entity.User;

public interface IUser extends JpaRepository<User, Long>  {

}
