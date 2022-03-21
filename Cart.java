package productpackage;

public class Cart {
	public String color;
	private String name;
	 
	protected String model;
	int wheel;//default access specifier
	public Cart() {
		name="HorseCart";
		color="White";
		 wheel=4;
		model= "Cinderella";
	
	}
		public Cart(String name,String color,int wheel,String model,int year)
		{
			this.name=name;
			this.color=color;
			this.wheel=wheel;
			this.model=model;
			
			
		}
		public void showDetails()
		{
			System.out.println(name+" "+color+" "+wheel+" "+model);
		}
		public String toString()
		{
			return name+" "+color+" "+wheel+" "+model;
		}
		
		
		
		
		
		
		
		
		
	}
	
	


