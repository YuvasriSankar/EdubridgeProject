package polymorphism;



public class ParttimeEmployee extends Employee {

	int no_of_hours;

	
	public ParttimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ParttimeEmployee(String empName, int empId, double salary) {
		super(empName, empId, salary);
		// TODO Auto-generated constructor stub
	}


	public ParttimeEmployee(String empName, int empId, double salary, int no_of_hours) {
		super(empName, empId, salary);
		this.no_of_hours = no_of_hours;
	}

	public String displayDetails() {
		return super.displayDetails()+" "+no_of_hours;
	}

}

