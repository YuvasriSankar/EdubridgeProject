package startcase;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Start_Case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line:");
			String s=sc.nextLine();
			System.out.println("Upper Case of Starting letter of a given Line:"+printCapitalized(s));
			sc.close();
			

	}

public static String printCapitalized(String s) {
	
	// TODO Auto-generated method stub
	String str;
	StringBuffer sb=new StringBuffer();
	StringTokenizer t= new StringTokenizer(s);
	while(t.hasMoreTokens()) {
		String s2=t.nextToken();
		String s3= s2.substring(0,1);
		String s4= s2.substring(1,s2.length());
		sb.append(s3.toUpperCase()).append(s4).append("");
		
}
	str=sb.toString();
	return str;
}

}

