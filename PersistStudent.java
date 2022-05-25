package model;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	import model.SStudent;

	public class PersistStudent {

		public static void main(String[] args) {
			try {
			// TODO Auto-generated method stub
			 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test"); 
			 
		        EntityManager em=emf.createEntityManager();  
		          
		em.getTransaction().begin();  
		          
		SStudent s1=new SStudent();  
		s1.setCname("Chaitanya");
		s1.setSadd("bangalore");
		s1.setSid(80000);
		s1.setSname("Avani");
		
		      
		          
		  
		          
		        em.persist(s1);  
		            
		  
		em.getTransaction().commit();  
		          
		        emf.close();  
		        em.close();  
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		    }  
		}  
		




