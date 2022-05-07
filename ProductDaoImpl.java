package daoimpl;

import java.sql.SQLException;
import java.util.List;

import dao.ProductDao;
import exception.ProductNotFoundException;
import model.Product;
import respository.ProductDaoRes;

public class ProductDaoImpl implements ProductDao{
	ProductDaoRes productDaoRes;
	public ProductDaoImpl() {
		
		try {
			productDaoRes=new ProductDaoRes();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Override
	public boolean addProduct(Product product){
		try {
		
			return productDaoRes.addProduct(product);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	@Override
	public boolean updateProduct(Product eproduct, Product nproduct) {
		return false;
		// TODO Auto-generated method stub
//		try {
//			return productDaoRes.updateproduct(eproduct,nproduct);
//			
//		}catch(SQLException e) {
//			System.out.println(e.getMessage());
//			return false;
//		}
		
	}

	@Override
	public boolean deleteProduct(String p_id) {
		// TODO Auto-generated method stub
//		try {
//			productDaoRes.deleteProduct(p_id);
//		}
		return false;
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductById(String p_id) throws ProductNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
