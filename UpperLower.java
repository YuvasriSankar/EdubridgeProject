import java.util.Scanner;


public class UpperLower {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			char ch,ch1;
			do {
				System.out.println("Enter the char to check for lower or upper:");
				ch1=scanner.next().charAt(0);
				if(ch1>=65&&ch1<=90)
					{
					System.out.println(" Upper Case");
					}
				else if (ch1>=97&&ch1<=122)
				
					System.out.println(" Lower Case");
					else
						System.out.println(" Not a charater");
					
				System.out.println(" Do you wish you Continue");
				ch=scanner.next().charAt(0);
			}
			while (ch=='y'||ch=='Y');
		}
		}
			

		
		

	}


