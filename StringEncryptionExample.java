package encryption;

import java.util.Scanner;

public class StringEncryptionExample {
	

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
				
				System.out.println(stringFormatting(s1));
	}
	
	}

	

public static String stringFormatting(String s1) {// Function definition
	StringBuffer sb= new StringBuffer();// declaration of String Buffer
	for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(i%2==0) {
				if(c==122)
					c=(char)(c-25);
				else {
					c=(char)(c+1);
				}
				sb.append(c);
			}
			else
				sb.append(c);
				}
			
	
          return  sb.toString();

}
}
