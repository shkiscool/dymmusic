package com.shk.test;

import com.shk.entity.Users;
import com.shk.service.usersService;
import com.shk.serviceImpl.usersServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		usersService us = new usersServiceImpl();
		
		Users u = us.login("С��", "qaz123");
		
		System.out.println(u);
	}

}
