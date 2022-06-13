/*4.Product of Digits
 In a car racing video game, the car is an object. You can drive the car, turn the car, or stop the car when needed but you need to drive long. You will get money according to the Km you have travelled. For example if you have travelled 123 km then the product of the km (ie 1*2*3 = 6) would be the amount you win. Write a program to find the product of the digits in the given input number.
 Include a function named productDigits that accepts an integer argument and returns an integer that corresponds to the product of digits in the integer.
The function returns -1 if the input number is negative or greater than 32767.
 If the function returns -1, print Invalid Input.
 Input and Output Format:
Input consists of an integer.
Output consists of an integer.
Refer sample output for formatting specifications.
 Sample Input 1:
32
Sample Output 1:
6
 Sample Input 2:
-67
Sample Output 2:
Invalid Input*/
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
