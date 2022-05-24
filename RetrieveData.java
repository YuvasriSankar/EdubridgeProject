package retrievedatafromproduct;

	import java.util.List;
	import java.util.ListIterator;

	import org.hibernate.Query;
	import org.hibernate.Session;
   import org.hibernate.SessionFactory;
   import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class RetrieveData {
		public static void main(String[] a)
		{
			try{
				 Configuration cfg=new Configuration();
			 	    System.out.println("2222222222222222222222222222");
			 	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
			 	    System.out.println("3333333333333333333333333333");
			 	    //creating session factory object  
			 	    SessionFactory factory=cfg.buildSessionFactory();
			   
			    
			        Session session=factory.openSession();  

	Transaction t=session.beginTransaction(); 

	/*Product product=new Product();
	product.setPid(1000);
	product.setPname("microphone");
	product.setPprice(2345);
	session.save(product);
	t.commit();
	session.close();*/
	
	Query query=session.createQuery("from Product");//here persistent class name is Emp
	//query.setMaxResult(1);
	List<Product> list1=query.list();  
	ListIterator<Product> iterator=list1.listIterator();
	while(iterator.hasNext())//TRUE
	{
		Product prd=(Product)iterator.next();//OBJECT
		System.out.println(prd.getPid());
		System.out.println(prd.getPname());
		System.out.println(prd.getPprice());

	}
	System.out.println("completed");
	t.commit();
	session.close();
	System.out.println("status");  

	/*
	------------------------------
	Query query=session.createQuery
	("delete from Product where pid='p065'");  
	//specifying class name (Emp) not tablename  
	query.executeUpdate(); 
	------------------------------------
	Query q=session.createQuery("select sum(price) from Product");  
	List<Integer> list=q.list();  
	System.out.println(list.get(0));  
	----------------------------------
	Query q=session.createQuery("select max(price) from Product"); 
	-----------------------------------------
	Query q=session.createQuery("select min(price) from Product");  
	-----------------------------------------
	Query q=session.createQuery("select count(pid) from Product");
	----------------------------------------------------
	Query q=session.createQuery("select avg(price) from Product");    */
	 
	/*while(iterator.hasNext())//TRUE
	{
		Product prd=(Product)iterator.next();//OBJECT
		System.out.println(prd.getPid());
		System.out.println(prd.getPname());
		System.out.println(prd.getPrice());*/
	}catch(Exception ex)
			{
			System.out.println(ex.getMessage());	
			}
	}
	}


