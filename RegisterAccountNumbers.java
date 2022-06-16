/* registerAccountNumbers

Read the question carefully and follow the input and output format.

Given an array in which the elements are in xxxyy format, where first xxx digits represent the Branch code and the yy represents the account
id.  Find out the No of accounts in the given branch code

Input and Output Format :
The first input n corresponds to the size of the array, the next n lines correspond to the elements of the array and the last line of the input corresponds to the branch code.
Output corresponds to the number of accounts in the given branch code
If the given branch code is not available, print 0.

1) Print "Invalid array size" when size of the array is a negative number and terminate the program
2) Print "Invalid account Number" when there is any negative number available in the input array and terminate the program
3) Print "Invalid branch code" when branch code is negative number and terminate the program

Include a function named registerAccountNumbers (int size, int account_numbers[], int branch_code) that returns the no of accounts

Sample Input 1 :
6
12345
12370
12324
13355
13333
14575
123

Sample Output 1 :
3

Sample Input 2 :
-6

Sample Output 2:
Invalid array size*/
package hackerrankprogram;

import java.util.Scanner;

public class RegisterAccountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,temp,bcode,code,count=0;
		Scanner scanner=new Scanner(System.in);
		 n=scanner.nextInt();
		if(n<0) {
			System.out.println("INVALID INPUT");
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
			bcode=scanner.nextInt();
			if(bcode<0) {
				System.out.println("INVALID BRANCH CODE");
				System.exit(0);
				
	}
			for ( i=0;i<n;i++) {
				temp=a[i];
				code=temp/100;
				if(code==bcode)
				count++;
			}
			System.out.println(count);
}
}}