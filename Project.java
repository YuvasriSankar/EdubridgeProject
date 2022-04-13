import java.util.Comparator;

public class Project implements Comparator<Student>  {
	public Project(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project []";
	}

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return ((Student) o1.getProject()).compareTo(o2.getProject());
	}


}
