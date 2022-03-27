package name_shrinking;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NameShrinking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Full Name:");
			String s1=sc.nextLine();
               System.out.println("Shrink Name: "+ getFormatedString(s1));
               sc.close();
		}
	public static String getFormatedString(String s1) {
		StringBuffer sb= new StringBuffer();
		StringTokenizer st =new StringTokenizer(s1," ");
		String s2=st.nextToken();
		String s3=st.nextToken();
		String s4=st.nextToken();
		sb.append(s4).append(" ");
		sb.append(s3.substring(0,1));
		sb.append(".");
		sb.append(s2.substring(0,1));
		return sb.toString();
		
		
	}
}



