package calculator;

public class CalculaorUI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedCal calculator= new Calculator();
		calculator.add(56, 1234);
		//AdvanceCal cal=(AdvanceCal)calculator;//typecasting
		System.out.println(calculator.factorial(6));
		System.out.println(calculator.square(6));
	}


}
