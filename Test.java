package com.edubridge.hibernate.valuetype;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		 Configuration cfg=new Configuration();
		    System.out.println("2222222222222222222222222222");
		    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		    System.out.println("3333333333333333333333333333");
		    //creating seession factory object  
		    SessionFactory factory=cfg.buildSessionFactory();  
		    System.out.println("4444444444444444444444444");
		    //creating session object  
		    Session session=factory.openSession();  
		    System.out.println("5555555555555555555555555");
		    //creating transaction object  
		    Transaction t=session.beginTransaction();  
		    
             Address address=new Address();
		    address.setStreet("No.8,VaniyarStreet");
		    address.setCity("Vandavasi");
		    address.setState("TamilNadu");
		    address.setPincode("604408");
		    
		    UserDetails userdetails=new UserDetails();
		    userdetails.setUserId(100);
		    userdetails.setUserName("YuvasriSankar");
		    userdetails.setDob(new Date());
		    userdetails.setPhone("7339643931");
		    userdetails.setAddress(address);
		    
		    session.save(userdetails);
		    t.commit();
		    session.close();
}catch(Exception ex)
{
	System.out.println(ex.getMessage());
}
	}
}