import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap and TreeMap  classess implements the
		//Map interface
		
		Map<String,String> map=new HashMap<>();
		
		map.put("authorname","manisha");
		map.put("bookname", "fairystorybook");
		map.put("size","1mb");
		
		System.out.println(map);
		
		Set<String> keyvalues=map.keySet();
		
		System.out.println(keyvalues);
		
		Collection<String> values=map.values();
		
		System.out.println(values);
		
		Set<Entry<String, String>> keyandvalue=map.entrySet();
		
		System.out.println(keyandvalue);
		
		System.out.println("printing values using enhanced for loop");//Enhanced for loop.
		for(Map.Entry<String,String> val : map.entrySet())
		{
			System.out.println(val);
			
		}
		
	}

}
