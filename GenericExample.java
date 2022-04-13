

	class Generic<T>//T stands for Type, behave like placeholder
	{
		T a,b;

		public Generic(T a, T b) {
			super();
			this.a = a;
			this.b = b;
		}

		public T getA() {
			return a;
		}

		public void setA(T a) {
			this.a = a;
		}

		public T getB() {
			return b;
		}

		public void setB(T b) {
			this.b = b;
		}
		
		
		
	}

	public class GenericExample {
		public static void main(String[] a)
		{
			Generic<Integer> generic=new Generic<Integer>(12,13);
			int res=generic.getA() + generic.getB();
			System.out.println(res);
			
			Generic<Float> generic1=new Generic<Float>(12.89f,22.98f);
			float res1=generic1.getA() + generic1.getB();
			System.out.println(res1);
			
			Generic<Double> generic2;
			generic2=new Generic<>(12.89,22.98);
			double res2=generic2.getA() + generic2.getB();
			System.out.println(res2);
			
			
			Generic<String> generic3;
			generic3=new Generic<>("Hello","world");
			String message=generic3.getA() + generic3.getB();
			System.out.println(message);
			
			

			Generic<Character> generic4;
			generic4=new Generic<>('H','A');
	boolean value=generic4.getA() > generic4.getB()?true:false;//ternary operator
			System.out.println(value);
			
			
			
		}

	}

