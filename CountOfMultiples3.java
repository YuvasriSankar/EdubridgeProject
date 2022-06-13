/*Write a program to find the count of 3 multiples in a given input integer array.
 
Include a function named divisibleBy3 that accepts 2 arguments and returns an int. The first argument is the input array and the second argument is an int that corresponds to the size of the array. The function returns an int that corresponds to the count of 3 multiples.
 
If the size of the array is negative or if any element in the array is negative, print “Invalid Input” and terminate the program.
 
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of an integer that corresponds to the count of 3 multiples
 
Assume that the maximum number of elements in the array is 20.
 
Sample Input 1:
8
1
6
3
5
61
80
102
9
 
Sample Output 1:
4
 
Sample Input 2:
-5
 
Sample Output 2:
Invalid Input
 
Sample Input 3:
5
23
2
-200
 
Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class CountOfMultiples3 {
	public static int divisibleBy3(int[] array, int size) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] % 3 == 0) {
				count += 1;

			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the number to array");
		int[] array = new int[size];
		if (size < 0) {
			System.out.println("Invalid input");
			System.exit(0);
		} else {
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
				if (array[i] < 0) {
					System.out.println("invalid input");
					System.exit(0);
				}
			}
		}
		System.out.println("count of 3 multiples in array:" + divisibleBy3(array, size));
	}

}
