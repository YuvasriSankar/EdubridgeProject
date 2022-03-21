import java.util.Scanner;

public class LeapYearExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("The given year is leap year"+year+"and a century year");
			
				}else {

					
						System.out.println("The given year is not leap year"+year+"but a century year");
				}
				}else {
					if(year%4==0) {
				
			
				System.out.println("The given year is leap year "+year);
		}else {

			
				System.out.println("The given year is not leap year "+year);
		}
				}

	}

}

	
