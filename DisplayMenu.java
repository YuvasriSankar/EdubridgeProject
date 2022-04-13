class MenuDisplay<S,E>
{
	S s1;
	E s2;
	public MenuDisplay(S s1, E s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public String toString() {
		return "MenuDisplay [s1=" + s1 + ", s2=" + s2 + "]";
	}
	
}
public class DisplayMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuDisplay<Integer,String> obj =new MenuDisplay<> (948626467,"Welcome to SMS");
        System.out.println(obj);
        MenuDisplay<String,String> obj1 =new MenuDisplay<> ("Welcome to EMAIL","yuvasri@123gmail.com");
        System.out.println(obj1);
	}

}
