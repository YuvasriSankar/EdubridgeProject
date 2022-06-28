/*endWithThree

Read the question carefully and follow the input and output format.

Given an input array, Find out the count of numbers that ends with 3.

Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of the count of numbers that ends with 3.

Print "Invalid array size" when size of the array is a negative number and terminate the program
Print "Invalid input" when there is any negative number available in the input array and terminate the program.

Sample Input 1:
5
23
353
33
12
14
Sample Output 1:
3

Sample Input 2:
5
1
7
3
-8
Sample Output  2:
Invalid input*/
package hackerrankprogram;

import java.util.Scanner;

public class EndWithThree {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		Scanner scanner=new Scanner(System.in);
		int size =scanner.nextInt();
		if(size<0) {
			System.out.println("Invalid array size");
		}else {
			int[]array=new int[size];
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
				if(array[i]<0) {
					System.out.println("Invalid input");
					System.exit(0);
				}
			}
			for(int i=0;i<size;i++) {
				if(array[i]%10 == 3) {
					count++;
				}
			}
			System.out.println(count);
	}

}
}