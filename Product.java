package model;

public class Product {
	
	String p_id;
	String p_name;
	String p_price;
	
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_price() {
		return p_price;
	}
	public void setP_price(String p_price) {
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_price=" + p_price + "]";
	}

	
	
}
