/*Descending Order Sort
 Write a program to sort the given array in descending order.
 Include a function named sortArray that accepts 2 arguments and its return type is void. The first argument is the input array and the second argument is an int that corresponds to the size of the array. If the size of the array is negative or if any of the elements in the array are negative , print “Invalid Input” and terminate the program.
 Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of an integer array.
Refer sample output for formatting specifications.
Assume that the maximum number of elements in the array is 20.
 Sample Input 1:
8
1
6
3
5
8
10
4
9
 
Sample Output 1:
10
9
8
6
5
4
3
1
 
Sample Input 2:
-5
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderSortArray {
	static void sortArray(int[]array, int size) {
		Arrays.sort(array);
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int value:array) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int size =scanner.nextInt();
		if(size<0) {
			System.out.println("Invalid array size");
		}else {
			int[]array=new int[size];
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
				if(array[i]<0) {
					System.out.println("Invalid input");
					System.exit(0);
				}
			}
			sortArray(array,size);
		}
	}

}
