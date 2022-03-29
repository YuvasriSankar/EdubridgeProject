package polymorphism;

public class TestPoly {
		//polymorphic argument
		public static double findTax(Employee employee){ //which  employee
			if(employee instanceof Manager)//true
			{
				Manager m=(Manager)employee;
				return (m.getSalary()+m.bonus)*0.2f;
			}else if(employee instanceof ParttimeEmployee){
				ParttimeEmployee pe=(ParttimeEmployee)employee;
				return (pe.getSalary())*0.3f;
			}else if(employee instanceof Cleark){
				Cleark pe=(Cleark)employee;
				return (pe.getSalary())*0.1f;
			}
			return 0.0f;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Employee employee=new Manager("Rama",1234,65437.7654,0,10000);
	System.out.println(employee.displayDetails());

	double tax=findTax(employee);

	System.out.println(tax);

	employee=new ParttimeEmployee("Nitish",8763,87632.00,4);
	System.out.println(employee.displayDetails());
	 tax=findTax(employee);
	 System.out.println(tax);
	employee=new Cleark("Syam",876,8765.87);
	System.out.println(employee.displayDetails());
	 tax=findTax(employee);
	System.out.println(tax);
		}

	}



