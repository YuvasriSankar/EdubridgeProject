
public class Student {
	private String name;
	private int age;
	private int sem;
	private float marks;
	Project project;
	public Student(String name, int age, int sem, float marks, Project project) {
		super();
		this.name = name;
		this.age = age;
		this.sem = sem;
		this.marks = marks;
		this.project = project;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sem=" + sem + ", marks=" + marks + " , project="+ project +"]";
	}
}