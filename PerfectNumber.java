/*Perfect Number
 
Write a program to find whether the given number is a perfect Number.
 
A number is a perfect number if the sum of the proper divisors of the number is equal to the number itself.
 
Include a function named findPerfect that accepts an integer argument and returns an integer. The function returns
1.       1 if the input is a Perfect Number
2.       0 if the input is not a Perfect Number
3.       -1 if the input is a negative number or if it is greater than 32767
 
Input and Output Format:
Input consists of a single integer.
Output consists of a string.
Refer sample output for formatting specifications.
 
 
Sample Input 1:
6
 
Sample Output 1:
yes
 
Sample Input 2:
241
 
Sample Output 2:
no
 
Sample Input 3:
-9                                                                                                                                                                                                             Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		if(number<0||number>32767) {
			System.out.println("Invalid input");
			System.exit(0);
	}else {
		for(int i=1;i<number;i++) {
			if(number %i==0) {
				sum+=i;
			}
		}
		if(sum==number) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	}

}
