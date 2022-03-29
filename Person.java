package studentemployeedetail;

public class Person {
	public static Object person;
	String firstname;
	String lastname;
	int age;
	
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}


	//@Override
	public void display() 
	{
		System.out.println("firstname=" + firstname + ", lastname=" + lastname + ", age=" + age );
	}
	

}
