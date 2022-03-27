package flushcharacter;

import java.util.Scanner;

public class FlushCharacter {
	//Flush Character program
		public static void main(String[] args) {
			try (// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the String: ");
					String s1=sc.nextLine();
					String s2= getSpecialChar(s1);// function call
					System.out.println(s2);
			}
			}
		public static String getSpecialChar(String s1) {
			// TODO Auto-generated method stub
			StringBuffer sb= new StringBuffer();
			for(int i=0;i<s1.length();i++) {
				char a =s1.charAt(i);
				if(!Character.isAlphabetic(a))
					sb.append(a);
		}
			return sb.toString();
		}

	}



