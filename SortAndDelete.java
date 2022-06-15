/*Sort and Delete
Write a program to delete the given number in the input array and then to sort the array.
 Include a function named sortAndDelete that accepts 3 arguments and its return type is void. The first argument is  the input array and the second argument is an int that corresponds to the size of the array and the third argument is the array element to be deleted. The number of elements in the modified array is stored in the global variable named output1.
If the size of the array is negative or if any of the elements in the array are negative , print “Invalid Input” and terminate the program.
 Please note that the elements in the array may not be unique.
Input and Output Format:
Input consists of n+2 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array. The last integer corresponds to the element to be deleted. Output consists of an integer array.
Refer sample output for formatting specifications.
Assume that the maximum number of elements in the array is 20. Sample Input 1:
8
1
6
3
5
8
10
4
8
8
Sample Output 1:
1
3
4
5
6
10
 Sample Input 2:
-5
 
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndDelete {
	private static void sortAndDelete(int[] array, int size, int num)
	{
		Arrays.sort(array);
		int count=0;
		int[]output=new int[size];
		for(int i=0;i<size;i++) {
			if(num==array[i])
			{
				
			}else
				output[count]=array[i];
			count++;
		}
		for(int out:output)
		{
			if(out!=0) {
				System.out.println(out);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		System.out.println("Enter the Size");
		int size=scanner.nextInt();
		int[] array=new int[size];
		boolean flag=true;
		if(size<0 && size>20) {
			System.out.println("Invalid Input");
		}else
		{
			System.out.println("Enter the array elements");
			for(int i=0;i<size;i++)
			{
				array[i]=scanner.nextInt();
				if(array[i]<0) {
					System.out.println("Invalid Input");
					flag=false;
					break;
					
				}
			}
		}
		System.out.println("Enter the number to delete");
		int num=scanner.nextInt();
		if(flag) {
			sortAndDelete(array,size,num);
		}

	}

}
