
public class FurnitureShopRegistry {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		String[] domesticFurniture = {"Sofa", "Dining Table", "Coffee Table", "Dressing Table"};
		String[] officeFurniture = {"Office Chair", "Desk", "Filing Cabinet", "Computer Desk"};
		
		FurnitureShop fs1 = new FurnitureShop();
		fs1.setFurnitureShopName("Fox Domestic Furniture");
		fs1.loadFurniture(domesticFurniture);
		System.out.println(fs1);
		
		FurnitureShop fs2 = (FurnitureShop) fs1.clone();
		fs2.setFurnitureShopName("Furniture Plus Domestic Furniture");
		System.out.println(fs2);
		
		OfficeFurnitureShop fs3 = new OfficeFurnitureShop();
		fs3.setFurnitureShopName("Riko Office Furniture");
		fs3.loadFurniture(officeFurniture);
		System.out.println(fs3);
		
		OfficeFurnitureShop  fs4 = fs3.clone();
		fs4.setFurnitureShopName("Deviant Office Furniture");
		System.out.println(fs4);
		
		fs2.getFurniture().remove(2);
		fs4.getFurniture().remove(1);
		
		System.out.println(fs1);
		System.out.println(fs2);
		System.out.println(fs3);
		System.out.println(fs4);
		
	}
	
}
