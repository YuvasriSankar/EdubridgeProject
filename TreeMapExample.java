
	import java.util.Map;
     import java.util.TreeMap;

       public class TreeMapExample {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TreeMap <Integer, String> map=new TreeMap<>();
			map.put(1, "Manisha");
			map.put(2, "girish");
			map.put(3, "komal");
			map.put(4, "ram");
			map.put(5, "krishna");
			map.put(6,"null");
			
		System.out.println(map);
		
		for(Map.Entry<Integer,String> val : map.entrySet())
		{
			String value=val.getValue();
			if(value.startsWith("k"))
			System.out.println(value);
			
		}
		}

	}
	
	
	


