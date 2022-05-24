package retrievedatafromproduct;

public class Product {
	private int pid;
	private String pname;
	private double pprice;
	Product()
	{
	
	}
	public Product(int pid, String pname, double pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	
}