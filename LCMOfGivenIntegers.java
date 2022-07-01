/*LCM
 
Write a program to calculate the LCM of the 2 given integers.
 
Include a function named calculateLCM that accepts 2 integer arguments and returns an int that corresponds to the LCM of the 2 numbers.
 
Print Invalid Input and terminate the program in the following cases:
1.       Any of the 2 inputs is greater than 1000
2.       Any of the 2 inputs is negative
 
 
Input and Output Format:
Input consists of 2 integers.
Output consists of a single integer that corresponds to the LCM.
 

Sample Input 1:
10
8
 
Sample Output 1:
40
 
 
Sample Input 2:
50000
 
 
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class LCMOfGivenIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
int num1=scanner.nextInt();
if(num1>1000||num1<0) {
	System.out.println("Invalid Input");
	System.exit(0);
}
int  num2=scanner.nextInt();
if(num2>1000||num2<0) {
	System.out.println("Invalid input");
	System.exit(0);
}
int lcm=(num1>num2)?num1:num2;
while(true) {
	if(lcm%num1==0&&lcm%num2==0) {
		System.out.println(lcm);
		break;
	}
	lcm++;
}
	}

}
