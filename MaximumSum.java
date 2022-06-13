/*3.maximumSum
Read the question carefully and follow the input and output format.

Given an Integer array, find out sum of Even and odd Numbers individually and find the maximum.

Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of maximum of odd and even sum.

1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the program.


Include a function named maximumSum(int numbers[], int size) whose return type is an integer,.

Sample Input 1:
5
12
13
14
15
16

Sample Output 1:
42

Sample Input 2:
-13

Sample Output 2:
Invalid array size*/
package hackerrankprogram;

import java.util.Scanner;

public class MaximumSum {
	static int sumOfEven(int[]array,int size) {
		int sumOfEven =0;
		for(int i=0;i<size;i++) {
			if(array[i]%2 ==0) {
				sumOfEven +=array[i];
			}
		}
		return sumOfEven;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        int[] arr =new int [n];
         for(int i=0;i<=n;i++) {
         arr[i]=scanner.nextInt();
   }
         //checking the array value negative or positive
         int result=0;
         for(int j=0;j<n;j++) {
        	 if(arr[j]>=0) {
        		 result ++;
        	 }else {
        		 result --;
        	 }
         }
         if(n>0 && result==n) {
        	 System.out.println(sumOfEven(arr,n));
         }else if(n<0) {
        	 System.out.println("invalid array size");
        	 
        	 }else if(result !=n) {
        		 System.out.println("invalid value");
         }
	}

}
