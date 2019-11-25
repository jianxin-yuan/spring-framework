package com.yuan.factory;

import com.yuan.service.UserService;

/**
 * @author yuan
 * @date 2019/11/18 2:14 下午
 */
public class UserFactory {
	private static final UserService userService = new UserService();

	public static UserService getInstance() {
		return userService;
	}


}
