/*findMileage
Read the question carefully and follow the input and output format.
Given the cubic capacity(CC) of a bike. Write a function to return the mileage/liter for the given Cubic Capacity(CC). The mileage will be calculated as follows:

if CC is between 100 and 125, mileage is 75
if CC is between 126 and 135, mileage is 70
if CC is between 136 and 150, mileage is 60
if CC is between 151 and 200, mileage is 50
if CC is between 201 and 220, mileage is 35

First line of input consists of an integer that corresponds to CC of a bike. Output consist of an integer, which is the mileage.

Print "Number too large" when the given input CC is greater than 220.
Print "Number too small" when the given input CC is less than 100.

Include a function named findMileage(int cc) whose return type is an integer, which is the mileage.

Sample Input 1:
1

Sample Output 1:
Number too small

Sample Input 2:
160

Sample Output 2:
50*/
package hackerrankprogram;

import java.util.Scanner;

public class CalculateMileage {
	private static int calculateMileage(int cc)
	{
		int mileage=0;
		if(cc>=100&&cc<=125)
			mileage=75;
		else if(cc>=126&&cc<=135)
			mileage=70;
		else if(cc>=136&&cc<=150)
			mileage=60;
		else if(cc>=151&&cc<=200)
			mileage=50;
		else
			mileage=35;
		return mileage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner (System.in);
int cc=scanner.nextInt();
if(cc<100)
{
	System.out.println("Too Small");
}else if(cc>220)
{
	System.out.println("Too Big");
	}else 
	{
		int out=calculateMileage(cc);
		System.out.println(out);
}

	}

}
