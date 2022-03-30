package electronicgadgets;

public class Tv extends Gadgets implements ElectronicGadgets {

	public Tv(String name, double price, String vendor) {
		super(name,price,vendor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("use remote or mobile app to start the TV");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Switch of the power button");
	}
}
