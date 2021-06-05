package com.casestudy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.casestudy.model.User;

@Repository
public class UserD {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public User saveUser(User user) {
		this.hibernateTemplate.save(user);
		System.out.println("Dao Class");
		return user;

	}
}
