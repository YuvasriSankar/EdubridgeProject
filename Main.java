package flushcharacters;

import java.util.Scanner;

public class Main {
//Flush Character program
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String: ");
				String s1=sc.nextLine();
				String s2= UserMainCode.getSpecialChar(s1);// function call
				System.out.println(s2);
		}
		}

	}


