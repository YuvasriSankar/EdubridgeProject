public class StringJoiner {



	public static void main(String[] args) {
		// TODO Auto-generated method stub


StringJoiner sj = new StringJoiner(":", "[", "]");

	 sj.add("George");
	 sj.add("Sally");
	 sj.add("Fred");
	 
	 System.out.println(sj);
	 
	 StringJoiner sj1 = new StringJoiner(",","start--->","end");
     sj1.add("aaa");
     sj1.add("bbb");
     sj1.add("ccc");
     String result = sj1.toString(); //aaa,bbb,ccc
     System.out.println(result);
String message = String.join(", ", "Java", "is", "cool");
     
     System.out.println(message);

	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
