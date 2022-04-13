import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;

	public class PropertiesExample {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			 FileReader reader=new FileReader("db.properties");  
		      
			    Properties p=new Properties();  
			    p.load(reader);  
			      
			    System.out.println(p.getProperty("name"));  
			    System.out.println(p.getProperty("password")); 
			    System.out.println(p.getProperty("author")); 
			    
		}


}

	