/*generateCode
Read the question carefully and follow the input and output format.

In a game show everybody got one coupon with some code. They need to generate a code with only even numbers in that coupon. Find the answer.

Input and Output Format :
Input consists of  an integer. Output consist of an integer, which is the generated code.

1) Print "Number too small" when the given input number is a negative number.
2) Print "Number too large" when the given input number is greater than 32767.
3) Print 0 If the coupon does not contain any even numbers.

Include a function named generateCode(int coupon) whose return type is an integer, which is the generated code.

Sample Input 1:
4352

Sample Output 1:
42

Sample Input 2:
1357

Sample Output 2:
0

Sample Input 3:
-1357

Sample Output 3:
Number too small*/

package hackerrankprogram;

import java.util.Scanner;

public class GenerateCouponCode {
static int generateCode(int number) {
	int coupon;
	String evenNum="";
	String num =String.valueOf(number);
	int size = num.length();
	for(int i=0;i<size;i++) {
		if(num.charAt(i)%2==0) {
			evenNum += num.charAt(i);
			
		}
	}
	coupon = Integer.parseInt(evenNum);
	return coupon;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number<0) {
			System.out.println("Number too Small");
			System.exit(0);
		}else if(number>32767) {
			System.out.println("Number too Large");
			System.exit(0);
	}else {
		System.out.println(generateCode(number));
	}

}
}