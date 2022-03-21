
public class DigitReversedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345,Reverse=0,lastDigit;
		while(n>0) {
			lastDigit=n%10;
			Reverse=Reverse*10+lastDigit;
			n=n/10;
			
		}
		System.out.println(Reverse);

	}

}
