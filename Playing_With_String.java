package playing_with_string;

import java.util.Scanner;

public class Playing_With_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Number of strings in an Array: ");
		int n = Integer.parseInt(in.nextLine());
		String s1[]=new String[n];
		for(int i=0;i<n;i++) {//Input loop
			System.out.println("Enter String" +(i+1)+" : " );
			s1[i]=in.nextLine();
		}
		int a = Integer.parseInt(in.nextLine());
		System.out.println("String:"+formString(s1,n,a));//Function Calling
		in.close();

	}
	// String program
		public static String formString(String s1[], int n,int a) {// Function defintion
			StringBuffer sb= new StringBuffer();// declaration of String Buffer
			for(int i=0;i<n;i++) {
				if(s1[i].length() >= a)//Getting N'th Character
					sb.append(s1[i].substring(a-1,a));
				else
					sb.append("$");
			}
			return sb.toString();
		}
		

	}



