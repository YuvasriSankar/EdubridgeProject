package hackerrankprogram;

import java.util.Scanner;

public class FahrenhietToCentigrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter temperture in Fahrenheit:");
	     int fahrenheit = scanner.nextInt();
	     float celsius=0;
	     if(fahrenheit<0)
	    	  System.out.println("Invalid Input");
	     else {
	    	 celsius=((fahrenheit-32)/9)*5;
	    	  System.out.printf("%,2f",celsius);
	     }
	}

}
