package dao;

import java.sql.SQLException;
import java.util.List;

import exception.ProductNotFoundException;
import model.Product;


public interface ProductDao {
	
	
	public boolean addProduct(Product product);
	public boolean updateProduct(Product eproduct,Product nproduct);
	public boolean deleteProduct(String p_id);
	
	public List<Product> viewAllProducts();
	public Product findProductById(String p_id) throws ProductNotFoundException,SQLException;
}
