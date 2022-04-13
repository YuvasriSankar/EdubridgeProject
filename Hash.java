
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object=new Object() {
			@Override
			public int hashCode() {
				return 999;
			}
		};
		System.out.println(object.hashCode());
		

	}



	}


