package innerclass;

public class LocalInnerClass {
	void display() {//Instance method of the outer class
		class Test {
			void sum() {// method - LocalInnerClass 
				System.out.println("This method will sum two number");
			}
		}
		Test obj=new Test();//Accessing the inner class
		obj.sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass obj= new LocalInnerClass();//Outer class object.
		obj.display();

	}

}
