package electronicgadgets;


public class Computer extends Gadgets implements ElectronicGadgets {
	String name;
	double price;
	String vendor; 
		
	
	public Computer(String name, double price, String vendor) {
		super(name,price,vendor);
		this.name = name;
		this.price = price;
		this.vendor = vendor;
	}
	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		
		System.out.println("press on the start button to start the computer");
	}
	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("go to start button and shutdown the computer");
	
	}

}
