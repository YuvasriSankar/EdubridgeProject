package respository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.MyConnection;
import model.Product;

public class ProductDaoRes {

	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	
	public ProductDaoRes() throws SQLException
	{
		connection=MyConnection.getConnection();
		statement=connection.createStatement();
	}
	
	

	public boolean addProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		int out = statement.executeUpdate("insert into product values('"+product.getP_id()+"','"+product.getP_name()+"','"+product.getP_price()+"')");
		if(out==1) {
			return true;
		}else
			return false;
	}



	public boolean updateproduct(Product eproduct, Product nproduct) {
		// TODO Auto-generated method stub
		return false;
	}
}
