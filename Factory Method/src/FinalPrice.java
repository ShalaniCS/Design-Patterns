
import java.io.*;

class FinalPrice {
	
	public static void main(String args[])throws IOException{
		
		GetPackFactory packFactory = new GetPackFactory();
		
		System.out.println("Enter the name of the required Pack : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String packName = br.readLine();
		System.out.println("Enter the number of packs required : ");
		int noOfPacks = Integer.parseInt(br.readLine());
		
		Packs pack = packFactory.getPack(packName);
		
		System.out.println("The price for " + noOfPacks + "packages of " + packName + "is : ");
		pack.getUnitPrice();
		pack.calculateFinalPrice(noOfPacks);
		
	}

}
