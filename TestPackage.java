package mainpackage;
import productpackage.Cart;
import productpackage.Product;
import productpackage.Payment;
import customerpackage.Customer;

public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart=new Cart();
		System.out.println(cart);
		
		Product product=new Product(5,"Bullock Cart");
		System.out.println(product.getmodel()+" "+product. getSeatCapacity());
		
		Payment payment=new Payment(1000000);
		System.out.println(payment.getcost());
		
		Customer customer=new Customer();
		System.out.println(customer);
		
		

	}

}
