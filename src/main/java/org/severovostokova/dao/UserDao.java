package org.severovostokova.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.severovostokova.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
	User save(User user);

	User findByUserName(String username);
}
