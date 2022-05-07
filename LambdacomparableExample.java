package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;	
		
	
}
}
public class LambdacomparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>arraylist=new ArrayList<Student>();
		arraylist.add(new Student(1,"Yuvasri",10));
		arraylist.add(new Student(2,"Gomathi",20));
		arraylist.add(new Student(3,"keerthana",30));
		//Implementing lambda expression
				Collections.sort(arraylist,(s1,s2)->{
					return s1.name.compareTo(s2.name);
				});
				for(Student s:arraylist) {
					System.out.println(s.rollno+""+s.name+""+s.age);
				}
				
		

	}

}
