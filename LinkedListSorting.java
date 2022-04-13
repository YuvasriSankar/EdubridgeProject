import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list=new LinkedList<>();
		//first object.compareTo(SecondObject);
	 list.add(new Student("Tarun",34.78f,21,1,new Project("Hr","45","java")));
		list.add(new Student("Geetha",35.78f,22,2,new Project("Shopping","45","java")));
		list.add(new Student("Mahesh",33.78f,23,3,new Project("Hospital","45","java")));
		list.add(new Student("Krishna",35.78f,24,4,new Project("Mobile","45","java")));
		list.add(new Student("Shankar",36.78f,25,5,new Project("BlogsMang","45","java")));
		System.out.println(list);
		Collections.sort(list);//sort(comparable)
		System.out.println(list);
		Collections.sort(list, new AgeComparator());
		System.out.println(list);
		Collections.sort(list, new NameComparator());
		System.out.println(list);
	}

}




