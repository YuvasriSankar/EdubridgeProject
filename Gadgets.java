package electronicgadgets;

public  abstract class Gadgets implements ElectronicGadgets {
String name;
double price;
String vendor;
public Gadgets(String name, double price, String vendor) {
	super();
	this.name = name;
	this.price = price;
	this.vendor = vendor;
}
public void Gadgets1(String name2, double price2, String vendor2) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Gadgets [name=" + name + ", price=" + price + ", vendor=" + vendor + "]";
}
}
