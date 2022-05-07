import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

class UserMainCode{
	
public static String getMaxKeyValue(HashMap<Integer,String>hashMap){
	int max=0;
	String name=null;
	Set<Map.Entry<Integer,String>>entries=hashMap.entrySet();
	for(Entry<Integer,String>entry:entries) {
		if(entry.getKey()>max) {
			max=entry.getKey();
			name=entry.getValue();
		}
	}
	return name;
}
}
public class LargestKeysInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the size of the map");
		int count=sc.nextInt();
		HashMap<Integer,String>hashMap=new HashMap<>(count);
		for(int i=0;i<count;i++) {
			hashMap.put(sc.nextInt(),sc.next() );
			
		}
		String output = UserMainCode.getMaxKeyValue(hashMap);
		System.out.println(output);
	}

}
