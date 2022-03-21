package positivenegative;

import java.util.Scanner;

public class PositiveNegativeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
	    num=sc.nextInt();
	    sc.close();
	    if(num>0) { 
	    
	    	System.out.printf("The given Number is a positive Number", num);
	    }else if(num<0) {
	    
	    	System.out.printf("The given Number is a Negative Number", num);
	    } else
	    
	    	System.out.printf("The given Number is a Zero", num);
	    

	}
	}

