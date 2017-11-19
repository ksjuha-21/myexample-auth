package org.severovostokova.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.severovostokova.dao.UserDao;
import org.severovostokova.model.User;
import org.severovostokova.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}
}
