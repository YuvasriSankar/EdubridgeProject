/*Second Smallest
 Write a program to find the second smallest of all divisors of the given number.
 For example, the divisors of 21 are 1,3,7 and 21. The second smallest divisor is 3.
 Include a function named secondSmallest that accepts an integer argument and returns an integer. The function returns the second smallest divisor or returns -1 if it is a negative number or if it is greater than 32767.
 If the function returns -1, print Invalid Input.
 Input and Output Format:
Input consists of a single integer.
Output consists of a single integer.
Refer sample output for formatting specifications.
Sample Input 1:
21
 Sample Output 1:
3 Sample Input 2:
-241
 Sample Output 2:
Invalid Input
Sample Input 3:
50000
 Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number<0||number>32767) {
			System.out.println("Invalid Input");
			System.exit(0);
			
		}else {
			System.out.println(secondSmallest(number));
		}

	}
	private static int secondSmallest(int number) {
		int out =0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				if(i!=1) {
					out=i;
					break;
				}
			}
		}
		return out;
	}

}
