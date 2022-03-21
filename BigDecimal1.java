
import java.util.Scanner;

import java.math.*;




public class BigDecimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
BigInteger a=new BigInteger(sc.nextLine());
BigInteger b=new BigInteger(sc.nextLine());
BigInteger sum=a.add(b);
BigInteger prod=a.multiply(b);
System.out.println(sum+"\n"+prod);

	}

}
