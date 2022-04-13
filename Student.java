
	import java.io.Serializable;

	public class Student<Project> implements Comparable {
		private String name;
		transient private float marks;
		private int age,sem;
		transient Project project;//instance reference variable
		public Student(String name, float marks, int age, int sem, Project project) {
			super();
			this.name = name;
			this.marks = marks;
			this.age = age;
			this.sem = sem;
			this.project = project;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", marks=" + marks + ", age=" + age + ", sem=" + sem + ", project=" + project
					+ "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSem() {
			return sem;
		}
		public void setSem(int sem) {
			this.sem = sem;
		}
		public Project getProject() {
			return project;
		}
		public void setProject(Project project) {
			this.project = project;
		}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Student s=(Student)o;
			if(this.marks>s.marks)
			{
				return 1;
			}else if(this.marks<s.marks)
			{
				return -1;
			}else
				
			return 0;
		}
		
		
		

	}


