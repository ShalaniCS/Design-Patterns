
abstract class Packs {
	
	protected double unitPrice;
	abstract void getUnitPrice();
	
	public void calculateFinalPrice(int noOfPacks) {
		System.out.println(noOfPacks * unitPrice);
	}
	
}
