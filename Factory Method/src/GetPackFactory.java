
class GetPackFactory {
	
	public Packs getPack(String packType) {
		
		if(packType == null) {
			return null;
		}
		
		if(packType.equalsIgnoreCase("INDOORPLANTPACK")) {
			return new IndoorPlantPack();
		}
		
		if(packType.equalsIgnoreCase("OUTDOORPLANTPACK")) {
			return new OutdoorPlantPack();
		}
		
		if(packType.equalsIgnoreCase("SUCCULENTPACK")) {
			return new SucculentPack();
		}
		
		return null;
		
	}

}
