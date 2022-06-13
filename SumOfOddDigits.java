/*Sum of Odd Digits
 
Write a program to find the sum of the odd digits in a number.
 
Include a function named sumOddDigits that accepts an integer argument and returns an integer that corresponds to the sum of the odd digits. The function returns -1 if the input is less than zero or if it is greater than 32767.
 
If the function returns -1, print “Invalid Input”.
 
Input and Output Format:
 
The input consists of an integer.
The output consists of an integer that corresponds to the sum of the odd digits in the number.
 
Sample Input 1:
3487
 
Sample Ouput 1:
10
 
Sample Input 2:
-8
 
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class SumOfOddDigits {
	public int sumOfOddDigits (int n) {
		if (n<0||n>32767) {
			System.out.println(" Invalid input");
			
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,rem,sum=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		while(n!=0) {
			rem=n%10;
			if(rem%2!=0)
				sum=sum+rem;
			n=n/10;
			
		}
System.out.println(sum);
	}

}

