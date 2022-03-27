package occurancecount;

import java.util.Scanner;
import java.util.StringTokenizer;

public class OccuranceCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Line:");
		String s=sc.nextLine();
		System.out.println("Enter the Word:");
		String s1=sc.next();
		int count=countWords(s,s1);
		System.out.println("No. of words: "+count);
		sc.close();

	}
	public static int countWords(String s, String s1) {
		int count=0;
		String s3;
		 StringTokenizer str = new StringTokenizer(s);
		while(str.hasMoreTokens()) {
			s3=str.nextToken();
			if(s3.equals(s1))
				count++;
		}
		
		return count;
	}

}


