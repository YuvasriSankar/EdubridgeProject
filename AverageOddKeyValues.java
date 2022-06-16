/*avgOddKeyValues
Read the question carefully and follow the input and output format.
Given an input array, First index represents key and second index represents the value and so on... Write code to find out the average of all values whose keys are odd numbers.

Input and Output Format :
First line of input consists of n, the next n lines correspond to the elements of the array. Output consist of the an integer.

Print "Invalid array size" when size of the array is a negative number and terminate the program.
Print "Invalid input" when there is any negative number available in the input array and terminate the program.

Sample Input 1:
8
1
3
2
4
3
16
4
25
Sample Output 1:
9
Sample Input 2:
-3
Sample Output 2:
Invalid array size*/
package hackerrankprogram;

import java.util.Scanner;

public class AverageOddKeyValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i ,sum=0,count=0,avg;
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
			//if(flag!=1)
			for ( i=0;i<n;i=i+2)	{
				if (a[i] %2!= 0) {
					sum =sum+a[i+1];
					count++;
				}
			}
              avg=sum/count;

             System.out.println(avg);
	}
	}

}
