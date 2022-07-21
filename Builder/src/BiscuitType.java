
import java.util.ArrayList;
import java.util.List;

public class BiscuitType {
	
	private List<Packaging> items = new ArrayList<Packaging>();
	public void addItem(Packaging packages) {
		items.add(packages);
	}
	
	public void getCost() {
		
		for(Packaging packages : items) {
			packages.price();
		}
		
	}
	
	public void showItems() {
		
		for(Packaging packaging : items) {
			System.out.println("Biscuit Type : " + packaging.Packagee());
			System.out.println("Price : " + packaging.price());
		}
		
	}

}
