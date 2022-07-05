/*secondMaxMinDiff
Read the question carefully and follow the input and output format.

Given an input array, find the difference b/w second largest and second smallest element in the array.

Hint : There is no repetition of element in the array.

Input and Output Format:

First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of an integer, which is the difference b/w second largest and second smallest..

1) Print Invalid array size when size of the array is negative and terminate the program.
2) Print Invalid input when there is any negative numbers available in the input array and terminate the program.

Include a function named secondMaxMinDiff(int[] array, int n) whose return type is an integer, which is the difference b/w second largest and second smallest.

Sample Input 1:
5
1
2
3
4
5

Sample Output 1:
2

Sample Input 2:
4
-3

Sample Output 2:
Invalid input*/
package hackerrankprogram;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxMinDiff {
	static int secondMaxDiff(int[] array,int size) {
		int diff=0;
		Arrays.sort(array);
		diff=array[size-2]-array[1];
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				int size = scanner.nextInt();
				int array[]=new int[size];
				if(size<0) {
					System.out.print("Invalid Input");
					System.exit(0);
				}else {
					for( int i=0;i<size;i++) {
						array[i]=scanner.nextInt();
						if(array[i]<0) {
							System.out.print("Invalid Input");
							System.exit(0);
						}
					}
				
				System.out.println(secondMaxDiff(array,size));
			}

		}
	}


