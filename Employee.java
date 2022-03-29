package studentemployeedetail;

public class Employee extends Person {
	int salary;
	int employeeid;
	String designation;
	String departmentname;
	public Employee(String firstname, String lastname, int age, int salary, int employeeid, String designation,
			String departmentname) {
		super(firstname, lastname, age);
		this.salary = salary;
		this.employeeid = employeeid;
		this.designation = designation;
		this.departmentname = departmentname;
	}
	@Override
	public void display() {
		
		super.display();
	
		System.out.println("salary=" + salary + ", employeeid=" + employeeid + ", designation=" + designation
				+ ", departmentname=" + departmentname);
	}

}
