package com.myproject.easyui.dao;

import org.springframework.stereotype.Repository;

import com.myproject.model.User;

@Repository(value="userDao")
public interface UserDao {
	public User getUser(User user);
}
