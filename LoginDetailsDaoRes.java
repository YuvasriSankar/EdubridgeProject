

package respository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.MyConnection;
import exception.UserNotFoundException;
import model.UserDetails;

public class LoginDetailsDaoRes {
	
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	public LoginDetailsDaoRes() throws SQLException
	{
		connection=MyConnection.getConnection();
		statement=connection.createStatement();
	}
	
	public boolean signUp(UserDetails user) throws SQLException {
		// TODO Auto-generated method stub
	System.out.println(user.getFirstName());
	int r=statement.executeUpdate("insert into userdetails values('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getLocation()+"','"+user.getMobileno()+"')");
	if(r==1)
	{
	return true;
	}else
		return false;

	}
	public boolean signIn(UserDetails user) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String tuser=user.getUsername();
		String pass=user.getPassword();
		resultSet=statement.executeQuery("select *from userdetails where username='"+tuser+"' and password='"+pass+"'");
		if(resultSet.next())
		{
		return true;
		}else
			return false;
	}

	
	public boolean updateUser(String oldUserName,UserDetails userDetails) throws SQLException {
		// TODO Auto-generated method
		
		String a=userDetails.getUsername();	
		String b=userDetails.getPassword();
		String c=userDetails.getFirstName();
		String d=userDetails.getLastName();
		String e=userDetails.getLocation();
		String f=userDetails.getMobileno();
		
		
//		 update userdetails set username='arav',password='rootu',firstname='aravin',lastname='raj',location='sriram',mobileno='09' where username='siraj'
		//String query = "update userdetails set username='"+a+"',password='"+b+"',firstname='"+c+"',lastname='"+d+"',location='"+e+"',mobileno="+f+"' where username='"+oldUserName+"' ";
		
		int out = statement.executeUpdate("update userdetails set username='"+a+"',password='"+b+"',firstname='"+c+"',lastname='"+d+"',location='"+e+"',mobileno='"+f+"' where username='"+oldUserName+"'");
		
		if (out==1) {
			return true;
		
		}else; 
			return false;
	}

	
	public boolean deleteUser(String username) throws SQLException {
		// TODO Auto-generated method stub
		
		int out1 = statement.executeUpdate("delete from userdetails where username='"+username+"'");
		
		if(out1==1) {
			return true;
		}else
			return false;
	}

	public List<UserDetails> viewAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		resultSet = statement.executeQuery("select *from userdetails");
		ArrayList<UserDetails> arrayList = new ArrayList<>();
		
		while (resultSet.next()) {
			UserDetails ud = new UserDetails();
			ud.setUsername(resultSet.getString(1));
			ud.setPassword(resultSet.getString(2));
			ud.setFirstName(resultSet.getString(3));
			ud.setLastName(resultSet.getString(4));
			ud.setLocation(resultSet.getString(5));
			ud.setMobileno(resultSet.getString(6));
			arrayList.add(ud);
			
		}
		return arrayList;
	}

	public UserDetails findUserByUserName(String userName) throws UserNotFoundException,  SQLException {
		// TODO Auto-generated method stub
		resultSet = statement.executeQuery("select *from userdetails where username='"+userName+"'");
		
		UserDetails ud= new UserDetails();
		
		if (resultSet.next()) {
		
		ud.setUsername(resultSet.getString(1));
		ud.setPassword(resultSet.getString(2));
		ud.setFirstName(resultSet.getString(3));
		ud.setLastName(resultSet.getString(4));
		ud.setLocation(resultSet.getString(5));
		ud.setMobileno(resultSet.getString(6));
		return ud;
		}else
			throw new UserNotFoundException("user is not there");
		
	}
}
