package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataToStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//forName method creates an object and loads to the memory
		Class.forName("com.mysql.cj.jdbc.Driver");//loading driver to the memory
		
		//establish connection to the database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridges?characterEncoding=utf8","root","Yuvasri@31");
		
		//creating statement object to execute the database queries
		Statement statement=connection.createStatement();
		
		//executequery executes the database query and we are storing the result into the 
		//Resultset object is cursor based
		int result=statement.executeUpdate("insert into student values(400,'keerthi',100,4)");
		if(result==1)
		{
		System.out.println("Insert Successfully");
		}

}catch(ClassNotFoundException ex)
		{
			System.out.println("class not found"+ex.getMessage());
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	



	}






	}


