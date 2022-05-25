package springfirstexample;


	public class Employee {

		private int empId;
		private String empName;
		private int salary;
		private Address address;
		public Employee() {
			
		}
		public Employee(int empId, String empName, int salary,Address address) {
		super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
			this.address=address;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
					+ "]";
		}
		
		
	}


