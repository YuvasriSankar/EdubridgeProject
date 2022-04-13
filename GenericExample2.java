
	class Shape<T,E>
	{
		T t1;
		E e1;
		
		public Shape(T t1, E e1) {
			super();
			this.t1 = t1;
			this.e1 = e1;
		}

		@Override
		public String toString() {
			return "Shape [t1=" + t1 + ", e1=" + e1 + "]";
		}
		
	}

	public class GenericExample2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Shape<String, Integer> obj1=new Shape<>("Test",1);
			
			Shape<Integer,String> obj2=new Shape<>(2,"Demo");
			
			System.out.println(obj1);
			System.out.println(obj2);

	}

	}
	

