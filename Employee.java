package polymorphism;

public abstract class Employee {
	private static String COMPANY_NAME="TCS";
	private String empName;
	private int empId;
	private double salary;

	public Employee(String empName, int empId, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	public void setCompanyName(String cname)
	{
		Employee.COMPANY_NAME=cname;
	}

	public String getEmpName() {
		return empName;
	}

	/*public void setEmpName(String empName) {
		this.empName = empName;
	}*/

	public int getEmpId() {
		return empId;
	}

	/*public void setEmpId(int empId) {
		this.empId = empId;
	}*/

	public double getSalary() {
		return salary;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		Employee e1=(Employee)obj;
		if(this.getEmpName().equals(e1.getEmpName()) && this.getEmpId()==e1.getEmpId() && this.getSalary()==e1.getSalary())
		{
			return true;
		}else
			return false;
	}

	protected String displayDetails() {
		return empName;
		
		 
 
	}

}
	

