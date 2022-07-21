
public class Student {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void Student(int id2, String name2) {
		// TODO Auto-generated constructor stub
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
	
	public MementoStudent createMemento() {
		return new MementoStudent(this);
	}
	
	public void restoreToMemento(MementoStudent memento) {
		this.id = memento.getId();
		this.name = memento.getName();
	}
	
	public void printStu() {
		String s1 = "ID = " + this.id + " ; Name = " + this.name;
		System.out.println(s1);
	}

}
