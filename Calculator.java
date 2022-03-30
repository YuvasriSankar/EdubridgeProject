package calculator;

public class Calculator implements BasicFunctions, AdvancedCal{

	@Override
	public double square(int number) {
		// TODO Auto-generated method stub
		return number*number;
	}

	@Override
	public double getPi() {
		// TODO Auto-generated method stub
		return 3.142;
		}

	@Override
	public double factorial(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		
		return fact;
		}
	

	@Override
	public void add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("add = " +(num1+num2));
	}

	@Override
	public void sub(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("sub = " +(num1-num2));
	}

	@Override
	public void mult(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("mult = " + num1*num2);
	}

	@Override
	public void div(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("div = " + num1/num2);
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

}
