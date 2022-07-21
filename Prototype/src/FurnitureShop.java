
import java.util.ArrayList;
import java.util.List;

public class FurnitureShop implements Cloneable{
	
	private String furnitureShopName;
	List<Furniture> furniture = new ArrayList<>();
	
	public String getFurnitureShopName() {
		return furnitureShopName;
    }
	
	public void setFurnitureShopName(String furnitureShopName) {
        this.furnitureShopName = furnitureShopName;
    }
	
	public List<Furniture> getFurniture(){
		return furniture;
	}
	
	public void setFurniture(List<Furniture> furniture) {
		this.furniture = furniture;
	}
	
	public void loadFurniture(String[] Array1) {
		
		for(int i=0; i<Array1.length; i++) {
			Furniture f = new Furniture();
			f.setFurnitureId(i+1);
			f.setFurnitureType("Furniture " + (i+1) + " : " + Array1[i]);
			getFurniture().add(f);
		}
		
	}
	
	@Override
	
	public String toString() {
		return "FurnitureShop [furnitureShopName = " + furnitureShopName + ", furniture = " + furniture + "]";
	}
	
	@Override
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}	
	
	
