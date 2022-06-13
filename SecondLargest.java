/*secondLargest
Read the question carefully and follow the input and output format.

Write a function to find second largest number in the given input integer array.

Assume that all elements in the input array are unique.

Input and Output Format :

First line of input consists of n, the number of elements. Next n lines correspond to the array elements.
Output consist of an integer, which is the second largest.

1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative number available in the input array and terminate the program.

Include a function named secondLargest(int array[], int size) whose return type is an integer, the second largest.

Sample Input 1:
5
3
342
53
2
12

Sample Output 1:
53

Sample Input 2:
5
3
342
53
-2


Sample Output 2:
Invalid input*/
package hackerrankprogram;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,largest =0,temp;
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		if(n<0) {
			System.out.print("Invalid array size");
			System.exit(0);
		}else {
			int a[]= new int[n];
			for(i=0;i<n;i++) {
				a[i]=scanner.nextInt();
				if(a[i]<0) {
					System.out.print("Invalid input");
					System.exit(0);
					
				}
			}
			for(i=0;i<n;i++) {
				for(j=i;j<n;j++) {
					if(a[i]<a[j]) {
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
						
					}
				}
			}
		}

	}

}
