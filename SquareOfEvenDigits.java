/*Squares of Even Digits
Write a program to find the sum of the squares of even digits in a number.Include a function named sumSquareEven that accepts an integer argument and returns an integer . The function returns -1 if the number is less than zero or if the number is greater than 32767.
Print Invalid Input if the function returns -1.
Input and Output Format:
Input consists of an integer.
Output consists of an integer.
Refer sample output for formatting specifications.
Sample Input 1:
3487
Sample Ouput 1:
80
 Sample Input 2:
-8
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class SquareOfEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		int rem,res=0;
		int sqrt;
		if(number>23767||number<0) {
			System.out.println("Invalid input");
			System.exit(0);
	}else {
		while(number!=0) {
			rem=number%10;
			if(rem%2==0) {
				res+=(rem*rem);
			}
			number=number/10;
			}
		}
		System.out.println(res);
	}

}
