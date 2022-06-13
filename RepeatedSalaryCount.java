 /*Repeated Salary Count
 John is working as a clerk in an organization where N number of people are working. His boss has asked him to get the count of employees who get same salary. Help him to get the count of repeated salary.
 Include a function named countRepeaters that accepts 2 arguments and returns an int. The first argument is the input array and the second argument is an int that corresponds to the size of the array. The function returns an int that corresponds to the number of repeaters.
 If the size of the array is negative or if any of the array elements are negative, print “Invalid Input” and terminate the program.
 Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of an integer that corresponds to the number of repeaters.
 Assume that utmost one element in the array would repeat.
Assume that the maximum number of elements in the array is 20.
 
Sample Input 1:
5
1000
2000
3500
2000
5000
 
Sample Output 1:
2
 
Sample Input 2:
-5
 
Sample Output 2:
Invalid Input
 
Sample Input 3:
5
1000
-2000

Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class RepeatedSalaryCount {
	private static int countReapeater(int size,int[] array) {
		int count=1;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j< size;) {
				if(array[i]==array[j]) {
					count++;
					for(int k=j;k<size-1;k++) 
						array[k]=array[k+1];
						size--;
					} else
						j++;
						
					}
				}
			return count;
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int[]array= new int[size];
		if(size<0) {
			System.out.println("Invalid Input");
		}else
		{
	
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
		if(array[i]<0) {
			System.out.println("Invalid Input");
		}
	}
		}
	System.out.println("The Repeated salary count is "+ RepeatedSalaryCount.countReapeater(size,array));
}
}
		
		

	


