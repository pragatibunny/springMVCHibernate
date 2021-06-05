package com.casestudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.dao.UserD;
import com.casestudy.model.User;
@Service
public class UserSer {
	@Autowired
	private UserD userD;
public User saveUser(User user) {
	System.out.println("Ser Class");
	return this.userD.saveUser(user);
}
}
