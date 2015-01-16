package shopping.cart.exerciseone;

import javax.swing.JOptionPane;

public class InOffer {
	public double mediumDiscount = 0.2;
	public double minorDiscount = 0.1;
	public double mayorDiscount = 0.3;
	public double noDiscount = 0.0;
	
	public double getOfferPrice(String type) {
		if(type.equals("Bananas"))
			return minorDiscount;
		else if(type.equals("Manzanas"))
			return mayorDiscount;
		else if(type.equals("Naranjas"))
			return mediumDiscount;
		else
			return noDiscount;
	}
	
	public void offertsList() {
		JOptionPane.showMessageDialog(null, getOffers());
	}
	
	public String getOffers() {
		return "Offers!!! \n" + "A 10% discount on every unit of Bananas \n" + "A 20% discount on every unit of Oranges\n" + " A 30% discount on every unit of Apples\n";
	}
}
