package com.myproject.easyui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.easyui.service.UserService;
import com.myproject.easyui.util.IpUtil;
import com.myproject.model.ResponseJson;
import com.myproject.model.SessionInfo;
import com.myproject.model.User;

@Controller
public class LoginController extends BaseController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login")
	public String toLogin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(HttpServletRequest request, HttpServletResponse response) {
		ResponseJson rj = new ResponseJson();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		User user = null;
		if (user != null) {
			SessionInfo sessionInfo = saveSessionInfo(user, request);
			rj.setSuccess(true);
			rj.setMsg("�û���¼�ɹ���");
			rj.setObj(null);
		} else {
			rj.setMsg("�û������������!");
		}
		writeJson(rj, response);
	}

	/**
	 * �����û���session��Ϣ
	 * 
	 * @author yinxunzhi
	 * @time 2015��4��29������3:26:38
	 * @param user
	 * @return
	 */
	private SessionInfo saveSessionInfo(User user, HttpServletRequest request) {
		SessionInfo sessionInfo = new SessionInfo();
		sessionInfo.setUserId(user.getId());
		sessionInfo.setLoginName(user.getPassword());
		sessionInfo.setIp(IpUtil.getIpAddr(request));
		sessionInfo.setPermissions(userService.getPermissions(user));
		request.getSession().setAttribute("sessionInfo", sessionInfo);
		return sessionInfo;
	}

}
