package com.edu.listcollection;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Storing the data");
		try{
		       	 
			 Configuration cfg=new Configuration();
		 	    System.out.println("2222222222222222222222222222");
		 	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		 	    System.out.println("3333333333333333333333333333");
		 	    SessionFactory factory=cfg.buildSessionFactory();
		    Session session=factory.openSession();  
		    Transaction t=session.beginTransaction();  
		    
		    Alien alien=new Alien();
		    Query q1=session.createQuery("from Alien");
		    q1.setCacheable(true);
		    	alien=(Alien)q1.uniqueResult();
		    	   System.out.println(alien);
		    	   
		   	    
		    	 Query q2=session.createQuery("from Alien");
		   	    q2.setCacheable(true);
		    	alien=(Alien)q2.uniqueResult();
		    	   System.out.println(alien);
		    /*alien=(Alien)session.get(Alien.class, 100);
		    System.out.println(alien);
		    
		    alien=(Alien)session.get(Alien.class, 100);
		    System.out.println(alien);*/
		    
		    t.commit();//transaction is committed
		    session.close();
		    
		    
		   /* Session session1=factory.openSession();  
		    Transaction t1=session1.beginTransaction();  
		    
		    Alien alien1=new Alien();
		    alien1=(Alien)session1.get(Alien.class, 100);
		    System.out.println(alien1);
		    
		    alien1=(Alien)session1.get(Alien.class, 100);
		    System.out.println(alien1);
		    
		    t1.commit();//transaction is committed
		    session1.close();*/
		    
		    
		    System.out.println("successfully saved");  
		   }catch(Exception ex)
		   {
		    	  System.out.println("Problem in connection"+ex.getMessage());
		   }
			
		

	}

}