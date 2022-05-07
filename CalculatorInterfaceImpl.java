package lambda;

public class CalculatorInterfaceImpl {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//interface implementation
			CalculatorInterface CalculatorInterface=()-> {
				System.out.println(10*10);
			};
			
			//calling interface method
			CalculatorInterface.Multiplication();
		}

	}


