package springfirstexample;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationcontext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		//Student student = beanFactory.getBean(Student.class);
	
		//student.readData();
		//student=new Student("Yuvasri",234);
		
		//System.out.println(student);
	
		Employee employee = beanFactory.getBean(Employee.class);
//		employee.setEmpId(1234);
//		employee.setEmpName("Yuvasri");
//		employee.setSalary(50000);
		System.out.println(employee);
		
	}

}
