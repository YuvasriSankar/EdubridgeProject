package jdbcprogram;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loading driver
		try {
			//forName method creates an object and loads to the memory
		Class.forName(";/");//loading driver to the memory
		
		//establish connection to the database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridges?characterEncoding=utf8","root","Yuvasri@31");
		
		//creating statement object to execute the database queries
		Statement statement=connection.createStatement();
		
		//executequery executes the database query and we are storing the result into the 
		//Resultset object is cursor based
		ResultSet resultSet=statement.executeQuery("select *from student");
		//resultSet.absolute(3);
while(resultSet.next()) {
		System.out.println("Id--->"+resultSet.getInt("s_id"));
		System.out.println("Name--->"+resultSet.getString("s_name"));
		System.out.println("marks--->"+resultSet.getInt("s_marks"));
		System.out.println("semester--->"+resultSet.getInt("s_sem"));
		
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




