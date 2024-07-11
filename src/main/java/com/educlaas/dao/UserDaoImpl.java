package com.educlaas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.educlaas.model.Login;
import com.educlaas.model.User;

public class UserDaoImpl implements UserDao{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//For Register Process
	public int register(User user) {
		String sql = "insert into users values(null,?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, new Object[] {user.getFirstname(), user.getLastname(), user.getCountry(), 
				user.getCity(), user.getCompany(), user.getAddress(), user.getPhone(), user.getEmail(), user.getPassword(), user.getUser_role()});
	}

	//For Login Process 
	public User validateUser(Login login) {
		String sql = "select * from users where email = '" + login.getEmail() + "' and password = '" + login.getPassword() + "' ";
		
		List<User> user = jdbcTemplate.query(sql , new UserMapper());
		
		return user.size() > 0? user.get(0) : null;
	}

	class UserMapper implements RowMapper<User>{

		public User mapRow(ResultSet rs, int arg1) throws SQLException {
	
			User user = new User();
			
			user.setId(rs.getInt("id"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setCountry(rs.getString("country"));
			user.setCity(rs.getString("city"));
			user.setCompany(rs.getString("company"));
			user.setAddress(rs.getString("address"));
			user.setPhone(rs.getString("phone"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setUser_role(rs.getInt("user_role"));
			
			return user;
		}
		
	}

	//Admin Process - Retrieve all the users from database. 
	public List<User> viewUsers() {
		String sql1 = "SELECT * FROM users";
		List<User> user = jdbcTemplate.query(sql1, new UserMapper());
		return user;
	}
	
	public int update(User user) {
		String sql = "update users set firstname=?,lastname=?,country=?,city=?,company=?,address=?,phone=?,email=?,password=?,user_role=? where id=?";
		
		try {
		
			int counter = jdbcTemplate.update(sql,
			new Object[] {user.getFirstname(), user.getLastname(), user.getCountry(), 
					user.getCity(), user.getCompany(), user.getAddress(), user.getPhone(), user.getEmail(), user.getPassword(), user.getUser_role()});
			return counter;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public int delete(int id) {
		String sql = "delete from users where id=?";
			
		try {

			int counter = jdbcTemplate.update(sql, new Object[] { id });
			return counter;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<User> findUserById(int id) {
		List<User> userList = jdbcTemplate.query("SELECT * FROM users where id=?",
		new Object[] { id }, new RowMapper<User>() {
			 
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user  = new User();

				user.setId(rs.getInt("id"));
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setCountry(rs.getString("country"));
				user.setCity(rs.getString("city"));
				user.setCompany(rs.getString("company"));
				user.setAddress(rs.getString("address"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setUser_role(rs.getInt("user_role"));
				return user;
			}
								 
		});
		return userList; 
	}
	
	
	public int forgotpassword(User user){ 
		
		String sql = "select * from users where id=?";
        
		List<User> user1 = jdbcTemplate.query(sql , new UserMapper());
		
		return 0;
		
	}

}
