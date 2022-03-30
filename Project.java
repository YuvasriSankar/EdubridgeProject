
public class Project {
	private String name,duration,technology;

	public Project(String name, String duration, String technology) {
		super();
		this.name = name;
		this.duration = duration;
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", duration=" + duration + ", technology=" + technology + "]";
	}

}
