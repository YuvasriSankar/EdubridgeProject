/*sumPrimeArray
Read the question carefully and follow the input and output format.

John is working in a bank. He has created account details transaction in a file and protected it with a password. He sent the file to his manager for review. The file is protected with a password. The password is the sum of Prime numbers. Write a function to generate the password.

Input and Output Format:
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of an integer, which is the sum.

1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative number available in the input array and terminate the program.
3) Print 0, when there are no prime numbers in a given input array.

Include a function named sumPrimeArray(int array[], int size) whose return type is an integer, which is the prime sum.

Sample Input 1:
5
1
2
3
4
5

Sample Output 1:
10

Sample Input 2:
3
4
8
9

Sample Output 2:
0*/
package hackerrankprogram;

import java.util.Scanner;

public class SumPrimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,i,j ,sum=0,count=0,avg;
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
			for(i=0;i<n;i++) {//if(flag!=1){
				count=0;
				for(j=1;j<=a[i];j++) {
					if(a[i]%j==0)
						count++;
				}
				if(count==2)
					sum=sum+a[i];
			}
			System.out.println(sum);
				}
			}

}
