package string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableObject object=new ImmutableObject();
		System.out.println(object);
		String name ="edubridge";
		System.out.println(name);
		name= name+" --java training";
		System.out.println(name);
		String message="edubridge";
		String message1 = new String("Welcome");
		System.out.println(message1.compareTo("Welcome"));
		System.out.println(message.charAt(3));
		if(message==name)
		{
			System.out.println("Same address or both varaiable pointing to the Single object ");
		}else
			System.out.println("Different address or both references varaiable pointing to the Single object ");

	}

}
