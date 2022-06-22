/*Armstrong Number
 Write a program to find whether the given input number is an Armstrong Number.
 Include a function named checkArmstrong that accepts an integer and returns an integer. The function returns
1.       yes if the input is an Armstrong number
2.       no if the input is not an Arnstrong number
3.       Invalid Input if the input is a negative number or if the input is not a 3-digit number.
Print Invalid Input if the function returns -1.
 Input and Output Format:
Input consists of a single integer.
Refer sample output for formatting specifications. Sample Input 1:
153
Sample Output 1:
yes
Sample Input 2:
161
 Sample Output 2:
no
 Sample Input 3:
2345
Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class ArmstrongNumber {


	 static boolean isArmstrong(int n) {
			int temp, last=0,digits=0,sum=0;
			temp=n;
			while(temp>0) {
				temp=temp/10;
				digits++;
				
			}
			 temp=n;
			while(temp>0){
				last=temp%10;
				sum+=(Math.pow(last, digits));
				temp=temp/10;
				
			}
			if(n==sum) {
				return true;
			}else {
				return false;
		}
	 }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int num;
				Scanner scanner=new Scanner(System.in);
				System.out.print("Enter the number:" );
				num=scanner.nextInt();
				/*
				 * for(int i=0;i<=num;i++) { if(isArmstrong(i)) { System.out.print(i+" ");
				 * 
				 * } }
				 */
				if(isArmstrong(num)) {
				System.out.println("ARMSTRONG NUMBER");
				}
				else {
					System.out.println("NOT ARMSTRONG NUMBER");	
				}
	}

}
