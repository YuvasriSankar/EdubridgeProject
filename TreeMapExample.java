import java.util.Map;
import java.util.TreeMap;


	class Employee1
	{
		int empid;
		String empName;
		
		public Employee1(int empid, String empName) {
			super();
			this.empid = empid;
			this.empName = empName;
		}
		
		
		
	}
	public class TreeMapExample {

			static TreeMap<Integer,String> treeMap;
			
			static {
				treeMap=new TreeMap();
			}
			
		static void addEmployee(Employee1 employee)
		{
			treeMap.put(employee.empid, employee.empName);
		}
		static TreeMap getEmployeeList()
		{
			return treeMap;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//TreeMapExample treeMapExample=new TreeMapExample();
			addEmployee(new Employee1(1, "Manisha"));
			addEmployee(new Employee1(2, "girish"));
			addEmployee(new Employee1(3, "komal"));
			addEmployee(new Employee1(4, "ram"));
			
			TreeMap<Integer,String> treeMap=getEmployeeList();

		
		for(Map.Entry<Integer,String> val : treeMap.entrySet())
		{
			String value=val.getValue();
			if(value.startsWith("k"))
			System.out.println(value);
			
		}
		}

	}



