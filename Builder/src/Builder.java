
public class Builder {
	
	public BiscuitType buildMuncheeBiscuit() {
		BiscuitType b = new BiscuitType();
		b.addItem(new Munchee());
		return b;
	}
	
	public BiscuitType buildMalibanBiscuit() {
		BiscuitType b = new BiscuitType();
		b.addItem(new Maliban());
		return b;
	}
	
	

}
