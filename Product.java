package productpackage;

public class Product {
	
	
	protected String model;
	int seatCapacity;
	public Product() {
		//default constructor
	}
	public Product(int seatCapacity, String model) {
		super();
		this.seatCapacity = seatCapacity;
		
		this.model = model;
	}
	public String getmodel()
	{
		return model="Bullock Cart";
	}
	public int getSeatCapacity()
	{
	return seatCapacity;	
	}
	}
	
	
	


