package com.educlaas.dao;

import java.util.List;

import com.educlaas.model.Login;
import com.educlaas.model.User;

public interface UserDao {
	public int register (User user);
	
	public User validateUser(Login login);
	
	public List<User> viewUsers();
	
	public int update(User user);

	public int delete(int id);
	
	public List<User> findUserById(int Id);

	public int forgotpassword(User user);


}
