package reversesubstring;

import java.util.Scanner;


public class Reverse_SubString {
	// Reverse Sub String program

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter the String: ");
			String s1= sc.nextLine();
			System.out.println("Beginning index of Reverse string: ");
			int a =sc.nextInt();
			System.out.println("Ending index of reverse string :");
			int b = sc.nextInt();
			StringBuffer sb =new StringBuffer(s1);
			sb.reverse();//Reverse function
			// reverseSubstring() with arguments
			System.out.println("string: "+reverseSubstring(sb,a,b));
			sc.close();

		}


public static String reverseSubstring(StringBuffer sb, int a,int b) {
	StringBuffer sb1=new StringBuffer();
	String ss= sb1.append(sb.substring(a,a+b)).toString();//String Starting and Ending bu using Substring()
	return ss;
}

}

