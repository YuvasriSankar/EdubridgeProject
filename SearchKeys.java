/*searchKeys
Read the question carefully and follow the input and output format.

Given an integer array, first index represents the key & second index represents the value. Find keys for the given value.

Input and Output Format:
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. The next line consistts of an integer that represents the value to be searched. 
Output consist of an integer array.

1) Print "Invalid array size" when size of the array is negative and terminate the program.
2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the program.
3) Print "Key not found" when there is no keys found.

Include a function named searchKeys(int array[], int size) whose return type is void.
The output array is stored in a global variable named found.

Sample Input 1:
8
1
4
2
4
3
4
5
6
4

Sample Output 1:
1
2
3

Sample Input 2:
5
5
6
7
8
9
-5

Sample Output 2:
Key not found*/
package hackerrankprogram;

import java.util.Scanner;

public class SearchKeys {
	static void searchKeys(int[]array, int size, int searchKey) {
		int count=0,j=0;
		int[]found = new int[10];
		for(int i=0; i<size;i++) {
			if(array[i]==searchKey) {
				found[j]=array[i-1];
				count++;
				j++;
		}
		
	}
for(int a=0;a<count;a++) {
	System.out.println(found[a]);
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] array=new int[size];
		if (size>0) {
			for (int i=0;i<size;i++)
			{
				array[i]=scanner.nextInt();
				if (array[i] < 0)
				{
					System.out.println("INVALID INPUT");
					System.exit(0);
				}
			}
		
		System.out.println("ENTER THE SEARCH VALUE");
        int searchKey=scanner.nextInt();
        searchKeys(array,size,searchKey);
	}else {
		System.out.println("INVALID ARRAY SIZE");

}
}
	}

	
