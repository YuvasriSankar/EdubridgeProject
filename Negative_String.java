package negative_string;

import java.util.Scanner;


public class Negative_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		System.out.println("Negative String: "+negativeString(str));
		sc.close();

	}
	public static String negativeString(String s) {
		// TODO Auto-generated method stub
		String n= s.replaceAll(" is "," is not ");
		return n;
	}

}


