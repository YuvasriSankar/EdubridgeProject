package emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class LoadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Session session=new AnnotationConfiguration(). 
				configure("hibernate.cfg.xml").buildSessionFactory()
				.openSession();  

				Transaction t=session.beginTransaction(); 
				Employee emp1 = (Employee)session.load(Employee.class,10);
				System.out.println(emp1.getId()); 
				System.out.println(emp1.getEmpName()); 
				System.out.println(emp1.getEmpAddress());
				System.out.println(emp1.getEmpMobileNos());

				t.commit(); 
				session.close();
				Session session1=new AnnotationConfiguration(). 
						configure("hibernate.cfg.xml").buildSessionFactory()
						.openSession();
				System.out.println("session2 created");
				Employee e2=new Employee();
				e2.setEmpName("manu");
				e2.setEmpAddress("llllll");
				e2.setEmpMobileNos("8978");
				Transaction t2=session1.beginTransaction();
				session1.persist(e2);
				t2.commit();  
				session1.close();
				
				Session session3=new AnnotationConfiguration(). 
						configure("hibernate.cfg.xml").buildSessionFactory()
						.openSession();
				System.out.println("session2 created");
				Employee e4=new Employee();
				e4.setEmpName("tanu");
				e4.setEmpAddress("knk");
				e4.setEmpMobileNos("997839748");
				System.out.println("object created");
				Transaction t4=session3.beginTransaction();
				System.out.println("333333333333333333");
				session3.persist(e4);
				e4.setEmpName("Rohan");
				System.out.println("4444444444444444444");
				t4.commit();
				System.out.println("5555555555555");
				session3.close();
			
				Session session4=new AnnotationConfiguration(). 
						configure("hibernate.cfg.xml").buildSessionFactory()
						.openSession();
				System.out.println("session2 created");
				Employee e5=new Employee();
				e5.setEmpName("madhu");
				e5.setEmpAddress("knkroad");
				e5.setEmpMobileNos("993421212");
				System.out.println("object created");
				Transaction t5=session4.beginTransaction();
				System.out.println("333333333333333333");
				session4.saveOrUpdate(e5);
				e5.setEmpName("madhavi");
				System.out.println("4444444444444444444");
				t5.commit();
				System.out.println("5555555555555");
				session4.close();
			
				Session session2=new AnnotationConfiguration(). 
						configure("hibernate.cfg.xml").buildSessionFactory()
						.openSession();
				System.out.println("session2 created");
				Employee e3=new Employee();
				Transaction t3=session2.beginTransaction();
				System.out.println("333333333333333333");
				e3=(Employee)session2.get(Employee.class, 21);
				System.out.println(e3.getEmpAddress());
				System.out.println(e3.getEmpMobileNos());
				System.out.println("4444444444444444444");
				t3.commit();
				System.out.println("5555555555555");
				session2.close();
		
	Session session6=new AnnotationConfiguration(). 
				configure("hibernate.cfg.xml").buildSessionFactory()
				.openSession();
		System.out.println("session2 created");
		Employee e6=new Employee();
		Transaction t6=session6.beginTransaction();
		System.out.println("333333333333333333");
		e6=(Employee)session6.get(Employee.class, 22);
		System.out.println(e6.getEmpAddress());
		System.out.println(e6.getEmpMobileNos());
		System.out.println("4444444444444444444");
		t6.commit();
		e6.setEmpAddress("bangalore");
		e6.setEmpName("raju");
		t6.begin();
		session6.update(e6);
		t6.commit();
		System.out.println("5555555555555");
		session6.close();*/
		/*Session session6=new AnnotationConfiguration(). 
				configure("hibernate.cfg.xml").buildSessionFactory()
				.openSession();*/
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
			     
			    
		Transaction tx = session.beginTransaction();
		Employee emp = (Employee) session.load(Employee.class, 23);
		System.out.println("Employee object loaded. " + emp);
		tx.commit();

		 //merge example - data already present in tables
		 emp.setEmpAddress("delhi");
		 Transaction tx8 = session.beginTransaction();
		 Employee emp4 = (Employee) session.merge(emp);
		 System.out.println(emp4 == emp); // returns false
		 emp4.setEmpName("suraj");
		 emp4.setEmpAddress("mangalore");
		 System.out.println(" Before committing merge transaction");
		 tx8.commit();
				session.close();
	}

}
