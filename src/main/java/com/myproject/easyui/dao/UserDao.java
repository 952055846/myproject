package com.myproject.easyui.dao;

import org.springframework.stereotype.Repository;

import com.myproject.model.User;

/**
 * @author yinxunzhi
 * @creatTime 2015��4��30������9:54:01
 * @version 1.0
 * @description 
 */
@Repository
public interface UserDao {
	public User getUser(String id);
}
