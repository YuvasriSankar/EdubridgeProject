package Stringprocessinglongshortlong;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter String 1:");
		String s1=in.nextLine();
		System.out.println("Enter String 2:");
		String s2=in.nextLine();
		System.out.println("Join String :"+UserMainCode.getCombo(s1,s2));
		in.close();
		
		

	}

}
