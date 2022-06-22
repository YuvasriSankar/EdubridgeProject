/*Array Multiplication in Reverse
A company wanted to know the reward points of the employee so that at the end of every month they will credit some amount along with their salary. Each employee has 2 separate lists, in first list records will be sorted in employee’s employee number in ascending order. Second list records will be sorted in employee’s employee number in descending order. Hence the management has decided to multiply both the reward points and credit the amount based on the points. Here they followed the formula for multiplying the first entry value in the first list with the last entry value in the second list and second entry from the first list with the second last record from the second list. Repeat the same for all the entries in the lists.
 Include a function named arrayProduct that accepts 3 arguments and ints return type is void. The first argument is the input array 1, the second argument is  the input array 2 and the third argument is an int that corresponds to the size of the array. The output array is stored in a global variable named output1.
 
If the size of the array is negative or if any element in any of the array is negative , print “Invalid Input” and terminate the program.
 Input and Output Format:
Input consists of utmost 2n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. If any of the inputs are invalid, then terminate the program.
 Output consists of n integers that correspond to the elements in the result array.
 Assume that the maximum size of the array is 20.
Sample Input 1 :
5
23
2
5
32
76
22
21
42
4

Sample Output 1 :
92
84
105
64
152
Sample Input 2:
-5
Sample Output 2:
Invalid Input
Sample Input 3:
5
23
2
-5
 
Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class ArrayMultiplicationInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner scanner=new Scanner(System.in);
		n = scanner.nextInt();
		if(n<0) {
			System.out.println("Invalid array size");
			System.exit(0);
			
		}else {
			int a[] = new int[n];
			for( i=0;i<n;i++) {
				a[i]=scanner.nextInt();
				if(a[i]<0) {
					System.out.println("Invalid array element");
					System.exit(0);
					
				}
			}
			int b[] = new int[n];
			for( i=0;i<n;i++) {
				b[i]=scanner.nextInt();
				if(b[i]<0) {
					System.out.println("Invalid array element");
					System.exit(0);
				}
			}
			int c[] = new int[20];
			for( i=0,j=n-1;i<n&&j>=0;i++,j--) {
				c[i]=a[i]*b[j];
			System.out.println(c[i]);
		}
	}
	}
}
