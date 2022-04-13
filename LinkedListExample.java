
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add(new Double(83645.98));
		list.add(new Double(87645.98));
		list.add(new Double(88645.98));
		list.add(new Double(83646.98));
		list.add(new Double(82645.98));
		list.add(new Double(89648.98));
		list.add(new Double(83645.98));

		ListIterator listIterator=list.listIterator();
		System.out.println("forward direction");
		while(listIterator.hasNext())
		{
			int index=listIterator.nextIndex();
			System.out.println(index+"  "+listIterator.next());
		}
	
		System.out.println("backword direction");
		for(;listIterator.hasPrevious();)
		{
			int priv_index=listIterator.previousIndex();
			listIterator.set(56876.98);
			System.out.println(priv_index+"--->"+listIterator.previous());
		}
		}
		
		//System.out.println(list);
		
		
	}