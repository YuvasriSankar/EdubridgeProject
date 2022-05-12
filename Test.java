package com;

import org.hibernate.*;

import org.hibernate.cfg.*;
  
public class Test {
public static void main(String[] args) {
	try{
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

	/*Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();*/
	
	Employee e1=new Employee();
	//e1.setId(1234);// autoincreament in setid.
	e1.setFirstName("girish");
	e1.setLastName("kumar");
	
	Employee e2=new Employee();
	//e2.setId(5678);
	e2.setFirstName("mohan");
	e2.setLastName("patil");
	
	session.persist(e1);
	session.persist(e2);
	
	t.commit();
	session.close();
	System.out.println("successfully saved");
	}catch(Exception ex)
	{
		System.out.println("exception "+ex.getMessage());
	}
}
}