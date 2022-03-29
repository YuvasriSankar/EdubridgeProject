package studentemployeedetail;

public class Student extends Person {
	
	String courseenrolled;
	int studentid;
	
	public Student(String firstname, String lastname, int age, String courseenrolled, int studentid) {
		super(firstname, lastname, age);
		this. courseenrolled = courseenrolled;
		this. studentid = studentid;
	}
	//@override
	public void display()
	{
		super.display();// call the baseclass overriden method 
		System.out.println("Courseenrolled=" + courseenrolled + ", Studentid= " + studentid );
	

	}
	
}
