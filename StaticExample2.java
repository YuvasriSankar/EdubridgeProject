package arithmatic1;

public class StaticExample2 {
	private static int add;
	private static int sub;
	private static int mul;
	private static int div;
	private static int mod;
	
	int num1=10;// instance variable or member variable
	int num2=3;
	
	static {
		System.out.println("welcome to Arithmatic Operation");// Static Block
		
	}
	public StaticExample2()// constructor
	{
		
		add=num1+num2;// Addition operator
		sub=num1-num2;//Subtraction operator
		mul=num1*num2;//Multiplication operator
		div=num1/num2;//Division operator
		mod=num1%num2;//Modulus operator
	}
	public static int getCount()//class name
	{
		return add;
		}
	public static int getCount1() 
	{
		
		return sub;
	}
		
	public static int getCount2()//class name
	{
			return mul;
	}
	public static int getCount3()//class name
    {
			return div;
			
    }
	public static int getCount4()//class name
	{
			return mod;
	}
		
		
		
	
public static void main(String[]args) {
	new StaticExample2();
	
	// creating Object and default constructor and static method.
	System.out.println("Addition="+StaticExample2.getCount());
	System.out.println("Subtraction="+StaticExample2.getCount1());
	System.out.println("Multiplication="+StaticExample2.getCount2());
	System.out.println("Division="+StaticExample2.getCount3());
	System.out.println("Modulus="+StaticExample2.getCount4());
	
}
}
