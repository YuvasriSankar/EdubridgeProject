	package com.mypack;    
	  
	import java.util.ArrayList;    
	  
	import org.hibernate.Session;  
	import org.hibernate.SessionFactory;  
	import org.hibernate.Transaction;  
	//import org.hibernate.boot.Metadata;  
	//import org.hibernate.boot.MetadataSources;  
	//import org.hibernate.boot.registry.StandardServiceRegistry;  
	//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
    import org.hibernate.cfg.Configuration;  
	public class StoreData {    
	public static void main(String[] args) {    
	     
	   /* StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build(); */ 
		 Configuration cfg=new Configuration();
		    System.out.println("2222222222222222222222222222");
		    cfg.configure("Hibernate.cfg.xml");//populates the data of the configuration file  
		    System.out.println("3333333333333333333333333333");
		    //creating session factory object  
		    SessionFactory factory=cfg.buildSessionFactory();  
		    System.out.println("4444444444444444444444444");
		    //creating session object  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();    
	        
	    /*Answer ans1=new Answer();    
	    ans1.setAnswername("Java is a programming language");    
	    ans1.setPostedBy("yuvasri");    
	        
	    Answer ans2=new Answer();    
        ans2.setAnswername("Java is a platform");    
	    ans2.setPostedBy("Gomathi");    
	        
	    Answer ans3=new Answer();    
	    ans3.setAnswername("Servlet is an Interface");    
	    ans3.setPostedBy("Keerthana");    
	        
	    Answer ans4=new Answer();    
	    ans4.setAnswername("Servlet is an API");    
	    ans4.setPostedBy("Keerthikshah");  
	    
	    Answer ans5=new Answer();    
	    ans5.setAnswername("Mapping tool");    
	    ans5.setPostedBy("Thilagavathi");
	    
	    Answer ans6=new Answer();    
	    ans6.setAnswername("Tool for doing database transaction");    
	    ans6.setPostedBy("sankar");
	        
	    ArrayList<Answer> list1=new ArrayList<Answer>();    
	    list1.add(ans1);    
	    list1.add(ans2);    
	        
	    ArrayList<Answer> list2=new ArrayList<Answer>();    
	    list2.add(ans3);    
	    list2.add(ans4);  
	    
	    ArrayList<Answer> list3=new ArrayList<Answer>();    
	    list3.add(ans5); 
	    
	    ArrayList<Answer> list4=new ArrayList<Answer>(); 
	    list4.add(ans6);  
	        
	    Question question1=new Question();    
	    question1.setQname("What is Java?");    
	    question1.setAnswers(list1);    
	        
	    Question question2=new Question();    
	    question2.setQname("What is Servlet?");    
	    question2.setAnswers(list2); 
	    
	    Question question3=new Question();    
	    question3.setQname("What is hibernate?");    
	    question3.setAnswers(list3);  
	    
	    Question question4=new Question();    
	    question4.setQname("What is difference between final and finally?");    
	    question4.setAnswers(list4);   
	    
	    session.persist(question1);    
	    session.persist(question2);
	    session.persist(question3);    
	    session.persist(question4);*/
	      Question question=session.get(Question.class, 1);//adding one answer this one is use
	      Answer ans7=new Answer();    
		    ans7.setAnswername("oops concept");
		    ArrayList<Answer> list1=new ArrayList<Answer>();    
		    list1.add(ans7);
		    question.setAnswers(list1);
		    session.save(question);
		    
	    t.commit();    
	    session.close();    
	    System.out.println("successfully saved");    
	}    
	}   
