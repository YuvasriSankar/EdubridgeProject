/*Largest Array
 
Write a program which takes two arrays of the same size as a input and compares the first element of first array with the first element of second array and stores the largest of these into the first element of the output array. Repeat the process till the last element of the first array is checked with the last element of the second array.
 
Include a function named largestArray that accepts 3 arguments and its return type is void. The first argument is input array 1, the second argument is  input array 2 and the third argument is an int that corresponds to the size of the array. The output array is stored in a global variable named output1.
 
If the size of the array is negative or if any element in the array is negative, print �Invalid Input� and terminate the program.
 
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of the largest array.
Assume that the maximum number of elements in the array is 20.
 
Sample Input 1:
4
2
1
3
4
1
9
2
8
 
Sample Output 1:
2
9
3
8
 
 
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

public class LargestArray {
	public void largestArray(int a[],int b[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(n<0) {
			System.out.print("Invalid array size");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,flag=0;
		Scanner scanner = new Scanner(System.in);
		 n=scanner.nextInt();
		int a[]= new int[n];
		for(i=0;i<n;i++) {
			a[i]=scanner.nextInt();
			if(a[i]<0) {
				System.out.print("Invalid input");
				System.exit(0);
				
			}
		}
		int b[]= new int[n];
		for(i=0;i<n;i++) {
			b[i]=scanner.nextInt();
			if(b[i]<0) {
				System.out.print("Invalid input");
				System.exit(0);
	}
		}
}
}