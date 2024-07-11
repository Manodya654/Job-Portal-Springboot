package com.educlaas.service;

import java.util.List;

import com.educlaas.model.Login;
import com.educlaas.model.User;

public interface UserService {
	public int register (User user);
	public User validateUser(Login login);
	public List<User> viewUsers();
	public List<User> findUserById(int id);
	public int update(User user);
	public List<User> read();
	public int delete(int id);
	public int forgotpassword(User user);
	
}
