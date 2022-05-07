import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class RemoveKeysFromHashMap {

	public static void main(String[] args)throws NumberFormatException,IOException {
		
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<Integer,String>();//construct an empty HashMap
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Now,use a buffered reader to take character input from the user.
		int n=Integer.parseInt(br.readLine());//Input the size of the HashMap
		for(int i=0;i<n;i++) {
			hm.put(Integer.parseInt(br.readLine()), br.readLine());//Add elements to the HashMap with both Key and value.
			
		}
		
        getvalues(hm);//Now, pass the HashMap to the getvalues()method
	}
        public static void getvalues(HashMap<Integer,String>hm) {
        	int count=0;//Inside the method, declare and initialize the count value to 0.
        	Iterator<Integer>itr=hm.keySet().iterator();//Now,iterator over the input HashMap,and
        	while(itr.hasNext())
        	{
        		int n=itr.next();
        		if(n%4!=0)// check if the key is not a multiple of 4.
        		{
        			count++;//then,just increment the count value
        		}
        	}
        	System.out.println(count);//print the count value.
        }
	}


	
