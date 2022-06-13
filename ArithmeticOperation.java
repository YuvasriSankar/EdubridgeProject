/*Arithmetic Operation
 
Write a program to perform a specific arithmetic operation
 
Include a function named performArithmeticOperation that accepts 3 integer arguments and returns an integer that corresponds to the result. The first and second arguments correspond to the input numbers and the third argument corresponds to the choice of arithmetic operation.
 
If argument 3 =1, calculate the sum of input1 and input2
If argument 3 =2, calculate the difference of input1 and input2
If argument 3 =3, calculate the product of input1 and input2
If argument 3 =4, calculate the quotient of input1 divided by input 2
 
If the first two argument's values is negative or greater than 32767 , the function returns -1.
If the third argument's value is not in the range 1 to 4, the function returns -1.
 
If the function returns -1, print Invalid Input.
 
Input and Output Format:
Input consists of 3 integers.
Output consists of an integer.
Refer sample output for formatting specifications.
 
 
Sample Input 1:
4
12
3
 
Sample Output 1:
48
 
Sample Input 2:
-67
2
1
 
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class ArithmeticOperation {
	static int performArithmeticOperation(int arg1, int arg2, int operation) {
		int result=0;
		if (operation ==1 ) {
			result =arg1+arg2;
		} else if (operation == 2 ) {
		   result =arg1-arg2;
		} else if (operation ==3 ) {
			result =arg1*arg2;
		} else if (operation ==4 ) {
			result =arg1/arg2;
		}
		if(result<0) {
			System.out.println("invalid input");
			System.exit(0);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int arg1 =scanner.nextInt();
		int arg2 =scanner.nextInt();
		int operation = scanner.nextInt();
		if((arg1>=0 &&arg2>=0)||(arg1<=32767 && arg2<=32767)) {
			if(operation>0 && operation<=4) {
				System.out.println(performArithmeticOperation(arg1,arg2,operation));
			} else {
				System.out.println("invalid input");
			}
		}
			
				
	}
}
