/*6.Fahrenhiet to Centigrade
 Write a program to convert given temperature from Fahrenheit to Centigrade.
Formula:
C/5 = (F-32)/9
C stands for Centigrade.
F stands for Fahrenheit.
 Include a function named convertToCentigrade that accepts an integer argument and returns a float that corresponds to the centigrade equivalent.
 If the input is a negative number, print Invalid Input and terminate the program.
 Input and Output Format:
Input consists of a single integer.
Output consists of a floating point number that corresponds to the centigrade equivalent. The output is displayed correct to 2 decimal places.
Sample Input 1:
77
 Sample Output 1:
25.00
Sample Input 2:
-2345
Sample Output 2:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class FahrenhietToCentigrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter temperture in Fahrenheit:");
	     int fahrenheit = scanner.nextInt();
	     float celsius=0;
	     if(fahrenheit<0)
	    	  System.out.println("Invalid Input");
	     else {
	    	 celsius=((fahrenheit-32)/9)*5;
	    	  System.out.printf("%,2f",celsius);
	     }
	}

}
