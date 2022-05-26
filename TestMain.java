package com.edubridge.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
	    Employee employee=(Employee)(applicationContext.getBean("employee"));
	    System.out.println(employee);
 employee.employeeAddress();
 
// Employee employee = beanFactory.getBean(Employee.class);
	employee.setEname("Yuvasri");
	//employee.setcity("Vandavasi");
	System.out.println(employee);
	
		//System.out.println(employee1);)
	}

}
