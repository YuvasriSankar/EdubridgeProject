/*powerOfTwo
Read the question carefully and follow the input and output format.

Check whether given number is a power of 2 or not .If yes Print 'Yes' else 'No'

Input and Output Format :
Input consists of an integer number. And output is a single line that displays 'Yes' or 'No'

Print "Number too small" if the number is less than 0
Print "Number too large" if the number is greater than 32767

Include a function named powerOfTwo(int n) that returns an integer.


Sample Input 1:
3
Sample Output 1:
No

Sample Input 2:
34569
Sample Output 2:
Number too large*/
package hackerrankprogram;

import java.util.Scanner;

public class PowerOf2 {
	public static String powOf2(int n) {
		if(n==0) {
			return"no";
		}
		
		
	while(n!=1) {
		if(n%2!=0) {
			return"NO";
			
		}
		n=n/2;
	}
	return "YES";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if(number<0) {
			System.out.println("Number too small");
		}else if (number>32767) {
			System.out.println("Number too large");
		}else {
			System.out.println(powOf2(number));
		}
	}
}
