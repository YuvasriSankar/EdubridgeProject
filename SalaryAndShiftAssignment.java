/*Read the question carefully and follow the input and output format.

Karen got salary for this month and she spends 20% of her salary for food and 30% of her salary for travel. If she takes care of other shifts she will get 2% of the salary per day. Given her salary and the number of shifts she handled. Calculate how much she can save in her pocket after spending all these?

Input and Output Format :
First line of input consists of an integer, salary. Next line correspond to the number of shifts. Output consist of an integer, which is saving.

1) Print "Salary too large" when salary is greater than 8000.
2) Print "Shifts too small" when the shift is less than 0.
3) Print "Salary too small" when the salary is less than 0.

Include a function named calculateSal(int salary, int shifts) whose return type is an integer, which is the saving.

Sample Input 1:
7000
5
Sample Output 1:
4200

Sample Input 2:
80000
Sample Output 2:
Salary too large
Sample Input 2:
6000
-1
Sample Output 2:
Shift too small*/
package hackerrankprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryAndShiftAssignment {
	public static int calSalary(int salary, int shift) {
		double newSal;
		double add= shift*(salary*2/100);
		System.out.println(add);
		newSal=salary+add;
		System.out.println(newSal);
		salary=(int)(newSal-(salary/2));
		return salary;
	}

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferReader= new BufferedReader(new InputStreamReader(System.in));
		int salary = Integer.parseInt(bufferReader.readLine());
		int shift = Integer.parseInt(bufferReader.readLine());
         if(salary>80000) {
        	 System.out.println("salary too large");
         }else if(salary<0) {
        	 System.out.println("salary too small");
         }else if(shift<0) {
        	 System.out.println("salary too small");
         }else {
        	 System.out.println(calSalary(salary,shift));
         }
	}

}
