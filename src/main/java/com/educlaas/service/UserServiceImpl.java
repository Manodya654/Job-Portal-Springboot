package com.educlaas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.educlaas.dao.UserDao;
import com.educlaas.model.Login;
import com.educlaas.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int register(User user) {
		return userDao.register(user);
	}
	
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

	public List<User> viewUsers() {
		return userDao.viewUsers();
	}
	
	public int update(User user) {
		return userDao.update(user);
	}

	public int delete(int id) {
		return userDao.delete(id);
	}

	public List<User> findUserById(int id) {
		return userDao.findUserById(id);
	}

	public List<User> read() {
		return null;
	}
	
	public int forgotpassword(User user) {
		return userDao.forgotpassword(user);
	}
	
	

}
