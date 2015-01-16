package exercise.five.one;

public class DiscountRate {
	private double serviceDiscountPremium = 0.2;
	private double serviceDiscountGold = 0.15;
	private double serviceDiscountSilver = 0.1;
	private double productDiscountPremium = 0.1;
	private double productDiscountGold = 0.1;
	private double productDiscountSilver = 0.1;
	
	public double getServiceDiscountRate(String type) {
		if(type.equals("Premium"))
			return serviceDiscountPremium;
		else if(type.equals("Gold"))
			return serviceDiscountGold;
		else if(type.equals("Silver"))
			return serviceDiscountSilver;
		else
			return 0.0;			
	}
	public double getProductDiscountRate(String type) {
		if(type.equals("Premium"))
			return productDiscountPremium;
		else if(type.equals("Gold"))
			return productDiscountGold;
		else if(type.equals("Silver"))
			return productDiscountSilver;
		else
			return 0.1;
	}
}
