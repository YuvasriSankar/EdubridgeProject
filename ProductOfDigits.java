package hackerrankprogram;

import java.util.Scanner;

public class ProductOfDigits {
	static int productOfDigit(int n) {
		int out=1;
		while(n>0) {
			int remainder = n%10;
			out *=remainder;
			n = n/10;
		}
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int product = productOfDigit(n);
		if(n>=0 && n<=32767 &&product>=0) {
			
		
		System.out.println(product);
    }else  {
   	 System.out.println("invalid input");
	}
	}

}
