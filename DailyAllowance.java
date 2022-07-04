/*dailyAllowance
Read the question carefully and follow the input and output format.

A Sales person daily allowances calculated as follows .
Item              Money (rupees)
Shirt                   15
Saree                 10
other items          5

Given an input array in which the first index represents no.of shirts sold, second index represents the no of sarees sold  and the third index represents the other items sold for a particular day, Calculate the total allowances.

Inlcude a function named dailyAllowance(int items[], int size) that returns an integer, which is the total allowances.

Business Rules:
1) Print "Invalid array size" when size of the array is a negative number and terminate the program
2) Print "Invalid item count" when there is any negative numbers available in the input array and terminate the program
3) Print "Array size greater than 3"  when size of the array is greater than 3 and terminate the program.

Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of the total allowance.

Sample Input 1:
3
10
5
10
Sample Output 1:
250

Sample Input 2:
4

Sample Output 2:
Array size greater than 3*/
package hackerrankprogram;

import java.util.Scanner;

public class DailyAllowance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner scanner= new Scanner(System.in);
	     n=scanner.nextInt();
	
		if(n<0) {
			System.out.println("invalid array size");
			System.exit(0);
		}else if(n>3)
		{
			System.out.println("Array size greater than three");
			System.exit(0);
		}else
		{
			int array[]=new int[n];
			for( i=0;i<n;i++)
			{
				array[i]=scanner.nextInt();
				if(array[i]<0) {
					System.out.println("Invalid Item Count");
					System.exit(0);
				}
			}
			int  shirt=15,saree =10,other=5,allowance=0;
			for(i=0;i<n;i++) {
				
				allowance =(array[0]*shirt)+(array[1]*saree)+(array[2]*other);
			}
			
			System.out.println(allowance);
			
		}

	}

}