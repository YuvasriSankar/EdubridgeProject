/*findCricketerId
Read the question carefully and follow the input and output format.

Given an input array first Index indicates the cricketer’s id and second index indicates the score and so on……Find out the cricketer's id who scored more than given score

Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements.The next line of the input consists of an integer that corresponds to the given score. Output consist of an integer array, which contains cricketer's id who have scored more than the given score.

1) Print "Invalid array size" when size of the array is negative and terminate the program .
2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the program.
3) Print "Invalid score" when the score is negative.

Include a function named findCricketerId(int array[], int size, int score) whose return type is void.
The output array is stored in a global variable named cricketer.

Sample Input 1:
6
1
1000
5
2000
3
4000
1000

Sample Output 1:
5
3

Sample Input 2:
6
1
1000
5
3000
3
4000
-1000

Sample Output 2:
Invalid score*/
package hackerrankprogram;

import java.util.Scanner;

public class CricketerIdProgram {
	static void maxScoreId(int[] array, int size,int score) {
		for(int j=1;j<size;j++) {
			if(array[j]>score) {
				System.out.println(array[j-1]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int size = scanner.nextInt();
int[]array = new int[size];
for(int i=0;i<size;i++) {
	array[i]=scanner.nextInt();
	
}
//checking negative value
int result =0;
for(int j=0;j<size;j++) {
	if(array[j]>=0) {
		result++;
	}else {
		result--;
	}
}
int score=scanner.nextInt();
if(size>0 && result==size) {
	maxScoreId(array,size,score);
}else {
	System.out.println("invalid score");
}
	}

		}



