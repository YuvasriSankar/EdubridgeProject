package hackerrankprogram;

import java.util.Scanner;

public class RepeatedSalaryCount {
	private static int countReapeater(int size,int[] array) {
		int count=1;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j< size;) {
				if(array[i]==array[j]) {
					count++;
					for(int k=j;k<size-1;k++) 
						array[k]=array[k+1];
						size--;
					} else
						j++;
						
					}
				}
			return count;
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int[]array= new int[size];
		if(size<0) {
			System.out.println("Invalid Input");
		}else
		{
	
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
		if(array[i]<0) {
			System.out.println("Invalid Input");
		}
	}
		}
	System.out.println("The Repeated salary count is "+ RepeatedSalaryCount.countReapeater(size,array));
}
}
		
		

	


