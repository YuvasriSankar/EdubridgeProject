/*Multiples --- Average
 
Write a program to find the average of multiples of 5 upto 'n'. n is given as input.
 
Include a function named findAverageBy5s that accepts an integer argument and returns a float that corresponds to the average of multiples of 5.
 
If the input value is negative or greater than 32767, print Invalid Input and terminate the program.
 
Input and Output Format:
Input consists of a single integer.
Output consists of a floating point number. Output is displayed correct to 2 decimal places.
Refer sample output for formatting specifications.
 
 
Sample Input 1:
10
 
Sample Output 1:
7.50
 
Sample Input 2:
-67
 
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class MultiplesOfAverage {
public float findAverageBy5s(int n) {
	if (n<0||n>32767) {
		System.out.println(" Invalid input");
		
	}
	return n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,count=0;
double sum=0,avg;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(i=5;i<=n;i++) {
	if(i%5==0) {
		sum=sum+i;
		count++;
	}
}
avg=sum/count;
System.out.printf("%.2f",avg);
	}

}
