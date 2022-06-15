/*Minimum of 3
 Write a program to find the minimum of 3 numbers.
 Include a function named findSmallest that accepts 3 integer arguments and returns an integer that corresponds to the minimum value.
Input and Output Format:
Input consists of 3 integers.
Output consists of an integer.
Refer sample output for formatting specifications.
Sample Input 1:
4
12
3
 Sample Output 1:
3*/
package hackerrankprogram;

import java.util.Scanner;

public class MinimumOfThree {
	private static int Smallest(int input1,int input2,int input3)
	{
		if(input1<input2&&input1<input3) {
			return input1;
		}else if(input2<input1&&input2<input3) {
			return input2;
		}else
			return input3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		int input1=scanner.nextInt();
		int input2=scanner.nextInt();
		int input3=scanner.nextInt();
		System.out.println(Smallest( input1,input2, input3));
	}

}
