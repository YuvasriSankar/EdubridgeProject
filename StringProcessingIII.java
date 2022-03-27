package stringprocess;

import java.util.Scanner;



public class StringProcessingIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		System.out.println(" String :"+moveX(s));
		sc.close();
		


	}


public static String moveX(String s) {
	//use replaceAll()method
	String s1=s.replaceAll("[x]","");//remove all lowercase'x'from the string and store it in s1.
	String s2=s.replaceAll("[^x]","");//remove all characters leaving lowercase 'x' and store it in s2.
	s1+=s2;// concatenate both s1 and s2.
	return s1;
}



}
