package name_shrinking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Full Name:");
			String s1=sc.nextLine();
               System.out.println("Shrink Name: "+ UserMainCode.getFormatedString(s1));
               sc.close();
		}
		

	}


