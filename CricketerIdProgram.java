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



