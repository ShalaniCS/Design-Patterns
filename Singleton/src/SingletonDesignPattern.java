
public class SingletonDesignPattern {
	
	public static void main(String args[]) {
		
		boolean member = true;
		boolean nonMember = true;
		int noOfThreads = 0;
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Donations mem = Donations.getInstance();
				mem.noOfBooks = 8;
				mem.donateBooks();
				mem.noOfPens = 15;
				mem.donatePens();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Donations nonMem = Donations.getInstance();
				nonMem.noOfBooks = 6;
				nonMem.donateBooks();
				nonMem.noOfPens = 10;
				nonMem.donatePens();
			}
		});
		
		if (member == true) {
			noOfThreads = Thread.activeCount();
			System.out.println("Threads1 : " + noOfThreads);
			t1.start();
		}
		
		if (nonMember == true) {
			noOfThreads = Thread.activeCount();
			System.out.println("Threads2 : " + noOfThreads);
			t2.start();
		}
		
	}

}

class Donations{
	
	int books = 10;
	int noOfBooks;
	int pens = 20;
	int noOfPens;
	
	static Donations object = new Donations();
	
	public void donateBooks() {
		books = books + noOfBooks;
		System.out.println("Total Books : " + books);
	}
	
	public void donatePens() {
		pens = pens + noOfPens;
		System.out.println("Total pens : " + pens);
	}
	
	private Donations() {
		System.out.println("Instance");
	}
	
	public static Donations getInstance() {
		
		if(object == null) {
			
			synchronized(Donations.class) {
				if(object == null) {
					object = new Donations(); 
				}
			}
			
		}
		
		return object;
		
	}
	
}
