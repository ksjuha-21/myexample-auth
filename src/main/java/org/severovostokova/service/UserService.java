package org.severovostokova.service;

import org.severovostokova.model.User;

public interface UserService {
	User save(User user);

	User findByUserName(String username);
}
