/*calculateBonus
Read the question carefully and follow the input and output format.

Given the basic salary as input, write a program to calculate the bonus and display it.

The bonus will be calculated based on the below category.
Basic>20000 bonus=17%of basic+1500
Basic>15000 bonus=15%of basic+1200
Basic>10000 bonus=12%of basic+1000
for rest =8%of basic+500

Input and Output Format :

First line of input consists of n, the basic salary.
Output is a single integer that displays the bonus.

Print "Number too large" when the given input numbers is greater than 32767 .
Print "Number too small" when the given input is a negative number.

Include a function named calculateBonus(int basic) whose return type is an integer, the bonus.

Sample Input 1:
21000

Sample Output 1:
5070

Sample Input 2:
327678
Sample Output 2:
Number too large*/

package hackerrankprogram;

import java.util.Scanner;

public class CalculateBonus {
	static int calculateBonus(int basicSalary) {
		int bonus=0;
		if(basicSalary >20000) {
			bonus =((basicSalary/100)*17)+1500;
		}else if(basicSalary > 15000 && basicSalary <20000) {
			bonus =((basicSalary/100)*15)+1200;
		}else if(basicSalary > 10000 && basicSalary <15000) {
			bonus =((basicSalary/100)*12)+1000;
		}else {
			bonus = ((basicSalary/100)*8)+500;
		}
		return bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt();
		if(salary>32767) {
			System.out.println("Number too Large");
	}else if(salary <0 ) {
		System.out.println("Number too Small");
	}else {
		
		System.out.println(calculateBonus(salary));
	}

}
}
	


