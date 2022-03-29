package polymorphism;


	public class Manager extends Employee {

		int managerId;
		double bonus;
		
		
		
		public Manager() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Manager(String empName, int empId, double salary) {
			super(empName, empId, salary);
			// TODO Auto-generated constructor stub
		}



		Manager(String empName, int empId, double salary, int managerId,double bonus) {
			super(empName, empId, salary);
			this.managerId = managerId;
			this.bonus=bonus;
		}
		//@override
		public String displayDetails() {
			return super.displayDetails()+" "+managerId+" "+bonus;
		}

		
	}


