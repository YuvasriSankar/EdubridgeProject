package com.edubridge.hibernate.model;



import java.util.Scanner;


import org.hibernate.*;
import org.hibernate.cfg.*;
  
public class Test {
public static void main(String[] args) {
	try{
		Configuration cfg = new Configuration();
	    System.out.println("2222222222222222222222222222");
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	    SessionFactory factory=cfg.buildSessionFactory();  
	    System.out.println("4444444444444444444444444");
		
		Session session = factory.openSession();
		Transaction t = null;

	/*Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();*/
	Scanner sn=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		t=session.beginTransaction();
	
	Employee e1=new Employee();
	//e1.setId(1234);// autoincreament in setid.
	e1.setFirstName(sn.next());
	e1.setLastName(sn.next());
	
	/*Employee e2=new Employee();
	//e2.setId(5678);
	e2.setFirstName("mohan");
	e2.setLastName("patil");*/
	
	session.persist(e1);
	//session.persist(e2);
	
	t.commit();
	}
	session.close();
	System.out.println("successfully saved");
	}catch(Exception ex)
	{
		System.out.println("exception "+ex.getMessage());
	}
}
}