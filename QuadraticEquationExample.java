import java.util.Scanner;

public class QuadraticEquationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter value of A: ");
		double a=scanner.nextDouble();
		System.out.println("Enter value of B: ");
		double b=scanner.nextDouble();
		System.out.println("Enter value of C: ");
		double c=scanner.nextDouble();
		double root1=0;
		double root2=0;
		double Discriminant=b*b-4*a*c;
		if(Discriminant<0) {
			System.out.println("Root are imaginary... ");
			
		}
		if(Discriminant==0) {
			System.out.println("Root are equal... ");
			//root=-b/2*a;
			root1=-b/(2*a);
			root2=-b/(2*a);
			
		}
		if(Discriminant>0) {
			System.out.println("Root are unequal... ");
			root1=(-b+Math.sqrt(Discriminant))/(2*a);
			root2=(-b-Math.sqrt(Discriminant))/(2*a);
			
		}
		System.out.println("Roots  of the Quadratic Equation are : ");
		System.out.println("Root1:"+root1 );
		System.out.println("Root2:"+root2 );
		




	}

}
