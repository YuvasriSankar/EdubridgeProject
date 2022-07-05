/*Read the question carefully and follow the input and output format.

Write a program to find the difference between consecutive digits in the given input integer and display it.

Input and Output Format:
Input consists of an integer and output the difference between the consecutive digits.

Print "Number too small" if the number is less than 0
Print "Number too large" if the number is greater than 32767


Sample Input 1:
1325
Sample Output 1:
213

Sample Input 2:
-13
Sample Output 2:
Number too small*/
package hackerrankprogram;

import java.util.Scanner;

public class DifferentBetweenConseutiveDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
if(number<0||number>32767) {
	System.out.println("Number too small");
	System.exit(0);
	
}else {
	String a= String.valueOf(number);
	String b="";
	for(int i=0;i<a.length()-1;i++) {
		if(a.charAt(i)>a.charAt(i+1)) {
			int c=a.charAt(i)-a.charAt(i+1);
			b+=c;
			
		}else {
			int c=a.charAt(i+1)-a.charAt(i);
			b+=c;
					
		}
	}
	System.out.println(b);
}
	}

}
