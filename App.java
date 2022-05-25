package jpa;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	/**
	 * Hello world!
	 *
	 */
	public class App 
	{
	    public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        Alien alien1=new Alien();
	        alien1.setAid(7000);
	        alien1.setAname("Dinesh");
	        alien1.setTech(".net technology");
	        
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("alien_table");
	        EntityManager manager=emf.createEntityManager();
	        
	        manager.getTransaction().begin();
	        manager.persist(alien1);
	        manager.getTransaction().commit();
	        
	        //Alien alien=manager.find(Alien.class, 800);
	        //System.out.println(alien);
	        
	    }
	}


