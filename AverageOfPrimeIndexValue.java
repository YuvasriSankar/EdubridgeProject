/*primeIndexSum
Read the question carefully and follow the input and output format.

Given an Integer array. Find the average of the numbers located on the Prime Indexes of the Array. Consider 0 index as 1 and 1 index is 2 and so on……

Hint :Consider 1 is not a prime number

Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements . Output consists of an Integer, the prime index sum.

1) Print "Invalid array size" when size of the array is a negative number.
2) Print "Invalid input" when there is any negative numbers available in the input array.

Include a function named primeIndexSum(int array[], int size) whose return type is an integer,which is the sum.

Sample Input 1:
7
2
4
5
1
9
3
8

Sample Output 1:
6

Sample Input 2:
-7

Sample Output 2:
Invalid array size*/
package hackerrankprogram;

import java.util.Scanner;

public class AverageOfPrimeIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,count=0,sum=0,temp=0,avg;
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if(number<0) {
			System.out.print("Invalid array size");
					System.exit(0);
					
		}else {
			int a[]=new int[number+1];
			for(i=1;i<=number;i++) {
				a[i]=scanner.nextInt();
				if(a[i]<0) {
					System.out.print("Invalid input");
					System.exit(0);
					
				}
				
			}
			for(i=1;i<=number;i++) {
				count=0;
				for(j=1;j<=i;j++) {
					if(i%j==0)
						count++;
				}
				if(count==2) {
					sum=sum+a[i];
					temp++;
				}
			}
			avg=sum/temp;
			System.out.print(avg);
		}
	}
}
