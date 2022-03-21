import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Number:");
			int num=sc.nextInt();
			if(num%2==0)
			{
				System.out.println("The given Number is Even ");
			}else
				System.out.println("The given Number is Odd");
		}
	}
		/*int n=10;
		System.out.println("Odd"+"     "+"Even");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
			}else
				System.out.print(i+"       ");
		}*/

	}


