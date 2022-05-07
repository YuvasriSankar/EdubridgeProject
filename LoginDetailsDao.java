package dao;

import java.sql.SQLException;
import java.util.List;

import exception.UserNotFoundException;
import model.UserDetails;

public interface LoginDetailsDao {
	public boolean signUp(UserDetails user);
	public boolean signIn(UserDetails user);
	public boolean updateUser(String oldUsername,UserDetails userDetails);
	public boolean deleteUser(String username);
	public List<UserDetails> viewAllUsers();
	public UserDetails findUserByUserName(String userName) throws UserNotFoundException,SQLException;
}
 