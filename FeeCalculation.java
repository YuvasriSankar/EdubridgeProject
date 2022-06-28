/*feeCalculation
Read the question carefully and follow the input and output format.

Student Fees is calculated according to the student's 10th marks. The student will get discount in fees as follows :

Marks discount(%)
>90         -  50%
81-90      - 25%
70-80      - 10%
<70         -  0%
Calculate the fees according to above table.

Note:
Formula : fees - (fees* discount(%))
Print "Invalid mark" if the mark is greater than 100
Print "Invalid fee" if the fee is greater than 32767
Print "Invalid input" if any of the input is negative

Input and Output Format :
First line of input represents the fee, second line of input represents the marks of student.

Sample Input 1:
10000
95
Sample Output 1:
5000

Sample Input 2:
15896
101
Sample Output 2:
Invalid mark*/
package hackerrankprogram;

import java.util.Scanner;

public class FeeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int discountFee;
		Scanner scanner=new Scanner(System.in);
		int fee =scanner.nextInt();
		int mark=scanner.nextInt();
		if(mark>100) {
			System.out.println("Invalid mark");
		}if(fee>32767) {
			System.out.println("Invalid fee");
		}if(mark<0||fee<0) {
			System.out.println("Invalid mark");
		}else {
			if(mark>90) {
				discountFee=fee-((fee*50)/100);
				System.out.println(discountFee);
			}else if(mark>70 && mark<80) {
				discountFee=fee-((fee*10)/100);
				System.out.println(discountFee);
			}else if(mark>81 && mark<90) {
				discountFee=fee-((fee*25)/100);
				System.out.println(discountFee);
				
			}else if(mark>70) {
				discountFee=fee-((fee*0)/100);
				System.out.println(discountFee);
		}

	}

}
}