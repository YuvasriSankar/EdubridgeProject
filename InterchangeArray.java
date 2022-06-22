/*Interchange Array
 Write a program to interchange the first element in the array with the last element in the array. Repeat the process till the middle of the array.
 Include a function named interchangeArray that accepts 2 arguments and its return type is void. The first argument is the input array and the second argument is an int that corresponds to the size of the array.
If the size of the array is negative or if any element in the array is negative, print “Invalid Input” and terminate the program.
Input and Output Format:Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of the interchanged array.
Assume that the maximum number of elements in the array is 20.
 Sample Input 1:
4
2
1
3
4

Sample Output 1:
4
3
1
2
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

public class InterchangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
if(n<0) {
	System.out.print("Invalid input");
	System.exit(0);
}else {
	int a[]=new int[n];
	for(i=0;i<n;i++) {
		a[i]=scanner.nextInt();
		if(a[i]<0) {
			System.out.print("Invalid input");
			System.exit(0);
		}
	}
	for(i=0,j=n-1;i<n/2;i++,j--) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}
	}


