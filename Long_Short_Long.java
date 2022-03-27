package stringprocesslong_short_long;

import java.util.Scanner;



public class Long_Short_Long {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter String 1:");
		String s1=in.nextLine();
		System.out.println("Enter String 2:");
		String s2=in.nextLine();
		System.out.println("Join String :"+getCombo(s1,s2));
		in.close();
		

}
public static String getCombo(String s1, String s2) {
		
		// TODO Auto-generated method stub
		if(s1.length()>s2.length())
			return s1+s2+s1;
		return s2+s1+s2;
	}

}
