
public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static Array
		int[] arr= {12,34,56,67,78,90};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[5]=100;
		System.out.println(arr[5]);
		arr[0]+=10;
		arr[1]+=10;
		arr[2]+=10;
		arr[3]+=10;
		arr[4]+=10;
		arr[5]+=10;
		for(int num:arr)
			System.out.println(num);
		
	}

}
