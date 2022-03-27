package stringprocess_replication;

import java.util.Scanner;


public class Replication {
	//Replication
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the String:");
			String s=sc.next();
			System.out.println("Enter the Number of times to print a String:");
			int n=sc.nextInt();
			String s2 = repeatString(s,n);
			System.out.println("Repilcation String :"+s2);
			sc.close();
			

}
		public static String repeatString(String s, int n) {
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<n;i++)
			{
				sb.append(s);
				
			}
			return sb.toString();
		}

	}
