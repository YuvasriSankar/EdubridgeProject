class Generic<T,E>//T stands for Type, behave like placeholder
{
	T a,b;
	E x,y;
	public Generic(T a, T b, E x, E y) {
		super();
		this.a = a;
		this.b = b;
		this.x = x;
		this.y = y;
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getB() {
		return b;
	}
	public void setB(T b) {
		this.b = b;
	}
	public E getX() {
		return x;
	}
	public void setX(E x) {
		this.x = x;
	}
	public E getY() {
		return y;
	}
	public void setY(E y) {
		this.y = y;
	}
	
	
	
}

class Student1
{
	String name;

	@Override
	public String toString() {
		return "Student1 [name=" + name + "]";
	}

	public Student1(String name) {
		super();
		this.name = name;
	}
	
	
}


public class GenericExample {
	public static void main(String[] a)
	{
		Generic<String,Student1> generic2;
		generic2=new Generic<>("One","Two",new Student1("Mahesh"),new Student1("raju"));
		String message=generic2.getA() + generic2.getB();
		System.out.println(message);
		
		System.out.println(generic2.getX());
	
		System.out.println(generic2.getY());
	}	
}
   