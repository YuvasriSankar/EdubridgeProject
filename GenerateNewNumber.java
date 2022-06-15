/*generateNewNumber

Read the question carefully and follow the input and output format.

Write a program to generate new number from the given input based on following conditions.

(i) Even digit should be replaced by next Even digit.
(ii) Odd digit should be replaced with next Odd digit

Input and Output Format :
Input consists of an integer. Output is also an integer.

1) Print "Number too small" when any of given input numbers is a negative number.
2) Print "Number too large" when any of given input numbers is greater than 32767.


Sample Input 1:
123

Sample Output 1:345

Sample Input 2:
32768

Sample Output 2:
Number too large*/
package hackerrankprogram;

import java.util.Scanner;

public class GenerateNewNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		int num=scanner.nextInt();
		if(num>32767)
		{
			System.out.println("Too Big");
		}else if(num<0)
		{
			System.out.println("Too Small");
			}else 
			{
			String out=" ";
			String len = Integer.toString(num);
			int adding=0;
			for(int i=0;i<len.length();i++) {
				int out1=0;
				out1=Integer.parseInt(len.valueOf(len.charAt(i)));
				adding=out1+2;
				out+=adding;
			}
				System.out.println(out);
		}

			}

	}


