
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=295.04;
		int b=300;
		byte c=(byte)a;//Total number of character in ASCII TABLE IS 256(0 TO 255) SO 295 MOD 256=39 .
		byte d=(byte)b;// and 300 MOD 256=44.
		System.out.println(c+" "+d+" "+a+" "+b);

	}

}
