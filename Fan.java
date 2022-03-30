package electronicgadgets;
public class Fan extends Gadgets implements ElectronicGadgets {

	
	public Fan(String name, double price, String vendor) {
		super(name,price,vendor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("use on the button");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Switch of the button");
	}


	}



