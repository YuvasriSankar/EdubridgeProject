package customerpackage;

public class Customer {
	
	public String variety;
	public String variety1;
	public String variety2 ;
	
	
	public Customer()
	{
		variety="Tuggable cart";
		variety1="Warehouse picking cart";
		variety2="Truck cart";
		
	}
	public Customer(String variety,String variety1,String variety2)//parameterized constructor
	{
		
		this.variety= variety;
		this.variety= variety1;
		this.variety= variety2;
	}
	public void showDetails()
	{
    System.out.println(variety+" "+variety1+" "+variety2);
	}
	public String toString()
	{
		return variety+" "+variety1+" "+variety2;
	
	}
	
	
	
	
	
	

}
