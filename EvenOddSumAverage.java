/*Odd Even Average

The Owner of a block visited the Layout and found that he has some plot numbers of his own and some are odd numbers and some are even numbers. He is maintaining the details in a file in the system. For the password protection our owner has followed one formula. He calculated the sum of his even numbers plot and sum of odd numbers plot and found the average of those two and he used that average as his password for the details file. Find the password that our owner has arrived.
 
Include a function named avgOddEvenSum that accepts 2 arguments and returns a float. The first argument is the input array and the second argument is an int that corresponds to the size of the array. The function returns a float that corresponds to the average of the array.
 
If the size of the array is negative or if any element in the array is negative , print “Invalid Input” and terminate the program.
 
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of a floating point number that corresponds to the average. It is displayed correct to 2 decimal places.
Assume that the maximum size of the array is 20.
 
Sample Input 1:
5
1
2
3
4
5
 
Sample Output 1:
7.50
 
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

public class EvenOddSumAverage
{
	static float evenOddSumAverage(int[] array,int size)
	{
		float average=0.00f;
		float even=0,odd=0;
		for(int i=0;i<size;i++)
		{
			if(array[i] %2 == 0)
			{
				even += array[i];
			}else if(array[i] %2 !=0)
			{
				odd += array[i];
			}
		}
		average = (even+odd)/2;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		int size=scanner.nextInt();
		System.out.println("ENTER THE NUMBERS TO ARRAY");
		int[] array=new int[size];
		if (size<0)
		{
			System.out.println("INVALID INPUT");
			System.exit(0);
		}else
		{
			for (int i=0;i<size;i++)
			{
				array[i]=scanner.nextInt();
				if (array[i] < 0)
				{
					System.out.println("INVALID INPUT");
					System.exit(0);
				}
			}
		}
		

	}

}