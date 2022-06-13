/*findFirstLargest

Read the question carefully and follow the input and output format.

Write a function to find the product of the first and the third largest numbers in the given input integer array.

Input and Output Format :
First line of input corresponds to n, the size of array and next n lines correspond to the elements of the array

Print "Invalid array size" when size of the array is a negative number and terminate the program
Print "Invalid number" when there is any negative numbers available in the input array and terminate the program.

Include a function named findFirstLargest(int n, int array[]) that returns an integer, product of first and third largest numbers.

Sample Input 1:
5
11
241
83
8
2

Sample Output 1:
2651

Sample Input 2:
3
83
-8
Sample Output 2:
Invalid number*/

package hackerrankprogram;

import java.util.Scanner;

public class ProductOfFirstThirdLargestNumInArray {
	static int productOfFirstThirdLargestNumInArray(int[]array,int size) {
		int ProductOfFirstThirdLargestNumInArray ;
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		ProductOfFirstThirdLargestNumInArray = array[size-1]*array[size-3];
		return ProductOfFirstThirdLargestNumInArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		if(size<0) {
			System.out.println("invalid array size");
			System.exit(0);
		}else {
			int[]array = new int[size];
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
				if(array[i]<0) {
					System.out.println("invalid array size");
					System.exit(0);
				}
			}
			System.out.println(productOfFirstThirdLargestNumInArray(array,size));
		}

	}

}
