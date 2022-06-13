/*Element Count
 
Write a program to find the number of times a particular number occurs in a given input array.
 
Include a function named findElementCount that accepts 3 arguments and returns an int. The first argument is the input array, the second argument is an int that corresponds to the size of the array and the third argument is the element to be searched for. The function returns an int that corresponds to the number of times the search element occurs in the array.
 
If the size of the array is negative or if any element in the array is negative, print “Invalid Input” and terminate the program.
 
Input and Output Format:
Input consists of n+2 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array. The last integer corresponds to the element whose count needs to be found.
Output consists of an integer that corresponds to the number of times the search element occurs in the array.
Assume that the maximum number of elements in the array is 20.
 
 
Sample Input 1:
8
2
1
3
8
6
8
10
8
8
 
Sample Output 1:
3
 
Sample Input 2:
-5
 
Sample Output 2:
Invalid Input
 
Sample Input 3:
5
23
2
-200
 
Sample Output 3:
Invalid Input*/
package hackerrankprogram;

import java.util.Scanner;

public class RepeatedCount {
	private static int countRepeater(int[]array,int size,int search) {
	int count=0;
	for(int i=0;i<size;i++) {
		if(search == array[i]) {
			count+=1;
		}
		}
	return count;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the number to array");
		int[] array = new int[size];
		if (size < 0) {
			System.out.println("Invalid input");
			System.exit(0);
		} else {
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
				if (array[i] < 0) {
					System.out.println("invalid input");
				}
			}
		}
		System.out.println("Enter the number to search: ");
		int search=scanner.nextInt();
		System.out.println("The repeater" +search+ "count is"+ countRepeater(array,size,search));
	}

	}


