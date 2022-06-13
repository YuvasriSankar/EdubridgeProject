/*Leap Year
 
Write a program to find whether the given input year is a Leap Year.
 
Include a function named checkLeapYear that accepts an integer and returns an integer. The function returns
1.	1 if the input is a Leap Year
2.	0 if the input is not a Leap Year
3.	-1 if the input is a negative number
Print Invalid Input if the function returns -1.
 Input and Output Format:
Input consists of a single integer.
Refer sample output for formatting specifications.
 Sample Input 1:
2000
 Sample Output 1:
yes
Sample Input 2:
1610
Sample Output 2:
no
Sample Input 3:
-2345
Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		if(year<0) {
			System.out.print("Invalid array size");
			System.exit(0);
		}
if(year%4 ==0)
	System.out.println("yes");
else
	System.out.println("No");
	}

}
