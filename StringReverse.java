import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
String str =scanner.nextLine();
scanner.close();
/*Reverse string and compare to original*/
/*If a String is equivalent to itself when reversed,it's a palindrome*/
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(reversed)?"yes":"No");
	}

}
