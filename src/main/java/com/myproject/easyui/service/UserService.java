package com.myproject.easyui.service;

import java.util.List;

import com.myproject.model.Permission;
import com.myproject.model.User;

/**
 * @author yinxunzhi
 * @creatTime 2015��4��29������11:17:47
 * @version 1.0
 * @description 
 */
public interface UserService {

	/**
	 * ��ȡ�û���Ȩ���б�
	 * @author yinxunzhi
	 * @time 2015��4��29������4:34:11
	 * @param user
	 * @return
	 */
	List<Permission> getPermissions(User user);
	
}
