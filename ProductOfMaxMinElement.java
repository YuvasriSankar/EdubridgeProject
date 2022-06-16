/*Product of MaxMin Element
Write a program to find the product of the maximum and minimum element in a given input array.
 Include a function named productOfMaxMin that accepts 2 arguments and returns an int. The first argument is the input array and the second argument is an int that corresponds to the size of the array. The function returns an int that corresponds to the product of maximum and minimum element.
If the size of the array is negative or if any element in the array is negative, print “Invalid Input” and terminate the program.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of an integer that corresponds to the product of maximum and minimum element in the array.
Assume that the maximum number of elements in the array is 20.Sample Input 1:
8
2
12
3
4
6
8
10
9
 
Sample Output 1:
24
 
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

public class ProductOfMaxMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp=0,product;
		Scanner scanner=new Scanner(System.in);
		 n=scanner.nextInt();
		if(n<0) {
			System.out.println("INVALID ARRAY SIZE");
			System.exit(0);
			
		}else {
			int a[] =new int[n];
			for ( i=0;i<n;i++)
			{
				a[i]=scanner.nextInt();
				if (a[i] < 0)//flag=1;
				{
					System.out.println("INVALID INPUT");
					System.exit(0);
				}
			}
			for ( i=0;i<n;i++) {
				for ( j=i+1;j<n;j++) {
					if(a[i]<a[j]) {
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
			for( int product1 :a) {//enhanced for loop
				System.out.println(product1);
			}
			product =a[0]*a[n-1];
			System.out.println(product);
		}
	}
}


