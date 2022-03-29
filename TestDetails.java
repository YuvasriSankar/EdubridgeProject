package studentemployeedetail;

import java.util.Scanner;

public class TestDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Student Details");
		System.out.println("2. Employee Details");
		int option=sc.nextInt();
		Person person;
		switch(option)
		{
		case 1: person = new Student("Yuvasri","Sankar",22,"Java",10);
		person.display();
		break;
		case 2:person= new Employee("Yuvasri","Sankar",22,30000,35,"ECE","trainer");
		person.display();
		break;
		default:System.out.println("Invalid option");
		
		}
		

	}

}
