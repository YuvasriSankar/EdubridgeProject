package daoimpl;

import java.sql.SQLException;

import java.util.List;

import dao.LoginDetailsDao;
import exception.UserNotFoundException;
import model.UserDetails;
import respository.LoginDetailsDaoRes;

public class LoginDetailsDaoImpl implements LoginDetailsDao{

	
	LoginDetailsDaoRes loginDetailsDaoRes;
	
	public LoginDetailsDaoImpl()
	{
		try {
			loginDetailsDaoRes=new LoginDetailsDaoRes();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("problem in repository"+e.getMessage());
		}
	}
	
	@Override
	public boolean signUp(UserDetails user) {
		// TODO Auto-generated method stub
		
		try {
			return loginDetailsDaoRes.signUp(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("problem in sign up"+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean signIn(UserDetails user) {
		// TODO Auto-generated method stub
		try {
			return loginDetailsDaoRes.signIn(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(String oldUserName,UserDetails userDetails) {
		try {
			return loginDetailsDaoRes.updateUser(oldUserName,userDetails);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUser(String username){
		try {
		return loginDetailsDaoRes.deleteUser(username);
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		//return false;
	}

	@Override
	public List<UserDetails>  viewAllUsers() {
		// TODO Auto-generated method stub
		try
		{
			return loginDetailsDaoRes.viewAllUsers();
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public UserDetails findUserByUserName(String userName) throws UserNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			UserDetails userDetails= loginDetailsDaoRes.findUserByUserName(userName);
		
//			if(userDetails!=null)
//				return userDetails;
//			else
//				throw new UserNotFoundException("user not found");
			return userDetails;
		
		
	}

}
