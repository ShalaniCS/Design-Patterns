
public class MementoPattern {
	public static void main(String[] args) {
        
	    CareTaker careTaker = new CareTaker();
	         
	    Student stu =new Student(15, "John");
	    stu.printStu();
	    careTaker.add(stu.createMemento());
	     
	    stu.setName("Charles");
	    stu.printStu();
	    careTaker.add(stu.createMemento());
	     
	    stu.restoreToMemento(careTaker.get(0));
	    System.out.println("\nAfter Restore:");
	    stu.printStu();
	     
	    }

}
