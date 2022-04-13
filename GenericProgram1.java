


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

public class GenericProgram1 {
	public static void main(String[] a)
	{
		Generic<Integer,Float> generic=new Generic<>(12,13,1.1f,1.2f);
		int res=generic.getA() + generic.getB();
		System.out.println(res);
		
		Generic<Float,Double> generic1=new Generic<>(12.89f,22.98f,45.00,78.98);
		float res1=generic1.getA() + generic1.getB();
		System.out.println(res1);
		
Generic<Double,String> generic2;
		generic2=new Generic<>(12.89,22.98,"one","two");
		double res2=generic2.getA() + generic2.getB();
		System.out.println(res2);

}
}
