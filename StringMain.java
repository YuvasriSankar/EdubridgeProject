package sting_trimcat;

import java.util.Scanner;

public class StringMain {

		public static void main(String[] args) {
			try (// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the Number of strings in an Array: ");
				String s=sc.nextLine();
					System.out.println(getalternateChar(s));
			}
			
		}


		public static String getalternateChar(String s) {// Function definition
			StringBuffer sb= new StringBuffer();// declaration of String Buffer
			for(int i=0;i<s.length();i=i+2) {
					sb.append(s.charAt(i));
			}
			String str= sb.toString();
			return str;
		}

}