/*Array Product
Write a program to find the product of positive/nonnegative elements in a given array.
 Include a function named calculateProduct that accepts 2 arguments and returns an int. The first argument is the input array and the second argument is an int that corresponds to the size of the array. The function returns an int that corresponds to the product.
If the size of the array is negative or if it is greater than 10 or if any element in the array is more than 2 digits, print “Invalid Input” and terminate the program.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of an integer that corresponds to the product of positive numbers in the array.

Sample Input 1:
8
1
-2
3
4
-6
810
-6
 
Sample Output 1:
960
 
Sample Input 2:
-5
 
Sample Output 2:
Invalid Input
 
Sample Input 3:
5
23
2
200
 
Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class ArrayProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,product=1;
		Scanner scanner=new Scanner(System.in);
		n = scanner.nextInt();
		if(n<0||n>10) {
			System.out.println("Invalid array size");
			System.exit(0);
	}else {	
		int a[]= new int[n];
		
		for( i=0;i<n;i++) {
			a[i]=scanner.nextInt();
			if(a[i]>100 ||a[i]<=-100) {
				System.out.println("Invalid input");
				System.exit(0);
		}
			}
		for(i=0;i<n;i++) {
			  if(a[i]>0)
				  product=product*a[i];
		System.out.println(product);
		}
		}
	}

	}
