/*digitFactorial
Read the question carefully and follow the input and output format.

In a given input number , find out the factorial of each individual digit and assign it to output array.

Input and Output Format:
Input consists of a single integer. Output consists of an Integer array, the individual factorials.

Print "Number too large" when the given input numbers is greater than 32767 .
Print "Number too small" when the given input is a negative number.

Include a function named digitFactorial(int number) whose return type is void.
The output array is stored in a global variable named factorial.

Sample Input 1:
123

Sample Output 1:
1
2
6


Sample Input 2:
-2526

Sample Output 2:
Number too small*/
package hackerrankprogram;

import java.util.Scanner;

public class DigitFactorial {
	static void digitFactorial(int number) {
		String num =String.valueOf(number);
		int length=num.length();
		int[] factorial=new int[100];
		int fact =1;
		for(int i=0;i<length;i++) {
			int j=Character.digit(num.charAt(i),10);
			for(int k=1;k<=j;k++) {
				fact=fact*k;
			}
			factorial[i]=fact;
			fact=1;
		}
		for(int a=0;a<length;a++) {
			System.out.println(factorial[a]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int number =scanner.nextInt();
		if(number>32767) {
			System.out.println("Number too large");	
		}else if(number<0) {
			System.out.println("Number too small");	
		}else  {
			digitFactorial(number);
		}
		scanner.close();
	}


	}


