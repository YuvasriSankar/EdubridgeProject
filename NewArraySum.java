/*newArraySum
Read the question carefully and follow the input and output format.

Given an input array which contains age of some employees, write a program to find the sum of ages of employees greater than 18.

Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of an integer, which is the sum.1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative number available in the input array and terminate the program.

Include a function named newArraySum(int age[],int size) whose return type is an integer, which is the sum.

Sample Input 1:
5
21
22
17
10
25
Sample Output 1:
68

Sample Input 2:
6
50
-36

Sample Output 2:
Invalid input*/
package hackerrankprogram;

import java.util.Scanner;

public class NewArraySum {
	static int newArraySum(int age[],int size) {
		int sum=0;
		for(int i=0;i<size;i++) {
			if(age[i]>18) {
				sum+=age[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int size = scanner.nextInt();
int[]array = new int[size];
if(size<0) {
	System.out.println("Invalid array size");
	System.exit(0);
	
}else {
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
		if(array[i]<0) {
			System.out.println("Invalid array size");
			System.exit(0);
			
		}
	}
	System.out.println(newArraySum(array,size));
}
	}

}
