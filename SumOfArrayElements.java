package hackerrankprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArrayElements {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfArrayElements sn= new SumOfArrayElements();
		try (Scanner scanner = new Scanner(System.in)) {
			int size = scanner.nextInt();
            int arr[] =new int [size];
             for(int i=0;i<=size;i++) {
             arr[i]=scanner.nextInt();
       }
             System.out.println(sn.SumOfArrays(arr,size));
		}
	}
	public int SumOfArrays(int arr[],int size)
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}

}*/
/*int[] arr= {1,2,3,4,5};
int sum=add(arr);
System.out.println(sum);
}
static int add(int[]array) {
	int sum=0;
	for(int i=0;i<array.length;i++) {
		sum+=array[i];
	}
	return sum;
}

	}*/
		//public class SumOfArray {

			class Sum{

				public static int total(int[] array) {
					// TODO Auto-generated method stub
					int output=0;
//					for (int i=0;i<array.length;i++) {
//						output+=array[i];
//					}
					for(int value : array) {
						output+=value;
					}
					return output;
				}
				public static int getTotal(List<Integer> lisst) {
					// TODO Auto-generated method stub
					int output=0;
//					for (int i=0;i<array.length;i++) {
//						output+=array[i];
//					}
					for(int value : lisst) {
						output+=value;
					}
					return output;
				}
				
			}
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("how many element you want to give as input");
				int count=sc.nextInt();
				//int[] array=new int[count];
				
				List<Integer> list = new ArrayList<>(count);
				
				for (int i=0;i<count;i++) {
					list.add(sc.nextInt());
				}
				
				System.out.println("the sum is "+Sum.getTotal(list));
			}


	}
