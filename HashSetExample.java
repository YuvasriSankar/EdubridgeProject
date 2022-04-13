import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> set =new HashSet<>();//type inference
		set.add(new Character('A'));
		set.add(new Character('B'));
		set.add(new Character('c'));
		set.add(new Character('d'));
        System.out.println(set);
}
}