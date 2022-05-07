

	class Multithread extends Thread
	{
	   static private int i = 0;
	    public synchronized void increment()
	    {
	        i++;
	    }
	    @Override
	 public  void run() {
	    	System.out.println(this.currentThread().getName());
		 increment();
	 }
	    
	    public int getValue()
	    {
	        return i;
	    }
	}
	/*class GfG
	{
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
	}*/



