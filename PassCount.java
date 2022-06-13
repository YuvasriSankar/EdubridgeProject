/*passCount
Read the question carefully and follow the input and output format.

Given a input array, First index Represents RollNo second index represents Mark and so on.  Write a program to find the number of students who had cleared the exam.

Note : If marks >=70 then He /she Cleared the exam. Array size is always even.

Input and Output Format :

First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of an integer,

1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative number available in the input array and terminate the program.

Include a function named passCount(int array[], int size) whose return type is an integer , the count.

Sample Input 1:
8
1
70
2
55
3
75
4
80

Sample Output 1:
3

Sample Input 2:
5
6
2
8
-2
Sample Output 2:
Invalid input*/
package hackerrankprogram;

import java.util.Scanner;

public class PassCount {
	static int passCount(int[] array, int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(array[i]>=70) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] array=new int[size];
		if (size>0) {
			for (int i=0;i<size;i++)
			{
				array[i]=scanner.nextInt();
				if (array[i] < 0)
				{
					System.out.println("INVALID INPUT");
					System.exit(0);
				}
			}
       System.out.println(passCount(array,size));
		}else {
			System.out.println("");
		}
	}

}
