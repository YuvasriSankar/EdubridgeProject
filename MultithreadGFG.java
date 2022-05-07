
public class MultithreadGFG {
	
	
	    public static void main (String[] args) throws InterruptedException
	    {
	        Multithread t = new Multithread();
	      //  t.increment();
	        t.start();
	        
	        Multithread t1 = new Multithread();
	        //  t.increment();
	          t1.start();
	         
	          Thread.sleep(1000);
	          System.out.println(t.getValue());  
	          System.out.println(t1.getValue());
	    } 
	}




