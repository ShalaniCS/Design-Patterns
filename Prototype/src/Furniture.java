
public class Furniture {
	
	private int furnitureId;
	private String furnitureType;
	
	public int getFurnitureId() {
		return furnitureId;
	}
	
	public void setFurnitureId(int furnitureId) {
		this.furnitureId = furnitureId;
	}
	
	public String getFurnitureType() {
		return furnitureType;
	}
	
	public void setFurnitureType(String furnitureType) {
		this.furnitureType = furnitureType;
	}
	
	@Override
	
	public String toString() {
		return "Furniture [furnitureId = " + furnitureId + ", FurnitureType = " + furnitureType + "]";
	}

}
