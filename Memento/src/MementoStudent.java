
public class MementoStudent {
	
	int id;
	String name;
	
	public MementoStudent(Student student) {
		this.id = student.id;
		this.name = student.name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
