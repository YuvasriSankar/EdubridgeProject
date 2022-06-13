
/*Decimal Conversion
 
Write a program to convert a given input binary number to decimal.
 
Include a function named convertToDecimal that accepts an integer argument and returns an integer that corresponds to the decimal representation of the input number. If the input value is not a binary value or if the input is negative or if the input is greater than 11111, the function returns -1.
 
If the function returns -1, print Invalid Input.
 
Input and Output Format:
Input consists of a single integer that corresponds to the binary representation of a number.
Output consists of a single integer that corresponds to the decimal equivalent of the given number.
Refer sample output for formatting specifications.
 
 
Sample Input 1:
1100
 
Sample Output 1:
12
 
Sample Input 2:
101010
 
Sample Output 2:
Invalid Input
 
Sample Input 3:
1201
 
Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class DecimalConversion {
	static int convertToDecimal(int binary) {
		//for string input>int decimal=Integer.parseInt(binary,2);
		int decimal =0,n=0;
		while(true) {
			if(binary==0) {
				break;
			}else {
				int temp=binary%10;
				decimal+=temp*Math.pow(2, n);
				binary=binary/10;
				n++;
			}
		}
		return decimal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE BINARY NUMBER:");
		int binary =scanner.nextInt();
		String s=Integer.toString(binary);
		boolean flag =false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<2||s.charAt(i)>=0) {
				flag=true;
			}else {
				flag=false;
			}
		}
		if(binary>0 && binary<11111 && flag==true)
			System.out.println(convertToDecimal(binary));
	else {
		System.out.println("Invalid Input");
			}
			
		}
	}


