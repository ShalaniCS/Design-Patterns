
public class BuilderDemo {
	
	public static void main(String args[]) {
		
		Builder builder = new Builder();
		
		BiscuitType marie = builder.buildMuncheeBiscuit();
		marie.showItems();
		
		BiscuitType wafers = builder.buildMalibanBiscuit();
		wafers.showItems();
		
	}

}
